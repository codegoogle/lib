package com.p7700g.p99005;

/* compiled from: Blend.java */
/* loaded from: classes3.dex */
public final class yb2 {
    private static final float a = 15.0f;
    private static final float b = 0.5f;

    private yb2() {
    }

    public static int a(int i, int i2, float f) {
        zb2 b2 = zb2.b(i);
        zb2 b3 = zb2.b(i2);
        float n = b2.n();
        float h = b2.h();
        float i3 = b2.i();
        return zb2.f(wo1.a(b3.n(), n, f, n), wo1.a(b3.h(), h, f, h), ((b3.i() - i3) * f) + i3).l();
    }

    public static int b(int i, int i2, float f) {
        return jc2.b(zb2.b(a(i, i2, f)).k(), zb2.b(i).j(), dc2.l(i)).m();
    }

    public static int c(int i, int i2) {
        jc2 c = jc2.c(i);
        jc2 c2 = jc2.c(i2);
        float min = Math.min(lc2.b(c.g(), c2.g()) * 0.5f, (float) a);
        return jc2.b(lc2.d((min * d(c.g(), c2.g())) + c.g()), c.f(), c.h()).m();
    }

    private static float d(float f, float f2) {
        float f3 = f2 - f;
        float f4 = f3 + 360.0f;
        float f5 = f3 - 360.0f;
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        float abs3 = Math.abs(f5);
        return (abs > abs2 || abs > abs3) ? (abs2 > abs || abs2 > abs3) ? ((double) f5) >= zg2.s ? 1.0f : -1.0f : ((double) f4) >= zg2.s ? 1.0f : -1.0f : ((double) f3) >= zg2.s ? 1.0f : -1.0f;
    }
}