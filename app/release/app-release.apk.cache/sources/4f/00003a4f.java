package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.e54;
import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Queue;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: AddressTrieMap.java */
/* loaded from: classes3.dex */
public class b54<K extends n04, V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, Serializable {
    private static final long s = 1;
    private f54<K, V> t;
    private final boolean u;
    private final e54.a<K> v;
    private a<K, V> w;
    private e54<K> x;
    private b54<K, V> y;

    /* compiled from: AddressTrieMap.java */
    /* loaded from: classes3.dex */
    public static class a<K extends n04, V> extends AbstractSet<Map.Entry<K, V>> implements Serializable {
        private static final long s = 1;
        public f54<K, V> t;
        private final boolean u;

        public a(f54<K, V> f54Var, boolean z) {
            this.t = f54Var;
            this.u = z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.t.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                f54.a O2 = this.t.O2((n04) entry.getKey());
                return O2 != null && Objects.equals(O2.getValue(), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.t.equals(((a) obj).t);
            }
            return super.equals(obj);
        }

        public Iterator<Map.Entry<K, V>> f() {
            return (Iterator<? extends f54.a<K, V>>) this.t.E(!this.u);
        }

        public Iterator<Map.Entry<K, V>> g() {
            return (Iterator<? extends f54.a<K, V>>) this.t.j(!this.u);
        }

