package com.p7700g.p99005;

import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class cc extends zb {
    public static final int A1 = 0;
    public static final int B1 = 1;
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final int E1 = 2;
    public static final int F1 = -1;
    public float G1 = -1.0f;
    public int H1 = -1;
    public int I1 = -1;
    public boolean J1 = true;
    private yb K1 = this.x0;
    private int L1 = 0;
    private int M1 = 0;
    private boolean N1;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            yb.b.values();
            int[] iArr = new int[9];
            a = iArr;
            try {
                iArr[yb.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yb.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[yb.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[yb.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[yb.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[yb.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[yb.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[yb.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[yb.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public cc() {
        this.F0.clear();
        this.F0.add(this.K1);
        int length = this.E0.length;
        for (int i = 0; i < length; i++) {
            this.E0[i] = this.K1;
        }
    }

    public void A2(int i) {
        this.M1 = i;
    }

    public void B2(int i) {
        if (this.L1 == i) {
            return;
        }
        this.L1 = i;
        this.F0.clear();
        if (this.L1 == 1) {
            this.K1 = this.w0;
        } else {
            this.K1 = this.x0;
        }
        this.F0.add(this.K1);
        int length = this.E0.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.E0[i2] = this.K1;
        }
    }

    @Override // com.p7700g.p99005.zb
    public boolean G0() {
        return this.N1;
    }

    @Override // com.p7700g.p99005.zb
    public boolean H0() {
        return this.N1;
    }

    @Override // com.p7700g.p99005.zb
    public String f0() {
        return "Guideline";
    }

    @Override // com.p7700g.p99005.zb
    public void g(i8 i8Var, boolean z) {
        ac acVar = (ac) U();
        if (acVar == null) {
            return;
        }
        yb r = acVar.r(yb.b.LEFT);
        yb r2 = acVar.r(yb.b.RIGHT);
        zb zbVar = this.I0;
        boolean z2 = true;
        boolean z3 = zbVar != null && zbVar.H0[0] == zb.b.WRAP_CONTENT;
        if (this.L1 == 0) {
            r = acVar.r(yb.b.TOP);
            r2 = acVar.r(yb.b.BOTTOM);
            zb zbVar2 = this.I0;
            z3 = (zbVar2 == null || zbVar2.H0[1] != zb.b.WRAP_CONTENT) ? false : false;
        }
        if (this.N1 && this.K1.o()) {
            m8 u = i8Var.u(this.K1);
            i8Var.f(u, this.K1.f());
            if (this.H1 != -1) {
                if (z3) {
                    i8Var.i(i8Var.u(r2), u, 0, 5);
                }
            } else if (this.I1 != -1 && z3) {
                m8 u2 = i8Var.u(r2);
                i8Var.i(u, i8Var.u(r), 0, 5);
                i8Var.i(u2, u, 0, 5);
            }
            this.N1 = false;
        } else if (this.H1 != -1) {
            m8 u3 = i8Var.u(this.K1);
            i8Var.e(u3, i8Var.u(r), this.H1, 8);
            if (z3) {
                i8Var.i(i8Var.u(r2), u3, 0, 5);
            }
        } else if (this.I1 != -1) {
            m8 u4 = i8Var.u(this.K1);
            m8 u5 = i8Var.u(r2);
            i8Var.e(u4, u5, -this.I1, 8);
            if (z3) {
                i8Var.i(u4, i8Var.u(r), 0, 5);
                i8Var.i(u5, u4, 0, 5);
            }
        } else if (this.G1 != -1.0f) {
            i8Var.d(i8.w(i8Var, i8Var.u(this.K1), i8Var.u(r2), this.G1));
        }
    }

    @Override // com.p7700g.p99005.zb
    public boolean h() {
        return true;
    }

    @Override // com.p7700g.p99005.zb
    public void j2(i8 i8Var, boolean z) {
        if (U() == null) {
            return;
        }
        int O = i8Var.O(this.K1);
        if (this.L1 == 1) {
            f2(O);
            g2(0);
            y1(U().D());
            c2(0);
            return;
        }
        f2(0);
        g2(O);
        c2(U().m0());
        y1(0);
    }

    public void k2() {
        if (this.H1 != -1) {
            t2();
        } else if (this.G1 != -1.0f) {
            s2();
        } else if (this.I1 != -1) {
            r2();
        }
    }

    public yb l2() {
        return this.K1;
    }

    public int m2() {
        return this.L1;
    }

    @Override // com.p7700g.p99005.zb
    public void n(zb zbVar, HashMap<zb, zb> hashMap) {
        super.n(zbVar, hashMap);
        cc ccVar = (cc) zbVar;
        this.G1 = ccVar.G1;
        this.H1 = ccVar.H1;
        this.I1 = ccVar.I1;
        this.J1 = ccVar.J1;
        B2(ccVar.L1);
    }

    public int n2() {
        return this.H1;
    }

    public int o2() {
        if (this.G1 != -1.0f) {
            return 0;
        }
        if (this.H1 != -1) {
            return 1;
        }
        return this.I1 != -1 ? 2 : -1;
    }

    public int p2() {
        return this.I1;
    }

    public float q2() {
        return this.G1;
    }

    @Override // com.p7700g.p99005.zb
    public yb r(yb.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.L1 == 0) {
                return this.K1;
            }
            return null;
        }
        if (this.L1 == 1) {
            return this.K1;
        }
        return null;
    }

    public void r2() {
        int o0 = o0();
        if (this.L1 == 0) {
            o0 = p0();
        }
        w2(o0);
    }

    public void s2() {
        int m0 = U().m0() - o0();
        if (this.L1 == 0) {
            m0 = U().D() - p0();
        }
        x2(m0);
    }

    public void t2() {
        float o0 = o0() / U().m0();
        if (this.L1 == 0) {
            o0 = p0() / U().D();
        }
        y2(o0);
    }

    public boolean u2() {
        return this.G1 != -1.0f && this.H1 == -1 && this.I1 == -1;
    }

    public void v2(int i) {
        this.K1.A(i);
        this.N1 = true;
    }

    public void w2(int i) {
        if (i > -1) {
            this.G1 = -1.0f;
            this.H1 = i;
            this.I1 = -1;
        }
    }

    public void x2(int i) {
        if (i > -1) {
            this.G1 = -1.0f;
            this.H1 = -1;
            this.I1 = i;
        }
    }

    public void y2(float f) {
        if (f > -1.0f) {
            this.G1 = f;
            this.H1 = -1;
            this.I1 = -1;
        }
    }

    public void z2(int i) {
        y2(i / 100.0f);
    }
}