package com.p7700g.p99005;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: Sprite.java */
/* loaded from: classes2.dex */
public abstract class x12 extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    private float H;
    private float I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private float P;
    private float Q;
    private ValueAnimator R;
    private static final Rect s = new Rect();
    public static final Property<x12, Integer> t = new c("rotateX");
    public static final Property<x12, Integer> u = new d("rotate");
    public static final Property<x12, Integer> v = new e("rotateY");
    public static final Property<x12, Integer> w = new f("translateX");
    public static final Property<x12, Integer> x = new g("translateY");
    public static final Property<x12, Float> y = new h("translateXPercentage");
    public static final Property<x12, Float> z = new i("translateYPercentage");
    public static final Property<x12, Float> A = new j("scaleX");
    public static final Property<x12, Float> B = new k("scaleY");
    public static final Property<x12, Float> C = new a("scale");
    public static final Property<x12, Integer> D = new b("alpha");
    private float E = 1.0f;
    private float F = 1.0f;
    private float G = 1.0f;
    private int S = 255;
    public Rect T = s;
    private Camera U = new Camera();
    private Matrix V = new Matrix();

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class a extends j12<x12> {
        public a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(x12 x12Var) {
            return Float.valueOf(x12Var.n());
        }

        @Override // com.p7700g.p99005.j12
        /* renamed from: d */
        public void b(x12 x12Var, float f) {
            x12Var.G(f);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class b extends k12<x12> {
        public b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.getAlpha());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.setAlpha(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class c extends k12<x12> {
        public c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.l());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.E(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class d extends k12<x12> {
        public d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.k());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.D(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class e extends k12<x12> {
        public e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.m());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.F(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class f extends k12<x12> {
        public f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.q());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.J(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class g extends k12<x12> {
        public g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Integer get(x12 x12Var) {
            return Integer.valueOf(x12Var.s());
        }

        @Override // com.p7700g.p99005.k12
        /* renamed from: d */
        public void b(x12 x12Var, int i) {
            x12Var.L(i);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class h extends j12<x12> {
        public h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(x12 x12Var) {
            return Float.valueOf(x12Var.r());
        }

        @Override // com.p7700g.p99005.j12
        /* renamed from: d */
        public void b(x12 x12Var, float f) {
            x12Var.K(f);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class i extends j12<x12> {
        public i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(x12 x12Var) {
            return Float.valueOf(x12Var.t());
        }

        @Override // com.p7700g.p99005.j12
        /* renamed from: d */
        public void b(x12 x12Var, float f) {
            x12Var.M(f);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class j extends j12<x12> {
        public j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(x12 x12Var) {
            return Float.valueOf(x12Var.o());
        }

        @Override // com.p7700g.p99005.j12
        /* renamed from: d */
        public void b(x12 x12Var, float f) {
            x12Var.H(f);
        }
    }

    /* compiled from: Sprite.java */
    /* loaded from: classes2.dex */
    public static class k extends j12<x12> {
        public k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: c */
        public Float get(x12 x12Var) {
            return Float.valueOf(x12Var.p());
        }

        @Override // com.p7700g.p99005.j12
        /* renamed from: d */
        public void b(x12 x12Var, float f) {
            x12Var.I(f);
        }
    }

    public void A(Rect rect) {
        z(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void B(float f2) {
        this.H = f2;
    }

    public void C(float f2) {
        this.I = f2;
    }

    public void D(int i2) {
        this.O = i2;
    }

    public void E(int i2) {
        this.K = i2;
    }

    public void F(int i2) {
        this.L = i2;
    }

    public void G(float f2) {
        this.E = f2;
        H(f2);
        I(f2);
    }

    public void H(float f2) {
        this.F = f2;
    }

    public void I(float f2) {
        this.G = f2;
    }

    public void J(int i2) {
        this.M = i2;
    }

    public void K(float f2) {
        this.P = f2;
    }

    public void L(int i2) {
        this.N = i2;
    }

    public void M(float f2) {
        this.Q = f2;
    }

    public Rect a(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i2 = min / 2;
        return new Rect(centerX - i2, centerY - i2, centerX + i2, centerY + i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int q = q();
        if (q == 0) {
            q = (int) (r() * getBounds().width());
        }
        int s2 = s();
        if (s2 == 0) {
            s2 = (int) (t() * getBounds().height());
        }
        canvas.translate(q, s2);
        canvas.scale(o(), p(), i(), j());
        canvas.rotate(k(), i(), j());
        if (l() != 0 || m() != 0) {
            this.U.save();
            this.U.rotateX(l());
            this.U.rotateY(m());
            this.U.getMatrix(this.V);
            this.V.preTranslate(-i(), -j());
            this.V.postTranslate(i(), j());
            this.U.restore();
            canvas.concat(this.V);
        }
        e(canvas);
    }

    public abstract void e(Canvas canvas);

    public int f() {
        return this.J;
    }

    public abstract int g();

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public Rect h() {
        return this.T;
    }

    public float i() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return i12.a(this.R);
    }

    public float j() {
        return this.I;
    }

    public int k() {
        return this.O;
    }

    public int l() {
        return this.K;
    }

    public int m() {
        return this.L;
    }

    public float n() {
        return this.E;
    }

    public float o() {
        return this.F;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A(rect);
    }

    public float p() {
        return this.G;
    }

    public int q() {
        return this.M;
    }

    public float r() {
        return this.P;
    }

    public int s() {
        return this.N;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.S = i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (i12.c(this.R)) {
            return;
        }
        ValueAnimator u2 = u();
        this.R = u2;
        if (u2 == null) {
            return;
        }
        i12.d(u2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (i12.c(this.R)) {
            this.R.removeAllUpdateListeners();
            this.R.end();
            w();
        }
    }

    public float t() {
        return this.Q;
    }

    public ValueAnimator u() {
        if (this.R == null) {
            this.R = v();
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.R.setStartDelay(this.J);
        }
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public abstract ValueAnimator v();

    public void w() {
        this.E = 1.0f;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0.0f;
        this.Q = 0.0f;
    }

    public x12 x(int i2) {
        this.J = i2;
        return this;
    }

    public abstract void y(int i2);

    public void z(int i2, int i3, int i4, int i5) {
        this.T = new Rect(i2, i3, i4, i5);
        B(h().centerX());
        C(h().centerY());
    }
}