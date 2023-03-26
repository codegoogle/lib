package com.p7700g.p99005;

import com.p7700g.p99005.lc;
import com.p7700g.p99005.zb;
import java.util.HashSet;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class ic extends ec {
    private int C1 = 0;
    private int D1 = 0;
    private int E1 = 0;
    private int F1 = 0;
    private int G1 = 0;
    private int H1 = 0;
    private int I1 = 0;
    private int J1 = 0;
    private boolean K1 = false;
    private int L1 = 0;
    private int M1 = 0;
    public lc.a N1 = new lc.a();
    public lc.b O1 = null;

    public void A2(int i, int i2) {
        this.L1 = i;
        this.M1 = i2;
    }

    public void B2(int i) {
        this.E1 = i;
        this.C1 = i;
        this.F1 = i;
        this.D1 = i;
        this.G1 = i;
        this.H1 = i;
    }

    public void C2(int i) {
        this.D1 = i;
    }

    public void D2(int i) {
        this.H1 = i;
    }

    public void E2(int i) {
        this.E1 = i;
        this.I1 = i;
    }

    public void F2(int i) {
        this.F1 = i;
        this.J1 = i;
    }

    public void G2(int i) {
        this.G1 = i;
        this.I1 = i;
        this.J1 = i;
    }

    public void H2(int i) {
        this.C1 = i;
    }

    @Override // com.p7700g.p99005.ec, com.p7700g.p99005.dc
    public void c(ac acVar) {
        n2();
    }

    public void m2(boolean z) {
        int i = this.G1;
        if (i > 0 || this.H1 > 0) {
            if (z) {
                this.I1 = this.H1;
                this.J1 = i;
                return;
            }
            this.I1 = i;
            this.J1 = this.H1;
        }
    }

    public void n2() {
        for (int i = 0; i < this.B1; i++) {
            zb zbVar = this.A1[i];
            if (zbVar != null) {
                zbVar.I1(true);
            }
        }
    }

    public boolean o2(HashSet<zb> hashSet) {
        for (int i = 0; i < this.B1; i++) {
            if (hashSet.contains(this.A1[i])) {
                return true;
            }
        }
        return false;
    }

    public int p2() {
        return this.M1;
    }

    public int q2() {
        return this.L1;
    }

    public int r2() {
        return this.D1;
    }

    public int s2() {
        return this.I1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.C1;
    }

    public void v2(int i, int i2, int i3, int i4) {
    }

    public void w2(zb zbVar, zb.b bVar, int i, zb.b bVar2, int i2) {
        while (this.O1 == null && U() != null) {
            this.O1 = ((ac) U()).G2();
        }
        lc.a aVar = this.N1;
        aVar.d = bVar;
        aVar.e = bVar2;
        aVar.f = i;
        aVar.g = i2;
        this.O1.b(zbVar, aVar);
        zbVar.c2(this.N1.h);
        zbVar.y1(this.N1.i);
        zbVar.x1(this.N1.k);
        zbVar.g1(this.N1.j);
    }

    public boolean x2() {
        zb zbVar = this.I0;
        lc.b G2 = zbVar != null ? ((ac) zbVar).G2() : null;
        if (G2 == null) {
            return false;
        }
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= this.B1) {
                return true;
            }
            zb zbVar2 = this.A1[i];
            if (zbVar2 != null && !(zbVar2 instanceof cc)) {
                zb.b z2 = zbVar2.z(0);
                zb.b z3 = zbVar2.z(1);
                zb.b bVar = zb.b.MATCH_CONSTRAINT;
                if (!((z2 != bVar || zbVar2.c0 == 1 || z3 != bVar || zbVar2.d0 == 1) ? false : false)) {
                    if (z2 == bVar) {
                        z2 = zb.b.WRAP_CONTENT;
                    }
                    if (z3 == bVar) {
                        z3 = zb.b.WRAP_CONTENT;
                    }
                    lc.a aVar = this.N1;
                    aVar.d = z2;
                    aVar.e = z3;
                    aVar.f = zbVar2.m0();
                    this.N1.g = zbVar2.D();
                    G2.b(zbVar2, this.N1);
                    zbVar2.c2(this.N1.h);
                    zbVar2.y1(this.N1.i);
                    zbVar2.g1(this.N1.j);
                }
            }
            i++;
        }
    }

    public boolean y2() {
        return this.K1;
    }

    public void z2(boolean z) {
        this.K1 = z;
    }
}