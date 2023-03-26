package com.p7700g.p99005;

import com.p7700g.p99005.b14;
import com.p7700g.p99005.ec4;
import com.p7700g.p99005.s14;
import java.util.Objects;

/* compiled from: IPv6AddressStringParameters.java */
/* loaded from: classes3.dex */
public class ti4 extends s14.b implements Comparable<ti4> {
    private static final long I = 4;
    public static final boolean J = true;
    public static final boolean K = true;
    public static final boolean L = true;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    private final pi4 P;
    private s14 Q;

    /* compiled from: IPv6AddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class a extends s14.b.a {
        private static s14 i = new s14.a().b(false).o(false).n(false).p(false).a(false).u().u(false).k().A();
        private boolean j = true;
        private boolean k = true;
        private boolean l = true;
        private s14.a m;
        private pi4 n;

        public a A(boolean z) {
            if (z) {
                u(z);
            }
            C().t().x(z);
            return this;
        }

        public ec4.a B() {
            return C().t();
        }

        public s14.a C() {
            if (this.m == null) {
                s14.a m = new s14.a().b(false).o(false).n(false).p(false).a(false).m(false);
                this.m = m;
                m.u().k = this.k;
            }
            this.m.t().E(this);
            return this.m;
        }

        public a D(pi4 pi4Var) {
            this.n = pi4Var;
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: E */
        public a l(b14.c cVar) {
            C().t().l(cVar);
            super.d(cVar);
            return this;
        }

        public ti4 F() {
            s14 A;
            s14.a aVar = this.m;
            if (aVar == null) {
                A = i;
            } else {
                A = aVar.A();
            }
            return new ti4(this.c, this.f, this.d, this.j, A, this.k, this.l, this.a, this.b, this.e, this.g, this.n);
        }

        @Override // com.p7700g.p99005.s14.b.a
        public /* bridge */ /* synthetic */ s14.a k() {
            return super.k();
        }

        public a r(boolean z) {
            this.l = z;
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: s */
        public a e(boolean z) {
            super.e(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: t */
        public a f(boolean z) {
            B().f(z);
            super.a(z);
            return this;
        }

        public a u(boolean z) {
            this.j = z;
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: v */
        public a g(boolean z) {
            super.g(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: w */
        public a h(boolean z) {
            super.h(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: x */
        public a i(boolean z) {
            B().i(z);
            super.b(z);
            return this;
        }

        @Override // com.p7700g.p99005.s14.b.a
        /* renamed from: y */
        public a j(boolean z) {
            B().j(z);
            super.c(z);
            return this;
        }

        public a z(boolean z) {
            C().u().k = z;
            this.k = z;
            return this;
        }
    }

    @Deprecated
    public ti4(boolean z, boolean z2, boolean z3, boolean z4, s14 s14Var, boolean z5, boolean z6, b14.c cVar, boolean z7, boolean z8, pi4 pi4Var) {
        this(z, z2, z3, z4, s14Var, z5, z6, cVar, z7, z8, false, pi4Var);
    }

    @Override // com.p7700g.p99005.s14.b, com.p7700g.p99005.b14.a
    public boolean equals(Object obj) {
        if ((obj instanceof ti4) && super.equals(obj)) {
            ti4 ti4Var = (ti4) obj;
            return Objects.equals(this.Q.o(), ti4Var.Q.o()) && this.M == ti4Var.M && this.N == ti4Var.N && this.O == ti4Var.O;
        }
        return false;
    }

    /* renamed from: f */
    public ti4 clone() {
        try {
            ti4 ti4Var = (ti4) super.clone();
            ti4Var.Q = this.Q.f();
            return ti4Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(ti4 ti4Var) {
        int c = super.c(ti4Var);
        if (c == 0) {
            int compareTo = this.Q.o().compareTo(ti4Var.Q.o());
            if (compareTo == 0) {
                int compare = Boolean.compare(this.M, ti4Var.M);
                if (compare == 0) {
                    int compare2 = Boolean.compare(this.N, ti4Var.N);
                    return compare2 == 0 ? Boolean.compare(this.O, ti4Var.O) : compare2;
                }
                return compare;
            }
            return compareTo;
        }
        return c;
    }

    public s14 h() {
        return this.Q;
    }

    @Override // com.p7700g.p99005.s14.b, com.p7700g.p99005.b14.a
    public int hashCode() {
        int hashCode = super.hashCode() | (this.Q.o().hashCode() << 6);
        if (this.M) {
            hashCode |= 32768;
        }
        if (this.N) {
            hashCode |= 65536;
        }
        return this.O ? hashCode | 131072 : hashCode;
    }

    @Override // com.p7700g.p99005.s14.b
    /* renamed from: i */
    public pi4 m0() {
        pi4 pi4Var = this.P;
        return pi4Var == null ? n04.h() : pi4Var;
    }

    public a n() {
        return o(false);
    }

    public a o(boolean z) {
        a aVar = new a();
        aVar.j = this.M;
        aVar.k = this.N;
        aVar.l = this.O;
        aVar.n = this.P;
        if (!z) {
            aVar.m = this.Q.x(true);
        }
        return (a) d(aVar);
    }

    public ti4(boolean z, boolean z2, boolean z3, boolean z4, s14 s14Var, boolean z5, boolean z6, b14.c cVar, boolean z7, boolean z8, boolean z9, pi4 pi4Var) {
        super(z9, z, z2, z3, cVar, z7, z8);
        this.M = z4;
        this.N = z5;
        this.O = z6;
        this.Q = s14Var;
        this.P = pi4Var;
    }
}