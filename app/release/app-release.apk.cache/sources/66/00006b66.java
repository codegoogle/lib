package org.xbill.DNS;

import java.util.List;

/* loaded from: classes4.dex */
public class SPFRecord extends TXTBase {
    private static final long serialVersionUID = -2100754352801658722L;

    public SPFRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new SPFRecord();
    }

    @Override // org.xbill.DNS.TXTBase
    public /* bridge */ /* synthetic */ List getStrings() {
        return super.getStrings();
    }

    @Override // org.xbill.DNS.TXTBase
    public /* bridge */ /* synthetic */ List getStringsAsByteArrays() {
        return super.getStringsAsByteArrays();
    }

    public SPFRecord(Name name, int i, long j, List list) {
        super(name, 99, i, j, list);
    }

    public SPFRecord(Name name, int i, long j, String str) {
        super(name, 99, i, j, str);
    }
}