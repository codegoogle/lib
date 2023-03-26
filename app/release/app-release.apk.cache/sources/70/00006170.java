package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes2.dex */
public class va2<V extends View> extends CoordinatorLayout.c<V> {
    private wa2 a;
    private int b;
    private int c;

    public va2() {
        this.b = 0;
        this.c = 0;
    }

    public int G() {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            return wa2Var.d();
        }
        return 0;
    }

    public int H() {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            return wa2Var.e();
        }
        return 0;
    }

    public boolean I() {
        wa2 wa2Var = this.a;
        return wa2Var != null && wa2Var.f();
    }

    public boolean J() {
        wa2 wa2Var = this.a;
        return wa2Var != null && wa2Var.g();
    }

    public void K(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i) {
        coordinatorLayout.H(v, i);
    }

    public void L(boolean z) {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            wa2Var.i(z);
        }
    }

    public boolean M(int i) {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            return wa2Var.j(i);
        }
        this.c = i;
        return false;
    }

    public boolean N(int i) {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            return wa2Var.k(i);
        }
        this.b = i;
        return false;
    }

    public void O(boolean z) {
        wa2 wa2Var = this.a;
        if (wa2Var != null) {
            wa2Var.l(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, int i) {
        K(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new wa2(v);
        }
        this.a.h();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.k(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.a.j(i3);
            this.c = 0;
            return true;
        }
        return true;
    }

    public va2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }
}