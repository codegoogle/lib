package com.p7700g.p99005;

/* compiled from: MathUtils.java */
/* loaded from: classes3.dex */
public final class lc2 {
    private lc2() {
    }

    public static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f3, f), f2);
    }

    public static float b(float f, float f2) {
        return 180.0f - Math.abs(Math.abs(f - f2) - 180.0f);
    }

    public static float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static float d(float f) {
        return f < 0.0f ? (f % 360.0f) + 360.0f : f >= 360.0f ? f % 360.0f : f;
    }

    public static int e(int i) {
        if (i < 0) {
            return (i % 360) + 360;
        }
        return i >= 360 ? i % 360 : i;
    }

    public static float f(float f) {
        return (f * 180.0f) / 3.1415927f;
    }

    public static float g(float f) {
        return (f / 180.0f) * 3.1415927f;
    }
}