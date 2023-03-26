package com.p7700g.p99005;

import com.p7700g.p99005.em0;
import java.util.List;

/* compiled from: GradientStroke.java */
/* loaded from: classes.dex */
public class sl0 implements pl0 {
    private final String a;
    private final tl0 b;
    private final al0 c;
    private final bl0 d;
    private final dl0 e;
    private final dl0 f;
    private final zk0 g;
    private final em0.b h;
    private final em0.c i;
    private final float j;
    private final List<zk0> k;
    @z1
    private final zk0 l;
    private final boolean m;

    public sl0(String str, tl0 tl0Var, al0 al0Var, bl0 bl0Var, dl0 dl0Var, dl0 dl0Var2, zk0 zk0Var, em0.b bVar, em0.c cVar, float f, List<zk0> list, @z1 zk0 zk0Var2, boolean z) {
        this.a = str;
        this.b = tl0Var;
        this.c = al0Var;
        this.d = bl0Var;
        this.e = dl0Var;
        this.f = dl0Var2;
        this.g = zk0Var;
        this.h = bVar;
        this.i = cVar;
        this.j = f;
        this.k = list;
        this.l = zk0Var2;
        this.m = z;
    }

    @Override // com.p7700g.p99005.pl0
    public yi0 a(hi0 hi0Var, im0 im0Var) {
        return new ej0(hi0Var, im0Var, this);
    }

    public em0.b b() {
        return this.h;
    }

    @z1
    public zk0 c() {
        return this.l;
    }

    public dl0 d() {
        return this.f;
    }

    public al0 e() {
        return this.c;
    }

    public tl0 f() {
        return this.b;
    }

    public em0.c g() {
        return this.i;
    }

    public List<zk0> h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public bl0 k() {
        return this.d;
    }

    public dl0 l() {
        return this.e;
    }

    public zk0 m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}