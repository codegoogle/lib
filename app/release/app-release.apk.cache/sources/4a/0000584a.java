package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public class qj0 extends wi0 {
    private final im0 r;
    private final String s;
    private final boolean t;
    private final tj0<Integer, Integer> u;
    @z1
    private tj0<ColorFilter, ColorFilter> v;

    public qj0(hi0 hi0Var, im0 im0Var, em0 em0Var) {
        super(hi0Var, im0Var, em0Var.b().f(), em0Var.e().f(), em0Var.g(), em0Var.i(), em0Var.j(), em0Var.f(), em0Var.d());
        this.r = im0Var;
        this.s = em0Var.h();
        this.t = em0Var.k();
        tj0<Integer, Integer> a = em0Var.c().a();
        this.u = a;
        a.a(this);
        im0Var.f(a);
    }

    @Override // com.p7700g.p99005.wi0, com.p7700g.p99005.aj0
    public void g(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        this.i.setColor(((uj0) this.u).p());
        tj0<ColorFilter, ColorFilter> tj0Var = this.v;
        if (tj0Var != null) {
            this.i.setColorFilter(tj0Var.h());
        }
        super.g(canvas, matrix, i);
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.s;
    }

    @Override // com.p7700g.p99005.wi0, com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        super.h(t, np0Var);
        if (t == mi0.b) {
            this.u.n(np0Var);
        } else if (t == mi0.K) {
            tj0<ColorFilter, ColorFilter> tj0Var = this.v;
            if (tj0Var != null) {
                this.r.G(tj0Var);
            }
            if (np0Var == null) {
                this.v = null;
                return;
            }
            jk0 jk0Var = new jk0(np0Var);
            this.v = jk0Var;
            jk0Var.a(this);
            this.r.f(this.u);
        }
    }
}