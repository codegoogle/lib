package com.p7700g.p99005;

import java.util.ArrayList;

/* compiled from: Metrics.java */
/* loaded from: classes.dex */
public class j8 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public ArrayList<String> I = new ArrayList<>();
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public void a() {
        this.e = 0L;
        this.K = 0L;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.t = 0L;
        this.J = 0L;
        this.A = 0L;
        this.B = 0L;
        this.i = 0L;
        this.z = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
        this.q = 0L;
        this.r = 0L;
        this.s = 0L;
        this.u = 0L;
        this.v = 0L;
        this.w = 0L;
        this.y = 0L;
        this.G = 0L;
        this.H = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.F = 0L;
        this.I.clear();
    }

    public String toString() {
        StringBuilder G = wo1.G("\n*** Metrics ***\nmeasures: ");
        G.append(this.e);
        G.append("\nmeasuresWrap: ");
        G.append(this.L);
        G.append("\nmeasuresWrapInfeasible: ");
        G.append(this.M);
        G.append("\ndetermineGroups: ");
        G.append(this.O);
        G.append("\ninfeasibleDetermineGroups: ");
        G.append(this.N);
        G.append("\ngraphOptimizer: ");
        G.append(this.v);
        G.append("\nwidgets: ");
        G.append(this.K);
        G.append("\ngraphSolved: ");
        G.append(this.w);
        G.append("\nlinearSolved: ");
        G.append(this.x);
        G.append("\n");
        return G.toString();
    }
}