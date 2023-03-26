package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbill.DNS.Tokenizer;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class APLRecord extends Record {
    private static final long serialVersionUID = -1348173791712935864L;
    private List elements;

    /* loaded from: classes4.dex */
    public static class Element {
        public final Object address;
        public final int family;
        public final boolean negative;
        public final int prefixLength;

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Element)) {
                return false;
            }
            Element element = (Element) obj;
            return this.family == element.family && this.negative == element.negative && this.prefixLength == element.prefixLength && this.address.equals(element.address);
        }

        public int hashCode() {
            return this.address.hashCode() + this.prefixLength + (this.negative ? 1 : 0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.negative) {
                stringBuffer.append("!");
            }
            stringBuffer.append(this.family);
            stringBuffer.append(":");
            int i = this.family;
            if (i != 1 && i != 2) {
                stringBuffer.append(base16.toString((byte[]) this.address));
            } else {
                stringBuffer.append(((InetAddress) this.address).getHostAddress());
            }
            stringBuffer.append("/");
            stringBuffer.append(this.prefixLength);
            return stringBuffer.toString();
        }

        private Element(int i, boolean z, Object obj, int i2) {
            this.family = i;
            this.negative = z;
            this.address = obj;
            this.prefixLength = i2;
            if (!APLRecord.validatePrefixLength(i, i2)) {
                throw new IllegalArgumentException("invalid prefix length");
            }
        }

        public Element(boolean z, InetAddress inetAddress, int i) {
            this(Address.familyOf(inetAddress), z, inetAddress, i);
        }
    }

    public APLRecord() {
    }

    private static int addressLength(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] != 0) {
                return length + 1;
            }
        }
        return 0;
    }

    private static byte[] parseAddress(byte[] bArr, int i) throws WireParseException {
        if (bArr.length <= i) {
            if (bArr.length == i) {
                return bArr;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new WireParseException("invalid address length");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validatePrefixLength(int i, int i2) {
        if (i2 < 0 || i2 >= 256) {
            return false;
        }
        return (i != 1 || i2 <= 32) && (i != 2 || i2 <= 128);
    }

    public List getElements() {
        return this.elements;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new APLRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        boolean z;
        this.elements = new ArrayList(1);
        while (true) {
            Tokenizer.Token token = tokenizer.get();
            if (!token.isString()) {
                tokenizer.unget();
                return;
            }
            String str = token.value;
            int i = 0;
            if (str.startsWith("!")) {
                z = true;
                i = 1;
            } else {
                z = false;
            }
            int indexOf = str.indexOf(58, i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf(47, indexOf);
                if (indexOf2 >= 0) {
                    String substring = str.substring(i, indexOf);
                    String substring2 = str.substring(indexOf + 1, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    try {
                        int parseInt = Integer.parseInt(substring);
                        if (parseInt != 1 && parseInt != 2) {
                            throw tokenizer.exception("unknown family");
                        }
                        try {
                            int parseInt2 = Integer.parseInt(substring3);
                            if (validatePrefixLength(parseInt, parseInt2)) {
                                byte[] byteArray = Address.toByteArray(substring2, parseInt);
                                if (byteArray != null) {
                                    this.elements.add(new Element(z, InetAddress.getByAddress(byteArray), parseInt2));
                                } else {
                                    throw wo1.X("invalid IP address ", substring2, tokenizer);
                                }
                            } else {
                                throw tokenizer.exception("invalid prefix length");
                            }
                        } catch (NumberFormatException unused) {
                            throw tokenizer.exception("invalid prefix length");
                        }
                    } catch (NumberFormatException unused2) {
                        throw tokenizer.exception("invalid family");
                    }
                } else {
                    throw tokenizer.exception("invalid address prefix element");
                }
            } else {
                throw tokenizer.exception("invalid address prefix element");
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        Element element;
        this.elements = new ArrayList(1);
        while (dNSInput.remaining() != 0) {
            int readU16 = dNSInput.readU16();
            int readU8 = dNSInput.readU8();
            int readU82 = dNSInput.readU8();
            boolean z = (readU82 & 128) != 0;
            byte[] readByteArray = dNSInput.readByteArray(readU82 & (-129));
            if (validatePrefixLength(readU16, readU8)) {
                if (readU16 != 1 && readU16 != 2) {
                    element = new Element(readU16, z, readByteArray, readU8);
                } else {
                    element = new Element(z, InetAddress.getByAddress(parseAddress(readByteArray, Address.addressLength(readU16))), readU8);
                }
                this.elements.add(element);
            } else {
                throw new WireParseException("invalid prefix length");
            }
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.elements.iterator();
        while (it.hasNext()) {
            stringBuffer.append((Element) it.next());
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        byte[] address;
        int addressLength;
        for (Element element : this.elements) {
            int i = element.family;
            if (i != 1 && i != 2) {
                address = (byte[]) element.address;
                addressLength = address.length;
            } else {
                address = ((InetAddress) element.address).getAddress();
                addressLength = addressLength(address);
            }
            int i2 = element.negative ? addressLength | 128 : addressLength;
            dNSOutput.writeU16(element.family);
            dNSOutput.writeU8(element.prefixLength);
            dNSOutput.writeU8(i2);
            dNSOutput.writeByteArray(address, 0, addressLength);
        }
    }

    public APLRecord(Name name, int i, long j, List list) {
        super(name, 42, i, j);
        this.elements = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj instanceof Element) {
                Element element = (Element) obj;
                int i2 = element.family;
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalArgumentException("unknown family");
                }
                this.elements.add(element);
            } else {
                throw new IllegalArgumentException("illegal element");
            }
        }
    }
}