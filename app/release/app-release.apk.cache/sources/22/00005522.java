package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.p7700g.p99005.nv1;
import com.p7700g.p99005.vv1;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler.java */
/* loaded from: classes2.dex */
public final class ov1 {
    public static final String a = "Downsampler";
    public static final iq1<bq1> b = iq1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", bq1.u);
    public static final iq1<kq1> c = iq1.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated
    public static final iq1<nv1> d = nv1.h;
    public static final iq1<Boolean> e;
    public static final iq1<Boolean> f;
    private static final String g = "image/vnd.wap.wbmp";
    private static final String h = "image/x-ico";
    private static final Set<String> i;
    private static final b j;
    private static final Set<ImageHeaderParser.ImageType> k;
    private static final Queue<BitmapFactory.Options> l;
    private final ls1 m;
    private final DisplayMetrics n;
    private final is1 o;
    private final List<ImageHeaderParser> p;
    private final uv1 q = uv1.d();

    /* compiled from: Downsampler.java */
    /* loaded from: classes2.dex */
    public class a implements b {
        @Override // com.p7700g.p99005.ov1.b
        public void a(ls1 ls1Var, Bitmap bitmap) {
        }

        @Override // com.p7700g.p99005.ov1.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(ls1 ls1Var, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        e = iq1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f = iq1.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        i = Collections.unmodifiableSet(new HashSet(Arrays.asList(g, h)));
        j = new a();
        k = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        l = z02.f(0);
    }

    public ov1(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, ls1 ls1Var, is1 is1Var) {
        this.p = list;
        this.n = (DisplayMetrics) x02.d(displayMetrics);
        this.m = (ls1) x02.d(ls1Var);
        this.o = (is1) x02.d(is1Var);
    }

    private static int A(double d2) {
        return (int) (d2 + 0.5d);
    }

    @TargetApi(26)
    private static void B(BitmapFactory.Options options, ls1 ls1Var, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = ls1Var.g(i2, i3, config);
    }

    private boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    private static int a(double d2) {
        int o = o(d2);
        int A = A(o * d2);
        return A((d2 / (A / o)) * A);
    }

