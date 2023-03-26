package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
@e2(api = 28)
/* loaded from: classes2.dex */
public final class iv1 implements lq1<ByteBuffer, Bitmap> {
    private final dv1 a = new dv1();

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 ByteBuffer byteBuffer, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 ByteBuffer byteBuffer, @x1 jq1 jq1Var) throws IOException {
        return true;
    }
}