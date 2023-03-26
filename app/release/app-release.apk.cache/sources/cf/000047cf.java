package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: IPAddressDivisionGrouping.java */
/* loaded from: classes3.dex */
public class i34 extends f34 implements r24 {
    private static final long F = 4;
    public static final b G;
    private final l14<?, ?, ?, ?, ?> H;

    /* compiled from: IPAddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            StringBuilder G = wo1.G("[");
            G.append(this.a);
            G.append(e14.f0);
            G.append(this.a + this.b);
            G.append(f14.v);
            return G.toString();
        }
    }

    /* compiled from: IPAddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class c {
        public final a[] a;

        public c(a[] aVarArr) {
            Objects.requireNonNull(aVarArr);
            this.a = aVarArr;
        }

        public a a(int i) {
            return this.a[i];
        }

        public int b() {
            return this.a.length;
        }

        public String toString() {
            return Arrays.asList(this.a).toString();
        }
    }

    static {
        b bVar = new b();
        G = bVar;
        if (b.a) {
            bVar.d(-1);
        }
    }

    public i34(h34[] h34VarArr, l14<?, ?, ?, ?, ?> l14Var) throws c14 {
        super(h34VarArr);
        h34 h34Var;
        Integer f;
        if (l14Var != null) {
            this.H = l14Var;
            int i = 0;
            int i2 = 0;
            while (i < h34VarArr.length) {
                h34 h34Var2 = h34VarArr[i];
                Integer f2 = h34Var2.f();
                if (f2 != null) {
                    this.z = f34.b(f2.intValue() + i2);
                    do {
                        i++;
                        if (i >= h34VarArr.length) {
                            return;
                        }
                        h34Var = h34VarArr[i];
                        f = h34Var.f();
                        if (f == null) {
                            break;
                        }
                    } while (f.intValue() == 0);
                    throw new u14(h34VarArr[i - 1], h34Var, f);
                }
                i2 += h34Var2.A0();
                i++;
            }
            this.z = g24.t;
            return;
        }
        throw new NullPointerException(g24.x("ipaddress.error.nullNetwork"));
    }

    public static c P4() {
        return b.c;
    }

    public static c Q4(int i, int i2) {
        return G.a(i, -1, i2).b();
    }

    public static boolean V4(m14 m14Var, m14 m14Var2, int i) {
        int i2;
        if (i < 0) {
            return false;
        }
        Integer L0 = m14Var.L0();
        if (L0 == null) {
            i2 = m14Var.V0();
            if (i2 + i > m14Var2.V0()) {
                return false;
            }
        } else {
            int n3 = f34.n3(L0.intValue(), m14Var.Z1(), m14Var.u2());
            if (n3 >= 0) {
                int i3 = n3 + i;
                if (i3 >= m14Var2.V0()) {
                    return false;
                }
                n14 D0 = m14Var.D0(n3);
                if (!D0.c6(m14Var2.D0(i3), f34.p3(D0.A0(), L0.intValue(), n3).intValue())) {
                    return false;
                }
            }
            i2 = n3;
        }
        do {
            i2--;
            if (i2 < 0) {
                return true;
            }
        } while (m14Var.D0(i2).R1(m14Var2.D0(i2 + i)));
        return false;
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean B3(int i) {
        return g24.e(this, i);
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof i34) && super.G(g24Var);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24, com.p7700g.p99005.o34
    public boolean I0() {
        Integer K3 = K3();
        if (K3 == null) {
            return false;
        }
        if (m0().i().f()) {
            return true;
        }
        return B3(K3.intValue());
    }

    @Override // com.p7700g.p99005.r24
    public Integer K3() {
        Integer num = this.z;
        if (num == null) {
            Integer c2 = g24.c(this);
            if (c2 != null) {
                this.z = c2;
                return c2;
            }
            this.z = g24.t;
            return null;
        } else if (num.intValue() == g24.t.intValue()) {
            return null;
        } else {
            return num;
        }
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public Integer L0() {
        return K3();
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    /* renamed from: N4 */
    public h34 t(int i) {
        return (h34) super.t(i);
    }

    public int O4(boolean z) {
        int p1 = p1();
        if (p1 == 0) {
            return 0;
        }
        long I4 = z ? t(0).I4() : 0L;
        int i = 0;
        for (int i2 = 0; i2 < p1; i2++) {
            h34 t = t(i2);
            if (t.G4() != I4) {
                return t.m5(z) + i;
            }
            i += t.A0();
        }
        return i;
    }

    public int R4(boolean z) {
        int p1 = p1();
        int i = 0;
        if (p1 == 0) {
            return 0;
        }
        long I4 = z ? 0L : t(0).I4();
        for (int i2 = p1 - 1; i2 >= 0; i2--) {
            h34 t = t(i2);
            if (t.G4() != I4) {
                return t.n5(z) + i;
            }
            i += t.A0();
        }
        return i;
    }

    public c S4() {
        if (C0()) {
            return U4(true);
        }
        return T4();
    }

    public c T4() {
        return U4(false);
    }

