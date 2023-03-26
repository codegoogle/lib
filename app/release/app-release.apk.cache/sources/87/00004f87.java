package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: FixedSizeDrawable.java */
/* loaded from: classes2.dex */
public class lz1 extends Drawable {
    private final Matrix a;
    private final RectF b;
    private final RectF c;
    private Drawable d;
    private a e;
    private boolean f;

    /* compiled from: FixedSizeDrawable.java */
    /* loaded from: classes2.dex */
    public static final class a extends Drawable.ConstantState {
        private final Drawable.ConstantState a;
        public final int b;
        public final int c;

        public a(a aVar) {
            this(aVar.a, aVar.b, aVar.c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable() {
            return new lz1(this, this.a.newDrawable());
        }

        public a(Drawable.ConstantState constantState, int i, int i2) {
            this.a = constantState;
            this.b = i;
            this.c = i2;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @x1
        public Drawable newDrawable(Resources resources) {
            return new lz1(this, this.a.newDrawable(resources));
        }
    }

    public lz1(Drawable drawable, int i, int i2) {
        this(new a(drawable.getConstantState(), i, i2), drawable);
    }

    private void a() {
        this.a.setRectToRect(this.b, this.c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        canvas.save();
        canvas.concat(this.a);
        this.d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @e2(19)
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable getCurrent() {
        return this.d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.e.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        return this.d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.d = this.d.mutate();
            this.e = new a(this.e);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@x1 Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.d.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.c.set(i, i2, i3, i4);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.d.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, @x1 PorterDuff.Mode mode) {
        this.d.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z) {
        this.d.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.d.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@x1 Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.d.unscheduleSelf(runnable);
    }

    public lz1(a aVar, Drawable drawable) {
        this.e = (a) x02.d(aVar);
        this.d = (Drawable) x02.d(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.a = new Matrix();
        this.b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@x1 Rect rect) {
        super.setBounds(rect);
        this.c.set(rect);
        a();
    }
}