package com.p7700g.p99005;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: UnmodifiableMultivaluedMap.java */
/* loaded from: classes3.dex */
public class px3<K, V> implements um4<K, V> {
    private final um4<K, V> s;

    public px3(um4<K, V> um4Var) {
        this.s = um4Var;
    }

    @Override // java.util.Map
    /* renamed from: a */
    public List<V> get(Object obj) {
        return (List) this.s.get(obj);
    }

    @Override // com.p7700g.p99005.um4
    public V b(K k) {
        return this.s.b(k);
    }

    @Override // com.p7700g.p99005.um4
    public void c(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.s.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.s.containsValue(obj);
    }

    @Override // com.p7700g.p99005.um4
    public void d(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: e */
    public List<V> put(K k, List<V> list) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, List<V>>> entrySet() {
        return Collections.unmodifiableSet(this.s.entrySet());
    }

    @Override // java.util.Map
    /* renamed from: h */
    public List<V> remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return Collections.unmodifiableSet(this.s.keySet());
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends List<V>> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.s.size();
    }

    @Override // java.util.Map
    public Collection<List<V>> values() {
        return Collections.unmodifiableCollection(this.s.values());
    }
}