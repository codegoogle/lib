package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: ForegroundLinearLayout.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ne2 extends LinearLayoutCompat {
    @z1
    private Drawable s;
    private final Rect t;
    private final Rect u;
    private int v;
    public boolean w;
    public boolean x;

    public ne2(@x1 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@x1 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.s;
        if (drawable != null) {
            if (this.x) {
                this.x = false;
                Rect rect = this.t;
                Rect rect2 = this.u;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.w) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.v, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @e2(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.s.setState(getDrawableState());
    }

    @Override // android.view.View
    @z1
    public Drawable getForeground() {
        return this.s;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.View
    @e2(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.x = z | this.x;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.x = true;
    }

    @Override // android.view.View
    public void setForeground(@z1 Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.s);
            }
            this.s = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.v != i) {
            if ((8388615 & i) == 0) {
                i |= nq.b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.v = i;
            if (i == 119 && this.s != null) {
                this.s.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    public ne2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ne2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = new Rect();
        this.u = new Rect();
        this.v = 119;
        this.w = true;
        this.x = false;
        TypedArray j = cf2.j(context, attributeSet, ga2.o.dg, i, 0, new int[0]);
        this.v = j.getInt(ga2.o.fg, this.v);
        Drawable drawable = j.getDrawable(ga2.o.eg);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.w = j.getBoolean(ga2.o.gg, true);
        j.recycle();
    }
}