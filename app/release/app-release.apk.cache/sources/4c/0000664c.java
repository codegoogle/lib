package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes3.dex */
public final class xw2<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> s = new a();
    public static final /* synthetic */ boolean t = false;
    private xw2<K, V>.c A;
    public Comparator<? super K> u;
    public e<K, V> v;
    public int w;
    public int x;
    public final e<K, V> y;
    private xw2<K, V>.b z;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        public class a extends xw2<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            xw2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && xw2.this.h((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> h;
            if ((obj instanceof Map.Entry) && (h = xw2.this.h((Map.Entry) obj)) != null) {
                xw2.this.o(h, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return xw2.this.w;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        public class a extends xw2<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().x;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            xw2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return xw2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return xw2.this.p(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return xw2.this.w;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public abstract class d<T> implements Iterator<T> {
        public e<K, V> s;
        public e<K, V> t = null;
        public int u;

        public d() {
            this.s = xw2.this.y.v;
            this.u = xw2.this.x;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.s;
            xw2 xw2Var = xw2.this;
            if (eVar != xw2Var.y) {
                if (xw2Var.x == this.u) {
                    this.s = eVar.v;
                    this.t = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.s != xw2.this.y;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.t;
            if (eVar != null) {
                xw2.this.o(eVar, true);
                this.t = null;
                this.u = xw2.this.x;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public xw2() {
        this(s);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void m(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private void n(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.t;
            e<K, V> eVar3 = eVar.u;
            int i = eVar2 != null ? eVar2.z : 0;
            int i2 = eVar3 != null ? eVar3.z : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.t;
                e<K, V> eVar5 = eVar3.u;
                int i4 = (eVar4 != null ? eVar4.z : 0) - (eVar5 != null ? eVar5.z : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    x(eVar3);
                    u(eVar);
                } else {
                    u(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.t;
                e<K, V> eVar7 = eVar2.u;
                int i5 = (eVar6 != null ? eVar6.z : 0) - (eVar7 != null ? eVar7.z : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    u(eVar2);
                    x(eVar);
                } else {
                    x(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.z = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.z = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.s;
        }
    }

    private void t(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.s;
        eVar.s = null;
        if (eVar2 != null) {
            eVar2.s = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.t == eVar) {
                eVar3.t = eVar2;
                return;
            } else {
                eVar3.u = eVar2;
                return;
            }
        }
        this.v = eVar2;
    }

    private void u(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.t;
        e<K, V> eVar3 = eVar.u;
        e<K, V> eVar4 = eVar3.t;
        e<K, V> eVar5 = eVar3.u;
        eVar.u = eVar4;
        if (eVar4 != null) {
            eVar4.s = eVar;
        }
        t(eVar, eVar3);
        eVar3.t = eVar;
        eVar.s = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.z : 0, eVar4 != null ? eVar4.z : 0) + 1;
        eVar.z = max;
        eVar3.z = Math.max(max, eVar5 != null ? eVar5.z : 0) + 1;
    }

    private void x(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.t;
        e<K, V> eVar3 = eVar.u;
        e<K, V> eVar4 = eVar2.t;
        e<K, V> eVar5 = eVar2.u;
        eVar.t = eVar5;
        if (eVar5 != null) {
            eVar5.s = eVar;
        }
        t(eVar, eVar2);
        eVar2.u = eVar;
        eVar.s = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.z : 0, eVar5 != null ? eVar5.z : 0) + 1;
        eVar.z = max;
        eVar2.z = Math.max(max, eVar4 != null ? eVar4.z : 0) + 1;
    }

    private Object y() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.v = null;
        this.w = 0;
        this.x++;
        e<K, V> eVar = this.y;
        eVar.w = eVar;
        eVar.v = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return i(obj) != null;
    }

    public e<K, V> e(K k, boolean z) {
        int i;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.u;
        e<K, V> eVar2 = this.v;
        if (eVar2 != null) {
            Comparable comparable = comparator == s ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.x);
                } else {
                    i = comparator.compare(k, (K) eVar2.x);
                }
                if (i == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i < 0 ? eVar2.t : eVar2.u;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (z) {
            e<K, V> eVar4 = this.y;
            if (eVar2 == null) {
                if (comparator == s && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k, eVar4, eVar4.w);
                this.v = eVar;
            } else {
                eVar = new e<>(eVar2, k, eVar4, eVar4.w);
                if (i < 0) {
                    eVar2.t = eVar;
                } else {
                    eVar2.u = eVar;
                }
                n(eVar2, true);
            }
            this.w++;
            this.x++;
            return eVar;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        xw2<K, V>.b bVar = this.z;
        if (bVar != null) {
            return bVar;
        }
        xw2<K, V>.b bVar2 = new b();
        this.z = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> i = i(obj);
        if (i != null) {
            return i.y;
        }
        return null;
    }

    public e<K, V> h(Map.Entry<?, ?> entry) {
        e<K, V> i = i(entry.getKey());
        if (i != null && a(i.y, entry.getValue())) {
            return i;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> i(Object obj) {
        if (obj != 0) {
            try {
                return e(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        xw2<K, V>.c cVar = this.A;
        if (cVar != null) {
            return cVar;
        }
        xw2<K, V>.c cVar2 = new c();
        this.A = cVar2;
        return cVar2;
    }

    public void o(e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            e<K, V> eVar2 = eVar.w;
            eVar2.v = eVar.v;
            eVar.v.w = eVar2;
        }
        e<K, V> eVar3 = eVar.t;
        e<K, V> eVar4 = eVar.u;
        e<K, V> eVar5 = eVar.s;
        int i2 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b2 = eVar3.z > eVar4.z ? eVar3.b() : eVar4.a();
            o(b2, false);
            e<K, V> eVar6 = eVar.t;
            if (eVar6 != null) {
                i = eVar6.z;
                b2.t = eVar6;
                eVar6.s = b2;
                eVar.t = null;
            } else {
                i = 0;
            }
            e<K, V> eVar7 = eVar.u;
            if (eVar7 != null) {
                i2 = eVar7.z;
                b2.u = eVar7;
                eVar7.s = b2;
                eVar.u = null;
            }
            b2.z = Math.max(i, i2) + 1;
            t(eVar, b2);
            return;
        }
        if (eVar3 != null) {
            t(eVar, eVar3);
            eVar.t = null;
        } else if (eVar4 != null) {
            t(eVar, eVar4);
            eVar.u = null;
        } else {
            t(eVar, null);
        }
        n(eVar5, false);
        this.w--;
        this.x++;
    }

    public e<K, V> p(Object obj) {
        e<K, V> i = i(obj);
        if (i != null) {
            o(i, true);
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        e<K, V> e2 = e(k, true);
        V v2 = e2.y;
        e2.y = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> p = p(obj);
        if (p != null) {
            return p.y;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.w;
    }

    public xw2(Comparator<? super K> comparator) {
        this.w = 0;
        this.x = 0;
        this.y = new e<>();
        this.u = comparator == null ? s : comparator;
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {
        public e<K, V> s;
        public e<K, V> t;
        public e<K, V> u;
        public e<K, V> v;
        public e<K, V> w;
        public final K x;
        public V y;
        public int z;

        public e() {
            this.x = null;
            this.w = this;
            this.v = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.t; eVar2 != null; eVar2 = eVar2.t) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.u; eVar2 != null; eVar2 = eVar2.u) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.x;
                if (k == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k.equals(entry.getKey())) {
                    return false;
                }
                V v = this.y;
                if (v == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.x;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.x;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.y;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.y;
            this.y = v;
            return v2;
        }

        public String toString() {
            return this.x + AppCenter.KEY_VALUE_DELIMITER + this.y;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.s = eVar;
            this.x = k;
            this.z = 1;
            this.v = eVar2;
            this.w = eVar3;
            eVar3.v = this;
            eVar2.w = this;
        }
    }
}