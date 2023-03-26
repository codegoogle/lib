package com.p7700g.p99005;

import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class lm0 {
    private final List<pl0> a;
    private final ei0 b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    @z1
    private final String g;
    private final List<ul0> h;
    private final jl0 i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    @z1
    private final hl0 q;
    @z1
    private final il0 r;
    @z1
    private final zk0 s;
    private final List<ep0<Float>> t;
    private final b u;
    private final boolean v;
    @z1
    private final nl0 w;
    @z1
    private final in0 x;

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public lm0(List<pl0> list, ei0 ei0Var, String str, long j, a aVar, long j2, @z1 String str2, List<ul0> list2, jl0 jl0Var, int i, int i2, int i3, float f, float f2, int i4, int i5, @z1 hl0 hl0Var, @z1 il0 il0Var, List<ep0<Float>> list3, b bVar, @z1 zk0 zk0Var, boolean z, @z1 nl0 nl0Var, @z1 in0 in0Var) {
        this.a = list;
        this.b = ei0Var;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = jl0Var;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = hl0Var;
        this.r = il0Var;
        this.t = list3;
        this.u = bVar;
        this.s = zk0Var;
        this.v = z;
        this.w = nl0Var;
        this.x = in0Var;
    }

    @z1
    public nl0 a() {
        return this.w;
    }

    public ei0 b() {
        return this.b;
    }

    @z1
    public in0 c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    public List<ep0<Float>> e() {
        return this.t;
    }

    public a f() {
        return this.e;
    }

    public List<ul0> g() {
        return this.h;
    }

    public b h() {
        return this.u;
    }

    public String i() {
        return this.c;
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.p;
    }

    public int l() {
        return this.o;
    }

    @z1
    public String m() {
        return this.g;
    }

    public List<pl0> n() {
        return this.a;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.n / this.b.e();
    }

    @z1
    public hl0 s() {
        return this.q;
    }

    @z1
    public il0 t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    @z1
    public zk0 u() {
        return this.s;
    }

    public float v() {
        return this.m;
    }

    public jl0 w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder G = wo1.G(str);
        G.append(i());
        G.append("\n");
        lm0 x = this.b.x(j());
        if (x != null) {
            G.append("\t\tParents: ");
            G.append(x.i());
            lm0 x2 = this.b.x(x.j());
            while (x2 != null) {
                G.append("->");
                G.append(x2.i());
                x2 = this.b.x(x2.j());
            }
            G.append(str);
            G.append("\n");
        }
        if (!g().isEmpty()) {
            G.append(str);
            G.append("\tMasks: ");
            G.append(g().size());
            G.append("\n");
        }
        if (q() != 0 && p() != 0) {
            G.append(str);
            G.append("\tBackground: ");
            G.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.a.isEmpty()) {
            G.append(str);
            G.append("\tShapes:\n");
            for (pl0 pl0Var : this.a) {
                G.append(str);
                G.append("\t\t");
                G.append(pl0Var);
                G.append("\n");
            }
        }
        return G.toString();
    }
}