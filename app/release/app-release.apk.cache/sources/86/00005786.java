package com.p7700g.p99005;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class q7<K, V> extends y7<K, V> implements Map<K, V> {
    @z1
    public x7<K, V> E;

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    public class a extends x7<K, V> {
        public a() {
        }

        @Override // com.p7700g.p99005.x7
        public void a() {
            q7.this.clear();
        }

        @Override // com.p7700g.p99005.x7
        public Object b(int i, int i2) {
            return q7.this.C[(i << 1) + i2];
        }

        @Override // com.p7700g.p99005.x7
        public Map<K, V> c() {
            return q7.this;
        }

        @Override // com.p7700g.p99005.x7
        public int d() {
            return q7.this.D;
        }

        @Override // com.p7700g.p99005.x7
        public int e(Object obj) {
            return q7.this.k(obj);
        }

        @Override // com.p7700g.p99005.x7
        public int f(Object obj) {
            return q7.this.m(obj);
        }

        @Override // com.p7700g.p99005.x7
        public void g(K k, V v) {
            q7.this.put(k, v);
        }

        @Override // com.p7700g.p99005.x7
        public void h(int i) {
            q7.this.p(i);
        }

        @Override // com.p7700g.p99005.x7
        public V i(int i, V v) {
            return q7.this.q(i, v);
        }
    }

    public q7() {
    }

    private x7<K, V> t() {
        if (this.E == null) {
            this.E = new a();
        }
        return this.E;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return t().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return t().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        h(map.size() + this.D);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean s(@x1 Collection<?> collection) {
        return x7.j(this, collection);
    }

    public boolean u(@x1 Collection<?> collection) {
        return x7.o(this, collection);
    }

    public boolean v(@x1 Collection<?> collection) {
        return x7.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return t().n();
    }

    public q7(int i) {
        super(i);
    }

    public q7(y7 y7Var) {
        super(y7Var);
    }
}