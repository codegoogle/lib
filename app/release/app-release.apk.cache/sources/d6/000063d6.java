package com.p7700g.p99005;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MaterialElevationScale.java */
@e2(21)
/* loaded from: classes3.dex */
public final class wk2 extends al2<bl2> {
    private static final float v = 0.85f;
    private final boolean w;

    public wk2(boolean z) {
        super(t(z), u());
        this.w = z;
    }

    private static bl2 t(boolean z) {
        bl2 bl2Var = new bl2(z);
        bl2Var.m(v);
        bl2Var.l(v);
        return bl2Var;
    }

    private static fl2 u() {
        return new mk2();
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ void a(@x1 fl2 fl2Var) {
        super.a(fl2Var);
    }

    @Override // com.p7700g.p99005.al2
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.p7700g.p99005.fl2, com.p7700g.p99005.bl2] */
    @Override // com.p7700g.p99005.al2
    @x1
    public /* bridge */ /* synthetic */ bl2 h() {
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

    public boolean x() {
        return this.w;
    }
}