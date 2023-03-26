package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: KeyComparatorHashMap.java */
/* loaded from: classes3.dex */
public class cx3<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable {
    public static final int s = 16;
    public static final int t = 1073741824;
    public static final float u = 0.75f;
    public static final Object v = new Object();
    public volatile transient int A;
    public final bx3<K> B;
    private transient Set<Map.Entry<K, V>> C;
    public transient b<K, V>[] w;
    public transient int x;
    public int y;
    public final float z;

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public static class b<K, V> implements Map.Entry<K, V> {
        public final K s;
        public V t;
        public final int u;
        public b<K, V> v;

        public b(int i, K k, V v, b<K, V> bVar) {
            this.t = v;
            this.v = bVar;
            this.s = k;
            this.u = i;
        }

        public void a(cx3<K, V> cx3Var) {
        }

        public void b(cx3<K, V> cx3Var) {
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K key = getKey();
                Object key2 = entry.getKey();
                if (key == key2 || (key != null && key.equals(key2))) {
                    V value = getValue();
                    Object value2 = entry.getValue();
                    if (value == value2) {
                        return true;
                    }
                    if (value != null && value.equals(value2)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) cx3.U(this.s);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.s;
            int hashCode = k == cx3.v ? 0 : k.hashCode();
            V v = this.t;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.t;
            this.t = v;
            return v2;
        }

        public String toString() {
            return getKey() + AppCenter.KEY_VALUE_DELIMITER + getValue();
        }
    }

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public class c extends cx3<K, V>.e<Map.Entry<K, V>> {
        private c() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            return a();
        }
    }

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public class d extends AbstractSet {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            cx3.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                b t = cx3.this.t(entry.getKey());
                return t != null && t.equals(entry);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return cx3.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return cx3.this.R(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return cx3.this.x;
        }
    }

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public abstract class e<E> implements Iterator<E> {
        public b<K, V> s;
        public int t;
        public int u;
        public b<K, V> v;

        public e() {
            this.t = cx3.this.A;
            b<K, V>[] bVarArr = cx3.this.w;
            int length = bVarArr.length;
            b<K, V> bVar = null;
            if (cx3.this.x != 0) {
                while (length > 0) {
                    length--;
                    bVar = bVarArr[length];
                    if (bVar != null) {
                        break;
                    }
                }
            }
            this.s = bVar;
            this.u = length;
        }

        public b<K, V> a() {
            if (cx3.this.A == this.t) {
                b<K, V> bVar = this.s;
                if (bVar != null) {
                    b<K, V> bVar2 = bVar.v;
                    b<K, V>[] bVarArr = cx3.this.w;
                    int i = this.u;
                    while (bVar2 == null && i > 0) {
                        i--;
                        bVar2 = bVarArr[i];
                    }
                    this.u = i;
                    this.s = bVar2;
                    this.v = bVar;
                    return bVar;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.v != null) {
                if (cx3.this.A == this.t) {
                    K k = this.v.s;
                    this.v = null;
                    cx3.this.Q(k);
                    this.t = cx3.this.A;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public class f extends cx3<K, V>.e<K> {
        private f() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return a().getKey();
        }
    }

    /* compiled from: KeyComparatorHashMap.java */
    /* loaded from: classes3.dex */
    public class g extends cx3<K, V>.e<V> {
        private g() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return a().t;
        }
    }

    public cx3(int i, float f2, bx3<K> bx3Var) {
        this.C = null;
        if (i >= 0) {
            i = i > 1073741824 ? 1073741824 : i;
            if (f2 > 0.0f && !Float.isNaN(f2)) {
                int i2 = 1;
                while (i2 < i) {
                    i2 <<= 1;
                }
                this.z = f2;
                this.y = (int) (i2 * f2);
                this.w = new b[i2];
                B();
                this.B = bx3Var;
                return;
            }
            throw new IllegalArgumentException(rx3.Q(Float.valueOf(f2)));
        }
        throw new IllegalArgumentException(rx3.P(Integer.valueOf(i)));
    }

    public static int A(int i, int i2) {
        return i & (i2 - 1);
    }

    public static <T> boolean D(T t2) {
        return t2 == v;
    }

    public static <T> T I(T t2) {
        return t2 == null ? (T) v : t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void O(K k, V v2) {
        Object I = I(k);
        int G = G(I);
        int A = A(G, this.w.length);
        for (b<K, V> bVar = this.w[A]; bVar != null; bVar = bVar.v) {
            if (bVar.u == G && E(I, bVar.s)) {
                bVar.t = v2;
                return;
            }
        }
        n(G, I, v2, A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.w = new b[objectInputStream.readInt()];
        B();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            O(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <T> T U(T t2) {
        if (t2 == v) {
            return null;
        }
        return t2;
    }

    private void V(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.w.length);
        objectOutputStream.writeInt(this.x);
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private boolean i() {
        b<K, V>[] bVarArr;
        for (b<K, V> bVar : this.w) {
            for (; bVar != null; bVar = bVar.v) {
                if (bVar.t == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    public static int y(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + (~(hashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    public void B() {
    }

    public boolean E(K k, K k2) {
        return D(k) ? k == k2 : D(k2) ? k == k2 : k == k2 || this.B.e(k, k2);
    }

    public int G(K k) {
        return x(D(k) ? k.hashCode() : this.B.c(k));
    }

    public float H() {
        return this.z;
    }

    public Iterator<Map.Entry<K, V>> J() {
        return new c();
    }

    public Iterator<K> L() {
        return new f();
    }

    public Iterator<V> M() {
        return new g();
    }

    public void N(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            O(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<K, V> Q(Object obj) {
        Object I = I(obj);
        int G = G(I);
        int A = A(G, this.w.length);
        b<K, V> bVar = this.w[A];
        b<K, V> bVar2 = bVar;
        while (bVar != null) {
            b<K, V> bVar3 = bVar.v;
            if (bVar.u == G && E(I, bVar.s)) {
                this.A++;
                this.x--;
                if (bVar2 == bVar) {
                    this.w[A] = bVar3;
                } else {
                    bVar2.v = bVar3;
                }
                bVar.b(this);
                return bVar;
            }
            bVar2 = bVar;
            bVar = bVar3;
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<K, V> R(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int G = G(I(entry.getKey()));
            int A = A(G, this.w.length);
            b<K, V> bVar = this.w[A];
            b<K, V> bVar2 = bVar;
            while (bVar != null) {
                b<K, V> bVar3 = bVar.v;
                if (bVar.u == G && bVar.equals(entry)) {
                    this.A++;
                    this.x--;
                    if (bVar2 == bVar) {
                        this.w[A] = bVar3;
                    } else {
                        bVar2.v = bVar3;
                    }
                    bVar.b(this);
                    return bVar;
                }
                bVar2 = bVar;
                bVar = bVar3;
            }
            return bVar;
        }
        return null;
    }

    public void S(int i) {
        if (this.w.length == 1073741824) {
            this.y = Integer.MAX_VALUE;
            return;
        }
        b<K, V>[] bVarArr = new b[i];
        T(bVarArr);
        this.w = bVarArr;
        this.y = (int) (i * this.z);
    }

    public void T(b<K, V>[] bVarArr) {
        b<K, V>[] bVarArr2 = this.w;
        int length = bVarArr.length;
        for (int i = 0; i < bVarArr2.length; i++) {
            b<K, V> bVar = bVarArr2[i];
            if (bVar != null) {
                bVarArr2[i] = null;
                while (true) {
                    b<K, V> bVar2 = bVar.v;
                    int A = A(bVar.u, length);
                    bVar.v = bVarArr[A];
                    bVarArr[A] = bVar;
                    if (bVar2 == null) {
                        break;
                    }
                    bVar = bVar2;
                }
            }
        }
    }

    public void a(int i, K k, V v2, int i2) {
        b<K, V>[] bVarArr = this.w;
        bVarArr[i2] = new b<>(i, k, v2, bVarArr[i2]);
        int i3 = this.x;
        this.x = i3 + 1;
        if (i3 >= this.y) {
            S(this.w.length * 2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.A++;
        b<K, V>[] bVarArr = this.w;
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr[i] = null;
        }
        this.x = 0;
    }

    @Override // java.util.AbstractMap
    public Object clone() {
        cx3 cx3Var;
        try {
            cx3Var = (cx3) super.clone();
        } catch (CloneNotSupportedException unused) {
            cx3Var = null;
        }
        cx3Var.w = new b[this.w.length];
        cx3Var.C = null;
        cx3Var.A = 0;
        cx3Var.x = 0;
        cx3Var.B();
        cx3Var.N(this);
        return cx3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Object I = I(obj);
        int G = G(I);
        for (b<K, V> bVar = this.w[A(G, this.w.length)]; bVar != null; bVar = bVar.v) {
            if (bVar.u == G && E(I, bVar.s)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        b<K, V>[] bVarArr;
        if (obj == null) {
            return i();
        }
        for (b<K, V> bVar : this.w) {
            for (; bVar != null; bVar = bVar.v) {
                if (obj.equals(bVar.t)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.C;
        if (set != null) {
            return set;
        }
        d dVar = new d();
        this.C = dVar;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Object I = I(obj);
        int G = G(I);
        for (b<K, V> bVar = this.w[A(G, this.w.length)]; bVar != null; bVar = bVar.v) {
            if (bVar.u == G && E(I, bVar.s)) {
                return bVar.t;
            }
        }
        return null;
    }

    public int h() {
        return this.w.length;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.x == 0;
    }

    public void n(int i, K k, V v2, int i2) {
        b<K, V>[] bVarArr = this.w;
        bVarArr[i2] = new b<>(i, k, v2, bVarArr[i2]);
        this.x++;
    }

    public int p() {
        return 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v2) {
        Object I = I(k);
        int G = G(I);
        int A = A(G, this.w.length);
        for (b<K, V> bVar = this.w[A]; bVar != null; bVar = bVar.v) {
            if (bVar.u == G && E(I, bVar.s)) {
                V v3 = bVar.t;
                bVar.t = v2;
                bVar.a(this);
                return v3;
            }
        }
        this.A++;
        a(G, I, v2, A);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return;
        }
        if (size > this.y) {
            int i = (int) ((size / this.z) + 1.0f);
            if (i > 1073741824) {
                i = 1073741824;
            }
            int length = this.w.length;
            while (length < i) {
                length <<= 1;
            }
            if (length > this.w.length) {
                S(length);
            }
        }
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        b<K, V> Q = Q(obj);
        if (Q == null) {
            return null;
        }
        return Q.t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<K, V> t(K k) {
        Object I = I(k);
        int G = G(I);
        b<K, V> bVar = this.w[A(G, this.w.length)];
        while (bVar != null && (bVar.u != G || !E(I, bVar.s))) {
            bVar = bVar.v;
        }
        return bVar;
    }

    public int u() {
        return this.A;
    }

    public int x(int i) {
        int i2 = i + (~(i << 9));
        int i3 = i2 ^ (i2 >>> 14);
        int i4 = i3 + (i3 << 4);
        return i4 ^ (i4 >>> 10);
    }

    public cx3(int i, bx3<K> bx3Var) {
        this(i, 0.75f, bx3Var);
    }

    public cx3(bx3<K> bx3Var) {
        this.C = null;
        this.z = 0.75f;
        this.y = 12;
        this.w = new b[16];
        B();
        this.B = bx3Var;
    }

    public cx3(Map<? extends K, ? extends V> map, bx3<K> bx3Var) {
        this(Math.max(((int) (map.size() / 0.75f)) + 1, 16), 0.75f, bx3Var);
        N(map);
    }
}