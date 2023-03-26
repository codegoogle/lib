package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: ColorUtils.java */
/* loaded from: classes3.dex */
public final class dc2 {
    private static final float[] a = {95.047f, 100.0f, 108.883f};

    private dc2() {
    }

    public static int a(int i) {
        return i & 255;
    }

    public static float b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) Math.pow(f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    public static int c(int i) {
        return (i & 65280) >> 8;
    }

    public static String d(int i) {
        return String.format("#%02x%02x%02x", Integer.valueOf(m(i)), Integer.valueOf(c(i)), Integer.valueOf(a(i)));
    }

    public static int e(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double d7 = d5 * d5 * d5;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((d5 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d8 = d > 8.0d ? d4 * d4 * d4 : d / 903.2962962962963d;
        double d9 = d6 * d6 * d6;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d6 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = a;
        return i((float) (d7 * fArr[0]), (float) (d8 * fArr[1]), (float) (d9 * fArr[2]));
    }

    public static int f(float f) {
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        boolean z = f3 > 0.008856452f;
        float f4 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f3 : f / 903.2963f;
        float f5 = z ? f3 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = a;
        return h(new float[]{f5 * fArr[0], f4 * fArr[1], f3 * fArr[2]});
    }

    public static int g(int i, int i2, int i3) {
        return (((((i & 255) << 16) | sr.t) | ((i2 & 255) << 8)) | (i3 & 255)) >>> 0;
    }

    public static int h(float[] fArr) {
        return i(fArr[0], fArr[1], fArr[2]);
    }

    public static int i(float f, float f2, float f3) {
        float f4 = f / 100.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = ((-0.4986f) * f6) + ((-1.5372f) * f5) + (3.2406f * f4);
        float f8 = (1.8758f * f5) + ((-0.9689f) * f4);
        float f9 = f6 * 1.057f;
        float f10 = f9 + (f5 * (-0.204f)) + (f4 * 0.0557f);
        return g(Math.max(Math.min(255, Math.round(b(f7) * 255.0f)), 0), Math.max(Math.min(255, Math.round(b((0.0415f * f6) + f8) * 255.0f)), 0), Math.max(Math.min(255, Math.round(b(f10) * 255.0f)), 0));
    }

    public static double[] j(int i) {
        float[] o = o(i);
        float f = o[1];
        float[] fArr = a;
        double d = f / fArr[1];
        double cbrt = d > 0.008856451679035631d ? Math.cbrt(d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
        double d2 = o[0] / fArr[0];
        double cbrt2 = d2 > 0.008856451679035631d ? Math.cbrt(d2) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d3 = o[2] / fArr[2];
        return new double[]{(116.0d * cbrt) - 16.0d, (cbrt2 - cbrt) * 500.0d, (cbrt - (d3 > 0.008856451679035631d ? Math.cbrt(d3) : ((d3 * 903.2962962962963d) + 16.0d) / 116.0d)) * 200.0d};
    }

    public static float k(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float l(int i) {
        return (float) j(i)[0];
    }

    public static int m(int i) {
        return (i & b30.s) >> 16;
    }

    public static final float[] n() {
        return Arrays.copyOf(a, 3);
    }

    public static float[] o(int i) {
        float k = k(m(i) / 255.0f) * 100.0f;
        float k2 = k(c(i) / 255.0f) * 100.0f;
        float k3 = k(a(i) / 255.0f) * 100.0f;
        return new float[]{(0.18051042f * k3) + (0.35762063f * k2) + (0.41233894f * k), (0.0722f * k3) + (0.7152f * k2) + (0.2126f * k), (k3 * 0.9503448f) + (k2 * 0.11916382f) + (k * 0.01932141f)};
    }

    public static float p(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}