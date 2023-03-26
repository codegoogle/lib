package com.p7700g.p99005;

import com.p7700g.p99005.b14;
import com.p7700g.p99005.ec4;
import com.p7700g.p99005.h14;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.ti4;

/* compiled from: IPAddressStringParameters.java */
/* loaded from: classes3.dex */
public class s14 extends b14 implements Comparable<s14> {
    public static final boolean A = true;
    public static final boolean B = true;
    public static final boolean C = true;
    public static final boolean D = true;
    public static final boolean E = true;
    public static final boolean F = true;
    private static final long z = 4;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    private ti4 M;
    private ec4 N;

    /* compiled from: IPAddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class a extends b14.b {
        private static ec4 d = new ec4.a().H();
        private static ti4 e = new ti4.a().F();
        private boolean f = true;
        private boolean g = true;
        private boolean h = true;
        private boolean i = true;
        private boolean j = true;
        private boolean k = true;
        public ec4.a l;
        public ti4.a m;
        public h14.a n;

        public s14 A() {
            ec4 H;
            ti4 F;
            ec4.a aVar = this.l;
            if (aVar == null) {
                H = d;
            } else {
                H = aVar.H();
            }
            ec4 ec4Var = H;
            ti4.a aVar2 = this.m;
            if (aVar2 == null) {
                F = e;
            } else {
                F = aVar2.F();
            }
            return new s14(this.a, this.b, this.c, this.f, this.g, this.h, this.i, this.j, this.k, ec4Var, F);
        }

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: j */
        public a a(boolean z) {
            return (a) super.a(z);
        }

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: k */
        public a b(boolean z) {
            return (a) super.b(z);
        }

        public a l(boolean z) {
            this.j = z;
            return this;
        }

        public a m(boolean z) {
            this.k = z;
            return this;
        }

        public a n(boolean z) {
            this.h = z;
            return this;
        }

        public a o(boolean z) {
            this.g = z;
            return this;
        }

        public a p(boolean z) {
            this.i = z;
            return this;
        }

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: q */
        public a c(boolean z) {
            return (a) super.c(z);
        }

        public a r(boolean z) {
            t().j(z);
            u().j(z);
            return this;
        }

        public a s(boolean z) {
            t().x(z);
            u().A(z);
            return this;
        }

        public ec4.a t() {
            if (this.l == null) {
                this.l = new ec4.a();
            }
            ec4.a aVar = this.l;
            aVar.h = this;
            return aVar;
        }

        public ti4.a u() {
            if (this.m == null) {
                this.m = new ti4.a();
            }
            ti4.a aVar = this.m;
            aVar.h = this;
            return aVar;
        }

        public h14.a v() {
            return this.n;
        }

        public a w(boolean z) {
            this.f = z;
            return this;
        }

        public void x(ec4 ec4Var) {
            this.l = ec4Var.i();
        }

        public void y(ti4 ti4Var) {
            this.m = ti4Var.n();
        }

