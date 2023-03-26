package com.p7700g.p99005;

/* compiled from: Hct.java */
/* loaded from: classes3.dex */
public final class jc2 {
    private static final float a = 0.4f;
    private static final float b = 1.0f;
    private static final float c = 0.2f;
    private static final float d = 1.0E-9f;
    private static final float e = 0.01f;
    private float f;
    private float g;
    private float h;

    private jc2(float f, float f2, float f3) {
        k(d(f, f2, f3));
    }

    private static zb2 a(float f, float f2, float f3) {
        float f4 = 1000.0f;
        zb2 zb2Var = null;
        float f5 = 1000.0f;
        float f6 = 100.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f6) > e) {
            float f8 = ((f6 - f7) / 2.0f) + f7;
            int l = zb2.d(f8, f2, f).l();
            float l2 = dc2.l(l);
            float abs = Math.abs(f3 - l2);
            if (abs < 0.2f) {
                zb2 b2 = zb2.b(l);
                float a2 = b2.a(zb2.d(b2.m(), b2.j(), f));
                if (a2 <= 1.0f && a2 <= f4) {
                    zb2Var = b2;
                    f5 = abs;
                    f4 = a2;
                }
            }
            if (f5 == 0.0f && f4 < d) {
                break;
            } else if (l2 < f3) {
                f7 = f8;
            } else {
                f6 = f8;
            }
        }
        return zb2Var;
    }

    public static jc2 b(float f, float f2, float f3) {
        return new jc2(f, f2, f3);
    }

    public static jc2 c(int i) {
        zb2 b2 = zb2.b(i);
        return new jc2(b2.k(), b2.j(), dc2.l(i));
    }

    private static int d(float f, float f2, float f3) {
        return e(f, f2, f3, nc2.a);
    }

    public static int e(float f, float f2, float f3, nc2 nc2Var) {
        if (f2 >= 1.0d && Math.round(f3) > zg2.s && Math.round(f3) < 100.0d) {
            float d2 = lc2.d(f);
            float f4 = f2;
            zb2 zb2Var = null;
            float f5 = 0.0f;
            boolean z = true;
            while (Math.abs(f5 - f2) >= 0.4f) {
                zb2 a2 = a(d2, f4, f3);
                if (z) {
                    if (a2 != null) {
                        return a2.r(nc2Var);
                    }
                    z = false;
                } else if (a2 == null) {
                    f2 = f4;
                } else {
                    f5 = f4;
                    zb2Var = a2;
                }
                f4 = ((f2 - f5) / 2.0f) + f5;
            }
            if (zb2Var == null) {
                return dc2.f(f3);
            }
            return zb2Var.r(nc2Var);
        }
        return dc2.f(f3);
    }

    private void k(int i) {
        zb2 b2 = zb2.b(i);
        float l = dc2.l(i);
        this.f = b2.k();
        this.g = b2.j();
        this.h = l;
    }

    public float f() {
        return this.g;
    }

    public float g() {
        return this.f;
    }

    public float h() {
        return this.h;
    }

    public void i(float f) {
        k(d(this.f, f, this.h));
    }

    public void j(float f) {
        k(d(lc2.d(f), this.g, this.h));
    }

    public void l(float f) {
        k(d(this.f, this.g, f));
    }

    public int m() {
        return d(this.f, this.g, this.h);
    }
}