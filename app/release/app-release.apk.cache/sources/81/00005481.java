package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
@e2(21)
/* loaded from: classes.dex */
public class ok extends nk {
    private static Method A = null;
    private static final String z = "WrappedDrawableApi21";

    public ok(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (A == null) {
            try {
                A = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.p7700g.p99005.nk
    public boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.y;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @x1
    public Rect getDirtyBounds() {
        return this.y.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@x1 Outline outline) {
        this.y.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.y;
        if (drawable != null && (method = A) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.y.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.y.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p7700g.p99005.nk, android.graphics.drawable.Drawable
    public boolean setState(@x1 int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.nk, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.y.setTint(i);
        }
    }

    @Override // com.p7700g.p99005.nk, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.y.setTintList(colorStateList);
        }
    }

    @Override // com.p7700g.p99005.nk, android.graphics.drawable.Drawable, com.p7700g.p99005.lk
    public void setTintMode(@x1 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.y.setTintMode(mode);
        }
    }

    public ok(pk pkVar, Resources resources) {
        super(pkVar, resources);
        g();
    }
}