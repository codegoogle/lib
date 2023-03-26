package com.p7700g.p99005;

import android.graphics.PointF;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class wl0 implements pl0 {
    private final String a;
    private final a b;
    private final zk0 c;
    private final kl0<PointF, PointF> d;
    private final zk0 e;
    private final zk0 f;
    private final zk0 g;
    private final zk0 h;
    private final zk0 i;
    private final boolean j;
    private final boolean k;

    /* compiled from: PolystarShape.java */
    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        
        private final int v;

        a(int i) {
            this.v = i;
        }

        public static a b(int i) {
            a[] values = values();
            for (int i2 = 0; i2 < 2; i2++) {
                a aVar = values[i2];
                if (aVar.v == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public wl0(String str, a aVar, zk0 zk0Var, kl0<PointF, PointF> kl0Var, zk0 zk0Var2, zk0 zk0Var3, zk0 zk0Var4, zk0 zk0Var5, zk0 zk0Var6, boolean z, boolean z2) {
        this.a = str;
        this.b = aVar;
        this.c = zk0Var;
        this.d = kl0Var;
        this.e = zk0Var2;
        this.f = zk0Var3;
        this.g = zk0Var4;
        this.h = zk0Var5;
        this.i = zk0Var6;
        this.j = z;
        this.k = z2;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new kj0(hi0Var, im0Var, this);
    }

    public zk0 b() {
        return this.f;
    }

    public zk0 c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public zk0 e() {
        return this.g;
    }

    public zk0 f() {
        return this.i;
    }

    public zk0 g() {
        return this.c;
    }

    public kl0<PointF, PointF> h() {
        return this.d;
    }

    public zk0 i() {
        return this.e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}