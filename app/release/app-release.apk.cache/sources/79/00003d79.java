package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes2.dex */
public class cv1 implements mq1<Bitmap> {
    public static final iq1<Integer> a = iq1.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final iq1<Bitmap.CompressFormat> b = iq1.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private static final String c = "BitmapEncoder";
    @z1
    private final is1 d;

    public cv1(@x1 is1 is1Var) {
        this.d = is1Var;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, jq1 jq1Var) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) jq1Var.c(b);
        if (compressFormat != null) {
            return compressFormat;
        }
        if (bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    @Override // com.p7700g.p99005.mq1
    @x1
    public cq1 b(@x1 jq1 jq1Var) {
        return cq1.TRANSFORMED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r6 == null) goto L18;
     */
    @Override // com.p7700g.p99005.dq1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(@x1 cs1<Bitmap> cs1Var, @x1 File file, @x1 jq1 jq1Var) {
        Bitmap bitmap = cs1Var.get();
        Bitmap.CompressFormat d = d(bitmap, jq1Var);
        c12.e("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), d);
        try {
            long b2 = t02.b();
            int intValue = ((Integer) jq1Var.c(a)).intValue();
            boolean z = false;
            qq1 qq1Var = null;
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        qq1Var = this.d != null ? new qq1(fileOutputStream, this.d) : fileOutputStream;
                        bitmap.compress(d, intValue, qq1Var);
                        qq1Var.close();
                        z = true;
                    } catch (IOException unused) {
                        qq1Var = fileOutputStream;
                        Log.isLoggable(c, 3);
                    } catch (Throwable th) {
                        th = th;
                        qq1Var = fileOutputStream;
                        if (qq1Var != null) {
                            try {
                                qq1Var.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused3) {
            }
            try {
                qq1Var.close();
            } catch (IOException unused4) {
                if (Log.isLoggable(c, 2)) {
                    String str = "Compressed with type: " + d + " of size " + z02.h(bitmap) + " in " + t02.a(b2) + ", options format: " + jq1Var.c(b) + ", hasAlpha: " + bitmap.hasAlpha();
                }
                return z;
            }
        } finally {
            c12.f();
        }
    }

    @Deprecated
    public cv1() {
        this.d = null;
    }
}