package com.p7700g.p99005;

import com.p7700g.p99005.lc;
import com.p7700g.p99005.zb;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class ac extends jc {
    private static final int B1 = 8;
    private static final boolean C1 = false;
    private static final boolean D1 = false;
    public static final boolean E1 = false;
    public static int F1;
    public lc G1;
    public oc H1;
    private int I1;
    public lc.b J1;
    private boolean K1;
    public j8 L1;
    public i8 M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public xb[] T1;
    public xb[] U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public int Y1;
    public int Z1;
    private int a2;
    public boolean b2;
    private boolean c2;
    private boolean d2;
    public int e2;
    private WeakReference<yb> f2;
    private WeakReference<yb> g2;
    private WeakReference<yb> h2;
    private WeakReference<yb> i2;
    public HashSet<zb> j2;
    public lc.a k2;

    public ac() {
        this.G1 = new lc(this);
        this.H1 = new oc(this);
        this.J1 = null;
        this.K1 = false;
        this.M1 = new i8();
        this.R1 = 0;
        this.S1 = 0;
        this.T1 = new xb[4];
        this.U1 = new xb[4];
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 257;
        this.b2 = false;
        this.c2 = false;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = new HashSet<>();
        this.k2 = new lc.a();
    }

    public static boolean R2(int i, zb zbVar, lc.b bVar, lc.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (zbVar.l0() != 8 && !(zbVar instanceof cc) && !(zbVar instanceof vb)) {
            aVar.d = zbVar.H();
            aVar.e = zbVar.j0();
            aVar.f = zbVar.m0();
            aVar.g = zbVar.D();
            aVar.l = false;
            aVar.m = i2;
            zb.b bVar2 = aVar.d;
            zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
            boolean z = bVar2 == bVar3;
            boolean z2 = aVar.e == bVar3;
            boolean z3 = z && zbVar.L0 > 0.0f;
            boolean z4 = z2 && zbVar.L0 > 0.0f;
            if (z && zbVar.r0(0) && zbVar.c0 == 0 && !z3) {
                aVar.d = zb.b.WRAP_CONTENT;
                if (z2 && zbVar.d0 == 0) {
                    aVar.d = zb.b.FIXED;
                }
                z = false;
            }
            if (z2 && zbVar.r0(1) && zbVar.d0 == 0 && !z4) {
                aVar.e = zb.b.WRAP_CONTENT;
                if (z && zbVar.c0 == 0) {
                    aVar.e = zb.b.FIXED;
                }
                z2 = false;
            }
            if (zbVar.G0()) {
                aVar.d = zb.b.FIXED;
                z = false;
            }
            if (zbVar.H0()) {
                aVar.e = zb.b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (zbVar.e0[0] == 4) {
                    aVar.d = zb.b.FIXED;
                } else if (!z2) {
                    zb.b bVar4 = aVar.e;
                    zb.b bVar5 = zb.b.FIXED;
                    if (bVar4 == bVar5) {
                        i4 = aVar.g;
                    } else {
                        aVar.d = zb.b.WRAP_CONTENT;
                        bVar.b(zbVar, aVar);
                        i4 = aVar.i;
                    }
                    aVar.d = bVar5;
                    aVar.f = (int) (zbVar.A() * i4);
                }
            }
            if (z4) {
                if (zbVar.e0[1] == 4) {
                    aVar.e = zb.b.FIXED;
                } else if (!z) {
                    zb.b bVar6 = aVar.d;
                    zb.b bVar7 = zb.b.FIXED;
                    if (bVar6 == bVar7) {
                        i3 = aVar.f;
                    } else {
                        aVar.e = zb.b.WRAP_CONTENT;
                        bVar.b(zbVar, aVar);
                        i3 = aVar.h;
                    }
                    aVar.e = bVar7;
                    if (zbVar.B() == -1) {
                        aVar.g = (int) (i3 / zbVar.A());
                    } else {
                        aVar.g = (int) (zbVar.A() * i3);
                    }
                }
            }
            bVar.b(zbVar, aVar);
            zbVar.c2(aVar.h);
            zbVar.y1(aVar.i);
            zbVar.x1(aVar.k);
            zbVar.g1(aVar.j);
            aVar.m = lc.a.a;
            return aVar.l;
        }
        aVar.h = 0;
        aVar.i = 0;
        return false;
    }

    private void T2() {
        this.R1 = 0;
        this.S1 = 0;
    }

    private void s2(zb zbVar) {
        int i = this.R1 + 1;
        xb[] xbVarArr = this.U1;
        if (i >= xbVarArr.length) {
            this.U1 = (xb[]) Arrays.copyOf(xbVarArr, xbVarArr.length * 2);
        }
        this.U1[this.R1] = new xb(zbVar, 0, O2());
        this.R1++;
    }

    private void v2(yb ybVar, m8 m8Var) {
        this.M1.i(m8Var, this.M1.u(ybVar), 0, 5);
    }

    private void w2(yb ybVar, m8 m8Var) {
        this.M1.i(this.M1.u(ybVar), m8Var, 0, 5);
    }

    private void x2(zb zbVar) {
        int i = this.S1 + 1;
        xb[] xbVarArr = this.T1;
        if (i >= xbVarArr.length) {
            this.T1 = (xb[]) Arrays.copyOf(xbVarArr, xbVarArr.length * 2);
        }
        this.T1[this.S1] = new xb(zbVar, 1, O2());
        this.S1++;
    }

    public void A2() {
        this.H1.f(H(), j0());
    }

    public boolean B2(boolean z) {
        return this.H1.g(z);
    }

    public boolean C2(boolean z) {
        return this.H1.h(z);
    }

    public boolean D2(boolean z, int i) {
        return this.H1.i(z, i);
    }

    public void E2(j8 j8Var) {
        this.L1 = j8Var;
        this.M1.F(j8Var);
    }

    public ArrayList<cc> F2() {
        ArrayList<cc> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i = 0; i < size; i++) {
            zb zbVar = this.A1.get(i);
            if (zbVar instanceof cc) {
                cc ccVar = (cc) zbVar;
                if (ccVar.m2() == 0) {
                    arrayList.add(ccVar);
                }
            }
        }
        return arrayList;
    }

    public lc.b G2() {
        return this.J1;
    }

    public int H2() {
        return this.a2;
    }

    public i8 I2() {
        return this.M1;
    }

    public ArrayList<cc> J2() {
        ArrayList<cc> arrayList = new ArrayList<>();
        int size = this.A1.size();
        for (int i = 0; i < size; i++) {
            zb zbVar = this.A1.get(i);
            if (zbVar instanceof cc) {
                cc ccVar = (cc) zbVar;
                if (ccVar.m2() == 1) {
                    arrayList.add(ccVar);
                }
            }
        }
        return arrayList;
    }

    public boolean K2() {
        return false;
    }

    public void L2() {
        this.H1.o();
    }

    public void M2() {
        this.H1.p();
    }

    public boolean N2() {
        return this.d2;
    }

    public boolean O2() {
        return this.K1;
    }

    public boolean P2() {
        return this.c2;
    }

    public long Q2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.N1 = i8;
        this.O1 = i9;
        return this.G1.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.p7700g.p99005.jc, com.p7700g.p99005.zb
    public void R0() {
        this.M1.Y();
        this.N1 = 0;
        this.P1 = 0;
        this.O1 = 0;
        this.Q1 = 0;
        this.b2 = false;
        super.R0();
    }

    public boolean S2(int i) {
        return (this.a2 & i) == i;
    }

    public void U2(lc.b bVar) {
        this.J1 = bVar;
        this.H1.u(bVar);
    }

    public void V2(int i) {
        this.a2 = i;
        i8.e = S2(512);
    }

    public void W2(int i, int i2, int i3, int i4) {
        this.N1 = i;
        this.O1 = i2;
        this.P1 = i3;
        this.Q1 = i4;
    }

    public void X2(int i) {
        this.I1 = i;
    }

    public void Y2(boolean z) {
        this.K1 = z;
    }

    public boolean Z2(i8 i8Var, boolean[] zArr) {
        zArr[2] = false;
        boolean S2 = S2(64);
        j2(i8Var, S2);
        int size = this.A1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zb zbVar = this.A1.get(i);
            zbVar.j2(i8Var, S2);
            if (zbVar.t0()) {
                z = true;
            }
        }
        return z;
    }

    public void a3() {
        this.G1.e(this);
    }

    @Override // com.p7700g.p99005.zb
    public void b0(StringBuilder sb) {
        sb.append(this.U + ":{\n");
        sb.append("  actualWidth:" + this.J0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.K0);
        sb.append("\n");
        Iterator<zb> it = l2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // com.p7700g.p99005.zb
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // com.p7700g.p99005.zb
    public void i2(boolean z, boolean z2) {
        super.i2(z, z2);
        int size = this.A1.size();
        for (int i = 0; i < size; i++) {
            this.A1.get(i).i2(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031d  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.p7700g.p99005.jc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n2() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        ?? r6;
        boolean z4;
        boolean z5;
        int i3;
        zb.b bVar;
        this.N0 = 0;
        this.O0 = 0;
        this.c2 = false;
        this.d2 = false;
        int size = this.A1.size();
        int max = Math.max(0, m0());
        int max2 = Math.max(0, D());
        zb.b[] bVarArr = this.H0;
        zb.b bVar2 = bVarArr[1];
        zb.b bVar3 = bVarArr[0];
        j8 j8Var = this.L1;
        if (j8Var != null) {
            j8Var.P++;
        }
        if (this.I1 == 0 && fc.b(this.a2, 1)) {
            rc.j(this, G2());
            for (int i4 = 0; i4 < size; i4++) {
                zb zbVar = this.A1.get(i4);
                if (zbVar.F0() && !(zbVar instanceof cc) && !(zbVar instanceof vb) && !(zbVar instanceof ic) && !zbVar.E0()) {
                    zb.b z6 = zbVar.z(0);
                    zb.b z7 = zbVar.z(1);
                    zb.b bVar4 = zb.b.MATCH_CONSTRAINT;
                    if (!(z6 == bVar4 && zbVar.c0 != 1 && z7 == bVar4 && zbVar.d0 != 1)) {
                        R2(0, zbVar, this.J1, new lc.a(), lc.a.a);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = zb.b.WRAP_CONTENT) || bVar2 == bVar) && fc.b(this.a2, 1024) && sc.c(this, G2()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (bVar3 == bVar) {
                if (max < m0() && max > 0) {
                    c2(max);
                    this.c2 = true;
                } else {
                    max = m0();
                }
            }
            if (bVar2 == bVar) {
                if (max2 < D() && max2 > 0) {
                    y1(max2);
                    this.d2 = true;
                } else {
                    max2 = D();
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z8 = S2(64) || S2(128);
        i8 i8Var = this.M1;
        i8Var.v = false;
        i8Var.w = false;
        if (this.a2 != 0 && z8) {
            i8Var.w = true;
        }
        ArrayList<zb> arrayList = this.A1;
        zb.b H = H();
        zb.b bVar5 = zb.b.WRAP_CONTENT;
        boolean z9 = H == bVar5 || j0() == bVar5;
        T2();
        for (int i5 = 0; i5 < size; i5++) {
            zb zbVar2 = this.A1.get(i5);
            if (zbVar2 instanceof jc) {
                ((jc) zbVar2).n2();
            }
        }
        boolean S2 = S2(64);
        boolean z10 = z;
        int i6 = 0;
        boolean z11 = true;
        while (z11) {
            int i7 = i6 + 1;
            try {
                this.M1.Y();
                T2();
                o(this.M1);
                for (int i8 = 0; i8 < size; i8++) {
                    this.A1.get(i8).o(this.M1);
                }
                z11 = r2(this.M1);
                WeakReference<yb> weakReference = this.f2;
                if (weakReference != null && weakReference.get() != null) {
                    w2(this.f2.get(), this.M1.u(this.x0));
                    this.f2 = null;
                }
                WeakReference<yb> weakReference2 = this.h2;
                if (weakReference2 != null && weakReference2.get() != null) {
                    v2(this.h2.get(), this.M1.u(this.z0));
                    this.h2 = null;
                }
                WeakReference<yb> weakReference3 = this.g2;
                if (weakReference3 != null && weakReference3.get() != null) {
                    w2(this.g2.get(), this.M1.u(this.w0));
                    this.g2 = null;
                }
                WeakReference<yb> weakReference4 = this.i2;
                if (weakReference4 != null && weakReference4.get() != null) {
                    v2(this.i2.get(), this.M1.u(this.y0));
                    this.i2 = null;
                }
                if (z11) {
                    this.M1.T();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z11) {
                z2 = Z2(this.M1, fc.n);
            } else {
                j2(this.M1, S2);
                for (int i9 = 0; i9 < size; i9++) {
                    this.A1.get(i9).j2(this.M1, S2);
                }
                z2 = false;
            }
            if (z9 && i7 < 8 && fc.n[2]) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < size) {
                    zb zbVar3 = this.A1.get(i10);
                    i12 = Math.max(i12, zbVar3.m0() + zbVar3.N0);
                    i11 = Math.max(i11, zbVar3.D() + zbVar3.O0);
                    i10++;
                    z2 = z2;
                }
                z3 = z2;
                int max3 = Math.max(this.U0, i12);
                int max4 = Math.max(this.V0, i11);
                zb.b bVar6 = zb.b.WRAP_CONTENT;
                if (bVar3 == bVar6 && m0() < max3) {
                    c2(max3);
                    this.H0[0] = bVar6;
                    z10 = true;
                    z3 = true;
                }
                if (bVar2 == bVar6 && D() < max4) {
                    y1(max4);
                    this.H0[1] = bVar6;
                    z10 = true;
                    z3 = true;
                }
            } else {
                z3 = z2;
            }
            int max5 = Math.max(this.U0, m0());
            if (max5 > m0()) {
                c2(max5);
                this.H0[0] = zb.b.FIXED;
                z10 = true;
                z3 = true;
            }
            int max6 = Math.max(this.V0, D());
            if (max6 > D()) {
                y1(max6);
                r6 = 1;
                this.H0[1] = zb.b.FIXED;
                z4 = true;
                z3 = true;
            } else {
                r6 = 1;
                z4 = z10;
            }
            if (!z4) {
                zb.b bVar7 = this.H0[0];
                zb.b bVar8 = zb.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i2 > 0 && m0() > i2) {
                    this.c2 = r6;
                    this.H0[0] = zb.b.FIXED;
                    c2(i2);
                    z4 = true;
                    z3 = true;
                }
                if (this.H0[r6] == bVar8 && i > 0 && D() > i) {
                    this.d2 = r6;
                    this.H0[r6] = zb.b.FIXED;
                    y1(i);
                    i3 = 8;
                    z5 = true;
                    z10 = true;
                    z11 = i7 <= i3 ? false : z5;
                    i6 = i7;
                }
            }
            z10 = z4;
            z5 = z3;
            i3 = 8;
            if (i7 <= i3) {
            }
            i6 = i7;
        }
        this.A1 = arrayList;
        if (z10) {
            zb.b[] bVarArr2 = this.H0;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        W0(this.M1.G());
    }

    public void q2(zb zbVar, int i) {
        if (i == 0) {
            s2(zbVar);
        } else if (i == 1) {
            x2(zbVar);
        }
    }

    public boolean r2(i8 i8Var) {
        boolean S2 = S2(64);
        g(i8Var, S2);
        int size = this.A1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            zb zbVar = this.A1.get(i);
            zbVar.G1(0, false);
            zbVar.G1(1, false);
            if (zbVar instanceof vb) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                zb zbVar2 = this.A1.get(i2);
                if (zbVar2 instanceof vb) {
                    ((vb) zbVar2).s2();
                }
            }
        }
        this.j2.clear();
        for (int i3 = 0; i3 < size; i3++) {
            zb zbVar3 = this.A1.get(i3);
            if (zbVar3.f()) {
                if (zbVar3 instanceof ic) {
                    this.j2.add(zbVar3);
                } else {
                    zbVar3.g(i8Var, S2);
                }
            }
        }
        while (this.j2.size() > 0) {
            int size2 = this.j2.size();
            Iterator<zb> it = this.j2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ic icVar = (ic) it.next();
                if (icVar.o2(this.j2)) {
                    icVar.g(i8Var, S2);
                    this.j2.remove(icVar);
                    break;
                }
            }
            if (size2 == this.j2.size()) {
                Iterator<zb> it2 = this.j2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(i8Var, S2);
                }
                this.j2.clear();
            }
        }
        if (i8.e) {
            HashSet<zb> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                zb zbVar4 = this.A1.get(i4);
                if (!zbVar4.f()) {
                    hashSet.add(zbVar4);
                }
            }
            e(this, i8Var, hashSet, H() == zb.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<zb> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                zb next = it3.next();
                fc.a(this, i8Var, next);
                next.g(i8Var, S2);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                zb zbVar5 = this.A1.get(i5);
                if (zbVar5 instanceof ac) {
                    zb.b[] bVarArr = zbVar5.H0;
                    zb.b bVar = bVarArr[0];
                    zb.b bVar2 = bVarArr[1];
                    zb.b bVar3 = zb.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        zbVar5.D1(zb.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        zbVar5.Y1(zb.b.FIXED);
                    }
                    zbVar5.g(i8Var, S2);
                    if (bVar == bVar3) {
                        zbVar5.D1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        zbVar5.Y1(bVar2);
                    }
                } else {
                    fc.a(this, i8Var, zbVar5);
                    if (!zbVar5.f()) {
                        zbVar5.g(i8Var, S2);
                    }
                }
            }
        }
        if (this.R1 > 0) {
            wb.b(this, i8Var, null, 0);
        }
        if (this.S1 > 0) {
            wb.b(this, i8Var, null, 1);
        }
        return true;
    }

    public void t2(yb ybVar) {
        WeakReference<yb> weakReference = this.i2;
        if (weakReference == null || weakReference.get() == null || ybVar.f() > this.i2.get().f()) {
            this.i2 = new WeakReference<>(ybVar);
        }
    }

    public void u2(yb ybVar) {
        WeakReference<yb> weakReference = this.g2;
        if (weakReference == null || weakReference.get() == null || ybVar.f() > this.g2.get().f()) {
            this.g2 = new WeakReference<>(ybVar);
        }
    }

    public void y2(yb ybVar) {
        WeakReference<yb> weakReference = this.h2;
        if (weakReference == null || weakReference.get() == null || ybVar.f() > this.h2.get().f()) {
            this.h2 = new WeakReference<>(ybVar);
        }
    }

    public void z2(yb ybVar) {
        WeakReference<yb> weakReference = this.f2;
        if (weakReference == null || weakReference.get() == null || ybVar.f() > this.f2.get().f()) {
            this.f2 = new WeakReference<>(ybVar);
        }
    }

    public ac(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.G1 = new lc(this);
        this.H1 = new oc(this);
        this.J1 = null;
        this.K1 = false;
        this.M1 = new i8();
        this.R1 = 0;
        this.S1 = 0;
        this.T1 = new xb[4];
        this.U1 = new xb[4];
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 257;
        this.b2 = false;
        this.c2 = false;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = new HashSet<>();
        this.k2 = new lc.a();
    }

    public ac(int i, int i2) {
        super(i, i2);
        this.G1 = new lc(this);
        this.H1 = new oc(this);
        this.J1 = null;
        this.K1 = false;
        this.M1 = new i8();
        this.R1 = 0;
        this.S1 = 0;
        this.T1 = new xb[4];
        this.U1 = new xb[4];
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 257;
        this.b2 = false;
        this.c2 = false;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = new HashSet<>();
        this.k2 = new lc.a();
    }

    public ac(String str, int i, int i2) {
        super(i, i2);
        this.G1 = new lc(this);
        this.H1 = new oc(this);
        this.J1 = null;
        this.K1 = false;
        this.M1 = new i8();
        this.R1 = 0;
        this.S1 = 0;
        this.T1 = new xb[4];
        this.U1 = new xb[4];
        this.V1 = false;
        this.W1 = false;
        this.X1 = false;
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = 257;
        this.b2 = false;
        this.c2 = false;
        this.d2 = false;
        this.e2 = 0;
        this.f2 = null;
        this.g2 = null;
        this.h2 = null;
        this.i2 = null;
        this.j2 = new HashSet<>();
        this.k2 = new lc.a();
        j1(str);
    }
}