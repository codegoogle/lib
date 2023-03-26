package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes2.dex */
public class ex1 implements hx1<Bitmap, BitmapDrawable> {
    private final Resources a;

    public ex1(@x1 Context context) {
        this(context.getResources());
    }

    @Override // com.p7700g.p99005.hx1
    @z1
    public cs1<BitmapDrawable> a(@x1 cs1<Bitmap> cs1Var, @x1 jq1 jq1Var) {
        return xv1.e(this.a, cs1Var);
    }

    @Deprecated
    public ex1(@x1 Resources resources, ls1 ls1Var) {
        this(resources);
    }

    public ex1(@x1 Resources resources) {
        this.a = (Resources) x02.d(resources);
    }
}