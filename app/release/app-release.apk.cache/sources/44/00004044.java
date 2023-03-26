package com.p7700g.p99005;

import com.p7700g.p99005.b14;
import com.p7700g.p99005.s14;
import com.p7700g.p99005.ti4;

/* compiled from: IPv4AddressStringParameters.java */
/* loaded from: classes3.dex */
public class ec4 extends s14.b implements Comparable<ec4> {
    private static final long I = 4;
    public static final boolean J = true;
    public static final boolean K = false;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    private final ac4 Q;

    /* compiled from: IPv4AddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class a extends s14.b.a {
        private boolean i = true;
        private boolean j = true;
        private boolean k = true;
        private boolean l = true;
        private boolean m = false;
        private ac4 n;
        public ti4.a o;

        public a A(boolean z) {
            this.k = z;
            return this;
        }

        public a B(boolean z) {
            this.j = z;
            return this;
        }

        public a C(boolean z) {
            this.m = z;
            return this;
        }

        public ti4.a D() {
            return this.o;
        }

        public void E(ti4.a aVar) {
            this.o = aVar;
        }

        public a F(ac4 ac4Var) {
            this.n = ac4Var;
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: G */
        public a l(b14.c cVar) {
            super.d(cVar);
            return this;
        }

        public ec4 H() {
            return new ec4(this.c, this.f, this.d, this.a, this.b, this.e, this.g, this.i, this.j, this.k, this.l, this.m, this.n);
        }

        @Override // com.p7700g.p99005.s14.b.a
        public /* bridge */ /* synthetic */ s14.a k() {
            return super.k();
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: r */
        public a e(boolean z) {
            super.e(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: s */
        public a f(boolean z) {
            super.a(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: t */
        public a g(boolean z) {
            super.g(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: u */
        public a h(boolean z) {
            super.h(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: v */
        public a i(boolean z) {
            super.b(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: w */
        public a j(boolean z) {
            super.c(z);
            return this;
        }

        public a x(boolean z) {
            this.i = z;
            this.j = z;
            this.l = z;
            super.b(z);
            return this;
        }

        public a y(boolean z) {
            this.i = z;
            return this;
        }

        public a z(boolean z) {
            this.l = z;
            return this;
        }
    }

    @Deprecated
    public ec4(boolean z, boolean z2, boolean z3, b14.c cVar, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, ac4 ac4Var) {
        this(z, z2, z3, cVar, z4, z5, false, z6, z7, z8, z9, z10, ac4Var);
    }

    @Override // com.p7700g.p99005.s14.b, com.p7700g.p99005.b14.a
    public boolean equals(Object obj) {
        if ((obj instanceof ec4) && super.equals(obj)) {
            ec4 ec4Var = (ec4) obj;
            return this.L == ec4Var.L && this.M == ec4Var.M && this.O == ec4Var.O && this.N == ec4Var.N && this.P == ec4Var.P;
        }
        return false;
    }

    /* renamed from: f */
    public ec4 clone() {
        try {
            return (ec4) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(ec4 ec4Var) {
        int c = super.c(ec4Var);
        if (c == 0) {
            int compare = Boolean.compare(this.L, ec4Var.L);
            if (compare == 0) {
                int compare2 = Boolean.compare(this.M, ec4Var.M);
                if (compare2 == 0) {
                    int compare3 = Boolean.compare(this.O, ec4Var.O);
                    if (compare3 == 0) {
                        int compare4 = Boolean.compare(this.N, ec4Var.N);
                        return compare4 == 0 ? Boolean.compare(this.P, ec4Var.P) : compare4;
                    }
                    return compare3;
                }
                return compare2;
            }
            return compare;
        }
        return c;
    }

    @Override // com.p7700g.p99005.s14.b
    /* renamed from: h */
    public ac4 m0() {
        ac4 ac4Var = this.Q;
        return ac4Var == null ? n04.g() : ac4Var;
    }

    @Override // com.p7700g.p99005.s14.b, com.p7700g.p99005.b14.a
    public int hashCode() {
        int hashCode = super.hashCode();
        if (this.L) {
            hashCode |= 64;
        }
        if (this.M) {
            hashCode |= 128;
        }
        return this.O ? hashCode | 256 : hashCode;
    }

    public a i() {
        a aVar = new a();
        aVar.i = this.L;
        aVar.j = this.M;
        aVar.l = this.O;
        aVar.m = this.P;
        aVar.n = this.Q;
        return (a) d(aVar);
    }

    public ec4(boolean z, boolean z2, boolean z3, b14.c cVar, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ac4 ac4Var) {
        super(z6, z, z2, z3, cVar, z4, z5);
        this.L = z7;
        this.M = z8;
        this.N = z9;
        this.O = z10;
        this.P = z11;
        this.Q = ac4Var;
    }
}