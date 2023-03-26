package com.p7700g.p99005;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultConcurrentHashMap.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/vz2;", "K", bx.C4, "Ljava/util/concurrent/ConcurrentHashMap;", "key", "defaultValue", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "", "containsKey", "(Ljava/lang/Object;)Z", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class vz2<K, V> extends ConcurrentHashMap<K, V> {
    public final V a(K k, V v) {
        if (containsKey(k)) {
            V v2 = get(k);
            c25.m(v2);
            return v2;
        }
        return v;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) h();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> h() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> i() {
        return super.keySet();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) i();
    }

    public /* bridge */ int m() {
        return super.size();
    }

    public /* bridge */ Collection<Object> n() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        return (V) super.put(k, v);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) n();
    }
}