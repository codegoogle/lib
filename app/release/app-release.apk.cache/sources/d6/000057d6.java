package com.p7700g.p99005;

import com.p7700g.p99005.pc;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class qc extends pc {
    public int m;

    public qc(zc zcVar) {
        super(zcVar);
        if (zcVar instanceof vc) {
            this.e = pc.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = pc.a.VERTICAL_DIMENSION;
        }
    }

    @Override // com.p7700g.p99005.pc
    public void e(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (nc ncVar : this.k) {
            ncVar.a(ncVar);
        }
    }
}