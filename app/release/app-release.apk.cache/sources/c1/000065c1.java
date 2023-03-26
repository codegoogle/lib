package com.p7700g.p99005;

import android.graphics.PointF;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class xl0 implements pl0 {
    private final String a;
    private final kl0<PointF, PointF> b;
    private final kl0<PointF, PointF> c;
    private final zk0 d;
    private final boolean e;

    public xl0(String str, kl0<PointF, PointF> kl0Var, kl0<PointF, PointF> kl0Var2, zk0 zk0Var, boolean z) {
        this.a = str;
        this.b = kl0Var;
        this.c = kl0Var2;
        this.d = zk0Var;
        this.e = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new lj0(hi0Var, im0Var, this);
    }

    public zk0 b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public kl0<PointF, PointF> d() {
        return this.b;
    }

    public kl0<PointF, PointF> e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public String toString() {
        StringBuilder G = wo1.G("RectangleShape{position=");
        G.append(this.b);
        G.append(", size=");
        G.append(this.c);
        G.append('}');
        return G.toString();
    }
}