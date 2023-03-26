package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes3.dex */
public abstract class ag2 {
    @c2
    public int a;
    @c2
    public int b;
    @x1
    public int[] c = new int[0];
    @w0
    public int d;
    public int e;
    public int f;

    public ag2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ga2.f.S8);
        TypedArray j = cf2.j(context, attributeSet, ga2.o.j4, i, i2, new int[0]);
        this.a = sg2.d(context, j, ga2.o.s4, dimensionPixelSize);
        this.b = Math.min(sg2.d(context, j, ga2.o.r4, 0), this.a / 2);
        this.e = j.getInt(ga2.o.o4, 0);
        this.f = j.getInt(ga2.o.l4, 0);
        c(context, j);
        d(context, j);
        j.recycle();
    }

    private void c(@x1 Context context, @x1 TypedArray typedArray) {
        int i = ga2.o.m4;
        if (!typedArray.hasValue(i)) {
            this.c = new int[]{kc2.b(context, ga2.c.f3, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    private void d(@x1 Context context, @x1 TypedArray typedArray) {
        int i = ga2.o.q4;
        if (typedArray.hasValue(i)) {
            this.d = typedArray.getColor(i, -1);
            return;
        }
        this.d = this.c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.d = kc2.a(this.d, (int) (f * 255.0f));
    }

    public boolean a() {
        return this.f != 0;
    }

    public boolean b() {
        return this.e != 0;
    }

    public abstract void e();
}