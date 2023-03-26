package com.p7700g.p99005;

import com.p7700g.p99005.wm3;

/* compiled from: OSRemoteParamController.java */
/* loaded from: classes3.dex */
public class nl3 {
    private wm3.f a = null;

    private void s(boolean z) {
        vm3.k(vm3.a, vm3.H, z);
    }

    private void u(boolean z) {
        vm3.k(vm3.a, vm3.B, this.a.h);
    }

    public void a() {
        this.a = null;
    }

    public boolean b() {
        return vm3.b(vm3.a, vm3.C, true);
    }

    public boolean c() {
        return vm3.b(vm3.a, vm3.A, false);
    }

    public wm3.f d() {
        return this.a;
    }

    public boolean e() {
        return vm3.b(vm3.a, vm3.x, false);
    }

    public boolean f() {
        wm3.f fVar = this.a;
        return (fVar == null || fVar.k == null) ? false : true;
    }

    public boolean g() {
        wm3.f fVar = this.a;
        return (fVar == null || fVar.m == null) ? false : true;
    }

    public boolean h() {
        wm3.f fVar = this.a;
        return (fVar == null || fVar.n == null) ? false : true;
    }

    public boolean i() {
        wm3.f fVar = this.a;
        return (fVar == null || fVar.l == null) ? false : true;
    }

    public boolean j() {
        return vm3.b(vm3.a, vm3.E, false);
    }

    public boolean k() {
        return vm3.b(vm3.a, vm3.G, true);
    }

    public boolean l() {
        return vm3.b(vm3.a, vm3.F, false);
    }

    public boolean m() {
        return vm3.b(vm3.a, vm3.H, false);
    }

    public boolean n() {
        return this.a != null;
    }

    public boolean o() {
        return vm3.b(vm3.a, vm3.B, true);
    }

    public void p(boolean z) {
        vm3.k(vm3.a, vm3.E, z);
    }

    public void q(boolean z) {
        vm3.k(vm3.a, vm3.G, z);
    }

    public void r(boolean z) {
        vm3.k(vm3.a, vm3.F, z);
    }

    public void t(wm3.f fVar, co3 co3Var, sl3 sl3Var, tk3 tk3Var) {
        this.a = fVar;
        String str = vm3.a;
        vm3.k(str, vm3.A, fVar.g);
        u(fVar.h);
        vm3.k(str, vm3.C, fVar.i);
        vm3.k(str, sl3Var.j(), fVar.o.h);
        s(fVar.j);
        StringBuilder G = wo1.G("OneSignal saveInfluenceParams: ");
        G.append(fVar.o.toString());
        tk3Var.b(G.toString());
        co3Var.j(fVar.o);
        Boolean bool = fVar.k;
        if (bool != null) {
            p(bool.booleanValue());
        }
        Boolean bool2 = fVar.l;
        if (bool2 != null) {
            v(bool2.booleanValue());
        }
        Boolean bool3 = fVar.m;
        if (bool3 != null) {
            jm3.v3(bool3.booleanValue());
        }
        Boolean bool4 = fVar.n;
        if (bool4 != null) {
            r(bool4.booleanValue());
        }
    }

    public void v(boolean z) {
        vm3.k(vm3.a, vm3.D, z);
    }

    public void w(boolean z) {
        vm3.k(vm3.a, vm3.x, z);
    }

    public boolean x() {
        return vm3.b(vm3.a, vm3.D, true);
    }
}