package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
@e2(api = 28)
/* loaded from: classes2.dex */
public final class dv1 implements lq1<ImageDecoder.Source, Bitmap> {
    private static final String a = "BitmapImageDecoder";
    private final ls1 b = new ms1();

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<Bitmap> b(@x1 ImageDecoder.Source source, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new vu1(i, i2, jq1Var));
        if (Log.isLoggable(a, 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new ev1(decodeBitmap, this.b);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 ImageDecoder.Source source, @x1 jq1 jq1Var) throws IOException {
        return true;
    }
}