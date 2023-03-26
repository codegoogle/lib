package org.xbill.DNS;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class SingleNameBase extends Record {
    private static final long serialVersionUID = -18595042501413L;
    public Name singleName;

    public SingleNameBase() {
    }

    public Name getSingleName() {
        return this.singleName;
    }

    @Override // org.xbill.DNS.Record
    public void rdataFromString(Tokenizer tokenizer, Name name) throws IOException {
        this.singleName = tokenizer.getName(name);
    }

    @Override // org.xbill.DNS.Record
    public void rrFromWire(DNSInput dNSInput) throws IOException {
        this.singleName = new Name(dNSInput);
    }

    @Override // org.xbill.DNS.Record
    public String rrToString() {
        return this.singleName.toString();
    }

    @Override // org.xbill.DNS.Record
    public void rrToWire(DNSOutput dNSOutput, Compression compression, boolean z) {
        this.singleName.toWire(dNSOutput, null, z);
    }

    public SingleNameBase(Name name, int i, int i2, long j) {
        super(name, i, i2, j);
    }

    public SingleNameBase(Name name, int i, int i2, long j, Name name2, String str) {
        super(name, i, i2, j);
        this.singleName = Record.checkName(str, name2);
    }
}