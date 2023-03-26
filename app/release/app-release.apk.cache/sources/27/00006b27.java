package org.xbill.DNS;

import java.io.IOException;
import org.xbill.DNS.Tokenizer;

/* loaded from: classes4.dex */
public class ISDNRecord extends Record {
    private static final long serialVersionUID = -8730801385178968798L;
    private byte[] address;
    private byte[] subAddress;

    public ISDNRecord() {
    }

    public String getAddress() {
        return Record.byteArrayToString(this.address, false);
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new ISDNRecord();
    }

    public String getSubAddress() {
        byte[] bArr = this.subAddress;
        if (bArr == null) {
            return null;
        }
        return Record.byteArrayToString(bArr, false);
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        try {
            this.address = Record.byteArrayFromString(tokenizer.getString());
            Tokenizer.Token token = tokenizer.get();
            if (token.isString()) {
                this.subAddress = Record.byteArrayFromString(token.value);
            } else {
                tokenizer.unget();
            }
        } catch (TextParseException e) {
            throw tokenizer.exception(e.getMessage());
        }
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.address = dNSInput.readCountedString();
        if (dNSInput.remaining() > 0) {
            this.subAddress = dNSInput.readCountedString();
        }
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Record.byteArrayToString(this.address, true));
        if (this.subAddress != null) {
            stringBuffer.append(" ");
            stringBuffer.append(Record.byteArrayToString(this.subAddress, true));
        }
        return stringBuffer.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeCountedString(this.address);
        byte[] bArr = this.subAddress;
        if (bArr != null) {
            dNSOutput.writeCountedString(bArr);
        }
    }

    public ISDNRecord(Name name, int i, long j, String str, String str2) {
        super(name, 20, i, j);
        try {
            this.address = Record.byteArrayFromString(str);
            if (str2 != null) {
                this.subAddress = Record.byteArrayFromString(str2);
            }
        } catch (TextParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}