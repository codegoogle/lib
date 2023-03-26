package com.p7700g.p99005;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class ol0 implements pl0 {
    private final String a;
    private final kl0<PointF, PointF> b;
    private final dl0 c;
    private final boolean d;
    private final boolean e;

    public ol0(String str, kl0<PointF, PointF> kl0Var, dl0 dl0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = kl0Var;
        this.c = dl0Var;
        this.d = z;
        this.e = z2;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new bj0(hi0Var, im0Var, this);
    }

    public String b() {
        return this.a;
    }

    public kl0<PointF, PointF> c() {
        return this.b;
    }

    public dl0 d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }
}