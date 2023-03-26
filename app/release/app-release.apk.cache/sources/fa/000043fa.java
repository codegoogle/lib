package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public class g70 extends Drawable implements Animatable {
    private static final float A = 7.5f;
    private static final float B = 2.5f;
    private static final int C = 10;
    private static final int D = 5;
    private static final float F = 0.75f;
    private static final float G = 0.5f;
    private static final int H = 1332;
    private static final float I = 216.0f;
    private static final float J = 0.8f;
    private static final float K = 0.01f;
    private static final float L = 0.20999998f;
    public static final int u = 0;
    private static final float v = 11.0f;
    private static final float w = 3.0f;
    private static final int x = 12;
    private static final int y = 6;
    public static final int z = 1;
    private final d M;
    private float N;
    private Resources O;
    private Animator P;
    public float Q;
    public boolean R;
    private static final Interpolator s = new LinearInterpolator();
    private static final Interpolator t = new qy();
    private static final int[] E = {sr.t};

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ d s;

        public a(d dVar) {
            this.s = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            g70.this.H(floatValue, this.s);
            g70.this.e(floatValue, this.s, false);
            g70.this.invalidateSelf();
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ d s;

        public b(d dVar) {
            this.s = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            g70.this.e(1.0f, this.s, true);
            this.s.M();
            this.s.v();
            g70 g70Var = g70.this;
            if (g70Var.R) {
                g70Var.R = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.s.I(false);
                return;
            }
            g70Var.Q += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g70.this.Q = 0.0f;
        }
    }

    /* compiled from: CircularProgressDrawable.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: CircularProgressDrawable.java */
    /* loaded from: classes.dex */
    public static class d {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public d() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(int i) {
            this.d.setColor(i);
        }

        public void B(float f) {
            this.q = f;
        }

        public void C(int i) {
            this.u = i;
        }

        public void D(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void E(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        public void F(@x1 int[] iArr) {
            this.i = iArr;
            E(0);
        }

        public void G(float f) {
            this.f = f;
        }

        public void H(float f) {
            this.g = f;
        }

        public void I(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        public void J(float f) {
            this.e = f;
        }

        public void K(Paint.Cap cap) {
            this.b.setStrokeCap(cap);
        }

        public void L(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }

        public void M() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            b(canvas, f5, f6, rectF);
        }

        public void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f3 = this.p;
                path3.lineTo((this.r * f3) / 2.0f, this.s * f3);
                this.o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((this.r * this.p) / 2.0f), (this.h / 2.0f) + rectF.centerY());
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        public int c() {
            return this.t;
        }

        public float d() {
            return this.s;
        }

        public float e() {
            return this.p;
        }

        public float f() {
            return this.r;
        }

        public int g() {
            return this.d.getColor();
        }

        public float h() {
            return this.q;
        }

        public int[] i() {
            return this.i;
        }

        public float j() {
            return this.f;
        }

        public int k() {
            return this.i[l()];
        }

        public int l() {
            return (this.j + 1) % this.i.length;
        }

        public float m() {
            return this.g;
        }

        public boolean n() {
            return this.n;
        }

        public float o() {
            return this.e;
        }

        public int p() {
            return this.i[this.j];
        }

        public float q() {
            return this.l;
        }

        public float r() {
            return this.m;
        }

        public float s() {
            return this.k;
        }

        public Paint.Cap t() {
            return this.b.getStrokeCap();
        }

        public float u() {
            return this.h;
        }

        public void v() {
            E(l());
        }

        public void w() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        public void x(int i) {
            this.t = i;
        }

        public void y(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        public void z(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }
    }

    public g70(@x1 Context context) {
        this.O = ((Context) jp.l(context)).getResources();
        d dVar = new d();
        this.M = dVar;
        dVar.F(E);
        E(B);
        G();
    }

    private void A(float f) {
        this.N = f;
    }

    private void B(float f, float f2, float f3, float f4) {
        d dVar = this.M;
        float f5 = this.O.getDisplayMetrics().density;
        dVar.L(f2 * f5);
        dVar.B(f * f5);
        dVar.E(0);
        dVar.y(f3 * f5, f4 * f5);
    }

    private void G() {
        d dVar = this.M;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(s);
        ofFloat.addListener(new b(dVar));
        this.P = ofFloat;
    }

    private void a(float f, d dVar) {
        H(f, dVar);
        dVar.J((((dVar.q() - K) - dVar.s()) * f) + dVar.s());
        dVar.G(dVar.q());
        dVar.H(((((float) (Math.floor(dVar.r() / J) + 1.0d)) - dVar.r()) * f) + dVar.r());
    }

    private int f(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    private float p() {
        return this.N;
    }

    public void C(float f, float f2) {
        this.M.J(f);
        this.M.G(f2);
        invalidateSelf();
    }

    public void D(@x1 Paint.Cap cap) {
        this.M.K(cap);
        invalidateSelf();
    }

    public void E(float f) {
        this.M.L(f);
        invalidateSelf();
    }

    public void F(int i) {
        if (i == 0) {
            B(v, 3.0f, 12.0f, 6.0f);
        } else {
            B(A, B, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public void H(float f, d dVar) {
        if (f > 0.75f) {
            dVar.C(f((f - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.N, bounds.exactCenterX(), bounds.exactCenterY());
        this.M.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f, d dVar, boolean z2) {
        float interpolation;
        float f2;
        if (this.R) {
            a(f, dVar);
        } else if (f != 1.0f || z2) {
            float r = dVar.r();
            if (f < 0.5f) {
                interpolation = dVar.s();
                f2 = (t.getInterpolation(f / 0.5f) * 0.79f) + K + interpolation;
            } else {
                float s2 = dVar.s() + 0.79f;
                interpolation = s2 - (((1.0f - t.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + K);
                f2 = s2;
            }
            float f3 = (f + this.Q) * I;
            dVar.J(interpolation);
            dVar.G(f2);
            dVar.H((L * f) + r);
            A(f3);
        }
    }

    public boolean g() {
        return this.M.n();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.M.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.M.d();
    }

    public float i() {
        return this.M.e();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.P.isRunning();
    }

    public float j() {
        return this.M.f();
    }

    public int k() {
        return this.M.g();
    }

    public float l() {
        return this.M.h();
    }

    @x1
    public int[] m() {
        return this.M.i();
    }

    public float n() {
        return this.M.j();
    }

    public float o() {
        return this.M.m();
    }

    public float q() {
        return this.M.o();
    }

    @x1
    public Paint.Cap r() {
        return this.M.t();
    }

    public float s() {
        return this.M.u();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.M.x(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.M.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.P.cancel();
        this.M.M();
        if (this.M.j() != this.M.o()) {
            this.R = true;
            this.P.setDuration(666L);
            this.P.start();
            return;
        }
        this.M.E(0);
        this.M.w();
        this.P.setDuration(1332L);
        this.P.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.P.cancel();
        A(0.0f);
        this.M.I(false);
        this.M.E(0);
        this.M.w();
        invalidateSelf();
    }

    public void t(float f, float f2) {
        this.M.y(f, f2);
        invalidateSelf();
    }

    public void u(boolean z2) {
        this.M.I(z2);
        invalidateSelf();
    }

    public void v(float f) {
        this.M.z(f);
        invalidateSelf();
    }

    public void w(int i) {
        this.M.A(i);
        invalidateSelf();
    }

    public void x(float f) {
        this.M.B(f);
        invalidateSelf();
    }

    public void y(@x1 int... iArr) {
        this.M.F(iArr);
        this.M.E(0);
        invalidateSelf();
    }

    public void z(float f) {
        this.M.H(f);
        invalidateSelf();
    }
}