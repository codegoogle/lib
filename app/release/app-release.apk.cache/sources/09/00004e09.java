package com.p7700g.p99005;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes2.dex */
public final class l62<K, V> {
    private final Map<K, V> a;

    private l62(int i) {
        this.a = e62.d(i);
    }

    public static <K, V> l62<K, V> b(int i) {
        return new l62<>(i);
    }

    public Map<K, V> a() {
        if (this.a.size() != 0) {
            return Collections.unmodifiableMap(this.a);
        }
        return Collections.emptyMap();
    }

    public l62<K, V> c(K k, V v) {
        this.a.put(k, v);
        return this;
    }

    public l62<K, V> d(Map<K, V> map) {
        this.a.putAll(map);
        return this;
    }
}