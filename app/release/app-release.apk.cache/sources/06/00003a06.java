package com.p7700g.p99005;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: AddressStringParameters.java */
/* loaded from: classes3.dex */
public class b14 implements Cloneable, Serializable {
    private static final long s = 4;
    public static final boolean t = true;
    public static final boolean u = true;
    public static final boolean v = true;
    public final boolean w;
    public final boolean x;
    public final boolean y;

    /* compiled from: AddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class a implements Cloneable, Serializable {
        private static final long s = 4;
        public static final boolean t = true;
        public static final boolean u = true;
        public static final boolean v = true;
        public static final c w = c.v;
        public final boolean A;
        public final c x;
        public final boolean y;
        public final boolean z;

        /* compiled from: AddressStringParameters.java */
        /* renamed from: com.p7700g.p99005.b14$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0148a {
            public c a = a.w;
            public boolean b = true;
            public boolean c = true;
            public boolean d = true;

            public C0148a a(boolean z) {
                this.c = z;
                if (!z) {
                    this.d = z;
                }
                return this;
            }

            public C0148a b(boolean z) {
                this.d = z;
                if (z) {
                    this.c = z;
                }
                return this;
            }

            public C0148a c(boolean z) {
                this.b = z;
                return this;
            }

            public C0148a d(c cVar) {
                this.a = cVar;
                return this;
            }
        }

        public a(boolean z, boolean z2, c cVar, boolean z3) {
            this.x = cVar;
            Objects.requireNonNull(cVar);
            this.y = z3;
            this.z = z;
            this.A = z2;
        }

        public int a(a aVar) {
            int compareTo = this.x.compareTo(aVar.x);
            if (compareTo == 0) {
                int compare = Boolean.compare(this.y, aVar.y);
                return compare == 0 ? Boolean.compare(this.z, aVar.z) : compare;
            }
            return compareTo;
        }

        public C0148a b(C0148a c0148a) {
            c0148a.d = this.A;
            c0148a.a = this.x;
            c0148a.b = this.y;
            c0148a.c = this.z;
            return c0148a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.x.equals(aVar.x) && this.A == aVar.A && this.y == aVar.y && this.z == aVar.z;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.x.hashCode();
            if (this.A) {
                hashCode |= 8;
            }
            if (this.y) {
                hashCode |= 16;
            }
            return this.z ? hashCode | 32 : hashCode;
        }
    }

    /* compiled from: AddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class b {
        public boolean a = true;
        public boolean b = true;
        public boolean c = true;

        public b a(boolean z) {
            this.b = z;
            return this;
        }

        public b b(boolean z) {
            this.a = z;
            return this;
        }

        public b c(boolean z) {
            this.c = z;
            return this;
        }
    }

    /* compiled from: AddressStringParameters.java */
    /* loaded from: classes3.dex */
    public static class c implements Comparable<c>, Cloneable, Serializable {
        private static final long s = 4;
        public static final c t = new c(false, false, false, false, false);
        public static final c u = new c(true, false, false, false, true);
        public static final c v = new c(true, true, true, true, true);
        private final boolean A;
        private final boolean w;
        private final boolean x;
        private final boolean y;
        private final boolean z;

        public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.w = z;
            this.x = z2;
            this.y = z3;
            this.A = z4;
            this.z = z5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.w == cVar.w && this.x == cVar.x && this.y == cVar.y && this.A == cVar.A && this.z == cVar.z;
            }
            return false;
        }

        public boolean f() {
            return this.A;
        }

        public boolean g() {
            return this.x;
        }

        public boolean h() {
            return this.y;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z = this.w;
            ?? r0 = z;
            if (this.x) {
                r0 = (z ? 1 : 0) | true;
            }
            return this.z ? r0 | 4 : r0;
        }

        public boolean i() {
            return this.z;
        }

        public boolean n() {
            return this.w;
        }

        /* renamed from: o */
        public c clone() {
            try {
                return (c) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: p */
        public int compareTo(c cVar) {
            int compare = Boolean.compare(this.w, cVar.w);
            if (compare == 0) {
                int compare2 = Boolean.compare(this.x, cVar.x);
                if (compare2 == 0) {
                    int compare3 = Boolean.compare(this.z, cVar.z);
                    if (compare3 == 0) {
                        int compare4 = Boolean.compare(this.y, cVar.y);
                        return compare4 == 0 ? Boolean.compare(this.A, cVar.A) : compare4;
                    }
                    return compare3;
                }
                return compare2;
            }
            return compare;
        }

        public boolean t() {
            return (this.w || this.x || this.z) ? false : true;
        }
    }

    public b14(boolean z, boolean z2, boolean z3) {
        this.w = z;
        this.x = z2;
        this.y = z3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b14) {
            b14 b14Var = (b14) obj;
            return this.w == b14Var.w && this.x == b14Var.x && this.y == b14Var.y;
        }
        return false;
    }

    @Override // 
    /* renamed from: f */
    public b14 clone() {
        try {
            return (b14) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int g(b14 b14Var) {
        int compare = Boolean.compare(this.x, b14Var.x);
        if (compare == 0) {
            int compare2 = Boolean.compare(this.w, b14Var.w);
            return compare2 == 0 ? Boolean.compare(this.y, b14Var.y) : compare2;
        }
        return compare;
    }

    public b h(b bVar) {
        bVar.b = this.x;
        bVar.a = this.w;
        bVar.c = this.y;
        return bVar;
    }
}