package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ik2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaterialVisibility.java */
/* loaded from: classes3.dex */
public abstract class dk2<P extends ik2> extends r90 {
    private final P P0;
    @z1
    private ik2 Q0;
    private final List<ik2> R0 = new ArrayList();

    public dk2(P p, @z1 ik2 ik2Var) {
        this.P0 = p;
        this.Q0 = ik2Var;
    }

    private static void b1(List<Animator> list, @z1 ik2 ik2Var, ViewGroup viewGroup, View view, boolean z) {
        Animator b;
        if (ik2Var == null) {
            return;
        }
        if (z) {
            b = ik2Var.a(viewGroup, view);
        } else {
            b = ik2Var.b(viewGroup, view);
        }
        if (b != null) {
            list.add(b);
        }
    }

    private Animator f1(@x1 ViewGroup viewGroup, @x1 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b1(arrayList, this.P0, viewGroup, view, z);
        b1(arrayList, this.Q0, viewGroup, view, z);
        for (ik2 ik2Var : this.R0) {
            b1(arrayList, ik2Var, viewGroup, view, z);
        }
        l1(viewGroup.getContext(), z);
        ia2.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void l1(@x1 Context context, boolean z) {
        hk2.q(this, context, h1(z));
        hk2.r(this, context, i1(z), g1(z));
    }

    @Override // com.p7700g.p99005.r90
    public Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return f1(viewGroup, view, true);
    }

    @Override // com.p7700g.p99005.r90
    public Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return f1(viewGroup, view, false);
    }

    public void a1(@x1 ik2 ik2Var) {
        this.R0.add(ik2Var);
    }

    public void e1() {
        this.R0.clear();
    }

    @x1
    public TimeInterpolator g1(boolean z) {
        return ha2.b;
    }

    @q0
    public int h1(boolean z) {
        return 0;
    }

    @q0
    public int i1(boolean z) {
        return 0;
    }

    @x1
    public P j1() {
        return this.P0;
    }

    @z1
    public ik2 k1() {
        return this.Q0;
    }

    public boolean m1(@x1 ik2 ik2Var) {
        return this.R0.remove(ik2Var);
    }

    public void n1(@z1 ik2 ik2Var) {
        this.Q0 = ik2Var;
    }
}