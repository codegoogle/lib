package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.i7;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
public class p7 extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));
    private static final float b = 1.5f;
    public static a c;
    private final int d;
    private Paint f;
    private Paint g;
    private final RectF h;
    private float i;
    private Path j;
    private float k;
    private float l;
    private float m;
    private ColorStateList n;
    private final int p;
    private final int q;
    private boolean o = true;
    private boolean r = true;
    private boolean s = false;
    private Paint e = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public p7(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.p = resources.getColor(i7.b.d);
        this.q = resources.getColor(i7.b.c);
        this.d = resources.getDimensionPixelSize(i7.c.a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i = (int) (f + 0.5f);
        this.h = new RectF();
        Paint paint2 = new Paint(this.f);
        this.g = paint2;
        paint2.setAntiAlias(false);
        s(f2, f3);
    }

    private void a(Rect rect) {
        float f = this.k;
        float f2 = 1.5f * f;
        this.h.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        b();
    }

    private void b() {
        float f = this.i;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.l;
        rectF2.inset(-f2, -f2);
        Path path = this.j;
        if (path == null) {
            this.j = new Path();
        } else {
            path.reset();
        }
        this.j.setFillType(Path.FillType.EVEN_ODD);
        this.j.moveTo(-this.i, 0.0f);
        this.j.rLineTo(-this.l, 0.0f);
        this.j.arcTo(rectF2, 180.0f, 90.0f, false);
        this.j.arcTo(rectF, 270.0f, -90.0f, false);
        this.j.close();
        float f3 = this.i;
        float f4 = f3 / (this.l + f3);
        Paint paint = this.f;
        float f5 = this.i + this.l;
        int i = this.p;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.q}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.g;
        float f6 = this.i;
        float f7 = this.l;
        int i2 = this.p;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.q}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.g.setAntiAlias(false);
    }

    public static float c(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - a) * f2) + f);
        }
        return f;
    }

    public static float d(float f, float f2, boolean z) {
        if (z) {
            return (float) (((1.0d - a) * f2) + (f * 1.5f));
        }
        return f * 1.5f;
    }

    private void e(Canvas canvas) {
        float f = this.i;
        float f2 = (-f) - this.l;
        float f3 = (this.m / 2.0f) + f + this.d;
        float f4 = f3 * 2.0f;
        boolean z = this.h.width() - f4 > 0.0f;
        boolean z2 = this.h.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.h;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.j, this.f);
        if (z) {
            canvas.drawRect(0.0f, f2, this.h.width() - f4, -this.i, this.g);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.h;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.j, this.f);
        if (z) {
            canvas.drawRect(0.0f, f2, this.h.width() - f4, (-this.i) + this.l, this.g);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.h;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.j, this.f);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.h.height() - f4, -this.i, this.g);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.h;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.j, this.f);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.h.height() - f4, -this.i, this.g);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.n = colorStateList;
        this.e.setColor(colorStateList.getColorForState(getState(), this.n.getDefaultColor()));
    }

    private void s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = t(f);
            float t2 = t(f2);
            if (t > t2) {
                if (!this.s) {
                    this.s = true;
                }
                t = t2;
            }
            if (this.m == t && this.k == t2) {
                return;
            }
            this.m = t;
            this.k = t2;
            this.l = (int) ((t * 1.5f) + this.d + 0.5f);
            this.o = true;
            invalidateSelf();
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    private int t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.o) {
            a(getBounds());
            this.o = false;
        }
        canvas.translate(0.0f, this.m / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.m) / 2.0f);
        c.a(canvas, this.h, this.i, this.e);
    }

    public ColorStateList f() {
        return this.n;
    }

    public float g() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.k, this.i, this.r));
        int ceil2 = (int) Math.ceil(c(this.k, this.i, this.r));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.n;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f = this.k;
        float f2 = (f * 1.5f) / 2.0f;
        return (((this.k * 1.5f) + this.d) * 2.0f) + (Math.max(f, f2 + this.i + this.d) * 2.0f);
    }

    public float k() {
        float f = this.k;
        float f2 = f / 2.0f;
        return ((this.k + this.d) * 2.0f) + (Math.max(f, f2 + this.i + this.d) * 2.0f);
    }

    public float l() {
        return this.m;
    }

    public void m(boolean z) {
        this.r = z;
        invalidateSelf();
    }

    public void o(@z1 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.o = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.n;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.e.getColor() == colorForState) {
            return false;
        }
        this.e.setColor(colorForState);
        this.o = true;
        invalidateSelf();
        return true;
    }

    public void p(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (this.i == f2) {
                return;
            }
            this.i = f2;
            this.o = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    public void q(float f) {
        s(this.m, f);
    }

    public void r(float f) {
        s(f, this.k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.setAlpha(i);
        this.f.setAlpha(i);
        this.g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}