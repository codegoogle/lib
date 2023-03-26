package com.p7700g.p99005;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public class dj0 implements aj0, tj0.b, gj0 {
    private static final int a = 32;
    @x1
    private final String b;
    private final boolean c;
    private final im0 d;
    private final v7<LinearGradient> e = new v7<>();
    private final v7<RadialGradient> f = new v7<>();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List<jj0> j;
    private final tl0 k;
    private final tj0<ql0, ql0> l;
    private final tj0<Integer, Integer> m;
    private final tj0<PointF, PointF> n;
    private final tj0<PointF, PointF> o;
    @z1
    private tj0<ColorFilter, ColorFilter> p;
    @z1
    private jk0 q;
    private final hi0 r;
    private final int s;
    @z1
    private tj0<Float, Float> t;
    public float u;
    @z1
    private vj0 v;

    public dj0(hi0 hi0Var, im0 im0Var, rl0 rl0Var) {
        Path path = new Path();
        this.g = path;
        this.h = new vi0(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.u = 0.0f;
        this.d = im0Var;
        this.b = rl0Var.f();
        this.c = rl0Var.i();
        this.r = hi0Var;
        this.k = rl0Var.e();
        path.setFillType(rl0Var.c());
        this.s = (int) (hi0Var.B().d() / 32.0f);
        tj0<ql0, ql0> a2 = rl0Var.d().a();
        this.l = a2;
        a2.a(this);
        im0Var.f(a2);
        tj0<Integer, Integer> a3 = rl0Var.g().a();
        this.m = a3;
        a3.a(this);
        im0Var.f(a3);
        tj0<PointF, PointF> a4 = rl0Var.h().a();
        this.n = a4;
        a4.a(this);
        im0Var.f(a4);
        tj0<PointF, PointF> a5 = rl0Var.b().a();
        this.o = a5;
        a5.a(this);
        im0Var.f(a5);
        if (im0Var.u() != null) {
            tj0<Float, Float> a6 = im0Var.u().a().a();
            this.t = a6;
            a6.a(this);
            im0Var.f(this.t);
        }
        if (im0Var.w() != null) {
            this.v = new vj0(this, im0Var, im0Var.w());
        }
    }

    private int[] f(int[] iArr) {
        jk0 jk0Var = this.q;
        if (jk0Var != null) {
            Integer[] numArr = (Integer[]) jk0Var.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int round = Math.round(this.n.f() * this.s);
        int round2 = Math.round(this.o.f() * this.s);
        int round3 = Math.round(this.l.f() * this.s);
        int i = round != 0 ? IronSourceError.ERROR_NON_EXISTENT_INSTANCE * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient j() {
        long i = i();
        LinearGradient h = this.e.h(i);
        if (h != null) {
            return h;
        }
        PointF h2 = this.n.h();
        PointF h3 = this.o.h();
        ql0 h4 = this.l.h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, f(h4.a()), h4.b(), Shader.TileMode.CLAMP);
        this.e.u(i, linearGradient);
        return linearGradient;
    }

    private RadialGradient k() {
        long i = i();
        RadialGradient h = this.f.h(i);
        if (h != null) {
            return h;
        }
        PointF h2 = this.n.h();
        PointF h3 = this.o.h();
        ql0 h4 = this.l.h();
        int[] f = f(h4.a());
        float[] b = h4.b();
        float f2 = h2.x;
        float f3 = h2.y;
        float hypot = (float) Math.hypot(h3.x - f2, h3.y - f3);
        RadialGradient radialGradient = new RadialGradient(f2, f3, hypot <= 0.0f ? 0.001f : hypot, f, b, Shader.TileMode.CLAMP);
        this.f.u(i, radialGradient);
        return radialGradient;
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.r.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            yi0 yi0Var = list2.get(i);
            if (yi0Var instanceof jj0) {
                this.j.add((jj0) yi0Var);
            }
        }
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        bp0.m(tk0Var, i, list, tk0Var2, this);
    }

    @Override // com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(this.j.get(i).getPath(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        Shader k;
        if (this.c) {
            return;
        }
        ci0.a("GradientFillContent#draw");
        this.g.reset();
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            this.g.addPath(this.j.get(i2).getPath(), matrix);
        }
        this.g.computeBounds(this.i, false);
        if (this.k == tl0.LINEAR) {
            k = j();
        } else {
            k = k();
        }
        k.setLocalMatrix(matrix);
        this.h.setShader(k);
        tj0<ColorFilter, ColorFilter> tj0Var = this.p;
        if (tj0Var != null) {
            this.h.setColorFilter(tj0Var.h());
        }
        tj0<Float, Float> tj0Var2 = this.t;
        if (tj0Var2 != null) {
            float floatValue = tj0Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.h.setMaskFilter(null);
            } else if (floatValue != this.u) {
                this.h.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.u = floatValue;
        }
        vj0 vj0Var = this.v;
        if (vj0Var != null) {
            vj0Var.b(this.h);
        }
        this.h.setAlpha(bp0.d((int) ((((i / 255.0f) * this.m.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.g, this.h);
        ci0.b("GradientFillContent#draw");
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        vj0 vj0Var;
        vj0 vj0Var2;
        vj0 vj0Var3;
        vj0 vj0Var4;
        vj0 vj0Var5;
        if (t == mi0.d) {
            this.m.n(np0Var);
        } else if (t == mi0.K) {
            tj0<ColorFilter, ColorFilter> tj0Var = this.p;
            if (tj0Var != null) {
                this.d.G(tj0Var);
            }
            if (np0Var == null) {
                this.p = null;
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.p = jk0Var;
            jk0Var.a(this);
            this.d.f(this.p);
        } else if (t == mi0.L) {
            jk0 jk0Var2 = this.q;
            if (jk0Var2 != null) {
                this.d.G(jk0Var2);
            }
            if (np0Var == null) {
                this.q = null;
                return;
            }
            this.e.b();
            this.f.b();
            jk0 jk0Var3 = new jk0(np0Var);
            this.q = jk0Var3;
            jk0Var3.a(this);
            this.d.f(this.q);
        } else if (t == mi0.j) {
            tj0<Float, Float> tj0Var2 = this.t;
            if (tj0Var2 != null) {
                tj0Var2.n(np0Var);
                return;
            }
            jk0 jk0Var4 = new jk0(np0Var);
            this.t = jk0Var4;
            jk0Var4.a(this);
            this.d.f(this.t);
        } else if (t == mi0.e && (vj0Var5 = this.v) != null) {
            vj0Var5.c(np0Var);
        } else if (t == mi0.G && (vj0Var4 = this.v) != null) {
            vj0Var4.f(np0Var);
        } else if (t == mi0.H && (vj0Var3 = this.v) != null) {
            vj0Var3.d(np0Var);
        } else if (t == mi0.I && (vj0Var2 = this.v) != null) {
            vj0Var2.e(np0Var);
        } else if (t != mi0.J || (vj0Var = this.v) == null) {
        } else {
            vj0Var.g(np0Var);
        }
    }
}