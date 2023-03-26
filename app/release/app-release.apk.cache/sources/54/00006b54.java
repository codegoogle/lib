package org.xbill.DNS;

/* loaded from: classes4.dex */
public class RTRecord extends U16NameBase {
    private static final long serialVersionUID = -3206215651648278098L;

    public RTRecord() {
    }

    public Name getIntermediateHost() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new RTRecord();
    }

    public int getPreference() {
        return getU16Field();
    }

    public RTRecord(Name name, int i, long j, int i2, Name name2) {
        super(name, 21, i, j, i2, "preference", name2, "intermediateHost");
    }
}