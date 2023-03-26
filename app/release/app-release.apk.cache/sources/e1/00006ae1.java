package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public class A6Record extends Record {
    private static final long serialVersionUID = -8815026887337346789L;
    private Name prefix;
    private int prefixBits;
    private InetAddress suffix;

    public A6Record() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new A6Record();
    }

    public Name getPrefix() {
        return this.prefix;
    }

    public int getPrefixBits() {
        return this.prefixBits;
    }

    public InetAddress getSuffix() {
        return this.suffix;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        int uInt8 = tokenizer.getUInt8();
        this.prefixBits = uInt8;
        if (uInt8 <= 128) {
            if (uInt8 < 128) {
                String string = tokenizer.getString();
                try {
                    this.suffix = Address.getByAddress(string, 2);
                } catch (UnknownHostException unused) {
                    throw wo1.X("invalid IPv6 address: ", string, tokenizer);
                }
            }
            if (this.prefixBits > 0) {
                this.prefix = tokenizer.getName(name);
                return;
            }
            return;
        }
        throw tokenizer.exception("prefix bits must be [0..128]");
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        int readU8 = dNSInput.readU8();
        this.prefixBits = readU8;
        int i = ((128 - readU8) + 7) / 8;
        if (readU8 < 128) {
            byte[] bArr = new byte[16];
            dNSInput.readByteArray(bArr, 16 - i, i);
            this.suffix = InetAddress.getByAddress(bArr);
        }
        if (this.prefixBits > 0) {
            this.prefix = new Name(dNSInput);
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.prefixBits);
        if (this.suffix != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.suffix.getHostAddress());
        }
        if (this.prefix != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.prefix);
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeU8(this.prefixBits);
        InetAddress inetAddress = this.suffix;
        if (inetAddress != null) {
            int i = ((128 - this.prefixBits) + 7) / 8;
            dNSOutput.writeByteArray(inetAddress.getAddress(), 16 - i, i);
        }
        Name name = this.prefix;
        if (name != null) {
            name.toWire(dNSOutput, null, z);
        }
    }

    public A6Record(Name name, int i, long j, int i2, InetAddress inetAddress, Name name2) {
        super(name, 38, i, j);
        this.prefixBits = Record.checkU8("prefixBits", i2);
        if (inetAddress != null && Address.familyOf(inetAddress) != 2) {
            throw new IllegalArgumentException("invalid IPv6 address");
        }
        this.suffix = inetAddress;
        if (name2 != null) {
            this.prefix = Record.checkName("prefix", name2);
        }
    }
}