package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AbstractMapFactory.java */
/* loaded from: classes2.dex */
public abstract class b62<K, V, V2> implements h62<Map<K, V2>> {
    private final Map<K, ol4<V>> a;

    /* compiled from: AbstractMapFactory.java */
    /* loaded from: classes2.dex */
    public static abstract class a<K, V, V2> {
        public final LinkedHashMap<K, ol4<V>> a;

        public a(int i) {
            this.a = e62.d(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a<K, V, V2> a(K k, ol4<V> ol4Var) {
            this.a.put(q62.c(k, "key"), q62.c(ol4Var, IronSourceConstants.EVENTS_PROVIDER));
            return this;
        }

        public a<K, V, V2> b(ol4<Map<K, V2>> ol4Var) {
            if (!(ol4Var instanceof f62)) {
                this.a.putAll(((b62) ol4Var).a);
                return this;
            }
            return b(((f62) ol4Var).a());
        }
    }

    public b62(Map<K, ol4<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public final Map<K, ol4<V>> b() {
        return this.a;
    }
}