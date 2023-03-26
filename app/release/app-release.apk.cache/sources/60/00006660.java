package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p7700g.p99005.ay5;
import java.io.IOException;

/* compiled from: GifTextView.java */
/* loaded from: classes4.dex */
public class xx5 extends TextView {
    private ay5.b s;

    public xx5(Context context) {
        super(context);
    }

    private void a() {
        if (this.s.b < 0) {
            return;
        }
        for (Drawable drawable : getCompoundDrawables()) {
            ay5.a(this.s.b, drawable);
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            ay5.a(this.s.b, drawable2);
        }
        ay5.a(this.s.b, getBackground());
    }

    private Drawable b(int i) {
        if (i == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i);
        if (!isInEditMode() && ay5.b.contains(resourceTypeName)) {
            try {
                return new ox5(resources, i);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return resources.getDrawable(i, getContext().getTheme());
    }

    private void c(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            Drawable b = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableLeft", 0));
            Drawable b2 = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableTop", 0));
            Drawable b3 = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableRight", 0));
            Drawable b4 = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableBottom", 0));
            Drawable b5 = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableStart", 0));
            Drawable b6 = b(attributeSet.getAttributeResourceValue(ay5.a, "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (b5 != null) {
                    b = b5;
                }
                if (b6 == null) {
                    b6 = b3;
                }
            } else {
                if (b5 != null) {
                    b3 = b5;
                }
                if (b6 == null) {
                    b6 = b;
                }
                b = b3;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b6, b4);
            setBackground(b(attributeSet.getAttributeResourceValue(ay5.a, "background", 0)));
            this.s = new ay5.b(this, attributeSet, i, i2);
            a();
        }
        this.s = new ay5.b();
    }

    private static void d(Drawable[] drawableArr, boolean z) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z) {
        d(getCompoundDrawables(), z);
        d(getCompoundDrawablesRelative(), z);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zx5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zx5 zx5Var = (zx5) parcelable;
        super.onRestoreInstanceState(zx5Var.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        zx5Var.c(compoundDrawables[0], 0);
        zx5Var.c(compoundDrawables[1], 1);
        zx5Var.c(compoundDrawables[2], 2);
        zx5Var.c(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        zx5Var.c(compoundDrawablesRelative[0], 4);
        zx5Var.c(compoundDrawablesRelative[2], 5);
        zx5Var.c(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.s.a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new zx5(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackground(b(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(b(i), b(i2), b(i3), b(i4));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        setCompoundDrawablesWithIntrinsicBounds(b(i), b(i2), b(i3), b(i4));
    }

    public void setFreezesAnimation(boolean z) {
        this.s.a = z;
    }

    public xx5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0, 0);
    }

    public xx5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet, i, 0);
    }

    @e2(21)
    public xx5(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(attributeSet, i, i2);
    }
}