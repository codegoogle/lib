package com.p7700g.p99005;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MaterialElevationScale.java */
/* loaded from: classes3.dex */
public final class zj2 extends dk2<ek2> {
    private static final float S0 = 0.85f;
    private final boolean T0;

    public zj2(boolean z) {
        super(o1(z), p1());
        this.T0 = z;
    }

    private static ek2 o1(boolean z) {
        ek2 ek2Var = new ek2(z);
        ek2Var.m(S0);
        ek2Var.l(S0);
        return ek2Var;
    }

    private static ik2 p1() {
        return new qj2();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.ek2, com.p7700g.p99005.ik2] */
    @Override // com.p7700g.p99005.dk2
    @x1
    public /* bridge */ /* synthetic */ ek2 j1() {
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

    public boolean q1() {
        return this.T0;
    }
}