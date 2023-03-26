package com.p7700g.p99005;

import com.p7700g.p99005.s14;
import java.io.Serializable;

/* compiled from: HostNameParameters.java */
/* loaded from: classes3.dex */
public class h14 implements Cloneable, Comparable<h14>, Serializable {
    public static final boolean A = false;
    public static final boolean B = true;
    private static final long s = 4;
    public static final boolean t = true;
    public static final boolean u = true;
    public static final boolean v = true;
    public static final boolean w = true;
    public static final boolean x = true;
    public static final boolean y = true;
    public static final boolean z = true;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final s14 L;

    /* compiled from: HostNameParameters.java */
    /* loaded from: classes3.dex */
    public static class a {
        private boolean a = true;
        private boolean b = true;
        private boolean c = true;
        private boolean d = true;
        private boolean e = true;
        private boolean f = true;
        private boolean g = true;
        private boolean h = false;
        private boolean i = true;
        private s14.a j;

        public a j(boolean z) {
            this.d = z;
            return this;
        }

        public a k(boolean z) {
            this.c = z;
            return this;
        }

        public a l(boolean z) {
            this.a = z;
            return this;
        }

        public a m(boolean z) {
            this.f = z;
            return this;
        }

        public a n(boolean z) {
            this.g = z;
            return this;
        }

        public a o(boolean z) {
            this.i = z;
            return this;
        }

        public a p(boolean z) {
            this.h = z;
            return this;
        }

        public s14.a q() {
            if (this.j == null) {
                this.j = new s14.a();
            }
            s14.a aVar = this.j;
            aVar.n = this;
            return aVar;
        }

        public a r(boolean z) {
            this.b = z;
            return this;
        }

        public a s(boolean z) {
            this.e = z;
            return this;
        }

        public h14 t() {
            s14 A;
            s14.a aVar = this.j;
            if (aVar == null) {
                A = r14.t;
            } else {
                A = aVar.A();
            }
            s14 s14Var = A;
            boolean z = this.a;
            boolean z2 = this.b;
            boolean z3 = this.f;
            return new h14(s14Var, z, z2, z3 && this.c, z3 && this.d, this.e, z3, this.g, this.h, this.i);
        }
    }

    public h14(s14 s14Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.C = z2;
        this.D = z3;
        this.F = z4;
        this.E = z5;
        this.G = z6;
        this.H = z7;
        this.I = z8;
        this.K = z9;
        this.J = z10;
        this.L = s14Var;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h14) {
            h14 h14Var = (h14) obj;
            return this.C == h14Var.C && this.F == h14Var.F && this.E == h14Var.E && this.G == h14Var.G && this.H == h14Var.H && this.I == h14Var.I && this.K == h14Var.K && this.J == h14Var.J && this.L.equals(h14Var.L);
        }
        return false;
    }

    /* renamed from: f */
    public h14 clone() {
        try {
            return (h14) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(h14 h14Var) {
        int compare = Boolean.compare(this.C, h14Var.C);
        if (compare == 0) {
            int compare2 = Boolean.compare(this.F, h14Var.F);
            if (compare2 == 0) {
                int compare3 = Boolean.compare(this.E, h14Var.E);
                if (compare3 == 0) {
                    int compare4 = Boolean.compare(this.G, h14Var.G);
                    if (compare4 == 0) {
                        int compare5 = Boolean.compare(this.H, h14Var.H);
                        if (compare5 == 0) {
                            int compare6 = Boolean.compare(this.I, h14Var.I);
                            if (compare6 == 0) {
                                int compare7 = Boolean.compare(this.K, h14Var.K);
                                if (compare7 == 0) {
                                    int compare8 = Boolean.compare(this.J, h14Var.J);
                                    return compare8 == 0 ? this.L.compareTo(h14Var.L) : compare8;
                                }
                                return compare7;
                            }
                            return compare6;
                        }
                        return compare5;
                    }
                    return compare4;
                }
                return compare3;
            }
            return compare2;
        }
        return compare;
    }

    public s14.a h() {
        return this.L.u();
    }

    public int hashCode() {
        int hashCode = this.H ? this.L.hashCode() : 0;
        if (this.C) {
            hashCode |= 536870912;
        }
        if (this.H && (this.F || this.E)) {
            hashCode |= Integer.MIN_VALUE;
        }
        return (this.I || this.J || this.K) ? hashCode | 1073741824 : hashCode;
    }

    public a i() {
        a aVar = new a();
        aVar.a = this.C;
        aVar.b = this.D;
        aVar.d = this.E;
        aVar.c = this.F;
        aVar.e = this.G;
        aVar.f = this.H;
        aVar.g = this.I;
        aVar.i = this.J;
        aVar.j = h();
        return aVar;
    }
}