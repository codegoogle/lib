package com.p7700g.p99005;

import com.p7700g.p99005.pc;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import com.p7700g.p99005.zc;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class xc extends zc {
    public pc k;
    public qc l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            zc.b.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[zc.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[zc.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[zc.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public xc(zb zbVar) {
        super(zbVar);
        pc pcVar = new pc(this);
        this.k = pcVar;
        this.l = null;
        this.h.e = pc.a.TOP;
        this.i.e = pc.a.BOTTOM;
        pcVar.e = pc.a.BASELINE;
        this.f = 1;
    }

    @Override // com.p7700g.p99005.zc, com.p7700g.p99005.nc
    public void a(nc ncVar) {
        qc qcVar;
        float f;
        float A;
        int i;
        zb zbVar;
        int ordinal = this.j.ordinal();
        if (ordinal == 1) {
            s(ncVar);
        } else if (ordinal == 2) {
            r(ncVar);
        } else if (ordinal == 3) {
            zb zbVar2 = this.b;
            q(ncVar, zbVar2.x0, zbVar2.z0, 1);
            return;
        }
        qc qcVar2 = this.e;
        if (qcVar2.c && !qcVar2.j && this.d == zb.b.MATCH_CONSTRAINT) {
            zb zbVar3 = this.b;
            int i2 = zbVar3.d0;
            if (i2 != 2) {
                if (i2 == 3 && zbVar3.K.e.j) {
                    int B = zbVar3.B();
                    if (B == -1) {
                        zb zbVar4 = this.b;
                        f = zbVar4.K.e.g;
                        A = zbVar4.A();
                    } else {
                        if (B == 0) {
                            i = (int) ((this.b.A() * zbVar.K.e.g) + 0.5f);
                        } else if (B != 1) {
                            i = 0;
                        } else {
                            zb zbVar5 = this.b;
                            f = zbVar5.K.e.g;
                            A = zbVar5.A();
                        }
                        this.e.e(i);
                    }
                    i = (int) ((f / A) + 0.5f);
                    this.e.e(i);
                }
            } else {
                zb U = zbVar3.U();
                if (U != null) {
                    if (U.L.e.j) {
                        this.e.e((int) ((qcVar.g * this.b.k0) + 0.5f));
                    }
                }
            }
        }
        pc pcVar = this.h;
        if (pcVar.c) {
            pc pcVar2 = this.i;
            if (pcVar2.c) {
                if (pcVar.j && pcVar2.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT) {
                    zb zbVar6 = this.b;
                    if (zbVar6.c0 == 0 && !zbVar6.D0()) {
                        int i3 = this.h.l.get(0).g;
                        pc pcVar3 = this.h;
                        int i4 = i3 + pcVar3.f;
                        int i5 = this.i.l.get(0).g + this.i.f;
                        pcVar3.e(i4);
                        this.i.e(i5);
                        this.e.e(i5 - i4);
                        return;
                    }
                }
                if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int i6 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                    qc qcVar3 = this.e;
                    int i7 = qcVar3.m;
                    if (i6 < i7) {
                        qcVar3.e(i6);
                    } else {
                        qcVar3.e(i7);
                    }
                }
                if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    pc pcVar4 = this.h.l.get(0);
                    pc pcVar5 = this.i.l.get(0);
                    int i8 = pcVar4.g + this.h.f;
                    int i9 = pcVar5.g + this.i.f;
                    float g0 = this.b.g0();
                    if (pcVar4 == pcVar5) {
                        i8 = pcVar4.g;
                        i9 = pcVar5.g;
                        g0 = 0.5f;
                    }
                    this.h.e((int) ((((i9 - i8) - this.e.g) * g0) + i8 + 0.5f));
                    this.i.e(this.h.g + this.e.g);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.zc
    public void d() {
        zb U;
        zb U2;
        zb zbVar = this.b;
        if (zbVar.G) {
            this.e.e(zbVar.D());
        }
        if (!this.e.j) {
            this.d = this.b.j0();
            if (this.b.q0()) {
                this.l = new kc(this);
            }
            zb.b bVar = this.d;
            if (bVar != zb.b.MATCH_CONSTRAINT) {
                if (bVar == zb.b.MATCH_PARENT && (U2 = this.b.U()) != null && U2.j0() == zb.b.FIXED) {
                    int D = (U2.D() - this.b.x0.g()) - this.b.z0.g();
                    b(this.h, U2.L.h, this.b.x0.g());
                    b(this.i, U2.L.i, -this.b.z0.g());
                    this.e.e(D);
                    return;
                } else if (this.d == zb.b.FIXED) {
                    this.e.e(this.b.D());
                }
            }
        } else if (this.d == zb.b.MATCH_PARENT && (U = this.b.U()) != null && U.j0() == zb.b.FIXED) {
            b(this.h, U.L.h, this.b.x0.g());
            b(this.i, U.L.i, -this.b.z0.g());
            return;
        }
        qc qcVar = this.e;
        boolean z = qcVar.j;
        if (z) {
            zb zbVar2 = this.b;
            if (zbVar2.G) {
                yb[] ybVarArr = zbVar2.E0;
                if (ybVarArr[2].h != null && ybVarArr[3].h != null) {
                    if (zbVar2.D0()) {
                        this.h.f = this.b.E0[2].g();
                        this.i.f = -this.b.E0[3].g();
                    } else {
                        pc h = h(this.b.E0[2]);
                        if (h != null) {
                            b(this.h, h, this.b.E0[2].g());
                        }
                        pc h2 = h(this.b.E0[3]);
                        if (h2 != null) {
                            b(this.i, h2, -this.b.E0[3].g());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if (this.b.q0()) {
                        b(this.k, this.h, this.b.t());
                        return;
                    }
                    return;
                } else if (ybVarArr[2].h != null) {
                    pc h3 = h(ybVarArr[2]);
                    if (h3 != null) {
                        b(this.h, h3, this.b.E0[2].g());
                        b(this.i, this.h, this.e.g);
                        if (this.b.q0()) {
                            b(this.k, this.h, this.b.t());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (ybVarArr[3].h != null) {
                    pc h4 = h(ybVarArr[3]);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.E0[3].g());
                        b(this.h, this.i, -this.e.g);
                    }
                    if (this.b.q0()) {
                        b(this.k, this.h, this.b.t());
                        return;
                    }
                    return;
                } else if (ybVarArr[4].h != null) {
                    pc h5 = h(ybVarArr[4]);
                    if (h5 != null) {
                        b(this.k, h5, 0);
                        b(this.h, this.k, -this.b.t());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if ((zbVar2 instanceof dc) || zbVar2.U() == null || this.b.r(yb.b.CENTER).h != null) {
                    return;
                } else {
                    b(this.h, this.b.U().L.h, this.b.p0());
                    b(this.i, this.h, this.e.g);
                    if (this.b.q0()) {
                        b(this.k, this.h, this.b.t());
                        return;
                    }
                    return;
                }
            }
        }
        if (!z && this.d == zb.b.MATCH_CONSTRAINT) {
            zb zbVar3 = this.b;
            int i = zbVar3.d0;
            if (i != 2) {
                if (i == 3 && !zbVar3.D0()) {
                    zb zbVar4 = this.b;
                    if (zbVar4.c0 != 3) {
                        qc qcVar2 = zbVar4.K.e;
                        this.e.l.add(qcVar2);
                        qcVar2.k.add(this.e);
                        qc qcVar3 = this.e;
                        qcVar3.b = true;
                        qcVar3.k.add(this.h);
                        this.e.k.add(this.i);
                    }
                }
            } else {
                zb U3 = zbVar3.U();
                if (U3 != null) {
                    qc qcVar4 = U3.L.e;
                    this.e.l.add(qcVar4);
                    qcVar4.k.add(this.e);
                    qc qcVar5 = this.e;
                    qcVar5.b = true;
                    qcVar5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        } else {
            qcVar.b(this);
        }
        zb zbVar5 = this.b;
        yb[] ybVarArr2 = zbVar5.E0;
        if (ybVarArr2[2].h != null && ybVarArr2[3].h != null) {
            if (zbVar5.D0()) {
                this.h.f = this.b.E0[2].g();
                this.i.f = -this.b.E0[3].g();
            } else {
                pc h6 = h(this.b.E0[2]);
                pc h7 = h(this.b.E0[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = zc.b.CENTER;
            }
            if (this.b.q0()) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (ybVarArr2[2].h != null) {
            pc h8 = h(ybVarArr2[2]);
            if (h8 != null) {
                b(this.h, h8, this.b.E0[2].g());
                c(this.i, this.h, 1, this.e);
                if (this.b.q0()) {
                    c(this.k, this.h, 1, this.l);
                }
                zb.b bVar2 = this.d;
                zb.b bVar3 = zb.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.b.A() > 0.0f) {
                    vc vcVar = this.b.K;
                    if (vcVar.d == bVar3) {
                        vcVar.e.k.add(this.e);
                        this.e.l.add(this.b.K.e);
                        this.e.a = this;
                    }
                }
            }
        } else if (ybVarArr2[3].h != null) {
            pc h9 = h(ybVarArr2[3]);
            if (h9 != null) {
                b(this.i, h9, -this.b.E0[3].g());
                c(this.h, this.i, -1, this.e);
                if (this.b.q0()) {
                    c(this.k, this.h, 1, this.l);
                }
            }
        } else if (ybVarArr2[4].h != null) {
            pc h10 = h(ybVarArr2[4]);
            if (h10 != null) {
                b(this.k, h10, 0);
                c(this.h, this.k, -1, this.l);
                c(this.i, this.h, 1, this.e);
            }
        } else if (!(zbVar5 instanceof dc) && zbVar5.U() != null) {
            b(this.h, this.b.U().L.h, this.b.p0());
            c(this.i, this.h, 1, this.e);
            if (this.b.q0()) {
                c(this.k, this.h, 1, this.l);
            }
            zb.b bVar4 = this.d;
            zb.b bVar5 = zb.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.b.A() > 0.0f) {
                vc vcVar2 = this.b.K;
                if (vcVar2.d == bVar5) {
                    vcVar2.e.k.add(this.e);
                    this.e.l.add(this.b.K.e);
                    this.e.a = this;
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    @Override // com.p7700g.p99005.zc
    public void e() {
        pc pcVar = this.h;
        if (pcVar.j) {
            this.b.g2(pcVar.g);
        }
    }

    @Override // com.p7700g.p99005.zc
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.p7700g.p99005.zc
    public void n() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    @Override // com.p7700g.p99005.zc
    public boolean p() {
        return this.d != zb.b.MATCH_CONSTRAINT || this.b.d0 == 0;
    }

    public String toString() {
        StringBuilder G = wo1.G("VerticalRun ");
        G.append(this.b.y());
        return G.toString();
    }
}