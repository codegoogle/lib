package org.xbill.DNS;

/* loaded from: classes4.dex */
public class AFSDBRecord extends U16NameBase {
    private static final long serialVersionUID = 3034379930729102437L;

    public AFSDBRecord() {
    }

    public Name getHost() {
        return getNameField();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new AFSDBRecord();
    }

    public int getSubtype() {
        return getU16Field();
    }

    public AFSDBRecord(Name name, int i, long j, int i2, Name name2) {
        super(name, 18, i, j, i2, "subtype", name2, "host");
    }
}