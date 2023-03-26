package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.p7700g.p99005.up1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes2.dex */
public class tw1 implements lq1<ByteBuffer, vw1> {
    private static final String a = "BufferGifDecoder";
    private static final a b = new a();
    private static final b c = new b();
    private final Context d;
    private final List<ImageHeaderParser> e;
    private final b f;
    private final a g;
    private final uw1 h;

    /* compiled from: ByteBufferGifDecoder.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a {
        public up1 a(up1.a aVar, wp1 wp1Var, ByteBuffer byteBuffer, int i) {
            return new zp1(aVar, wp1Var, byteBuffer, i);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    @r2
    /* loaded from: classes2.dex */
    public static class b {
        private final Queue<xp1> a = z02.f(0);

        public synchronized xp1 a(ByteBuffer byteBuffer) {
            xp1 poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new xp1();
            }
            return poll.q(byteBuffer);
        }

        public synchronized void b(xp1 xp1Var) {
            xp1Var.a();
            this.a.offer(xp1Var);
        }
    }

    public tw1(Context context) {
        this(context, yo1.e(context).n().g(), yo1.e(context).h(), yo1.e(context).g());
    }

    @z1
    private xw1 c(ByteBuffer byteBuffer, int i, int i2, xp1 xp1Var, jq1 jq1Var) {
        Bitmap.Config config;
        long b2 = t02.b();
        try {
            wp1 d = xp1Var.d();
            if (d.b() > 0 && d.c() == 0) {
                if (jq1Var.c(bx1.a) == bq1.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                up1 a2 = this.g.a(this.h, d, byteBuffer, e(d, i, i2));
                a2.f(config);
                a2.b();
                Bitmap a3 = a2.a();
                if (a3 == null) {
                    return null;
                }
                xw1 xw1Var = new xw1(new vw1(this.d, a2, xu1.c(), i, i2, a3));
                if (Log.isLoggable(a, 2)) {
                    t02.a(b2);
                }
                return xw1Var;
            }
            if (Log.isLoggable(a, 2)) {
                t02.a(b2);
            }
            return null;
        } finally {
            if (Log.isLoggable(a, 2)) {
                t02.a(b2);
            }
        }
    }

    private static int e(wp1 wp1Var, int i, int i2) {
        int min = Math.min(wp1Var.a() / i2, wp1Var.d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(a, 2) && max > 1) {
            wp1Var.d();
            wp1Var.a();
        }
        return max;
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public xw1 b(@x1 ByteBuffer byteBuffer, int i, int i2, @x1 jq1 jq1Var) {
        xp1 a2 = this.f.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, a2, jq1Var);
        } finally {
            this.f.b(a2);
        }
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: f */
    public boolean a(@x1 ByteBuffer byteBuffer, @x1 jq1 jq1Var) throws IOException {
        return !((Boolean) jq1Var.c(bx1.b)).booleanValue() && fq1.g(this.e, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public tw1(Context context, List<ImageHeaderParser> list, ls1 ls1Var, is1 is1Var) {
        this(context, list, ls1Var, is1Var, c, b);
    }

    @r2
    public tw1(Context context, List<ImageHeaderParser> list, ls1 ls1Var, is1 is1Var, b bVar, a aVar) {
        this.d = context.getApplicationContext();
        this.e = list;
        this.g = aVar;
        this.h = new uw1(ls1Var, is1Var);
        this.f = bVar;
    }
}