package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes3.dex */
public class pg2 extends AppCompatRadioButton {
    private static final int s = ga2.n.Lh;
    private static final int[][] t = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @z1
    private ColorStateList u;
    private boolean v;

    public pg2(@x1 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.u == null) {
            int d = kc2.d(this, ga2.c.L2);
            int d2 = kc2.d(this, ga2.c.Z2);
            int d3 = kc2.d(this, ga2.c.o3);
            int[][] iArr = t;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = kc2.m(d3, d, 1.0f);
            iArr2[1] = kc2.m(d3, d2, 0.54f);
            iArr2[2] = kc2.m(d3, d2, 0.38f);
            iArr2[3] = kc2.m(d3, d2, 0.38f);
            this.u = new ColorStateList(iArr, iArr2);
        }
        return this.u;
    }

    public boolean a() {
        return this.v;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.v && dt.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.v = z;
        if (z) {
            dt.d(this, getMaterialThemeColorsTintList());
        } else {
            dt.d(this, null);
        }
    }

    public pg2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.od);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pg2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.sm, i, i2, new int[0]);
        int i3 = ga2.o.tm;
        if (j.hasValue(i3)) {
            dt.d(this, sg2.a(context2, j, i3));
        }
        this.v = j.getBoolean(ga2.o.um, false);
        j.recycle();
    }
}