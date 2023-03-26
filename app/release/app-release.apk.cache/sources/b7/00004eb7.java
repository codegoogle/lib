package com.p7700g.p99005;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class lj0 implements tj0.b, gj0, jj0 {
    private final String c;
    private final boolean d;
    private final hi0 e;
    private final tj0<?, PointF> f;
    private final tj0<?, PointF> g;
    private final tj0<?, Float> h;
    private boolean k;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final xi0 i = new xi0();
    @z1
    private tj0<Float, Float> j = null;

    public lj0(hi0 hi0Var, im0 im0Var, xl0 xl0Var) {
        this.c = xl0Var.c();
        this.d = xl0Var.f();
        this.e = hi0Var;
        tj0<PointF, PointF> a = xl0Var.d().a();
        this.f = a;
        tj0<PointF, PointF> a2 = xl0Var.e().a();
        this.g = a2;
        tj0<Float, Float> a3 = xl0Var.b().a();
        this.h = a3;
        im0Var.f(a);
        im0Var.f(a2);
        im0Var.f(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    private void f() {
        this.k = false;
        this.e.invalidateSelf();
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
                    this.i.a(rj0Var);
                    rj0Var.c(this);
                }
            }
            if (yi0Var instanceof nj0) {
                this.j = ((nj0) yi0Var).h();
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
        tj0<Float, Float> tj0Var;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF h = this.g.h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        tj0<?, Float> tj0Var2 = this.h;
        float p = tj0Var2 == null ? 0.0f : ((wj0) tj0Var2).p();
        if (p == 0.0f && (tj0Var = this.j) != null) {
            p = Math.min(tj0Var.h().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (p > min) {
            p = min;
        }
        PointF h2 = this.f.h();
        this.a.moveTo(h2.x + f, (h2.y - f2) + p);
        this.a.lineTo(h2.x + f, (h2.y + f2) - p);
        int i = (p > 0.0f ? 1 : (p == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.b;
            float f3 = h2.x;
            float f4 = p * 2.0f;
            float f5 = h2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x - f) + p, h2.y + f2);
        if (i > 0) {
            RectF rectF2 = this.b;
            float f6 = h2.x;
            float f7 = h2.y;
            float f8 = p * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(h2.x - f, (h2.y - f2) + p);
        if (i > 0) {
            RectF rectF3 = this.b;
            float f9 = h2.x;
            float f10 = h2.y;
            float f11 = p * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((h2.x + f) - p, h2.y - f2);
        if (i > 0) {
            RectF rectF4 = this.b;
            float f12 = h2.x;
            float f13 = p * 2.0f;
            float f14 = h2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }

    @Override // com.p7700g.p99005.uk0
    public <T> void h(T t, @z1 np0<T> np0Var) {
        if (t == mi0.l) {
            this.g.n(np0Var);
        } else if (t == mi0.n) {
            this.f.n(np0Var);
        } else if (t == mi0.m) {
            this.h.n(np0Var);
        }
    }
}