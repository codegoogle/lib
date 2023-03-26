package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
public class nk extends Drawable implements Drawable.Callback, mk, lk {
    public static final PorterDuff.Mode s = PorterDuff.Mode.SRC_IN;
    private int t;
    private PorterDuff.Mode u;
    private boolean v;
    public pk w;
    private boolean x;
    public Drawable y;

    public nk(@x1 pk pkVar, @z1 Resources resources) {
        this.w = pkVar;
        e(resources);
    }

    @x1
    private pk d() {
        return new pk(this.w);
    }

    private void e(@z1 Resources resources) {
        Drawable.ConstantState constantState;
        pk pkVar = this.w;
        if (pkVar == null || (constantState = pkVar.b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (c()) {
            pk pkVar = this.w;
            ColorStateList colorStateList = pkVar.c;
            PorterDuff.Mode mode = pkVar.d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.v || colorForState != this.t || mode != this.u) {
                    setColorFilter(colorForState, mode);
                    this.t = colorForState;
                    this.u = mode;
                    this.v = true;
                    return true;
                }
            } else {
                this.v = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.mk
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            pk pkVar = this.w;
            if (pkVar != null) {
                pkVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // com.p7700g.p99005.mk
    public final Drawable b() {
        return this.y;
    }

    public boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@x1 Canvas canvas) {
        this.y.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        pk pkVar = this.w;
        return changingConfigurations | (pkVar != null ? pkVar.getChangingConfigurations() : 0) | this.y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @z1
    public Drawable.ConstantState getConstantState() {
        pk pkVar = this.w;
        if (pkVar == null || !pkVar.a()) {
            return null;
        }
        this.w.a = getChangingConfigurations();
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable getCurrent() {
        return this.y.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.y.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.y.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @e2(23)
    public int getLayoutDirection() {
        return fk.f(this.y);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.y.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.y.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.y.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@x1 Rect rect) {
        return this.y.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public int[] getState() {
        return this.y.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.y.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@x1 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @e2(19)
    public boolean isAutoMirrored() {
        return fk.h(this.y);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        pk pkVar;
        ColorStateList colorStateList = (!c() || (pkVar = this.w) == null) ? null : pkVar.c;
        return (colorStateList != null && colorStateList.isStateful()) || this.y.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.y.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Drawable mutate() {
        if (!this.x && super.mutate() == this) {
            this.w = d();
            Drawable drawable = this.y;
            if (drawable != null) {
                drawable.mutate();
            }
            pk pkVar = this.w;
            if (pkVar != null) {
                Drawable drawable2 = this.y;
                pkVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @e2(23)
    public boolean onLayoutDirectionChanged(int i) {
        return fk.m(this.y, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.y.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.y.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    @e2(19)
    public void setAutoMirrored(boolean z) {
        fk.j(this.y, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.y.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.y.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.y.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.y.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@x1 int[] iArr) {
        return f(iArr) || this.y.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(ColorStateList colorStateList) {
        this.w.c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@x1 PorterDuff.Mode mode) {
        this.w.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.y.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@x1 Drawable drawable, @x1 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public nk(@z1 Drawable drawable) {
        this.w = d();
        a(drawable);
    }
}