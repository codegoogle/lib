package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class bj0 implements jj0, tj0.b, gj0 {
    private static final float a = 0.55228f;
    private final String c;
    private final hi0 d;
    private final tj0<?, PointF> e;
    private final tj0<?, PointF> f;
    private final ol0 g;
    private boolean i;
    private final Path b = new Path();
    private final xi0 h = new xi0();

    public bj0(hi0 hi0Var, im0 im0Var, ol0 ol0Var) {
        this.c = ol0Var.b();
        this.d = hi0Var;
        tj0<PointF, PointF> a2 = ol0Var.d().a();
        this.e = a2;
        tj0<PointF, PointF> a3 = ol0Var.c().a();
        this.f = a3;
        this.g = ol0Var;
        im0Var.f(a2);
        im0Var.f(a3);
        a2.a(this);
        a3.a(this);
    }

    private void f() {
        this.i = false;
        this.d.invalidateSelf();
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        f();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        for (int i = 0; i < list.size(); i++) {
            yi0 yi0Var = list.get(i);
            if (yi0Var instanceof rj0) {
                rj0 rj0Var = (rj0) yi0Var;
                if (rj0Var.j() == fm0.a.SIMULTANEOUSLY) {
                    this.h.a(rj0Var);
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
        return this.c;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        if (this.i) {
            return this.b;
        }
        this.b.reset();
        if (this.g.e()) {
            this.i = true;
            return this.b;
        }
        PointF h = this.e.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * a;
        float f4 = a * f2;
        this.b.reset();
        if (this.g.f()) {
            float f5 = -f2;
            this.b.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.b.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.b.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.b.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.b.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.b.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.b.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.b.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.b.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.b.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF h2 = this.f.h();
        this.b.offset(h2.x, h2.y);
        this.b.close();
        this.h.b(this.b);
        this.i = true;
        return this.b;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        if (t == mi0.k) {
            this.e.n(np0Var);
        } else if (t == mi0.n) {
            this.f.n(np0Var);
        }
    }
}