    private void b(vv1 vv1Var, bq1 bq1Var, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.q.k(i2, i3, options, z, z2)) {
            return;
        }
        if (bq1Var != bq1.PREFER_ARGB_8888) {
            boolean z3 = false;
            try {
                z3 = vv1Var.d().hasAlpha();
            } catch (IOException unused) {
                if (Log.isLoggable(a, 3)) {
                    String str = "Cannot determine whether the image has alpha or not from header, format " + bq1Var;
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    private static void c(ImageHeaderParser.ImageType imageType, vv1 vv1Var, b bVar, ls1 ls1Var, nv1 nv1Var, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) throws IOException {
        int i7;
        int i8;
        int min;
        int i9;
        int floor;
        double floor2;
        int i10;
        if (i3 > 0 && i4 > 0) {
            if (u(i2)) {
                i8 = i3;
                i7 = i4;
            } else {
                i7 = i3;
                i8 = i4;
            }
            float b2 = nv1Var.b(i7, i8, i5, i6);
            if (b2 > 0.0f) {
                nv1.g a2 = nv1Var.a(i7, i8, i5, i6);
                if (a2 != null) {
                    float f2 = i7;
                    float f3 = i8;
                    int A = i7 / A(b2 * f2);
                    int A2 = i8 / A(b2 * f3);
                    nv1.g gVar = nv1.g.MEMORY;
                    if (a2 == gVar) {
                        min = Math.max(A, A2);
                    } else {
                        min = Math.min(A, A2);
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 23 || !i.contains(options.outMimeType)) {
                        int max = Math.max(1, Integer.highestOneBit(min));
                        i9 = (a2 != gVar || ((float) max) >= 1.0f / b2) ? max : max << 1;
                    } else {
                        i9 = 1;
                    }
                    options.inSampleSize = i9;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min2 = Math.min(i9, 8);
                        floor = (int) Math.ceil(f2 / min2);
                        i10 = (int) Math.ceil(f3 / min2);
                        int i12 = i9 / 8;
                        if (i12 > 0) {
                            floor /= i12;
                            i10 /= i12;
                        }
                    } else {
                        if (imageType != ImageHeaderParser.ImageType.PNG && imageType != ImageHeaderParser.ImageType.PNG_A) {
                            if (imageType.isWebp()) {
                                if (i11 >= 24) {
                                    float f4 = i9;
                                    floor = Math.round(f2 / f4);
                                    i10 = Math.round(f3 / f4);
                                } else {
                                    float f5 = i9;
                                    floor = (int) Math.floor(f2 / f5);
                                    floor2 = Math.floor(f3 / f5);
                                }
                            } else if (i7 % i9 == 0 && i8 % i9 == 0) {
                                floor = i7 / i9;
                                i10 = i8 / i9;
                            } else {
                                int[] p = p(vv1Var, options, bVar, ls1Var);
                                floor = p[0];
                                i10 = p[1];
                            }
                        } else {
                            float f6 = i9;
                            floor = (int) Math.floor(f2 / f6);
                            floor2 = Math.floor(f3 / f6);
                        }
                        i10 = (int) floor2;
                    }
                    double b3 = nv1Var.b(floor, i10, i5, i6);
                    options.inTargetDensity = a(b3);
                    options.inDensity = o(b3);
                    if (v(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    Log.isLoggable(a, 2);
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + nv1Var + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        } else if (Log.isLoggable(a, 3)) {
            String str = "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]";
        }
    }

    private cs1<Bitmap> e(vv1 vv1Var, int i2, int i3, jq1 jq1Var, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.o.h(65536, byte[].class);
        BitmapFactory.Options n = n();
        n.inTempStorage = bArr;
        bq1 bq1Var = (bq1) jq1Var.c(b);
        kq1 kq1Var = (kq1) jq1Var.c(c);
        nv1 nv1Var = (nv1) jq1Var.c(nv1.h);
        boolean booleanValue = ((Boolean) jq1Var.c(e)).booleanValue();
        iq1<Boolean> iq1Var = f;
        try {
            return ev1.e(k(vv1Var, n, nv1Var, bq1Var, kq1Var, jq1Var.c(iq1Var) != null && ((Boolean) jq1Var.c(iq1Var)).booleanValue(), i2, i3, booleanValue, bVar), this.m);
        } finally {
            y(n);
            this.o.f(bArr);
        }
    }

    private Bitmap k(vv1 vv1Var, BitmapFactory.Options options, nv1 nv1Var, bq1 bq1Var, kq1 kq1Var, boolean z, int i2, int i3, boolean z2, b bVar) throws IOException {
        int i4;
        int i5;
        int i6;
        int i7;
        ColorSpace colorSpace;
        long b2 = t02.b();
        int[] p = p(vv1Var, options, bVar, this.m);
        boolean z3 = false;
        int i8 = p[0];
        int i9 = p[1];
        String str = options.outMimeType;
        boolean z4 = (i8 == -1 || i9 == -1) ? false : z;
        int a2 = vv1Var.a();
        int j2 = ew1.j(a2);
        boolean m = ew1.m(a2);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = u(j2) ? i9 : i8;
        } else {
            i4 = i3;
            i5 = i2;
        }
        if (i4 == Integer.MIN_VALUE) {
            i6 = u(j2) ? i8 : i9;
        } else {
            i6 = i4;
        }
        ImageHeaderParser.ImageType d2 = vv1Var.d();
        c(d2, vv1Var, bVar, this.m, nv1Var, j2, i8, i9, i5, i6, options);
        b(vv1Var, bq1Var, z4, m, options, i5, i6);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = options.inSampleSize;
        if (C(d2)) {
            if (i8 < 0 || i9 < 0 || !z2) {
                float f2 = v(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f3 = options.inSampleSize;
                i7 = i9;
                i5 = Math.round(((int) Math.ceil(i8 / f3)) * f2);
                i6 = Math.round(((int) Math.ceil(i9 / f3)) * f2);
                Log.isLoggable(a, 2);
            } else {
                i7 = i9;
            }
            int i12 = i5;
            int i13 = i6;
            if (i12 > 0 && i13 > 0) {
                B(options, this.m, i12, i13);
            }
        } else {
            i7 = i9;
        }
        if (kq1Var != null) {
            if (i10 >= 28) {
                if (kq1Var == kq1.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                    z3 = true;
                }
                options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i10 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap l2 = l(vv1Var, options, bVar, this.m);
        bVar.a(this.m, l2);
        if (Log.isLoggable(a, 2)) {
            w(i8, i7, str, options, l2, i2, i3, b2);
        }
        Bitmap bitmap = null;
        if (l2 != null) {
            l2.setDensity(this.n.densityDpi);
            bitmap = ew1.o(this.m, l2, a2);
            if (!l2.equals(bitmap)) {
                this.m.a(l2);
            }
        }
        return bitmap;
    }

    private static Bitmap l(vv1 vv1Var, BitmapFactory.Options options, b bVar, ls1 ls1Var) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.b();
            vv1Var.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        ew1.i().lock();
        try {
            try {
                Bitmap b2 = vv1Var.b(options);
                ew1.i().unlock();
                return b2;
            } catch (IllegalArgumentException e2) {
                IOException x = x(e2, i2, i3, str, options);
                Log.isLoggable(a, 3);
                Bitmap bitmap = options.inBitmap;
                if (bitmap != null) {
                    try {
                        ls1Var.a(bitmap);
                        options.inBitmap = null;
                        Bitmap l2 = l(vv1Var, options, bVar, ls1Var);
                        ew1.i().unlock();
                        return l2;
                    } catch (IOException unused) {
                        throw x;
                    }
                }
                throw x;
            }
        } catch (Throwable th) {
            ew1.i().unlock();
            throw th;
        }
    }

    @z1
    @TargetApi(19)
    private static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder G = wo1.G(" (");
        G.append(bitmap.getAllocationByteCount());
        G.append(")");
        String sb = G.toString();
        StringBuilder G2 = wo1.G("[");
        G2.append(bitmap.getWidth());
        G2.append("x");
        G2.append(bitmap.getHeight());
        G2.append("] ");
        G2.append(bitmap.getConfig());
        G2.append(sb);
        return G2.toString();
    }

    private static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options poll;
        synchronized (ov1.class) {
            Queue<BitmapFactory.Options> queue = l;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                z(poll);
            }
        }
        return poll;
    }

    private static int o(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] p(vv1 vv1Var, BitmapFactory.Options options, b bVar, ls1 ls1Var) throws IOException {
        options.inJustDecodeBounds = true;
        l(vv1Var, options, bVar, ls1Var);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    private static boolean u(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean v(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void w(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        m(bitmap);
        q(options);
        int i6 = options.inSampleSize;
        Thread.currentThread().getName();
        t02.a(j2);
    }

    private static IOException x(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        StringBuilder J = wo1.J("Exception decoding bitmap, outWidth: ", i2, ", outHeight: ", i3, ", outMimeType: ");
        J.append(str);
        J.append(", inBitmap: ");
        J.append(q(options));
        return new IOException(J.toString(), illegalArgumentException);
    }

    private static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = l;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @e2(21)
    public cs1<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, jq1 jq1Var) throws IOException {
        return e(new vv1.e(parcelFileDescriptor, this.p, this.o), i2, i3, jq1Var, j);
    }

    public cs1<Bitmap> f(InputStream inputStream, int i2, int i3, jq1 jq1Var) throws IOException {
        return g(inputStream, i2, i3, jq1Var, j);
    }

    public cs1<Bitmap> g(InputStream inputStream, int i2, int i3, jq1 jq1Var, b bVar) throws IOException {
        return e(new vv1.d(inputStream, this.p, this.o), i2, i3, jq1Var, bVar);
    }

    public cs1<Bitmap> h(ByteBuffer byteBuffer, int i2, int i3, jq1 jq1Var) throws IOException {
        return e(new vv1.b(byteBuffer, this.p, this.o), i2, i3, jq1Var, j);
    }

    @r2
    public void i(File file, int i2, int i3, jq1 jq1Var) throws IOException {
        e(new vv1.c(file, this.p, this.o), i2, i3, jq1Var, j);
    }

    @r2
    public void j(byte[] bArr, int i2, int i3, jq1 jq1Var) throws IOException {
        e(new vv1.a(bArr, this.p, this.o), i2, i3, jq1Var, j);
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }
}