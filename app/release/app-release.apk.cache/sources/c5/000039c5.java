package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes2.dex */
public final class ax1 implements lq1<up1, Bitmap> {
    private final ls1 a;

    public ax1(ls1 ls1Var) {
        this.a = ls1Var;
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 up1 up1Var, int i, int i2, @x1 jq1 jq1Var) {
        return ev1.e(up1Var.a(), this.a);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 up1 up1Var, @x1 jq1 jq1Var) {
        return true;
    }
}