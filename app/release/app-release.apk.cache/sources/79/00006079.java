package com.p7700g.p99005;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder.java */
/* loaded from: classes2.dex */
public interface up1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 0;

    /* compiled from: GifDecoder.java */
    /* loaded from: classes2.dex */
    public interface a {
        @x1
        Bitmap a(int i, int i2, @x1 Bitmap.Config config);

        @x1
        int[] b(int i);

        void c(@x1 Bitmap bitmap);

        void d(@x1 byte[] bArr);

        @x1
        byte[] e(int i);

        void f(@x1 int[] iArr);
    }

    /* compiled from: GifDecoder.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    @z1
    Bitmap a();

    void b();

    void c(@x1 wp1 wp1Var, @x1 byte[] bArr);

    void clear();

    int d();

    int e();

    void f(@x1 Bitmap.Config config);

    int g(int i);

    int getHeight();

    int getStatus();

    int getWidth();

    @x1
    ByteBuffer h();

    void i();

    void j(@x1 wp1 wp1Var, @x1 ByteBuffer byteBuffer);

    int k();

    void l(@x1 wp1 wp1Var, @x1 ByteBuffer byteBuffer, int i);

    int m();

    int n(@z1 InputStream inputStream, int i);

    int o();

    int p();

    @Deprecated
    int q();

    int read(@z1 byte[] bArr);
}