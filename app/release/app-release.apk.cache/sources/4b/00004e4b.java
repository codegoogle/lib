package com.p7700g.p99005;

import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class lc {
    private static final boolean a = false;
    private static final int b = 30;
    public static final int c = 0;
    public static final int d = 1073741824;
    public static final int e = Integer.MIN_VALUE;
    public static final int f = -1;
    public static final int g = -2;
    public static final int h = -3;
    private final ArrayList<zb> i = new ArrayList<>();
    private a j = new a();
    private ac k;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a = 0;
        public static int b = 1;
        public static int c = 2;
        public zb.b d;
        public zb.b e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public int m;
    }

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(zb zbVar, a aVar);
    }

    public lc(ac acVar) {
        this.k = acVar;
    }

    private boolean a(b bVar, zb zbVar, int i) {
        this.j.d = zbVar.H();
        this.j.e = zbVar.j0();
        this.j.f = zbVar.m0();
        this.j.g = zbVar.D();
        a aVar = this.j;
        aVar.l = false;
        aVar.m = i;
        zb.b bVar2 = aVar.d;
        zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
        boolean z = bVar2 == bVar3;
        boolean z2 = aVar.e == bVar3;
        boolean z3 = z && zbVar.L0 > 0.0f;
        boolean z4 = z2 && zbVar.L0 > 0.0f;
        if (z3 && zbVar.e0[0] == 4) {
            aVar.d = zb.b.FIXED;
        }
        if (z4 && zbVar.e0[1] == 4) {
            aVar.e = zb.b.FIXED;
        }
        bVar.b(zbVar, aVar);
        zbVar.c2(this.j.h);
        zbVar.y1(this.j.i);
        zbVar.x1(this.j.k);
        zbVar.g1(this.j.j);
        a aVar2 = this.j;
        aVar2.m = a.a;
        return aVar2.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.L0 <= 0.0f) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(ac acVar) {
        vc vcVar;
        xc xcVar;
        int size = acVar.A1.size();
        boolean S2 = acVar.S2(64);
        b G2 = acVar.G2();
        for (int i = 0; i < size; i++) {
            zb zbVar = acVar.A1.get(i);
            if (!(zbVar instanceof cc) && !(zbVar instanceof vb) && !zbVar.E0() && (!S2 || (vcVar = zbVar.K) == null || (xcVar = zbVar.L) == null || !vcVar.e.j || !xcVar.e.j)) {
                zb.b z = zbVar.z(0);
                boolean z2 = true;
                zb.b z3 = zbVar.z(1);
                zb.b bVar = zb.b.MATCH_CONSTRAINT;
                boolean z4 = z == bVar && zbVar.c0 != 1 && z3 == bVar && zbVar.d0 != 1;
                if (!z4 && acVar.S2(1) && !(zbVar instanceof ic)) {
                    if (z == bVar && zbVar.c0 == 0 && z3 != bVar && !zbVar.B0()) {
                        z4 = true;
                    }
                    if (z3 == bVar && zbVar.d0 == 0 && z != bVar && !zbVar.B0()) {
                        z4 = true;
                    }
                    if (z != bVar) {
                    }
                }
                z2 = z4;
                if (!z2) {
                    a(G2, zbVar, a.a);
                    j8 j8Var = acVar.L1;
                    if (j8Var != null) {
                        j8Var.c++;
                    }
                }
            }
        }
        G2.a();
    }

    private void c(ac acVar, String str, int i, int i2, int i3) {
        int Q = acVar.Q();
        int P = acVar.P();
        acVar.P1(0);
        acVar.O1(0);
        acVar.c2(i2);
        acVar.y1(i3);
        acVar.P1(Q);
        acVar.O1(P);
        this.k.X2(i);
        this.k.n2();
    }

    public long d(ac acVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z;
        int i10;
        int i11;
        boolean z2;
        int i12;
        b bVar;
        int i13;
        int i14;
        int i15;
        boolean z3;
        j8 j8Var;
        b G2 = acVar.G2();
        int size = acVar.A1.size();
        int m0 = acVar.m0();
        int D = acVar.D();
        boolean b2 = fc.b(i, 128);
        boolean z4 = b2 || fc.b(i, 64);
        if (z4) {
            for (int i16 = 0; i16 < size; i16++) {
                zb zbVar = acVar.A1.get(i16);
                zb.b H = zbVar.H();
                zb.b bVar2 = zb.b.MATCH_CONSTRAINT;
                boolean z5 = (H == bVar2) && (zbVar.j0() == bVar2) && zbVar.A() > 0.0f;
                if ((zbVar.B0() && z5) || ((zbVar.D0() && z5) || (zbVar instanceof ic) || zbVar.B0() || zbVar.D0())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && (j8Var = i8.l) != null) {
            j8Var.e++;
        }
        boolean z6 = z4 & ((i4 == 1073741824 && i6 == 1073741824) || b2);
        if (z6) {
            int min = Math.min(acVar.O(), i5);
            int min2 = Math.min(acVar.N(), i7);
            if (i4 == 1073741824 && acVar.m0() != min) {
                acVar.c2(min);
                acVar.L2();
            }
            if (i6 == 1073741824 && acVar.D() != min2) {
                acVar.y1(min2);
                acVar.L2();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = acVar.B2(b2);
                i10 = 2;
            } else {
                boolean C2 = acVar.C2(b2);
                if (i4 == 1073741824) {
                    C2 &= acVar.D2(b2, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    z = acVar.D2(b2, 1) & C2;
                    i10++;
                } else {
                    z = C2;
                }
            }
            if (z) {
                acVar.i2(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        int H2 = acVar.H2();
        if (size > 0) {
            b(acVar);
        }
        e(acVar);
        int size2 = this.i.size();
        if (size > 0) {
            c(acVar, "First pass", 0, m0, D);
        }
        if (size2 > 0) {
            zb.b H3 = acVar.H();
            zb.b bVar3 = zb.b.WRAP_CONTENT;
            boolean z7 = H3 == bVar3;
            boolean z8 = acVar.j0() == bVar3;
            int max = Math.max(acVar.m0(), this.k.Q());
            int max2 = Math.max(acVar.D(), this.k.P());
            int i17 = 0;
            boolean z9 = false;
            while (i17 < size2) {
                zb zbVar2 = this.i.get(i17);
                if (zbVar2 instanceof ic) {
                    int m02 = zbVar2.m0();
                    i13 = H2;
                    int D2 = zbVar2.D();
                    i14 = D;
                    boolean a2 = a(G2, zbVar2, a.b) | z9;
                    j8 j8Var2 = acVar.L1;
                    i15 = m0;
                    if (j8Var2 != null) {
                        j8Var2.d++;
                    }
                    int m03 = zbVar2.m0();
                    int D3 = zbVar2.D();
                    if (m03 != m02) {
                        zbVar2.c2(m03);
                        if (z7 && zbVar2.X() > max) {
                            max = Math.max(max, zbVar2.r(yb.b.RIGHT).g() + zbVar2.X());
                        }
                        z3 = true;
                    } else {
                        z3 = a2;
                    }
                    if (D3 != D2) {
                        zbVar2.y1(D3);
                        if (z8 && zbVar2.v() > max2) {
                            max2 = Math.max(max2, zbVar2.r(yb.b.BOTTOM).g() + zbVar2.v());
                        }
                        z3 = true;
                    }
                    z9 = z3 | ((ic) zbVar2).y2();
                } else {
                    i13 = H2;
                    i15 = m0;
                    i14 = D;
                }
                i17++;
                H2 = i13;
                D = i14;
                m0 = i15;
            }
            int i18 = H2;
            int i19 = m0;
            int i20 = D;
            int i21 = 0;
            int i22 = 2;
            while (i21 < i22) {
                int i23 = 0;
                while (i23 < size2) {
                    zb zbVar3 = this.i.get(i23);
                    if (((zbVar3 instanceof dc) && !(zbVar3 instanceof ic)) || (zbVar3 instanceof cc) || zbVar3.l0() == 8 || ((z6 && zbVar3.K.e.j && zbVar3.L.e.j) || (zbVar3 instanceof ic))) {
                        z2 = z6;
                        i12 = size2;
                        bVar = G2;
                    } else {
                        int m04 = zbVar3.m0();
                        int D4 = zbVar3.D();
                        int t = zbVar3.t();
                        int i24 = a.b;
                        z2 = z6;
                        if (i21 == 1) {
                            i24 = a.c;
                        }
                        boolean a3 = a(G2, zbVar3, i24) | z9;
                        j8 j8Var3 = acVar.L1;
                        i12 = size2;
                        bVar = G2;
                        if (j8Var3 != null) {
                            j8Var3.d++;
                        }
                        int m05 = zbVar3.m0();
                        int D5 = zbVar3.D();
                        if (m05 != m04) {
                            zbVar3.c2(m05);
                            if (z7 && zbVar3.X() > max) {
                                max = Math.max(max, zbVar3.r(yb.b.RIGHT).g() + zbVar3.X());
                            }
                            a3 = true;
                        }
                        if (D5 != D4) {
                            zbVar3.y1(D5);
                            if (z8 && zbVar3.v() > max2) {
                                max2 = Math.max(max2, zbVar3.r(yb.b.BOTTOM).g() + zbVar3.v());
                            }
                            a3 = true;
                        }
                        z9 = (!zbVar3.q0() || t == zbVar3.t()) ? a3 : true;
                    }
                    i23++;
                    G2 = bVar;
                    z6 = z2;
                    size2 = i12;
                }
                boolean z10 = z6;
                int i25 = size2;
                b bVar4 = G2;
                if (!z9) {
                    break;
                }
                i21++;
                c(acVar, "intermediate pass", i21, i19, i20);
                G2 = bVar4;
                z6 = z10;
                size2 = i25;
                i22 = 2;
                z9 = false;
            }
            i11 = i18;
        } else {
            i11 = H2;
        }
        acVar.V2(i11);
        return 0L;
    }

    public void e(ac acVar) {
        this.i.clear();
        int size = acVar.A1.size();
        for (int i = 0; i < size; i++) {
            zb zbVar = acVar.A1.get(i);
            zb.b H = zbVar.H();
            zb.b bVar = zb.b.MATCH_CONSTRAINT;
            if (H == bVar || zbVar.j0() == bVar) {
                this.i.add(zbVar);
            }
        }
        acVar.L2();
    }
}