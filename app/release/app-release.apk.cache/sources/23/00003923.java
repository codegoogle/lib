package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialFade.java */
/* loaded from: classes3.dex */
public final class ak2 extends dk2<qj2> {
    private static final float S0 = 0.8f;
    private static final float T0 = 0.3f;
    @q0
    private static final int U0 = ga2.c.Rb;
    @q0
    private static final int V0 = ga2.c.Qb;
    @q0
    private static final int W0 = ga2.c.Vb;

    public ak2() {
        super(o1(), p1());
    }

    private static qj2 o1() {
        qj2 qj2Var = new qj2();
        qj2Var.e(0.3f);
        return qj2Var;
    }

    private static ik2 p1() {
        ek2 ek2Var = new ek2();
        ek2Var.o(false);
        ek2Var.l(S0);
        return ek2Var;
    }

    @Override // com.p7700g.p99005.dk2, com.p7700g.p99005.r90
    public /* bridge */ /* synthetic */ Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return super.U0(viewGroup, view, z80Var, z80Var2);
    }

    @Override // com.p7700g.p99005.dk2, com.p7700g.p99005.r90
    public /* bridge */ /* synthetic */ Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return super.W0(viewGroup, view, z80Var, z80Var2);
    }

    @Override // com.p7700g.p99005.dk2
    public /* bridge */ /* synthetic */ void a1(@x1 ik2 ik2Var) {
        super.a1(ik2Var);
    }

    @Override // com.p7700g.p99005.dk2
    public /* bridge */ /* synthetic */ void e1() {
        super.e1();
    }

    @Override // com.p7700g.p99005.dk2
    @x1
    public TimeInterpolator g1(boolean z) {
        return ha2.a;
    }

    @Override // com.p7700g.p99005.dk2
    @q0
    public int h1(boolean z) {
        if (z) {
            return U0;
        }
        return V0;
    }

    @Override // com.p7700g.p99005.dk2
    @q0
    public int i1(boolean z) {
        return W0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.qj2, com.p7700g.p99005.ik2] */
    @Override // com.p7700g.p99005.dk2
    @x1
    public /* bridge */ /* synthetic */ qj2 j1() {
        return super.j1();
    }

    @Override // com.p7700g.p99005.dk2
    @z1
    public /* bridge */ /* synthetic */ ik2 k1() {
        return super.k1();
    }

    @Override // com.p7700g.p99005.dk2
    public /* bridge */ /* synthetic */ boolean m1(@x1 ik2 ik2Var) {
        return super.m1(ik2Var);
    }

    @Override // com.p7700g.p99005.dk2
    public /* bridge */ /* synthetic */ void n1(@z1 ik2 ik2Var) {
        super.n1(ik2Var);
    }
}