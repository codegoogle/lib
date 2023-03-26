package com.p7700g.p99005;

import com.p7700g.p99005.b62;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MapFactory.java */
/* loaded from: classes2.dex */
public final class m62<K, V> extends b62<K, V, V> {
    private static final ol4<Map<Object, Object>> b = k62.a(Collections.emptyMap());

    /* compiled from: MapFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends b62.a<K, V, V> {
        public m62<K, V> c() {
            return new m62<>(this.a);
        }

        @Override // com.p7700g.p99005.b62.a
        /* renamed from: d */
        public b<K, V> a(K k, ol4<V> ol4Var) {
            super.a(k, ol4Var);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.b62.a
        /* renamed from: e */
        public b<K, V> b(ol4<Map<K, V>> ol4Var) {
            super.b(ol4Var);
            return this;
        }

        private b(int i) {
            super(i);
        }
    }

    public static <K, V> b<K, V> c(int i) {
        return new b<>(i);
    }

    public static <K, V> ol4<Map<K, V>> d() {
        return (ol4<Map<K, V>>) b;
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: e */
    public Map<K, V> get() {
        LinkedHashMap d = e62.d(b().size());
        for (Map.Entry<K, ol4<V>> entry : b().entrySet()) {
            d.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d);
    }

    private m62(Map<K, ol4<V>> map) {
        super(map);
    }
}