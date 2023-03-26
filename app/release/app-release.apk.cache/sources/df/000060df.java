package com.p7700g.p99005;

/* compiled from: LocalizableMessage.java */
/* loaded from: classes3.dex */
public final class ux3 implements tx3 {
    private final String b;
    private final String c;
    private final Object[] d;

    public ux3(String str, String str2, Object... objArr) {
        this.b = str;
        this.c = str2;
        this.d = objArr == null ? new Object[0] : objArr;
    }

    @Override // com.p7700g.p99005.tx3
    public String getKey() {
        return this.c;
    }

    @Override // com.p7700g.p99005.tx3
    public Object[] n() {
        return this.d;
    }

    @Override // com.p7700g.p99005.tx3
    public String o() {
        return this.b;
    }
}