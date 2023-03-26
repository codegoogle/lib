package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: classes2.dex */
public final class fx1 implements hx1<Drawable, byte[]> {
    private final ls1 a;
    private final hx1<Bitmap, byte[]> b;
    private final hx1<vw1, byte[]> c;

    public fx1(@x1 ls1 ls1Var, @x1 hx1<Bitmap, byte[]> hx1Var, @x1 hx1<vw1, byte[]> hx1Var2) {
        this.a = ls1Var;
        this.b = hx1Var;
        this.c = hx1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    private static cs1<vw1> b(@x1 cs1<Drawable> cs1Var) {
        return cs1Var;
    }

    @Override // com.p7700g.p99005.hx1
    @z1
    public cs1<byte[]> a(@x1 cs1<Drawable> cs1Var, @x1 jq1 jq1Var) {
        Drawable drawable = cs1Var.get();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(ev1.e(((BitmapDrawable) drawable).getBitmap(), this.a), jq1Var);
        }
        if (drawable instanceof vw1) {
            return this.c.a(b(cs1Var), jq1Var);
        }
        return null;
    }
}