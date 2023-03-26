package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.ga2;

/* compiled from: ShadowDrawableWrapper.java */
@Deprecated
/* loaded from: classes3.dex */
public class zg2 extends u3 {
    public static final double s = Math.cos(Math.toRadians(45.0d));
    public static final float t = 1.5f;
    public static final float u = 0.25f;
    public static final float v = 0.5f;
    public static final float w = 1.0f;
    public float A;
    public Path B;
    public float C;
    public float D;
    public float E;
    public float F;
    private boolean G;
    private final int H;
    private final int I;
    private final int J;
    private boolean K;
    private float L;
    private boolean M;
    @x1
    public final Paint x;
    @x1
    public final Paint y;
    @x1
    public final RectF z;

    public zg2(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.G = true;
        this.K = true;
        this.M = false;
        this.H = gh.f(context, ga2.e.z0);
        this.I = gh.f(context, ga2.e.y0);
        this.J = gh.f(context, ga2.e.x0);
        Paint paint = new Paint(5);
        this.x = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A = Math.round(f);
        this.z = new RectF();
        Paint paint2 = new Paint(paint);
        this.y = paint2;
        paint2.setAntiAlias(false);
        p(f2, f3);
    }

    private void a(@x1 Rect rect) {
        float f = this.D;
        float f2 = 1.5f * f;
        this.z.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.z;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b();
    }

    private void b() {
        float f = this.A;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.E;
        rectF2.inset(-f2, -f2);
        Path path = this.B;
        if (path == null) {
            this.B = new Path();
        } else {
            path.reset();
        }
        this.B.setFillType(Path.FillType.EVEN_ODD);
        this.B.moveTo(-this.A, 0.0f);
        this.B.rLineTo(-this.E, 0.0f);
        this.B.arcTo(rectF2, 180.0f, 90.0f, false);
        this.B.arcTo(rectF, 270.0f, -90.0f, false);
        this.B.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.A / f3;
            this.x.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.H, this.I, this.J}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.y.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.H, this.I, this.J}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.y.setAntiAlias(false);
    }

    public static float c(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - s) * f2) + f);
        }
        return f;
    }

    public static float d(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - s) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }

    private void e(@x1 Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        int save = canvas.save();
        canvas.rotate(this.L, this.z.centerX(), this.z.centerY());
        float f5 = this.A;
        float f6 = (-f5) - this.E;
        float f7 = f5 * 2.0f;
        boolean z = this.z.width() - f7 > 0.0f;
        boolean z2 = this.z.height() - f7 > 0.0f;
        float f8 = this.F;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int save2 = canvas.save();
        RectF rectF = this.z;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.B, this.x);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.z.width() - f7, -this.A, this.y);
        } else {
            i = save2;
            f = f11;
            i2 = save;
            f2 = f10;
        }
        canvas.restoreToCount(i);
        int save3 = canvas.save();
        RectF rectF2 = this.z;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.B, this.x);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.z.width() - f7, (-this.A) + this.E, this.y);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.z;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f9, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.B, this.x);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.z.height() - f7, -this.A, this.y);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.z;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.B, this.x);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.z.height() - f7, -this.A, this.y);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(i2);
    }

    private static int q(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    @Override // com.p7700g.p99005.u3, android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        if (this.G) {
            a(getBounds());
            this.G = false;
        }
        e(canvas);
        super.draw(canvas);
    }

    public float f() {
        return this.A;
    }

    public float g() {
        return this.D;
    }

    @Override // com.p7700g.p99005.u3, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.p7700g.p99005.u3, android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        int ceil = (int) Math.ceil(d(this.D, this.A, this.K));
        int ceil2 = (int) Math.ceil(c(this.D, this.A, this.K));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        float f = this.D;
        float f2 = (f * 1.5f) / 2.0f;
        return (this.D * 1.5f * 2.0f) + (Math.max(f, f2 + this.A) * 2.0f);
    }

    public float i() {
        float f = this.D;
        float f2 = f / 2.0f;
        return (this.D * 2.0f) + (Math.max(f, f2 + this.A) * 2.0f);
    }

    public float j() {
        return this.F;
    }

    public void k(boolean z) {
        this.K = z;
        invalidateSelf();
    }

    public void l(float f) {
        float round = Math.round(f);
        if (this.A == round) {
            return;
        }
        this.A = round;
        this.G = true;
        invalidateSelf();
    }

    public void m(float f) {
        p(this.F, f);
    }

    public final void n(float f) {
        if (this.L != f) {
            this.L = f;
            invalidateSelf();
        }
    }

    public void o(float f) {
        p(f, this.D);
    }

    @Override // com.p7700g.p99005.u3, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.G = true;
    }

    public void p(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            float q = q(f);
            float q2 = q(f2);
            if (q > q2) {
                if (!this.M) {
                    this.M = true;
                }
                q = q2;
            }
            if (this.F == q && this.D == q2) {
                return;
            }
            this.F = q;
            this.D = q2;
            this.E = Math.round(q * 1.5f);
            this.C = q2;
            this.G = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    @Override // com.p7700g.p99005.u3, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.x.setAlpha(i);
        this.y.setAlpha(i);
    }
}