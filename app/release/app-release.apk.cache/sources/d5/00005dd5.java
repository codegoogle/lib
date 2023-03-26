package com.p7700g.p99005;

/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class tc extends zc {
    public tc(zb zbVar) {
        super(zbVar);
        zbVar.K.f();
        zbVar.L.f();
        this.f = ((cc) zbVar).m2();
    }

    private void u(pc pcVar) {
        this.h.k.add(pcVar);
        pcVar.l.add(this.h);
    }

    @Override // com.p7700g.p99005.zc, com.p7700g.p99005.nc
    public void a(nc ncVar) {
        pc pcVar = this.h;
        if (pcVar.c && !pcVar.j) {
            this.h.e((int) ((((cc) this.b).q2() * pcVar.l.get(0).g) + 0.5f));
        }
    }

    @Override // com.p7700g.p99005.zc
    public void d() {
        cc ccVar = (cc) this.b;
        int n2 = ccVar.n2();
        int p2 = ccVar.p2();
        ccVar.q2();
        if (ccVar.m2() == 1) {
            if (n2 != -1) {
                this.h.l.add(this.b.I0.K.h);
                this.b.I0.K.h.k.add(this.h);
                this.h.f = n2;
            } else if (p2 != -1) {
                this.h.l.add(this.b.I0.K.i);
                this.b.I0.K.i.k.add(this.h);
                this.h.f = -p2;
            } else {
                pc pcVar = this.h;
                pcVar.b = true;
                pcVar.l.add(this.b.I0.K.i);
                this.b.I0.K.i.k.add(this.h);
            }
            u(this.b.K.h);
            u(this.b.K.i);
            return;
        }
        if (n2 != -1) {
            this.h.l.add(this.b.I0.L.h);
            this.b.I0.L.h.k.add(this.h);
            this.h.f = n2;
        } else if (p2 != -1) {
            this.h.l.add(this.b.I0.L.i);
            this.b.I0.L.i.k.add(this.h);
            this.h.f = -p2;
        } else {
            pc pcVar2 = this.h;
            pcVar2.b = true;
            pcVar2.l.add(this.b.I0.L.i);
            this.b.I0.L.i.k.add(this.h);
        }
        u(this.b.L.h);
        u(this.b.L.i);
    }

    @Override // com.p7700g.p99005.zc
    public void e() {
        if (((cc) this.b).m2() == 1) {
            this.b.f2(this.h.g);
        } else {
            this.b.g2(this.h.g);
        }
    }

    @Override // com.p7700g.p99005.zc
    public void f() {
        this.h.c();
    }

    @Override // com.p7700g.p99005.zc
    public void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override // com.p7700g.p99005.zc
    public boolean p() {
        return false;
    }
}