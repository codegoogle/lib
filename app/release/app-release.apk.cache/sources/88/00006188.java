package com.p7700g.p99005;

import com.p7700g.p99005.pc;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import com.p7700g.p99005.zc;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class vc extends zc {
    private static int[] k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
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

    public vc(zb zbVar) {
        super(zbVar);
        this.h.e = pc.a.LEFT;
        this.i.e = pc.a.RIGHT;
        this.f = 0;
    }

    private void u(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ba, code lost:
        if (r14 != 1) goto L130;
     */
    @Override // com.p7700g.p99005.zc, com.p7700g.p99005.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
            q(ncVar, zbVar2.w0, zbVar2.y0, 0);
            return;
        }
        if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT) {
            zb zbVar3 = this.b;
            int i2 = zbVar3.c0;
            if (i2 == 2) {
                zb U = zbVar3.U();
                if (U != null) {
                    if (U.K.e.j) {
                        this.e.e((int) ((qcVar.g * this.b.h0) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = zbVar3.d0;
                if (i3 != 0 && i3 != 3) {
                    int B = zbVar3.B();
                    if (B == -1) {
                        zb zbVar4 = this.b;
                        f = zbVar4.L.e.g;
                        A = zbVar4.A();
                    } else {
                        if (B == 0) {
                            i = (int) ((zbVar.L.e.g / this.b.A()) + 0.5f);
                        } else if (B != 1) {
                            i = 0;
                        } else {
                            zb zbVar5 = this.b;
                            f = zbVar5.L.e.g;
                            A = zbVar5.A();
                        }
                        this.e.e(i);
                    }
                    i = (int) ((A * f) + 0.5f);
                    this.e.e(i);
                } else {
                    xc xcVar = zbVar3.L;
                    pc pcVar = xcVar.h;
                    pc pcVar2 = xcVar.i;
                    boolean z = zbVar3.w0.h != null;
                    boolean z2 = zbVar3.x0.h != null;
                    boolean z3 = zbVar3.y0.h != null;
                    boolean z4 = zbVar3.z0.h != null;
                    int B2 = zbVar3.B();
                    if (z && z2 && z3 && z4) {
                        float A2 = this.b.A();
                        if (pcVar.j && pcVar2.j) {
                            pc pcVar3 = this.h;
                            if (pcVar3.c && this.i.c) {
                                u(k, pcVar3.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, pcVar.g + pcVar.f, pcVar2.g - pcVar2.f, A2, B2);
                                this.e.e(k[0]);
                                this.b.L.e.e(k[1]);
                                return;
                            }
                            return;
                        }
                        pc pcVar4 = this.h;
                        if (pcVar4.j) {
                            pc pcVar5 = this.i;
                            if (pcVar5.j) {
                                if (!pcVar.c || !pcVar2.c) {
                                    return;
                                }
                                u(k, pcVar4.g + pcVar4.f, pcVar5.g - pcVar5.f, pcVar.l.get(0).g + pcVar.f, pcVar2.l.get(0).g - pcVar2.f, A2, B2);
                                this.e.e(k[0]);
                                this.b.L.e.e(k[1]);
                            }
                        }
                        pc pcVar6 = this.h;
                        if (!pcVar6.c || !this.i.c || !pcVar.c || !pcVar2.c) {
                            return;
                        }
                        u(k, pcVar6.l.get(0).g + this.h.f, this.i.l.get(0).g - this.i.f, pcVar.l.get(0).g + pcVar.f, pcVar2.l.get(0).g - pcVar2.f, A2, B2);
                        this.e.e(k[0]);
                        this.b.L.e.e(k[1]);
                    } else if (z && z3) {
                        if (!this.h.c || !this.i.c) {
                            return;
                        }
                        float A3 = this.b.A();
                        int i4 = this.h.l.get(0).g + this.h.f;
                        int i5 = this.i.l.get(0).g - this.i.f;
                        if (B2 == -1 || B2 == 0) {
                            int g = g(i5 - i4, 0);
                            int i6 = (int) ((g * A3) + 0.5f);
                            int g2 = g(i6, 1);
                            if (i6 != g2) {
                                g = (int) ((g2 / A3) + 0.5f);
                            }
                            this.e.e(g);
                            this.b.L.e.e(g2);
                        } else if (B2 == 1) {
                            int g3 = g(i5 - i4, 0);
                            int i7 = (int) ((g3 / A3) + 0.5f);
                            int g4 = g(i7, 1);
                            if (i7 != g4) {
                                g3 = (int) ((g4 * A3) + 0.5f);
                            }
                            this.e.e(g3);
                            this.b.L.e.e(g4);
                        }
                    } else if (z2 && z4) {
                        if (!pcVar.c || !pcVar2.c) {
                            return;
                        }
                        float A4 = this.b.A();
                        int i8 = pcVar.l.get(0).g + pcVar.f;
                        int i9 = pcVar2.l.get(0).g - pcVar2.f;
                        if (B2 != -1) {
                            if (B2 == 0) {
                                int g5 = g(i9 - i8, 1);
                                int i10 = (int) ((g5 * A4) + 0.5f);
                                int g6 = g(i10, 0);
                                if (i10 != g6) {
                                    g5 = (int) ((g6 / A4) + 0.5f);
                                }
                                this.e.e(g6);
                                this.b.L.e.e(g5);
                            }
                        }
                        int g7 = g(i9 - i8, 1);
                        int i11 = (int) ((g7 / A4) + 0.5f);
                        int g8 = g(i11, 0);
                        if (i11 != g8) {
                            g7 = (int) ((g8 * A4) + 0.5f);
                        }
                        this.e.e(g8);
                        this.b.L.e.e(g7);
                    }
                }
            }
        }
        pc pcVar7 = this.h;
        if (pcVar7.c) {
            pc pcVar8 = this.i;
            if (pcVar8.c) {
                if (pcVar7.j && pcVar8.j && this.e.j) {
                    return;
                }
                if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT) {
                    zb zbVar6 = this.b;
                    if (zbVar6.c0 == 0 && !zbVar6.B0()) {
                        int i12 = this.h.l.get(0).g;
                        pc pcVar9 = this.h;
                        int i13 = i12 + pcVar9.f;
                        int i14 = this.i.l.get(0).g + this.i.f;
                        pcVar9.e(i13);
                        this.i.e(i14);
                        this.e.e(i14 - i13);
                        return;
                    }
                }
                if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    int min = Math.min((this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f), this.e.m);
                    zb zbVar7 = this.b;
                    int i15 = zbVar7.g0;
                    int max = Math.max(zbVar7.f0, min);
                    if (i15 > 0) {
                        max = Math.min(i15, max);
                    }
                    this.e.e(max);
                }
                if (this.e.j) {
                    pc pcVar10 = this.h.l.get(0);
                    pc pcVar11 = this.i.l.get(0);
                    int i16 = pcVar10.g + this.h.f;
                    int i17 = pcVar11.g + this.i.f;
                    float E = this.b.E();
                    if (pcVar10 == pcVar11) {
                        i16 = pcVar10.g;
                        i17 = pcVar11.g;
                        E = 0.5f;
                    }
                    this.h.e((int) ((((i17 - i16) - this.e.g) * E) + i16 + 0.5f));
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
            this.e.e(zbVar.m0());
        }
        if (!this.e.j) {
            zb.b H = this.b.H();
            this.d = H;
            if (H != zb.b.MATCH_CONSTRAINT) {
                zb.b bVar = zb.b.MATCH_PARENT;
                if (H == bVar && (U2 = this.b.U()) != null && (U2.H() == zb.b.FIXED || U2.H() == bVar)) {
                    int m0 = (U2.m0() - this.b.w0.g()) - this.b.y0.g();
                    b(this.h, U2.K.h, this.b.w0.g());
                    b(this.i, U2.K.i, -this.b.y0.g());
                    this.e.e(m0);
                    return;
                } else if (this.d == zb.b.FIXED) {
                    this.e.e(this.b.m0());
                }
            }
        } else {
            zb.b bVar2 = this.d;
            zb.b bVar3 = zb.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (U = this.b.U()) != null && (U.H() == zb.b.FIXED || U.H() == bVar3)) {
                b(this.h, U.K.h, this.b.w0.g());
                b(this.i, U.K.i, -this.b.y0.g());
                return;
            }
        }
        qc qcVar = this.e;
        if (qcVar.j) {
            zb zbVar2 = this.b;
            if (zbVar2.G) {
                yb[] ybVarArr = zbVar2.E0;
                if (ybVarArr[0].h != null && ybVarArr[1].h != null) {
                    if (zbVar2.B0()) {
                        this.h.f = this.b.E0[0].g();
                        this.i.f = -this.b.E0[1].g();
                        return;
                    }
                    pc h = h(this.b.E0[0]);
                    if (h != null) {
                        b(this.h, h, this.b.E0[0].g());
                    }
                    pc h2 = h(this.b.E0[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.E0[1].g());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (ybVarArr[0].h != null) {
                    pc h3 = h(ybVarArr[0]);
                    if (h3 != null) {
                        b(this.h, h3, this.b.E0[0].g());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if (ybVarArr[1].h != null) {
                    pc h4 = h(ybVarArr[1]);
                    if (h4 != null) {
                        b(this.i, h4, -this.b.E0[1].g());
                        b(this.h, this.i, -this.e.g);
                        return;
                    }
                    return;
                } else if ((zbVar2 instanceof dc) || zbVar2.U() == null || this.b.r(yb.b.CENTER).h != null) {
                    return;
                } else {
                    b(this.h, this.b.U().K.h, this.b.o0());
                    b(this.i, this.h, this.e.g);
                    return;
                }
            }
        }
        if (this.d == zb.b.MATCH_CONSTRAINT) {
            zb zbVar3 = this.b;
            int i = zbVar3.c0;
            if (i == 2) {
                zb U3 = zbVar3.U();
                if (U3 != null) {
                    qc qcVar2 = U3.L.e;
                    this.e.l.add(qcVar2);
                    qcVar2.k.add(this.e);
                    qc qcVar3 = this.e;
                    qcVar3.b = true;
                    qcVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3) {
                if (zbVar3.d0 == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    xc xcVar = zbVar3.L;
                    xcVar.h.a = this;
                    xcVar.i.a = this;
                    qcVar.a = this;
                    if (zbVar3.D0()) {
                        this.e.l.add(this.b.L.e);
                        this.b.L.e.k.add(this.e);
                        xc xcVar2 = this.b.L;
                        xcVar2.e.a = this;
                        this.e.l.add(xcVar2.h);
                        this.e.l.add(this.b.L.i);
                        this.b.L.h.k.add(this.e);
                        this.b.L.i.k.add(this.e);
                    } else if (this.b.B0()) {
                        this.b.L.e.l.add(this.e);
                        this.e.k.add(this.b.L.e);
                    } else {
                        this.b.L.e.l.add(this.e);
                    }
                } else {
                    qc qcVar4 = zbVar3.L.e;
                    qcVar.l.add(qcVar4);
                    qcVar4.k.add(this.e);
                    this.b.L.h.k.add(this.e);
                    this.b.L.i.k.add(this.e);
                    qc qcVar5 = this.e;
                    qcVar5.b = true;
                    qcVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        zb zbVar4 = this.b;
        yb[] ybVarArr2 = zbVar4.E0;
        if (ybVarArr2[0].h != null && ybVarArr2[1].h != null) {
            if (zbVar4.B0()) {
                this.h.f = this.b.E0[0].g();
                this.i.f = -this.b.E0[1].g();
                return;
            }
            pc h5 = h(this.b.E0[0]);
            pc h6 = h(this.b.E0[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = zc.b.CENTER;
        } else if (ybVarArr2[0].h != null) {
            pc h7 = h(ybVarArr2[0]);
            if (h7 != null) {
                b(this.h, h7, this.b.E0[0].g());
                c(this.i, this.h, 1, this.e);
            }
        } else if (ybVarArr2[1].h != null) {
            pc h8 = h(ybVarArr2[1]);
            if (h8 != null) {
                b(this.i, h8, -this.b.E0[1].g());
                c(this.h, this.i, -1, this.e);
            }
        } else if ((zbVar4 instanceof dc) || zbVar4.U() == null) {
        } else {
            b(this.h, this.b.U().K.h, this.b.o0());
            c(this.i, this.h, 1, this.e);
        }
    }

    @Override // com.p7700g.p99005.zc
    public void e() {
        pc pcVar = this.h;
        if (pcVar.j) {
            this.b.f2(pcVar.g);
        }
    }

    @Override // com.p7700g.p99005.zc
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
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
        this.e.j = false;
    }

    @Override // com.p7700g.p99005.zc
    public boolean p() {
        return this.d != zb.b.MATCH_CONSTRAINT || this.b.c0 == 0;
    }

    public String toString() {
        StringBuilder G = wo1.G("HorizontalRun ");
        G.append(this.b.y());
        return G.toString();
    }
}