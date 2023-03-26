package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: Rotate.java */
/* loaded from: classes2.dex */
public class bw1 extends fv1 {
    private static final String c = "com.bumptech.glide.load.resource.bitmap.Rotate";
    private static final byte[] d = c.getBytes(gq1.b);
    private final int e;

    public bw1(int i) {
        this.e = i;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(d);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.e).array());
    }

    @Override // com.p7700g.p99005.fv1
    public Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        return ew1.n(bitmap, this.e);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        return (obj instanceof bw1) && this.e == ((bw1) obj).e;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return z02.p(-950519196, z02.o(this.e));
    }
}