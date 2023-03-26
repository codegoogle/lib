package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes2.dex */
public class zu1 implements mq1<BitmapDrawable> {
    private final ls1 a;
    private final mq1<Bitmap> b;

    public zu1(ls1 ls1Var, mq1<Bitmap> mq1Var) {
        this.a = ls1Var;
        this.b = mq1Var;
    }

    @Override // com.p7700g.p99005.mq1
    @x1
    public cq1 b(@x1 jq1 jq1Var) {
        return this.b.b(jq1Var);
    }

    @Override // com.p7700g.p99005.dq1
    /* renamed from: c */
    public boolean a(@x1 cs1<BitmapDrawable> cs1Var, @x1 File file, @x1 jq1 jq1Var) {
        return this.b.a(new ev1(cs1Var.get().getBitmap(), this.a), file, jq1Var);
    }
}