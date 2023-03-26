package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FastScroller.java */
@r2
/* loaded from: classes.dex */
public class z20 extends RecyclerView.n implements RecyclerView.s {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 500;
    private static final int l = 1500;
    private static final int m = 1200;
    private static final int n = 500;
    private static final int o = 255;
    private static final int[] p = {16842919};
    private static final int[] q = new int[0];
    private final int A;
    @r2
    public int B;
    @r2
    public int C;
    @r2
    public float D;
    @r2
    public int E;
    @r2
    public int F;
    @r2
    public float G;
    private RecyclerView J;
    public final ValueAnimator Q;
    public int R;
    private final Runnable S;
    private final RecyclerView.t T;
    private final int r;
    private final int s;
    public final StateListDrawable t;
    public final Drawable u;
    private final int v;
    private final int w;
    private final StateListDrawable x;
    private final Drawable y;
    private final int z;
    private int H = 0;
    private int I = 0;
    private boolean K = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    private final int[] O = new int[2];
    private final int[] P = new int[2];

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z20.this.w(500);
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            z20.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        private boolean s = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.s) {
                this.s = false;
            } else if (((Float) z20.this.Q.getAnimatedValue()).floatValue() == 0.0f) {
                z20 z20Var = z20.this;
                z20Var.R = 0;
                z20Var.G(0);
            } else {
                z20 z20Var2 = z20.this;
                z20Var2.R = 2;
                z20Var2.D();
            }
        }
    }

    /* compiled from: FastScroller.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            z20.this.t.setAlpha(floatValue);
            z20.this.u.setAlpha(floatValue);
            z20.this.D();
        }
    }

    public z20(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = ofFloat;
        this.R = 0;
        this.S = new a();
        this.T = new b();
        this.t = stateListDrawable;
        this.u = drawable;
        this.x = stateListDrawable2;
        this.y = drawable2;
        this.v = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.w = Math.max(i2, drawable.getIntrinsicWidth());
        this.z = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.A = Math.max(i2, drawable2.getIntrinsicWidth());
        this.r = i3;
        this.s = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        l(recyclerView);
    }

    private void E(int i2) {
        m();
        this.J.postDelayed(this.S, i2);
    }

    private int F(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private void H() {
        this.J.m(this);
        this.J.p(this);
        this.J.q(this.T);
    }

    private void K(float f2) {
        int[] t = t();
        float max = Math.max(t[0], Math.min(t[1], f2));
        if (Math.abs(this.C - max) < 2.0f) {
            return;
        }
        int F = F(this.D, max, t, this.J.computeVerticalScrollRange(), this.J.computeVerticalScrollOffset(), this.I);
        if (F != 0) {
            this.J.scrollBy(0, F);
        }
        this.D = max;
    }

    private void m() {
        this.J.removeCallbacks(this.S);
    }

    private void n() {
        this.J.o1(this);
        this.J.r1(this);
        this.J.s1(this.T);
        m();
    }

    private void o(Canvas canvas) {
        int i2 = this.I;
        int i3 = this.z;
        int i4 = i2 - i3;
        int i5 = this.F;
        int i6 = this.E;
        int i7 = i5 - (i6 / 2);
        this.x.setBounds(0, 0, i6, i3);
        this.y.setBounds(0, 0, this.H, this.A);
        canvas.translate(0.0f, i4);
        this.y.draw(canvas);
        canvas.translate(i7, 0.0f);
        this.x.draw(canvas);
        canvas.translate(-i7, -i4);
    }

    private void p(Canvas canvas) {
        int i2 = this.H;
        int i3 = this.v;
        int i4 = i2 - i3;
        int i5 = this.C;
        int i6 = this.B;
        int i7 = i5 - (i6 / 2);
        this.t.setBounds(0, 0, i3, i6);
        this.u.setBounds(0, 0, this.w, this.I);
        if (z()) {
            this.u.draw(canvas);
            canvas.translate(this.v, i7);
            canvas.scale(-1.0f, 1.0f);
            this.t.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate(-this.v, -i7);
            return;
        }
        canvas.translate(i4, 0.0f);
        this.u.draw(canvas);
        canvas.translate(0.0f, i7);
        this.t.draw(canvas);
        canvas.translate(-i4, -i7);
    }

    private int[] q() {
        int[] iArr = this.P;
        int i2 = this.s;
        iArr[0] = i2;
        iArr[1] = this.H - i2;
        return iArr;
    }

    private int[] t() {
        int[] iArr = this.O;
        int i2 = this.s;
        iArr[0] = i2;
        iArr[1] = this.I - i2;
        return iArr;
    }

    private void x(float f2) {
        int[] q2 = q();
        float max = Math.max(q2[0], Math.min(q2[1], f2));
        if (Math.abs(this.F - max) < 2.0f) {
            return;
        }
        int F = F(this.G, max, q2, this.J.computeHorizontalScrollRange(), this.J.computeHorizontalScrollOffset(), this.H);
        if (F != 0) {
            this.J.scrollBy(F, 0);
        }
        this.G = max;
    }

    private boolean z() {
        return sr.Y(this.J) == 1;
    }

    @r2
    public boolean A(float f2, float f3) {
        if (f3 >= this.I - this.z) {
            int i2 = this.F;
            int i3 = this.E;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    @r2
    public boolean B(float f2, float f3) {
        if (!z() ? f2 >= this.H - this.v : f2 <= this.v / 2) {
            int i2 = this.C;
            int i3 = this.B;
            if (f3 >= i2 - (i3 / 2) && f3 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    @r2
    public boolean C() {
        return this.M == 1;
    }

    public void D() {
        this.J.invalidate();
    }

    public void G(int i2) {
        if (i2 == 2 && this.M != 2) {
            this.t.setState(p);
            m();
        }
        if (i2 == 0) {
            D();
        } else {
            I();
        }
        if (this.M == 2 && i2 != 2) {
            this.t.setState(q);
            E(1200);
        } else if (i2 == 1) {
            E(1500);
        }
        this.M = i2;
    }

    public void I() {
        int i2 = this.R;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            this.Q.cancel();
        }
        this.R = 1;
        ValueAnimator valueAnimator = this.Q;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.Q.setDuration(500L);
        this.Q.setStartDelay(0L);
        this.Q.start();
    }

    public void J(int i2, int i3) {
        int computeVerticalScrollRange = this.J.computeVerticalScrollRange();
        int i4 = this.I;
        this.K = computeVerticalScrollRange - i4 > 0 && i4 >= this.r;
        int computeHorizontalScrollRange = this.J.computeHorizontalScrollRange();
        int i5 = this.H;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= this.r;
        this.L = z;
        boolean z2 = this.K;
        if (!z2 && !z) {
            if (this.M != 0) {
                G(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i4;
            this.C = (int) ((((f2 / 2.0f) + i3) * f2) / computeVerticalScrollRange);
            this.B = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (this.L) {
            float f3 = i5;
            this.F = (int) ((((f3 / 2.0f) + i2) * f3) / computeHorizontalScrollRange);
            this.E = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = this.M;
        if (i6 == 0 || i6 == 1) {
            G(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
        if (this.M == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean B = B(motionEvent.getX(), motionEvent.getY());
            boolean A = A(motionEvent.getX(), motionEvent.getY());
            if (B || A) {
                if (A) {
                    this.N = 1;
                    this.G = (int) motionEvent.getX();
                } else if (B) {
                    this.N = 2;
                    this.D = (int) motionEvent.getY();
                }
                G(2);
            }
        } else if (motionEvent.getAction() == 1 && this.M == 2) {
            this.D = 0.0f;
            this.G = 0.0f;
            G(1);
            this.N = 0;
        } else if (motionEvent.getAction() == 2 && this.M == 2) {
            I();
            if (this.N == 1) {
                x(motionEvent.getX());
            }
            if (this.N == 2) {
                K(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean c(@x1 RecyclerView recyclerView, @x1 MotionEvent motionEvent) {
        int i2 = this.M;
        if (i2 == 1) {
            boolean B = B(motionEvent.getX(), motionEvent.getY());
            boolean A = A(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!B && !A) {
                return false;
            }
            if (A) {
                this.N = 1;
                this.G = (int) motionEvent.getX();
            } else if (B) {
                this.N = 2;
                this.D = (int) motionEvent.getY();
            }
            G(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void e(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.H == this.J.getWidth() && this.I == this.J.getHeight()) {
            if (this.R != 0) {
                if (this.K) {
                    p(canvas);
                }
                if (this.L) {
                    o(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.H = this.J.getWidth();
        this.I = this.J.getHeight();
        G(0);
    }

    public void l(@z1 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.J;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            n();
        }
        this.J = recyclerView;
        if (recyclerView != null) {
            H();
        }
    }

    @r2
    public Drawable r() {
        return this.x;
    }

    @r2
    public Drawable s() {
        return this.y;
    }

    @r2
    public Drawable u() {
        return this.t;
    }

    @r2
    public Drawable v() {
        return this.u;
    }

    @r2
    public void w(int i2) {
        int i3 = this.R;
        if (i3 == 1) {
            this.Q.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.R = 3;
        ValueAnimator valueAnimator = this.Q;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.Q.setDuration(i2);
        this.Q.start();
    }

    public boolean y() {
        return this.M == 2;
    }
}