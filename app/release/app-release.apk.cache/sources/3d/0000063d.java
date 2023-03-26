package com.anythink.core.common.e;

import com.anythink.core.api.ATAdConst;

/* loaded from: classes2.dex */
public final class af implements Comparable<af> {
    private long A;
    private int B;
    private String C;
    private long D;
    private long E;
    private long F;
    private long G;
    private int H;
    private int I;
    private int J;
    private int K;
    private String L;
    private long M;
    private long N;
    private double O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private m V;
    private int W;
    private int X;
    private String Y;
    private int Z;
    public int a;
    private int aa;
    public int c;
    public int d;
    public String e;
    public int f;
    public int g;
    private int h;
    private String i;
    private int j;
    private int k;
    private String l;
    private String m;
    private String n;
    private long o;
    private String p;
    private int q;
    private int r;
    private double s;
    private int t;
    private String u;
    private String v;
    private int w;
    private long x;
    private long y;
    private long z;
    public int b = 0;
    private int ab = -1;
    private ATAdConst.CURRENCY ac = ATAdConst.CURRENCY.USD;

    private long af() {
        return this.D;
    }

    public final long A() {
        return this.E;
    }

    public final long B() {
        return this.F;
    }

    public final int C() {
        return this.H;
    }

    public final int D() {
        return this.I;
    }

    public final int E() {
        return this.J;
    }

    public final int F() {
        return this.K;
    }

    public final String G() {
        return this.L;
    }

    public final long H() {
        return this.M;
    }

    public final long I() {
        return this.N;
    }

    public final double J() {
        return this.O;
    }

    public final int K() {
        return this.P;
    }

    public final int L() {
        return this.Q;
    }

    public final boolean M() {
        return this.R == 2;
    }

    public final m N() {
        return this.V;
    }

    public final int O() {
        return this.W;
    }

    public final int P() {
        return this.X;
    }

    public final void Q() {
        this.X = 1;
    }

    public final String R() {
        return this.Y;
    }

    public final int S() {
        return this.aa;
    }

