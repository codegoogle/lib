package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes2.dex */
public abstract class fv1 implements nq1<Bitmap> {
    @Override // com.p7700g.p99005.nq1
    @x1
    public final cs1<Bitmap> b(@x1 Context context, @x1 cs1<Bitmap> cs1Var, int i, int i2) {
        if (z02.w(i, i2)) {
            ls1 h = yo1.e(context).h();
            Bitmap bitmap = cs1Var.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap c = c(h, bitmap, i, i2);
            return bitmap.equals(c) ? cs1Var : ev1.e(c, h);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2);
}