package com.ironsource.mediationsdk.adunit.c.b;

/* loaded from: classes3.dex */
public final class a {
    public EnumC0116a a;
    public long b;
    public long c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0116a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public a(EnumC0116a enumC0116a, long j, long j2) {
        this.a = enumC0116a;
        this.b = j;
        this.c = j2;
    }

    public final boolean a() {
        EnumC0116a enumC0116a = this.a;
        return enumC0116a == EnumC0116a.MANUAL || enumC0116a == EnumC0116a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    public final boolean b() {
        EnumC0116a enumC0116a = this.a;
        return enumC0116a == EnumC0116a.AUTOMATIC_LOAD_AFTER_CLOSE || enumC0116a == EnumC0116a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}