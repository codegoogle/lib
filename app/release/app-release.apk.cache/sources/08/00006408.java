package com.p7700g.p99005;

/* compiled from: GammaEvaluator.java */
/* loaded from: classes.dex */
public class wo0 {
    private static float a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float a = a(((i >> 16) & 255) / 255.0f);
        float a2 = a(((i >> 8) & 255) / 255.0f);
        float a3 = a((i & 255) / 255.0f);
        float a4 = a(((i2 >> 16) & 255) / 255.0f);
        float a5 = a(((i2 >> 8) & 255) / 255.0f);
        float a6 = a((i2 & 255) / 255.0f);
        float a7 = wo1.a(((i2 >> 24) & 255) / 255.0f, f2, f, f2);
        float a8 = wo1.a(a4, a, f, a);
        float a9 = wo1.a(a5, a2, f, a2);
        float a10 = wo1.a(a6, a3, f, a3);
        int round = Math.round(b(a8) * 255.0f) << 16;
        return Math.round(b(a10) * 255.0f) | round | (Math.round(a7 * 255.0f) << 24) | (Math.round(b(a9) * 255.0f) << 8);
    }
}