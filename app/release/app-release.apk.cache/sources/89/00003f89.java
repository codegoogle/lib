package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes2.dex */
public class dx1 implements hx1<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public dx1() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.p7700g.p99005.hx1
    @z1
    public cs1<byte[]> a(@x1 cs1<Bitmap> cs1Var, @x1 jq1 jq1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        cs1Var.get().compress(this.a, this.b, byteArrayOutputStream);
        cs1Var.a();
        return new jw1(byteArrayOutputStream.toByteArray());
    }

    public dx1(@x1 Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}