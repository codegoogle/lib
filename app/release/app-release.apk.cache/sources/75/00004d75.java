package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes2.dex */
public class kv1 extends fv1 {
    private static final String c = "com.bumptech.glide.load.resource.bitmap.CenterInside";
    private static final byte[] d = c.getBytes(gq1.b);

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(d);
    }

    @Override // com.p7700g.p99005.fv1
    public Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        return ew1.c(ls1Var, bitmap, i, i2);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        return obj instanceof kv1;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return -670243078;
    }
}