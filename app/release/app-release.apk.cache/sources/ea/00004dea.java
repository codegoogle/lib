package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.i2;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class l5<K, V> implements Iterable<Map.Entry<K, V>> {
    public c<K, V> s;
    private c<K, V> t;
    private WeakHashMap<f<K, V>, Boolean> u = new WeakHashMap<>();
    private int v = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.p7700g.p99005.l5.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.v;
        }

        @Override // com.p7700g.p99005.l5.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.u;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // com.p7700g.p99005.l5.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.u;
        }

        @Override // com.p7700g.p99005.l5.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.v;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {
        @x1
        public final K s;
        @x1
        public final V t;
        public c<K, V> u;
        public c<K, V> v;

        public c(@x1 K k, @x1 V v) {
            this.s = k;
            this.t = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.s.equals(cVar.s) && this.t.equals(cVar.t);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        @x1
        public K getKey() {
            return this.s;
        }

        @Override // java.util.Map.Entry
        @x1
        public V getValue() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.s.hashCode() ^ this.t.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.s + AppCenter.KEY_VALUE_DELIMITER + this.t;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        private c<K, V> s;
        private boolean t = true;

        public d() {
        }

        @Override // com.p7700g.p99005.l5.f
        public void a(@x1 c<K, V> cVar) {
            c<K, V> cVar2 = this.s;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.v;
                this.s = cVar3;
                this.t = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.t) {
                this.t = false;
                this.s = l5.this.s;
            } else {
                c<K, V> cVar = this.s;
                this.s = cVar != null ? cVar.u : null;
            }
            return this.s;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.t) {
                return l5.this.s != null;
            }
            c<K, V> cVar = this.s;
            return (cVar == null || cVar.u == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        public c<K, V> s;
        public c<K, V> t;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.s = cVar2;
            this.t = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.t;
            c<K, V> cVar2 = this.s;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // com.p7700g.p99005.l5.f
        public void a(@x1 c<K, V> cVar) {
            if (this.s == cVar && cVar == this.t) {
                this.t = null;
                this.s = null;
            }
            c<K, V> cVar2 = this.s;
            if (cVar2 == cVar) {
                this.s = b(cVar2);
            }
            if (this.t == cVar) {
                this.t = e();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.t;
            this.t = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.t != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(@x1 c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.s;
    }

    public c<K, V> b(K k) {
        c<K, V> cVar = this.s;
        while (cVar != null && !cVar.s.equals(k)) {
            cVar = cVar.u;
        }
        return cVar;
    }

    public l5<K, V>.d c() {
        l5<K, V>.d dVar = new d();
        this.u.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.t;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        b bVar = new b(this.t, this.s);
        this.u.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c<K, V> e(@x1 K k, @x1 V v) {
        c<K, V> cVar = new c<>(k, v);
        this.v++;
        c<K, V> cVar2 = this.t;
        if (cVar2 == null) {
            this.s = cVar;
            this.t = cVar;
            return cVar;
        }
        cVar2.u = cVar;
        cVar.v = cVar2;
        this.t = cVar;
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            if (size() != l5Var.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it = iterator();
            Iterator<Map.Entry<K, V>> it2 = l5Var.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry<K, V> next = it.next();
                Map.Entry<K, V> next2 = it2.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public V f(@x1 K k, @x1 V v) {
        c<K, V> b2 = b(k);
        if (b2 != null) {
            return b2.t;
        }
        e(k, v);
        return null;
    }

    public V g(@x1 K k) {
        c<K, V> b2 = b(k);
        if (b2 == null) {
            return null;
        }
        this.v--;
        if (!this.u.isEmpty()) {
            for (f<K, V> fVar : this.u.keySet()) {
                fVar.a(b2);
            }
        }
        c<K, V> cVar = b2.v;
        if (cVar != null) {
            cVar.u = b2.u;
        } else {
            this.s = b2.u;
        }
        c<K, V> cVar2 = b2.u;
        if (cVar2 != null) {
            cVar2.v = cVar;
        } else {
            this.t = cVar;
        }
        b2.u = null;
        b2.v = null;
        return b2.t;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    @x1
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.s, this.t);
        this.u.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.v;
    }

    public String toString() {
        StringBuilder G = wo1.G("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            G.append(it.next().toString());
            if (it.hasNext()) {
                G.append(", ");
            }
        }
        G.append("]");
        return G.toString();
    }
}