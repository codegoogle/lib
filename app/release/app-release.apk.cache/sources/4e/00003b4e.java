package com.p7700g.p99005;

/* compiled from: MathUtils.java */
/* loaded from: classes.dex */
public class bm {
    private bm() {
    }

    public static int a(int i, int i2) {
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double c(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static float d(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int e(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long f(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    public static int g(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long h(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int i(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long j(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int k(int i, int i2) {
        long j = i * i2;
        int i3 = (int) j;
        if (i3 == j) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long l(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && !(j == Long.MIN_VALUE && j2 == -1))) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int m(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long n(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o(int i, int i2) {
        int i3 = i - i2;
        if (((i ^ i3) & (i2 ^ i)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long p(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int q(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }
}