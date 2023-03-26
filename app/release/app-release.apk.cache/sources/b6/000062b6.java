package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class vz<T> extends xz<T> {
    private l5<LiveData<?>, a<?>> m = new l5<>();

    /* compiled from: MediatorLiveData.java */
    /* loaded from: classes.dex */
    public static class a<V> implements yz<V> {
        public final LiveData<V> a;
        public final yz<? super V> b;
        public int c = -1;

        public a(LiveData<V> liveData, yz<? super V> yzVar) {
            this.a = liveData;
            this.b = yzVar;
        }

        @Override // com.p7700g.p99005.yz
        public void a(@z1 V v) {
            if (this.c != this.a.g()) {
                this.c = this.a.g();
                this.b.a(v);
            }
        }

        public void b() {
            this.a.k(this);
        }

        public void c() {
            this.a.o(this);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @t0
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @t0
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    @u1
    public <S> void r(@x1 LiveData<S> liveData, @x1 yz<? super S> yzVar) {
        a<?> aVar = new a<>(liveData, yzVar);
        a<?> f = this.m.f(liveData, aVar);
        if (f != null && f.b != yzVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (f == null && h()) {
            aVar.b();
        }
    }

    @u1
    public <S> void s(@x1 LiveData<S> liveData) {
        a<?> g = this.m.g(liveData);
        if (g != null) {
            g.c();
        }
    }
}