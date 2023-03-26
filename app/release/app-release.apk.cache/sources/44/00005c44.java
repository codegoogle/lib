package com.p7700g.p99005;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.po0;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public class sn0 {
    private static final float a = 100.0f;
    private static z7<WeakReference<Interpolator>> c;
    private static final Interpolator b = new LinearInterpolator();
    public static po0.a d = po0.a.a("t", "s", "e", ij3.b, "i", "h", aa.h.d, "ti");
    public static po0.a e = po0.a.a("x", "y");

    @z1
    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> h;
        synchronized (sn0.class) {
            h = g().h(i);
        }
        return h;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = bp0.c(pointF.x, -1.0f, 1.0f);
        pointF.y = bp0.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = bp0.c(pointF2.x, -1.0f, 1.0f);
        float c2 = bp0.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c2;
        int i = cp0.i(pointF.x, pointF.y, pointF2.x, c2);
        WeakReference<Interpolator> a2 = a(i);
        Interpolator interpolator = a2 != null ? a2.get() : null;
        if (a2 == null || interpolator == null) {
            try {
                linearInterpolator = rs.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e2) {
                if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                    linearInterpolator = rs.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            try {
                h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    public static <T> ep0<T> c(po0 po0Var, ei0 ei0Var, float f, mo0<T> mo0Var, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(ei0Var, po0Var, f, mo0Var);
        }
        if (z) {
            return d(ei0Var, po0Var, f, mo0Var);
        }
        return f(po0Var, f, mo0Var);
    }

    private static <T> ep0<T> d(ei0 ei0Var, po0 po0Var, float f, mo0<T> mo0Var) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        po0Var.d();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (po0Var.h()) {
            switch (po0Var.w(d)) {
                case 0:
                    f2 = (float) po0Var.k();
                    break;
                case 1:
                    t3 = mo0Var.a(po0Var, f);
                    break;
                case 2:
                    t2 = mo0Var.a(po0Var, f);
                    break;
                case 3:
                    pointF = rn0.e(po0Var, 1.0f);
                    break;
                case 4:
                    pointF2 = rn0.e(po0Var, 1.0f);
                    break;
                case 5:
                    if (po0Var.l() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = rn0.e(po0Var, f);
                    break;
                case 7:
                    pointF4 = rn0.e(po0Var, f);
                    break;
                default:
                    po0Var.A();
                    break;
            }
        }
        po0Var.f();
        if (z) {
            interpolator2 = b;
            t = t3;
        } else {
            if (pointF != null && pointF2 != null) {
                interpolator = b(pointF, pointF2);
            } else {
                interpolator = b;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        ep0<T> ep0Var = new ep0<>(ei0Var, t3, t, interpolator2, f2, null);
        ep0Var.q = pointF3;
        ep0Var.r = pointF4;
        return ep0Var;
    }

    private static <T> ep0<T> e(ei0 ei0Var, po0 po0Var, float f, mo0<T> mo0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b2;
        Interpolator b3;
        T t;
        PointF pointF;
        ep0<T> ep0Var;
        PointF pointF2;
        float f2;
        PointF pointF3;
        po0Var.d();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t3 = null;
        while (po0Var.h()) {
            switch (po0Var.w(d)) {
                case 0:
                    pointF2 = pointF4;
                    f3 = (float) po0Var.k();
                    break;
                case 1:
                    pointF2 = pointF4;
                    t2 = mo0Var.a(po0Var, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    t3 = mo0Var.a(po0Var, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f3;
                    PointF pointF12 = pointF11;
                    if (po0Var.s() == po0.b.BEGIN_OBJECT) {
                        po0Var.d();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (po0Var.h()) {
                            int w = po0Var.w(e);
                            if (w == 0) {
                                po0.b s = po0Var.s();
                                po0.b bVar = po0.b.NUMBER;
                                if (s == bVar) {
                                    f6 = (float) po0Var.k();
                                    f4 = f6;
                                } else {
                                    po0Var.b();
                                    f4 = (float) po0Var.k();
                                    f6 = po0Var.s() == bVar ? (float) po0Var.k() : f4;
                                    po0Var.e();
                                }
                            } else if (w != 1) {
                                po0Var.A();
                            } else {
                                po0.b s2 = po0Var.s();
                                po0.b bVar2 = po0.b.NUMBER;
                                if (s2 == bVar2) {
                                    f7 = (float) po0Var.k();
                                    f5 = f7;
                                } else {
                                    po0Var.b();
                                    f5 = (float) po0Var.k();
                                    f7 = po0Var.s() == bVar2 ? (float) po0Var.k() : f5;
                                    po0Var.e();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f4, f5);
                        PointF pointF14 = new PointF(f6, f7);
                        po0Var.f();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f3 = f2;
                        break;
                    } else {
                        pointF5 = rn0.e(po0Var, f);
                        f3 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (po0Var.s() == po0.b.BEGIN_OBJECT) {
                        po0Var.d();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (po0Var.h()) {
                            PointF pointF15 = pointF11;
                            int w2 = po0Var.w(e);
                            if (w2 != 0) {
                                pointF3 = pointF4;
                                if (w2 != 1) {
                                    po0Var.A();
                                } else {
                                    po0.b s3 = po0Var.s();
                                    po0.b bVar3 = po0.b.NUMBER;
                                    if (s3 == bVar3) {
                                        f11 = (float) po0Var.k();
                                        f3 = f3;
                                        f9 = f11;
                                    } else {
                                        float f12 = f3;
                                        po0Var.b();
                                        float k = (float) po0Var.k();
                                        float k2 = po0Var.s() == bVar3 ? (float) po0Var.k() : k;
                                        po0Var.e();
                                        f3 = f12;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f11 = k2;
                                        f9 = k;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f13 = f3;
                                po0.b s4 = po0Var.s();
                                po0.b bVar4 = po0.b.NUMBER;
                                if (s4 == bVar4) {
                                    f10 = (float) po0Var.k();
                                    f3 = f13;
                                    f8 = f10;
                                } else {
                                    po0Var.b();
                                    f8 = (float) po0Var.k();
                                    f10 = po0Var.s() == bVar4 ? (float) po0Var.k() : f8;
                                    po0Var.e();
                                    f3 = f13;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f3;
                        PointF pointF16 = new PointF(f8, f9);
                        PointF pointF17 = new PointF(f10, f11);
                        po0Var.f();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f3 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = rn0.e(po0Var, f);
                        break;
                    }
                case 5:
                    if (po0Var.l() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = rn0.e(po0Var, f);
                    continue;
                case 7:
                    pointF4 = rn0.e(po0Var, f);
                    continue;
                default:
                    pointF2 = pointF4;
                    po0Var.A();
                    break;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f14 = f3;
        PointF pointF19 = pointF11;
        po0Var.f();
        if (z) {
            interpolator = b;
            t = t2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                b2 = b(pointF7, pointF9);
                b3 = b(pointF8, pointF10);
                t = t3;
                interpolator = null;
                if (b2 == null && b3 != null) {
                    pointF = pointF19;
                    ep0Var = new ep0<>(ei0Var, t2, t, b2, b3, f14, null);
                } else {
                    pointF = pointF19;
                    ep0Var = new ep0<>(ei0Var, t2, t, interpolator, f14, null);
                }
                ep0Var.q = pointF;
                ep0Var.r = pointF18;
                return ep0Var;
            } else {
                interpolator = b;
            }
            t = t3;
        }
        b2 = null;
        b3 = null;
        if (b2 == null) {
        }
        pointF = pointF19;
        ep0Var = new ep0<>(ei0Var, t2, t, interpolator, f14, null);
        ep0Var.q = pointF;
        ep0Var.r = pointF18;
        return ep0Var;
    }

    private static <T> ep0<T> f(po0 po0Var, float f, mo0<T> mo0Var) throws IOException {
        return new ep0<>(mo0Var.a(po0Var, f));
    }

    private static z7<WeakReference<Interpolator>> g() {
        if (c == null) {
            c = new z7<>();
        }
        return c;
    }

    private static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (sn0.class) {
            c.u(i, weakReference);
        }
    }
}