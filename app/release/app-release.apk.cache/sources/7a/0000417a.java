package com.p7700g.p99005;

/* compiled from: DeviceIdStorage.java */
/* loaded from: classes.dex */
public class f31 implements rt0 {
    @x1
    private static final String a = "pref_hydrasdk_device_id";
    private final x31 b;

    public f31(@x1 x31 x31Var) {
        this.b = x31Var;
    }

    @Override // com.p7700g.p99005.rt0
    public void a(@x1 String str) {
        this.b.c().b(a, str).d();
    }

    @Override // com.p7700g.p99005.rt0
    @x1
    public String get() {
        return this.b.e(a, "");
    }
}