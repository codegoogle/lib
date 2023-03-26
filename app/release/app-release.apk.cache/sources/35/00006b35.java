package org.xbill.DNS;

/* loaded from: classes4.dex */
public class MGRecord extends SingleNameBase {
    private static final long serialVersionUID = -3980055550863644582L;

    public MGRecord() {
    }

    public Name getMailbox() {
        return getSingleName();
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new MGRecord();
    }

    public MGRecord(Name name, int i, long j, Name name2) {
        super(name, 8, i, j, name2, "mailbox");
    }
}