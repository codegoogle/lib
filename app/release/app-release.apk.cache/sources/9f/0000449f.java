package com.p7700g.p99005;

/* compiled from: CamColor.java */
/* loaded from: classes.dex */
public class gi {
    private static final float a = 0.2f;
    private static final float b = 1.0f;
    private static final float c = 0.4f;
    private static final float d = 0.01f;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;

    public gi(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
        this.j = f6;
        this.k = f7;
        this.l = f8;
        this.m = f9;
    }

    @z1
    private static gi b(@g1(from = 0.0d, to = 360.0d) float f, @g1(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @g1(from = 0.0d, to = 100.0d) float f3) {
        float f4 = 1000.0f;
        gi giVar = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > d) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int s = e(f8, f2, f).s();
            float b2 = hi.b(s);
            float abs = Math.abs(f3 - b2);
            if (abs < 0.2f) {
                gi c2 = c(s);
                float a2 = c2.a(e(c2.k(), c2.i(), f));
                if (a2 <= 1.0f) {
                    giVar = c2;
                    f4 = abs;
                    f5 = a2;
                }
            }
            if (f4 == 0.0f && f5 == 0.0f) {
                break;
            } else if (b2 < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return giVar;
    }

    @x1
    public static gi c(@w0 int i) {
        return d(i, si.a);
    }

    @x1
    public static gi d(@w0 int i, @x1 si siVar) {
        float pow;
        float[] f = hi.f(i);
        float[][] fArr = hi.a;
        float f2 = (f[2] * fArr[0][2]) + (f[1] * fArr[0][1]) + (f[0] * fArr[0][0]);
        float f3 = (f[2] * fArr[1][2]) + (f[1] * fArr[1][1]) + (f[0] * fArr[1][0]);
        float f4 = f[0] * fArr[2][0];
        float f5 = f[2] * fArr[2][2];
        float f6 = siVar.i()[0] * f2;
        float f7 = siVar.i()[1] * f3;
        float f8 = siVar.i()[2] * (f5 + (f[1] * fArr[2][1]) + f4);
        float pow2 = (float) Math.pow((Math.abs(f6) * siVar.c()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f7) * siVar.c()) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f8) * siVar.c()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d2 = signum3;
        float f9 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d2)) / 11.0f;
        float f10 = ((float) ((signum + signum2) - (d2 * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = ((21.0f * signum3) + ((signum * 20.0f) + f11)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f10, f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = atan2;
        float f15 = (3.1415927f * f14) / 180.0f;
        float pow5 = ((float) Math.pow((siVar.f() * f13) / siVar.a(), siVar.j() * siVar.b())) * 100.0f;
        float d3 = siVar.d() * (siVar.a() + 4.0f) * (4.0f / siVar.b()) * ((float) Math.sqrt(pow5 / 100.0f));
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, siVar.e()), 0.73d)) * ((float) Math.pow(((siVar.h() * (siVar.g() * ((((float) (Math.cos((((((double) f14) < 20.14d ? 360.0f + f14 : f14) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f))) * ((float) Math.sqrt((f10 * f10) + (f9 * f9)))) / (f12 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d4 = siVar.d() * pow6;
        float sqrt = ((float) Math.sqrt((siVar.b() * pow) / (siVar.a() + 4.0f))) * 50.0f;
        float f16 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d4) + 1.0f)) * 43.85965f;
        double d5 = f15;
        return new gi(f14, pow6, pow5, d3, d4, sqrt, f16, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    @x1
    private static gi e(@g1(from = 0.0d, to = 100.0d) float f, @g1(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @g1(from = 0.0d, to = 360.0d) float f3) {
        return f(f, f2, f3, si.a);
    }

    @x1
    private static gi f(@g1(from = 0.0d, to = 100.0d) float f, @g1(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @g1(from = 0.0d, to = 360.0d) float f3, si siVar) {
        double d2;
        float d3 = siVar.d() * (siVar.a() + 4.0f) * (4.0f / siVar.b()) * ((float) Math.sqrt(f / 100.0d));
        float d4 = siVar.d() * f2;
        float sqrt = ((float) Math.sqrt((siVar.b() * (f2 / ((float) Math.sqrt(d2)))) / (siVar.a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((d4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f3) / 180.0f;
        return new gi(f3, f2, f, d3, d4, sqrt, f4, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static int p(@g1(from = 0.0d, to = 360.0d) float f, @g1(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @g1(from = 0.0d, to = 100.0d) float f3) {
        return q(f, f2, f3, si.a);
    }

    @w0
    public static int q(@g1(from = 0.0d, to = 360.0d) float f, @g1(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @g1(from = 0.0d, to = 100.0d) float f3, @x1 si siVar) {
        if (f2 >= 1.0d && Math.round(f3) > zg2.s && Math.round(f3) < 100.0d) {
            float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
            float f4 = f2;
            gi giVar = null;
            float f5 = 0.0f;
            boolean z = true;
            while (Math.abs(f5 - f2) >= 0.4f) {
                gi b2 = b(min, f4, f3);
                if (z) {
                    if (b2 != null) {
                        return b2.r(siVar);
                    }
                    z = false;
                } else if (b2 == null) {
                    f2 = f4;
                } else {
                    f5 = f4;
                    giVar = b2;
                }
                f4 = ((f2 - f5) / 2.0f) + f5;
            }
            if (giVar == null) {
                return hi.a(f3);
            }
            return giVar.r(siVar);
        }
        return hi.a(f3);
    }

    public float a(@x1 gi giVar) {
        float l = l() - giVar.l();
        float g = g() - giVar.g();
        float h = h() - giVar.h();
        return (float) (Math.pow(Math.sqrt((h * h) + (g * g) + (l * l)), 0.63d) * 1.41d);
    }

    @g1(from = o15.e, fromInclusive = false, to = o15.d, toInclusive = false)
    public float g() {
        return this.l;
    }

    @g1(from = o15.e, fromInclusive = false, to = o15.d, toInclusive = false)
    public float h() {
        return this.m;
    }

    @g1(from = zg2.s, to = o15.d, toInclusive = false)
    public float i() {
        return this.f;
    }

    @g1(from = zg2.s, to = 360.0d, toInclusive = false)
    public float j() {
        return this.e;
    }

    @g1(from = zg2.s, to = 100.0d)
    public float k() {
        return this.g;
    }

    @g1(from = zg2.s, to = 100.0d)
    public float l() {
        return this.k;
    }

    @g1(from = zg2.s, to = o15.d, toInclusive = false)
    public float m() {
        return this.i;
    }

    @g1(from = zg2.s, to = o15.d, toInclusive = false)
    public float n() {
        return this.h;
    }

    @g1(from = zg2.s, to = o15.d, toInclusive = false)
    public float o() {
        return this.j;
    }

    @w0
    public int r(@x1 si siVar) {
        float pow = (float) Math.pow(((((double) i()) == zg2.s || ((double) k()) == zg2.s) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, siVar.e()), 0.73d), 1.1111111111111112d);
        double j = (j() * 3.1415927f) / 180.0f;
        float a2 = siVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / siVar.b()) / siVar.j()));
        float h = siVar.h() * siVar.g() * ((float) (Math.cos(2.0d + j) + 3.8d)) * 0.25f * 3846.1538f;
        float f = a2 / siVar.f();
        float sin = (float) Math.sin(j);
        float cos = (float) Math.cos(j);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos) + (h * 23.0f)));
        float f3 = cos * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = ((288.0f * f4) + ((451.0f * f3) + f5)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float c2 = (100.0f / siVar.c()) * Math.signum(f6) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float c3 = (100.0f / siVar.c()) * Math.signum(f7) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float c4 = (100.0f / siVar.c()) * Math.signum(f8) * ((float) Math.pow((float) Math.max((double) zg2.s, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float f9 = c2 / siVar.i()[0];
        float f10 = c3 / siVar.i()[1];
        float f11 = c4 / siVar.i()[2];
        float[][] fArr = hi.b;
        return fj.g((fArr[0][2] * f11) + (fArr[0][1] * f10) + (fArr[0][0] * f9), (fArr[1][2] * f11) + (fArr[1][1] * f10) + (fArr[1][0] * f9), (f11 * fArr[2][2]) + (f10 * fArr[2][1]) + (f9 * fArr[2][0]));
    }

    @w0
    public int s() {
        return r(si.a);
    }
}