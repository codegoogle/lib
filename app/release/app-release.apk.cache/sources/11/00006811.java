package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes2.dex */
public class yu1<DataType> implements lq1<DataType, BitmapDrawable> {
    private final lq1<DataType, Bitmap> a;
    private final Resources b;

    public yu1(Context context, lq1<DataType, Bitmap> lq1Var) {
        this(context.getResources(), lq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    public boolean a(@x1 DataType datatype, @x1 jq1 jq1Var) throws IOException {
        return this.a.a(datatype, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    public cs1<BitmapDrawable> b(@x1 DataType datatype, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        return xv1.e(this.b, this.a.b(datatype, i, i2, jq1Var));
    }

    @Deprecated
    public yu1(Resources resources, ls1 ls1Var, lq1<DataType, Bitmap> lq1Var) {
        this(resources, lq1Var);
    }

    public yu1(@x1 Resources resources, @x1 lq1<DataType, Bitmap> lq1Var) {
        this.b = (Resources) x02.d(resources);
        this.a = (lq1) x02.d(lq1Var);
    }
}