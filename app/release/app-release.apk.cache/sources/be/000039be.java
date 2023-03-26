package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes2.dex */
public class aw1 implements lq1<Uri, Bitmap> {
    private final pw1 a;
    private final ls1 b;

    public aw1(pw1 pw1Var, ls1 ls1Var) {
        this.a = pw1Var;
        this.b = ls1Var;
    }

    @Override // com.p7700g.p99005.lq1
    @z1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        cs1<Drawable> b = this.a.b(uri, i, i2, jq1Var);
        if (b == null) {
            return null;
        }
        return pv1.a(this.b, b.get(), i, i2);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 Uri uri, @x1 jq1 jq1Var) {
        return "android.resource".equals(uri.getScheme());
    }
}