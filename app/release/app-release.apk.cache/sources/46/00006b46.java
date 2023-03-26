package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class NULLRecord extends Record {
    private static final long serialVersionUID = -5796493183235216538L;
    private byte[] data;

    public NULLRecord() {
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NULLRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        throw tokenizer.exception("no defined text format for NULL records");
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

    public NULLRecord(Name name, int i, long j, byte[] bArr) {
        super(name, 10, i, j);
        if (bArr.length <= 65535) {
            this.data = bArr;
            return;
        }
        throw new IllegalArgumentException("data must be <65536 bytes");
    }
}