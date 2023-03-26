package org.xbill.DNS;

/* loaded from: classes4.dex */
public class NSAP_PTRRecord extends SingleNameBase {
    private static final long serialVersionUID = 2386284746382064904L;

    public NSAP_PTRRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new NSAP_PTRRecord();
    }

    public Name getTarget() {
        return getSingleName();
    }

    public NSAP_PTRRecord(Name name, int i, long j, Name name2) {
        super(name, 23, i, j, name2, "target");
    }
}