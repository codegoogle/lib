package com.p7700g.p99005;

import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.HashMap;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public class vb extends ec {
    public static final int C1 = 0;
    public static final int D1 = 1;
    public static final int E1 = 2;
    public static final int F1 = 3;
    private static final boolean G1 = true;
    private static final boolean H1 = false;
    private int I1 = 0;
    private boolean J1 = true;
    private int K1 = 0;
    public boolean L1 = false;

    public vb() {
    }

    @Override // com.p7700g.p99005.zb
    public boolean G0() {
        return this.L1;
    }

    @Override // com.p7700g.p99005.zb
    public boolean H0() {
        return this.L1;
    }

    @Override // com.p7700g.p99005.zb
    public void g(i8 i8Var, boolean z) {
        Object[] objArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        yb[] ybVarArr = this.E0;
        ybVarArr[0] = this.w0;
        ybVarArr[2] = this.x0;
        ybVarArr[1] = this.y0;
        ybVarArr[3] = this.z0;
        int i4 = 0;
        while (true) {
            objArr = this.E0;
            if (i4 >= objArr.length) {
                break;
            }
            objArr[i4].k = i8Var.u(objArr[i4]);
            i4++;
        }
        int i5 = this.I1;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        yb ybVar = objArr[i5];
        if (!this.L1) {
            m2();
        }
        if (this.L1) {
            this.L1 = false;
            int i6 = this.I1;
            if (i6 == 0 || i6 == 1) {
                i8Var.f(this.w0.k, this.N0);
                i8Var.f(this.y0.k, this.N0);
                return;
            } else if (i6 == 2 || i6 == 3) {
                i8Var.f(this.x0.k, this.O0);
                i8Var.f(this.z0.k, this.O0);
                return;
            } else {
                return;
            }
        }
        for (int i7 = 0; i7 < this.B1; i7++) {
            zb zbVar = this.A1[i7];
            if ((this.J1 || zbVar.h()) && ((((i2 = this.I1) == 0 || i2 == 1) && zbVar.H() == zb.b.MATCH_CONSTRAINT && zbVar.w0.h != null && zbVar.y0.h != null) || (((i3 = this.I1) == 2 || i3 == 3) && zbVar.j0() == zb.b.MATCH_CONSTRAINT && zbVar.x0.h != null && zbVar.z0.h != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.w0.m() || this.y0.m();
        boolean z4 = this.x0.m() || this.z0.m();
        int i8 = !z2 && (((i = this.I1) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.B1; i9++) {
            zb zbVar2 = this.A1[i9];
            if (this.J1 || zbVar2.h()) {
                m8 u = i8Var.u(zbVar2.E0[this.I1]);
                yb[] ybVarArr2 = zbVar2.E0;
                int i10 = this.I1;
                ybVarArr2[i10].k = u;
                int i11 = (ybVarArr2[i10].h == null || ybVarArr2[i10].h.f != this) ? 0 : ybVarArr2[i10].i + 0;
                if (i10 != 0 && i10 != 2) {
                    i8Var.h(ybVar.k, u, this.K1 + i11, z2);
                } else {
                    i8Var.j(ybVar.k, u, this.K1 - i11, z2);
                }
                i8Var.e(ybVar.k, u, this.K1 + i11, i8);
            }
        }
        int i12 = this.I1;
        if (i12 == 0) {
            i8Var.e(this.y0.k, this.w0.k, 0, 8);
            i8Var.e(this.w0.k, this.I0.y0.k, 0, 4);
            i8Var.e(this.w0.k, this.I0.w0.k, 0, 0);
        } else if (i12 == 1) {
            i8Var.e(this.w0.k, this.y0.k, 0, 8);
            i8Var.e(this.w0.k, this.I0.w0.k, 0, 4);
            i8Var.e(this.w0.k, this.I0.y0.k, 0, 0);
        } else if (i12 == 2) {
            i8Var.e(this.z0.k, this.x0.k, 0, 8);
            i8Var.e(this.x0.k, this.I0.z0.k, 0, 4);
            i8Var.e(this.x0.k, this.I0.x0.k, 0, 0);
        } else if (i12 == 3) {
            i8Var.e(this.x0.k, this.z0.k, 0, 8);
            i8Var.e(this.x0.k, this.I0.x0.k, 0, 4);
            i8Var.e(this.x0.k, this.I0.z0.k, 0, 0);
        }
    }

    @Override // com.p7700g.p99005.zb
    public boolean h() {
        return true;
    }

    public boolean m2() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.B1;
            if (i4 >= i) {
                break;
            }
            zb zbVar = this.A1[i4];
            if ((this.J1 || zbVar.h()) && ((((i2 = this.I1) == 0 || i2 == 1) && !zbVar.G0()) || (((i3 = this.I1) == 2 || i3 == 3) && !zbVar.H0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.B1; i6++) {
            zb zbVar2 = this.A1[i6];
            if (this.J1 || zbVar2.h()) {
                if (!z2) {
                    int i7 = this.I1;
                    if (i7 == 0) {
                        i5 = zbVar2.r(yb.b.LEFT).f();
                    } else if (i7 == 1) {
                        i5 = zbVar2.r(yb.b.RIGHT).f();
                    } else if (i7 == 2) {
                        i5 = zbVar2.r(yb.b.TOP).f();
                    } else if (i7 == 3) {
                        i5 = zbVar2.r(yb.b.BOTTOM).f();
                    }
                    z2 = true;
                }
                int i8 = this.I1;
                if (i8 == 0) {
                    i5 = Math.min(i5, zbVar2.r(yb.b.LEFT).f());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, zbVar2.r(yb.b.RIGHT).f());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, zbVar2.r(yb.b.TOP).f());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, zbVar2.r(yb.b.BOTTOM).f());
                }
            }
        }
        int i9 = i5 + this.K1;
        int i10 = this.I1;
        if (i10 != 0 && i10 != 1) {
            t1(i9, i9);
        } else {
            q1(i9, i9);
        }
        this.L1 = true;
        return true;
    }

    @Override // com.p7700g.p99005.ec, com.p7700g.p99005.zb
    public void n(zb zbVar, HashMap<zb, zb> hashMap) {
        super.n(zbVar, hashMap);
        vb vbVar = (vb) zbVar;
        this.I1 = vbVar.I1;
        this.J1 = vbVar.J1;
        this.K1 = vbVar.K1;
    }

    @Deprecated
    public boolean n2() {
        return this.J1;
    }

    public boolean o2() {
        return this.J1;
    }

    public int p2() {
        return this.I1;
    }

    public int q2() {
        return this.K1;
    }

    public int r2() {
        int i = this.I1;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public void s2() {
        for (int i = 0; i < this.B1; i++) {
            zb zbVar = this.A1[i];
            if (this.J1 || zbVar.h()) {
                int i2 = this.I1;
                if (i2 == 0 || i2 == 1) {
                    zbVar.G1(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    zbVar.G1(1, true);
                }
            }
        }
    }

    public void t2(boolean z) {
        this.J1 = z;
    }

    @Override // com.p7700g.p99005.zb
    public String toString() {
        StringBuilder G = wo1.G("[Barrier] ");
        G.append(y());
        G.append(" {");
        String sb = G.toString();
        for (int i = 0; i < this.B1; i++) {
            zb zbVar = this.A1[i];
            if (i > 0) {
                sb = wo1.t(sb, ", ");
            }
            StringBuilder G2 = wo1.G(sb);
            G2.append(zbVar.y());
            sb = G2.toString();
        }
        return wo1.t(sb, "}");
    }

    public void u2(int i) {
        this.I1 = i;
    }

    public void v2(int i) {
        this.K1 = i;
    }

    public vb(String str) {
        j1(str);
    }
}