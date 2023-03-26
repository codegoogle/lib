package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import com.p7700g.p99005.wl0;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public class kj0 implements jj0, tj0.b, gj0 {
    private static final float a = 0.47829f;
    private static final float b = 0.25f;
    private final String d;
    private final hi0 e;
    private final wl0.a f;
    private final boolean g;
    private final boolean h;
    private final tj0<?, Float> i;
    private final tj0<?, PointF> j;
    private final tj0<?, Float> k;
    @z1
    private final tj0<?, Float> l;
    private final tj0<?, Float> m;
    @z1
    private final tj0<?, Float> n;
    private final tj0<?, Float> o;
    private boolean q;
    private final Path c = new Path();
    private final xi0 p = new xi0();

    /* compiled from: PolystarContent.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            wl0.a.values();
            int[] iArr = new int[2];
            a = iArr;
            try {
                iArr[wl0.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[wl0.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public kj0(hi0 hi0Var, im0 im0Var, wl0 wl0Var) {
        this.e = hi0Var;
        this.d = wl0Var.d();
        wl0.a j = wl0Var.j();
        this.f = j;
        this.g = wl0Var.k();
        this.h = wl0Var.l();
        tj0<Float, Float> a2 = wl0Var.g().a();
        this.i = a2;
        tj0<PointF, PointF> a3 = wl0Var.h().a();
        this.j = a3;
        tj0<Float, Float> a4 = wl0Var.i().a();
        this.k = a4;
        tj0<Float, Float> a5 = wl0Var.e().a();
        this.m = a5;
        tj0<Float, Float> a6 = wl0Var.f().a();
        this.o = a6;
        wl0.a aVar = wl0.a.STAR;
        if (j == aVar) {
            this.l = wl0Var.b().a();
            this.n = wl0Var.c().a();
        } else {
            this.l = null;
            this.n = null;
        }
        im0Var.f(a2);
        im0Var.f(a3);
        im0Var.f(a4);
        im0Var.f(a5);
        im0Var.f(a6);
        if (j == aVar) {
            im0Var.f(this.l);
            im0Var.f(this.n);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j == aVar) {
            this.l.a(this);
            this.n.a(this);
        }
    }

    private void f() {
        tj0<?, Float> tj0Var;
        double d;
        double d2;
        double d3;
        int i;
        int floor = (int) Math.floor(this.i.h().floatValue());
        double radians = Math.toRadians((this.k == null ? zg2.s : tj0Var.h().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.o.h().floatValue() / 100.0f;
        float floatValue2 = this.m.h().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.c.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (Math.sin(d7) * d5);
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.c.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d = d7;
                d2 = d5;
                d3 = d6;
                i = i2;
                this.c.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF h = this.j.h();
        this.c.offset(h.x, h.y);
        this.c.close();
    }

    private void i() {
        tj0<?, Float> tj0Var;
        float f;
        float cos;
        float sin;
        float f2;
        float f3;
        double d;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        double d2;
        float f11;
        float f12;
        float floatValue = this.i.h().floatValue();
        double radians = Math.toRadians((this.k == null ? zg2.s : tj0Var.h().floatValue()) - 90.0d);
        double d3 = floatValue;
        float f13 = (float) (6.283185307179586d / d3);
        if (this.h) {
            f13 *= -1.0f;
        }
        float f14 = f13 / 2.0f;
        float f15 = floatValue - ((int) floatValue);
        int i = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i != 0) {
            radians += (1.0f - f15) * f14;
        }
        float floatValue2 = this.m.h().floatValue();
        float floatValue3 = this.l.h().floatValue();
        tj0<?, Float> tj0Var2 = this.n;
        float floatValue4 = tj0Var2 != null ? tj0Var2.h().floatValue() / 100.0f : 0.0f;
        tj0<?, Float> tj0Var3 = this.o;
        float floatValue5 = tj0Var3 != null ? tj0Var3.h().floatValue() / 100.0f : 0.0f;
        if (i != 0) {
            float a2 = wo1.a(floatValue2, floatValue3, f15, floatValue3);
            double d4 = a2;
            f4 = a2;
            f = floatValue5;
            float cos2 = (float) (Math.cos(radians) * d4);
            sin = (float) (Math.sin(radians) * d4);
            this.c.moveTo(cos2, sin);
            d = radians + ((f13 * f15) / 2.0f);
            f3 = floatValue3;
            cos = cos2;
            f2 = floatValue2;
        } else {
            f = floatValue5;
            double d5 = floatValue2;
            cos = (float) (Math.cos(radians) * d5);
            sin = (float) (d5 * Math.sin(radians));
            this.c.moveTo(cos, sin);
            f2 = floatValue2;
            f3 = floatValue3;
            d = radians + f14;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d3) * 2.0d;
        float f16 = cos;
        float f17 = f3;
        int i2 = 0;
        boolean z = false;
        while (true) {
            double d6 = i2;
            if (d6 < ceil) {
                float f18 = z ? f2 : f17;
                int i3 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                if (i3 == 0 || d6 != ceil - 2.0d) {
                    f5 = f13;
                    f6 = f14;
                } else {
                    f5 = f13;
                    f6 = (f13 * f15) / 2.0f;
                }
                if (i3 == 0 || d6 != ceil - 1.0d) {
                    f7 = f14;
                    f8 = f18;
                    f9 = f6;
                } else {
                    f9 = f6;
                    f7 = f14;
                    f8 = f4;
                }
                double d7 = f8;
                float cos3 = (float) (Math.cos(d) * d7);
                float sin2 = (float) (d7 * Math.sin(d));
                if (floatValue4 == 0.0f && f == 0.0f) {
                    this.c.lineTo(cos3, sin2);
                    d2 = d;
                    f12 = sin2;
                    f11 = floatValue4;
                    f10 = f2;
                } else {
                    f10 = f2;
                    d2 = d;
                    f11 = floatValue4;
                    float f19 = f16;
                    double atan2 = (float) (Math.atan2(sin, f19) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    float f20 = sin;
                    f12 = sin2;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f21 = z ? f11 : f;
                    float f22 = z ? f : f11;
                    float f23 = z ? f17 : f10;
                    float f24 = z ? f10 : f17;
                    float f25 = f23 * f21 * a;
                    float f26 = cos4 * f25;
                    float f27 = f25 * sin3;
                    float f28 = f24 * f22 * a;
                    float f29 = cos5 * f28;
                    float f30 = f28 * sin4;
                    if (i != 0) {
                        if (i2 == 0) {
                            f26 *= f15;
                            f27 *= f15;
                        } else if (d6 == ceil - 1.0d) {
                            f29 *= f15;
                            f30 *= f15;
                        }
                    }
                    this.c.cubicTo(f19 - f26, f20 - f27, cos3 + f29, f12 + f30, cos3, f12);
                }
                d = d2 + f9;
                z = !z;
                i2++;
                f2 = f10;
                sin = f12;
                f14 = f7;
                f13 = f5;
                floatValue4 = f11;
                f16 = cos3;
            } else {
                PointF h = this.j.h();
                this.c.offset(h.x, h.y);
                this.c.close();
                return;
            }
        }
    }

    private void j() {
        this.q = false;
        this.e.invalidateSelf();
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        j();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        for (int i = 0; i < list.size(); i++) {
            yi0 yi0Var = list.get(i);
            if (yi0Var instanceof rj0) {
                rj0 rj0Var = (rj0) yi0Var;
                if (rj0Var.j() == fm0.a.SIMULTANEOUSLY) {
                    this.p.a(rj0Var);
                    rj0Var.c(this);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        bp0.m(tk0Var, i, list, tk0Var2, this);
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.d;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        if (this.q) {
            return this.c;
        }
        this.c.reset();
        if (this.g) {
            this.q = true;
            return this.c;
        }
        int ordinal = this.f.ordinal();
        if (ordinal == 0) {
            i();
        } else if (ordinal == 1) {
            f();
        }
        this.c.close();
        this.p.b(this.c);
        this.q = true;
        return this.c;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        tj0<?, Float> tj0Var;
        tj0<?, Float> tj0Var2;
        if (t == mi0.w) {
            this.i.n(np0Var);
        } else if (t == mi0.x) {
            this.k.n(np0Var);
        } else if (t == mi0.n) {
            this.j.n(np0Var);
        } else if (t == mi0.y && (tj0Var2 = this.l) != null) {
            tj0Var2.n(np0Var);
        } else if (t == mi0.z) {
            this.m.n(np0Var);
        } else if (t == mi0.A && (tj0Var = this.n) != null) {
            tj0Var.n(np0Var);
        } else if (t == mi0.B) {
            this.o.n(np0Var);
        }
    }
}