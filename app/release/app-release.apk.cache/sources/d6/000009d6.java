package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a<K, V> extends HashMap<K, V> {
    private ReferenceQueue<V> a = new ReferenceQueue<>();
    private HashMap<K, a<K, V>.C0078a<K, V>> b = new HashMap<>();

    /* renamed from: com.anythink.expressad.video.dynview.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0078a<K, V> extends SoftReference<V> {
        public K a;

        public C0078a(K k, V v, ReferenceQueue referenceQueue) {
            super(v, referenceQueue);
            this.a = k;
        }
    }

    private void a() {
        while (true) {
            C0078a c0078a = (C0078a) this.a.poll();
            if (c0078a == null) {
                return;
            }
            this.b.remove(c0078a.a);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0078a<K, V> c0078a = this.b.get(obj);
        if (c0078a == null) {
            return null;
        }
        return c0078a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        a();
        a<K, V>.C0078a<K, V> put = this.b.put(k, new C0078a<>(k, v, this.a));
        if (put == null) {
            return null;
        }
        return put.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0078a<K, V> remove = this.b.remove(obj);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.b.size();
    }
}