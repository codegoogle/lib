package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f0;
import com.p7700g.p99005.r20;
import com.p7700g.p99005.s20;
import com.p7700g.p99005.x20;
import java.util.List;

/* compiled from: ListAdapter.java */
/* loaded from: classes.dex */
public abstract class h30<T, VH extends RecyclerView.f0> extends RecyclerView.g<VH> {
    public final s20<T> c;
    private final s20.b<T> d;

    /* compiled from: ListAdapter.java */
    /* loaded from: classes.dex */
    public class a implements s20.b<T> {
        public a() {
        }

        @Override // com.p7700g.p99005.s20.b
        public void a(@x1 List<T> list, @x1 List<T> list2) {
            h30.this.H(list, list2);
        }
    }

    public h30(@x1 x20.d<T> dVar) {
        a aVar = new a();
        this.d = aVar;
        s20<T> s20Var = new s20<>(new q20(this), new r20.a(dVar).a());
        this.c = s20Var;
        s20Var.a(aVar);
    }

    @x1
    public List<T> F() {
        return this.c.b();
    }

    public T G(int i) {
        return this.c.b().get(i);
    }

    public void H(@x1 List<T> list, @x1 List<T> list2) {
    }

    public void I(@z1 List<T> list) {
        this.c.f(list);
    }

    public void J(@z1 List<T> list, @z1 Runnable runnable) {
        this.c.g(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.c.b().size();
    }

    public h30(@x1 r20<T> r20Var) {
        a aVar = new a();
        this.d = aVar;
        s20<T> s20Var = new s20<>(new q20(this), r20Var);
        this.c = s20Var;
        s20Var.a(aVar);
    }
}