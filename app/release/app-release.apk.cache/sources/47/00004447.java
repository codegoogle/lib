package com.p7700g.p99005;

import com.p7700g.p99005.yb;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class gc extends ic {
    @Override // com.p7700g.p99005.zb
    public void g(i8 i8Var, boolean z) {
        super.g(i8Var, z);
        if (this.B1 > 0) {
            zb zbVar = this.A1[0];
            zbVar.S0();
            yb.b bVar = yb.b.LEFT;
            zbVar.j(bVar, this, bVar);
            yb.b bVar2 = yb.b.RIGHT;
            zbVar.j(bVar2, this, bVar2);
            yb.b bVar3 = yb.b.TOP;
            zbVar.j(bVar3, this, bVar3);
            yb.b bVar4 = yb.b.BOTTOM;
            zbVar.j(bVar4, this, bVar4);
        }
    }

    @Override // com.p7700g.p99005.ic
    public void v2(int i, int i2, int i3, int i4) {
        int s2 = s2() + t2() + 0;
        int u2 = u2() + r2() + 0;
        if (this.B1 > 0) {
            s2 += this.A1[0].m0();
            u2 += this.A1[0].D();
        }
        int max = Math.max(Q(), s2);
        int max2 = Math.max(P(), u2);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else {
                i2 = i == 0 ? max : 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else {
                i4 = i3 == 0 ? max2 : 0;
            }
        }
        A2(i2, i4);
        c2(i2);
        y1(i4);
        z2(this.B1 > 0);
    }
}