package com.p7700g.p99005;

import com.microsoft.appcenter.AppCenter;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedHashTreeMap.java */
/* loaded from: classes.dex */
public final class so0<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> s = new a();
    public static final /* synthetic */ boolean t = false;
    private so0<K, V>.d A;
    private so0<K, V>.e B;
    public Comparator<? super K> u;
    public g<K, V>[] v;
    public final g<K, V> w;
    public int x;
    public int y;
    public int z;

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public static final class b<K, V> {
        private g<K, V> a;
        private int b;
        private int c;
        private int d;

        public void a(g<K, V> gVar) {
            gVar.u = null;
            gVar.s = null;
            gVar.t = null;
            gVar.A = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            gVar.s = this.a;
            this.a = gVar;
            int i3 = this.d + 1;
            this.d = i3;
            int i4 = this.b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.d = i3 + 1;
                this.b = i4 - 1;
                this.c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.d & i6) != i6) {
                    return;
                }
                int i7 = this.c;
                if (i7 == 0) {
                    g<K, V> gVar2 = this.a;
                    g<K, V> gVar3 = gVar2.s;
                    g<K, V> gVar4 = gVar3.s;
                    gVar3.s = gVar4.s;
                    this.a = gVar3;
                    gVar3.t = gVar4;
                    gVar3.u = gVar2;
                    gVar3.A = gVar2.A + 1;
                    gVar4.s = gVar3;
                    gVar2.s = gVar3;
                } else if (i7 == 1) {
                    g<K, V> gVar5 = this.a;
                    g<K, V> gVar6 = gVar5.s;
                    this.a = gVar6;
                    gVar6.u = gVar5;
                    gVar6.A = gVar5.A + 1;
                    gVar5.s = gVar6;
                    this.c = 0;
                } else if (i7 == 2) {
                    this.c = 0;
                }
                i5 *= 2;
            }
        }

        public void b(int i) {
            this.b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.a;
            if (gVar.s == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> {
        private g<K, V> a;

        public g<K, V> a() {
            g<K, V> gVar = this.a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.s;
            gVar.s = null;
            g<K, V> gVar3 = gVar.u;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 != null) {
                    gVar2.s = gVar4;
                    gVar3 = gVar2.t;
                } else {
                    this.a = gVar4;
                    return gVar;
                }
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.s = gVar2;
                gVar2 = gVar;
                gVar = gVar.t;
            }
            this.a = gVar2;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedHashTreeMap.java */
        /* loaded from: classes.dex */
        public class a extends so0<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            so0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && so0.this.o((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> o;
            if ((obj instanceof Map.Entry) && (o = so0.this.o((Map.Entry) obj)) != null) {
                so0.this.u(o, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return so0.this.x;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public final class e extends AbstractSet<K> {

        /* compiled from: LinkedHashTreeMap.java */
        /* loaded from: classes.dex */
        public class a extends so0<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().x;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            so0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return so0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return so0.this.x(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return so0.this.x;
        }
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public abstract class f<T> implements Iterator<T> {
        public g<K, V> s;
        public g<K, V> t = null;
        public int u;

        public f() {
            this.s = so0.this.w.v;
            this.u = so0.this.y;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.s;
            so0 so0Var = so0.this;
            if (gVar != so0Var.w) {
                if (so0Var.y == this.u) {
                    this.s = gVar.v;
                    this.t = gVar;
                    return gVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.s != so0.this.w;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.t;
            if (gVar != null) {
                so0.this.u(gVar, true);
                this.t = null;
                this.u = so0.this.y;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public so0() {
        this(null);
    }

    private void A(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.t;
        g<K, V> gVar3 = gVar.u;
        g<K, V> gVar4 = gVar3.t;
        g<K, V> gVar5 = gVar3.u;
        gVar.u = gVar4;
        if (gVar4 != null) {
            gVar4.s = gVar;
        }
        y(gVar, gVar3);
        gVar3.t = gVar;
        gVar.s = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.A : 0, gVar4 != null ? gVar4.A : 0) + 1;
        gVar.A = max;
        gVar3.A = Math.max(max, gVar5 != null ? gVar5.A : 0) + 1;
    }

    private void B(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.t;
        g<K, V> gVar3 = gVar.u;
        g<K, V> gVar4 = gVar2.t;
        g<K, V> gVar5 = gVar2.u;
        gVar.t = gVar5;
        if (gVar5 != null) {
            gVar5.s = gVar;
        }
        y(gVar, gVar2);
        gVar2.u = gVar;
        gVar.s = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.A : 0, gVar5 != null ? gVar5.A : 0) + 1;
        gVar.A = max;
        gVar2.A = Math.max(max, gVar4 != null ? gVar4.A : 0) + 1;
    }

    private static int D(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object E() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    private void h() {
        g<K, V>[] i = i(this.v);
        this.v = i;
        this.z = (i.length / 4) + (i.length / 2);
    }

    public static <K, V> g<K, V>[] i(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i = 0; i < length; i++) {
            g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    g<K, V> a2 = cVar.a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.y & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.b(i2);
                bVar2.b(i3);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a3 = cVar.a();
                    if (a3 == null) {
                        break;
                    } else if ((a3.y & length) == 0) {
                        bVar.a(a3);
                    } else {
                        bVar2.a(a3);
                    }
                }
                gVarArr2[i] = i2 > 0 ? bVar.c() : null;
                gVarArr2[i + length] = i3 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    private boolean m(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void t(g<K, V> gVar, boolean z) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.t;
            g<K, V> gVar3 = gVar.u;
            int i = gVar2 != null ? gVar2.A : 0;
            int i2 = gVar3 != null ? gVar3.A : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                g<K, V> gVar4 = gVar3.t;
                g<K, V> gVar5 = gVar3.u;
                int i4 = (gVar4 != null ? gVar4.A : 0) - (gVar5 != null ? gVar5.A : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    B(gVar3);
                    A(gVar);
                } else {
                    A(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                g<K, V> gVar6 = gVar2.t;
                g<K, V> gVar7 = gVar2.u;
                int i5 = (gVar6 != null ? gVar6.A : 0) - (gVar7 != null ? gVar7.A : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    A(gVar2);
                    B(gVar);
                } else {
                    B(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                gVar.A = i + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.A = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.s;
        }
    }

    private void y(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.s;
        gVar.s = null;
        if (gVar2 != null) {
            gVar2.s = gVar3;
        }
        if (gVar3 != null) {
            if (gVar3.t == gVar) {
                gVar3.t = gVar2;
                return;
            } else {
                gVar3.u = gVar2;
                return;
            }
        }
        int i = gVar.y;
        g<K, V>[] gVarArr = this.v;
        gVarArr[i & (gVarArr.length - 1)] = gVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.v, (Object) null);
        this.x = 0;
        this.y++;
        g<K, V> gVar = this.w;
        g<K, V> gVar2 = gVar.v;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.v;
            gVar2.w = null;
            gVar2.v = null;
            gVar2 = gVar3;
        }
        gVar.w = gVar;
        gVar.v = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return p(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        so0<K, V>.d dVar = this.A;
        if (dVar != null) {
            return dVar;
        }
        so0<K, V>.d dVar2 = new d();
        this.A = dVar2;
        return dVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> p = p(obj);
        if (p != null) {
            return p.z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        so0<K, V>.e eVar = this.B;
        if (eVar != null) {
            return eVar;
        }
        so0<K, V>.e eVar2 = new e();
        this.B = eVar2;
        return eVar2;
    }

    public g<K, V> n(K k, boolean z) {
        g<K, V> gVar;
        int i;
        g<K, V> gVar2;
        int compare;
        Comparator<? super K> comparator = this.u;
        g<K, V>[] gVarArr = this.v;
        int D = D(k.hashCode());
        int length = (gVarArr.length - 1) & D;
        g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == s ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compare = comparable.compareTo(gVar3.x);
                } else {
                    compare = comparator.compare(k, (K) gVar3.x);
                }
                if (compare == 0) {
                    return gVar3;
                }
                g<K, V> gVar4 = compare < 0 ? gVar3.t : gVar3.u;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = compare;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (z) {
            g<K, V> gVar5 = this.w;
            if (gVar == null) {
                if (comparator == s && !(k instanceof Comparable)) {
                    throw new ClassCastException(k.getClass().getName() + " is not Comparable");
                }
                gVar2 = new g<>(gVar, k, D, gVar5, gVar5.w);
                gVarArr[length] = gVar2;
            } else {
                gVar2 = new g<>(gVar, k, D, gVar5, gVar5.w);
                if (i < 0) {
                    gVar.t = gVar2;
                } else {
                    gVar.u = gVar2;
                }
                t(gVar, true);
            }
            int i2 = this.x;
            this.x = i2 + 1;
            if (i2 > this.z) {
                h();
            }
            this.y++;
            return gVar2;
        }
        return null;
    }

    public g<K, V> o(Map.Entry<?, ?> entry) {
        g<K, V> p = p(entry.getKey());
        if (p != null && m(p.z, entry.getValue())) {
            return p;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> p(Object obj) {
        if (obj != 0) {
            try {
                return n(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        g<K, V> n = n(k, true);
        V v2 = n.z;
        n.z = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> x = x(obj);
        if (x != null) {
            return x.z;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.x;
    }

    public void u(g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            g<K, V> gVar2 = gVar.w;
            gVar2.v = gVar.v;
            gVar.v.w = gVar2;
            gVar.w = null;
            gVar.v = null;
        }
        g<K, V> gVar3 = gVar.t;
        g<K, V> gVar4 = gVar.u;
        g<K, V> gVar5 = gVar.s;
        int i2 = 0;
        if (gVar3 != null && gVar4 != null) {
            g<K, V> b2 = gVar3.A > gVar4.A ? gVar3.b() : gVar4.a();
            u(b2, false);
            g<K, V> gVar6 = gVar.t;
            if (gVar6 != null) {
                i = gVar6.A;
                b2.t = gVar6;
                gVar6.s = b2;
                gVar.t = null;
            } else {
                i = 0;
            }
            g<K, V> gVar7 = gVar.u;
            if (gVar7 != null) {
                i2 = gVar7.A;
                b2.u = gVar7;
                gVar7.s = b2;
                gVar.u = null;
            }
            b2.A = Math.max(i, i2) + 1;
            y(gVar, b2);
            return;
        }
        if (gVar3 != null) {
            y(gVar, gVar3);
            gVar.t = null;
        } else if (gVar4 != null) {
            y(gVar, gVar4);
            gVar.u = null;
        } else {
            y(gVar, null);
        }
        t(gVar5, false);
        this.x--;
        this.y++;
    }

    public g<K, V> x(Object obj) {
        g<K, V> p = p(obj);
        if (p != null) {
            u(p, true);
        }
        return p;
    }

    public so0(Comparator<? super K> comparator) {
        this.x = 0;
        this.y = 0;
        this.u = comparator == null ? s : comparator;
        this.w = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.v = gVarArr;
        this.z = (gVarArr.length / 4) + (gVarArr.length / 2);
    }

    /* compiled from: LinkedHashTreeMap.java */
    /* loaded from: classes.dex */
    public static final class g<K, V> implements Map.Entry<K, V> {
        public int A;
        public g<K, V> s;
        public g<K, V> t;
        public g<K, V> u;
        public g<K, V> v;
        public g<K, V> w;
        public final K x;
        public final int y;
        public V z;

        public g() {
            this.x = null;
            this.y = -1;
            this.w = this;
            this.v = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.t; gVar2 != null; gVar2 = gVar2.t) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.u; gVar2 != null; gVar2 = gVar2.u) {
                gVar = gVar2;
            }
            return gVar;
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
                V v = this.z;
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
            return this.z;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.x;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.z;
            return hashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.z;
            this.z = v;
            return v2;
        }

        public String toString() {
            return this.x + AppCenter.KEY_VALUE_DELIMITER + this.z;
        }

        public g(g<K, V> gVar, K k, int i, g<K, V> gVar2, g<K, V> gVar3) {
            this.s = gVar;
            this.x = k;
            this.y = i;
            this.A = 1;
            this.v = gVar2;
            this.w = gVar3;
            gVar3.v = this;
            gVar2.w = this;
        }
    }
}