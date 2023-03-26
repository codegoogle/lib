package com.p7700g.p99005;

import com.p7700g.p99005.lc;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class rc {
    private static final boolean a = false;
    private static final boolean b = false;
    private static final boolean d = true;
    private static lc.a c = new lc.a();
    private static int e = 0;
    private static int f = 0;

    private static boolean a(int i, zb zbVar) {
        zb.b bVar;
        zb.b bVar2;
        zb.b H = zbVar.H();
        zb.b j0 = zbVar.j0();
        ac acVar = zbVar.U() != null ? (ac) zbVar.U() : null;
        if (acVar != null) {
            acVar.H();
            zb.b bVar3 = zb.b.FIXED;
        }
        if (acVar != null) {
            acVar.j0();
            zb.b bVar4 = zb.b.FIXED;
        }
        zb.b bVar5 = zb.b.FIXED;
        boolean z = H == bVar5 || zbVar.G0() || H == zb.b.WRAP_CONTENT || (H == (bVar2 = zb.b.MATCH_CONSTRAINT) && zbVar.c0 == 0 && zbVar.L0 == 0.0f && zbVar.r0(0)) || (H == bVar2 && zbVar.c0 == 1 && zbVar.u0(0, zbVar.m0()));
        boolean z2 = j0 == bVar5 || zbVar.H0() || j0 == zb.b.WRAP_CONTENT || (j0 == (bVar = zb.b.MATCH_CONSTRAINT) && zbVar.d0 == 0 && zbVar.L0 == 0.0f && zbVar.r0(1)) || (j0 == bVar && zbVar.d0 == 1 && zbVar.u0(1, zbVar.D()));
        if (zbVar.L0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(int i, zb zbVar, lc.b bVar, boolean z) {
        yb ybVar;
        yb ybVar2;
        yb ybVar3;
        yb ybVar4;
        if (zbVar.z0()) {
            return;
        }
        e++;
        if (!(zbVar instanceof ac) && zbVar.F0()) {
            int i2 = i + 1;
            if (a(i2, zbVar)) {
                ac.R2(i2, zbVar, bVar, new lc.a(), lc.a.a);
            }
        }
        yb r = zbVar.r(yb.b.LEFT);
        yb r2 = zbVar.r(yb.b.RIGHT);
        int f2 = r.f();
        int f3 = r2.f();
        if (r.e() != null && r.o()) {
            Iterator<yb> it = r.e().iterator();
            while (it.hasNext()) {
                yb next = it.next();
                zb zbVar2 = next.f;
                int i3 = i + 1;
                boolean a2 = a(i3, zbVar2);
                if (zbVar2.F0() && a2) {
                    ac.R2(i3, zbVar2, bVar, new lc.a(), lc.a.a);
                }
                boolean z2 = (next == zbVar2.w0 && (ybVar4 = zbVar2.y0.h) != null && ybVar4.o()) || (next == zbVar2.y0 && (ybVar3 = zbVar2.w0.h) != null && ybVar3.o());
                zb.b H = zbVar2.H();
                zb.b bVar2 = zb.b.MATCH_CONSTRAINT;
                if (H == bVar2 && !a2) {
                    if (zbVar2.H() == bVar2 && zbVar2.g0 >= 0 && zbVar2.f0 >= 0 && ((zbVar2.l0() == 8 || (zbVar2.c0 == 0 && zbVar2.A() == 0.0f)) && !zbVar2.B0() && !zbVar2.E0() && z2 && !zbVar2.B0())) {
                        g(i3, zbVar, bVar, zbVar2, z);
                    }
                } else if (!zbVar2.F0()) {
                    yb ybVar5 = zbVar2.w0;
                    if (next == ybVar5 && zbVar2.y0.h == null) {
                        int g = ybVar5.g() + f2;
                        zbVar2.q1(g, zbVar2.m0() + g);
                        b(i3, zbVar2, bVar, z);
                    } else {
                        yb ybVar6 = zbVar2.y0;
                        if (next == ybVar6 && ybVar5.h == null) {
                            int g2 = f2 - ybVar6.g();
                            zbVar2.q1(g2 - zbVar2.m0(), g2);
                            b(i3, zbVar2, bVar, z);
                        } else if (z2 && !zbVar2.B0()) {
                            f(i3, bVar, zbVar2, z);
                        }
                    }
                }
            }
        }
        if (zbVar instanceof cc) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            Iterator<yb> it2 = r2.e().iterator();
            while (it2.hasNext()) {
                yb next2 = it2.next();
                zb zbVar3 = next2.f;
                int i4 = i + 1;
                boolean a3 = a(i4, zbVar3);
                if (zbVar3.F0() && a3) {
                    ac.R2(i4, zbVar3, bVar, new lc.a(), lc.a.a);
                }
                boolean z3 = (next2 == zbVar3.w0 && (ybVar2 = zbVar3.y0.h) != null && ybVar2.o()) || (next2 == zbVar3.y0 && (ybVar = zbVar3.w0.h) != null && ybVar.o());
                zb.b H2 = zbVar3.H();
                zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
                if (H2 == bVar3 && !a3) {
                    if (zbVar3.H() == bVar3 && zbVar3.g0 >= 0 && zbVar3.f0 >= 0 && (zbVar3.l0() == 8 || (zbVar3.c0 == 0 && zbVar3.A() == 0.0f))) {
                        if (!zbVar3.B0() && !zbVar3.E0() && z3 && !zbVar3.B0()) {
                            g(i4, zbVar, bVar, zbVar3, z);
                        }
                    }
                } else if (!zbVar3.F0()) {
                    yb ybVar7 = zbVar3.w0;
                    if (next2 == ybVar7 && zbVar3.y0.h == null) {
                        int g3 = ybVar7.g() + f3;
                        zbVar3.q1(g3, zbVar3.m0() + g3);
                        b(i4, zbVar3, bVar, z);
                    } else {
                        yb ybVar8 = zbVar3.y0;
                        if (next2 == ybVar8 && ybVar7.h == null) {
                            int g4 = f3 - ybVar8.g();
                            zbVar3.q1(g4 - zbVar3.m0(), g4);
                            b(i4, zbVar3, bVar, z);
                        } else if (z3 && !zbVar3.B0()) {
                            f(i4, bVar, zbVar3, z);
                        }
                    }
                }
            }
        }
        zbVar.N0();
    }

    public static String c(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(g54.A);
        }
        sb.append("+-(" + i + ") ");
        return sb.toString();
    }

    private static void d(int i, vb vbVar, lc.b bVar, int i2, boolean z) {
        if (vbVar.m2()) {
            if (i2 == 0) {
                b(i + 1, vbVar, bVar, z);
            } else {
                k(i + 1, vbVar, bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01df, code lost:
        if (r6[r23].h.f == r0) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(ac acVar, i8 i8Var, int i, int i2, xb xbVar, boolean z, boolean z2, boolean z3) {
        int i3;
        int D;
        boolean z4;
        i8 i8Var2;
        zb zbVar;
        float g0;
        boolean z5;
        int D2;
        if (z3) {
            return false;
        }
        if (i == 0) {
            if (!acVar.G0()) {
                return false;
            }
        } else if (!acVar.H0()) {
            return false;
        }
        boolean O2 = acVar.O2();
        zb c2 = xbVar.c();
        zb g = xbVar.g();
        zb e2 = xbVar.e();
        zb i4 = xbVar.i();
        zb f2 = xbVar.f();
        yb ybVar = c2.E0[i2];
        int i5 = i2 + 1;
        yb ybVar2 = g.E0[i5];
        yb ybVar3 = ybVar.h;
        if (ybVar3 == null || ybVar2.h == null || !ybVar3.o() || !ybVar2.h.o() || e2 == null || i4 == null) {
            return false;
        }
        int g2 = e2.E0[i2].g() + ybVar.h.f();
        int f3 = ybVar2.h.f() - i4.E0[i5].g();
        int i6 = f3 - g2;
        if (i6 <= 0) {
            return false;
        }
        lc.a aVar = new lc.a();
        zb zbVar2 = c2;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            zb zbVar3 = null;
            if (z6) {
                zb zbVar4 = c2;
                if (i7 == 0 || i7 != i8 || i6 < i9) {
                    return false;
                }
                int i10 = i6 - i9;
                if (z) {
                    i10 /= i7 + 1;
                } else if (z2 && i7 > 2) {
                    i3 = 1;
                    i10 = (i10 / i7) - 1;
                    if (i7 != i3) {
                        if (i == 0) {
                            g0 = f2.E();
                        } else {
                            g0 = f2.g0();
                        }
                        int i11 = (int) ((i10 * g0) + g2 + 0.5f);
                        if (i == 0) {
                            e2.q1(i11, e2.m0() + i11);
                        } else {
                            e2.t1(i11, e2.D() + i11);
                        }
                        b(1, e2, acVar.G2(), O2);
                        return true;
                    } else if (!z) {
                        if (z2) {
                            if (i7 == 2) {
                                if (i == 0) {
                                    e2.q1(g2, e2.m0() + g2);
                                    i4.q1(f3 - i4.m0(), f3);
                                    b(1, e2, acVar.G2(), O2);
                                    b(1, i4, acVar.G2(), O2);
                                    return true;
                                }
                                e2.t1(g2, e2.D() + g2);
                                i4.t1(f3 - i4.D(), f3);
                                k(1, e2, acVar.G2());
                                k(1, i4, acVar.G2());
                                return true;
                            }
                            return false;
                        }
                        return true;
                    } else {
                        int i12 = g2 + i10;
                        zb zbVar5 = zbVar4;
                        boolean z7 = false;
                        ?? r2 = i3;
                        while (!z7) {
                            if (zbVar5.l0() == 8) {
                                if (i == 0) {
                                    zbVar5.q1(i12, i12);
                                    b(r2, zbVar5, acVar.G2(), O2);
                                } else {
                                    zbVar5.t1(i12, i12);
                                    k(r2, zbVar5, acVar.G2());
                                }
                                i8Var2 = i8Var;
                                z4 = false;
                            } else {
                                int g3 = zbVar5.E0[i2].g() + i12;
                                if (i == 0) {
                                    zbVar5.q1(g3, zbVar5.m0() + g3);
                                    b(1, zbVar5, acVar.G2(), O2);
                                    D = zbVar5.m0();
                                } else {
                                    zbVar5.t1(g3, zbVar5.D() + g3);
                                    k(1, zbVar5, acVar.G2());
                                    D = zbVar5.D();
                                }
                                i12 = zbVar5.E0[i5].g() + D + g3 + i10;
                                z4 = false;
                                i8Var2 = i8Var;
                            }
                            zbVar5.g(i8Var2, z4);
                            yb ybVar4 = zbVar5.E0[i5].h;
                            if (ybVar4 != null) {
                                zbVar = ybVar4.f;
                                yb[] ybVarArr = zbVar.E0;
                                if (ybVarArr[i2].h != null) {
                                }
                            }
                            zbVar = null;
                            if (zbVar != null) {
                                zbVar5 = zbVar;
                            } else {
                                z7 = true;
                            }
                            r2 = 1;
                        }
                        return r2;
                    }
                }
                i3 = 1;
                if (i7 != i3) {
                }
            } else if (!a(1, zbVar2)) {
                return false;
            } else {
                zb zbVar6 = c2;
                if (zbVar2.H0[i] == zb.b.MATCH_CONSTRAINT) {
                    return false;
                }
                if (zbVar2.F0()) {
                    z5 = z6;
                    ac.R2(1, zbVar2, acVar.G2(), aVar, lc.a.a);
                } else {
                    z5 = z6;
                }
                int g4 = zbVar2.E0[i2].g() + i9;
                if (i == 0) {
                    D2 = zbVar2.m0();
                } else {
                    D2 = zbVar2.D();
                }
                i9 = zbVar2.E0[i5].g() + D2 + g4;
                i8++;
                if (zbVar2.l0() != 8) {
                    i7++;
                }
                yb ybVar5 = zbVar2.E0[i5].h;
                if (ybVar5 != null) {
                    zb zbVar7 = ybVar5.f;
                    yb[] ybVarArr2 = zbVar7.E0;
                    if (ybVarArr2[i2].h != null && ybVarArr2[i2].h.f == zbVar2) {
                        zbVar3 = zbVar7;
                    }
                }
                if (zbVar3 != null) {
                    zbVar2 = zbVar3;
                    z6 = z5;
                } else {
                    z6 = true;
                }
                c2 = zbVar6;
            }
        }
    }

    private static void f(int i, lc.b bVar, zb zbVar, boolean z) {
        float E = zbVar.E();
        int f2 = zbVar.w0.h.f();
        int f3 = zbVar.y0.h.f();
        int g = zbVar.w0.g() + f2;
        int g2 = f3 - zbVar.y0.g();
        if (f2 == f3) {
            E = 0.5f;
        } else {
            f2 = g;
            f3 = g2;
        }
        int m0 = zbVar.m0();
        int i2 = (f3 - f2) - m0;
        if (f2 > f3) {
            i2 = (f2 - f3) - m0;
        }
        int i3 = ((int) (i2 > 0 ? (E * i2) + 0.5f : E * i2)) + f2;
        int i4 = i3 + m0;
        if (f2 > f3) {
            i4 = i3 - m0;
        }
        zbVar.q1(i3, i4);
        b(i + 1, zbVar, bVar, z);
    }

    private static void g(int i, zb zbVar, lc.b bVar, zb zbVar2, boolean z) {
        int m0;
        float E = zbVar2.E();
        int g = zbVar2.w0.g() + zbVar2.w0.h.f();
        int f2 = zbVar2.y0.h.f() - zbVar2.y0.g();
        if (f2 >= g) {
            int m02 = zbVar2.m0();
            if (zbVar2.l0() != 8) {
                int i2 = zbVar2.c0;
                if (i2 == 2) {
                    if (zbVar instanceof ac) {
                        m0 = zbVar.m0();
                    } else {
                        m0 = zbVar.U().m0();
                    }
                    m02 = (int) (zbVar2.E() * 0.5f * m0);
                } else if (i2 == 0) {
                    m02 = f2 - g;
                }
                m02 = Math.max(zbVar2.f0, m02);
                int i3 = zbVar2.g0;
                if (i3 > 0) {
                    m02 = Math.min(i3, m02);
                }
            }
            int i4 = g + ((int) ((E * ((f2 - g) - m02)) + 0.5f));
            zbVar2.q1(i4, m02 + i4);
            b(i + 1, zbVar2, bVar, z);
        }
    }

    private static void h(int i, lc.b bVar, zb zbVar) {
        float g0 = zbVar.g0();
        int f2 = zbVar.x0.h.f();
        int f3 = zbVar.z0.h.f();
        int g = zbVar.x0.g() + f2;
        int g2 = f3 - zbVar.z0.g();
        if (f2 == f3) {
            g0 = 0.5f;
        } else {
            f2 = g;
            f3 = g2;
        }
        int D = zbVar.D();
        int i2 = (f3 - f2) - D;
        if (f2 > f3) {
            i2 = (f2 - f3) - D;
        }
        int i3 = (int) (i2 > 0 ? (g0 * i2) + 0.5f : g0 * i2);
        int i4 = f2 + i3;
        int i5 = i4 + D;
        if (f2 > f3) {
            i4 = f2 - i3;
            i5 = i4 - D;
        }
        zbVar.t1(i4, i5);
        k(i + 1, zbVar, bVar);
    }

    private static void i(int i, zb zbVar, lc.b bVar, zb zbVar2) {
        int D;
        float g0 = zbVar2.g0();
        int g = zbVar2.x0.g() + zbVar2.x0.h.f();
        int f2 = zbVar2.z0.h.f() - zbVar2.z0.g();
        if (f2 >= g) {
            int D2 = zbVar2.D();
            if (zbVar2.l0() != 8) {
                int i2 = zbVar2.d0;
                if (i2 == 2) {
                    if (zbVar instanceof ac) {
                        D = zbVar.D();
                    } else {
                        D = zbVar.U().D();
                    }
                    D2 = (int) (g0 * 0.5f * D);
                } else if (i2 == 0) {
                    D2 = f2 - g;
                }
                D2 = Math.max(zbVar2.i0, D2);
                int i3 = zbVar2.j0;
                if (i3 > 0) {
                    D2 = Math.min(i3, D2);
                }
            }
            int i4 = g + ((int) ((g0 * ((f2 - g) - D2)) + 0.5f));
            zbVar2.t1(i4, D2 + i4);
            k(i + 1, zbVar2, bVar);
        }
    }

    public static void j(ac acVar, lc.b bVar) {
        zb.b H = acVar.H();
        zb.b j0 = acVar.j0();
        e = 0;
        f = 0;
        acVar.V0();
        ArrayList<zb> l2 = acVar.l2();
        int size = l2.size();
        for (int i = 0; i < size; i++) {
            l2.get(i).V0();
        }
        boolean O2 = acVar.O2();
        if (H == zb.b.FIXED) {
            acVar.q1(0, acVar.m0());
        } else {
            acVar.r1(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            zb zbVar = l2.get(i2);
            if (zbVar instanceof cc) {
                cc ccVar = (cc) zbVar;
                if (ccVar.m2() == 1) {
                    if (ccVar.n2() != -1) {
                        ccVar.v2(ccVar.n2());
                    } else if (ccVar.p2() != -1 && acVar.G0()) {
                        ccVar.v2(acVar.m0() - ccVar.p2());
                    } else if (acVar.G0()) {
                        ccVar.v2((int) ((ccVar.q2() * acVar.m0()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((zbVar instanceof vb) && ((vb) zbVar).r2() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                zb zbVar2 = l2.get(i3);
                if (zbVar2 instanceof cc) {
                    cc ccVar2 = (cc) zbVar2;
                    if (ccVar2.m2() == 1) {
                        b(0, ccVar2, bVar, O2);
                    }
                }
            }
        }
        b(0, acVar, bVar, O2);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                zb zbVar3 = l2.get(i4);
                if (zbVar3 instanceof vb) {
                    vb vbVar = (vb) zbVar3;
                    if (vbVar.r2() == 0) {
                        d(0, vbVar, bVar, 0, O2);
                    }
                }
            }
        }
        if (j0 == zb.b.FIXED) {
            acVar.t1(0, acVar.D());
        } else {
            acVar.s1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            zb zbVar4 = l2.get(i5);
            if (zbVar4 instanceof cc) {
                cc ccVar3 = (cc) zbVar4;
                if (ccVar3.m2() == 0) {
                    if (ccVar3.n2() != -1) {
                        ccVar3.v2(ccVar3.n2());
                    } else if (ccVar3.p2() != -1 && acVar.H0()) {
                        ccVar3.v2(acVar.D() - ccVar3.p2());
                    } else if (acVar.H0()) {
                        ccVar3.v2((int) ((ccVar3.q2() * acVar.D()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((zbVar4 instanceof vb) && ((vb) zbVar4).r2() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                zb zbVar5 = l2.get(i6);
                if (zbVar5 instanceof cc) {
                    cc ccVar4 = (cc) zbVar5;
                    if (ccVar4.m2() == 0) {
                        k(1, ccVar4, bVar);
                    }
                }
            }
        }
        k(0, acVar, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                zb zbVar6 = l2.get(i7);
                if (zbVar6 instanceof vb) {
                    vb vbVar2 = (vb) zbVar6;
                    if (vbVar2.r2() == 1) {
                        d(0, vbVar2, bVar, 1, O2);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            zb zbVar7 = l2.get(i8);
            if (zbVar7.F0() && a(0, zbVar7)) {
                ac.R2(0, zbVar7, bVar, c, lc.a.a);
                if (zbVar7 instanceof cc) {
                    if (((cc) zbVar7).m2() == 0) {
                        k(0, zbVar7, bVar);
                    } else {
                        b(0, zbVar7, bVar, O2);
                    }
                } else {
                    b(0, zbVar7, bVar, O2);
                    k(0, zbVar7, bVar);
                }
            }
        }
    }

    private static void k(int i, zb zbVar, lc.b bVar) {
        yb ybVar;
        yb ybVar2;
        yb ybVar3;
        yb ybVar4;
        if (zbVar.L0()) {
            return;
        }
        f++;
        if (!(zbVar instanceof ac) && zbVar.F0()) {
            int i2 = i + 1;
            if (a(i2, zbVar)) {
                ac.R2(i2, zbVar, bVar, new lc.a(), lc.a.a);
            }
        }
        yb r = zbVar.r(yb.b.TOP);
        yb r2 = zbVar.r(yb.b.BOTTOM);
        int f2 = r.f();
        int f3 = r2.f();
        if (r.e() != null && r.o()) {
            Iterator<yb> it = r.e().iterator();
            while (it.hasNext()) {
                yb next = it.next();
                zb zbVar2 = next.f;
                int i3 = i + 1;
                boolean a2 = a(i3, zbVar2);
                if (zbVar2.F0() && a2) {
                    ac.R2(i3, zbVar2, bVar, new lc.a(), lc.a.a);
                }
                boolean z = (next == zbVar2.x0 && (ybVar4 = zbVar2.z0.h) != null && ybVar4.o()) || (next == zbVar2.z0 && (ybVar3 = zbVar2.x0.h) != null && ybVar3.o());
                zb.b j0 = zbVar2.j0();
                zb.b bVar2 = zb.b.MATCH_CONSTRAINT;
                if (j0 == bVar2 && !a2) {
                    if (zbVar2.j0() == bVar2 && zbVar2.j0 >= 0 && zbVar2.i0 >= 0 && (zbVar2.l0() == 8 || (zbVar2.d0 == 0 && zbVar2.A() == 0.0f))) {
                        if (!zbVar2.D0() && !zbVar2.E0() && z && !zbVar2.D0()) {
                            i(i3, zbVar, bVar, zbVar2);
                        }
                    }
                } else if (!zbVar2.F0()) {
                    yb ybVar5 = zbVar2.x0;
                    if (next == ybVar5 && zbVar2.z0.h == null) {
                        int g = ybVar5.g() + f2;
                        zbVar2.t1(g, zbVar2.D() + g);
                        k(i3, zbVar2, bVar);
                    } else {
                        yb ybVar6 = zbVar2.z0;
                        if (next == ybVar6 && ybVar5.h == null) {
                            int g2 = f2 - ybVar6.g();
                            zbVar2.t1(g2 - zbVar2.D(), g2);
                            k(i3, zbVar2, bVar);
                        } else if (z && !zbVar2.D0()) {
                            h(i3, bVar, zbVar2);
                        }
                    }
                }
            }
        }
        if (zbVar instanceof cc) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            Iterator<yb> it2 = r2.e().iterator();
            while (it2.hasNext()) {
                yb next2 = it2.next();
                zb zbVar3 = next2.f;
                int i4 = i + 1;
                boolean a3 = a(i4, zbVar3);
                if (zbVar3.F0() && a3) {
                    ac.R2(i4, zbVar3, bVar, new lc.a(), lc.a.a);
                }
                boolean z2 = (next2 == zbVar3.x0 && (ybVar2 = zbVar3.z0.h) != null && ybVar2.o()) || (next2 == zbVar3.z0 && (ybVar = zbVar3.x0.h) != null && ybVar.o());
                zb.b j02 = zbVar3.j0();
                zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
                if (j02 == bVar3 && !a3) {
                    if (zbVar3.j0() == bVar3 && zbVar3.j0 >= 0 && zbVar3.i0 >= 0 && (zbVar3.l0() == 8 || (zbVar3.d0 == 0 && zbVar3.A() == 0.0f))) {
                        if (!zbVar3.D0() && !zbVar3.E0() && z2 && !zbVar3.D0()) {
                            i(i4, zbVar, bVar, zbVar3);
                        }
                    }
                } else if (!zbVar3.F0()) {
                    yb ybVar7 = zbVar3.x0;
                    if (next2 == ybVar7 && zbVar3.z0.h == null) {
                        int g3 = ybVar7.g() + f3;
                        zbVar3.t1(g3, zbVar3.D() + g3);
                        k(i4, zbVar3, bVar);
                    } else {
                        yb ybVar8 = zbVar3.z0;
                        if (next2 == ybVar8 && ybVar7.h == null) {
                            int g4 = f3 - ybVar8.g();
                            zbVar3.t1(g4 - zbVar3.D(), g4);
                            k(i4, zbVar3, bVar);
                        } else if (z2 && !zbVar3.D0()) {
                            h(i4, bVar, zbVar3);
                        }
                    }
                }
            }
        }
        yb r3 = zbVar.r(yb.b.BASELINE);
        if (r3.e() != null && r3.o()) {
            int f4 = r3.f();
            Iterator<yb> it3 = r3.e().iterator();
            while (it3.hasNext()) {
                yb next3 = it3.next();
                zb zbVar4 = next3.f;
                int i5 = i + 1;
                boolean a4 = a(i5, zbVar4);
                if (zbVar4.F0() && a4) {
                    ac.R2(i5, zbVar4, bVar, new lc.a(), lc.a.a);
                }
                if (zbVar4.j0() != zb.b.MATCH_CONSTRAINT || a4) {
                    if (!zbVar4.F0() && next3 == zbVar4.A0) {
                        zbVar4.o1(next3.g() + f4);
                        k(i5, zbVar4, bVar);
                    }
                }
            }
        }
        zbVar.O0();
    }
}