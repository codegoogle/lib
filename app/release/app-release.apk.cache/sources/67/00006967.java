package com.p7700g.p99005;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: MaterialSharedAxis.java */
@e2(21)
/* loaded from: classes3.dex */
public final class zk2 extends al2<fl2> {
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    @q0
    private static final int y = ga2.c.Mb;
    @q0
    private static final int z = ga2.c.Wb;
    private final int A;
    private final boolean B;

    /* compiled from: MaterialSharedAxis.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public zk2(int i, boolean z2) {
        super(t(i, z2), u());
        this.A = i;
        this.B = z2;
    }

    private static fl2 t(int i, boolean z2) {
        if (i == 0) {
            return new cl2(z2 ? nq.c : nq.b);
        } else if (i == 1) {
            return new cl2(z2 ? 80 : 48);
        } else if (i == 2) {
            return new bl2(z2);
        } else {
            throw new IllegalArgumentException(wo1.l("Invalid axis: ", i));
        }
    }

    private static fl2 u() {
        return new nk2();
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
    public int f(boolean z2) {
        return y;
    }

    @Override // com.p7700g.p99005.al2
    @q0
    public int g(boolean z2) {
        return z;
    }

    @Override // com.p7700g.p99005.al2
    @x1
    public /* bridge */ /* synthetic */ fl2 h() {
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

    public int x() {
        return this.A;
    }

    public boolean y() {
        return this.B;
    }
}