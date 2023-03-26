package com.p7700g.p99005;

import com.p7700g.p99005.pc;

/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public class uc extends zc {
    public uc(zb zbVar) {
        super(zbVar);
    }

    private void u(pc pcVar) {
        this.h.k.add(pcVar);
        pcVar.l.add(this.h);
    }

    @Override // com.p7700g.p99005.zc, com.p7700g.p99005.nc
    public void a(nc ncVar) {
        vb vbVar = (vb) this.b;
        int p2 = vbVar.p2();
        int i = 0;
        int i2 = -1;
        for (pc pcVar : this.h.l) {
            int i3 = pcVar.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (p2 != 0 && p2 != 2) {
            this.h.e(vbVar.q2() + i);
        } else {
            this.h.e(vbVar.q2() + i2);
        }
    }

    @Override // com.p7700g.p99005.zc
    public void d() {
        zb zbVar = this.b;
        if (zbVar instanceof vb) {
            this.h.b = true;
            vb vbVar = (vb) zbVar;
            int p2 = vbVar.p2();
            boolean o2 = vbVar.o2();
            int i = 0;
            if (p2 == 0) {
                this.h.e = pc.a.LEFT;
                while (i < vbVar.B1) {
                    zb zbVar2 = vbVar.A1[i];
                    if (o2 || zbVar2.l0() != 8) {
                        pc pcVar = zbVar2.K.h;
                        pcVar.k.add(this.h);
                        this.h.l.add(pcVar);
                    }
                    i++;
                }
                u(this.b.K.h);
                u(this.b.K.i);
            } else if (p2 == 1) {
                this.h.e = pc.a.RIGHT;
                while (i < vbVar.B1) {
                    zb zbVar3 = vbVar.A1[i];
                    if (o2 || zbVar3.l0() != 8) {
                        pc pcVar2 = zbVar3.K.i;
                        pcVar2.k.add(this.h);
                        this.h.l.add(pcVar2);
                    }
                    i++;
                }
                u(this.b.K.h);
                u(this.b.K.i);
            } else if (p2 == 2) {
                this.h.e = pc.a.TOP;
                while (i < vbVar.B1) {
                    zb zbVar4 = vbVar.A1[i];
                    if (o2 || zbVar4.l0() != 8) {
                        pc pcVar3 = zbVar4.L.h;
                        pcVar3.k.add(this.h);
                        this.h.l.add(pcVar3);
                    }
                    i++;
                }
                u(this.b.L.h);
                u(this.b.L.i);
            } else if (p2 != 3) {
            } else {
                this.h.e = pc.a.BOTTOM;
                while (i < vbVar.B1) {
                    zb zbVar5 = vbVar.A1[i];
                    if (o2 || zbVar5.l0() != 8) {
                        pc pcVar4 = zbVar5.L.i;
                        pcVar4.k.add(this.h);
                        this.h.l.add(pcVar4);
                    }
                    i++;
                }
                u(this.b.L.h);
                u(this.b.L.i);
            }
        }
    }

    @Override // com.p7700g.p99005.zc
    public void e() {
        zb zbVar = this.b;
        if (zbVar instanceof vb) {
            int p2 = ((vb) zbVar).p2();
            if (p2 != 0 && p2 != 1) {
                this.b.g2(this.h.g);
            } else {
                this.b.f2(this.h.g);
            }
        }
    }

    @Override // com.p7700g.p99005.zc
    public void f() {
        this.c = null;
        this.h.c();
    }

    @Override // com.p7700g.p99005.zc
    public void n() {
        this.h.j = false;
    }

    @Override // com.p7700g.p99005.zc
    public boolean p() {
        return false;
    }
}