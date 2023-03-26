package org.xbill.DNS;

import com.p7700g.p99005.wo1;
import java.io.IOException;

/* loaded from: classes4.dex */
public class X25Record extends Record {
    private static final long serialVersionUID = 4267576252335579764L;
    private byte[] address;

    public X25Record() {
    }

    private static final byte[] checkAndConvertAddress(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt)) {
                return null;
            }
            bArr[i] = (byte) charAt;
        }
        return bArr;
    }

    public String getAddress() {
        return Record.byteArrayToString(this.address, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new X25Record();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        String string = tokenizer.getString();
        byte[] checkAndConvertAddress = checkAndConvertAddress(string);
        this.address = checkAndConvertAddress;
        if (checkAndConvertAddress == null) {
            throw wo1.X("invalid PSDN address ", string, tokenizer);
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.address = dNSInput.readCountedString();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return Record.byteArrayToString(this.address, true);
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.address);
    }

    public X25Record(Name name, int i, long j, String str) {
        super(name, 19, i, j);
        byte[] checkAndConvertAddress = checkAndConvertAddress(str);
        this.address = checkAndConvertAddress;
        if (checkAndConvertAddress == null) {
            throw new IllegalArgumentException(wo1.t("invalid PSDN address ", str));
        }
    }
}