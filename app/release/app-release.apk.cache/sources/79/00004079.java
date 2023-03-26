package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;

/* compiled from: CircularProgressIndicatorSpec.java */
/* loaded from: classes3.dex */
public final class eg2 extends ag2 {
    @c2
    public int g;
    @c2
    public int h;
    public int i;

    public eg2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.h2);
    }

    @Override // com.p7700g.p99005.ag2
    public void e() {
    }

    public eg2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        this(context, attributeSet, i, dg2.Q);
    }

    public eg2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ga2.f.M8);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(ga2.f.H8);
        TypedArray j = cf2.j(context, attributeSet, ga2.o.v6, i, i2, new int[0]);
        this.g = Math.max(sg2.d(context, j, ga2.o.y6, dimensionPixelSize), this.a * 2);
        this.h = sg2.d(context, j, ga2.o.x6, dimensionPixelSize2);
        this.i = j.getInt(ga2.o.w6, 0);
        j.recycle();
        e();
    }
}