        public Iterator<Map.Entry<K, V>> h() {
            return this.t.r(!this.u);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.t.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.t.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return (Iterator<? extends f54.a<K, V>>) this.t.q(!this.u);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                f54.a O2 = this.t.O2((n04) entry.getKey());
                if (O2 == null || !Objects.equals(O2.getValue(), entry.getValue())) {
                    return false;
                }
                O2.x3();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(final Collection<?> collection) {
            if (!(collection instanceof List) && !(collection instanceof Queue) && collection.size() >= size()) {
                return removeIf(new Predicate() { // from class: com.p7700g.p99005.q44
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return collection.contains((Map.Entry) obj);
                    }
                });
            }
            boolean z = false;
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (remove(it.next())) {
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.t.size();
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public Spliterator<Map.Entry<K, V>> spliterator() {
            return (Spliterator<? extends f54.a<K, V>>) this.t.k(!this.u);
        }
    }

    public b54(f54<K, V> f54Var) {
        this.t = f54Var;
        this.u = false;
        this.v = null;
        if (f54Var.D == null) {
            f54Var.D = this;
        }
    }

    private f54.a<K, V> G(K k) {
        return this.t.O2(k);
    }

    private b54<K, V> G3(K k, boolean z, K k2, boolean z2) {
        a54.b<K> I;
        if (this.u) {
            k2 = k;
            k = k2;
            z2 = z;
            z = z2;
        }
        f54<K, V> f54Var = this.t;
        g54.d dVar = f54Var.z;
        if (dVar == null) {
            I = a54.b.Q(k, z, k2, z2, f54Var.U());
        } else {
            I = dVar.I(k, z, k2, z2);
        }
        if (I == null) {
            return this;
        }
        return new b54<>(this.t.O(I), new e54.a(I, this.u), this.u);
    }

    public static /* synthetic */ Object R(BiFunction biFunction, n04 n04Var, Object obj) {
        return biFunction.apply(n04Var, obj);
    }

    public static /* synthetic */ Object S(Function function, n04 n04Var) {
        return function.apply(n04Var);
    }

    public static /* synthetic */ Object T(Object obj, BiFunction biFunction, Object obj2) {
        return obj2 == null ? obj : biFunction.apply(obj2, obj);
    }

    public static /* synthetic */ Object U(Object obj) {
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: A */
    public a<K, V> entrySet() {
        a<K, V> aVar = this.w;
        if (aVar == null) {
            a<K, V> aVar2 = new a<>(this.t, this.u);
            this.w = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // java.util.SortedMap
    /* renamed from: B */
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: C3 */
    public b54<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    @Override // java.util.NavigableMap
    /* renamed from: D */
    public Map.Entry<K, V> floorEntry(K k) {
        f54.a<K, V> t2 = this.u ? this.t.t2(k) : this.t.y3(k);
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @Override // java.util.NavigableMap
    /* renamed from: E */
    public K floorKey(K k) {
        return keySet().floor(k);
    }

    @Override // java.util.NavigableMap
    /* renamed from: E3 */
    public b54<K, V> tailMap(K k, boolean z) {
        Objects.requireNonNull(k);
        return G3(k, z, null, false);
    }

    public e54.a<K> H() {
        return this.v;
    }

    public boolean I() {
        return O();
    }

    public String I3() {
        return this.t.toString();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: J */
    public b54<K, V> headMap(K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap
    /* renamed from: L */
    public b54<K, V> headMap(K k, boolean z) {
        Objects.requireNonNull(k);
        return G3(null, true, k, z);
    }

    @Override // java.util.NavigableMap
    /* renamed from: M */
    public Map.Entry<K, V> higherEntry(K k) {
        f54.a<K, V> W = this.u ? this.t.W(k) : this.t.n2(k);
        if (W == null) {
            return null;
        }
        return W;
    }

    @Override // java.util.NavigableMap
    /* renamed from: N */
    public K higherKey(K k) {
        return keySet().higher(k);
    }

    public boolean O() {
        return this.v != null;
    }

    public boolean P(K k) {
        return this.t.Q(k);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: Q */
    public e54<K> keySet() {
        e54<K> e54Var = this.x;
        if (e54Var == null) {
            e54<K> e54Var2 = new e54<>(this.t, this.v, this.u);
            this.x = e54Var2;
            return e54Var2;
        }
        return e54Var;
    }

    @Override // java.util.SortedMap
    /* renamed from: V */
    public K lastKey() {
        return keySet().last();
    }

    public Map.Entry<K, V> X(K k) {
        return this.t.N3(k);
    }

    @Override // java.util.NavigableMap
    /* renamed from: X2 */
    public K lowerKey(K k) {
        return keySet().lower(k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: Y */
    public V put(K k, V v) {
        return this.t.Y(k, v);
    }

    @Override // java.util.NavigableMap
    /* renamed from: Z */
    public Map.Entry<K, V> lowerEntry(K k) {
        f54.a<K, V> n2 = this.u ? this.t.n2(k) : this.t.W(k);
        if (n2 == null) {
            return null;
        }
        return n2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.t.clear();
    }

    @Override // java.util.SortedMap
    public Comparator<K> comparator() {
        return this.u ? a54.G3() : a54.comparator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.t.K2((n04) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Iterator<? extends f54.a<K, V>> q = this.t.q(true);
        while (q.hasNext()) {
            if (obj.equals(q.next().getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d3 */
    public V merge(K k, final V v, final BiFunction<? super V, ? super V, ? extends V> biFunction) {
        Objects.requireNonNull(v);
        f54.a<K, V> B2 = this.t.B2(k, new Function() { // from class: com.p7700g.p99005.s34
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b54.T(v, biFunction, obj);
            }
        });
        if (B2 != null) {
            return B2.getValue();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof b54) {
            return this.t.equals(((b54) obj).t);
        }
        return super.equals(obj);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        f54.a<K, V> M2 = this.u ? this.t.M2() : this.t.h2();
        if (M2 == null) {
            return null;
        }
        return M2;
    }

    @Override // java.util.Map
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        Iterator<? extends f54.a<K, V>> q = this.t.q(!this.u);
        if (q.hasNext()) {
            f54.a<K, V> next = q.next();
            biConsumer.accept((Object) next.getKey(), (V) next.getValue());
            while (q.hasNext()) {
                f54.a<K, V> next2 = q.next();
                biConsumer.accept((Object) next2.getKey(), (V) next2.getValue());
            }
            return;
        }
        Objects.requireNonNull(biConsumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return (V) this.t.F((n04) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V getOrDefault(Object obj, V v) {
        f54.a G = G((n04) obj);
        return G == null ? v : (V) G.getValue();
    }

    public f54<K, V> h() {
        if (O()) {
            return this.t.f();
        }
        if (!this.u) {
            this.t.D = this;
        }
        return this.t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return this.t.hashCode();
    }

    @Override // java.util.NavigableMap
    /* renamed from: i */
    public Map.Entry<K, V> ceilingEntry(K k) {
        f54.a<K, V> y3 = this.u ? this.t.y3(k) : this.t.t2(k);
        if (y3 == null) {
            return null;
        }
        return y3;
    }

    @Override // java.util.NavigableMap
    /* renamed from: i3 */
    public e54<K> navigableKeySet() {
        return keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.t.isEmpty();
    }

    @Override // java.util.Map
    /* renamed from: j3 */
    public V putIfAbsent(K k, final V v) {
        return this.t.J2(k, new Supplier() { // from class: com.p7700g.p99005.r34
            @Override // java.util.function.Supplier
            public final Object get() {
                Object obj = v;
                b54.U(obj);
                return obj;
            }
        }, true).getValue();
    }

    @Override // java.util.Map
    /* renamed from: k3 */
    public V replace(K k, V v) {
        f54.a<K, V> G = G(k);
        if (G != null) {
            V value = G.getValue();
            G.setValue(v);
            return value;
        }
        return null;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        f54.a<K, V> h2 = this.u ? this.t.h2() : this.t.M2();
        if (h2 == null) {
            return null;
        }
        return h2;
    }

    @Override // java.util.NavigableMap
    /* renamed from: n */
    public K ceilingKey(K k) {
        return keySet().ceiling(k);
    }

    @Override // java.util.Map
    /* renamed from: n3 */
    public boolean replace(K k, V v, V v2) {
        f54.a<K, V> G = G(k);
        if (G == null || !Objects.equals(v, G.getValue())) {
            return false;
        }
        G.setValue(v2);
        return true;
    }

    @Override // java.util.AbstractMap
    /* renamed from: o */
    public b54<K, V> clone() {
        try {
            b54<K, V> b54Var = (b54) super.clone();
            f54<K, V> f = this.t.f();
            b54Var.t = f;
            f.z = this.t.z;
            b54Var.x = null;
            b54Var.w = null;
            b54Var.y = null;
            return b54Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.Map
    /* renamed from: p */
    public V compute(final K k, final BiFunction<? super K, ? super V, ? extends V> biFunction) {
        f54.a<K, V> B2 = this.t.B2(k, new Function() { // from class: com.p7700g.p99005.t34
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b54.R(biFunction, k, obj);
            }
        });
        if (B2 != null) {
            return B2.getValue();
        }
        return null;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: p3 */
    public b54<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        f54.a<K, V> M2 = this.u ? this.t.M2() : this.t.h2();
        if (M2 == null) {
            return null;
        }
        M2.x3();
        return M2;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        f54.a<K, V> h2 = this.u ? this.t.h2() : this.t.M2();
        if (h2 == null) {
            return null;
        }
        h2.x3();
        return h2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f54.a G = G((n04) obj);
        if (G != null) {
            V v = (V) G.getValue();
            G.x3();
            return v;
        }
        return null;
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        Iterator<? extends f54.a<K, V>> q = this.t.q(!this.u);
        if (q.hasNext()) {
            f54.a<K, V> next = q.next();
            next.setValue(biFunction.apply((Object) next.getKey(), (V) next.getValue()));
            while (q.hasNext()) {
                f54.a<K, V> next2 = q.next();
                next2.setValue(biFunction.apply((Object) next2.getKey(), (V) next2.getValue()));
            }
            return;
        }
        Objects.requireNonNull(biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.t.size();
    }

    @Override // java.util.Map
    /* renamed from: t */
    public V computeIfAbsent(final K k, final Function<? super K, ? extends V> function) {
        f54.a<K, V> J2 = this.t.J2(k, new Supplier() { // from class: com.p7700g.p99005.q34
            @Override // java.util.function.Supplier
            public final Object get() {
                return b54.S(function, k);
            }
        }, false);
        if (J2 != null) {
            return J2.getValue();
        }
        return null;
    }

    @Override // java.util.NavigableMap
    /* renamed from: t3 */
    public b54<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        if (k != null && k2 != null) {
            return G3(k, z, k2, z2);
        }
        throw null;
    }

    @Override // java.util.Map
    /* renamed from: u */
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        V value;
        f54.a<K, V> G = G(k);
        if (G == null || (value = G.getValue()) == null) {
            return null;
        }
        V apply = biFunction.apply(k, value);
        if (apply != null) {
            G.setValue(apply);
        } else {
            G.x3();
        }
        return apply;
    }

    public b54<K, V> w3(K k) {
        f54<K, V> R = this.t.R(k);
        if (this.t == R) {
            return this;
        }
        a54.b<E> bVar = R.z;
        if (bVar == 0) {
            return new b54<>(R, null, this.u);
        }
        return new b54<>(R, new e54.a(bVar, this.u), this.u);
    }

    @Override // java.util.NavigableMap
    /* renamed from: x */
    public e54<K> descendingKeySet() {
        return descendingMap().keySet();
    }

    public b54<K, V> x3(K k) {
        f54<K, V> S = this.t.S(k);
        if (this.t == S) {
            return this;
        }
        a54.b<E> bVar = S.z;
        if (bVar == 0) {
            return new b54<>(S, null, this.u);
        }
        return new b54<>(S, new e54.a(bVar, this.u), this.u);
    }

    @Override // java.util.NavigableMap
    /* renamed from: y */
    public b54<K, V> descendingMap() {
        b54<K, V> b54Var = this.y;
        if (b54Var == null) {
            b54<K, V> b54Var2 = new b54<>(this.t, O() ? this.v.x() : null, !this.u);
            this.y = b54Var2;
            b54Var2.y = this;
            return b54Var2;
        }
        return b54Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        f54.a G = G((n04) obj);
        if (G == null || !Objects.equals(obj2, G.getValue())) {
            return false;
        }
        G.x3();
        return true;
    }

    public b54(f54<K, V> f54Var, Map<? extends K, ? extends V> map) {
        this.t = f54Var;
        this.u = false;
        this.v = null;
        if (f54Var.D == null) {
            f54Var.D = this;
        }
        putAll(map);
    }

    public b54(f54<K, V> f54Var, e54.a<K> aVar, boolean z) {
        this.t = f54Var;
        this.v = aVar;
        this.u = z;
        if (f54Var.D == null && !z && aVar == null) {
            f54Var.D = this;
        }
    }
}