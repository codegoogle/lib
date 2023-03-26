package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.r30;

/* compiled from: SortedListAdapterCallback.java */
/* loaded from: classes.dex */
public abstract class s30<T2> extends r30.b<T2> {
    public final RecyclerView.g s;

    public s30(RecyclerView.g gVar) {
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

    @Override // com.p7700g.p99005.r30.b, com.p7700g.p99005.i30
    public void f(int i, int i2, Object obj) {
        this.s.p(i, i2, obj);
    }

    @Override // com.p7700g.p99005.r30.b
    public void j(int i, int i2) {
        this.s.o(i, i2);
    }
}