package com.p7700g.p99005;

import com.p7700g.p99005.cx3;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: KeyComparatorLinkedHashMap.java */
/* loaded from: classes3.dex */
public class dx3<K, V> extends cx3<K, V> implements Map<K, V> {
    private static final long D = 3801124242820219131L;
    private transient b<K, V> E;
    private final boolean F;

    /* compiled from: KeyComparatorLinkedHashMap.java */
    /* loaded from: classes3.dex */
    public static class b<K, V> extends cx3.b<K, V> {
        public b<K, V> w;
        public b<K, V> x;

        public b(int i, K k, V v, cx3.b<K, V> bVar) {
            super(i, k, v, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(b<K, V> bVar) {
            this.x = bVar;
            b<K, V> bVar2 = bVar.w;
            this.w = bVar2;
            bVar2.x = this;
            this.x.w = this;
        }

        private void e() {
            b<K, V> bVar = this.w;
            bVar.x = this.x;
            this.x.w = bVar;
        }

        @Override // com.p7700g.p99005.cx3.b
        public void a(cx3<K, V> cx3Var) {
            dx3 dx3Var = (dx3) cx3Var;
            if (dx3Var.F) {
                dx3Var.A++;
                e();
                d(dx3Var.E);
            }
        }

        @Override // com.p7700g.p99005.cx3.b
        public void b(cx3<K, V> cx3Var) {
            e();
        }
    }

    /* compiled from: KeyComparatorLinkedHashMap.java */
    /* loaded from: classes3.dex */
    public class c extends dx3<K, V>.e<Map.Entry<K, V>> {
        private c() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            return a();
        }
    }

    /* compiled from: KeyComparatorLinkedHashMap.java */
    /* loaded from: classes3.dex */
    public class d extends dx3<K, V>.e<K> {
        private d() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return a().getKey();
        }
    }

    /* compiled from: KeyComparatorLinkedHashMap.java */
    /* loaded from: classes3.dex */
    public abstract class e<T> implements Iterator<T> {
        public b<K, V> s;
        public b<K, V> t;
        public int u;

        private e() {
            this.s = dx3.this.E.x;
            this.t = null;
            this.u = dx3.this.A;
        }

        public b<K, V> a() {
            if (dx3.this.A == this.u) {
                if (this.s != dx3.this.E) {
                    b<K, V> bVar = this.s;
                    this.t = bVar;
                    this.s = bVar.x;
                    return bVar;
                }
                throw new NoSuchElementException();
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != dx3.this.E;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.t != null) {
                if (dx3.this.A == this.u) {
                    dx3.this.remove(this.t.s);
                    this.t = null;
                    this.u = dx3.this.A;
                    return;
                }
                throw new ConcurrentModificationException();
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: KeyComparatorLinkedHashMap.java */
    /* loaded from: classes3.dex */
    public class f extends dx3<K, V>.e<V> {
        private f() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return a().t;
        }
    }

    public dx3(int i, float f2, bx3<K> bx3Var) {
        super(i, f2, bx3Var);
        this.F = false;
    }

    @Override // com.p7700g.p99005.cx3
    public void B() {
        b<K, V> bVar = new b<>(-1, null, null, null);
        this.E = bVar;
        bVar.x = bVar;
        bVar.w = bVar;
    }

    @Override // com.p7700g.p99005.cx3
    public Iterator<Map.Entry<K, V>> J() {
        return new c();
    }

    @Override // com.p7700g.p99005.cx3
    public Iterator<K> L() {
        return new d();
    }

    @Override // com.p7700g.p99005.cx3
    public Iterator<V> M() {
        return new f();
    }

    @Override // com.p7700g.p99005.cx3
    public void T(cx3.b[] bVarArr) {
        int length = bVarArr.length;
        b<K, V> bVar = this.E;
        while (true) {
            bVar = bVar.x;
            if (bVar == this.E) {
                return;
            }
            int A = cx3.A(bVar.u, length);
            bVar.v = (cx3.b<K, V>) bVarArr[A];
            bVarArr[A] = bVar;
        }
    }

    public boolean X2(Map.Entry<K, V> entry) {
        return false;
    }

    @Override // com.p7700g.p99005.cx3
    public void a(int i, K k, V v, int i2) {
        n(i, k, v, i2);
        b<K, V> bVar = this.E.x;
        if (X2(bVar)) {
            Q(bVar.s);
        } else if (this.x >= this.y) {
            S(this.w.length * 2);
        }
    }

    @Override // com.p7700g.p99005.cx3, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        b<K, V> bVar = this.E;
        bVar.x = bVar;
        bVar.w = bVar;
    }

    @Override // com.p7700g.p99005.cx3, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            b<K, V> bVar = this.E;
            do {
                bVar = bVar.x;
                if (bVar == this.E) {
                    return false;
                }
            } while (bVar.t != null);
            return true;
        }
        b<K, V> bVar2 = this.E;
        do {
            bVar2 = bVar2.x;
            if (bVar2 == this.E) {
                return false;
            }
        } while (!obj.equals(bVar2.t));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p7700g.p99005.cx3, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        b bVar = (b) t(obj);
        if (bVar == null) {
            return null;
        }
        bVar.a(this);
        return bVar.t;
    }

    @Override // com.p7700g.p99005.cx3
    public void n(int i, K k, V v, int i2) {
        b bVar = new b(i, k, v, this.w[i2]);
        this.w[i2] = bVar;
        bVar.d(this.E);
        this.x++;
    }

    public dx3(int i, bx3<K> bx3Var) {
        super(i, bx3Var);
        this.F = false;
    }

    public dx3(bx3<K> bx3Var) {
        super(bx3Var);
        this.F = false;
    }

    public dx3(Map<? extends K, ? extends V> map, bx3<K> bx3Var) {
        super(map, bx3Var);
        this.F = false;
    }

    public dx3(int i, float f2, boolean z, bx3<K> bx3Var) {
        super(i, f2, bx3Var);
        this.F = z;
    }
}