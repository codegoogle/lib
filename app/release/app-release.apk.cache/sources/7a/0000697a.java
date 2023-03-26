package com.p7700g.p99005;

/* compiled from: RoundedCorners.java */
/* loaded from: classes.dex */
public class zl0 implements pl0 {
    private final String a;
    private final kl0<Float, Float> b;

    public zl0(String str, kl0<Float, Float> kl0Var) {
        this.a = str;
        this.b = kl0Var;
    }

    @Override // com.p7700g.p99005.pl0
    @z1
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new nj0(hi0Var, im0Var, this);
    }

    public kl0<Float, Float> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }
}