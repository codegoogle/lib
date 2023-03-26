package org.xbill.DNS;

import java.util.List;

/* loaded from: classes4.dex */
public class TXTRecord extends TXTBase {
    private static final long serialVersionUID = -5780785764284221342L;

    public TXTRecord() {
    }

    @Override // org.xbill.DNS.Record
    public Record getObject() {
        return new TXTRecord();
    }

    @Override // org.xbill.DNS.TXTBase
    public /* bridge */ /* synthetic */ List getStrings() {
        return super.getStrings();
    }

    @Override // org.xbill.DNS.TXTBase
    public /* bridge */ /* synthetic */ List getStringsAsByteArrays() {
        return super.getStringsAsByteArrays();
    }

    public TXTRecord(Name name, int i, long j, List list) {
        super(name, 16, i, j, list);
    }

    public TXTRecord(Name name, int i, long j, String str) {
        super(name, 16, i, j, str);
    }
}