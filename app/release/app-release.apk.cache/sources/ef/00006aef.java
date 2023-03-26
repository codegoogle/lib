package org.xbill.DNS;

/* loaded from: classes4.dex */
public class CNAMERecord extends SingleCompressedNameBase {
    private static final long serialVersionUID = -4020373886892538580L;

    public CNAMERecord() {
    }

    public Name getAlias() {
        return getSingleName();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new CNAMERecord();
    }

    public Name getTarget() {
        return getSingleName();
    }

    public CNAMERecord(Name name, int i, long j, Name name2) {
        super(name, 5, i, j, name2, "alias");
    }
}