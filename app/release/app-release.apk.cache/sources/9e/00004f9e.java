package com.p7700g.p99005;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes2.dex */
public final class m02<K, V> extends q7<K, V> {
    private int F;

    @Override // com.p7700g.p99005.y7, java.util.Map
    public void clear() {
        this.F = 0;
        super.clear();
    }

    @Override // com.p7700g.p99005.y7, java.util.Map
    public int hashCode() {
        if (this.F == 0) {
            this.F = super.hashCode();
        }
        return this.F;
    }

    @Override // com.p7700g.p99005.y7
    public void o(y7<? extends K, ? extends V> y7Var) {
        this.F = 0;
        super.o(y7Var);
    }

    @Override // com.p7700g.p99005.y7
    public V p(int i) {
        this.F = 0;
        return (V) super.p(i);
    }

    @Override // com.p7700g.p99005.y7, java.util.Map
    public V put(K k, V v) {
        this.F = 0;
        return (V) super.put(k, v);
    }

    @Override // com.p7700g.p99005.y7
    public V q(int i, V v) {
        this.F = 0;
        return (V) super.q(i, v);
    }
}