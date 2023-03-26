package com.p7700g.p99005;

import android.graphics.Bitmap;
import com.p7700g.p99005.up1;

/* compiled from: GifBitmapProvider.java */
/* loaded from: classes2.dex */
public final class uw1 implements up1.a {
    private final ls1 a;
    @z1
    private final is1 b;

    public uw1(ls1 ls1Var) {
        this(ls1Var, null);
    }

    @Override // com.p7700g.p99005.up1.a
    @x1
    public Bitmap a(int i, int i2, @x1 Bitmap.Config config) {
        return this.a.g(i, i2, config);
    }

    @Override // com.p7700g.p99005.up1.a
    @x1
    public int[] b(int i) {
        is1 is1Var = this.b;
        if (is1Var == null) {
            return new int[i];
        }
        return (int[]) is1Var.h(i, int[].class);
    }

    @Override // com.p7700g.p99005.up1.a
    public void c(@x1 Bitmap bitmap) {
        this.a.a(bitmap);
    }

    @Override // com.p7700g.p99005.up1.a
    public void d(@x1 byte[] bArr) {
        is1 is1Var = this.b;
        if (is1Var == null) {
            return;
        }
        is1Var.f(bArr);
    }

    @Override // com.p7700g.p99005.up1.a
    @x1
    public byte[] e(int i) {
        is1 is1Var = this.b;
        if (is1Var == null) {
            return new byte[i];
        }
        return (byte[]) is1Var.h(i, byte[].class);
    }

    @Override // com.p7700g.p99005.up1.a
    public void f(@x1 int[] iArr) {
        is1 is1Var = this.b;
        if (is1Var == null) {
            return;
        }
        is1Var.f(iArr);
    }

    public uw1(ls1 ls1Var, @z1 is1 is1Var) {
        this.a = ls1Var;
        this.b = is1Var;
    }
}