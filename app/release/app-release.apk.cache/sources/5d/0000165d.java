package com.github.ybq.android.spinkit;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.p7700g.p99005.f12;
import com.p7700g.p99005.g12;
import com.p7700g.p99005.h12;
import com.p7700g.p99005.x12;

/* loaded from: classes2.dex */
public class SpinKitView extends ProgressBar {
    private h12 s;
    private int t;
    private x12 u;

    public SpinKitView(Context context) {
        this(context, null);
    }

    private void a() {
        x12 a = g12.a(this.s);
        a.y(this.t);
        setIndeterminateDrawable(a);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i) {
        x12 x12Var;
        super.onScreenStateChanged(i);
        if (i != 0 || (x12Var = this.u) == null) {
            return;
        }
        x12Var.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.u != null && getVisibility() == 0) {
            this.u.start();
        }
    }

    public void setColor(int i) {
        this.t = i;
        x12 x12Var = this.u;
        if (x12Var != null) {
            x12Var.y(i);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof x12) {
            setIndeterminateDrawable((x12) drawable);
            return;
        }
        throw new IllegalArgumentException("this d must be instanceof Sprite");
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof x12) {
            ((x12) drawable).stop();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f12.a.a);
    }

    @Override // android.widget.ProgressBar
    public x12 getIndeterminateDrawable() {
        return this.u;
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, f12.c.a);
    }

    @TargetApi(21)
    public SpinKitView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12.d.a, i, i2);
        this.s = h12.values()[obtainStyledAttributes.getInt(f12.d.c, 0)];
        this.t = obtainStyledAttributes.getColor(f12.d.b, -1);
        obtainStyledAttributes.recycle();
        a();
        setIndeterminate(true);
    }

    public void setIndeterminateDrawable(x12 x12Var) {
        super.setIndeterminateDrawable((Drawable) x12Var);
        this.u = x12Var;
        if (x12Var.g() == 0) {
            this.u.y(this.t);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.u.start();
        }
    }
}