package org.xbill.DNS;

import com.p7700g.p99005.n04;
import com.p7700g.p99005.wo1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.xbill.DNS.utils.base16;

/* loaded from: classes4.dex */
public class NSAPRecord extends Record {
    private static final long serialVersionUID = -1037209403185658593L;
    private byte[] address;

    public NSAPRecord() {
    }

    private static final byte[] checkAndConvertAddress(String str) {
        if (str.substring(0, 2).equalsIgnoreCase(n04.t)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            boolean z = false;
            int i = 0;
            for (int i2 = 2; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (charAt != '.') {
                    int digit = Character.digit(charAt, 16);
                    if (digit == -1) {
                        return null;
                    }
                    if (z) {
                        i += digit;
                        byteArrayOutputStream.write(i);
                        z = false;
                    } else {
                        i = digit << 4;
                        z = true;
                    }
                }
            }
            if (z) {
                return null;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public String getAddress() {
        return Record.byteArrayToString(this.address, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSAPRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        String string = tokenizer.getString();
        byte[] checkAndConvertAddress = checkAndConvertAddress(string);
        this.address = checkAndConvertAddress;
        if (checkAndConvertAddress == null) {
            throw wo1.X("invalid NSAP address ", string, tokenizer);
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.address = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuilder G = wo1.G(n04.t);
        G.append(base16.toString(this.address));
        return G.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeByteArray(this.address);
    }

    public NSAPRecord(Name name, int i, long j, String str) {
        super(name, 22, i, j);
        byte[] checkAndConvertAddress = checkAndConvertAddress(str);
        this.address = checkAndConvertAddress;
        if (checkAndConvertAddress == null) {
            throw new IllegalArgumentException(wo1.t("invalid NSAP address ", str));
        }
    }
}