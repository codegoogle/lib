package com.p7700g.p99005;

import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public class rj0 implements yi0, tj0.b {
    private final String a;
    private final boolean b;
    private final List<tj0.b> c = new ArrayList();
    private final fm0.a d;
    private final tj0<?, Float> e;
    private final tj0<?, Float> f;
    private final tj0<?, Float> g;

    public rj0(im0 im0Var, fm0 fm0Var) {
        this.a = fm0Var.c();
        this.b = fm0Var.g();
        this.d = fm0Var.f();
        tj0<Float, Float> a = fm0Var.e().a();
        this.e = a;
        tj0<Float, Float> a2 = fm0Var.b().a();
        this.f = a2;
        tj0<Float, Float> a3 = fm0Var.d().a();
        this.g = a3;
        im0Var.f(a);
        im0Var.f(a2);
        im0Var.f(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a();
        }
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
    }

    public void c(tj0.b bVar) {
        this.c.add(bVar);
    }

    public tj0<?, Float> f() {
        return this.f;
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.a;
    }

    public tj0<?, Float> h() {
        return this.g;
    }

    public tj0<?, Float> i() {
        return this.e;
    }

    public fm0.a j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }
}