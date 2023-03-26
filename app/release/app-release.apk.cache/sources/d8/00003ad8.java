package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.i2;

/* compiled from: BorderDrawable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class be2 extends Drawable {
    private static final float a = 1.3333f;
    @x1
    private final Paint c;
    @b1
    public float i;
    @w0
    private int j;
    @w0
    private int k;
    @w0
    private int l;
    @w0
    private int m;
    @w0
    private int n;
    private qh2 p;
    @z1
    private ColorStateList q;
    private final rh2 b = rh2.k();
    private final Path d = new Path();
    private final Rect e = new Rect();
    private final RectF f = new RectF();
    private final RectF g = new RectF();
    private final b h = new b();
    private boolean o = true;

    /* compiled from: BorderDrawable.java */
    /* loaded from: classes3.dex */
    public class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return be2.this;
        }
    }

    public be2(qh2 qh2Var) {
        this.p = qh2Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @x1
    private Shader a() {
        Rect rect = this.e;
        copyBounds(rect);
        float height = this.i / rect.height();
        return new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{fj.t(this.j, this.n), fj.t(this.k, this.n), fj.t(fj.B(this.k, 0), this.n), fj.t(fj.B(this.m, 0), this.n), fj.t(this.m, this.n), fj.t(this.l, this.n)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @x1
    public RectF b() {
        this.g.set(getBounds());
        return this.g;
    }

    public qh2 c() {
        return this.p;
    }

    public void d(@z1 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.n = colorStateList.getColorForState(getState(), this.n);
        }
        this.q = colorStateList;
        this.o = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        if (this.o) {
            this.c.setShader(a());
            this.o = false;
        }
        float strokeWidth = this.c.getStrokeWidth() / 2.0f;
        copyBounds(this.e);
        this.f.set(this.e);
        float min = Math.min(this.p.r().a(b()), this.f.width() / 2.0f);
        if (this.p.u(b())) {
            this.f.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f, min, min, this.c);
        }
    }

    public void e(@b1 float f) {
        if (this.i != f) {
            this.i = f;
            this.c.setStrokeWidth(f * a);
            this.o = true;
            invalidateSelf();
        }
    }

    public void f(@w0 int i, @w0 int i2, @w0 int i3, @w0 int i4) {
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public void g(qh2 qh2Var) {
        this.p = qh2Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @z1
    public Drawable.ConstantState getConstantState() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.i > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@x1 Outline outline) {
        if (this.p.u(b())) {
            outline.setRoundRect(getBounds(), this.p.r().a(b()));
            return;
        }
        copyBounds(this.e);
        this.f.set(this.e);
        this.b.d(this.p, 1.0f, this.f, this.d);
        if (this.d.isConvex()) {
            outline.setConvexPath(this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        if (this.p.u(b())) {
            int round = Math.round(this.i);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.q;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.o = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.q;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.n)) != this.n) {
            this.o = true;
            this.n = colorForState;
        }
        if (this.o) {
            invalidateSelf();
        }
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@p1(from = 0, to = 255) int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@z1 ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}