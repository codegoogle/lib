package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback.java */
/* loaded from: classes.dex */
public final class q20 implements i30 {
    @x1
    private final RecyclerView.g s;

    public q20(@x1 RecyclerView.g gVar) {
        this.s = gVar;
    }

    @Override // com.p7700g.p99005.i30
    public void a(int i, int i2) {
        this.s.n(i, i2);
    }

    @Override // com.p7700g.p99005.i30
    public void b(int i, int i2) {
        this.s.q(i, i2);
    }

    @Override // com.p7700g.p99005.i30
    public void d(int i, int i2) {
        this.s.r(i, i2);
    }

    @Override // com.p7700g.p99005.i30
    public void f(int i, int i2, Object obj) {
        this.s.p(i, i2, obj);
    }
}