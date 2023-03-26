package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.yb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class zb {
    public static final int A = 2;
    public static final int B = 3;
    public static final int C = 4;
    public static final int D = 0;
    public static final int E = 1;
    public static float F = 0.5f;
    private static final boolean a = false;
    public static final int b = 1;
    public static final int c = 2;
    private static final boolean d = false;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 0;
    public static final int o = 4;
    public static final int p = 8;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    private static final int x = -2;
    public static final int y = 0;
    public static final int z = 1;
    public yb A0;
    public yb B0;
    public yb C0;
    public yb D0;
    public yb[] E0;
    public ArrayList<yb> F0;
    public boolean G;
    private boolean[] G0;
    public zc[] H;
    public b[] H0;
    public mc I;
    public zb I0;
    public mc J;
    public int J0;
    public vc K;
    public int K0;
    public xc L;
    public float L0;
    public boolean[] M;
    public int M0;
    public boolean N;
    public int N0;
    private boolean O;
    public int O0;
    private boolean P;
    public int P0;
    private boolean Q;
    public int Q0;
    private int R;
    public int R0;
    private int S;
    public int S0;
    public mb T;
    public int T0;
    public String U;
    public int U0;
    private boolean V;
    public int V0;
    private boolean W;
    public float W0;
    private boolean X;
    public float X0;
    private boolean Y;
    private Object Y0;
    public int Z;
    private int Z0;
    public int a0;
    private int a1;
    private int b0;
    private boolean b1;
    public int c0;
    private String c1;
    public int d0;
    private String d1;
    public int[] e0;
    public int e1;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public float h0;
    public int h1;
    public int i0;
    public boolean i1;
    public int j0;
    public boolean j1;
    public float k0;
    public boolean k1;
    public boolean l0;
    public boolean l1;
    public boolean m0;
    public boolean m1;
    public int n0;
    public boolean n1;
    public float o0;
    public boolean o1;
    private int[] p0;
    public int p1;
    private float q0;
    public int q1;
    private boolean r0;
    public boolean r1;
    private boolean s0;
    public boolean s1;
    private boolean t0;
    public float[] t1;
    private int u0;
    public zb[] u1;
    private int v0;
    public zb[] v1;
    public yb w0;
    public zb w1;
    public yb x0;
    public zb x1;
    public yb y0;
    public int y1;
    public yb z0;
    public int z1;

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            b.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            yb.b.values();
            int[] iArr2 = new int[9];
            a = iArr2;
            try {
                iArr2[yb.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[yb.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[yb.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[yb.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[yb.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[yb.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[yb.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[yb.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[yb.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public zb() {
        this.G = false;
        this.H = new zc[2];
        this.K = null;
        this.L = null;
        this.M = new boolean[]{true, true};
        this.N = false;
        this.O = true;
        this.P = false;
        this.Q = true;
        this.R = -1;
        this.S = -1;
        this.T = new mb(this);
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = new int[2];
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 1.0f;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 1.0f;
        this.n0 = -1;
        this.o0 = 1.0f;
        this.p0 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.q0 = 0.0f;
        this.r0 = false;
        this.t0 = false;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = new yb(this, yb.b.LEFT);
        this.x0 = new yb(this, yb.b.TOP);
        this.y0 = new yb(this, yb.b.RIGHT);
        this.z0 = new yb(this, yb.b.BOTTOM);
        this.A0 = new yb(this, yb.b.BASELINE);
        this.B0 = new yb(this, yb.b.CENTER_X);
        this.C0 = new yb(this, yb.b.CENTER_Y);
        yb ybVar = new yb(this, yb.b.CENTER);
        this.D0 = ybVar;
        this.E0 = new yb[]{this.w0, this.y0, this.x0, this.z0, this.A0, ybVar};
        this.F0 = new ArrayList<>();
        this.G0 = new boolean[2];
        b bVar = b.FIXED;
        this.H0 = new b[]{bVar, bVar};
        this.I0 = null;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0.0f;
        this.M0 = -1;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        float f2 = F;
        this.W0 = f2;
        this.X0 = f2;
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = null;
        this.d1 = null;
        this.o1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.t1 = new float[]{-1.0f, -1.0f};
        this.u1 = new zb[]{null, null};
        this.v1 = new zb[]{null, null};
        this.w1 = null;
        this.x1 = null;
        this.y1 = -1;
        this.z1 = -1;
        d();
    }

    private void Z0(StringBuilder sb, String str, yb ybVar) {
        if (ybVar.h == null) {
            return;
        }
        sb.append(str);
        sb.append(" : [ '");
        sb.append(ybVar.h);
        sb.append("',");
        sb.append(ybVar.i);
        sb.append(",");
        sb.append(ybVar.j);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void a1(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    private void b1(StringBuilder sb, String str, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    private void c0(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, "      size", i2, 0);
        b1(sb, "      min", i3, 0);
        b1(sb, "      max", i4, Integer.MAX_VALUE);
        b1(sb, "      matchMin", i6, 0);
        b1(sb, "      matchDef", i7, 0);
        a1(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    private void c1(StringBuilder sb, yb ybVar, float f2) {
        if (ybVar.h == null) {
            return;
        }
        sb.append("circle : [ '");
        sb.append(ybVar.h);
        sb.append("',");
        sb.append(ybVar.i);
        sb.append(",");
        sb.append(f2);
        sb.append(",");
        sb.append(" ] ,\n");
    }

    private void d() {
        this.F0.add(this.w0);
        this.F0.add(this.x0);
        this.F0.add(this.y0);
        this.F0.add(this.z0);
        this.F0.add(this.B0);
        this.F0.add(this.C0);
        this.F0.add(this.D0);
        this.F0.add(this.A0);
    }

    private void d0(StringBuilder sb, String str, yb ybVar) {
        if (ybVar.h == null) {
            return;
        }
        wo1.g0(sb, "    ", str, " : [ '");
        sb.append(ybVar.h);
        sb.append("'");
        if (ybVar.j != Integer.MIN_VALUE || ybVar.i != 0) {
            sb.append(",");
            sb.append(ybVar.i);
            if (ybVar.j != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(ybVar.j);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d1(StringBuilder sb, String str, float f2, int i2) {
        if (f2 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f2);
        sb.append(",");
        sb.append(i2);
        sb.append("");
        sb.append("],\n");
    }

    private void e1(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, int i7, float f2, float f3) {
        sb.append(str);
        sb.append(" :  {\n");
        b1(sb, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, i2, Integer.MIN_VALUE);
        b1(sb, "min", i3, 0);
        b1(sb, "max", i4, Integer.MAX_VALUE);
        b1(sb, "matchMin", i6, 0);
        b1(sb, "matchDef", i7, 0);
        b1(sb, "matchPercent", i7, 1);
        sb.append("},\n");
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0454, code lost:
        if ((r1 instanceof com.p7700g.p99005.vb) != false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:384:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:387:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i(i8 i8Var, boolean z2, boolean z3, boolean z4, boolean z5, m8 m8Var, m8 m8Var2, b bVar, boolean z6, yb ybVar, yb ybVar2, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        int i10;
        boolean z13;
        int i11;
        int i12;
        int i13;
        m8 m8Var3;
        int i14;
        int i15;
        int i16;
        m8 m8Var4;
        m8 m8Var5;
        m8 m8Var6;
        int i17;
        boolean z14;
        boolean z15;
        m8 u2;
        m8 u3;
        m8 m8Var7;
        m8 m8Var8;
        m8 m8Var9;
        m8 m8Var10;
        int i18;
        int i19;
        int i20;
        boolean z16;
        yb ybVar3;
        m8 m8Var11;
        int i21;
        m8 m8Var12;
        int i22;
        int i23;
        boolean z17;
        boolean z18;
        int i24;
        boolean z19;
        boolean z20;
        m8 m8Var13;
        zb zbVar;
        zb zbVar2;
        m8 m8Var14;
        int i25;
        int i26;
        boolean z21;
        m8 m8Var15;
        zb zbVar3;
        m8 m8Var16;
        zb zbVar4;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z22;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z23;
        boolean z24;
        boolean z25;
        zb zbVar5;
        zb zbVar6;
        m8 u4 = i8Var.u(ybVar);
        m8 u5 = i8Var.u(ybVar2);
        m8 u6 = i8Var.u(ybVar.k());
        m8 u7 = i8Var.u(ybVar2.k());
        if (i8.L() != null) {
            i8.L().H++;
        }
        boolean p2 = ybVar.p();
        boolean p3 = ybVar2.p();
        boolean p4 = this.D0.p();
        int i37 = p3 ? (p2 ? 1 : 0) + 1 : p2 ? 1 : 0;
        if (p4) {
            i37++;
        }
        int i38 = z7 ? 3 : i6;
        int ordinal = bVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal == 2) {
            i10 = i38;
            if (i10 != 4) {
                z13 = true;
                i11 = this.R;
                if (i11 != -1 && z2) {
                    this.R = -1;
                    i3 = i11;
                    z13 = false;
                }
                i12 = this.S;
                if (i12 != -1 || z2) {
                    i12 = i3;
                } else {
                    this.S = -1;
                    z13 = false;
                }
                int i39 = i12;
                if (this.a1 == 8) {
                    i13 = 0;
                    z13 = false;
                } else {
                    i13 = i39;
                }
                if (z12) {
                    if (!p2 && !p3 && !p4) {
                        i8Var.f(u4, i2);
                    } else if (p2 && !p3) {
                        m8Var3 = u7;
                        i8Var.e(u4, u6, ybVar.g(), 8);
                        if (z13) {
                            if (z6) {
                                i8Var.e(u5, u4, 0, 3);
                                if (i4 > 0) {
                                    i8Var.i(u5, u4, i4, 8);
                                }
                                if (i5 < Integer.MAX_VALUE) {
                                    i8Var.k(u5, u4, i5, 8);
                                }
                            } else {
                                i8Var.e(u5, u4, i13, 8);
                            }
                            i14 = i9;
                            i16 = i37;
                            m8Var4 = u6;
                            m8Var5 = u5;
                            z14 = z13;
                            m8Var6 = m8Var3;
                            z15 = z5;
                        } else if (i37 == 2 || z7 || !(i10 == 1 || i10 == 0)) {
                            int i40 = i8 == -2 ? i13 : i8;
                            i14 = i9 == -2 ? i13 : i9;
                            if (i13 > 0 && i10 != 1) {
                                i13 = 0;
                            }
                            if (i40 > 0) {
                                i8Var.i(u5, u4, i40, 8);
                                i13 = Math.max(i13, i40);
                            }
                            if (i14 > 0) {
                                if ((z3 && i10 == 1) ? false : true) {
                                    i15 = 8;
                                    i8Var.k(u5, u4, i14, 8);
                                } else {
                                    i15 = 8;
                                }
                                i13 = Math.min(i13, i14);
                            } else {
                                i15 = 8;
                            }
                            if (i10 == 1) {
                                if (z3) {
                                    i8Var.e(u5, u4, i13, i15);
                                } else if (z9) {
                                    i8Var.e(u5, u4, i13, 5);
                                    i8Var.k(u5, u4, i13, i15);
                                } else {
                                    i8Var.e(u5, u4, i13, 5);
                                    i8Var.k(u5, u4, i13, i15);
                                }
                                i16 = i37;
                                m8Var4 = u6;
                                z14 = z13;
                                m8Var6 = m8Var3;
                                z15 = z5;
                                i17 = i40;
                                m8Var5 = u5;
                            } else if (i10 == 2) {
                                yb.b l2 = ybVar.l();
                                yb.b bVar2 = yb.b.TOP;
                                if (l2 != bVar2 && ybVar.l() != yb.b.BOTTOM) {
                                    u2 = i8Var.u(this.I0.r(yb.b.LEFT));
                                    u3 = i8Var.u(this.I0.r(yb.b.RIGHT));
                                } else {
                                    u2 = i8Var.u(this.I0.r(bVar2));
                                    u3 = i8Var.u(this.I0.r(yb.b.BOTTOM));
                                }
                                i16 = i37;
                                m8Var6 = m8Var3;
                                m8Var4 = u6;
                                int i41 = i40;
                                m8Var5 = u5;
                                i8Var.d(i8Var.v().n(u5, u4, u3, u2, f3));
                                if (z3) {
                                    z13 = false;
                                }
                                i17 = i41;
                                z14 = z13;
                                z15 = z5;
                            } else {
                                int i42 = i40;
                                i16 = i37;
                                m8Var4 = u6;
                                m8Var5 = u5;
                                m8Var6 = m8Var3;
                                i17 = i42;
                                z14 = z13;
                                z15 = true;
                            }
                            if (!z12) {
                                m8Var7 = m8Var;
                                m8Var8 = m8Var2;
                                m8Var9 = m8Var5;
                                m8Var10 = u4;
                                i18 = 0;
                                i19 = 8;
                                i20 = i16;
                            } else if (z9) {
                                m8Var7 = m8Var;
                                m8Var8 = m8Var2;
                                i20 = i16;
                                m8Var9 = m8Var5;
                                m8Var10 = u4;
                                i18 = 0;
                                i19 = 8;
                            } else {
                                if (p2 || p3 || p4) {
                                    if (p2 && !p3) {
                                        z21 = z3;
                                        i29 = (z3 && (ybVar.h.f instanceof vb)) ? 8 : 5;
                                        m8Var15 = m8Var5;
                                    } else if (!p2 && p3) {
                                        i8Var.e(m8Var5, m8Var6, -ybVar2.g(), 8);
                                        if (z3) {
                                            if (this.P && u4.P && (zbVar5 = this.I0) != null) {
                                                ac acVar = (ac) zbVar5;
                                                if (z2) {
                                                    acVar.u2(ybVar);
                                                } else {
                                                    acVar.z2(ybVar);
                                                }
                                            } else {
                                                i8Var.i(u4, m8Var, 0, 5);
                                            }
                                        }
                                    } else if (p2 && p3) {
                                        zb zbVar7 = ybVar.h.f;
                                        zb zbVar8 = ybVar2.h.f;
                                        zb U = U();
                                        int i43 = 6;
                                        if (!z14) {
                                            if (m8Var4.P && m8Var6.P) {
                                                i8Var.c(u4, m8Var4, ybVar.g(), f2, m8Var6, m8Var5, ybVar2.g(), 8);
                                                if (z3 && z15) {
                                                    if (ybVar2.h != null) {
                                                        i22 = ybVar2.g();
                                                        m8Var12 = m8Var2;
                                                    } else {
                                                        m8Var12 = m8Var2;
                                                        i22 = 0;
                                                    }
                                                    if (m8Var6 != m8Var12) {
                                                        i8Var.i(m8Var12, m8Var5, i22, 5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            m8Var11 = m8Var2;
                                            i21 = 6;
                                        } else {
                                            if (i10 == 0) {
                                                if (i14 != 0 || i17 != 0) {
                                                    i35 = 5;
                                                    i36 = 5;
                                                    z23 = true;
                                                    z24 = false;
                                                    z25 = true;
                                                } else if (m8Var4.P && m8Var6.P) {
                                                    i8Var.e(u4, m8Var4, ybVar.g(), 8);
                                                    i8Var.e(m8Var5, m8Var6, -ybVar2.g(), 8);
                                                    return;
                                                } else {
                                                    i35 = 8;
                                                    i36 = 8;
                                                    z23 = false;
                                                    z24 = true;
                                                    z25 = false;
                                                }
                                                if ((zbVar7 instanceof vb) || (zbVar8 instanceof vb)) {
                                                    m8Var11 = m8Var2;
                                                    z17 = z23;
                                                    z19 = z24;
                                                    z18 = z25;
                                                    i23 = 4;
                                                    i24 = i35;
                                                    i21 = 6;
                                                } else {
                                                    m8Var11 = m8Var2;
                                                    z17 = z23;
                                                    z19 = z24;
                                                    z18 = z25;
                                                    i24 = i35;
                                                    i23 = i36;
                                                    i21 = 6;
                                                }
                                            } else if (i10 == 2) {
                                                if ((zbVar7 instanceof vb) || (zbVar8 instanceof vb)) {
                                                    m8Var11 = m8Var2;
                                                    i21 = 6;
                                                } else {
                                                    m8Var11 = m8Var2;
                                                    i21 = 6;
                                                    i23 = 5;
                                                    i24 = 5;
                                                    z18 = true;
                                                    z17 = true;
                                                    z19 = false;
                                                }
                                            } else if (i10 == 1) {
                                                m8Var11 = m8Var2;
                                                i21 = 6;
                                                i23 = 4;
                                                i24 = 8;
                                                z18 = true;
                                                z17 = true;
                                                z19 = false;
                                            } else if (i10 == 3) {
                                                if (this.n0 == -1) {
                                                    if (z10) {
                                                        m8Var11 = m8Var2;
                                                        i21 = z3 ? 5 : 4;
                                                    } else {
                                                        m8Var11 = m8Var2;
                                                        i21 = 8;
                                                    }
                                                    i23 = 5;
                                                    i24 = 8;
                                                } else if (z7) {
                                                    if (i7 == 2 || i7 == 1) {
                                                        i33 = 5;
                                                        i34 = 4;
                                                    } else {
                                                        i33 = 8;
                                                        i34 = 5;
                                                    }
                                                    m8Var11 = m8Var2;
                                                    i24 = i33;
                                                    i23 = i34;
                                                    i21 = 6;
                                                } else {
                                                    if (i14 > 0) {
                                                        m8Var11 = m8Var2;
                                                        i21 = 6;
                                                        i23 = 5;
                                                    } else if (i14 != 0 || i17 != 0) {
                                                        m8Var11 = m8Var2;
                                                        i21 = 6;
                                                        i23 = 4;
                                                    } else if (z10) {
                                                        m8Var11 = m8Var2;
                                                        i24 = (zbVar7 == U || zbVar8 == U) ? 5 : 4;
                                                        i21 = 6;
                                                        i23 = 4;
                                                    } else {
                                                        m8Var11 = m8Var2;
                                                        i21 = 6;
                                                        i23 = 8;
                                                    }
                                                    i24 = 5;
                                                }
                                                z18 = true;
                                                z17 = true;
                                                z19 = true;
                                            } else {
                                                m8Var11 = m8Var2;
                                                i21 = 6;
                                                i23 = 4;
                                                i24 = 5;
                                                z18 = false;
                                                z17 = false;
                                                z19 = false;
                                            }
                                            if (z18 || m8Var4 != m8Var6 || zbVar7 == U) {
                                                z20 = true;
                                            } else {
                                                z18 = false;
                                                z20 = false;
                                            }
                                            if (z17) {
                                                m8Var13 = m8Var5;
                                                zbVar = U;
                                                zbVar2 = zbVar8;
                                                m8Var14 = u4;
                                                i25 = 8;
                                                i26 = i24;
                                                z21 = z3;
                                            } else {
                                                if (z14 || z8 || z10 || m8Var4 != m8Var || m8Var6 != m8Var11) {
                                                    i26 = i24;
                                                    z22 = z20;
                                                    z21 = z3;
                                                    i32 = i21;
                                                } else {
                                                    z21 = false;
                                                    i26 = 8;
                                                    i32 = 8;
                                                    z22 = false;
                                                }
                                                m8Var13 = m8Var5;
                                                i25 = 8;
                                                zbVar = U;
                                                zbVar2 = zbVar8;
                                                m8Var14 = u4;
                                                i8Var.c(u4, m8Var4, ybVar.g(), f2, m8Var6, m8Var13, ybVar2.g(), i32);
                                                z20 = z22;
                                            }
                                            if (this.a1 != i25 && !ybVar2.n()) {
                                                return;
                                            }
                                            if (z18) {
                                                m8Var15 = m8Var13;
                                                zbVar3 = zbVar2;
                                                m8Var16 = m8Var14;
                                            } else {
                                                if (!z21 || m8Var4 == m8Var6 || z14) {
                                                    zbVar3 = zbVar2;
                                                } else {
                                                    if (zbVar7 instanceof vb) {
                                                        zbVar3 = zbVar2;
                                                    } else {
                                                        zbVar3 = zbVar2;
                                                    }
                                                    i31 = 6;
                                                    m8Var16 = m8Var14;
                                                    i8Var.i(m8Var16, m8Var4, ybVar.g(), i31);
                                                    m8Var15 = m8Var13;
                                                    i8Var.k(m8Var15, m8Var6, -ybVar2.g(), i31);
                                                    i26 = i31;
                                                }
                                                i31 = i26;
                                                m8Var16 = m8Var14;
                                                i8Var.i(m8Var16, m8Var4, ybVar.g(), i31);
                                                m8Var15 = m8Var13;
                                                i8Var.k(m8Var15, m8Var6, -ybVar2.g(), i31);
                                                i26 = i31;
                                            }
                                            if (z21 || !z11 || (zbVar7 instanceof vb) || (zbVar3 instanceof vb)) {
                                                zbVar4 = zbVar;
                                            } else {
                                                zbVar4 = zbVar;
                                                if (zbVar3 != zbVar4) {
                                                    i27 = 6;
                                                    i28 = 6;
                                                    z20 = true;
                                                    if (z20) {
                                                        if (z19 && (!z10 || z4)) {
                                                            if (zbVar7 != zbVar4 && zbVar3 != zbVar4) {
                                                                i43 = i27;
                                                            }
                                                            i43 = ((zbVar7 instanceof cc) || (zbVar3 instanceof cc)) ? 5 : 5;
                                                            i27 = Math.max(z10 ? 5 : ((zbVar7 instanceof vb) || (zbVar3 instanceof vb)) ? 5 : 5, i27);
                                                        }
                                                        if (z21) {
                                                            i27 = Math.min(i28, i27);
                                                            if (z7 && !z10 && (zbVar7 == zbVar4 || zbVar3 == zbVar4)) {
                                                                i27 = 4;
                                                            }
                                                        }
                                                        i8Var.e(m8Var16, m8Var4, ybVar.g(), i27);
                                                        i8Var.e(m8Var15, m8Var6, -ybVar2.g(), i27);
                                                    }
                                                    if (z21) {
                                                        int g2 = m8Var == m8Var4 ? ybVar.g() : 0;
                                                        if (m8Var4 != m8Var) {
                                                            i29 = 5;
                                                            i8Var.i(m8Var16, m8Var, g2, 5);
                                                            if (z21 && z14 && i4 == 0 && i17 == 0) {
                                                                if (!z14 && i10 == 3) {
                                                                    i30 = 0;
                                                                    i8Var.i(m8Var15, m8Var16, 0, i25);
                                                                } else {
                                                                    i30 = 0;
                                                                    i8Var.i(m8Var15, m8Var16, 0, i29);
                                                                }
                                                                if (z21 || !z15) {
                                                                    return;
                                                                }
                                                                if (ybVar2.h != null) {
                                                                    i30 = ybVar2.g();
                                                                }
                                                                if (m8Var6 != m8Var2) {
                                                                    if (this.P && m8Var15.P && (zbVar6 = this.I0) != null) {
                                                                        ac acVar2 = (ac) zbVar6;
                                                                        if (z2) {
                                                                            acVar2.t2(ybVar2);
                                                                            return;
                                                                        } else {
                                                                            acVar2.y2(ybVar2);
                                                                            return;
                                                                        }
                                                                    }
                                                                    i8Var.i(m8Var2, m8Var15, i30, i29);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    i29 = 5;
                                                    if (z21) {
                                                        if (!z14) {
                                                        }
                                                        i30 = 0;
                                                        i8Var.i(m8Var15, m8Var16, 0, i29);
                                                        if (z21) {
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                            i27 = i23;
                                            i28 = i26;
                                            if (z20) {
                                            }
                                            if (z21) {
                                            }
                                            i29 = 5;
                                            if (z21) {
                                            }
                                        }
                                        i23 = 4;
                                        i24 = 5;
                                        z18 = true;
                                        z17 = true;
                                        z19 = false;
                                        if (z18) {
                                        }
                                        z20 = true;
                                        if (z17) {
                                        }
                                        if (this.a1 != i25) {
                                        }
                                        if (z18) {
                                        }
                                        if (z21) {
                                        }
                                        zbVar4 = zbVar;
                                        i27 = i23;
                                        i28 = i26;
                                        if (z20) {
                                        }
                                        if (z21) {
                                        }
                                        i29 = 5;
                                        if (z21) {
                                        }
                                    }
                                    i30 = 0;
                                    if (z21) {
                                    }
                                }
                                m8Var15 = m8Var5;
                                i30 = 0;
                                i29 = 5;
                                z21 = z3;
                                if (z21) {
                                }
                            }
                            if (i20 < 2 && z3 && z15) {
                                i8Var.i(m8Var10, m8Var7, i18, i19);
                                boolean z26 = z2 || this.A0.h == null;
                                if (z2 || (ybVar3 = this.A0.h) == null) {
                                    z16 = z26;
                                } else {
                                    zb zbVar9 = ybVar3.f;
                                    if (zbVar9.L0 != 0.0f) {
                                        b[] bVarArr = zbVar9.H0;
                                        b bVar3 = bVarArr[i18];
                                        b bVar4 = b.MATCH_CONSTRAINT;
                                        if (bVar3 == bVar4 && bVarArr[1] == bVar4) {
                                            z16 = true;
                                        }
                                    }
                                    z16 = false;
                                }
                                if (z16) {
                                    i8Var.i(m8Var8, m8Var9, i18, i19);
                                    return;
                                }
                                return;
                            }
                            return;
                        } else {
                            int max = Math.max(i8, i13);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            i8Var.e(u5, u4, max, 8);
                            z15 = z5;
                            i14 = i9;
                            i16 = i37;
                            m8Var4 = u6;
                            m8Var5 = u5;
                            m8Var6 = m8Var3;
                            z14 = false;
                        }
                        i17 = i8;
                        if (!z12) {
                        }
                        if (i20 < 2) {
                            return;
                        }
                        return;
                    }
                }
                m8Var3 = u7;
                if (z13) {
                }
                i17 = i8;
                if (!z12) {
                }
                if (i20 < 2) {
                }
            }
            z13 = false;
            i11 = this.R;
            if (i11 != -1) {
                this.R = -1;
                i3 = i11;
                z13 = false;
            }
            i12 = this.S;
            if (i12 != -1) {
            }
            i12 = i3;
            int i392 = i12;
            if (this.a1 == 8) {
            }
            if (z12) {
            }
            m8Var3 = u7;
            if (z13) {
            }
            i17 = i8;
            if (!z12) {
            }
            if (i20 < 2) {
            }
        }
        i10 = i38;
        z13 = false;
        i11 = this.R;
        if (i11 != -1) {
        }
        i12 = this.S;
        if (i12 != -1) {
        }
        i12 = i3;
        int i3922 = i12;
        if (this.a1 == 8) {
        }
        if (z12) {
        }
        m8Var3 = u7;
        if (z13) {
        }
        i17 = i8;
        if (!z12) {
        }
        if (i20 < 2) {
        }
    }

    private boolean x0(int i2) {
        int i3 = i2 * 2;
        yb[] ybVarArr = this.E0;
        if (ybVarArr[i3].h != null && ybVarArr[i3].h.h != ybVarArr[i3]) {
            int i4 = i3 + 1;
            if (ybVarArr[i4].h != null && ybVarArr[i4].h.h == ybVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public float A() {
        return this.L0;
    }

    public boolean A0(int i2) {
        return this.G0[i2];
    }

    public void A1(float f2) {
        this.W0 = f2;
    }

    public int B() {
        return this.M0;
    }

    public boolean B0() {
        yb ybVar = this.w0;
        yb ybVar2 = ybVar.h;
        if (ybVar2 == null || ybVar2.h != ybVar) {
            yb ybVar3 = this.y0;
            yb ybVar4 = ybVar3.h;
            return ybVar4 != null && ybVar4.h == ybVar3;
        }
        return true;
    }

    public void B1(int i2) {
        this.p1 = i2;
    }

    public boolean C() {
        return this.r0;
    }

    public boolean C0() {
        return this.s0;
    }

    public void C1(int i2, int i3) {
        this.N0 = i2;
        int i4 = i3 - i2;
        this.J0 = i4;
        int i5 = this.U0;
        if (i4 < i5) {
            this.J0 = i5;
        }
    }

    public int D() {
        if (this.a1 == 8) {
            return 0;
        }
        return this.K0;
    }

    public boolean D0() {
        yb ybVar = this.x0;
        yb ybVar2 = ybVar.h;
        if (ybVar2 == null || ybVar2.h != ybVar) {
            yb ybVar3 = this.z0;
            yb ybVar4 = ybVar3.h;
            return ybVar4 != null && ybVar4.h == ybVar3;
        }
        return true;
    }

    public void D1(b bVar) {
        this.H0[0] = bVar;
    }

    public float E() {
        return this.W0;
    }

    public boolean E0() {
        return this.t0;
    }

    public void E1(int i2, int i3, int i4, float f2) {
        this.c0 = i2;
        this.f0 = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.g0 = i4;
        this.h0 = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.c0 = 2;
    }

    public zb F() {
        if (B0()) {
            zb zbVar = this;
            zb zbVar2 = null;
            while (zbVar2 == null && zbVar != null) {
                yb r2 = zbVar.r(yb.b.LEFT);
                yb k2 = r2 == null ? null : r2.k();
                zb i2 = k2 == null ? null : k2.i();
                if (i2 == U()) {
                    return zbVar;
                }
                yb k3 = i2 == null ? null : i2.r(yb.b.RIGHT).k();
                if (k3 == null || k3.i() == zbVar) {
                    zbVar = i2;
                } else {
                    zbVar2 = zbVar;
                }
            }
            return zbVar2;
        }
        return null;
    }

    public boolean F0() {
        return this.O && this.a1 != 8;
    }

    public void F1(float f2) {
        this.t1[0] = f2;
    }

    public int G() {
        return this.p1;
    }

    public boolean G0() {
        return this.V || (this.w0.o() && this.y0.o());
    }

    public void G1(int i2, boolean z2) {
        this.G0[i2] = z2;
    }

    public b H() {
        return this.H0[0];
    }

    public boolean H0() {
        return this.W || (this.x0.o() && this.z0.o());
    }

    public void H1(boolean z2) {
        this.s0 = z2;
    }

    public int I() {
        yb ybVar = this.w0;
        int i2 = ybVar != null ? 0 + ybVar.i : 0;
        yb ybVar2 = this.y0;
        return ybVar2 != null ? i2 + ybVar2.i : i2;
    }

    public boolean I0() {
        return this.I0 == null;
    }

    public void I1(boolean z2) {
        this.t0 = z2;
    }

    public int J() {
        return this.u0;
    }

    public boolean J0() {
        return this.d0 == 0 && this.L0 == 0.0f && this.i0 == 0 && this.j0 == 0 && this.H0[1] == b.MATCH_CONSTRAINT;
    }

    public void J1(int i2, int i3) {
        this.u0 = i2;
        this.v0 = i3;
        N1(false);
    }

    public int K() {
        return this.v0;
    }

    public boolean K0() {
        return this.c0 == 0 && this.L0 == 0.0f && this.f0 == 0 && this.g0 == 0 && this.H0[0] == b.MATCH_CONSTRAINT;
    }

    public void K1(int i2, int i3) {
        if (i3 == 0) {
            c2(i2);
        } else if (i3 == 1) {
            y1(i2);
        }
    }

    public int L() {
        return o0();
    }

    public boolean L0() {
        return this.Y;
    }

    public void L1(int i2) {
        this.p0[1] = i2;
    }

    public int M(int i2) {
        if (i2 == 0) {
            return m0();
        }
        if (i2 == 1) {
            return D();
        }
        return 0;
    }

    public boolean M0() {
        return this.l0;
    }

    public void M1(int i2) {
        this.p0[0] = i2;
    }

    public int N() {
        return this.p0[1];
    }

    public void N0() {
        this.X = true;
    }

    public void N1(boolean z2) {
        this.O = z2;
    }

    public int O() {
        return this.p0[0];
    }

    public void O0() {
        this.Y = true;
    }

    public void O1(int i2) {
        if (i2 < 0) {
            this.V0 = 0;
        } else {
            this.V0 = i2;
        }
    }

    public int P() {
        return this.V0;
    }

    public boolean P0(int i2) {
        char c2 = i2 == 0 ? (char) 1 : (char) 0;
        b[] bVarArr = this.H0;
        b bVar = bVarArr[i2];
        b bVar2 = bVarArr[c2];
        b bVar3 = b.MATCH_CONSTRAINT;
        return bVar == bVar3 && bVar2 == bVar3;
    }

    public void P1(int i2) {
        if (i2 < 0) {
            this.U0 = 0;
        } else {
            this.U0 = i2;
        }
    }

    public int Q() {
        return this.U0;
    }

    public boolean Q0() {
        b[] bVarArr = this.H0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void Q1(int i2, int i3) {
        this.R0 = i2;
        this.S0 = i3;
    }

    public zb R(int i2) {
        yb ybVar;
        yb ybVar2;
        if (i2 != 0) {
            if (i2 == 1 && (ybVar2 = (ybVar = this.z0).h) != null && ybVar2.h == ybVar) {
                return ybVar2.f;
            }
            return null;
        }
        yb ybVar3 = this.y0;
        yb ybVar4 = ybVar3.h;
        if (ybVar4 == null || ybVar4.h != ybVar3) {
            return null;
        }
        return ybVar4.f;
    }

    public void R0() {
        this.w0.x();
        this.x0.x();
        this.y0.x();
        this.z0.x();
        this.A0.x();
        this.B0.x();
        this.C0.x();
        this.D0.x();
        this.I0 = null;
        this.q0 = 0.0f;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0.0f;
        this.M0 = -1;
        this.N0 = 0;
        this.O0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        this.U0 = 0;
        this.V0 = 0;
        float f2 = F;
        this.W0 = f2;
        this.X0 = f2;
        b[] bVarArr = this.H0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.Y0 = null;
        this.Z0 = 0;
        this.a1 = 0;
        this.d1 = null;
        this.m1 = false;
        this.n1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.r1 = false;
        this.s1 = false;
        float[] fArr = this.t1;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.Z = -1;
        this.a0 = -1;
        int[] iArr = this.p0;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.c0 = 0;
        this.d0 = 0;
        this.h0 = 1.0f;
        this.k0 = 1.0f;
        this.g0 = Integer.MAX_VALUE;
        this.j0 = Integer.MAX_VALUE;
        this.f0 = 0;
        this.i0 = 0;
        this.N = false;
        this.n0 = -1;
        this.o0 = 1.0f;
        this.o1 = false;
        boolean[] zArr = this.M;
        zArr[0] = true;
        zArr[1] = true;
        this.t0 = false;
        boolean[] zArr2 = this.G0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.O = true;
        int[] iArr2 = this.e0;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.R = -1;
        this.S = -1;
    }

    public void R1(int i2, int i3) {
        this.N0 = i2;
        this.O0 = i3;
    }

    public int S() {
        int i2;
        int i3 = this.K0;
        if (this.H0[1] == b.MATCH_CONSTRAINT) {
            if (this.d0 == 1) {
                i2 = Math.max(this.i0, i3);
            } else {
                i2 = this.i0;
                if (i2 > 0) {
                    this.K0 = i2;
                } else {
                    i2 = 0;
                }
            }
            int i4 = this.j0;
            return (i4 <= 0 || i4 >= i2) ? i2 : i4;
        }
        return i3;
    }

    public void S0() {
        U0();
        V1(F);
        A1(F);
    }

    public void S1(zb zbVar) {
        this.I0 = zbVar;
    }

    public int T() {
        int i2;
        int i3 = this.J0;
        if (this.H0[0] == b.MATCH_CONSTRAINT) {
            if (this.c0 == 1) {
                i2 = Math.max(this.f0, i3);
            } else {
                i2 = this.f0;
                if (i2 > 0) {
                    this.J0 = i2;
                } else {
                    i2 = 0;
                }
            }
            int i4 = this.g0;
            return (i4 <= 0 || i4 >= i2) ? i2 : i4;
        }
        return i3;
    }

    public void T0(yb ybVar) {
        if (U() != null && (U() instanceof ac) && ((ac) U()).K2()) {
            return;
        }
        yb r2 = r(yb.b.LEFT);
        yb r3 = r(yb.b.RIGHT);
        yb r4 = r(yb.b.TOP);
        yb r5 = r(yb.b.BOTTOM);
        yb r6 = r(yb.b.CENTER);
        yb r7 = r(yb.b.CENTER_X);
        yb r8 = r(yb.b.CENTER_Y);
        if (ybVar == r6) {
            if (r2.p() && r3.p() && r2.k() == r3.k()) {
                r2.x();
                r3.x();
            }
            if (r4.p() && r5.p() && r4.k() == r5.k()) {
                r4.x();
                r5.x();
            }
            this.W0 = 0.5f;
            this.X0 = 0.5f;
        } else if (ybVar == r7) {
            if (r2.p() && r3.p() && r2.k().i() == r3.k().i()) {
                r2.x();
                r3.x();
            }
            this.W0 = 0.5f;
        } else if (ybVar == r8) {
            if (r4.p() && r5.p() && r4.k().i() == r5.k().i()) {
                r4.x();
                r5.x();
            }
            this.X0 = 0.5f;
        } else if (ybVar != r2 && ybVar != r3) {
            if ((ybVar == r4 || ybVar == r5) && r4.p() && r4.k() == r5.k()) {
                r6.x();
            }
        } else if (r2.p() && r2.k() == r3.k()) {
            r6.x();
        }
        ybVar.x();
    }

    public void T1(int i2, int i3) {
        if (i3 == 0) {
            this.P0 = i2;
        } else if (i3 == 1) {
            this.Q0 = i2;
        }
    }

    public zb U() {
        return this.I0;
    }

    public void U0() {
        zb U = U();
        if (U != null && (U instanceof ac) && ((ac) U()).K2()) {
            return;
        }
        int size = this.F0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.F0.get(i2).x();
        }
    }

    public void U1(String str) {
        this.d1 = str;
    }

    public zb V(int i2) {
        yb ybVar;
        yb ybVar2;
        if (i2 != 0) {
            if (i2 == 1 && (ybVar2 = (ybVar = this.x0).h) != null && ybVar2.h == ybVar) {
                return ybVar2.f;
            }
            return null;
        }
        yb ybVar3 = this.w0;
        yb ybVar4 = ybVar3.h;
        if (ybVar4 == null || ybVar4.h != ybVar3) {
            return null;
        }
        return ybVar4.f;
    }

    public void V0() {
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        int size = this.F0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.F0.get(i2).y();
        }
    }

    public void V1(float f2) {
        this.X0 = f2;
    }

    public int W(int i2) {
        if (i2 == 0) {
            return this.P0;
        }
        if (i2 == 1) {
            return this.Q0;
        }
        return 0;
    }

    public void W0(g8 g8Var) {
        this.w0.z(g8Var);
        this.x0.z(g8Var);
        this.y0.z(g8Var);
        this.z0.z(g8Var);
        this.A0.z(g8Var);
        this.D0.z(g8Var);
        this.B0.z(g8Var);
        this.C0.z(g8Var);
    }

    public void W1(int i2) {
        this.q1 = i2;
    }

    public int X() {
        return o0() + this.J0;
    }

    public void X0() {
        this.X = false;
        this.Y = false;
    }

    public void X1(int i2, int i3) {
        this.O0 = i2;
        int i4 = i3 - i2;
        this.K0 = i4;
        int i5 = this.V0;
        if (i4 < i5) {
            this.K0 = i5;
        }
    }

    public int Y() {
        return this.N0 + this.R0;
    }

    public StringBuilder Y0(StringBuilder sb) {
        sb.append("{\n");
        Z0(sb, "left", this.w0);
        Z0(sb, "top", this.x0);
        Z0(sb, "right", this.y0);
        Z0(sb, "bottom", this.z0);
        Z0(sb, "baseline", this.A0);
        Z0(sb, "centerX", this.B0);
        Z0(sb, "centerY", this.C0);
        c1(sb, this.D0, this.q0);
        e1(sb, "width", this.J0, this.U0, this.p0[0], this.R, this.f0, this.c0, this.h0, this.t1[0]);
        e1(sb, "height", this.K0, this.V0, this.p0[1], this.S, this.i0, this.d0, this.k0, this.t1[1]);
        d1(sb, "dimensionRatio", this.L0, this.M0);
        a1(sb, "horizontalBias", this.W0, F);
        a1(sb, "verticalBias", this.X0, F);
        sb.append("}\n");
        return sb;
    }

    public void Y1(b bVar) {
        this.H0[1] = bVar;
    }

    public int Z() {
        return this.O0 + this.S0;
    }

    public void Z1(int i2, int i3, int i4, float f2) {
        this.d0 = i2;
        this.i0 = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.j0 = i4;
        this.k0 = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
            return;
        }
        this.d0 = 2;
    }

    public zc a0(int i2) {
        if (i2 == 0) {
            return this.K;
        }
        if (i2 == 1) {
            return this.L;
        }
        return null;
    }

    public void a2(float f2) {
        this.t1[1] = f2;
    }

    public void b0(StringBuilder sb) {
        StringBuilder G = wo1.G(g54.A);
        G.append(this.U);
        G.append(":{\n");
        sb.append(G.toString());
        sb.append("    actualWidth:" + this.J0);
        sb.append("\n");
        sb.append("    actualHeight:" + this.K0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.N0);
        sb.append("\n");
        sb.append("    actualTop:" + this.O0);
        sb.append("\n");
        d0(sb, "left", this.w0);
        d0(sb, "top", this.x0);
        d0(sb, "right", this.y0);
        d0(sb, "bottom", this.z0);
        d0(sb, "baseline", this.A0);
        d0(sb, "centerX", this.B0);
        d0(sb, "centerY", this.C0);
        c0(sb, "    width", this.J0, this.U0, this.p0[0], this.R, this.f0, this.c0, this.h0, this.t1[0]);
        c0(sb, "    height", this.K0, this.V0, this.p0[1], this.S, this.i0, this.d0, this.k0, this.t1[1]);
        d1(sb, "    dimensionRatio", this.L0, this.M0);
        a1(sb, "    horizontalBias", this.W0, F);
        a1(sb, "    verticalBias", this.X0, F);
        b1(sb, "    horizontalChainStyle", this.p1, 0);
        b1(sb, "    verticalChainStyle", this.q1, 0);
        sb.append("  }");
    }

    public void b2(int i2) {
        this.a1 = i2;
    }

    public void c2(int i2) {
        this.J0 = i2;
        int i3 = this.U0;
        if (i2 < i3) {
            this.J0 = i3;
        }
    }

    public void d2(boolean z2) {
        this.l0 = z2;
    }

    public void e(ac acVar, i8 i8Var, HashSet<zb> hashSet, int i2, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            fc.a(acVar, i8Var, this);
            hashSet.remove(this);
            g(i8Var, acVar.S2(64));
        }
        if (i2 == 0) {
            HashSet<yb> e2 = this.w0.e();
            if (e2 != null) {
                Iterator<yb> it = e2.iterator();
                while (it.hasNext()) {
                    it.next().f.e(acVar, i8Var, hashSet, i2, true);
                }
            }
            HashSet<yb> e3 = this.y0.e();
            if (e3 != null) {
                Iterator<yb> it2 = e3.iterator();
                while (it2.hasNext()) {
                    it2.next().f.e(acVar, i8Var, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<yb> e4 = this.x0.e();
        if (e4 != null) {
            Iterator<yb> it3 = e4.iterator();
            while (it3.hasNext()) {
                it3.next().f.e(acVar, i8Var, hashSet, i2, true);
            }
        }
        HashSet<yb> e5 = this.z0.e();
        if (e5 != null) {
            Iterator<yb> it4 = e5.iterator();
            while (it4.hasNext()) {
                it4.next().f.e(acVar, i8Var, hashSet, i2, true);
            }
        }
        HashSet<yb> e6 = this.A0.e();
        if (e6 != null) {
            Iterator<yb> it5 = e6.iterator();
            while (it5.hasNext()) {
                it5.next().f.e(acVar, i8Var, hashSet, i2, true);
            }
        }
    }

    public int e0() {
        return p0();
    }

    public void e2(int i2) {
        if (i2 < 0 || i2 > 3) {
            return;
        }
        this.b0 = i2;
    }

    public boolean f() {
        return (this instanceof ic) || (this instanceof cc);
    }

    public String f0() {
        return this.d1;
    }

    public void f1(boolean z2) {
        this.b1 = z2;
    }

    public void f2(int i2) {
        this.N0 = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(i8 i8Var, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        zb zbVar;
        zb zbVar2;
        j8 j8Var;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        m8 m8Var;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        b bVar;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        b bVar2;
        b bVar3;
        m8 m8Var2;
        m8 m8Var3;
        m8 m8Var4;
        m8 m8Var5;
        m8 m8Var6;
        boolean z15;
        int i12;
        int i13;
        char c3;
        zb zbVar3;
        i8 i8Var2;
        m8 m8Var7;
        m8 m8Var8;
        m8 m8Var9;
        boolean z16;
        m8 m8Var10;
        m8 m8Var11;
        zb zbVar4;
        boolean z17;
        vc vcVar;
        pc pcVar;
        int i14;
        int i15;
        boolean B0;
        boolean D0;
        vc vcVar2;
        xc xcVar;
        pc pcVar2;
        boolean[] zArr;
        m8 u2 = i8Var.u(this.w0);
        m8 u3 = i8Var.u(this.y0);
        m8 u4 = i8Var.u(this.x0);
        m8 u5 = i8Var.u(this.z0);
        m8 u6 = i8Var.u(this.A0);
        zb zbVar5 = this.I0;
        if (zbVar5 != null) {
            boolean z18 = zbVar5 != null && zbVar5.H0[0] == b.WRAP_CONTENT;
            boolean z19 = zbVar5 != null && zbVar5.H0[1] == b.WRAP_CONTENT;
            int i16 = this.b0;
            if (i16 != 1) {
                if (i16 == 2) {
                    z4 = z19;
                    z3 = false;
                } else if (i16 != 3) {
                    z4 = z19;
                    z3 = z18;
                }
                if (this.a1 == 8 && !this.b1 && !s0()) {
                    zArr = this.G0;
                    if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                }
                z5 = this.V;
                if (!z5 || this.W) {
                    if (z5) {
                        i8Var.f(u2, this.N0);
                        i8Var.f(u3, this.N0 + this.J0);
                        if (z3 && (zbVar2 = this.I0) != null) {
                            if (this.Q) {
                                ac acVar = (ac) zbVar2;
                                acVar.u2(this.w0);
                                acVar.t2(this.y0);
                            } else {
                                i8Var.i(i8Var.u(zbVar2.y0), u3, 0, 5);
                            }
                        }
                    }
                    if (this.W) {
                        i8Var.f(u4, this.O0);
                        i8Var.f(u5, this.O0 + this.K0);
                        if (this.A0.n()) {
                            i8Var.f(u6, this.O0 + this.T0);
                        }
                        if (z4 && (zbVar = this.I0) != null) {
                            if (this.Q) {
                                ac acVar2 = (ac) zbVar;
                                acVar2.z2(this.x0);
                                acVar2.y2(this.z0);
                            } else {
                                i8Var.i(i8Var.u(zbVar.z0), u5, 0, 5);
                            }
                        }
                    }
                    if (this.V && this.W) {
                        this.V = false;
                        this.W = false;
                        return;
                    }
                }
                j8Var = i8.l;
                if (j8Var != null) {
                    j8Var.K++;
                }
                if (z2 && (vcVar2 = this.K) != null && (xcVar = this.L) != null) {
                    pcVar2 = vcVar2.h;
                    if (pcVar2.j && vcVar2.i.j && xcVar.h.j && xcVar.i.j) {
                        if (j8Var != null) {
                            j8Var.w++;
                        }
                        i8Var.f(u2, pcVar2.g);
                        i8Var.f(u3, this.K.i.g);
                        i8Var.f(u4, this.L.h.g);
                        i8Var.f(u5, this.L.i.g);
                        i8Var.f(u6, this.L.k.g);
                        if (this.I0 != null) {
                            if (z3 && this.M[0] && !B0()) {
                                i8Var.i(i8Var.u(this.I0.y0), u3, 0, 8);
                            }
                            if (z4 && this.M[1] && !D0()) {
                                i8Var.i(i8Var.u(this.I0.z0), u5, 0, 8);
                            }
                        }
                        this.V = false;
                        this.W = false;
                        return;
                    }
                }
                if (j8Var != null) {
                    j8Var.x++;
                }
                if (this.I0 != null) {
                    if (x0(0)) {
                        ((ac) this.I0).q2(this, 0);
                        B0 = true;
                    } else {
                        B0 = B0();
                    }
                    if (x0(1)) {
                        ((ac) this.I0).q2(this, 1);
                        D0 = true;
                    } else {
                        D0 = D0();
                    }
                    if (!B0 && z3 && this.a1 != 8 && this.w0.h == null && this.y0.h == null) {
                        i8Var.i(i8Var.u(this.I0.y0), u3, 0, 1);
                    }
                    if (!D0 && z4 && this.a1 != 8 && this.x0.h == null && this.z0.h == null && this.A0 == null) {
                        i8Var.i(i8Var.u(this.I0.z0), u5, 0, 1);
                    }
                    z7 = B0;
                    z6 = D0;
                } else {
                    z6 = false;
                    z7 = false;
                }
                i2 = this.J0;
                i3 = this.U0;
                if (i2 >= i3) {
                    i3 = i2;
                }
                i4 = this.K0;
                i5 = this.V0;
                if (i4 >= i5) {
                    i5 = i4;
                }
                b[] bVarArr = this.H0;
                b bVar4 = bVarArr[0];
                b bVar5 = b.MATCH_CONSTRAINT;
                int i17 = i3;
                boolean z20 = bVar4 != bVar5;
                int i18 = i5;
                boolean z21 = bVarArr[1] != bVar5;
                int i19 = this.M0;
                this.n0 = i19;
                f2 = this.L0;
                this.o0 = f2;
                int i20 = this.c0;
                int i21 = this.d0;
                if (f2 > 0.0f) {
                    m8Var = u2;
                    if (this.a1 != 8) {
                        if (bVarArr[0] == bVar5 && i20 == 0) {
                            i20 = 3;
                        }
                        if (bVarArr[1] == bVar5 && i21 == 0) {
                            i21 = 3;
                        }
                        if (bVarArr[0] == bVar5 && bVarArr[1] == bVar5) {
                            i15 = 3;
                            if (i20 == 3 && i21 == 3) {
                                h2(z3, z4, z20, z21);
                                c2 = 0;
                                i6 = i20;
                                i7 = i21;
                                i8 = i17;
                                i9 = i18;
                                z8 = true;
                                int[] iArr = this.e0;
                                iArr[c2] = i6;
                                iArr[1] = i7;
                                this.N = z8;
                                if (z8) {
                                    int i22 = this.n0;
                                    i10 = -1;
                                    if (i22 == 0 || i22 == -1) {
                                        z9 = true;
                                        boolean z22 = !z8 && ((i14 = this.n0) == 1 || i14 == i10);
                                        b bVar6 = this.H0[0];
                                        bVar = b.WRAP_CONTENT;
                                        z10 = bVar6 != bVar && (this instanceof ac);
                                        i11 = !z10 ? 0 : i8;
                                        z11 = !this.D0.p();
                                        boolean[] zArr2 = this.G0;
                                        z12 = zArr2[0];
                                        boolean z23 = zArr2[1];
                                        if (this.Z != 2 && !this.V) {
                                            if (z2 && (vcVar = this.K) != null) {
                                                pcVar = vcVar.h;
                                                if (pcVar.j && vcVar.i.j) {
                                                    if (!z2) {
                                                        m8 m8Var12 = m8Var;
                                                        i8Var.f(m8Var12, pcVar.g);
                                                        i8Var.f(u3, this.K.i.g);
                                                        if (this.I0 != null && z3 && this.M[0] && !B0()) {
                                                            i8Var.i(i8Var.u(this.I0.y0), u3, 0, 8);
                                                        }
                                                        z13 = z3;
                                                        z14 = z4;
                                                        bVar2 = bVar5;
                                                        bVar3 = bVar;
                                                        z15 = z8;
                                                        m8Var2 = u6;
                                                        m8Var3 = u5;
                                                        m8Var4 = u4;
                                                        m8Var5 = u3;
                                                        m8Var6 = m8Var12;
                                                        if (z2) {
                                                            zbVar3 = this;
                                                            xc xcVar2 = zbVar3.L;
                                                            if (xcVar2 != null) {
                                                                pc pcVar3 = xcVar2.h;
                                                                if (pcVar3.j && xcVar2.i.j) {
                                                                    i8Var2 = i8Var;
                                                                    m8Var9 = m8Var4;
                                                                    i8Var2.f(m8Var9, pcVar3.g);
                                                                    m8Var8 = m8Var3;
                                                                    i8Var2.f(m8Var8, zbVar3.L.i.g);
                                                                    m8Var7 = m8Var2;
                                                                    i8Var2.f(m8Var7, zbVar3.L.k.g);
                                                                    zb zbVar6 = zbVar3.I0;
                                                                    if (zbVar6 == null || z6 || !z14) {
                                                                        i12 = 8;
                                                                        i13 = 0;
                                                                        c3 = 1;
                                                                    } else {
                                                                        c3 = 1;
                                                                        if (zbVar3.M[1]) {
                                                                            i12 = 8;
                                                                            i13 = 0;
                                                                            i8Var2.i(i8Var2.u(zbVar6.z0), m8Var8, 0, 8);
                                                                        } else {
                                                                            i12 = 8;
                                                                            i13 = 0;
                                                                        }
                                                                    }
                                                                    z16 = false;
                                                                    if ((zbVar3.a0 != 2 ? false : z16) || zbVar3.W) {
                                                                        m8Var10 = m8Var8;
                                                                        m8Var11 = m8Var9;
                                                                    } else {
                                                                        boolean z24 = zbVar3.H0[c3] == bVar3 && (zbVar3 instanceof ac);
                                                                        if (z24) {
                                                                            i9 = 0;
                                                                        }
                                                                        zb zbVar7 = zbVar3.I0;
                                                                        m8 u7 = zbVar7 != null ? i8Var2.u(zbVar7.z0) : null;
                                                                        zb zbVar8 = zbVar3.I0;
                                                                        m8 u8 = zbVar8 != null ? i8Var2.u(zbVar8.x0) : null;
                                                                        if (zbVar3.T0 > 0 || zbVar3.a1 == i12) {
                                                                            yb ybVar = zbVar3.A0;
                                                                            if (ybVar.h != null) {
                                                                                i8Var2.e(m8Var7, m8Var9, t(), i12);
                                                                                i8Var2.e(m8Var7, i8Var2.u(zbVar3.A0.h), zbVar3.A0.g(), i12);
                                                                                if (z14) {
                                                                                    i8Var2.i(u7, i8Var2.u(zbVar3.z0), i13, 5);
                                                                                }
                                                                                z17 = false;
                                                                                boolean z25 = zbVar3.M[c3];
                                                                                b[] bVarArr2 = zbVar3.H0;
                                                                                m8Var10 = m8Var8;
                                                                                m8Var11 = m8Var9;
                                                                                i(i8Var, false, z14, z13, z25, u8, u7, bVarArr2[c3], z24, zbVar3.x0, zbVar3.z0, zbVar3.O0, i9, zbVar3.V0, zbVar3.p0[c3], zbVar3.X0, z22, bVarArr2[0] != bVar2, z6, z7, z23, i7, i6, zbVar3.i0, zbVar3.j0, zbVar3.k0, z17);
                                                                            } else if (zbVar3.a1 == i12) {
                                                                                i8Var2.e(m8Var7, m8Var9, ybVar.g(), i12);
                                                                            } else {
                                                                                i8Var2.e(m8Var7, m8Var9, t(), i12);
                                                                            }
                                                                        }
                                                                        z17 = z11;
                                                                        boolean z252 = zbVar3.M[c3];
                                                                        b[] bVarArr22 = zbVar3.H0;
                                                                        m8Var10 = m8Var8;
                                                                        m8Var11 = m8Var9;
                                                                        i(i8Var, false, z14, z13, z252, u8, u7, bVarArr22[c3], z24, zbVar3.x0, zbVar3.z0, zbVar3.O0, i9, zbVar3.V0, zbVar3.p0[c3], zbVar3.X0, z22, bVarArr22[0] != bVar2, z6, z7, z23, i7, i6, zbVar3.i0, zbVar3.j0, zbVar3.k0, z17);
                                                                    }
                                                                    if (z15) {
                                                                        zbVar4 = this;
                                                                    } else {
                                                                        zbVar4 = this;
                                                                        if (zbVar4.n0 == 1) {
                                                                            i8Var.l(m8Var10, m8Var11, m8Var5, m8Var6, zbVar4.o0, 8);
                                                                        } else {
                                                                            i8Var.l(m8Var5, m8Var6, m8Var10, m8Var11, zbVar4.o0, 8);
                                                                        }
                                                                    }
                                                                    if (zbVar4.D0.p()) {
                                                                        i8Var.b(zbVar4, zbVar4.D0.k().i(), (float) Math.toRadians(zbVar4.q0 + 90.0f), zbVar4.D0.g());
                                                                    }
                                                                    zbVar4.V = false;
                                                                    zbVar4.W = false;
                                                                }
                                                            }
                                                            i8Var2 = i8Var;
                                                            m8Var7 = m8Var2;
                                                            m8Var8 = m8Var3;
                                                            m8Var9 = m8Var4;
                                                            i12 = 8;
                                                            i13 = 0;
                                                            c3 = 1;
                                                        } else {
                                                            i12 = 8;
                                                            i13 = 0;
                                                            c3 = 1;
                                                            zbVar3 = this;
                                                            i8Var2 = i8Var;
                                                            m8Var7 = m8Var2;
                                                            m8Var8 = m8Var3;
                                                            m8Var9 = m8Var4;
                                                        }
                                                        z16 = true;
                                                        if (zbVar3.a0 != 2 ? false : z16) {
                                                        }
                                                        m8Var10 = m8Var8;
                                                        m8Var11 = m8Var9;
                                                        if (z15) {
                                                        }
                                                        if (zbVar4.D0.p()) {
                                                        }
                                                        zbVar4.V = false;
                                                        zbVar4.W = false;
                                                    }
                                                }
                                            }
                                            m8 m8Var13 = m8Var;
                                            zb zbVar9 = this.I0;
                                            m8 u9 = zbVar9 == null ? i8Var.u(zbVar9.y0) : null;
                                            zb zbVar10 = this.I0;
                                            m8 u10 = zbVar10 == null ? i8Var.u(zbVar10.w0) : null;
                                            boolean z26 = this.M[0];
                                            b[] bVarArr3 = this.H0;
                                            z13 = z3;
                                            z14 = z4;
                                            bVar2 = bVar5;
                                            m8Var2 = u6;
                                            m8Var3 = u5;
                                            m8Var4 = u4;
                                            m8Var5 = u3;
                                            bVar3 = bVar;
                                            m8Var6 = m8Var13;
                                            z15 = z8;
                                            i(i8Var, true, z3, z4, z26, u10, u9, bVarArr3[0], z10, this.w0, this.y0, this.N0, i11, this.U0, this.p0[0], this.W0, z9, bVarArr3[1] != bVar5, z7, z6, z12, i6, i7, this.f0, this.g0, this.h0, z11);
                                            if (z2) {
                                            }
                                            z16 = true;
                                            if (zbVar3.a0 != 2 ? false : z16) {
                                            }
                                            m8Var10 = m8Var8;
                                            m8Var11 = m8Var9;
                                            if (z15) {
                                            }
                                            if (zbVar4.D0.p()) {
                                            }
                                            zbVar4.V = false;
                                            zbVar4.W = false;
                                        }
                                        z13 = z3;
                                        z14 = z4;
                                        bVar2 = bVar5;
                                        bVar3 = bVar;
                                        m8Var2 = u6;
                                        m8Var3 = u5;
                                        m8Var4 = u4;
                                        m8Var5 = u3;
                                        m8Var6 = m8Var;
                                        z15 = z8;
                                        if (z2) {
                                        }
                                        z16 = true;
                                        if (zbVar3.a0 != 2 ? false : z16) {
                                        }
                                        m8Var10 = m8Var8;
                                        m8Var11 = m8Var9;
                                        if (z15) {
                                        }
                                        if (zbVar4.D0.p()) {
                                        }
                                        zbVar4.V = false;
                                        zbVar4.W = false;
                                    }
                                } else {
                                    i10 = -1;
                                }
                                z9 = false;
                                if (z8) {
                                }
                                b bVar62 = this.H0[0];
                                bVar = b.WRAP_CONTENT;
                                if (bVar62 != bVar) {
                                }
                                if (!z10) {
                                }
                                z11 = !this.D0.p();
                                boolean[] zArr22 = this.G0;
                                z12 = zArr22[0];
                                boolean z232 = zArr22[1];
                                if (this.Z != 2) {
                                    if (z2) {
                                        pcVar = vcVar.h;
                                        if (pcVar.j) {
                                            if (!z2) {
                                            }
                                        }
                                    }
                                    m8 m8Var132 = m8Var;
                                    zb zbVar92 = this.I0;
                                    if (zbVar92 == null) {
                                    }
                                    zb zbVar102 = this.I0;
                                    if (zbVar102 == null) {
                                    }
                                    boolean z262 = this.M[0];
                                    b[] bVarArr32 = this.H0;
                                    z13 = z3;
                                    z14 = z4;
                                    bVar2 = bVar5;
                                    m8Var2 = u6;
                                    m8Var3 = u5;
                                    m8Var4 = u4;
                                    m8Var5 = u3;
                                    bVar3 = bVar;
                                    m8Var6 = m8Var132;
                                    z15 = z8;
                                    i(i8Var, true, z3, z4, z262, u10, u9, bVarArr32[0], z10, this.w0, this.y0, this.N0, i11, this.U0, this.p0[0], this.W0, z9, bVarArr32[1] != bVar5, z7, z6, z12, i6, i7, this.f0, this.g0, this.h0, z11);
                                    if (z2) {
                                    }
                                    z16 = true;
                                    if (zbVar3.a0 != 2 ? false : z16) {
                                    }
                                    m8Var10 = m8Var8;
                                    m8Var11 = m8Var9;
                                    if (z15) {
                                    }
                                    if (zbVar4.D0.p()) {
                                    }
                                    zbVar4.V = false;
                                    zbVar4.W = false;
                                }
                                z13 = z3;
                                z14 = z4;
                                bVar2 = bVar5;
                                bVar3 = bVar;
                                m8Var2 = u6;
                                m8Var3 = u5;
                                m8Var4 = u4;
                                m8Var5 = u3;
                                m8Var6 = m8Var;
                                z15 = z8;
                                if (z2) {
                                }
                                z16 = true;
                                if (zbVar3.a0 != 2 ? false : z16) {
                                }
                                m8Var10 = m8Var8;
                                m8Var11 = m8Var9;
                                if (z15) {
                                }
                                if (zbVar4.D0.p()) {
                                }
                                zbVar4.V = false;
                                zbVar4.W = false;
                            }
                        } else {
                            i15 = 3;
                        }
                        if (bVarArr[0] == bVar5 && i20 == i15) {
                            this.n0 = 0;
                            i8 = (int) (f2 * i4);
                            if (bVarArr[1] != bVar5) {
                                i7 = i21;
                                i9 = i18;
                                c2 = 0;
                                z8 = false;
                                i6 = 4;
                                int[] iArr2 = this.e0;
                                iArr2[c2] = i6;
                                iArr2[1] = i7;
                                this.N = z8;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                b bVar622 = this.H0[0];
                                bVar = b.WRAP_CONTENT;
                                if (bVar622 != bVar) {
                                }
                                if (!z10) {
                                }
                                z11 = !this.D0.p();
                                boolean[] zArr222 = this.G0;
                                z12 = zArr222[0];
                                boolean z2322 = zArr222[1];
                                if (this.Z != 2) {
                                }
                                z13 = z3;
                                z14 = z4;
                                bVar2 = bVar5;
                                bVar3 = bVar;
                                m8Var2 = u6;
                                m8Var3 = u5;
                                m8Var4 = u4;
                                m8Var5 = u3;
                                m8Var6 = m8Var;
                                z15 = z8;
                                if (z2) {
                                }
                                z16 = true;
                                if (zbVar3.a0 != 2 ? false : z16) {
                                }
                                m8Var10 = m8Var8;
                                m8Var11 = m8Var9;
                                if (z15) {
                                }
                                if (zbVar4.D0.p()) {
                                }
                                zbVar4.V = false;
                                zbVar4.W = false;
                            }
                            i6 = i20;
                            i7 = i21;
                            i9 = i18;
                            c2 = 0;
                            z8 = true;
                            int[] iArr22 = this.e0;
                            iArr22[c2] = i6;
                            iArr22[1] = i7;
                            this.N = z8;
                            if (z8) {
                            }
                            z9 = false;
                            if (z8) {
                            }
                            b bVar6222 = this.H0[0];
                            bVar = b.WRAP_CONTENT;
                            if (bVar6222 != bVar) {
                            }
                            if (!z10) {
                            }
                            z11 = !this.D0.p();
                            boolean[] zArr2222 = this.G0;
                            z12 = zArr2222[0];
                            boolean z23222 = zArr2222[1];
                            if (this.Z != 2) {
                            }
                            z13 = z3;
                            z14 = z4;
                            bVar2 = bVar5;
                            bVar3 = bVar;
                            m8Var2 = u6;
                            m8Var3 = u5;
                            m8Var4 = u4;
                            m8Var5 = u3;
                            m8Var6 = m8Var;
                            z15 = z8;
                            if (z2) {
                            }
                            z16 = true;
                            if (zbVar3.a0 != 2 ? false : z16) {
                            }
                            m8Var10 = m8Var8;
                            m8Var11 = m8Var9;
                            if (z15) {
                            }
                            if (zbVar4.D0.p()) {
                            }
                            zbVar4.V = false;
                            zbVar4.W = false;
                        }
                        if (bVarArr[1] == bVar5 && i21 == 3) {
                            this.n0 = 1;
                            if (i19 == -1) {
                                this.o0 = 1.0f / f2;
                            }
                            int i23 = (int) (this.o0 * i2);
                            c2 = 0;
                            i9 = i23;
                            i6 = i20;
                            if (bVarArr[0] != bVar5) {
                                i8 = i17;
                                z8 = false;
                                i7 = 4;
                                int[] iArr222 = this.e0;
                                iArr222[c2] = i6;
                                iArr222[1] = i7;
                                this.N = z8;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                b bVar62222 = this.H0[0];
                                bVar = b.WRAP_CONTENT;
                                if (bVar62222 != bVar) {
                                }
                                if (!z10) {
                                }
                                z11 = !this.D0.p();
                                boolean[] zArr22222 = this.G0;
                                z12 = zArr22222[0];
                                boolean z232222 = zArr22222[1];
                                if (this.Z != 2) {
                                }
                                z13 = z3;
                                z14 = z4;
                                bVar2 = bVar5;
                                bVar3 = bVar;
                                m8Var2 = u6;
                                m8Var3 = u5;
                                m8Var4 = u4;
                                m8Var5 = u3;
                                m8Var6 = m8Var;
                                z15 = z8;
                                if (z2) {
                                }
                                z16 = true;
                                if (zbVar3.a0 != 2 ? false : z16) {
                                }
                                m8Var10 = m8Var8;
                                m8Var11 = m8Var9;
                                if (z15) {
                                }
                                if (zbVar4.D0.p()) {
                                }
                                zbVar4.V = false;
                                zbVar4.W = false;
                            }
                            i7 = i21;
                            i8 = i17;
                            z8 = true;
                            int[] iArr2222 = this.e0;
                            iArr2222[c2] = i6;
                            iArr2222[1] = i7;
                            this.N = z8;
                            if (z8) {
                            }
                            z9 = false;
                            if (z8) {
                            }
                            b bVar622222 = this.H0[0];
                            bVar = b.WRAP_CONTENT;
                            if (bVar622222 != bVar) {
                            }
                            if (!z10) {
                            }
                            z11 = !this.D0.p();
                            boolean[] zArr222222 = this.G0;
                            z12 = zArr222222[0];
                            boolean z2322222 = zArr222222[1];
                            if (this.Z != 2) {
                            }
                            z13 = z3;
                            z14 = z4;
                            bVar2 = bVar5;
                            bVar3 = bVar;
                            m8Var2 = u6;
                            m8Var3 = u5;
                            m8Var4 = u4;
                            m8Var5 = u3;
                            m8Var6 = m8Var;
                            z15 = z8;
                            if (z2) {
                            }
                            z16 = true;
                            if (zbVar3.a0 != 2 ? false : z16) {
                            }
                            m8Var10 = m8Var8;
                            m8Var11 = m8Var9;
                            if (z15) {
                            }
                            if (zbVar4.D0.p()) {
                            }
                            zbVar4.V = false;
                            zbVar4.W = false;
                        }
                        c2 = 0;
                        i6 = i20;
                        i7 = i21;
                        i8 = i17;
                        i9 = i18;
                        z8 = true;
                        int[] iArr22222 = this.e0;
                        iArr22222[c2] = i6;
                        iArr22222[1] = i7;
                        this.N = z8;
                        if (z8) {
                        }
                        z9 = false;
                        if (z8) {
                        }
                        b bVar6222222 = this.H0[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar6222222 != bVar) {
                        }
                        if (!z10) {
                        }
                        z11 = !this.D0.p();
                        boolean[] zArr2222222 = this.G0;
                        z12 = zArr2222222[0];
                        boolean z23222222 = zArr2222222[1];
                        if (this.Z != 2) {
                        }
                        z13 = z3;
                        z14 = z4;
                        bVar2 = bVar5;
                        bVar3 = bVar;
                        m8Var2 = u6;
                        m8Var3 = u5;
                        m8Var4 = u4;
                        m8Var5 = u3;
                        m8Var6 = m8Var;
                        z15 = z8;
                        if (z2) {
                        }
                        z16 = true;
                        if (zbVar3.a0 != 2 ? false : z16) {
                        }
                        m8Var10 = m8Var8;
                        m8Var11 = m8Var9;
                        if (z15) {
                        }
                        if (zbVar4.D0.p()) {
                        }
                        zbVar4.V = false;
                        zbVar4.W = false;
                    }
                } else {
                    m8Var = u2;
                }
                c2 = 0;
                i6 = i20;
                i7 = i21;
                i8 = i17;
                i9 = i18;
                z8 = false;
                int[] iArr222222 = this.e0;
                iArr222222[c2] = i6;
                iArr222222[1] = i7;
                this.N = z8;
                if (z8) {
                }
                z9 = false;
                if (z8) {
                }
                b bVar62222222 = this.H0[0];
                bVar = b.WRAP_CONTENT;
                if (bVar62222222 != bVar) {
                }
                if (!z10) {
                }
                z11 = !this.D0.p();
                boolean[] zArr22222222 = this.G0;
                z12 = zArr22222222[0];
                boolean z232222222 = zArr22222222[1];
                if (this.Z != 2) {
                }
                z13 = z3;
                z14 = z4;
                bVar2 = bVar5;
                bVar3 = bVar;
                m8Var2 = u6;
                m8Var3 = u5;
                m8Var4 = u4;
                m8Var5 = u3;
                m8Var6 = m8Var;
                z15 = z8;
                if (z2) {
                }
                z16 = true;
                if (zbVar3.a0 != 2 ? false : z16) {
                }
                m8Var10 = m8Var8;
                m8Var11 = m8Var9;
                if (z15) {
                }
                if (zbVar4.D0.p()) {
                }
                zbVar4.V = false;
                zbVar4.W = false;
            }
            z3 = z18;
            z4 = false;
            if (this.a1 == 8) {
                zArr = this.G0;
                if (!zArr[0]) {
                    return;
                }
            }
            z5 = this.V;
            if (!z5) {
            }
            if (z5) {
            }
            if (this.W) {
            }
            if (this.V) {
                this.V = false;
                this.W = false;
                return;
            }
            j8Var = i8.l;
            if (j8Var != null) {
            }
            if (z2) {
                pcVar2 = vcVar2.h;
                if (pcVar2.j) {
                    if (j8Var != null) {
                    }
                    i8Var.f(u2, pcVar2.g);
                    i8Var.f(u3, this.K.i.g);
                    i8Var.f(u4, this.L.h.g);
                    i8Var.f(u5, this.L.i.g);
                    i8Var.f(u6, this.L.k.g);
                    if (this.I0 != null) {
                    }
                    this.V = false;
                    this.W = false;
                    return;
                }
            }
            if (j8Var != null) {
            }
            if (this.I0 != null) {
            }
            i2 = this.J0;
            i3 = this.U0;
            if (i2 >= i3) {
            }
            i4 = this.K0;
            i5 = this.V0;
            if (i4 >= i5) {
            }
            b[] bVarArr4 = this.H0;
            b bVar42 = bVarArr4[0];
            b bVar52 = b.MATCH_CONSTRAINT;
            int i172 = i3;
            if (bVar42 != bVar52) {
            }
            int i182 = i5;
            if (bVarArr4[1] != bVar52) {
            }
            int i192 = this.M0;
            this.n0 = i192;
            f2 = this.L0;
            this.o0 = f2;
            int i202 = this.c0;
            int i212 = this.d0;
            if (f2 > 0.0f) {
            }
            c2 = 0;
            i6 = i202;
            i7 = i212;
            i8 = i172;
            i9 = i182;
            z8 = false;
            int[] iArr2222222 = this.e0;
            iArr2222222[c2] = i6;
            iArr2222222[1] = i7;
            this.N = z8;
            if (z8) {
            }
            z9 = false;
            if (z8) {
            }
            b bVar622222222 = this.H0[0];
            bVar = b.WRAP_CONTENT;
            if (bVar622222222 != bVar) {
            }
            if (!z10) {
            }
            z11 = !this.D0.p();
            boolean[] zArr222222222 = this.G0;
            z12 = zArr222222222[0];
            boolean z2322222222 = zArr222222222[1];
            if (this.Z != 2) {
            }
            z13 = z3;
            z14 = z4;
            bVar2 = bVar52;
            bVar3 = bVar;
            m8Var2 = u6;
            m8Var3 = u5;
            m8Var4 = u4;
            m8Var5 = u3;
            m8Var6 = m8Var;
            z15 = z8;
            if (z2) {
            }
            z16 = true;
            if (zbVar3.a0 != 2 ? false : z16) {
            }
            m8Var10 = m8Var8;
            m8Var11 = m8Var9;
            if (z15) {
            }
            if (zbVar4.D0.p()) {
            }
            zbVar4.V = false;
            zbVar4.W = false;
        }
        z3 = false;
        z4 = false;
        if (this.a1 == 8) {
        }
        z5 = this.V;
        if (!z5) {
        }
        if (z5) {
        }
        if (this.W) {
        }
        if (this.V) {
        }
        j8Var = i8.l;
        if (j8Var != null) {
        }
        if (z2) {
        }
        if (j8Var != null) {
        }
        if (this.I0 != null) {
        }
        i2 = this.J0;
        i3 = this.U0;
        if (i2 >= i3) {
        }
        i4 = this.K0;
        i5 = this.V0;
        if (i4 >= i5) {
        }
        b[] bVarArr42 = this.H0;
        b bVar422 = bVarArr42[0];
        b bVar522 = b.MATCH_CONSTRAINT;
        int i1722 = i3;
        if (bVar422 != bVar522) {
        }
        int i1822 = i5;
        if (bVarArr42[1] != bVar522) {
        }
        int i1922 = this.M0;
        this.n0 = i1922;
        f2 = this.L0;
        this.o0 = f2;
        int i2022 = this.c0;
        int i2122 = this.d0;
        if (f2 > 0.0f) {
        }
        c2 = 0;
        i6 = i2022;
        i7 = i2122;
        i8 = i1722;
        i9 = i1822;
        z8 = false;
        int[] iArr22222222 = this.e0;
        iArr22222222[c2] = i6;
        iArr22222222[1] = i7;
        this.N = z8;
        if (z8) {
        }
        z9 = false;
        if (z8) {
        }
        b bVar6222222222 = this.H0[0];
        bVar = b.WRAP_CONTENT;
        if (bVar6222222222 != bVar) {
        }
        if (!z10) {
        }
        z11 = !this.D0.p();
        boolean[] zArr2222222222 = this.G0;
        z12 = zArr2222222222[0];
        boolean z23222222222 = zArr2222222222[1];
        if (this.Z != 2) {
        }
        z13 = z3;
        z14 = z4;
        bVar2 = bVar522;
        bVar3 = bVar;
        m8Var2 = u6;
        m8Var3 = u5;
        m8Var4 = u4;
        m8Var5 = u3;
        m8Var6 = m8Var;
        z15 = z8;
        if (z2) {
        }
        z16 = true;
        if (zbVar3.a0 != 2 ? false : z16) {
        }
        m8Var10 = m8Var8;
        m8Var11 = m8Var9;
        if (z15) {
        }
        if (zbVar4.D0.p()) {
        }
        zbVar4.V = false;
        zbVar4.W = false;
    }

    public float g0() {
        return this.X0;
    }

    public void g1(int i2) {
        this.T0 = i2;
        this.r0 = i2 > 0;
    }

    public void g2(int i2) {
        this.O0 = i2;
    }

    public boolean h() {
        return this.a1 != 8;
    }

    public zb h0() {
        if (D0()) {
            zb zbVar = this;
            zb zbVar2 = null;
            while (zbVar2 == null && zbVar != null) {
                yb r2 = zbVar.r(yb.b.TOP);
                yb k2 = r2 == null ? null : r2.k();
                zb i2 = k2 == null ? null : k2.i();
                if (i2 == U()) {
                    return zbVar;
                }
                yb k3 = i2 == null ? null : i2.r(yb.b.BOTTOM).k();
                if (k3 == null || k3.i() == zbVar) {
                    zbVar = i2;
                } else {
                    zbVar2 = zbVar;
                }
            }
            return zbVar2;
        }
        return null;
    }

    public void h1(Object obj) {
        this.Y0 = obj;
    }

    public void h2(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.n0 == -1) {
            if (z4 && !z5) {
                this.n0 = 0;
            } else if (!z4 && z5) {
                this.n0 = 1;
                if (this.M0 == -1) {
                    this.o0 = 1.0f / this.o0;
                }
            }
        }
        if (this.n0 == 0 && (!this.x0.p() || !this.z0.p())) {
            this.n0 = 1;
        } else if (this.n0 == 1 && (!this.w0.p() || !this.y0.p())) {
            this.n0 = 0;
        }
        if (this.n0 == -1 && (!this.x0.p() || !this.z0.p() || !this.w0.p() || !this.y0.p())) {
            if (this.x0.p() && this.z0.p()) {
                this.n0 = 0;
            } else if (this.w0.p() && this.y0.p()) {
                this.o0 = 1.0f / this.o0;
                this.n0 = 1;
            }
        }
        if (this.n0 == -1) {
            int i2 = this.f0;
            if (i2 > 0 && this.i0 == 0) {
                this.n0 = 0;
            } else if (i2 != 0 || this.i0 <= 0) {
            } else {
                this.o0 = 1.0f / this.o0;
                this.n0 = 1;
            }
        }
    }

    public int i0() {
        return this.q1;
    }

    public void i1(int i2) {
        if (i2 >= 0) {
            this.Z0 = i2;
        } else {
            this.Z0 = 0;
        }
    }

    public void i2(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean m2 = z2 & this.K.m();
        boolean m3 = z3 & this.L.m();
        vc vcVar = this.K;
        int i4 = vcVar.h.g;
        xc xcVar = this.L;
        int i5 = xcVar.h.g;
        int i6 = vcVar.i.g;
        int i7 = xcVar.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (m2) {
            this.N0 = i4;
        }
        if (m3) {
            this.O0 = i5;
        }
        if (this.a1 == 8) {
            this.J0 = 0;
            this.K0 = 0;
            return;
        }
        if (m2) {
            if (this.H0[0] == b.FIXED && i9 < (i3 = this.J0)) {
                i9 = i3;
            }
            this.J0 = i9;
            int i11 = this.U0;
            if (i9 < i11) {
                this.J0 = i11;
            }
        }
        if (m3) {
            if (this.H0[1] == b.FIXED && i10 < (i2 = this.K0)) {
                i10 = i2;
            }
            this.K0 = i10;
            int i12 = this.V0;
            if (i10 < i12) {
                this.K0 = i12;
            }
        }
    }

    public void j(yb.b bVar, zb zbVar, yb.b bVar2) {
        k(bVar, zbVar, bVar2, 0);
    }

    public b j0() {
        return this.H0[1];
    }

    public void j1(String str) {
        this.c1 = str;
    }

    public void j2(i8 i8Var, boolean z2) {
        xc xcVar;
        vc vcVar;
        int O = i8Var.O(this.w0);
        int O2 = i8Var.O(this.x0);
        int O3 = i8Var.O(this.y0);
        int O4 = i8Var.O(this.z0);
        if (z2 && (vcVar = this.K) != null) {
            pc pcVar = vcVar.h;
            if (pcVar.j) {
                pc pcVar2 = vcVar.i;
                if (pcVar2.j) {
                    O = pcVar.g;
                    O3 = pcVar2.g;
                }
            }
        }
        if (z2 && (xcVar = this.L) != null) {
            pc pcVar3 = xcVar.h;
            if (pcVar3.j) {
                pc pcVar4 = xcVar.i;
                if (pcVar4.j) {
                    O2 = pcVar3.g;
                    O4 = pcVar4.g;
                }
            }
        }
        int i2 = O4 - O2;
        if (O3 - O < 0 || i2 < 0 || O == Integer.MIN_VALUE || O == Integer.MAX_VALUE || O2 == Integer.MIN_VALUE || O2 == Integer.MAX_VALUE || O3 == Integer.MIN_VALUE || O3 == Integer.MAX_VALUE || O4 == Integer.MIN_VALUE || O4 == Integer.MAX_VALUE) {
            O4 = 0;
            O = 0;
            O2 = 0;
            O3 = 0;
        }
        v1(O, O2, O3, O4);
    }

    public void k(yb.b bVar, zb zbVar, yb.b bVar2, int i2) {
        yb.b bVar3;
        yb.b bVar4;
        boolean z2;
        yb.b bVar5 = yb.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 == bVar5) {
                yb.b bVar6 = yb.b.LEFT;
                yb r2 = r(bVar6);
                yb.b bVar7 = yb.b.RIGHT;
                yb r3 = r(bVar7);
                yb.b bVar8 = yb.b.TOP;
                yb r4 = r(bVar8);
                yb.b bVar9 = yb.b.BOTTOM;
                yb r5 = r(bVar9);
                boolean z3 = true;
                if ((r2 == null || !r2.p()) && (r3 == null || !r3.p())) {
                    k(bVar6, zbVar, bVar6, 0);
                    k(bVar7, zbVar, bVar7, 0);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((r4 == null || !r4.p()) && (r5 == null || !r5.p())) {
                    k(bVar8, zbVar, bVar8, 0);
                    k(bVar9, zbVar, bVar9, 0);
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    r(bVar5).a(zbVar.r(bVar5), 0);
                    return;
                } else if (z2) {
                    yb.b bVar10 = yb.b.CENTER_X;
                    r(bVar10).a(zbVar.r(bVar10), 0);
                    return;
                } else if (z3) {
                    yb.b bVar11 = yb.b.CENTER_Y;
                    r(bVar11).a(zbVar.r(bVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            yb.b bVar12 = yb.b.LEFT;
            if (bVar2 != bVar12 && bVar2 != yb.b.RIGHT) {
                yb.b bVar13 = yb.b.TOP;
                if (bVar2 == bVar13 || bVar2 == yb.b.BOTTOM) {
                    k(bVar13, zbVar, bVar2, 0);
                    k(yb.b.BOTTOM, zbVar, bVar2, 0);
                    r(bVar5).a(zbVar.r(bVar2), 0);
                    return;
                }
                return;
            }
            k(bVar12, zbVar, bVar2, 0);
            k(yb.b.RIGHT, zbVar, bVar2, 0);
            r(bVar5).a(zbVar.r(bVar2), 0);
            return;
        }
        yb.b bVar14 = yb.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = yb.b.LEFT) || bVar2 == yb.b.RIGHT)) {
            yb r6 = r(bVar4);
            yb r7 = zbVar.r(bVar2);
            yb r8 = r(yb.b.RIGHT);
            r6.a(r7, 0);
            r8.a(r7, 0);
            r(bVar14).a(r7, 0);
            return;
        }
        yb.b bVar15 = yb.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = yb.b.TOP) || bVar2 == yb.b.BOTTOM)) {
            yb r9 = zbVar.r(bVar2);
            r(bVar3).a(r9, 0);
            r(yb.b.BOTTOM).a(r9, 0);
            r(bVar15).a(r9, 0);
        } else if (bVar == bVar14 && bVar2 == bVar14) {
            yb.b bVar16 = yb.b.LEFT;
            r(bVar16).a(zbVar.r(bVar16), 0);
            yb.b bVar17 = yb.b.RIGHT;
            r(bVar17).a(zbVar.r(bVar17), 0);
            r(bVar14).a(zbVar.r(bVar2), 0);
        } else if (bVar == bVar15 && bVar2 == bVar15) {
            yb.b bVar18 = yb.b.TOP;
            r(bVar18).a(zbVar.r(bVar18), 0);
            yb.b bVar19 = yb.b.BOTTOM;
            r(bVar19).a(zbVar.r(bVar19), 0);
            r(bVar15).a(zbVar.r(bVar2), 0);
        } else {
            yb r10 = r(bVar);
            yb r11 = zbVar.r(bVar2);
            if (r10.v(r11)) {
                yb.b bVar20 = yb.b.BASELINE;
                if (bVar == bVar20) {
                    yb r12 = r(yb.b.TOP);
                    yb r13 = r(yb.b.BOTTOM);
                    if (r12 != null) {
                        r12.x();
                    }
                    if (r13 != null) {
                        r13.x();
                    }
                } else if (bVar != yb.b.TOP && bVar != yb.b.BOTTOM) {
                    if (bVar == yb.b.LEFT || bVar == yb.b.RIGHT) {
                        yb r14 = r(bVar5);
                        if (r14.k() != r11) {
                            r14.x();
                        }
                        yb h2 = r(bVar).h();
                        yb r15 = r(bVar14);
                        if (r15.p()) {
                            h2.x();
                            r15.x();
                        }
                    }
                } else {
                    yb r16 = r(bVar20);
                    if (r16 != null) {
                        r16.x();
                    }
                    yb r17 = r(bVar5);
                    if (r17.k() != r11) {
                        r17.x();
                    }
                    yb h3 = r(bVar).h();
                    yb r18 = r(bVar15);
                    if (r18.p()) {
                        h3.x();
                        r18.x();
                    }
                }
                r10.a(r11, i2);
            }
        }
    }

    public int k0() {
        int i2 = this.w0 != null ? 0 + this.x0.i : 0;
        return this.y0 != null ? i2 + this.z0.i : i2;
    }

    public void k1(i8 i8Var, String str) {
        this.c1 = str;
        m8 u2 = i8Var.u(this.w0);
        m8 u3 = i8Var.u(this.x0);
        m8 u4 = i8Var.u(this.y0);
        m8 u5 = i8Var.u(this.z0);
        u2.j(str + ".left");
        u3.j(str + ".top");
        u4.j(str + ".right");
        u5.j(str + ".bottom");
        m8 u6 = i8Var.u(this.A0);
        u6.j(str + ".baseline");
    }

    public void l(yb ybVar, yb ybVar2, int i2) {
        if (ybVar.i() == this) {
            k(ybVar.l(), ybVar2.i(), ybVar2.l(), i2);
        }
    }

    public int l0() {
        return this.a1;
    }

    public void l1(int i2, int i3) {
        this.J0 = i2;
        int i4 = this.U0;
        if (i2 < i4) {
            this.J0 = i4;
        }
        this.K0 = i3;
        int i5 = this.V0;
        if (i3 < i5) {
            this.K0 = i5;
        }
    }

    public void m(zb zbVar, float f2, int i2) {
        yb.b bVar = yb.b.CENTER;
        v0(bVar, zbVar, bVar, i2, 0);
        this.q0 = f2;
    }

    public int m0() {
        if (this.a1 == 8) {
            return 0;
        }
        return this.J0;
    }

    public void m1(float f2, int i2) {
        this.L0 = f2;
        this.M0 = i2;
    }

    public void n(zb zbVar, HashMap<zb, zb> hashMap) {
        this.Z = zbVar.Z;
        this.a0 = zbVar.a0;
        this.c0 = zbVar.c0;
        this.d0 = zbVar.d0;
        int[] iArr = this.e0;
        int[] iArr2 = zbVar.e0;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f0 = zbVar.f0;
        this.g0 = zbVar.g0;
        this.i0 = zbVar.i0;
        this.j0 = zbVar.j0;
        this.k0 = zbVar.k0;
        this.l0 = zbVar.l0;
        this.m0 = zbVar.m0;
        this.n0 = zbVar.n0;
        this.o0 = zbVar.o0;
        int[] iArr3 = zbVar.p0;
        this.p0 = Arrays.copyOf(iArr3, iArr3.length);
        this.q0 = zbVar.q0;
        this.r0 = zbVar.r0;
        this.s0 = zbVar.s0;
        this.w0.x();
        this.x0.x();
        this.y0.x();
        this.z0.x();
        this.A0.x();
        this.B0.x();
        this.C0.x();
        this.D0.x();
        this.H0 = (b[]) Arrays.copyOf(this.H0, 2);
        this.I0 = this.I0 == null ? null : hashMap.get(zbVar.I0);
        this.J0 = zbVar.J0;
        this.K0 = zbVar.K0;
        this.L0 = zbVar.L0;
        this.M0 = zbVar.M0;
        this.N0 = zbVar.N0;
        this.O0 = zbVar.O0;
        this.P0 = zbVar.P0;
        this.Q0 = zbVar.Q0;
        this.R0 = zbVar.R0;
        this.S0 = zbVar.S0;
        this.T0 = zbVar.T0;
        this.U0 = zbVar.U0;
        this.V0 = zbVar.V0;
        this.W0 = zbVar.W0;
        this.X0 = zbVar.X0;
        this.Y0 = zbVar.Y0;
        this.Z0 = zbVar.Z0;
        this.a1 = zbVar.a1;
        this.b1 = zbVar.b1;
        this.c1 = zbVar.c1;
        this.d1 = zbVar.d1;
        this.e1 = zbVar.e1;
        this.f1 = zbVar.f1;
        this.g1 = zbVar.g1;
        this.h1 = zbVar.h1;
        this.i1 = zbVar.i1;
        this.j1 = zbVar.j1;
        this.k1 = zbVar.k1;
        this.l1 = zbVar.l1;
        this.m1 = zbVar.m1;
        this.n1 = zbVar.n1;
        this.p1 = zbVar.p1;
        this.q1 = zbVar.q1;
        this.r1 = zbVar.r1;
        this.s1 = zbVar.s1;
        float[] fArr = this.t1;
        float[] fArr2 = zbVar.t1;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        zb[] zbVarArr = this.u1;
        zb[] zbVarArr2 = zbVar.u1;
        zbVarArr[0] = zbVarArr2[0];
        zbVarArr[1] = zbVarArr2[1];
        zb[] zbVarArr3 = this.v1;
        zb[] zbVarArr4 = zbVar.v1;
        zbVarArr3[0] = zbVarArr4[0];
        zbVarArr3[1] = zbVarArr4[1];
        zb zbVar2 = zbVar.w1;
        this.w1 = zbVar2 == null ? null : hashMap.get(zbVar2);
        zb zbVar3 = zbVar.x1;
        this.x1 = zbVar3 != null ? hashMap.get(zbVar3) : null;
    }

    public int n0() {
        return this.b0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please submit an issue!!! */
    public void n1(String str) {
        float f2;
        int i2 = 0;
        if (str != null && str.length() != 0) {
            int i3 = -1;
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i4 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(bx.y4)) {
                    i3 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i3 = 1;
                }
                i4 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                String substring2 = str.substring(i4, indexOf2);
                String substring3 = str.substring(indexOf2 + 1);
                if (substring2.length() > 0 && substring3.length() > 0) {
                    float parseFloat = Float.parseFloat(substring2);
                    float parseFloat2 = Float.parseFloat(substring3);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        if (i3 == 1) {
                            f2 = Math.abs(parseFloat2 / parseFloat);
                        } else {
                            f2 = Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
                f2 = 0.0f;
            } else {
                String substring4 = str.substring(i4);
                if (substring4.length() > 0) {
                    f2 = Float.parseFloat(substring4);
                }
                f2 = 0.0f;
            }
            i2 = (f2 > i2 ? 1 : (f2 == i2 ? 0 : -1));
            if (i2 > 0) {
                this.L0 = f2;
                this.M0 = i3;
                return;
            }
            return;
        }
        this.L0 = 0.0f;
    }

    public void o(i8 i8Var) {
        i8Var.u(this.w0);
        i8Var.u(this.x0);
        i8Var.u(this.y0);
        i8Var.u(this.z0);
        if (this.T0 > 0) {
            i8Var.u(this.A0);
        }
    }

    public int o0() {
        zb zbVar = this.I0;
        if (zbVar != null && (zbVar instanceof ac)) {
            return ((ac) zbVar).N1 + this.N0;
        }
        return this.N0;
    }

    public void o1(int i2) {
        if (this.r0) {
            int i3 = i2 - this.T0;
            int i4 = this.K0 + i3;
            this.O0 = i3;
            this.x0.A(i3);
            this.z0.A(i4);
            this.A0.A(i2);
            this.W = true;
        }
    }

    public void p() {
        this.O = true;
    }

    public int p0() {
        zb zbVar = this.I0;
        if (zbVar != null && (zbVar instanceof ac)) {
            return ((ac) zbVar).O1 + this.O0;
        }
        return this.O0;
    }

    public void p1(int i2, int i3, int i4, int i5, int i6, int i7) {
        v1(i2, i3, i4, i5);
        g1(i6);
        if (i7 == 0) {
            this.V = true;
            this.W = false;
        } else if (i7 == 1) {
            this.V = false;
            this.W = true;
        } else if (i7 == 2) {
            this.V = true;
            this.W = true;
        } else {
            this.V = false;
            this.W = false;
        }
    }

    public void q() {
        if (this.K == null) {
            this.K = new vc(this);
        }
        if (this.L == null) {
            this.L = new xc(this);
        }
    }

    public boolean q0() {
        return this.r0;
    }

    public void q1(int i2, int i3) {
        if (this.V) {
            return;
        }
        this.w0.A(i2);
        this.y0.A(i3);
        this.N0 = i2;
        this.J0 = i3 - i2;
        this.V = true;
    }

    public yb r(yb.b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.w0;
            case 2:
                return this.x0;
            case 3:
                return this.y0;
            case 4:
                return this.z0;
            case 5:
                return this.A0;
            case 6:
                return this.D0;
            case 7:
                return this.B0;
            case 8:
                return this.C0;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean r0(int i2) {
        if (i2 == 0) {
            return (this.w0.h != null ? 1 : 0) + (this.y0.h != null ? 1 : 0) < 2;
        }
        return ((this.x0.h != null ? 1 : 0) + (this.z0.h != null ? 1 : 0)) + (this.A0.h != null ? 1 : 0) < 2;
    }

    public void r1(int i2) {
        this.w0.A(i2);
        this.N0 = i2;
    }

    public ArrayList<yb> s() {
        return this.F0;
    }

    public boolean s0() {
        int size = this.F0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.F0.get(i2).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int i2) {
        this.x0.A(i2);
        this.O0 = i2;
    }

    public int t() {
        return this.T0;
    }

    public boolean t0() {
        return (this.R == -1 && this.S == -1) ? false : true;
    }

    public void t1(int i2, int i3) {
        if (this.W) {
            return;
        }
        this.x0.A(i2);
        this.z0.A(i3);
        this.O0 = i2;
        this.K0 = i3 - i2;
        if (this.r0) {
            this.A0.A(i2 + this.T0);
        }
        this.W = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d1 != null ? wo1.C(wo1.G("type: "), this.d1, " ") : "");
        sb.append(this.c1 != null ? wo1.C(wo1.G("id: "), this.c1, " ") : "");
        sb.append("(");
        sb.append(this.N0);
        sb.append(", ");
        sb.append(this.O0);
        sb.append(") - (");
        sb.append(this.J0);
        sb.append(" x ");
        return wo1.z(sb, this.K0, ")");
    }

    public float u(int i2) {
        if (i2 == 0) {
            return this.W0;
        }
        if (i2 == 1) {
            return this.X0;
        }
        return -1.0f;
    }

    public boolean u0(int i2, int i3) {
        yb ybVar;
        yb ybVar2;
        if (i2 == 0) {
            yb ybVar3 = this.w0.h;
            if (ybVar3 != null && ybVar3.o() && (ybVar2 = this.y0.h) != null && ybVar2.o()) {
                return (this.y0.h.f() - this.y0.g()) - (this.w0.g() + this.w0.h.f()) >= i3;
            }
        } else {
            yb ybVar4 = this.x0.h;
            if (ybVar4 != null && ybVar4.o() && (ybVar = this.z0.h) != null && ybVar.o()) {
                return (this.z0.h.f() - this.z0.g()) - (this.x0.g() + this.x0.h.f()) >= i3;
            }
        }
        return false;
    }

    public void u1(int i2, int i3, int i4) {
        if (i4 == 0) {
            C1(i2, i3);
        } else if (i4 == 1) {
            X1(i2, i3);
        }
    }

    public int v() {
        return p0() + this.K0;
    }

    public void v0(yb.b bVar, zb zbVar, yb.b bVar2, int i2, int i3) {
        r(bVar).b(zbVar.r(bVar2), i2, i3, true);
    }

    public void v1(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.N0 = i2;
        this.O0 = i3;
        if (this.a1 == 8) {
            this.J0 = 0;
            this.K0 = 0;
            return;
        }
        b[] bVarArr = this.H0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i8 < (i7 = this.J0)) {
            i8 = i7;
        }
        if (bVarArr[1] == bVar2 && i9 < (i6 = this.K0)) {
            i9 = i6;
        }
        this.J0 = i8;
        this.K0 = i9;
        int i10 = this.V0;
        if (i9 < i10) {
            this.K0 = i10;
        }
        int i11 = this.U0;
        if (i8 < i11) {
            this.J0 = i11;
        }
        int i12 = this.g0;
        if (i12 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.J0 = Math.min(this.J0, i12);
        }
        int i13 = this.j0;
        if (i13 > 0 && this.H0[1] == b.MATCH_CONSTRAINT) {
            this.K0 = Math.min(this.K0, i13);
        }
        int i14 = this.J0;
        if (i8 != i14) {
            this.R = i14;
        }
        int i15 = this.K0;
        if (i9 != i15) {
            this.S = i15;
        }
    }

    public Object w() {
        return this.Y0;
    }

    public boolean w0() {
        return this.b1;
    }

    public void w1(yb.b bVar, int i2) {
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            this.w0.j = i2;
        } else if (ordinal == 2) {
            this.x0.j = i2;
        } else if (ordinal == 3) {
            this.y0.j = i2;
        } else if (ordinal == 4) {
            this.z0.j = i2;
        } else if (ordinal != 5) {
        } else {
            this.A0.j = i2;
        }
    }

    public int x() {
        return this.Z0;
    }

    public void x1(boolean z2) {
        this.r0 = z2;
    }

    public String y() {
        return this.c1;
    }

    public boolean y0() {
        return this.m0;
    }

    public void y1(int i2) {
        this.K0 = i2;
        int i3 = this.V0;
        if (i2 < i3) {
            this.K0 = i3;
        }
    }

    public b z(int i2) {
        if (i2 == 0) {
            return H();
        }
        if (i2 == 1) {
            return j0();
        }
        return null;
    }

    public boolean z0() {
        return this.X;
    }

    public void z1(boolean z2) {
        this.m0 = z2;
    }

    public zb(String str) {
        this.G = false;
        this.H = new zc[2];
        this.K = null;
        this.L = null;
        this.M = new boolean[]{true, true};
        this.N = false;
        this.O = true;
        this.P = false;
        this.Q = true;
        this.R = -1;
        this.S = -1;
        this.T = new mb(this);
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = new int[2];
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 1.0f;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 1.0f;
        this.n0 = -1;
        this.o0 = 1.0f;
        this.p0 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.q0 = 0.0f;
        this.r0 = false;
        this.t0 = false;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = new yb(this, yb.b.LEFT);
        this.x0 = new yb(this, yb.b.TOP);
        this.y0 = new yb(this, yb.b.RIGHT);
        this.z0 = new yb(this, yb.b.BOTTOM);
        this.A0 = new yb(this, yb.b.BASELINE);
        this.B0 = new yb(this, yb.b.CENTER_X);
        this.C0 = new yb(this, yb.b.CENTER_Y);
        yb ybVar = new yb(this, yb.b.CENTER);
        this.D0 = ybVar;
        this.E0 = new yb[]{this.w0, this.y0, this.x0, this.z0, this.A0, ybVar};
        this.F0 = new ArrayList<>();
        this.G0 = new boolean[2];
        b bVar = b.FIXED;
        this.H0 = new b[]{bVar, bVar};
        this.I0 = null;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0.0f;
        this.M0 = -1;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        float f2 = F;
        this.W0 = f2;
        this.X0 = f2;
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = null;
        this.d1 = null;
        this.o1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.t1 = new float[]{-1.0f, -1.0f};
        this.u1 = new zb[]{null, null};
        this.v1 = new zb[]{null, null};
        this.w1 = null;
        this.x1 = null;
        this.y1 = -1;
        this.z1 = -1;
        d();
        j1(str);
    }

    public zb(int i2, int i3, int i4, int i5) {
        this.G = false;
        this.H = new zc[2];
        this.K = null;
        this.L = null;
        this.M = new boolean[]{true, true};
        this.N = false;
        this.O = true;
        this.P = false;
        this.Q = true;
        this.R = -1;
        this.S = -1;
        this.T = new mb(this);
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = new int[2];
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 1.0f;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 1.0f;
        this.n0 = -1;
        this.o0 = 1.0f;
        this.p0 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.q0 = 0.0f;
        this.r0 = false;
        this.t0 = false;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = new yb(this, yb.b.LEFT);
        this.x0 = new yb(this, yb.b.TOP);
        this.y0 = new yb(this, yb.b.RIGHT);
        this.z0 = new yb(this, yb.b.BOTTOM);
        this.A0 = new yb(this, yb.b.BASELINE);
        this.B0 = new yb(this, yb.b.CENTER_X);
        this.C0 = new yb(this, yb.b.CENTER_Y);
        yb ybVar = new yb(this, yb.b.CENTER);
        this.D0 = ybVar;
        this.E0 = new yb[]{this.w0, this.y0, this.x0, this.z0, this.A0, ybVar};
        this.F0 = new ArrayList<>();
        this.G0 = new boolean[2];
        b bVar = b.FIXED;
        this.H0 = new b[]{bVar, bVar};
        this.I0 = null;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = 0.0f;
        this.M0 = -1;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = 0;
        this.Q0 = 0;
        this.R0 = 0;
        this.S0 = 0;
        this.T0 = 0;
        float f2 = F;
        this.W0 = f2;
        this.X0 = f2;
        this.Z0 = 0;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = null;
        this.d1 = null;
        this.o1 = false;
        this.p1 = 0;
        this.q1 = 0;
        this.t1 = new float[]{-1.0f, -1.0f};
        this.u1 = new zb[]{null, null};
        this.v1 = new zb[]{null, null};
        this.w1 = null;
        this.x1 = null;
        this.y1 = -1;
        this.z1 = -1;
        this.N0 = i2;
        this.O0 = i3;
        this.J0 = i4;
        this.K0 = i5;
        d();
    }

    public zb(String str, int i2, int i3, int i4, int i5) {
        this(i2, i3, i4, i5);
        j1(str);
    }

    public zb(int i2, int i3) {
        this(0, 0, i2, i3);
    }

    public zb(String str, int i2, int i3) {
        this(i2, i3);
        j1(str);
    }
}