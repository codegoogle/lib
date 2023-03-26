package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
@e2(21)
/* loaded from: classes.dex */
public class k7 implements n7 {
    private o7 p(m7 m7Var) {
        return (o7) m7Var.f();
    }

    @Override // com.p7700g.p99005.n7
    public void a(m7 m7Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        m7Var.c(new o7(colorStateList, f));
        View g = m7Var.g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        o(m7Var, f3);
    }

    @Override // com.p7700g.p99005.n7
    public void b(m7 m7Var, float f) {
        p(m7Var).h(f);
    }

    @Override // com.p7700g.p99005.n7
    public float c(m7 m7Var) {
        return m7Var.g().getElevation();
    }

    @Override // com.p7700g.p99005.n7
    public float d(m7 m7Var) {
        return p(m7Var).d();
    }

    @Override // com.p7700g.p99005.n7
    public void e(m7 m7Var) {
        o(m7Var, g(m7Var));
    }

    @Override // com.p7700g.p99005.n7
    public void f(m7 m7Var, float f) {
        m7Var.g().setElevation(f);
    }

    @Override // com.p7700g.p99005.n7
    public float g(m7 m7Var) {
        return p(m7Var).c();
    }

    @Override // com.p7700g.p99005.n7
    public ColorStateList h(m7 m7Var) {
        return p(m7Var).b();
    }

    @Override // com.p7700g.p99005.n7
    public void i(m7 m7Var) {
        if (!m7Var.e()) {
            m7Var.a(0, 0, 0, 0);
            return;
        }
        float g = g(m7Var);
        float d = d(m7Var);
        int ceil = (int) Math.ceil(p7.c(g, d, m7Var.d()));
        int ceil2 = (int) Math.ceil(p7.d(g, d, m7Var.d()));
        m7Var.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.p7700g.p99005.n7
    public void j() {
    }

    @Override // com.p7700g.p99005.n7
    public float k(m7 m7Var) {
        return d(m7Var) * 2.0f;
    }

    @Override // com.p7700g.p99005.n7
    public float l(m7 m7Var) {
        return d(m7Var) * 2.0f;
    }

    @Override // com.p7700g.p99005.n7
    public void m(m7 m7Var) {
        o(m7Var, g(m7Var));
    }

    @Override // com.p7700g.p99005.n7
    public void n(m7 m7Var, @z1 ColorStateList colorStateList) {
        p(m7Var).f(colorStateList);
    }

    @Override // com.p7700g.p99005.n7
    public void o(m7 m7Var, float f) {
        p(m7Var).g(f, m7Var.e(), m7Var.d());
        i(m7Var);
    }
}