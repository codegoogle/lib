package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes2.dex */
public class nb2 extends AppCompatCheckBox {
    private static final int s = ga2.n.Kh;
    private static final int[][] t = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @z1
    private ColorStateList u;
    private boolean v;
    private boolean w;

    public nb2(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.u == null) {
            int[][] iArr = t;
            int[] iArr2 = new int[iArr.length];
            int d = kc2.d(this, ga2.c.L2);
            int d2 = kc2.d(this, ga2.c.o3);
            int d3 = kc2.d(this, ga2.c.Z2);
            iArr2[0] = kc2.m(d2, d, 1.0f);
            iArr2[1] = kc2.m(d2, d3, 0.54f);
            iArr2[2] = kc2.m(d2, d3, 0.38f);
            iArr2[3] = kc2.m(d2, d3, 0.38f);
            this.u = new ColorStateList(iArr, iArr2);
        }
        return this.u;
    }

    public boolean b() {
        return this.w;
    }

    public boolean c() {
        return this.v;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v && dt.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable a;
        if (this.w && TextUtils.isEmpty(getText()) && (a = dt.a(this)) != null) {
            int width = ((getWidth() - a.getIntrinsicWidth()) / 2) * (kf2.k(this) ? -1 : 1);
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a.getBounds();
                fk.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.w = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.v = z;
        if (z) {
            dt.d(this, getMaterialThemeColorsTintList());
        } else {
            dt.d(this, null);
        }
    }

    public nb2(Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.B1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nb2(Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.im, i, i2, new int[0]);
        int i3 = ga2.o.jm;
        if (j.hasValue(i3)) {
            dt.d(this, sg2.a(context2, j, i3));
        }
        this.v = j.getBoolean(ga2.o.lm, false);
        this.w = j.getBoolean(ga2.o.km, true);
        j.recycle();
    }
}