package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.p7700g.p99005.ga2;

/* compiled from: SwitchMaterial.java */
/* loaded from: classes3.dex */
public class gi2 extends SwitchCompat {
    private static final int s = ga2.n.Mh;
    private static final int[][] t = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @x1
    private final ud2 u;
    @z1
    private ColorStateList v;
    @z1
    private ColorStateList w;
    private boolean x;

    public gi2(@x1 Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.v == null) {
            int d = kc2.d(this, ga2.c.o3);
            int d2 = kc2.d(this, ga2.c.L2);
            float dimension = getResources().getDimension(ga2.f.m9);
            if (this.u.l()) {
                dimension += kf2.j(this);
            }
            int e = this.u.e(d, dimension);
            int[][] iArr = t;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = kc2.m(d, d2, 1.0f);
            iArr2[1] = e;
            iArr2[2] = kc2.m(d, d2, 0.38f);
            iArr2[3] = e;
            this.v = new ColorStateList(iArr, iArr2);
        }
        return this.v;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.w == null) {
            int[][] iArr = t;
            int[] iArr2 = new int[iArr.length];
            int d = kc2.d(this, ga2.c.o3);
            int d2 = kc2.d(this, ga2.c.L2);
            int d3 = kc2.d(this, ga2.c.Z2);
            iArr2[0] = kc2.m(d, d2, 0.54f);
            iArr2[1] = kc2.m(d, d3, 0.32f);
            iArr2[2] = kc2.m(d, d2, 0.12f);
            iArr2[3] = kc2.m(d, d3, 0.12f);
            this.w = new ColorStateList(iArr, iArr2);
        }
        return this.w;
    }

    public boolean a() {
        return this.x;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.x && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.x = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public gi2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.bf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gi2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        Context context2 = getContext();
        this.u = new ud2(context2);
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.Os, i, i2, new int[0]);
        this.x = j.getBoolean(ga2.o.Ps, false);
        j.recycle();
    }
}