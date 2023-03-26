package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
@e2(api = 28)
/* loaded from: classes2.dex */
public final class wv1 implements lq1<InputStream, Bitmap> {
    private final dv1 a = new dv1();

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 InputStream inputStream, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        return this.a.b(ImageDecoder.createSource(l02.b(inputStream)), i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 InputStream inputStream, @x1 jq1 jq1Var) throws IOException {
        return true;
    }
}