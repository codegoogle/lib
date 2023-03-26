package com.p7700g.p99005;

import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public class bc extends ic {
    public static final int P1 = 0;
    public static final int Q1 = 1;
    public static final int R1 = 2;
    public static final int S1 = 0;
    public static final int T1 = 1;
    public static final int U1 = 2;
    public static final int V1 = 3;
    public static final int W1 = 0;
    public static final int X1 = 1;
    public static final int Y1 = 2;
    public static final int Z1 = 3;
    private zb[] x2;
    private int a2 = -1;
    private int b2 = -1;
    private int c2 = -1;
    private int d2 = -1;
    private int e2 = -1;
    private int f2 = -1;
    private float g2 = 0.5f;
    private float h2 = 0.5f;
    private float i2 = 0.5f;
    private float j2 = 0.5f;
    private float k2 = 0.5f;
    private float l2 = 0.5f;
    private int m2 = 0;
    private int n2 = 0;
    private int o2 = 2;
    private int p2 = 2;
    private int q2 = 0;
    private int r2 = -1;
    private int s2 = 0;
    private ArrayList<a> t2 = new ArrayList<>();
    private zb[] u2 = null;
    private zb[] v2 = null;
    private int[] w2 = null;
    private int y2 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {
        private int a;
        private yb d;
        private yb e;
        private yb f;
        private yb g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int q;
        private zb b = null;
        public int c = 0;
        private int l = 0;
        private int m = 0;
        private int n = 0;
        private int o = 0;
        private int p = 0;

        public a(int i, yb ybVar, yb ybVar2, yb ybVar3, yb ybVar4, int i2) {
            this.a = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = ybVar;
            this.e = ybVar2;
            this.f = ybVar3;
            this.g = ybVar4;
            this.h = bc.this.s2();
            this.i = bc.this.u2();
            this.j = bc.this.t2();
            this.k = bc.this.r2();
            this.q = i2;
        }

        private void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < bc.this.y2; i2++) {
                zb zbVar = bc.this.x2[this.n + i2];
                if (this.a != 0) {
                    int f3 = bc.this.f3(zbVar, this.q);
                    int e3 = bc.this.e3(zbVar, this.q);
                    int i3 = bc.this.n2;
                    if (zbVar.l0() == 8) {
                        i3 = 0;
                    }
                    this.m = e3 + i3 + this.m;
                    if (this.b == null || this.c < f3) {
                        this.b = zbVar;
                        this.c = f3;
                        this.l = f3;
                    }
                } else {
                    int m0 = zbVar.m0();
                    int i4 = bc.this.m2;
                    if (zbVar.l0() == 8) {
                        i4 = 0;
                    }
                    this.l = m0 + i4 + this.l;
                    int e32 = bc.this.e3(zbVar, this.q);
                    if (this.b == null || this.c < e32) {
                        this.b = zbVar;
                        this.c = e32;
                        this.m = e32;
                    }
                }
            }
        }

        public void b(zb zbVar) {
            if (this.a == 0) {
                int f3 = bc.this.f3(zbVar, this.q);
                if (zbVar.H() == zb.b.MATCH_CONSTRAINT) {
                    this.p++;
                    f3 = 0;
                }
                this.l = f3 + (zbVar.l0() != 8 ? bc.this.m2 : 0) + this.l;
                int e3 = bc.this.e3(zbVar, this.q);
                if (this.b == null || this.c < e3) {
                    this.b = zbVar;
                    this.c = e3;
                    this.m = e3;
                }
            } else {
                int f32 = bc.this.f3(zbVar, this.q);
                int e32 = bc.this.e3(zbVar, this.q);
                if (zbVar.j0() == zb.b.MATCH_CONSTRAINT) {
                    this.p++;
                    e32 = 0;
                }
                this.m = e32 + (zbVar.l0() != 8 ? bc.this.n2 : 0) + this.m;
                if (this.b == null || this.c < f32) {
                    this.b = zbVar;
                    this.c = f32;
                    this.l = f32;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            zb zbVar;
            float f;
            float f2;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < bc.this.y2; i3++) {
                zb zbVar2 = bc.this.x2[this.n + i3];
                if (zbVar2 != null) {
                    zbVar2.U0();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= bc.this.y2) {
                    break;
                }
                zb zbVar3 = bc.this.x2[this.n + i7];
                if (zbVar3 != null && zbVar3.l0() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            zb zbVar4 = null;
            if (this.a == 0) {
                zb zbVar5 = this.b;
                zbVar5.W1(bc.this.b2);
                int i8 = this.i;
                if (i > 0) {
                    i8 += bc.this.n2;
                }
                zbVar5.x0.a(this.e, i8);
                if (z2) {
                    zbVar5.z0.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.f.z0.a(zbVar5.x0, 0);
                }
                if (bc.this.p2 == 3 && !zbVar5.q0()) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        int i10 = z ? (i2 - 1) - i9 : i9;
                        if (this.n + i10 >= bc.this.y2) {
                            break;
                        }
                        zbVar = bc.this.x2[this.n + i10];
                        if (zbVar.q0()) {
                            break;
                        }
                    }
                }
                zbVar = zbVar5;
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = z ? (i2 - 1) - i11 : i11;
                    if (this.n + i12 >= bc.this.y2) {
                        return;
                    }
                    zb zbVar6 = bc.this.x2[this.n + i12];
                    if (zbVar6 == null) {
                        zbVar6 = zbVar4;
                    } else {
                        if (i11 == 0) {
                            zbVar6.l(zbVar6.w0, this.d, this.h);
                        }
                        if (i12 == 0) {
                            int i13 = bc.this.a2;
                            float f3 = bc.this.g2;
                            if (z) {
                                f3 = 1.0f - f3;
                            }
                            if (this.n != 0 || bc.this.c2 == -1) {
                                if (z2 && bc.this.e2 != -1) {
                                    i13 = bc.this.e2;
                                    if (z) {
                                        f2 = bc.this.k2;
                                        f = 1.0f - f2;
                                        f3 = f;
                                    } else {
                                        f = bc.this.k2;
                                        f3 = f;
                                    }
                                }
                            } else {
                                i13 = bc.this.c2;
                                if (z) {
                                    f2 = bc.this.i2;
                                    f = 1.0f - f2;
                                    f3 = f;
                                } else {
                                    f = bc.this.i2;
                                    f3 = f;
                                }
                            }
                            zbVar6.B1(i13);
                            zbVar6.A1(f3);
                        }
                        if (i11 == i2 - 1) {
                            zbVar6.l(zbVar6.y0, this.f, this.j);
                        }
                        if (zbVar4 != null) {
                            zbVar6.w0.a(zbVar4.y0, bc.this.m2);
                            if (i11 == i4) {
                                zbVar6.w0.B(this.h);
                            }
                            zbVar4.y0.a(zbVar6.w0, 0);
                            if (i11 == i5 + 1) {
                                zbVar4.y0.B(this.j);
                            }
                        }
                        if (zbVar6 != zbVar5) {
                            if (bc.this.p2 != 3 || !zbVar.q0() || zbVar6 == zbVar || !zbVar6.q0()) {
                                int i14 = bc.this.p2;
                                if (i14 == 0) {
                                    zbVar6.x0.a(zbVar5.x0, 0);
                                } else if (i14 == 1) {
                                    zbVar6.z0.a(zbVar5.z0, 0);
                                } else if (z3) {
                                    zbVar6.x0.a(this.e, this.i);
                                    zbVar6.z0.a(this.g, this.k);
                                } else {
                                    zbVar6.x0.a(zbVar5.x0, 0);
                                    zbVar6.z0.a(zbVar5.z0, 0);
                                }
                            } else {
                                zbVar6.A0.a(zbVar.A0, 0);
                            }
                            i11++;
                            zbVar4 = zbVar6;
                        }
                    }
                    i11++;
                    zbVar4 = zbVar6;
                }
                return;
            }
            zb zbVar7 = this.b;
            zbVar7.B1(bc.this.a2);
            int i15 = this.h;
            if (i > 0) {
                i15 += bc.this.m2;
            }
            if (z) {
                zbVar7.y0.a(this.f, i15);
                if (z2) {
                    zbVar7.w0.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.f.w0.a(zbVar7.y0, 0);
                }
            } else {
                zbVar7.w0.a(this.d, i15);
                if (z2) {
                    zbVar7.y0.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.f.y0.a(zbVar7.w0, 0);
                }
            }
            for (int i16 = 0; i16 < i2 && this.n + i16 < bc.this.y2; i16++) {
                zb zbVar8 = bc.this.x2[this.n + i16];
                if (zbVar8 != null) {
                    if (i16 == 0) {
                        zbVar8.l(zbVar8.x0, this.e, this.i);
                        int i17 = bc.this.b2;
                        float f4 = bc.this.h2;
                        if (this.n != 0 || bc.this.d2 == -1) {
                            if (z2 && bc.this.f2 != -1) {
                                i17 = bc.this.f2;
                                f4 = bc.this.l2;
                            }
                        } else {
                            i17 = bc.this.d2;
                            f4 = bc.this.j2;
                        }
                        zbVar8.W1(i17);
                        zbVar8.V1(f4);
                    }
                    if (i16 == i2 - 1) {
                        zbVar8.l(zbVar8.z0, this.g, this.k);
                    }
                    if (zbVar4 != null) {
                        zbVar8.x0.a(zbVar4.z0, bc.this.n2);
                        if (i16 == i4) {
                            zbVar8.x0.B(this.i);
                        }
                        zbVar4.z0.a(zbVar8.x0, 0);
                        if (i16 == i5 + 1) {
                            zbVar4.z0.B(this.k);
                        }
                    }
                    if (zbVar8 != zbVar7) {
                        if (z) {
                            int i18 = bc.this.o2;
                            if (i18 == 0) {
                                zbVar8.y0.a(zbVar7.y0, 0);
                            } else if (i18 == 1) {
                                zbVar8.w0.a(zbVar7.w0, 0);
                            } else if (i18 == 2) {
                                zbVar8.w0.a(zbVar7.w0, 0);
                                zbVar8.y0.a(zbVar7.y0, 0);
                            }
                        } else {
                            int i19 = bc.this.o2;
                            if (i19 == 0) {
                                zbVar8.w0.a(zbVar7.w0, 0);
                            } else if (i19 == 1) {
                                zbVar8.y0.a(zbVar7.y0, 0);
                            } else if (i19 == 2) {
                                if (z3) {
                                    zbVar8.w0.a(this.d, this.h);
                                    zbVar8.y0.a(this.f, this.j);
                                } else {
                                    zbVar8.w0.a(zbVar7.w0, 0);
                                    zbVar8.y0.a(zbVar7.y0, 0);
                                }
                            }
                            zbVar4 = zbVar8;
                        }
                    }
                    zbVar4 = zbVar8;
                }
            }
        }

        public int e() {
            if (this.a == 1) {
                return this.m - bc.this.n2;
            }
            return this.m;
        }

        public int f() {
            if (this.a == 0) {
                return this.l - bc.this.m2;
            }
            return this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < bc.this.y2; i5++) {
                zb zbVar = bc.this.x2[this.n + i5];
                if (this.a == 0) {
                    if (zbVar != null && zbVar.H() == zb.b.MATCH_CONSTRAINT && zbVar.c0 == 0) {
                        bc.this.w2(zbVar, zb.b.FIXED, i4, zbVar.j0(), zbVar.D());
                    }
                } else if (zbVar != null && zbVar.j0() == zb.b.MATCH_CONSTRAINT && zbVar.d0 == 0) {
                    bc.this.w2(zbVar, zbVar.H(), zbVar.m0(), zb.b.FIXED, i4);
                }
            }
            h();
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, yb ybVar, yb ybVar2, yb ybVar3, yb ybVar4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = ybVar;
            this.e = ybVar2;
            this.f = ybVar3;
            this.g = ybVar4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    private void c3(boolean z) {
        zb zbVar;
        float f;
        int i;
        if (this.w2 == null || this.v2 == null || this.u2 == null) {
            return;
        }
        for (int i2 = 0; i2 < this.y2; i2++) {
            this.x2[i2].U0();
        }
        int[] iArr = this.w2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        zb zbVar2 = null;
        float f2 = this.g2;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.g2;
            } else {
                f = f2;
                i = i5;
            }
            zb zbVar3 = this.v2[i];
            if (zbVar3 != null && zbVar3.l0() != 8) {
                if (i5 == 0) {
                    zbVar3.l(zbVar3.w0, this.w0, s2());
                    zbVar3.B1(this.a2);
                    zbVar3.A1(f);
                }
                if (i5 == i3 - 1) {
                    zbVar3.l(zbVar3.y0, this.y0, t2());
                }
                if (i5 > 0 && zbVar2 != null) {
                    zbVar3.l(zbVar3.w0, zbVar2.y0, this.m2);
                    zbVar2.l(zbVar2.y0, zbVar3.w0, 0);
                }
                zbVar2 = zbVar3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            zb zbVar4 = this.u2[i6];
            if (zbVar4 != null && zbVar4.l0() != 8) {
                if (i6 == 0) {
                    zbVar4.l(zbVar4.x0, this.x0, u2());
                    zbVar4.W1(this.b2);
                    zbVar4.V1(this.h2);
                }
                if (i6 == i4 - 1) {
                    zbVar4.l(zbVar4.z0, this.z0, r2());
                }
                if (i6 > 0 && zbVar2 != null) {
                    zbVar4.l(zbVar4.x0, zbVar2.z0, this.n2);
                    zbVar2.l(zbVar2.z0, zbVar4.x0, 0);
                }
                zbVar2 = zbVar4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.s2 == 1) {
                    i9 = (i7 * i4) + i8;
                }
                zb[] zbVarArr = this.x2;
                if (i9 < zbVarArr.length && (zbVar = zbVarArr[i9]) != null && zbVar.l0() != 8) {
                    zb zbVar5 = this.v2[i7];
                    zb zbVar6 = this.u2[i8];
                    if (zbVar != zbVar5) {
                        zbVar.l(zbVar.w0, zbVar5.w0, 0);
                        zbVar.l(zbVar.y0, zbVar5.y0, 0);
                    }
                    if (zbVar != zbVar6) {
                        zbVar.l(zbVar.x0, zbVar6.x0, 0);
                        zbVar.l(zbVar.z0, zbVar6.z0, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e3(zb zbVar, int i) {
        if (zbVar == null) {
            return 0;
        }
        if (zbVar.j0() == zb.b.MATCH_CONSTRAINT) {
            int i2 = zbVar.d0;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (zbVar.k0 * i);
                if (i3 != zbVar.D()) {
                    zbVar.N1(true);
                    w2(zbVar, zbVar.H(), zbVar.m0(), zb.b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return zbVar.D();
            } else {
                if (i2 == 3) {
                    return (int) ((zbVar.m0() * zbVar.L0) + 0.5f);
                }
            }
        }
        return zbVar.D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f3(zb zbVar, int i) {
        if (zbVar == null) {
            return 0;
        }
        if (zbVar.H() == zb.b.MATCH_CONSTRAINT) {
            int i2 = zbVar.c0;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (zbVar.h0 * i);
                if (i3 != zbVar.m0()) {
                    zbVar.N1(true);
                    w2(zbVar, zb.b.FIXED, i3, zbVar.j0(), zbVar.D());
                }
                return i3;
            } else if (i2 == 1) {
                return zbVar.m0();
            } else {
                if (i2 == 3) {
                    return (int) ((zbVar.D() * zbVar.L0) + 0.5f);
                }
            }
        }
        return zbVar.m0();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x011b -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x011d -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0123 -> B:42:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0125 -> B:42:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void g3(zb[] zbVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        boolean z;
        zb zbVar;
        if (i2 == 0) {
            int i6 = this.r2;
            if (i6 <= 0) {
                i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < i; i8++) {
                    if (i8 > 0) {
                        i7 += this.m2;
                    }
                    zb zbVar2 = zbVarArr[i8];
                    if (zbVar2 != null) {
                        i7 += f3(zbVar2, i3);
                        if (i7 > i3) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            i5 = i6;
            i4 = 0;
        } else {
            i4 = this.r2;
            if (i4 <= 0) {
                i4 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (i10 > 0) {
                        i9 += this.n2;
                    }
                    zb zbVar3 = zbVarArr[i10];
                    if (zbVar3 != null) {
                        i9 += e3(zbVar3, i3);
                        if (i9 > i3) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            i5 = 0;
        }
        if (this.w2 == null) {
            this.w2 = new int[2];
        }
        if ((i4 != 0 || i2 != 1) && (i5 != 0 || i2 != 0)) {
            z = false;
            while (!z) {
                if (i2 == 0) {
                    i4 = (int) Math.ceil(i / i5);
                } else {
                    i5 = (int) Math.ceil(i / i4);
                }
                zb[] zbVarArr2 = this.v2;
                if (zbVarArr2 != null && zbVarArr2.length >= i5) {
                    Arrays.fill(zbVarArr2, (Object) null);
                } else {
                    this.v2 = new zb[i5];
                }
                zb[] zbVarArr3 = this.u2;
                if (zbVarArr3 != null && zbVarArr3.length >= i4) {
                    Arrays.fill(zbVarArr3, (Object) null);
                } else {
                    this.u2 = new zb[i4];
                }
                for (int i11 = 0; i11 < i5; i11++) {
                    for (int i12 = 0; i12 < i4; i12++) {
                        int i13 = (i12 * i5) + i11;
                        if (i2 == 1) {
                            i13 = (i11 * i4) + i12;
                        }
                        if (i13 < zbVarArr.length && (zbVar = zbVarArr[i13]) != null) {
                            int f3 = f3(zbVar, i3);
                            zb[] zbVarArr4 = this.v2;
                            if (zbVarArr4[i11] == null || zbVarArr4[i11].m0() < f3) {
                                this.v2[i11] = zbVar;
                            }
                            int e3 = e3(zbVar, i3);
                            zb[] zbVarArr5 = this.u2;
                            if (zbVarArr5[i12] == null || zbVarArr5[i12].D() < e3) {
                                this.u2[i12] = zbVar;
                            }
                        }
                    }
                }
                int i14 = 0;
                for (int i15 = 0; i15 < i5; i15++) {
                    zb zbVar4 = this.v2[i15];
                    if (zbVar4 != null) {
                        if (i15 > 0) {
                            i14 += this.m2;
                        }
                        i14 += f3(zbVar4, i3);
                    }
                }
                int i16 = 0;
                for (int i17 = 0; i17 < i4; i17++) {
                    zb zbVar5 = this.u2[i17];
                    if (zbVar5 != null) {
                        if (i17 > 0) {
                            i16 += this.n2;
                        }
                        i16 += e3(zbVar5, i3);
                    }
                }
                iArr[0] = i14;
                iArr[1] = i16;
                if (i2 != 0) {
                    if (i16 > i3 && i4 > 1) {
                        i4--;
                    }
                } else if (i14 > i3 && i5 > 1) {
                    i5--;
                }
                while (!z) {
                }
            }
            int[] iArr2 = this.w2;
            iArr2[0] = i5;
            iArr2[1] = i4;
        }
        z = true;
        while (!z) {
        }
        int[] iArr22 = this.w2;
        iArr22[0] = i5;
        iArr22[1] = i4;
    }

    private void h3(zb[] zbVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        yb ybVar;
        int t2;
        yb ybVar2;
        int r2;
        int i7;
        if (i == 0) {
            return;
        }
        this.t2.clear();
        a aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
        this.t2.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                zb zbVar = zbVarArr[i9];
                int f3 = f3(zbVar, i3);
                if (zbVar.H() == zb.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.m2 + i8) + f3 > i3) && aVar.b != null;
                if (!z && i9 > 0 && (i7 = this.r2) > 0 && i9 % i7 == 0) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
                    aVar.i(i9);
                    this.t2.add(aVar);
                } else if (i9 > 0) {
                    i8 = this.m2 + f3 + i8;
                    aVar.b(zbVar);
                    i9++;
                    i4 = i10;
                }
                i8 = f3;
                aVar.b(zbVar);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                zb zbVar2 = zbVarArr[i12];
                int e3 = e3(zbVar2, i3);
                if (zbVar2.j0() == zb.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.n2 + i11) + e3 > i3) && aVar.b != null;
                if (!z2 && i12 > 0 && (i5 = this.r2) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
                    aVar.i(i12);
                    this.t2.add(aVar);
                } else if (i12 > 0) {
                    i11 = this.n2 + e3 + i11;
                    aVar.b(zbVar2);
                    i12++;
                    i4 = i13;
                }
                i11 = e3;
                aVar.b(zbVar2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.t2.size();
        yb ybVar3 = this.w0;
        yb ybVar4 = this.x0;
        yb ybVar5 = this.y0;
        yb ybVar6 = this.z0;
        int s2 = s2();
        int u2 = u2();
        int t22 = t2();
        int r22 = r2();
        zb.b H = H();
        zb.b bVar = zb.b.WRAP_CONTENT;
        boolean z3 = H == bVar || j0() == bVar;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = this.t2.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i15 = u2;
        int i16 = t22;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = s2;
        yb ybVar7 = ybVar4;
        yb ybVar8 = ybVar3;
        int i21 = r22;
        while (i19 < size) {
            a aVar3 = this.t2.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    ybVar2 = this.t2.get(i19 + 1).b.x0;
                    r2 = 0;
                } else {
                    ybVar2 = this.z0;
                    r2 = r2();
                }
                yb ybVar9 = aVar3.b.z0;
                yb ybVar10 = ybVar8;
                yb ybVar11 = ybVar8;
                int i22 = i17;
                yb ybVar12 = ybVar7;
                int i23 = i18;
                yb ybVar13 = ybVar5;
                yb ybVar14 = ybVar5;
                i6 = i19;
                aVar3.j(i2, ybVar10, ybVar12, ybVar13, ybVar2, i20, i15, i16, r2, i3);
                int max = Math.max(i23, aVar3.f());
                int e = aVar3.e() + i22;
                if (i6 > 0) {
                    e += this.n2;
                }
                ybVar8 = ybVar11;
                i18 = max;
                i17 = e;
                ybVar7 = ybVar9;
                i15 = 0;
                ybVar = ybVar14;
                int i24 = r2;
                ybVar6 = ybVar2;
                i21 = i24;
            } else {
                yb ybVar15 = ybVar8;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    ybVar = this.t2.get(i6 + 1).b.w0;
                    t2 = 0;
                } else {
                    ybVar = this.y0;
                    t2 = t2();
                }
                yb ybVar16 = aVar3.b.y0;
                aVar3.j(i2, ybVar15, ybVar7, ybVar, ybVar6, i20, i15, t2, i21, i3);
                int f = aVar3.f() + i26;
                int max2 = Math.max(i25, aVar3.e());
                if (i6 > 0) {
                    f += this.m2;
                }
                i17 = max2;
                i18 = f;
                i16 = t2;
                ybVar8 = ybVar16;
                i20 = 0;
            }
            i19 = i6 + 1;
            ybVar5 = ybVar;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    private void i3(zb[] zbVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        yb ybVar;
        int t2;
        yb ybVar2;
        int r2;
        int i7;
        if (i == 0) {
            return;
        }
        this.t2.clear();
        a aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
        this.t2.add(aVar);
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                int i11 = i8 + 1;
                zb zbVar = zbVarArr[i10];
                int f3 = f3(zbVar, i3);
                if (zbVar.H() == zb.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i12 = i4;
                boolean z = (i9 == i3 || (this.m2 + i9) + f3 > i3) && aVar.b != null;
                if (!z && i10 > 0 && (i7 = this.r2) > 0 && i11 > i7) {
                    z = true;
                }
                if (z) {
                    aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
                    aVar.i(i10);
                    this.t2.add(aVar);
                    i8 = i11;
                    i9 = f3;
                } else {
                    i9 = i10 > 0 ? this.m2 + f3 + i9 : f3;
                    i8 = 0;
                }
                aVar.b(zbVar);
                i10++;
                i4 = i12;
            }
        } else {
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            while (i14 < i) {
                zb zbVar2 = zbVarArr[i14];
                int e3 = e3(zbVar2, i3);
                if (zbVar2.j0() == zb.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z2 = (i13 == i3 || (this.n2 + i13) + e3 > i3) && aVar.b != null;
                if (!z2 && i14 > 0 && (i5 = this.r2) > 0 && i5 < 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
                    aVar.i(i14);
                    this.t2.add(aVar);
                } else if (i14 > 0) {
                    i13 = this.n2 + e3 + i13;
                    aVar.b(zbVar2);
                    i14++;
                    i4 = i15;
                }
                i13 = e3;
                aVar.b(zbVar2);
                i14++;
                i4 = i15;
            }
        }
        int size = this.t2.size();
        yb ybVar3 = this.w0;
        yb ybVar4 = this.x0;
        yb ybVar5 = this.y0;
        yb ybVar6 = this.z0;
        int s2 = s2();
        int u2 = u2();
        int t22 = t2();
        int r22 = r2();
        zb.b H = H();
        zb.b bVar = zb.b.WRAP_CONTENT;
        boolean z3 = H == bVar || j0() == bVar;
        if (i4 > 0 && z3) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = this.t2.get(i16);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i17 = u2;
        int i18 = t22;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = s2;
        yb ybVar7 = ybVar4;
        yb ybVar8 = ybVar3;
        int i23 = r22;
        while (i21 < size) {
            a aVar3 = this.t2.get(i21);
            if (i2 == 0) {
                if (i21 < size - 1) {
                    ybVar2 = this.t2.get(i21 + 1).b.x0;
                    r2 = 0;
                } else {
                    ybVar2 = this.z0;
                    r2 = r2();
                }
                yb ybVar9 = aVar3.b.z0;
                yb ybVar10 = ybVar8;
                yb ybVar11 = ybVar8;
                int i24 = i19;
                yb ybVar12 = ybVar7;
                int i25 = i20;
                yb ybVar13 = ybVar5;
                yb ybVar14 = ybVar5;
                i6 = i21;
                aVar3.j(i2, ybVar10, ybVar12, ybVar13, ybVar2, i22, i17, i18, r2, i3);
                int max = Math.max(i25, aVar3.f());
                int e = aVar3.e() + i24;
                if (i6 > 0) {
                    e += this.n2;
                }
                ybVar8 = ybVar11;
                i20 = max;
                i19 = e;
                ybVar7 = ybVar9;
                i17 = 0;
                ybVar = ybVar14;
                int i26 = r2;
                ybVar6 = ybVar2;
                i23 = i26;
            } else {
                yb ybVar15 = ybVar8;
                int i27 = i19;
                int i28 = i20;
                i6 = i21;
                if (i6 < size - 1) {
                    ybVar = this.t2.get(i6 + 1).b.w0;
                    t2 = 0;
                } else {
                    ybVar = this.y0;
                    t2 = t2();
                }
                yb ybVar16 = aVar3.b.y0;
                aVar3.j(i2, ybVar15, ybVar7, ybVar, ybVar6, i22, i17, t2, i23, i3);
                int f = aVar3.f() + i28;
                int max2 = Math.max(i27, aVar3.e());
                if (i6 > 0) {
                    f += this.m2;
                }
                i19 = max2;
                i20 = f;
                i18 = t2;
                ybVar8 = ybVar16;
                i22 = 0;
            }
            i21 = i6 + 1;
            ybVar5 = ybVar;
        }
        iArr[0] = i20;
        iArr[1] = i19;
    }

    private void j3(zb[] zbVarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.t2.size() == 0) {
            aVar = new a(i2, this.w0, this.x0, this.y0, this.z0, i3);
            this.t2.add(aVar);
        } else {
            a aVar2 = this.t2.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i2, this.w0, this.x0, this.y0, this.z0, s2(), u2(), t2(), r2(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(zbVarArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A3(int i) {
        this.n2 = i;
    }

    public void B3(int i) {
        this.b2 = i;
    }

    public void C3(int i) {
        this.q2 = i;
    }

    public float d3() {
        return this.r2;
    }

    @Override // com.p7700g.p99005.zb
    public void g(i8 i8Var, boolean z) {
        super.g(i8Var, z);
        boolean z2 = U() != null && ((ac) U()).O2();
        int i = this.q2;
        if (i != 0) {
            if (i == 1) {
                int size = this.t2.size();
                int i2 = 0;
                while (i2 < size) {
                    this.t2.get(i2).d(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                c3(z2);
            } else if (i == 3) {
                int size2 = this.t2.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.t2.get(i3).d(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.t2.size() > 0) {
            this.t2.get(0).d(z2, 0, true);
        }
        z2(false);
    }

    public void k3(float f) {
        this.i2 = f;
    }

    public void l3(int i) {
        this.c2 = i;
    }

    public void m3(float f) {
        this.j2 = f;
    }

    @Override // com.p7700g.p99005.ec, com.p7700g.p99005.zb
    public void n(zb zbVar, HashMap<zb, zb> hashMap) {
        super.n(zbVar, hashMap);
        bc bcVar = (bc) zbVar;
        this.a2 = bcVar.a2;
        this.b2 = bcVar.b2;
        this.c2 = bcVar.c2;
        this.d2 = bcVar.d2;
        this.e2 = bcVar.e2;
        this.f2 = bcVar.f2;
        this.g2 = bcVar.g2;
        this.h2 = bcVar.h2;
        this.i2 = bcVar.i2;
        this.j2 = bcVar.j2;
        this.k2 = bcVar.k2;
        this.l2 = bcVar.l2;
        this.m2 = bcVar.m2;
        this.n2 = bcVar.n2;
        this.o2 = bcVar.o2;
        this.p2 = bcVar.p2;
        this.q2 = bcVar.q2;
        this.r2 = bcVar.r2;
        this.s2 = bcVar.s2;
    }

    public void n3(int i) {
        this.d2 = i;
    }

    public void o3(int i) {
        this.o2 = i;
    }

    public void p3(float f) {
        this.g2 = f;
    }

    public void q3(int i) {
        this.m2 = i;
    }

    public void r3(int i) {
        this.a2 = i;
    }

    public void s3(float f) {
        this.k2 = f;
    }

    public void t3(int i) {
        this.e2 = i;
    }

    public void u3(float f) {
        this.l2 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    @Override // com.p7700g.p99005.ic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v2(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        char c;
        if (this.B1 > 0 && !x2()) {
            A2(0, 0);
            z2(false);
            return;
        }
        int s2 = s2();
        int t2 = t2();
        int u2 = u2();
        int r2 = r2();
        int[] iArr2 = new int[2];
        int i7 = (i2 - s2) - t2;
        int i8 = this.s2;
        if (i8 == 1) {
            i7 = (i4 - u2) - r2;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.a2 == -1) {
                this.a2 = 0;
            }
            if (this.b2 == -1) {
                this.b2 = 0;
            }
        } else {
            if (this.a2 == -1) {
                this.a2 = 0;
            }
            if (this.b2 == -1) {
                this.b2 = 0;
            }
        }
        zb[] zbVarArr = this.A1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.B1;
            if (i10 >= i5) {
                break;
            }
            if (this.A1[i10].l0() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            zbVarArr = new zb[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.B1; i13++) {
                zb zbVar = this.A1[i13];
                if (zbVar.l0() != 8) {
                    zbVarArr[i12] = zbVar;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.x2 = zbVarArr;
        this.y2 = i6;
        int i14 = this.q2;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            j3(zbVarArr, i6, this.s2, i9, iArr2);
        } else if (i14 == 1) {
            iArr = iArr2;
            z = true;
            h3(zbVarArr, i6, this.s2, i9, iArr2);
        } else if (i14 == 2) {
            iArr = iArr2;
            z = true;
            g3(zbVarArr, i6, this.s2, i9, iArr2);
        } else if (i14 == 3) {
            z = true;
            iArr = iArr2;
            i3(zbVarArr, i6, this.s2, i9, iArr2);
        } else {
            iArr = iArr2;
            c = 0;
            z = true;
            int i15 = iArr[c] + s2 + t2;
            int i16 = iArr[z ? 1 : 0] + u2 + r2;
            if (i != 1073741824) {
                i15 = i2;
            } else if (i == Integer.MIN_VALUE) {
                i15 = Math.min(i15, i2);
            } else if (i != 0) {
                i15 = 0;
            }
            if (i3 != 1073741824) {
                i16 = i4;
            } else if (i3 == Integer.MIN_VALUE) {
                i16 = Math.min(i16, i4);
            } else if (i3 != 0) {
                i16 = 0;
            }
            A2(i15, i16);
            c2(i15);
            y1(i16);
            if (this.B1 <= 0) {
                z = false;
            }
            z2(z);
        }
        c = 0;
        int i152 = iArr[c] + s2 + t2;
        int i162 = iArr[z ? 1 : 0] + u2 + r2;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        A2(i152, i162);
        c2(i152);
        y1(i162);
        if (this.B1 <= 0) {
        }
        z2(z);
    }

    public void v3(int i) {
        this.f2 = i;
    }

    public void w3(int i) {
        this.r2 = i;
    }

    public void x3(int i) {
        this.s2 = i;
    }

    public void y3(int i) {
        this.p2 = i;
    }

    public void z3(float f) {
        this.h2 = f;
    }
}