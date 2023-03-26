package com.p7700g.p99005;

import com.p7700g.p99005.b62;
import java.util.Map;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes2.dex */
public final class n62<K, V> extends b62<K, V, ol4<V>> implements u52<Map<K, ol4<V>>> {

    /* compiled from: MapProviderFactory.java */
    /* loaded from: classes2.dex */
    public static final class b<K, V> extends b62.a<K, V, ol4<V>> {
        public n62<K, V> c() {
            return new n62<>(this.a);
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
        public b<K, V> b(ol4<Map<K, ol4<V>>> ol4Var) {
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

    @Override // com.p7700g.p99005.ol4
    /* renamed from: d */
    public Map<K, ol4<V>> get() {
        return b();
    }

    private n62(Map<K, ol4<V>> map) {
        super(map);
    }
}