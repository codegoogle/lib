package com.p7700g.p99005;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class at implements View.OnTouchListener {
    private static final int A = 1;
    private static final int B = 315;
    private static final int C = 1575;
    private static final float D = Float.MAX_VALUE;
    private static final float E = 0.2f;
    private static final float F = 1.0f;
    private static final int G = ViewConfiguration.getTapTimeout();
    private static final int H = 500;
    private static final int I = 500;
    public static final float s = 0.0f;
    public static final float t = Float.MAX_VALUE;
    public static final float u = 0.0f;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    private static final int y = 0;
    private static final int z = 1;
    public final View L;
    private Runnable M;
    private int P;
    private int Q;
    private boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    private boolean Y;
    private boolean Z;
    public final a J = new a();
    private final Interpolator K = new AccelerateInterpolator();
    private float[] N = {0.0f, 0.0f};
    private float[] O = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] R = {0.0f, 0.0f};
    private float[] S = {0.0f, 0.0f};
    private float[] T = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        private int a;
        private int b;
        private float c;
        private float d;
        private float j;
        private int k;
        private long e = Long.MIN_VALUE;
        private long i = -1;
        private long f = 0;
        private int g = 0;
        private int h = 0;

        private float e(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 >= 0 && j >= j3) {
                float f = this.j;
                return (at.e(((float) (j - j3)) / this.k, 0.0f, 1.0f) * f) + (1.0f - f);
            }
            return at.e(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f) {
            return (f * 4.0f) + ((-4.0f) * f * f);
        }

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = g(e(currentAnimationTimeMillis));
                this.f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f)) * g;
                this.g = (int) (this.c * f);
                this.h = (int) (f * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = at.f((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            at atVar = at.this;
            if (atVar.X) {
                if (atVar.V) {
                    atVar.V = false;
                    atVar.J.m();
                }
                a aVar = at.this.J;
                if (!aVar.h() && at.this.x()) {
                    at atVar2 = at.this;
                    if (atVar2.W) {
                        atVar2.W = false;
                        atVar2.c();
                    }
                    aVar.a();
                    at.this.l(aVar.b(), aVar.c());
                    sr.o1(at.this.L, this);
                    return;
                }
                at.this.X = false;
            }
        }
    }

    public at(@x1 View view) {
        this.L = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        r(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        s(f3, f3);
        n(1);
        q(Float.MAX_VALUE, Float.MAX_VALUE);
        v(0.2f, 0.2f);
        w(1.0f, 1.0f);
        m(G);
        u(500);
        t(500);
    }

    private float d(int i, float f, float f2, float f3) {
        float h = h(this.N[i], f2, this.O[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.R[i];
        float f5 = this.S[i];
        float f6 = this.T[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return e(h * f7, f5, f6);
        }
        return -e((-h) * f7, f5, f6);
    }

    public static float e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private float g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.P;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.X && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    private float h(float f, float f2, float f3, float f4) {
        float interpolation;
        float e = e(f * f2, 0.0f, f3);
        float g = g(f2 - f4, e) - g(f4, e);
        if (g < 0.0f) {
            interpolation = -this.K.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.K.getInterpolation(g);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void k() {
        if (this.V) {
            this.X = false;
        } else {
            this.J.i();
        }
    }

    private void y() {
        int i;
        if (this.M == null) {
            this.M = new b();
        }
        this.X = true;
        this.V = true;
        if (!this.U && (i = this.Q) > 0) {
            sr.p1(this.L, this.M, i);
        } else {
            this.M.run();
        }
        this.U = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.L.onTouchEvent(obtain);
        obtain.recycle();
    }

    public boolean i() {
        return this.Y;
    }

    public boolean j() {
        return this.Z;
    }

    public abstract void l(int i, int i2);

    @x1
    public at m(int i) {
        this.Q = i;
        return this;
    }

    @x1
    public at n(int i) {
        this.P = i;
        return this;
    }

    public at o(boolean z2) {
        if (this.Y && !z2) {
            k();
        }
        this.Y = z2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.Y) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            k();
            return this.Z && this.X;
        }
        this.W = true;
        this.U = false;
        this.J.l(d(0, motionEvent.getX(), view.getWidth(), this.L.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.L.getHeight()));
        if (!this.X && x()) {
            y();
        }
        if (this.Z) {
            return false;
        }
    }

    public at p(boolean z2) {
        this.Z = z2;
        return this;
    }

    @x1
    public at q(float f, float f2) {
        float[] fArr = this.O;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @x1
    public at r(float f, float f2) {
        float[] fArr = this.T;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @x1
    public at s(float f, float f2) {
        float[] fArr = this.S;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @x1
    public at t(int i) {
        this.J.j(i);
        return this;
    }

    @x1
    public at u(int i) {
        this.J.k(i);
        return this;
    }

    @x1
    public at v(float f, float f2) {
        float[] fArr = this.N;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @x1
    public at w(float f, float f2) {
        float[] fArr = this.R;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean x() {
        a aVar = this.J;
        int f = aVar.f();
        int d = aVar.d();
        return (f != 0 && b(f)) || (d != 0 && a(d));
    }
}