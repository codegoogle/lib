package org.xbill.DNS;

/* loaded from: classes4.dex */
public class MDRecord extends SingleNameBase {
    private static final long serialVersionUID = 5268878603762942202L;

    public MDRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Name getAdditionalName() {
        return getSingleName();
    }

    public Name getMailAgent() {
        return getSingleName();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new MDRecord();
    }

    public MDRecord(Name name, int i, long j, Name name2) {
        super(name, 3, i, j, name2, "mail agent");
    }
}