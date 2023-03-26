package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class UNKRecord extends Record {
    private static final long serialVersionUID = -4193583311594626915L;
    private byte[] data;

    public byte[] getData() {
        return this.data;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new UNKRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        throw tokenizer.exception("invalid unknown RR encoding");
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.data = dNSInput.readByteArray();
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return Record.unknownToString(this.data);
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        dNSOutput.writeByteArray(this.data);
    }
}