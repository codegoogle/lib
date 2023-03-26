package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.fl2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaterialVisibility.java */
@e2(21)
/* loaded from: classes3.dex */
public abstract class al2<P extends fl2> extends Visibility {
    private final P s;
    @z1
    private fl2 t;
    private final List<fl2> u = new ArrayList();

    public al2(P p, @z1 fl2 fl2Var) {
        this.s = p;
        this.t = fl2Var;
    }

    private static void b(List<Animator> list, @z1 fl2 fl2Var, ViewGroup viewGroup, View view, boolean z) {
        Animator b;
        if (fl2Var == null) {
            return;
        }
        if (z) {
            b = fl2Var.a(viewGroup, view);
        } else {
            b = fl2Var.b(viewGroup, view);
        }
        if (b != null) {
            list.add(b);
        }
    }

    private Animator d(@x1 ViewGroup viewGroup, @x1 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.s, viewGroup, view, z);
        b(arrayList, this.t, viewGroup, view, z);
        for (fl2 fl2Var : this.u) {
            b(arrayList, fl2Var, viewGroup, view, z);
        }
        n(viewGroup.getContext(), z);
        ia2.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void n(@x1 Context context, boolean z) {
        el2.q(this, context, f(z));
        el2.r(this, context, g(z), e(z));
    }

    public void a(@x1 fl2 fl2Var) {
        this.u.add(fl2Var);
    }

    public void c() {
        this.u.clear();
    }

    @x1
    public TimeInterpolator e(boolean z) {
        return ha2.b;
    }

    @q0
    public int f(boolean z) {
        return 0;
    }

    @q0
    public int g(boolean z) {
        return 0;
    }

    @x1
    public P h() {
        return this.s;
    }

    @z1
    public fl2 i() {
        return this.t;
    }

    public boolean o(@x1 fl2 fl2Var) {
        return this.u.remove(fl2Var);
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }

    public void p(@z1 fl2 fl2Var) {
        this.t = fl2Var;
    }
}