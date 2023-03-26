package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class z02 {
    private static final int a = 31;
    private static final int b = 17;
    private static final char[] c = "0123456789abcdef".toCharArray();
    private static final char[] d = new char[64];
    @z1
    private static volatile Handler e;

    /* compiled from: Util.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private z02() {
    }

    public static void a() {
        if (!t()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!u()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(@z1 Object obj, @z1 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof bu1) {
            return ((bu1) obj).a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean d(@z1 Object obj, @z1 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @x1
    private static String e(@x1 byte[] bArr, @x1 char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = c;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    @x1
    public static <T> Queue<T> f(int i) {
        return new ArrayDeque(i);
    }

    public static int g(int i, int i2, @z1 Bitmap.Config config) {
        return i(config) * i * i2;
    }

    @TargetApi(19)
    public static int h(@x1 Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int i(@z1 Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 2;
            }
            return i != 4 ? 4 : 8;
        }
        return 1;
    }

    @Deprecated
    public static int j(@x1 Bitmap bitmap) {
        return h(bitmap);
    }

    @x1
    public static <T> List<T> k(@x1 Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (e == null) {
            synchronized (z02.class) {
                if (e == null) {
                    e = new Handler(Looper.getMainLooper());
                }
            }
        }
        return e;
    }

    public static int m(float f) {
        return n(f, 17);
    }

    public static int n(float f, int i) {
        return p(Float.floatToIntBits(f), i);
    }

    public static int o(int i) {
        return p(i, 17);
    }

    public static int p(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int q(@z1 Object obj, int i) {
        return p(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int r(boolean z) {
        return s(z, 17);
    }

    public static int s(boolean z, int i) {
        return p(z ? 1 : 0, i);
    }

    public static boolean t() {
        return !u();
    }

    public static boolean u() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean v(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean w(int i, int i2) {
        return v(i) && v(i2);
    }

    public static void x(Runnable runnable) {
        l().post(runnable);
    }

    public static void y(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    @x1
    public static String z(@x1 byte[] bArr) {
        String e2;
        char[] cArr = d;
        synchronized (cArr) {
            e2 = e(bArr, cArr);
        }
        return e2;
    }
}