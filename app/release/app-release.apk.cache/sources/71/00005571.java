package com.p7700g.p99005;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class p30 extends RecyclerView.l {
    private static final boolean l = false;
    private static final String m = "SimpleItemAnimator";
    public boolean n = true;

    public abstract boolean D(RecyclerView.f0 f0Var);

    public abstract boolean E(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i, int i2, int i3, int i4);

    public abstract boolean F(RecyclerView.f0 f0Var, int i, int i2, int i3, int i4);

    public abstract boolean G(RecyclerView.f0 f0Var);

    public final void H(RecyclerView.f0 f0Var) {
        Q(f0Var);
        h(f0Var);
    }

    public final void I(RecyclerView.f0 f0Var) {
        R(f0Var);
    }

    public final void J(RecyclerView.f0 f0Var, boolean z) {
        S(f0Var, z);
        h(f0Var);
    }

    public final void K(RecyclerView.f0 f0Var, boolean z) {
        T(f0Var, z);
    }

    public final void L(RecyclerView.f0 f0Var) {
        U(f0Var);
        h(f0Var);
    }

    public final void M(RecyclerView.f0 f0Var) {
        V(f0Var);
    }

    public final void N(RecyclerView.f0 f0Var) {
        W(f0Var);
        h(f0Var);
    }

    public final void O(RecyclerView.f0 f0Var) {
        X(f0Var);
    }

    public boolean P() {
        return this.n;
    }

    public void Q(RecyclerView.f0 f0Var) {
    }

    public void R(RecyclerView.f0 f0Var) {
    }

    public void S(RecyclerView.f0 f0Var, boolean z) {
    }

    public void T(RecyclerView.f0 f0Var, boolean z) {
    }

    public void U(RecyclerView.f0 f0Var) {
    }

    public void V(RecyclerView.f0 f0Var) {
    }

    public void W(RecyclerView.f0 f0Var) {
    }

    public void X(RecyclerView.f0 f0Var) {
    }

    public void Y(boolean z) {
        this.n = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(@x1 RecyclerView.f0 f0Var, @z1 RecyclerView.l.d dVar, @x1 RecyclerView.l.d dVar2) {
        int i;
        int i2;
        if (dVar != null && ((i = dVar.a) != (i2 = dVar2.a) || dVar.b != dVar2.b)) {
            return F(f0Var, i, dVar.b, i2, dVar2.b);
        }
        return D(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(@x1 RecyclerView.f0 f0Var, @x1 RecyclerView.f0 f0Var2, @x1 RecyclerView.l.d dVar, @x1 RecyclerView.l.d dVar2) {
        int i;
        int i2;
        int i3 = dVar.a;
        int i4 = dVar.b;
        if (f0Var2.K()) {
            int i5 = dVar.a;
            i2 = dVar.b;
            i = i5;
        } else {
            i = dVar2.a;
            i2 = dVar2.b;
        }
        return E(f0Var, f0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(@x1 RecyclerView.f0 f0Var, @x1 RecyclerView.l.d dVar, @z1 RecyclerView.l.d dVar2) {
        int i = dVar.a;
        int i2 = dVar.b;
        View view = f0Var.p;
        int left = dVar2 == null ? view.getLeft() : dVar2.a;
        int top = dVar2 == null ? view.getTop() : dVar2.b;
        if (!f0Var.w() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return F(f0Var, i, i2, left, top);
        }
        return G(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(@x1 RecyclerView.f0 f0Var, @x1 RecyclerView.l.d dVar, @x1 RecyclerView.l.d dVar2) {
        int i = dVar.a;
        int i2 = dVar2.a;
        if (i == i2 && dVar.b == dVar2.b) {
            L(f0Var);
            return false;
        }
        return F(f0Var, i, dVar.b, i2, dVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(@x1 RecyclerView.f0 f0Var) {
        return !this.n || f0Var.u();
    }
}