    public c U4(boolean z) {
        b bVar = G;
        int p1 = p1();
        boolean z2 = z & (!m0().i().g() && I0());
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < p1; i4++) {
            h34 t = t(i4);
            if (t.V1() || (z2 && t.C0() && t.o5(0L, t.f().intValue()))) {
                i3++;
                if (i3 == 1) {
                    i = i4;
                }
                if (i4 == p1 - 1) {
                    bVar = bVar.a(i, i2, i3);
                    i2 = i + i3;
                }
            } else if (i3 > 0) {
                bVar = bVar.a(i, i2, i3);
                i2 = i3 + i;
                i3 = 0;
            }
        }
        return bVar.b();
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public Integer X3() {
        return g24.A(this);
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean Y2(int i) {
        return g24.f(this, i);
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public boolean b1() {
        Integer K3 = K3();
        if (K3 == null) {
            return false;
        }
        return Y2(K3.intValue());
    }

    @Override // com.p7700g.p99005.f34, com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i34) {
            return ((i34) obj).G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.i24
    public int f4(i24 i24Var) {
        if (!z3()) {
            return i24Var.z3() ? -1 : 0;
        } else if (i24Var.z3()) {
            if (b1() && i24Var.b1()) {
                return (A0() - L0().intValue()) - (i24Var.A0() - i24Var.L0().intValue());
            }
            return getCount().compareTo(i24Var.getCount());
        } else {
            return 1;
        }
    }

    public l14<?, ?, ?, ?, ?> m0() {
        return this.H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean o4() {
        Integer K3 = K3();
        if (K3 == null || K3.intValue() >= A0()) {
            return false;
        }
        if (m0().i().f()) {
            return true;
        }
        int p1 = p1();
        int i = 0;
        while (i < p1) {
            h34 t = t(i);
            Integer f = t.f();
            if (f != null) {
                if (((~((-1) << (t.A0() - f.intValue()))) & t.G4()) != 0) {
                    return false;
                }
                while (true) {
                    i++;
                    if (i < p1) {
                        if (!t(i).v1()) {
                            return false;
                        }
                    }
                }
            }
            i++;
        }
        return true;
    }

    /* compiled from: IPAddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class b {
        public static boolean a = false;
        public static final int b = 8;
        public static final c c = new c(new a[0]);
        public b[][] d;
        public b e;
        public c f;
        public a g;

        public b() {
            this(null, 8, null);
            this.f = c;
        }

        private void c(a[] aVarArr, int i) {
            int i2 = i - 1;
            aVarArr[i2] = this.g;
            if (i2 > 0) {
                this.e.c(aVarArr, i2);
            }
        }

        public b a(int i, int i2, int i3) {
            a aVar;
            int i4 = (i - i2) - 1;
            int i5 = i3 - 1;
            b bVar = this.d[i4][i5];
            if (bVar == null) {
                synchronized (this) {
                    bVar = this.d[i4][i5];
                    if (bVar == null) {
                        int i6 = 8 - (i2 + 1);
                        b bVar2 = i34.G;
                        if (this == bVar2) {
                            aVar = new a(i, i3);
                        } else {
                            b[][] bVarArr = bVar2.d;
                            b bVar3 = bVarArr[i][i5];
                            if (bVar3 == null) {
                                b[] bVarArr2 = bVarArr[i];
                                a aVar2 = new a(i, i3);
                                bVarArr2[i5] = new b(bVar2, 8, aVar2);
                                aVar = aVar2;
                            } else {
                                aVar = bVar3.g;
                            }
                        }
                        b[] bVarArr3 = this.d[i4];
                        b bVar4 = new b(this, i6, aVar);
                        bVarArr3[i5] = bVar4;
                        bVar = bVar4;
                    }
                }
            }
            return bVar;
        }

        public c b() {
            c cVar = this.f;
            if (cVar == null) {
                int i = 0;
                for (b bVar = this.e; bVar != null; bVar = bVar.e) {
                    i++;
                }
                a[] aVarArr = new a[i];
                if (i > 0) {
                    int i2 = i - 1;
                    aVarArr[i2] = this.g;
                    if (i2 > 0) {
                        this.e.c(aVarArr, i2);
                    }
                }
                c cVar2 = new c(aVarArr);
                this.f = cVar2;
                return cVar2;
            }
            return cVar;
        }

        public void d(int i) {
            b[] bVarArr;
            a aVar;
            if (this.d == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                b[][] bVarArr2 = this.d;
                if (i2 >= bVarArr2.length) {
                    break;
                }
                b[] bVarArr3 = bVarArr2[i2];
                for (int i3 = 0; i3 < bVarArr3.length; i3++) {
                    if (i == -1) {
                        aVar = new a(i2 + i + 1, i3 + 1);
                    } else {
                        aVar = i34.G.d[i2 + i + 1][i3].g;
                    }
                    b bVar = new b(this, 8 - (((i2 + i) + i3) + 3), aVar);
                    bVar.b();
                    bVarArr3[i3] = bVar;
                }
                i2++;
            }
            int i4 = 0;
            while (true) {
                b[][] bVarArr4 = this.d;
                if (i4 >= bVarArr4.length) {
                    return;
                }
                for (b bVar2 : bVarArr4[i4]) {
                    a aVar2 = bVar2.g;
                    bVar2.d(aVar2.a + aVar2.b);
                }
                i4++;
            }
        }

        private b(b bVar, int i, a aVar) {
            if (i > 0) {
                this.d = new b[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.d[i2] = new b[i - i2];
                }
            }
            this.e = bVar;
            this.g = aVar;
        }
    }

    public i34(h34[] h34VarArr, boolean z) {
        super(h34VarArr, z);
        l14<?, ?, ?, ?, ?> m0 = m0();
        this.H = m0;
        if (m0 == null) {
            throw new NullPointerException(g24.x("ipaddress.error.nullNetwork"));
        }
    }
}