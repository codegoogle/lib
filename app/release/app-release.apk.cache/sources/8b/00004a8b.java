package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* compiled from: RoundedBitmapDrawable.java */
/* loaded from: classes.dex */
public abstract class jk extends Drawable {
    private static final int a = 3;
    public final Bitmap b;
    private int c;
    private final BitmapShader f;
    private float h;
    private boolean l;
    private int m;
    private int n;
    private int d = 119;
    private final Paint e = new Paint(3);
    private final Matrix g = new Matrix();
    public final Rect i = new Rect();
    private final RectF j = new RectF();
    private boolean k = true;

    public jk(Resources resources, Bitmap bitmap) {
        this.c = 160;
        if (resources != null) {
            this.c = resources.getDisplayMetrics().densityDpi;
        }
        this.b = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.n = -1;
        this.m = -1;
        this.f = null;
    }

    private void a() {
        this.m = this.b.getScaledWidth(this.c);
        this.n = this.b.getScaledHeight(this.c);
    }

    private static boolean j(float f) {
        return f > 0.05f;
    }

    private void s() {
        this.h = Math.min(this.n, this.m) / 2;
    }

    @z1
    public final Bitmap b() {
        return this.b;
    }

    public float c() {
        return this.h;
    }

    public int d() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.e.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.i, this.e);
            return;
        }
        RectF rectF = this.j;
        float f = this.h;
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    @x1
    public final Paint e() {
        return this.e;
    }

    public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.e.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.d != 119 || this.l || (bitmap = this.b) == null || bitmap.hasAlpha() || this.e.getAlpha() < 255 || j(this.h)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.l;
    }

    public void k(boolean z) {
        this.e.setAntiAlias(z);
        invalidateSelf();
    }

    public void l(boolean z) {
        this.l = z;
        this.k = true;
        if (z) {
            s();
            this.e.setShader(this.f);
            invalidateSelf();
            return;
        }
        m(0.0f);
    }

    public void m(float f) {
        if (this.h == f) {
            return;
        }
        this.l = false;
        if (j(f)) {
            this.e.setShader(this.f);
        } else {
            this.e.setShader(null);
        }
        this.h = f;
        invalidateSelf();
    }

    public void n(int i) {
        if (this.d != i) {
            this.d = i;
            this.k = true;
            invalidateSelf();
        }
    }

    public void o(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@x1 Rect rect) {
        super.onBoundsChange(rect);
        if (this.l) {
            s();
        }
        this.k = true;
    }

    public void p(int i) {
        if (this.c != i) {
            if (i == 0) {
                i = 160;
            }
            this.c = i;
            if (this.b != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@x1 Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@x1 DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.e.getAlpha()) {
            this.e.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
        invalidateSelf();
    }

    public void t() {
        if (this.k) {
            if (this.l) {
                int min = Math.min(this.m, this.n);
                f(this.d, min, min, getBounds(), this.i);
                int min2 = Math.min(this.i.width(), this.i.height());
                this.i.inset(Math.max(0, (this.i.width() - min2) / 2), Math.max(0, (this.i.height() - min2) / 2));
                this.h = min2 * 0.5f;
            } else {
                f(this.d, this.m, this.n, getBounds(), this.i);
            }
            this.j.set(this.i);
            if (this.f != null) {
                Matrix matrix = this.g;
                RectF rectF = this.j;
                matrix.setTranslate(rectF.left, rectF.top);
                this.g.preScale(this.j.width() / this.b.getWidth(), this.j.height() / this.b.getHeight());
                this.f.setLocalMatrix(this.g);
                this.e.setShader(this.f);
            }
            this.k = false;
        }
    }
}