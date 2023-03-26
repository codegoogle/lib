package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* loaded from: classes2.dex */
public final class cw1 extends fv1 {
    private static final String c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
    private static final byte[] d = c.getBytes(gq1.b);
    private final int e;

    public cw1(int i) {
        x02.a(i > 0, "roundingRadius must be greater than 0.");
        this.e = i;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(d);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.e).array());
    }

    @Override // com.p7700g.p99005.fv1
    public Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        return ew1.q(ls1Var, bitmap, this.e);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        return (obj instanceof cw1) && this.e == ((cw1) obj).e;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return z02.p(-569625254, z02.o(this.e));
    }
}