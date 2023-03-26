package com.p7700g.p99005;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class jc extends zb {
    public ArrayList<zb> A1;

    public jc() {
        this.A1 = new ArrayList<>();
    }

    @Override // com.p7700g.p99005.zb
    public void Q1(int i, int i2) {
        super.Q1(i, i2);
        int size = this.A1.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.A1.get(i3).Q1(Y(), Z());
        }
    }

    @Override // com.p7700g.p99005.zb
    public void R0() {
        this.A1.clear();
        super.R0();
    }

    @Override // com.p7700g.p99005.zb
    public void W0(g8 g8Var) {
        super.W0(g8Var);
        int size = this.A1.size();
        for (int i = 0; i < size; i++) {
            this.A1.get(i).W0(g8Var);
        }
    }

    public void b(zb zbVar) {
        this.A1.add(zbVar);
        if (zbVar.U() != null) {
            ((jc) zbVar.U()).o2(zbVar);
        }
        zbVar.S1(this);
    }

    public void k2(zb... zbVarArr) {
        for (zb zbVar : zbVarArr) {
            b(zbVar);
        }
    }

    public ArrayList<zb> l2() {
        return this.A1;
    }

    public ac m2() {
        zb U = U();
        ac acVar = this instanceof ac ? (ac) this : null;
        while (U != null) {
            zb U2 = U.U();
            if (U instanceof ac) {
                acVar = (ac) U;
            }
            U = U2;
        }
        return acVar;
    }

    public void n2() {
        ArrayList<zb> arrayList = this.A1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zb zbVar = this.A1.get(i);
            if (zbVar instanceof jc) {
                ((jc) zbVar).n2();
            }
        }
    }

    public void o2(zb zbVar) {
        this.A1.remove(zbVar);
        zbVar.R0();
    }

    public void p2() {
        this.A1.clear();
    }

    public jc(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.A1 = new ArrayList<>();
    }

    public jc(int i, int i2) {
        super(i, i2);
        this.A1 = new ArrayList<>();
    }
}