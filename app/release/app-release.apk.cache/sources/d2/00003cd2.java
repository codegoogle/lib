package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class cj0 implements aj0, tj0.b, gj0 {
    private final Path a;
    private final Paint b;
    private final im0 c;
    private final String d;
    private final boolean e;
    private final List<jj0> f;
    private final tj0<Integer, Integer> g;
    private final tj0<Integer, Integer> h;
    @z1
    private tj0<ColorFilter, ColorFilter> i;
    private final hi0 j;
    @z1
    private tj0<Float, Float> k;
    public float l;
    @z1
    private vj0 m;

    public cj0(hi0 hi0Var, im0 im0Var, bm0 bm0Var) {
        Path path = new Path();
        this.a = path;
        this.b = new vi0(1);
        this.f = new ArrayList();
        this.c = im0Var;
        this.d = bm0Var.d();
        this.e = bm0Var.f();
        this.j = hi0Var;
        if (im0Var.u() != null) {
            tj0<Float, Float> a = im0Var.u().a().a();
            this.k = a;
            a.a(this);
            im0Var.f(this.k);
        }
        if (im0Var.w() != null) {
            this.m = new vj0(this, im0Var, im0Var.w());
        }
        if (bm0Var.b() != null && bm0Var.e() != null) {
            path.setFillType(bm0Var.c());
            tj0<Integer, Integer> a2 = bm0Var.b().a();
            this.g = a2;
            a2.a(this);
            im0Var.f(a2);
            tj0<Integer, Integer> a3 = bm0Var.e().a();
            this.h = a3;
            a3.a(this);
            im0Var.f(a3);
            return;
        }
        this.g = null;
        this.h = null;
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        for (int i = 0; i < list2.size(); i++) {
            yi0 yi0Var = list2.get(i);
            if (yi0Var instanceof jj0) {
                this.f.add((jj0) yi0Var);
            }
        }
    }

    @Override // com.p7700g.p99005.uk0
    public void c(tk0 tk0Var, int i, List<tk0> list, tk0 tk0Var2) {
        bp0.m(tk0Var, i, list, tk0Var2, this);
    }

    @Override // com.p7700g.p99005.aj0
    public void e(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).getPath(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        ci0.a("FillContent#draw");
        this.b.setColor((bp0.d((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((uj0) this.g).p() & sr.s));
        tj0<ColorFilter, ColorFilter> tj0Var = this.i;
        if (tj0Var != null) {
            this.b.setColorFilter(tj0Var.h());
        }
        tj0<Float, Float> tj0Var2 = this.k;
        if (tj0Var2 != null) {
            float floatValue = tj0Var2.h().floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.l) {
                this.b.setMaskFilter(this.c.v(floatValue));
            }
            this.l = floatValue;
        }
        vj0 vj0Var = this.m;
        if (vj0Var != null) {
            vj0Var.b(this.b);
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        ci0.b("FillContent#draw");
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.d;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        vj0 vj0Var;
        vj0 vj0Var2;
        vj0 vj0Var3;
        vj0 vj0Var4;
        vj0 vj0Var5;
        if (t == mi0.a) {
            this.g.n(np0Var);
        } else if (t == mi0.d) {
            this.h.n(np0Var);
        } else if (t == mi0.K) {
            tj0<ColorFilter, ColorFilter> tj0Var = this.i;
            if (tj0Var != null) {
                this.c.G(tj0Var);
            }
            if (np0Var == null) {
                this.i = null;
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.i = jk0Var;
            jk0Var.a(this);
            this.c.f(this.i);
        } else if (t == mi0.j) {
            tj0<Float, Float> tj0Var2 = this.k;
            if (tj0Var2 != null) {
                tj0Var2.n(np0Var);
                return;
            }
            jk0 jk0Var2 = new jk0(np0Var);
            this.k = jk0Var2;
            jk0Var2.a(this);
            this.c.f(this.k);
        } else if (t == mi0.e && (vj0Var5 = this.m) != null) {
            vj0Var5.c(np0Var);
        } else if (t == mi0.G && (vj0Var4 = this.m) != null) {
            vj0Var4.f(np0Var);
        } else if (t == mi0.H && (vj0Var3 = this.m) != null) {
            vj0Var3.d(np0Var);
        } else if (t == mi0.I && (vj0Var2 = this.m) != null) {
            vj0Var2.e(np0Var);
        } else if (t != mi0.J || (vj0Var = this.m) == null) {
        } else {
            vj0Var.g(np0Var);
        }
    }
}