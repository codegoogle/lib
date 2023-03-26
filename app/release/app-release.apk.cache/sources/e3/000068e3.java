package com.p7700g.p99005;

import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class zc implements nc {
    public int a;
    public zb b;
    public wc c;
    public zb.b d;
    public qc e = new qc(this);
    public int f = 0;
    public boolean g = false;
    public pc h = new pc(this);
    public pc i = new pc(this);
    public b j = b.NONE;

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            yb.b.values();
            int[] iArr = new int[9];
            a = iArr;
            try {
                iArr[yb.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[yb.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[yb.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[yb.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[yb.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public zc(zb zbVar) {
        this.b = zbVar;
    }

    private void o(int i, int i2) {
        int i3;
        int i4 = this.a;
        if (i4 == 0) {
            this.e.e(g(i2, i));
        } else if (i4 == 1) {
            this.e.e(Math.min(g(this.e.m, i), i2));
        } else if (i4 == 2) {
            zb U = this.b.U();
            if (U != null) {
                qc qcVar = (i == 0 ? U.K : U.L).e;
                if (qcVar.j) {
                    zb zbVar = this.b;
                    this.e.e(g((int) ((qcVar.g * (i == 0 ? zbVar.h0 : zbVar.k0)) + 0.5f), i));
                }
            }
        } else if (i4 != 3) {
        } else {
            zb zbVar2 = this.b;
            zc zcVar = zbVar2.K;
            zb.b bVar = zcVar.d;
            zb.b bVar2 = zb.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && zcVar.a == 3) {
                xc xcVar = zbVar2.L;
                if (xcVar.d == bVar2 && xcVar.a == 3) {
                    return;
                }
            }
            if (i == 0) {
                zcVar = zbVar2.L;
            }
            if (zcVar.e.j) {
                float A = zbVar2.A();
                if (i == 1) {
                    i3 = (int) ((zcVar.e.g / A) + 0.5f);
                } else {
                    i3 = (int) ((A * zcVar.e.g) + 0.5f);
                }
                this.e.e(i3);
            }
        }
    }

    @Override // com.p7700g.p99005.nc
    public void a(nc ncVar) {
    }

    public final void b(pc pcVar, pc pcVar2, int i) {
        pcVar.l.add(pcVar2);
        pcVar.f = i;
        pcVar2.k.add(pcVar);
    }

    public final void c(pc pcVar, pc pcVar2, int i, qc qcVar) {
        pcVar.l.add(pcVar2);
        pcVar.l.add(this.e);
        pcVar.h = i;
        pcVar.i = qcVar;
        pcVar2.k.add(pcVar);
        qcVar.k.add(pcVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            zb zbVar = this.b;
            int i3 = zbVar.g0;
            max = Math.max(zbVar.f0, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            zb zbVar2 = this.b;
            int i4 = zbVar2.j0;
            max = Math.max(zbVar2.i0, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final pc h(yb ybVar) {
        yb ybVar2 = ybVar.h;
        if (ybVar2 == null) {
            return null;
        }
        zb zbVar = ybVar2.f;
        int ordinal = ybVar2.g.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            return null;
                        }
                        return zbVar.L.k;
                    }
                    return zbVar.L.i;
                }
                return zbVar.K.i;
            }
            return zbVar.L.h;
        }
        return zbVar.K.h;
    }

    public final pc i(yb ybVar, int i) {
        yb ybVar2 = ybVar.h;
        if (ybVar2 == null) {
            return null;
        }
        zb zbVar = ybVar2.f;
        zc zcVar = i == 0 ? zbVar.K : zbVar.L;
        int ordinal = ybVar2.g.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return zcVar.h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return zcVar.i;
        }
        return null;
    }

    public long j() {
        qc qcVar = this.e;
        if (qcVar.j) {
            return qcVar.g;
        }
        return 0L;
    }

    public boolean k() {
        int size = this.h.l.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.h.l.get(i2).d != this) {
                i++;
            }
        }
        int size2 = this.i.l.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (this.i.l.get(i3).d != this) {
                i++;
            }
        }
        return i >= 2;
    }

    public boolean l() {
        return this.e.j;
    }

    public boolean m() {
        return this.g;
    }

    public abstract void n();

    public abstract boolean p();

    public void q(nc ncVar, yb ybVar, yb ybVar2, int i) {
        pc h = h(ybVar);
        pc h2 = h(ybVar2);
        if (h.j && h2.j) {
            int g = ybVar.g() + h.g;
            int g2 = h2.g - ybVar2.g();
            int i2 = g2 - g;
            if (!this.e.j && this.d == zb.b.MATCH_CONSTRAINT) {
                o(i, i2);
            }
            qc qcVar = this.e;
            if (qcVar.j) {
                if (qcVar.g == i2) {
                    this.h.e(g);
                    this.i.e(g2);
                    return;
                }
                zb zbVar = this.b;
                float E = i == 0 ? zbVar.E() : zbVar.g0();
                if (h == h2) {
                    g = h.g;
                    g2 = h2.g;
                    E = 0.5f;
                }
                this.h.e((int) ((((g2 - g) - this.e.g) * E) + g + 0.5f));
                this.i.e(this.h.g + this.e.g);
            }
        }
    }

    public void r(nc ncVar) {
    }

    public void s(nc ncVar) {
    }

    public long t(int i) {
        int i2;
        qc qcVar = this.e;
        if (qcVar.j) {
            long j = qcVar.g;
            if (k()) {
                i2 = this.h.f - this.i.f;
            } else if (i == 0) {
                i2 = this.h.f;
            } else {
                return j - this.i.f;
            }
            return j + i2;
        }
        return 0L;
    }
}