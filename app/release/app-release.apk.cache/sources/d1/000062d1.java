package com.p7700g.p99005;

import com.p7700g.p99005.b14;

/* compiled from: MACAddressStringParameters.java */
/* loaded from: classes3.dex */
public class w14 extends b14 implements Comparable<w14> {
    public static final boolean A = true;
    public static final boolean B = true;
    public static final boolean C = true;
    public static final boolean D = true;
    public static final boolean E = true;
    private static final long z = 4;
    public final a F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    private final il4 L;
    private c M;

    /* compiled from: MACAddressStringParameters.java */
    /* loaded from: classes3.dex */
    public enum a {
        MAC,
        EUI64,
        ANY
    }

    /* compiled from: MACAddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class b extends b14.b {
        private static c d = new c.a().k();
        private boolean e = true;
        private boolean f = true;
        private boolean g = true;
        private boolean h = true;
        private boolean i = true;
        private a j;
        private il4 k;
        public c.a l;

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: k */
        public b a(boolean z) {
            return (b) super.a(z);
        }

        public b l(boolean z) {
            this.g = z;
            return this;
        }

        public b m(boolean z) {
            this.e = z;
            return this;
        }

        public b n(boolean z) {
            this.h = z;
            return this;
        }

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: o */
        public b b(boolean z) {
            return (b) super.b(z);
        }

        @Override // com.p7700g.p99005.b14.b
        /* renamed from: p */
        public b c(boolean z) {
            return (b) super.c(z);
        }

        public b q(boolean z) {
            this.i = z;
            return this;
        }

        public b r(boolean z) {
            s().c(z);
            return this;
        }

        public c.a s() {
            if (this.l == null) {
                this.l = new c.a();
            }
            c.a aVar = this.l;
            aVar.f = this;
            return aVar;
        }

        public b t(a aVar) {
            this.j = aVar;
            return this;
        }

        public b u(il4 il4Var) {
            this.k = il4Var;
            return this;
        }

        public b v(b14.c cVar) {
            s().d(cVar);
            return this;
        }

        public w14 w() {
            c k;
            c.a aVar = this.l;
            if (aVar == null) {
                k = d;
            } else {
                k = aVar.k();
            }
            return new w14(this.a, this.b, this.j, this.c, this.e, this.f, this.g, this.h, this.i, k, this.k);
        }
    }

    /* compiled from: MACAddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class c extends b14.a implements Comparable<c> {
        private static final long B = 4;
        public static final boolean C = true;
        public final boolean D;

        /* compiled from: MACAddressStringParameters.java */
        /* loaded from: classes3.dex */
        public static class a extends b14.a.C0148a {
            public boolean e = true;
            public b f;

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: e */
            public a a(boolean z) {
                return (a) super.a(z);
            }

            public a f(boolean z) {
                this.e = z;
                return this;
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: g */
            public a b(boolean z) {
                return (a) super.b(z);
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: h */
            public a c(boolean z) {
                return (a) super.c(z);
            }

            public b i() {
                return this.f;
            }

            @Override // com.p7700g.p99005.b14.a.C0148a
            /* renamed from: j */
            public a d(b14.c cVar) {
                return (a) super.d(cVar);
            }

            public c k() {
                return new c(this.e, this.c, this.d, this.a, this.b);
            }
        }

        public c(boolean z, boolean z2, boolean z3, b14.c cVar, boolean z4) {
            super(z2, z3, cVar, z4);
            this.D = z;
        }

        @Override // com.p7700g.p99005.b14.a
        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return super.equals(obj) && this.D == ((c) obj).D;
            }
            return false;
        }

        /* renamed from: f */
        public c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(c cVar) {
            int a2 = super.a(cVar);
            return a2 == 0 ? Boolean.compare(this.D, cVar.D) : a2;
        }

        public a h() {
            a aVar = new a();
            super.b(aVar);
            aVar.e = this.D;
            return aVar;
        }

        @Override // com.p7700g.p99005.b14.a
        public int hashCode() {
            int hashCode = super.hashCode();
            return this.D ? hashCode | 64 : hashCode;
        }
    }

    public w14(boolean z2, boolean z3, a aVar, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, c cVar, il4 il4Var) {
        super(z2, z3, z4);
        this.G = z5;
        this.H = z6;
        this.I = z7;
        this.J = z8;
        this.K = z9;
        this.M = cVar;
        this.F = aVar;
        this.L = il4Var;
    }

    @Override // com.p7700g.p99005.b14
    public boolean equals(Object obj) {
        if (obj instanceof w14) {
            w14 w14Var = (w14) obj;
            return super.equals(obj) && this.M.equals(w14Var.M) && this.G == w14Var.G && this.H == w14Var.H && this.I == w14Var.I && this.J == w14Var.J && this.K == w14Var.K && this.F == w14Var.F;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.M.hashCode();
        if (this.x) {
            hashCode |= 128;
        }
        if (this.G) {
            hashCode |= 256;
        }
        if (this.I) {
            hashCode |= 512;
        }
        if (this.J) {
            hashCode |= 1024;
        }
        if (this.K) {
            hashCode |= 2048;
        }
        if (this.y) {
            hashCode |= 4096;
        }
        a aVar = this.F;
        if (aVar == a.MAC) {
            hashCode |= 8192;
        } else if (aVar == a.EUI64) {
            hashCode |= 16384;
        }
        if (this.H) {
            hashCode |= 32768;
        }
        return this.w ? hashCode | 65536 : hashCode;
    }

    @Override // com.p7700g.p99005.b14
    /* renamed from: i */
    public w14 f() {
        w14 w14Var = (w14) super.clone();
        w14Var.M = this.M.clone();
        return w14Var;
    }

    @Override // java.lang.Comparable
    /* renamed from: n */
    public int compareTo(w14 w14Var) {
        int g = super.g(w14Var);
        if (g == 0) {
            int compareTo = this.M.compareTo(w14Var.M);
            if (compareTo == 0) {
                int compare = Boolean.compare(this.G, w14Var.G);
                if (compare == 0) {
                    int compare2 = Boolean.compare(this.H, w14Var.H);
                    if (compare2 == 0) {
                        int compare3 = Boolean.compare(this.I, w14Var.I);
                        if (compare3 == 0) {
                            int compare4 = Boolean.compare(this.J, w14Var.J);
                            if (compare4 == 0) {
                                int compare5 = Boolean.compare(this.K, w14Var.K);
                                return compare5 == 0 ? this.F.ordinal() - w14Var.F.ordinal() : compare5;
                            }
                            return compare4;
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            }
            return compareTo;
        }
        return g;
    }

    public c o() {
        return this.M;
    }

    public il4 p() {
        il4 il4Var = this.L;
        return il4Var == null ? n04.i() : il4Var;
    }

    public b t() {
        b bVar = new b();
        super.h(bVar);
        bVar.e = this.G;
        bVar.f = this.H;
        bVar.g = this.I;
        bVar.h = this.J;
        bVar.i = this.K;
        bVar.l = this.M.h();
        bVar.j = this.F;
        bVar.k = this.L;
        return bVar;
    }
}