    public final int T() {
        int i = this.b;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    public final int U() {
        return this.c;
    }

    public final int V() {
        return this.d;
    }

    public final String W() {
        return this.e;
    }

    public final int X() {
        return this.a;
    }

    public final int Y() {
        return this.ab;
    }

    public final int Z() {
        int i;
        m mVar = this.V;
        return (mVar == null || (i = mVar.n) == 0) ? this.f : i;
    }

    public final int a() {
        return this.T;
    }

    public final boolean aa() {
        return this.h == 1 && this.U == 1;
    }

    public final String ab() {
        return "networkFirmId: " + this.h + ", adSourceId: " + this.C + ", content: " + this.l;
    }

    public final int ac() {
        return this.Z;
    }

    public final ATAdConst.CURRENCY ad() {
        return this.ac;
    }

    public final int ae() {
        return this.g;
    }

    public final void b() {
        this.T = -1;
    }

    public final int c() {
        return this.h;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(af afVar) {
        return com.anythink.core.common.j.g.a(this) > com.anythink.core.common.j.g.a(afVar) ? -1 : 1;
    }

    public final String d() {
        return this.i;
    }

    public final int e() {
        return this.j;
    }

    public final int f() {
        return this.k;
    }

    public final String g() {
        return this.l;
    }

    public final String h() {
        return this.m;
    }

    public final int i() {
        return this.t;
    }

    public final boolean j() {
        return this.t == 1;
    }

    public final long k() {
        return this.y;
    }

    public final int l() {
        return this.U;
    }

    public final int m() {
        return this.S;
    }

    public final long n() {
        return this.G;
    }

    public final int o() {
        return this.w;
    }

    public final long p() {
        return this.z;
    }

    public final long q() {
        return this.A;
    }

    public final int r() {
        return this.B;
    }

    public final long s() {
        return this.o;
    }

    public final String t() {
        return this.C;
    }

    public final String u() {
        return this.p;
    }

    public final int v() {
        return this.q;
    }

    public final int w() {
        return this.r;
    }

    public final double x() {
        return this.s;
    }

    public final String y() {
        return this.u;
    }

    public final String z() {
        return this.v;
    }

    private void A(int i) {
        this.W = i;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void b(int i) {
        this.j = i;
    }

    public final void c(int i) {
        this.k = i;
    }

    public final void d(String str) {
        this.n = str;
    }

    public final void e(int i) {
        this.U = i;
    }

    public final void f(int i) {
        this.S = i;
    }

    public final void g(int i) {
        this.w = i;
    }

    public final void h(int i) {
        this.B = i;
    }

    public final void i(int i) {
        this.q = i;
    }

    public final void j(int i) {
        this.r = i;
    }

    public final void k(int i) {
        this.H = i;
    }

    public final void l(int i) {
        this.I = i;
    }

    public final void m(int i) {
        this.J = i;
    }

    public final void n(int i) {
        this.K = i;
    }

    public final void o(int i) {
        this.P = i;
    }

    public final void p(int i) {
        this.Q = i;
    }

    public final void q(int i) {
        this.R = i;
    }

    public final void r(int i) {
        this.aa = i;
    }

    public final void s(int i) {
        this.b = i;
    }

    public final void t(int i) {
        this.c = i;
    }

    public final void u(int i) {
        this.d = i;
    }

    public final void v(int i) {
        this.a = i;
    }

    public final void w(int i) {
        this.ab = i;
    }

    public final void x(int i) {
        this.f = i;
    }

    public final void y(int i) {
        this.Z = i;
    }

    public final void z(int i) {
        this.g = i;
    }

    private void k(String str) {
        this.Y = str;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void b(String str) {
        this.l = str;
    }

    public final void c(String str) {
        this.m = str;
    }

    public final void d(int i) {
        this.t = i;
    }

    public final void e(long j) {
        this.o = j;
    }

    public final void f(String str) {
        this.p = str;
    }

    public final void g(String str) {
        this.u = str;
    }

    public final void h(String str) {
        this.v = str;
    }

    public final void i(String str) {
        this.L = str;
    }

    public final void j(long j) {
        this.N = j;
    }

    public final void a(long j) {
        this.y = j;
    }

    public final void b(long j) {
        this.G = j;
    }

    public final void c(long j) {
        this.z = j;
    }

    public final void d(long j) {
        this.A = j;
    }

    public final void e(String str) {
        this.C = str;
    }

    public final void f(long j) {
        this.D = j;
    }

    public final void g(long j) {
        this.E = j;
    }

    public final void h(long j) {
        this.F = j;
    }

    public final void i(long j) {
        this.M = j;
    }

    public final void j(String str) {
        this.e = str;
    }

    public final void a(double d) {
        this.s = d;
    }

    public final void b(double d) {
        this.O = d;
    }

    private void a(m mVar) {
        this.V = mVar;
    }

    private int a(af afVar) {
        return com.anythink.core.common.j.g.a(this) > com.anythink.core.common.j.g.a(afVar) ? -1 : 1;
    }

    public final synchronized void a(af afVar, int i, int i2, int i3) {
        if (afVar.C.equals(this.C)) {
            this.s = afVar.s;
            this.w = i2;
            this.u = afVar.u;
            this.Y = afVar.Y;
            this.T = 0;
            if (i == 0) {
                this.W = afVar.W;
            } else {
                this.W = i;
            }
            this.v = afVar.v;
            this.V = afVar.V;
            this.X = i3;
        }
    }

    public final void a(ATAdConst.CURRENCY currency) {
        this.ac = currency;
    }

    public final void a(m mVar, int i, int i2, int i3) {
        this.w = i2;
        this.s = mVar.price;
        this.u = mVar.token;
        this.Y = mVar.m;
        this.T = 0;
        this.W = i;
        this.V = mVar;
        this.X = i3;
    }
}