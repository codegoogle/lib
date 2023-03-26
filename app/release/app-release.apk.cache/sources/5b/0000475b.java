package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.p7700g.p99005.iq1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* loaded from: classes2.dex */
public class hw1<T> implements lq1<T, Bitmap> {
    private static final String a = "VideoDecoder";
    public static final long b = -1;
    @r2
    public static final int c = 2;
    public static final iq1<Long> d = iq1.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final iq1<Integer> e = iq1.b("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    private static final e f = new e();
    private final f<T> g;
    private final ls1 h;
    private final e i;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes2.dex */
    public class a implements iq1.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // com.p7700g.p99005.iq1.b
        /* renamed from: b */
        public void a(@x1 byte[] bArr, @x1 Long l, @x1 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes2.dex */
    public class b implements iq1.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // com.p7700g.p99005.iq1.b
        /* renamed from: b */
        public void a(@x1 byte[] bArr, @x1 Integer num, @x1 MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes2.dex */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.p7700g.p99005.hw1.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: VideoDecoder.java */
    @e2(23)
    /* loaded from: classes2.dex */
    public static final class d implements f<ByteBuffer> {

        /* compiled from: VideoDecoder.java */
        /* loaded from: classes2.dex */
        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer s;

            public a(ByteBuffer byteBuffer) {
                this.s = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.s.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.s.limit()) {
                    return -1;
                }
                this.s.position((int) j);
                int min = Math.min(i2, this.s.remaining());
                this.s.get(bArr, i, min);
                return min;
            }
        }

        @Override // com.p7700g.p99005.hw1.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    @r2
    /* loaded from: classes2.dex */
    public static class e {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    @r2
    /* loaded from: classes2.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes2.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // com.p7700g.p99005.hw1.f
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes2.dex */
    public static final class h extends RuntimeException {
        private static final long s = -2556382523004027815L;

        public h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public hw1(ls1 ls1Var, f<T> fVar) {
        this(ls1Var, fVar, f);
    }

    public static lq1<AssetFileDescriptor, Bitmap> c(ls1 ls1Var) {
        return new hw1(ls1Var, new c(null));
    }

    @e2(api = 23)
    public static lq1<ByteBuffer, Bitmap> d(ls1 ls1Var) {
        return new hw1(ls1Var, new d());
    }

    @z1
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, nv1 nv1Var) {
        Bitmap g2 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || nv1Var == nv1.f) ? null : g(mediaMetadataRetriever, j, i, i2, i3, nv1Var);
        if (g2 == null) {
            g2 = f(mediaMetadataRetriever, j, i);
        }
        if (g2 != null) {
            return g2;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @z1
    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, nv1 nv1Var) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b2 = nv1Var.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * b2), Math.round(b2 * parseInt2));
        } catch (Throwable unused) {
            Log.isLoggable(a, 3);
            return null;
        }
    }

    public static lq1<ParcelFileDescriptor, Bitmap> h(ls1 ls1Var) {
        return new hw1(ls1Var, new g());
    }

    @Override // com.p7700g.p99005.lq1
    public boolean a(@x1 T t, @x1 jq1 jq1Var) {
        return true;
    }

    @Override // com.p7700g.p99005.lq1
    public cs1<Bitmap> b(@x1 T t, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        long longValue = ((Long) jq1Var.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(wo1.p("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) jq1Var.c(e);
        if (num == null) {
            num = 2;
        }
        nv1 nv1Var = (nv1) jq1Var.c(nv1.h);
        if (nv1Var == null) {
            nv1Var = nv1.g;
        }
        nv1 nv1Var2 = nv1Var;
        MediaMetadataRetriever a2 = this.i.a();
        try {
            this.g.a(a2, t);
            return ev1.e(e(a2, longValue, num.intValue(), i, i2, nv1Var2), this.h);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a2.close();
            } else {
                a2.release();
            }
        }
    }

    @r2
    public hw1(ls1 ls1Var, f<T> fVar, e eVar) {
        this.h = ls1Var;
        this.g = fVar;
        this.i = eVar;
    }
}