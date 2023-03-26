package com.p7700g.p99005;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialSharedAxis.java */
/* loaded from: classes3.dex */
public final class ck2 extends dk2<ik2> {
    public static final int S0 = 0;
    public static final int T0 = 1;
    public static final int U0 = 2;
    @q0
    private static final int V0 = ga2.c.Mb;
    @q0
    private static final int W0 = ga2.c.Wb;
    private final int X0;
    private final boolean Y0;

    /* compiled from: MaterialSharedAxis.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public ck2(int i, boolean z) {
        super(o1(i, z), p1());
        this.X0 = i;
        this.Y0 = z;
    }

    private static ik2 o1(int i, boolean z) {
        if (i == 0) {
            return new fk2(z ? nq.c : nq.b);
        } else if (i == 1) {
            return new fk2(z ? 80 : 48);
        } else if (i == 2) {
            return new ek2(z);
        } else {
            throw new IllegalArgumentException(wo1.l("Invalid axis: ", i));
        }
    }

    private static ik2 p1() {
        return new rj2();
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
    @q0
    public int h1(boolean z) {
        return V0;
    }

    @Override // com.p7700g.p99005.dk2
    @q0
    public int i1(boolean z) {
        return W0;
    }

    @Override // com.p7700g.p99005.dk2
    @x1
    public /* bridge */ /* synthetic */ ik2 j1() {
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

    public int q1() {
        return this.X0;
    }

    public boolean r1() {
        return this.Y0;
    }
}