package com.p7700g.p99005;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.p7700g.p99005.tj0;
import java.util.Collections;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ik0 {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    @z1
    private tj0<PointF, PointF> f;
    @z1
    private tj0<?, PointF> g;
    @z1
    private tj0<op0, op0> h;
    @z1
    private tj0<Float, Float> i;
    @z1
    private tj0<Integer, Integer> j;
    @z1
    private wj0 k;
    @z1
    private wj0 l;
    @z1
    private tj0<?, Float> m;
    @z1
    private tj0<?, Float> n;

    public ik0(jl0 jl0Var) {
        this.f = jl0Var.c() == null ? null : jl0Var.c().a();
        this.g = jl0Var.f() == null ? null : jl0Var.f().a();
        this.h = jl0Var.h() == null ? null : jl0Var.h().a();
        this.i = jl0Var.g() == null ? null : jl0Var.g().a();
        wj0 wj0Var = jl0Var.i() == null ? null : (wj0) jl0Var.i().a();
        this.k = wj0Var;
        if (wj0Var != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = jl0Var.j() == null ? null : (wj0) jl0Var.j().a();
        if (jl0Var.e() != null) {
            this.j = jl0Var.e().a();
        }
        if (jl0Var.k() != null) {
            this.m = jl0Var.k().a();
        } else {
            this.m = null;
        }
        if (jl0Var.d() != null) {
            this.n = jl0Var.d().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public void a(im0 im0Var) {
        im0Var.f(this.j);
        im0Var.f(this.m);
        im0Var.f(this.n);
        im0Var.f(this.f);
        im0Var.f(this.g);
        im0Var.f(this.h);
        im0Var.f(this.i);
        im0Var.f(this.k);
        im0Var.f(this.l);
    }

    public void b(tj0.b bVar) {
        tj0<Integer, Integer> tj0Var = this.j;
        if (tj0Var != null) {
            tj0Var.a(bVar);
        }
        tj0<?, Float> tj0Var2 = this.m;
        if (tj0Var2 != null) {
            tj0Var2.a(bVar);
        }
        tj0<?, Float> tj0Var3 = this.n;
        if (tj0Var3 != null) {
            tj0Var3.a(bVar);
        }
        tj0<PointF, PointF> tj0Var4 = this.f;
        if (tj0Var4 != null) {
            tj0Var4.a(bVar);
        }
        tj0<?, PointF> tj0Var5 = this.g;
        if (tj0Var5 != null) {
            tj0Var5.a(bVar);
        }
        tj0<op0, op0> tj0Var6 = this.h;
        if (tj0Var6 != null) {
            tj0Var6.a(bVar);
        }
        tj0<Float, Float> tj0Var7 = this.i;
        if (tj0Var7 != null) {
            tj0Var7.a(bVar);
        }
        wj0 wj0Var = this.k;
        if (wj0Var != null) {
            wj0Var.a(bVar);
        }
        wj0 wj0Var2 = this.l;
        if (wj0Var2 != null) {
            wj0Var2.a(bVar);
        }
    }

    public <T> boolean c(T t, @z1 np0<T> np0Var) {
        if (t == mi0.f) {
            tj0<PointF, PointF> tj0Var = this.f;
            if (tj0Var == null) {
                this.f = new jk0(np0Var, new PointF());
                return true;
            }
            tj0Var.n(np0Var);
            return true;
        } else if (t == mi0.g) {
            tj0<?, PointF> tj0Var2 = this.g;
            if (tj0Var2 == null) {
                this.g = new jk0(np0Var, new PointF());
                return true;
            }
            tj0Var2.n(np0Var);
            return true;
        } else {
            if (t == mi0.h) {
                tj0<?, PointF> tj0Var3 = this.g;
                if (tj0Var3 instanceof gk0) {
                    ((gk0) tj0Var3).r(np0Var);
                    return true;
                }
            }
            if (t == mi0.i) {
                tj0<?, PointF> tj0Var4 = this.g;
                if (tj0Var4 instanceof gk0) {
                    ((gk0) tj0Var4).s(np0Var);
                    return true;
                }
            }
            if (t == mi0.o) {
                tj0<op0, op0> tj0Var5 = this.h;
                if (tj0Var5 == null) {
                    this.h = new jk0(np0Var, new op0());
                    return true;
                }
                tj0Var5.n(np0Var);
                return true;
            } else if (t == mi0.p) {
                tj0<Float, Float> tj0Var6 = this.i;
                if (tj0Var6 == null) {
                    this.i = new jk0(np0Var, Float.valueOf(0.0f));
                    return true;
                }
                tj0Var6.n(np0Var);
                return true;
            } else if (t == mi0.c) {
                tj0<Integer, Integer> tj0Var7 = this.j;
                if (tj0Var7 == null) {
                    this.j = new jk0(np0Var, 100);
                    return true;
                }
                tj0Var7.n(np0Var);
                return true;
            } else if (t == mi0.C) {
                tj0<?, Float> tj0Var8 = this.m;
                if (tj0Var8 == null) {
                    this.m = new jk0(np0Var, Float.valueOf(100.0f));
                    return true;
                }
                tj0Var8.n(np0Var);
                return true;
            } else if (t == mi0.D) {
                tj0<?, Float> tj0Var9 = this.n;
                if (tj0Var9 == null) {
                    this.n = new jk0(np0Var, Float.valueOf(100.0f));
                    return true;
                }
                tj0Var9.n(np0Var);
                return true;
            } else if (t == mi0.q) {
                if (this.k == null) {
                    this.k = new wj0(Collections.singletonList(new ep0(Float.valueOf(0.0f))));
                }
                this.k.n(np0Var);
                return true;
            } else if (t == mi0.r) {
                if (this.l == null) {
                    this.l = new wj0(Collections.singletonList(new ep0(Float.valueOf(0.0f))));
                }
                this.l.n(np0Var);
                return true;
            } else {
                return false;
            }
        }
    }

    @z1
    public tj0<?, Float> e() {
        return this.n;
    }

    public Matrix f() {
        float p;
        PointF h;
        this.a.reset();
        tj0<?, PointF> tj0Var = this.g;
        if (tj0Var != null && (h = tj0Var.h()) != null) {
            float f = h.x;
            if (f != 0.0f || h.y != 0.0f) {
                this.a.preTranslate(f, h.y);
            }
        }
        tj0<Float, Float> tj0Var2 = this.i;
        if (tj0Var2 != null) {
            if (tj0Var2 instanceof jk0) {
                p = tj0Var2.h().floatValue();
            } else {
                p = ((wj0) tj0Var2).p();
            }
            if (p != 0.0f) {
                this.a.preRotate(p);
            }
        }
        wj0 wj0Var = this.k;
        if (wj0Var != null) {
            wj0 wj0Var2 = this.l;
            float cos = wj0Var2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-wj0Var2.p()) + 90.0f));
            wj0 wj0Var3 = this.l;
            float sin = wj0Var3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-wj0Var3.p()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(wj0Var.p()));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        tj0<op0, op0> tj0Var3 = this.h;
        if (tj0Var3 != null) {
            op0 h2 = tj0Var3.h();
            if (h2.b() != 1.0f || h2.c() != 1.0f) {
                this.a.preScale(h2.b(), h2.c());
            }
        }
        tj0<PointF, PointF> tj0Var4 = this.f;
        if (tj0Var4 != null) {
            PointF h3 = tj0Var4.h();
            float f3 = h3.x;
            if (f3 != 0.0f || h3.y != 0.0f) {
                this.a.preTranslate(-f3, -h3.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f) {
        tj0<?, PointF> tj0Var = this.g;
        PointF h = tj0Var == null ? null : tj0Var.h();
        tj0<op0, op0> tj0Var2 = this.h;
        op0 h2 = tj0Var2 == null ? null : tj0Var2.h();
        this.a.reset();
        if (h != null) {
            this.a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = f;
            this.a.preScale((float) Math.pow(h2.b(), d), (float) Math.pow(h2.c(), d));
        }
        tj0<Float, Float> tj0Var3 = this.i;
        if (tj0Var3 != null) {
            float floatValue = tj0Var3.h().floatValue();
            tj0<PointF, PointF> tj0Var4 = this.f;
            PointF h3 = tj0Var4 != null ? tj0Var4.h() : null;
            this.a.preRotate(floatValue * f, h3 == null ? 0.0f : h3.x, h3 != null ? h3.y : 0.0f);
        }
        return this.a;
    }

    @z1
    public tj0<?, Integer> h() {
        return this.j;
    }

    @z1
    public tj0<?, Float> i() {
        return this.m;
    }

    public void j(float f) {
        tj0<Integer, Integer> tj0Var = this.j;
        if (tj0Var != null) {
            tj0Var.m(f);
        }
        tj0<?, Float> tj0Var2 = this.m;
        if (tj0Var2 != null) {
            tj0Var2.m(f);
        }
        tj0<?, Float> tj0Var3 = this.n;
        if (tj0Var3 != null) {
            tj0Var3.m(f);
        }
        tj0<PointF, PointF> tj0Var4 = this.f;
        if (tj0Var4 != null) {
            tj0Var4.m(f);
        }
        tj0<?, PointF> tj0Var5 = this.g;
        if (tj0Var5 != null) {
            tj0Var5.m(f);
        }
        tj0<op0, op0> tj0Var6 = this.h;
        if (tj0Var6 != null) {
            tj0Var6.m(f);
        }
        tj0<Float, Float> tj0Var7 = this.i;
        if (tj0Var7 != null) {
            tj0Var7.m(f);
        }
        wj0 wj0Var = this.k;
        if (wj0Var != null) {
            wj0Var.m(f);
        }
        wj0 wj0Var2 = this.l;
        if (wj0Var2 != null) {
            wj0Var2.m(f);
        }
    }
}