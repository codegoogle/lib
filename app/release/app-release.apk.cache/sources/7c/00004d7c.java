package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: AnimatedWebpDecoder.java */
@e2(28)
/* loaded from: classes2.dex */
public final class kw1 {
    private final List<ImageHeaderParser> a;
    private final is1 b;

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes2.dex */
    public static final class a implements cs1<Drawable> {
        private static final int s = 2;
        private final AnimatedImageDrawable t;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.t = animatedImageDrawable;
        }

        @Override // com.p7700g.p99005.cs1
        public void a() {
            this.t.stop();
            this.t.clearAnimationCallbacks();
        }

        @Override // com.p7700g.p99005.cs1
        @x1
        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.t;
        }

        @Override // com.p7700g.p99005.cs1
        public int c() {
            return z02.i(Bitmap.Config.ARGB_8888) * this.t.getIntrinsicHeight() * this.t.getIntrinsicWidth() * 2;
        }

        @Override // com.p7700g.p99005.cs1
        @x1
        public Class<Drawable> d() {
            return Drawable.class;
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes2.dex */
    public static final class b implements lq1<ByteBuffer, Drawable> {
        private final kw1 a;

        public b(kw1 kw1Var) {
            this.a = kw1Var;
        }

        @Override // com.p7700g.p99005.lq1
        /* renamed from: c */
        public cs1<Drawable> b(@x1 ByteBuffer byteBuffer, int i, int i2, @x1 jq1 jq1Var) throws IOException {
            return this.a.b(ImageDecoder.createSource(byteBuffer), i, i2, jq1Var);
        }

        @Override // com.p7700g.p99005.lq1
        /* renamed from: d */
        public boolean a(@x1 ByteBuffer byteBuffer, @x1 jq1 jq1Var) throws IOException {
            return this.a.d(byteBuffer);
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes2.dex */
    public static final class c implements lq1<InputStream, Drawable> {
        private final kw1 a;

        public c(kw1 kw1Var) {
            this.a = kw1Var;
        }

        @Override // com.p7700g.p99005.lq1
        /* renamed from: c */
        public cs1<Drawable> b(@x1 InputStream inputStream, int i, int i2, @x1 jq1 jq1Var) throws IOException {
            return this.a.b(ImageDecoder.createSource(l02.b(inputStream)), i, i2, jq1Var);
        }

        @Override // com.p7700g.p99005.lq1
        /* renamed from: d */
        public boolean a(@x1 InputStream inputStream, @x1 jq1 jq1Var) throws IOException {
            return this.a.c(inputStream);
        }
    }

    private kw1(List<ImageHeaderParser> list, is1 is1Var) {
        this.a = list;
        this.b = is1Var;
    }

    public static lq1<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, is1 is1Var) {
        return new b(new kw1(list, is1Var));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public static lq1<InputStream, Drawable> f(List<ImageHeaderParser> list, is1 is1Var) {
        return new c(new kw1(list, is1Var));
    }

    public cs1<Drawable> b(@x1 ImageDecoder.Source source, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new vu1(i, i2, jq1Var));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }

    public boolean c(InputStream inputStream) throws IOException {
        return e(fq1.f(this.a, inputStream, this.b));
    }

    public boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(fq1.g(this.a, byteBuffer));
    }
}