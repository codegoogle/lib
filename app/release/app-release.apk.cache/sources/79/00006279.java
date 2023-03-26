package com.p7700g.p99005;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: DefaultOnHeaderDecodedListener.java */
@e2(api = 28)
/* loaded from: classes2.dex */
public final class vu1 implements ImageDecoder.OnHeaderDecodedListener {
    private static final String a = "ImageDecoder";
    private final uv1 b = uv1.d();
    private final int c;
    private final int d;
    private final bq1 e;
    private final nv1 f;
    private final boolean g;
    private final kq1 h;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* loaded from: classes2.dex */
    public class a implements ImageDecoder.OnPartialImageListener {
        public a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(@x1 ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public vu1(int i, int i2, @x1 jq1 jq1Var) {
        this.c = i;
        this.d = i2;
        this.e = (bq1) jq1Var.c(ov1.b);
        this.f = (nv1) jq1Var.c(nv1.h);
        iq1<Boolean> iq1Var = ov1.f;
        this.g = jq1Var.c(iq1Var) != null && ((Boolean) jq1Var.c(iq1Var)).booleanValue();
        this.h = (kq1) jq1Var.c(ov1.c);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(@x1 ImageDecoder imageDecoder, @x1 ImageDecoder.ImageInfo imageInfo, @x1 ImageDecoder.Source source) {
        boolean z = false;
        if (this.b.g(this.c, this.d, this.g, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.e == bq1.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int i = this.c;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.d;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.f.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(b * size.getHeight());
        if (Log.isLoggable(a, 2)) {
            size.getWidth();
            size.getHeight();
        }
        imageDecoder.setTargetSize(round, round2);
        kq1 kq1Var = this.h;
        if (kq1Var != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 28) {
                if (i3 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    return;
                }
                return;
            }
            if (kq1Var == kq1.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                z = true;
            }
            imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}