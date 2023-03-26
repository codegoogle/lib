package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: GranularRoundedCorners.java */
/* loaded from: classes2.dex */
public final class tv1 extends fv1 {
    private static final String c = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";
    private static final byte[] d = c.getBytes(gq1.b);
    private final float e;
    private final float f;
    private final float g;
    private final float h;

    public tv1(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    @Override // com.p7700g.p99005.gq1
    public void a(@x1 MessageDigest messageDigest) {
        messageDigest.update(d);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.e).putFloat(this.f).putFloat(this.g).putFloat(this.h).array());
    }

    @Override // com.p7700g.p99005.fv1
    public Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        return ew1.p(ls1Var, bitmap, this.e, this.f, this.g, this.h);
    }

    @Override // com.p7700g.p99005.gq1
    public boolean equals(Object obj) {
        if (obj instanceof tv1) {
            tv1 tv1Var = (tv1) obj;
            return this.e == tv1Var.e && this.f == tv1Var.f && this.g == tv1Var.g && this.h == tv1Var.h;
        }
        return false;
    }

    @Override // com.p7700g.p99005.gq1
    public int hashCode() {
        return z02.n(this.h, z02.n(this.g, z02.n(this.f, z02.p(-2013597734, z02.m(this.e)))));
    }
}