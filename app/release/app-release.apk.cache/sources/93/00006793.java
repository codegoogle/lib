package com.p7700g.p99005;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialFadeThrough.java */
@e2(21)
/* loaded from: classes3.dex */
public final class yk2 extends al2<nk2> {
    private static final float v = 0.92f;
    @q0
    private static final int w = ga2.c.Mb;
    @q0
    private static final int x = ga2.c.Wb;

    public yk2() {
        super(t(), u());
    }

    private static nk2 t() {
        return new nk2();
    }

    private static fl2 u() {
        bl2 bl2Var = new bl2();
        bl2Var.o(false);
        bl2Var.l(v);
        return bl2Var;
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ void a(@x1 fl2 fl2Var) {
        super.a(fl2Var);
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.p7700g.p99005.al2
    @q0
    public int f(boolean z) {
        return w;
    }

    @Override // com.p7700g.p99005.al2
    @q0
    public int g(boolean z) {
        return x;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.fl2, com.p7700g.p99005.nk2] */
    @Override // com.p7700g.p99005.al2
    @x1
    public /* bridge */ /* synthetic */ nk2 h() {
        return super.h();
    }

    @Override // com.p7700g.p99005.al2
    @z1
    public /* bridge */ /* synthetic */ fl2 i() {
        return super.i();
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ boolean o(@x1 fl2 fl2Var) {
        return super.o(fl2Var);
    }

    @Override // com.p7700g.p99005.al2, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.p7700g.p99005.al2, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ void p(@z1 fl2 fl2Var) {
        super.p(fl2Var);
    }
}