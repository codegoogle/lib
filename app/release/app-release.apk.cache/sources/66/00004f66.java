package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: CircleCrop.java */
/* loaded from: classes2.dex */
public class lv1 extends fv1 {
    private static final int c = 1;
    private static final String d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
    private static final byte[] e = d.getBytes(gq1.b);

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(e);
    }

    @Override // com.p7700g.p99005.fv1
    public Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        return ew1.d(ls1Var, bitmap, i, i2);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        return obj instanceof lv1;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return 1101716364;
    }
}