package com.p7700g.p99005;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
public final class si {
    public static final si a = k(hi.c, (float) ((hi.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float[] h;
    private final float i;
    private final float j;
    private final float k;

    private si(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.g = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.h = fArr;
        this.i = f7;
        this.j = f8;
        this.k = f9;
    }

    @x1
    public static si k(@x1 float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = hi.a;
        float f4 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f5 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f6 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f7 = (f3 / 10.0f) + 0.8f;
        float d = ((double) f7) >= 0.9d ? hi.d(0.59f, 0.69f, (f7 - 0.9f) * 10.0f) : hi.d(0.525f, 0.59f, (f7 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f7;
        double d2 = exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < zg2.s) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f4) * exp) + 1.0f) - exp, (((100.0f / f5) * exp) + 1.0f) - exp, (((100.0f / f6) * exp) + 1.0f) - exp};
        float f8 = 1.0f / ((5.0f * f) + 1.0f);
        float f9 = f8 * f8 * f8 * f8;
        float f10 = 1.0f - f9;
        float cbrt = (0.1f * f10 * f10 * ((float) Math.cbrt(f * 5.0d))) + (f9 * f);
        float h = hi.h(f2) / fArr[1];
        double d3 = h;
        float sqrt = ((float) Math.sqrt(d3)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f4) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f5) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f6) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new si(h, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, d, f7, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.e;
    }

    public float c() {
        return this.i;
    }

    public float d() {
        return this.j;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.c;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.d;
    }

    @x1
    public float[] i() {
        return this.h;
    }

    public float j() {
        return this.k;
    }
}