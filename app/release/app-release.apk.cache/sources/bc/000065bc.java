package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialFade.java */
@e2(21)
/* loaded from: classes3.dex */
public final class xk2 extends al2<mk2> {
    private static final float v = 0.8f;
    private static final float w = 0.3f;
    @q0
    private static final int x = ga2.c.Rb;
    @q0
    private static final int y = ga2.c.Qb;
    @q0
    private static final int z = ga2.c.Vb;

    public xk2() {
        super(t(), u());
    }

    private static mk2 t() {
        mk2 mk2Var = new mk2();
        mk2Var.e(0.3f);
        return mk2Var;
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
    @x1
    public TimeInterpolator e(boolean z2) {
        return ha2.a;
    }

    @Override // com.p7700g.p99005.al2
    @q0
    public int f(boolean z2) {
        if (z2) {
            return x;
        }
        return y;
    }

    @Override // com.p7700g.p99005.al2
    @q0
    public int g(boolean z2) {
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.fl2, com.p7700g.p99005.mk2] */
    @Override // com.p7700g.p99005.al2
    @x1
    public /* bridge */ /* synthetic */ mk2 h() {
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