        public a z(b14.c cVar) {
            t().l(cVar);
            u().l(cVar);
            return this;
        }
    }

    /* compiled from: IPAddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static abstract class b extends b14.a {
        private static final long B = 4;
        public static final boolean C = true;
        public static final boolean D = false;
        public static final boolean E = true;
        public final boolean F;
        public final boolean G;
        public final boolean H;

        /* compiled from: IPAddressStringParameters.java */
        /* loaded from: classes3.dex */
        public static class a extends b14.a.C0148a {
            public boolean e = false;
            public boolean f = true;
            public boolean g = true;
            public a h;

            public a e(boolean z) {
                this.g = z;
                return this;
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: f */
            public a a(boolean z) {
                return (a) super.a(z);
            }

            public a g(boolean z) {
                this.f = z;
                return this;
            }

            public a h(boolean z) {
                this.e = z;
                return this;
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: i */
            public a b(boolean z) {
                return (a) super.b(z);
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: j */
            public a c(boolean z) {
                return (a) super.c(z);
            }

            public a k() {
                return this.h;
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: l */
            public a d(b14.c cVar) {
                return (a) super.d(cVar);
            }
        }

        @Deprecated
        public b(boolean z, boolean z2, boolean z3, b14.c cVar, boolean z4, boolean z5) {
            this(false, z, z2, z3, cVar, z4, z5);
        }

        public int c(b bVar) {
            int a2 = super.a(bVar);
            if (a2 == 0) {
                int compare = Boolean.compare(this.G, bVar.G);
                if (compare == 0) {
                    int compare2 = Boolean.compare(this.H, bVar.H);
                    return compare2 == 0 ? Boolean.compare(this.F, bVar.F) : compare2;
                }
                return compare;
            }
            return a2;
        }

        public a d(a aVar) {
            super.b(aVar);
            aVar.f = this.H;
            aVar.e = this.G;
            aVar.g = this.F;
            return aVar;
        }

        @Override // com.p7700g.p99005.b14.a
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return super.equals(obj) && this.G == bVar.G && this.F == bVar.F && this.H == bVar.H;
            }
            return false;
        }

        @Override // com.p7700g.p99005.b14.a
        public int hashCode() {
            int hashCode = super.hashCode();
            return this.G ? hashCode | 8 : hashCode;
        }

        public abstract l14<?, ?, ?, ?, ?> m0();

        public b(boolean z, boolean z2, boolean z3, boolean z4, b14.c cVar, boolean z5, boolean z6) {
            super(z2, z4, cVar, z5);
            this.F = z;
            this.H = z3;
            this.G = z6;
        }
    }

    public s14(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, ec4 ec4Var, ti4 ti4Var) {
        super(z2, z3, z4);
        this.G = z8;
        this.H = z5;
        this.I = z6;
        this.J = z7;
        this.L = z9;
        this.K = z10;
        this.M = ti4Var;
        this.N = ec4Var;
    }

    @Override // com.p7700g.p99005.b14
    public boolean equals(Object obj) {
        if (obj instanceof s14) {
            s14 s14Var = (s14) obj;
            return super.equals(obj) && this.N.equals(s14Var.N) && this.M.equals(s14Var.M) && this.H == s14Var.H && this.I == s14Var.I && this.G == s14Var.G && this.J == s14Var.J && this.K == s14Var.K && this.L == s14Var.L;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.N.hashCode() | (this.M.hashCode() << 9);
        if (this.H) {
            hashCode |= 134217728;
        }
        if (this.I) {
            hashCode |= 268435456;
        }
        if (this.J) {
            hashCode |= 536870912;
        }
        if (this.w) {
            hashCode |= 1073741824;
        }
        return this.y ? hashCode | Integer.MIN_VALUE : hashCode;
    }

    @Override // com.p7700g.p99005.b14
    /* renamed from: i */
    public s14 f() {
        s14 s14Var = (s14) super.clone();
        s14Var.N = this.N.clone();
        s14Var.M = this.M.clone();
        return s14Var;
    }

    @Override // java.lang.Comparable
    /* renamed from: n */
    public int compareTo(s14 s14Var) {
        int g = super.g(s14Var);
        if (g == 0) {
            int compareTo = this.N.compareTo(s14Var.N);
            if (compareTo == 0) {
                int compareTo2 = this.M.compareTo(s14Var.M);
                if (compareTo2 == 0) {
                    int compare = Boolean.compare(this.H, s14Var.H);
                    if (compare == 0) {
                        int compare2 = Boolean.compare(this.I, s14Var.I);
                        if (compare2 == 0) {
                            int compare3 = Boolean.compare(this.G, s14Var.G);
                            if (compare3 == 0) {
                                int compare4 = Boolean.compare(this.J, s14Var.J);
                                if (compare4 == 0) {
                                    int compare5 = Boolean.compare(this.K, s14Var.K);
                                    return compare5 == 0 ? Boolean.compare(this.L, s14Var.L) : compare5;
                                }
                                return compare4;
                            }
                            return compare3;
                        }
                        return compare2;
                    }
                    return compare;
                }
                return compareTo2;
            }
            return compareTo;
        }
        return g;
    }

    public ec4 o() {
        return this.N;
    }

    public ti4 p() {
        return this.M;
    }

    public j14.b t() {
        if (this.K) {
            if (this.L) {
                return null;
            }
            return j14.b.IPV6;
        } else if (this.L) {
            return j14.b.IPV4;
        } else {
            return null;
        }
    }

    public a u() {
        return x(false);
    }

    public a x(boolean z2) {
        a aVar = new a();
        super.h(aVar);
        aVar.i = this.G;
        aVar.f = this.H;
        aVar.g = this.I;
        aVar.h = this.J;
        aVar.k = this.K;
        aVar.j = this.L;
        aVar.l = this.N.i();
        aVar.m = this.M.o(z2);
        aVar.c = this.y;
        aVar.a = this.w;
        aVar.b = this.x;
        return aVar;
    }
}