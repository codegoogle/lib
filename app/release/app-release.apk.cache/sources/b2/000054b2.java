package com.p7700g.p99005;

import com.p7700g.p99005.pp3;

/* compiled from: AnimationController.java */
/* loaded from: classes3.dex */
public class op3 {
    private pp3 a;
    private pp3.a b;
    private aq3 c;
    private pq3 d;
    private float e;
    private boolean f;

    /* compiled from: AnimationController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            eq3.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[eq3.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[eq3.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[eq3.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[eq3.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[eq3.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[eq3.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[eq3.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[eq3.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[eq3.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[eq3.SCALE_DOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public op3(@x1 pq3 pq3Var, @x1 pp3.a aVar) {
        this.a = new pp3(aVar);
        this.b = aVar;
        this.d = pq3Var;
    }

    private void a() {
        switch (this.d.b().ordinal()) {
            case 0:
                this.b.a(null);
                return;
            case 1:
                c();
                return;
            case 2:
                h();
                return;
            case 3:
                m();
                return;
            case 4:
                j();
                return;
            case 5:
                f();
                return;
            case 6:
                l();
                return;
            case 7:
                d();
                return;
            case 8:
                k();
                return;
            case 9:
                i();
                return;
            default:
                return;
        }
    }

    private void c() {
        int o = this.d.o();
        int s = this.d.s();
        aq3 b = this.a.a().l(s, o).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void d() {
        int p = this.d.x() ? this.d.p() : this.d.e();
        int q = this.d.x() ? this.d.q() : this.d.p();
        int a2 = fr3.a(this.d, p);
        int a3 = fr3.a(this.d, q);
        int k = this.d.k();
        int i = this.d.i();
        if (this.d.f() != qq3.HORIZONTAL) {
            k = i;
        }
        int l = this.d.l();
        cq3 m = this.a.b().b(this.d.a()).m(a2, a3, (l * 3) + k, l + k, l);
        if (this.f) {
            m.d(this.e);
        } else {
            m.e();
        }
        this.c = m;
    }

    private void f() {
        int o = this.d.o();
        int s = this.d.s();
        int l = this.d.l();
        int r = this.d.r();
        aq3 b = this.a.c().q(s, o, l, r).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void h() {
        int o = this.d.o();
        int s = this.d.s();
        int l = this.d.l();
        float n = this.d.n();
        aq3 b = this.a.d().p(s, o, l, n).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void i() {
        int o = this.d.o();
        int s = this.d.s();
        int l = this.d.l();
        float n = this.d.n();
        aq3 b = this.a.e().p(s, o, l, n).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void j() {
        int p = this.d.x() ? this.d.p() : this.d.e();
        int q = this.d.x() ? this.d.q() : this.d.p();
        aq3 b = this.a.f().l(fr3.a(this.d, p), fr3.a(this.d, q)).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void k() {
        int p = this.d.x() ? this.d.p() : this.d.e();
        int q = this.d.x() ? this.d.q() : this.d.p();
        aq3 b = this.a.g().l(fr3.a(this.d, p), fr3.a(this.d, q)).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void l() {
        int p = this.d.x() ? this.d.p() : this.d.e();
        int q = this.d.x() ? this.d.q() : this.d.p();
        int a2 = fr3.a(this.d, p);
        int a3 = fr3.a(this.d, q);
        boolean z = q > p;
        kq3 b = this.a.h().n(a2, a3, this.d.l(), z).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    private void m() {
        int p = this.d.x() ? this.d.p() : this.d.e();
        int q = this.d.x() ? this.d.q() : this.d.p();
        int a2 = fr3.a(this.d, p);
        int a3 = fr3.a(this.d, q);
        boolean z = q > p;
        kq3 b = this.a.i().n(a2, a3, this.d.l(), z).b(this.d.a());
        if (this.f) {
            b.d(this.e);
        } else {
            b.e();
        }
        this.c = b;
    }

    public void b() {
        this.f = false;
        this.e = 0.0f;
        a();
    }

    public void e() {
        aq3 aq3Var = this.c;
        if (aq3Var != null) {
            aq3Var.c();
        }
    }

    public void g(float f) {
        this.f = true;
        this.e = f;
        a();
    }
}