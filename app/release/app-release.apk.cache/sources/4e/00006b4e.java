package org.xbill.DNS;

/* loaded from: classes4.dex */
public class PTRRecord extends SingleCompressedNameBase {
    private static final long serialVersionUID = -8321636610425434192L;

    public PTRRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new PTRRecord();
    }

    public Name getTarget() {
        return getSingleName();
    }

    public PTRRecord(Name name, int i, long j, Name name2) {
        super(name, 12, i, j, name2, "target");
    }
}