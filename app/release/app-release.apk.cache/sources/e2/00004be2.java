package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.l5;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class k5<K, V> extends l5<K, V> {
    private HashMap<K, l5.c<K, V>> w = new HashMap<>();

    @Override // com.p7700g.p99005.l5
    public l5.c<K, V> b(K k) {
        return this.w.get(k);
    }

    public boolean contains(K k) {
        return this.w.containsKey(k);
    }

    @Override // com.p7700g.p99005.l5
    public V f(@x1 K k, @x1 V v) {
        l5.c<K, V> b = b(k);
        if (b != null) {
            return b.t;
        }
        this.w.put(k, e(k, v));
        return null;
    }

    @Override // com.p7700g.p99005.l5
    public V g(@x1 K k) {
        V v = (V) super.g(k);
        this.w.remove(k);
        return v;
    }

    public Map.Entry<K, V> h(K k) {
        if (contains(k)) {
            return this.w.get(k).v;
        }
        return null;
    }
}