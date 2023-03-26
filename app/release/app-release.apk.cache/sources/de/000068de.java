package com.p7700g.p99005;

/* compiled from: Cam16.java */
/* loaded from: classes3.dex */
public final class zb2 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;

    private zb2(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = f8;
        this.k = f9;
    }

    public static zb2 b(int i) {
        return c(i, nc2.a);
    }

    public static zb2 c(int i, nc2 nc2Var) {
        double d;
        double d2;
        float pow;
        float k = dc2.k(((16711680 & i) >> 16) / 255.0f) * 100.0f;
        float k2 = dc2.k(((65280 & i) >> 8) / 255.0f) * 100.0f;
        float k3 = dc2.k((i & 255) / 255.0f) * 100.0f;
        float f = (0.18051042f * k3) + (0.35762063f * k2) + (0.41233894f * k);
        float f2 = (0.0722f * k3) + (0.7152f * k2) + (0.2126f * k);
        float f3 = (k3 * 0.9503448f) + (k2 * 0.11916382f) + (k * 0.01932141f);
        float[][] fArr = a;
        float f4 = (fArr[0][2] * f3) + (fArr[0][1] * f2) + (fArr[0][0] * f);
        float f5 = (fArr[1][2] * f3) + (fArr[1][1] * f2) + (fArr[1][0] * f);
        float f6 = f * fArr[2][0];
        float f7 = f3 * fArr[2][2];
        float f8 = nc2Var.i()[0] * f4;
        float f9 = nc2Var.i()[1] * f5;
        float f10 = nc2Var.i()[2] * (f7 + (f2 * fArr[2][1]) + f6);
        float pow2 = (float) Math.pow((Math.abs(f8) * nc2Var.c()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f9) * nc2Var.c()) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f10) * nc2Var.c()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d3 = (signum2 * (-12.0d)) + (signum * 11.0d);
        double d4 = signum3;
        float f11 = signum2 * 20.0f;
        float f12 = ((21.0f * signum3) + ((signum * 20.0f) + f11)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(((float) ((signum + signum2) - (d4 * 2.0d))) / 9.0f, ((float) (d3 + d4)) / 11.0f)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = (3.1415927f * atan2) / 180.0f;
        float pow5 = ((float) Math.pow((nc2Var.f() * f13) / nc2Var.a(), nc2Var.j() * nc2Var.b())) * 100.0f;
        float d5 = nc2Var.d() * (nc2Var.a() + 4.0f) * (4.0f / nc2Var.b()) * ((float) Math.sqrt(pow5 / 100.0f));
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, nc2Var.e()), 0.73d)) * ((float) Math.pow(((nc2Var.h() * (nc2Var.g() * ((((float) (Math.cos(Math.toRadians(((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f))) * ((float) Math.hypot(d2, d))) / (f12 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d6 = nc2Var.d() * pow6;
        float sqrt = ((float) Math.sqrt((nc2Var.b() * pow) / (nc2Var.a() + 4.0f))) * 50.0f;
        float f15 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log1p = ((float) Math.log1p(0.0228f * d6)) * 43.85965f;
        double d7 = f14;
        return new zb2(atan2, pow6, pow5, d5, d6, sqrt, f15, log1p * ((float) Math.cos(d7)), log1p * ((float) Math.sin(d7)));
    }

    public static zb2 d(float f, float f2, float f3) {
        return e(f, f2, f3, nc2.a);
    }

    private static zb2 e(float f, float f2, float f3, nc2 nc2Var) {
        double d;
        float d2 = nc2Var.d() * (nc2Var.a() + 4.0f) * (4.0f / nc2Var.b()) * ((float) Math.sqrt(f / 100.0d));
        float d3 = nc2Var.d() * f2;
        float sqrt = ((float) Math.sqrt((nc2Var.b() * (f2 / ((float) Math.sqrt(d)))) / (nc2Var.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log1p = ((float) Math.log1p(d3 * 0.0228d)) * 43.85965f;
        double d4 = (3.1415927f * f3) / 180.0f;
        return new zb2(f3, f2, f, d2, d3, sqrt, f4, log1p * ((float) Math.cos(d4)), log1p * ((float) Math.sin(d4)));
    }

    public static zb2 f(float f, float f2, float f3) {
        return g(f, f2, f3, nc2.a);
    }

    public static zb2 g(float f, float f2, float f3, nc2 nc2Var) {
        double d = f2;
        double d2 = f3;
        double expm1 = (Math.expm1(Math.hypot(d, d2) * 0.02280000038444996d) / 0.02280000038444996d) / nc2Var.d();
        double atan2 = Math.atan2(d2, d) * 57.29577951308232d;
        if (atan2 < zg2.s) {
            atan2 += 360.0d;
        }
        return e(f / (1.0f - ((f - 100.0f) * 0.007f)), (float) expm1, (float) atan2, nc2Var);
    }

    public float a(zb2 zb2Var) {
        float n = n() - zb2Var.n();
        float h = h() - zb2Var.h();
        float i = i() - zb2Var.i();
        return (float) (Math.pow(Math.sqrt((i * i) + (h * h) + (n * n)), 0.63d) * 1.41d);
    }

    public float h() {
        return this.j;
    }

    public float i() {
        return this.k;
    }

    public float j() {
        return this.d;
    }

    public float k() {
        return this.c;
    }

    public int l() {
        return r(nc2.a);
    }

    public float m() {
        return this.e;
    }

    public float n() {
        return this.i;
    }

    public float o() {
        return this.g;
    }

    public float p() {
        return this.f;
    }

    public float q() {
        return this.h;
    }

    public int r(nc2 nc2Var) {
        float pow = (float) Math.pow(((((double) j()) == zg2.s || ((double) m()) == zg2.s) ? 0.0f : j() / ((float) Math.sqrt(m() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, nc2Var.e()), 0.73d), 1.1111111111111112d);
        double k = (k() * 3.1415927f) / 180.0f;
        float a2 = nc2Var.a() * ((float) Math.pow(m() / 100.0d, (1.0d / nc2Var.b()) / nc2Var.j()));
        float h = nc2Var.h() * nc2Var.g() * ((float) (Math.cos(2.0d + k) + 3.8d)) * 0.25f * 3846.1538f;
        float f = a2 / nc2Var.f();
        float sin = (float) Math.sin(k);
        float cos = (float) Math.cos(k);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos) + (h * 23.0f)));
        float f3 = cos * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = ((288.0f * f4) + ((451.0f * f3) + f5)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float c = (100.0f / nc2Var.c()) * Math.signum(f6) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float c2 = (100.0f / nc2Var.c()) * Math.signum(f7) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float c3 = (100.0f / nc2Var.c()) * Math.signum(f8) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float f9 = c / nc2Var.i()[0];
        float f10 = c2 / nc2Var.i()[1];
        float f11 = c3 / nc2Var.i()[2];
        float[][] fArr = b;
        return dc2.i((fArr[0][2] * f11) + (fArr[0][1] * f10) + (fArr[0][0] * f9), (fArr[1][2] * f11) + (fArr[1][1] * f10) + (fArr[1][0] * f9), (f11 * fArr[2][2]) + (f10 * fArr[2][1]) + (f9 * fArr[2][0]));
    }
}