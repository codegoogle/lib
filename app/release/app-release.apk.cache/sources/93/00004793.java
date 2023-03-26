package com.p7700g.p99005;

import android.graphics.drawable.Drawable;

/* compiled from: CustomTarget.java */
/* loaded from: classes2.dex */
public abstract class hz1<T> implements sz1<T> {
    private final int s;
    private final int t;
    @z1
    private vy1 u;

    public hz1() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.p7700g.p99005.sz1
    public final void b(@x1 rz1 rz1Var) {
    }

    @Override // com.p7700g.p99005.sz1
    public final void j(@z1 vy1 vy1Var) {
        this.u = vy1Var;
    }

    @Override // com.p7700g.p99005.sz1
    public void k(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    public void l(@z1 Drawable drawable) {
    }

    @Override // com.p7700g.p99005.sz1
    @z1
    public final vy1 m() {
        return this.u;
    }

    @Override // com.p7700g.p99005.wx1
    public void onDestroy() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStart() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStop() {
    }

    @Override // com.p7700g.p99005.sz1
    public final void q(@x1 rz1 rz1Var) {
        rz1Var.e(this.s, this.t);
    }

    public hz1(int i, int i2) {
        if (z02.w(i, i2)) {
            this.s = i;
            this.t = i2;
            return;
        }
        throw new IllegalArgumentException(wo1.o("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2));
    }
}