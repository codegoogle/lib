package com.p7700g.p99005;

import android.text.TextUtils;
import com.p7700g.p99005.i2;
import java.util.Locale;
import java.util.Objects;

/* compiled from: Preconditions.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class jp {
    private jp() {
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, @x1 Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, @x1 String str, @x1 Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f, @x1 String str) {
        if (!Float.isNaN(f)) {
            if (Float.isInfinite(f)) {
                throw new IllegalArgumentException(wo1.t(str, " must not be infinite"));
            }
            return f;
        }
        throw new IllegalArgumentException(wo1.t(str, " must not be NaN"));
    }

    public static double e(double d, double d2, double d3, @x1 String str) {
        if (d >= d2) {
            if (d <= d3) {
                return d;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }

    public static float f(float f, float f2, float f3, @x1 String str) {
        if (f >= f2) {
            if (f <= f3) {
                return f;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static int g(int i, int i2, int i3, @x1 String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static long h(long j, long j2, long j3, @x1 String str) {
        if (j >= j2) {
            if (j <= j3) {
                return j;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    @p1(from = 0)
    public static int i(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @p1(from = 0)
    public static int j(int i, @z1 String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        StringBuilder G = wo1.G("Requested flags 0x");
        G.append(Integer.toHexString(i));
        G.append(", but only 0x");
        G.append(Integer.toHexString(i2));
        G.append(" are allowed");
        throw new IllegalArgumentException(G.toString());
    }

    @x1
    public static <T> T l(@z1 T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @x1
    public static <T> T m(@z1 T t, @x1 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z) {
        o(z, null);
    }

    public static void o(boolean z, @z1 String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @x1
    public static <T extends CharSequence> T p(@z1 T t) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException();
        }
        return t;
    }

    @x1
    public static <T extends CharSequence> T q(@z1 T t, @x1 Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    @x1
    public static <T extends CharSequence> T r(@z1 T t, @x1 String str, @x1 Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }
}