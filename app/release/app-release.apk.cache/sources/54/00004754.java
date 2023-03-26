package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes2.dex */
public class hv1 implements lq1<ByteBuffer, Bitmap> {
    private final ov1 a;

    public hv1(ov1 ov1Var) {
        this.a = ov1Var;
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 ByteBuffer byteBuffer, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        return this.a.h(byteBuffer, i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 ByteBuffer byteBuffer, @x1 jq1 jq1Var) {
        return this.a.t(byteBuffer);
    }
}