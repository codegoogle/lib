package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public class EmptyRecord extends Record {
    private static final long serialVersionUID = 3601852050646429582L;

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new EmptyRecord();
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return "";
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
    }
}