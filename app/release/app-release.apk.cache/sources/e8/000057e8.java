package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: MaterialDialogs.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class qd2 {
    private qd2() {
    }

    @x1
    public static Rect a(@x1 Context context, @q0 int i, int i2) {
        TypedArray j = cf2.j(context, null, ga2.o.Ik, i, i2, new int[0]);
        int dimensionPixelSize = j.getDimensionPixelSize(ga2.o.Lk, context.getResources().getDimensionPixelSize(ga2.f.T5));
        int dimensionPixelSize2 = j.getDimensionPixelSize(ga2.o.Mk, context.getResources().getDimensionPixelSize(ga2.f.U5));
        int dimensionPixelSize3 = j.getDimensionPixelSize(ga2.o.Kk, context.getResources().getDimensionPixelSize(ga2.f.S5));
        int dimensionPixelSize4 = j.getDimensionPixelSize(ga2.o.Jk, context.getResources().getDimensionPixelSize(ga2.f.R5));
        j.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    @x1
    public static InsetDrawable b(@z1 Drawable drawable, @x1 Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}