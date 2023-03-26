package org.xbill.DNS;

/* loaded from: classes4.dex */
public class MFRecord extends SingleNameBase {
    private static final long serialVersionUID = -6670449036843028169L;

    public MFRecord() {
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
        return new MFRecord();
    }

    public MFRecord(Name name, int i, long j, Name name2) {
        super(name, 4, i, j, name2, "mail agent");
    }
}