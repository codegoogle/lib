package com.p7700g.p99005;

import android.graphics.Canvas;
import android.view.MotionEvent;

/* compiled from: DrawController.java */
/* loaded from: classes3.dex */
public class nq3 {
    private rp3 a;
    private tq3 b;
    private pq3 c;
    private b d;

    /* compiled from: DrawController.java */
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
                a[eq3.SLIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[eq3.FILL.ordinal()] = 6;
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

    /* compiled from: DrawController.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);
    }

    public nq3(@x1 pq3 pq3Var) {
        this.c = pq3Var;
        this.b = new tq3(pq3Var);
    }

    private void b(@x1 Canvas canvas, int i, int i2, int i3) {
        boolean x = this.c.x();
        int p = this.c.p();
        int q = this.c.q();
        boolean z = true;
        boolean z2 = !x && (i == p || i == this.c.e());
        if (!x || (i != p && i != q)) {
            z = false;
        }
        boolean z3 = z2 | z;
        this.b.k(i, i2, i3);
        if (this.a != null && z3) {
            c(canvas);
        } else {
            this.b.a(canvas, z3);
        }
    }

    private void c(@x1 Canvas canvas) {
        switch (this.c.b().ordinal()) {
            case 0:
                this.b.a(canvas, true);
                return;
            case 1:
                this.b.b(canvas, this.a);
                return;
            case 2:
                this.b.e(canvas, this.a);
                return;
            case 3:
                this.b.j(canvas, this.a);
                return;
            case 4:
                this.b.g(canvas, this.a);
                return;
            case 5:
                this.b.d(canvas, this.a);
                return;
            case 6:
                this.b.i(canvas, this.a);
                return;
            case 7:
                this.b.c(canvas, this.a);
                return;
            case 8:
                this.b.h(canvas, this.a);
                return;
            case 9:
                this.b.f(canvas, this.a);
                return;
            default:
                return;
        }
    }

    private void d(float f, float f2) {
        int d;
        if (this.d == null || (d = fr3.d(this.c, f, f2)) < 0) {
            return;
        }
        this.d.a(d);
    }

    public void a(@x1 Canvas canvas) {
        int c = this.c.c();
        for (int i = 0; i < c; i++) {
            b(canvas, i, fr3.g(this.c, i), fr3.h(this.c, i));
        }
    }

    public void e(@z1 b bVar) {
        this.d = bVar;
    }

    public void f(@z1 MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            d(motionEvent.getX(), motionEvent.getY());
        }
    }

    public void g(@z1 rp3 rp3Var) {
        this.a = rp3Var;
    }
}