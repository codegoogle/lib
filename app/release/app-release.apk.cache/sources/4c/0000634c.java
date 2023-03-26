package com.p7700g.p99005;

import com.p7700g.p99005.zb;
import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class wb {
    private static final boolean a = false;
    public static final boolean b = false;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0530 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(ac acVar, i8 i8Var, int i, int i2, xb xbVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList<zb> arrayList;
        zb zbVar;
        yb ybVar;
        yb ybVar2;
        yb ybVar3;
        int i3;
        zb zbVar2;
        int i4;
        zb zbVar3;
        yb ybVar4;
        m8 m8Var;
        m8 m8Var2;
        zb zbVar4;
        yb ybVar5;
        zb zbVar5;
        m8 m8Var3;
        zb zbVar6;
        zb zbVar7;
        m8 m8Var4;
        float f;
        int size;
        int i5;
        ArrayList<zb> arrayList2;
        int i6;
        boolean z4;
        boolean z5;
        zb zbVar8;
        zb zbVar9;
        int i7;
        int i8 = i;
        zb zbVar10 = xbVar.a;
        zb zbVar11 = xbVar.c;
        zb zbVar12 = xbVar.b;
        zb zbVar13 = xbVar.d;
        zb zbVar14 = xbVar.e;
        float f2 = xbVar.k;
        boolean z6 = acVar.H0[i8] == zb.b.WRAP_CONTENT;
        if (i8 == 0) {
            int i9 = zbVar14.p1;
            z = i9 == 0;
            z2 = i9 == 1;
        } else {
            int i10 = zbVar14.q1;
            z = i10 == 0;
            z2 = i10 == 1;
        }
        zb zbVar15 = zbVar10;
        boolean z7 = false;
        while (true) {
            if (z7) {
                break;
            }
            yb ybVar6 = zbVar15.E0[i2];
            int i11 = z3 ? 1 : 4;
            int g = ybVar6.g();
            float f3 = f2;
            zb.b bVar = zbVar15.H0[i8];
            boolean z8 = z7;
            zb.b bVar2 = zb.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && zbVar15.e0[i8] == 0) {
                z4 = z;
                z5 = true;
            } else {
                z4 = z;
                z5 = false;
            }
            yb ybVar7 = ybVar6.h;
            if (ybVar7 != null && zbVar15 != zbVar10) {
                g = ybVar7.g() + g;
            }
            int i12 = g;
            if (!z3 || zbVar15 == zbVar10 || zbVar15 == zbVar12) {
                zbVar8 = zbVar14;
            } else {
                zbVar8 = zbVar14;
                i11 = 8;
            }
            yb ybVar8 = ybVar6.h;
            if (ybVar8 != null) {
                if (zbVar15 == zbVar12) {
                    zbVar9 = zbVar10;
                    i8Var.i(ybVar6.k, ybVar8.k, i12, 6);
                } else {
                    zbVar9 = zbVar10;
                    i8Var.i(ybVar6.k, ybVar8.k, i12, 8);
                }
                if (z5 && !z3) {
                    i11 = 5;
                }
                i8Var.e(ybVar6.k, ybVar6.h.k, i12, (zbVar15 == zbVar12 && z3 && zbVar15.A0(i8)) ? 5 : i11);
            } else {
                zbVar9 = zbVar10;
            }
            if (z6) {
                if (zbVar15.l0() == 8 || zbVar15.H0[i8] != bVar2) {
                    i7 = 0;
                } else {
                    yb[] ybVarArr = zbVar15.E0;
                    i7 = 0;
                    i8Var.i(ybVarArr[i2 + 1].k, ybVarArr[i2].k, 0, 5);
                }
                i8Var.i(zbVar15.E0[i2].k, acVar.E0[i2].k, i7, 8);
            }
            yb ybVar9 = zbVar15.E0[i2 + 1].h;
            if (ybVar9 != null) {
                zb zbVar16 = ybVar9.f;
                yb[] ybVarArr2 = zbVar16.E0;
                if (ybVarArr2[i2].h != null && ybVarArr2[i2].h.f == zbVar15) {
                    r22 = zbVar16;
                }
            }
            if (r22 != null) {
                zbVar15 = r22;
                z7 = z8;
            } else {
                z7 = true;
            }
            zbVar14 = zbVar8;
            f2 = f3;
            z = z4;
            zbVar10 = zbVar9;
        }
        zb zbVar17 = zbVar14;
        float f4 = f2;
        zb zbVar18 = zbVar10;
        boolean z9 = z;
        if (zbVar13 != null) {
            int i13 = i2 + 1;
            if (zbVar11.E0[i13].h != null) {
                yb ybVar10 = zbVar13.E0[i13];
                if ((zbVar13.H0[i8] == zb.b.MATCH_CONSTRAINT && zbVar13.e0[i8] == 0) && !z3) {
                    yb ybVar11 = ybVar10.h;
                    if (ybVar11.f == acVar) {
                        i8Var.e(ybVar10.k, ybVar11.k, -ybVar10.g(), 5);
                        i8Var.k(ybVar10.k, zbVar11.E0[i13].h.k, -ybVar10.g(), 6);
                        if (z6) {
                            int i14 = i2 + 1;
                            m8 m8Var5 = acVar.E0[i14].k;
                            yb[] ybVarArr3 = zbVar11.E0;
                            i8Var.i(m8Var5, ybVarArr3[i14].k, ybVarArr3[i14].g(), 8);
                        }
                        arrayList = xbVar.h;
                        if (arrayList != null && (size = arrayList.size()) > 1) {
                            float f5 = (xbVar.r || xbVar.t) ? f4 : xbVar.j;
                            float f6 = 0.0f;
                            zb zbVar19 = null;
                            i5 = 0;
                            float f7 = 0.0f;
                            while (i5 < size) {
                                zb zbVar20 = arrayList.get(i5);
                                float f8 = zbVar20.t1[i8];
                                if (f8 < f6) {
                                    if (xbVar.t) {
                                        yb[] ybVarArr4 = zbVar20.E0;
                                        i8Var.e(ybVarArr4[i2 + 1].k, ybVarArr4[i2].k, 0, 4);
                                        arrayList2 = arrayList;
                                        i6 = size;
                                        i5++;
                                        size = i6;
                                        arrayList = arrayList2;
                                        f6 = 0.0f;
                                    } else {
                                        f8 = 1.0f;
                                        f6 = 0.0f;
                                    }
                                }
                                if (f8 == f6) {
                                    yb[] ybVarArr5 = zbVar20.E0;
                                    i8Var.e(ybVarArr5[i2 + 1].k, ybVarArr5[i2].k, 0, 8);
                                    arrayList2 = arrayList;
                                    i6 = size;
                                    i5++;
                                    size = i6;
                                    arrayList = arrayList2;
                                    f6 = 0.0f;
                                } else {
                                    if (zbVar19 != null) {
                                        yb[] ybVarArr6 = zbVar19.E0;
                                        m8 m8Var6 = ybVarArr6[i2].k;
                                        int i15 = i2 + 1;
                                        m8 m8Var7 = ybVarArr6[i15].k;
                                        yb[] ybVarArr7 = zbVar20.E0;
                                        arrayList2 = arrayList;
                                        m8 m8Var8 = ybVarArr7[i2].k;
                                        m8 m8Var9 = ybVarArr7[i15].k;
                                        i6 = size;
                                        f8 v = i8Var.v();
                                        v.p(f7, f5, f8, m8Var6, m8Var7, m8Var8, m8Var9);
                                        i8Var.d(v);
                                    } else {
                                        arrayList2 = arrayList;
                                        i6 = size;
                                    }
                                    f7 = f8;
                                    zbVar19 = zbVar20;
                                    i5++;
                                    size = i6;
                                    arrayList = arrayList2;
                                    f6 = 0.0f;
                                }
                            }
                        }
                        if (zbVar12 == null && (zbVar12 == zbVar13 || z3)) {
                            yb ybVar12 = zbVar18.E0[i2];
                            int i16 = i2 + 1;
                            yb ybVar13 = zbVar11.E0[i16];
                            yb ybVar14 = ybVar12.h;
                            m8 m8Var10 = ybVar14 != null ? ybVar14.k : null;
                            yb ybVar15 = ybVar13.h;
                            m8 m8Var11 = ybVar15 != null ? ybVar15.k : null;
                            yb ybVar16 = zbVar12.E0[i2];
                            if (zbVar13 != null) {
                                ybVar13 = zbVar13.E0[i16];
                            }
                            if (m8Var10 != null && m8Var11 != null) {
                                if (i8 == 0) {
                                    f = zbVar17.W0;
                                } else {
                                    f = zbVar17.X0;
                                }
                                i8Var.c(ybVar16.k, m8Var10, ybVar16.g(), f, m8Var11, ybVar13.k, ybVar13.g(), 7);
                            }
                        } else if (z9 || zbVar12 == null) {
                            int i17 = 8;
                            if (z2 && zbVar12 != null) {
                                int i18 = xbVar.j;
                                boolean z10 = i18 <= 0 && xbVar.i == i18;
                                zb zbVar21 = zbVar12;
                                zbVar = zbVar21;
                                while (zbVar != null) {
                                    zb zbVar22 = zbVar.v1[i8];
                                    while (zbVar22 != null && zbVar22.l0() == i17) {
                                        zbVar22 = zbVar22.v1[i8];
                                    }
                                    if (zbVar == zbVar12 || zbVar == zbVar13 || zbVar22 == null) {
                                        zbVar2 = zbVar21;
                                        i4 = 8;
                                    } else {
                                        zb zbVar23 = zbVar22 == zbVar13 ? null : zbVar22;
                                        yb ybVar17 = zbVar.E0[i2];
                                        m8 m8Var12 = ybVar17.k;
                                        yb ybVar18 = ybVar17.h;
                                        if (ybVar18 != null) {
                                            m8 m8Var13 = ybVar18.k;
                                        }
                                        int i19 = i2 + 1;
                                        m8 m8Var14 = zbVar21.E0[i19].k;
                                        int g2 = ybVar17.g();
                                        int g3 = zbVar.E0[i19].g();
                                        if (zbVar23 != null) {
                                            ybVar4 = zbVar23.E0[i2];
                                            m8 m8Var15 = ybVar4.k;
                                            zbVar3 = zbVar23;
                                            yb ybVar19 = ybVar4.h;
                                            m8Var2 = ybVar19 != null ? ybVar19.k : null;
                                            m8Var = m8Var15;
                                        } else {
                                            zbVar3 = zbVar23;
                                            ybVar4 = zbVar13.E0[i2];
                                            m8Var = ybVar4 != null ? ybVar4.k : null;
                                            m8Var2 = zbVar.E0[i19].k;
                                        }
                                        int g4 = ybVar4 != null ? ybVar4.g() + g3 : g3;
                                        int g5 = zbVar21.E0[i19].g() + g2;
                                        int i20 = z10 ? 8 : 4;
                                        if (m8Var12 == null || m8Var14 == null || m8Var == null || m8Var2 == null) {
                                            zbVar4 = zbVar3;
                                            zbVar2 = zbVar21;
                                            i4 = 8;
                                        } else {
                                            zbVar4 = zbVar3;
                                            zbVar2 = zbVar21;
                                            i4 = 8;
                                            i8Var.c(m8Var12, m8Var14, g5, 0.5f, m8Var, m8Var2, g4, i20);
                                        }
                                        zbVar22 = zbVar4;
                                    }
                                    zbVar21 = zbVar.l0() != i4 ? zbVar : zbVar2;
                                    i8 = i;
                                    zbVar = zbVar22;
                                    i17 = 8;
                                }
                                yb ybVar20 = zbVar12.E0[i2];
                                ybVar = zbVar18.E0[i2].h;
                                int i21 = i2 + 1;
                                ybVar2 = zbVar13.E0[i21];
                                ybVar3 = zbVar11.E0[i21].h;
                                if (ybVar != null) {
                                    i3 = 5;
                                } else if (zbVar12 != zbVar13) {
                                    i3 = 5;
                                    i8Var.e(ybVar20.k, ybVar.k, ybVar20.g(), 5);
                                } else {
                                    i3 = 5;
                                    if (ybVar3 != null) {
                                        i8Var.c(ybVar20.k, ybVar.k, ybVar20.g(), 0.5f, ybVar2.k, ybVar3.k, ybVar2.g(), 5);
                                    }
                                }
                                if (ybVar3 != null && zbVar12 != zbVar13) {
                                    i8Var.e(ybVar2.k, ybVar3.k, -ybVar2.g(), i3);
                                }
                            }
                        } else {
                            int i22 = xbVar.j;
                            boolean z11 = i22 > 0 && xbVar.i == i22;
                            zb zbVar24 = zbVar12;
                            zb zbVar25 = zbVar24;
                            while (zbVar25 != null) {
                                zb zbVar26 = zbVar25.v1[i8];
                                while (zbVar26 != null && zbVar26.l0() == 8) {
                                    zbVar26 = zbVar26.v1[i8];
                                }
                                if (zbVar26 != null || zbVar25 == zbVar13) {
                                    yb ybVar21 = zbVar25.E0[i2];
                                    m8 m8Var16 = ybVar21.k;
                                    yb ybVar22 = ybVar21.h;
                                    m8 m8Var17 = ybVar22 != null ? ybVar22.k : null;
                                    if (zbVar24 != zbVar25) {
                                        m8Var17 = zbVar24.E0[i2 + 1].k;
                                    } else if (zbVar25 == zbVar12) {
                                        yb[] ybVarArr8 = zbVar18.E0;
                                        m8Var17 = ybVarArr8[i2].h != null ? ybVarArr8[i2].h.k : null;
                                    }
                                    int g6 = ybVar21.g();
                                    int i23 = i2 + 1;
                                    int g7 = zbVar25.E0[i23].g();
                                    if (zbVar26 != null) {
                                        ybVar5 = zbVar26.E0[i2];
                                        m8Var3 = ybVar5.k;
                                    } else {
                                        ybVar5 = zbVar11.E0[i23].h;
                                        if (ybVar5 != null) {
                                            m8Var3 = ybVar5.k;
                                        } else {
                                            zbVar5 = zbVar26;
                                            m8Var3 = null;
                                            m8 m8Var18 = zbVar25.E0[i23].k;
                                            if (ybVar5 != null) {
                                                g7 += ybVar5.g();
                                            }
                                            int g8 = zbVar24.E0[i23].g() + g6;
                                            if (m8Var16 != null || m8Var17 == null || m8Var3 == null || m8Var18 == null) {
                                                zbVar6 = zbVar5;
                                            } else {
                                                if (zbVar25 == zbVar12) {
                                                    g8 = zbVar12.E0[i2].g();
                                                }
                                                zbVar6 = zbVar5;
                                                zbVar7 = zbVar24;
                                                i8Var.c(m8Var16, m8Var17, g8, 0.5f, m8Var3, m8Var18, zbVar25 == zbVar13 ? zbVar13.E0[i23].g() : g7, z11 ? 8 : 5);
                                                if (zbVar25.l0() != 8) {
                                                    zbVar25 = zbVar7;
                                                }
                                                zbVar24 = zbVar25;
                                                zbVar25 = zbVar6;
                                            }
                                        }
                                    }
                                    zbVar5 = zbVar26;
                                    m8 m8Var182 = zbVar25.E0[i23].k;
                                    if (ybVar5 != null) {
                                    }
                                    int g82 = zbVar24.E0[i23].g() + g6;
                                    if (m8Var16 != null) {
                                    }
                                    zbVar6 = zbVar5;
                                } else {
                                    zbVar6 = zbVar26;
                                }
                                zbVar7 = zbVar24;
                                if (zbVar25.l0() != 8) {
                                }
                                zbVar24 = zbVar25;
                                zbVar25 = zbVar6;
                            }
                        }
                        if ((z9 && !z2) || zbVar12 == null || zbVar12 == zbVar13) {
                            return;
                        }
                        yb[] ybVarArr9 = zbVar12.E0;
                        yb ybVar23 = ybVarArr9[i2];
                        if (zbVar13 == null) {
                            zbVar13 = zbVar12;
                        }
                        int i24 = i2 + 1;
                        yb ybVar24 = zbVar13.E0[i24];
                        yb ybVar25 = ybVar23.h;
                        m8Var4 = ybVar25 != null ? ybVar25.k : null;
                        yb ybVar26 = ybVar24.h;
                        m8 m8Var19 = ybVar26 != null ? ybVar26.k : null;
                        if (zbVar11 != zbVar13) {
                            yb ybVar27 = zbVar11.E0[i24].h;
                            m8Var19 = ybVar27 != null ? ybVar27.k : null;
                        }
                        if (zbVar12 == zbVar13) {
                            ybVar23 = ybVarArr9[i2];
                            ybVar24 = ybVarArr9[i24];
                        }
                        if (m8Var4 == null || m8Var19 == null) {
                            return;
                        }
                        i8Var.c(ybVar23.k, m8Var4, ybVar23.g(), 0.5f, m8Var19, ybVar24.k, zbVar13.E0[i24].g(), 5);
                        return;
                    }
                }
                if (z3) {
                    yb ybVar28 = ybVar10.h;
                    if (ybVar28.f == acVar) {
                        i8Var.e(ybVar10.k, ybVar28.k, -ybVar10.g(), 4);
                    }
                }
                i8Var.k(ybVar10.k, zbVar11.E0[i13].h.k, -ybVar10.g(), 6);
                if (z6) {
                }
                arrayList = xbVar.h;
                if (arrayList != null) {
                    if (xbVar.r) {
                    }
                    float f62 = 0.0f;
                    zb zbVar192 = null;
                    i5 = 0;
                    float f72 = 0.0f;
                    while (i5 < size) {
                    }
                }
                if (zbVar12 == null) {
                }
                if (z9) {
                }
                int i172 = 8;
                if (z2) {
                    int i182 = xbVar.j;
                    if (i182 <= 0) {
                    }
                    zb zbVar212 = zbVar12;
                    zbVar = zbVar212;
                    while (zbVar != null) {
                    }
                    yb ybVar202 = zbVar12.E0[i2];
                    ybVar = zbVar18.E0[i2].h;
                    int i212 = i2 + 1;
                    ybVar2 = zbVar13.E0[i212];
                    ybVar3 = zbVar11.E0[i212].h;
                    if (ybVar != null) {
                    }
                    if (ybVar3 != null) {
                        i8Var.e(ybVar2.k, ybVar3.k, -ybVar2.g(), i3);
                    }
                }
                if (z9) {
                }
                yb[] ybVarArr92 = zbVar12.E0;
                yb ybVar232 = ybVarArr92[i2];
                if (zbVar13 == null) {
                }
                int i242 = i2 + 1;
                yb ybVar242 = zbVar13.E0[i242];
                yb ybVar252 = ybVar232.h;
                if (ybVar252 != null) {
                }
                yb ybVar262 = ybVar242.h;
                if (ybVar262 != null) {
                }
                if (zbVar11 != zbVar13) {
                }
                if (zbVar12 == zbVar13) {
                }
                if (m8Var4 == null) {
                    return;
                }
                return;
            }
        }
        if (z6) {
        }
        arrayList = xbVar.h;
        if (arrayList != null) {
        }
        if (zbVar12 == null) {
        }
        if (z9) {
        }
        int i1722 = 8;
        if (z2) {
        }
        if (z9) {
        }
        yb[] ybVarArr922 = zbVar12.E0;
        yb ybVar2322 = ybVarArr922[i2];
        if (zbVar13 == null) {
        }
        int i2422 = i2 + 1;
        yb ybVar2422 = zbVar13.E0[i2422];
        yb ybVar2522 = ybVar2322.h;
        if (ybVar2522 != null) {
        }
        yb ybVar2622 = ybVar2422.h;
        if (ybVar2622 != null) {
        }
        if (zbVar11 != zbVar13) {
        }
        if (zbVar12 == zbVar13) {
        }
        if (m8Var4 == null) {
        }
    }

    public static void b(ac acVar, i8 i8Var, ArrayList<zb> arrayList, int i) {
        xb[] xbVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i2 = acVar.R1;
            xbVarArr = acVar.U1;
            i3 = 0;
        } else {
            int i4 = acVar.S1;
            xbVarArr = acVar.T1;
            i2 = i4;
            i3 = 2;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            xb xbVar = xbVarArr[i5];
            xbVar.a();
            if (arrayList == null || arrayList.contains(xbVar.a)) {
                a(acVar, i8Var, i, i3, xbVar);
            }
        }
    }
}