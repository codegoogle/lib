package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.Spliterator;
import java.util.function.Predicate;

/* compiled from: AddressTrieSet.java */
/* loaded from: classes3.dex */
public class e54<E extends n04> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable {
    private static final long s = 1;
    private a54<E> t;
    private final boolean u;
    private final a<E> v;
    private e54<E> w;

    /* compiled from: AddressTrieSet.java */
    /* loaded from: classes3.dex */
    public static class a<E extends n04> implements Serializable {
        private static final long s = 1;
        public final a54.b<E> t;
        public a<E> u;
        public final boolean v;

        public a(a54.b<E> bVar) {
            this(bVar, false);
        }

        public E f() {
            return (E) (this.v ? this.t.g() : this.t.f());
        }

        public E g() {
            return (E) (this.v ? this.t.f() : this.t.g());
        }

        public boolean h(E e) {
            return this.v ? this.t.t(e) : this.t.i(e);
        }

        public boolean i(E e) {
            return this.v ? this.t.i(e) : this.t.t(e);
        }

        public boolean m(E e) {
            return p(e) && t(e);
        }

        public boolean n() {
            return f() != null;
        }

        public boolean o() {
            return g() != null;
        }

        public boolean p(E e) {
            return !i(e);
        }

        public boolean t(E e) {
            return !h(e);
        }

        public String toString() {
            m44 m44Var = m44.a;
            return g54.d.M(f(), u(), g(), y(), m44Var, " -> ", m44Var);
        }

        public boolean u() {
            return this.v ? this.t.O() : this.t.H();
        }

        public a<E> x() {
            a<E> aVar = this.u;
            if (aVar == null) {
                a<E> aVar2 = new a<>(this.t, !this.v);
                this.u = aVar2;
                aVar2.u = this;
                return aVar2;
            }
            return aVar;
        }

        public boolean y() {
            return this.v ? this.t.H() : this.t.O();
        }

        public a(a54.b<E> bVar, boolean z) {
            Objects.requireNonNull(bVar);
            this.t = bVar;
            this.v = z;
        }
    }

    public e54(a54<E> a54Var) {
        this.t = a54Var;
        this.u = false;
        this.v = null;
        if (a54Var.y == null) {
            a54Var.y = this;
        }
    }

    private boolean H() {
        return this.v != null;
    }

    private e54<E> R(E e, boolean z, E e2, boolean z2) {
        a54.b<E> I;
        if (this.u) {
            e2 = e;
            e = e2;
            z2 = z;
            z = z2;
        }
        a<E> aVar = this.v;
        a54.b<E> bVar = aVar != null ? aVar.t : null;
        if (bVar == null) {
            I = a54.b.Q(e, z, e2, z2, this.t.U());
        } else {
            I = bVar.I(e, z, e2, z2);
        }
        if (I == null) {
            return this;
        }
        return new e54<>(this.t.O(I), new a(I, this.u), this.u);
    }

    public a<E> A() {
        return this.v;
    }

    public boolean B() {
        return H();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: D */
    public e54<E> headSet(E e) {
        return headSet(e, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: E */
    public e54<E> headSet(E e, boolean z) {
        Objects.requireNonNull(e);
        return R(null, true, e, z);
    }

    @Override // java.util.NavigableSet
    /* renamed from: G */
    public E higher(E e) {
        a54.g<E> W = this.u ? this.t.W(e) : this.t.n2(e);
        if (W == null) {
            return null;
        }
        return (E) W.getKey();
    }

    @Override // java.util.SortedSet
    /* renamed from: I */
    public E last() {
        a54.g<E> h2 = this.u ? this.t.h2() : this.t.M2();
        if (h2 != null) {
            return (E) h2.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: J */
    public E lower(E e) {
        a54.g<E> n2 = this.u ? this.t.n2(e) : this.t.W(e);
        if (n2 == null) {
            return null;
        }
        return (E) n2.getKey();
    }

    public boolean K1(E e) {
        return this.t.Q(e);
    }

    @Override // java.util.NavigableSet
    /* renamed from: L */
    public E pollFirst() {
        a54.g<E> M2 = this.u ? this.t.M2() : this.t.h2();
        if (M2 == null) {
            return null;
        }
        M2.x3();
        return (E) M2.getKey();
    }

    @Override // java.util.NavigableSet
    /* renamed from: M */
    public E pollLast() {
        a54.g<E> h2 = this.u ? this.t.h2() : this.t.M2();
        if (h2 == null) {
            return null;
        }
        h2.x3();
        return (E) h2.getKey();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N */
    public e54<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: O */
    public e54<E> subSet(E e, boolean z, E e2, boolean z2) {
        if (e != null && e2 != null) {
            return R(e, z, e2, z2);
        }
        throw null;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: P */
    public e54<E> tailSet(E e) {
        return tailSet(e, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: Q */
    public e54<E> tailSet(E e, boolean z) {
        Objects.requireNonNull(e);
        return R(e, z, null, false);
    }

    public String S() {
        return this.t.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.t.clear();
    }

    @Override // java.util.SortedSet
    public Comparator<E> comparator() {
        return this.u ? a54.G3() : a54.comparator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.t.K2((n04) obj);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return this.u ? this.t.iterator() : this.t.descendingIterator();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof e54) {
            return this.t.equals(((e54) obj).t);
        }
        return super.equals(obj);
    }

    public a54<E> f() {
        if (H()) {
            return this.t.f();
        }
        if (!this.u) {
            this.t.y = this;
        }
        return this.t;
    }

    public Iterator<E> g() {
        return new g54.h(this.t.E(!this.u));
    }

    @Override // java.util.NavigableSet
    /* renamed from: h */
    public E ceiling(E e) {
        a54.g<E> y3 = this.u ? this.t.y3(e) : this.t.t2(e);
        if (y3 == null) {
            return null;
        }
        return (E) y3.getKey();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.t.hashCode();
    }

    /* renamed from: i */
    public e54<E> clone() {
        try {
            e54<E> e54Var = (e54) super.clone();
            a54<E> f = this.t.f();
            e54Var.t = f;
            f.z = this.t.z;
            e54Var.w = null;
            return e54Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.t.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator<E> iterator() {
        return this.u ? this.t.descendingIterator() : this.t.iterator();
    }

    public E l4(E e) {
        return this.t.k3(e);
    }

    public Iterator<E> n() {
        return new g54.h(this.t.j(!this.u));
    }

    public Iterator<E> o() {
        return new g54.h(this.t.r(!this.u));
    }

    @Override // java.util.NavigableSet
    /* renamed from: p */
    public e54<E> descendingSet() {
        e54<E> e54Var = this.w;
        if (e54Var == null) {
            e54<E> e54Var2 = new e54<>(this.t, H() ? this.v.x() : null, !this.u);
            this.w = e54Var2;
            e54Var2.w = this;
            return e54Var2;
        }
        return e54Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.t.A4((n04) obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(final Collection<?> collection) {
        if (!(collection instanceof List) && !(collection instanceof Queue) && collection.size() >= size()) {
            return removeIf(new Predicate() { // from class: com.p7700g.p99005.j44
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return collection.contains((n04) obj);
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

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, java.util.SortedSet
    public Spliterator<E> spliterator() {
        return this.u ? this.t.c3() : this.t.spliterator();
    }

    public e54<E> t(E e) {
        a54<E> R = this.t.R(e);
        if (this.t == R) {
            return this;
        }
        a54.b<E> bVar = R.z;
        if (bVar == null) {
            return new e54<>(R, null, this.u);
        }
        return new e54<>(R, new a(bVar, this.u), this.u);
    }

    public e54<E> u(E e) {
        a54<E> S = this.t.S(e);
        if (this.t == S) {
            return this;
        }
        a54.b<E> bVar = S.z;
        if (bVar == null) {
            return new e54<>(S, null, this.u);
        }
        return new e54<>(S, new a(bVar, this.u), this.u);
    }

    @Override // java.util.SortedSet
    /* renamed from: x */
    public E first() {
        a54.g<E> M2 = this.u ? this.t.M2() : this.t.h2();
        if (M2 != null) {
            return (E) M2.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: y */
    public E floor(E e) {
        a54.g<E> t2 = this.u ? this.t.t2(e) : this.t.y3(e);
        if (t2 == null) {
            return null;
        }
        return (E) t2.getKey();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: z */
    public boolean add(E e) {
        return this.t.z(e);
    }

    public e54(a54<E> a54Var, Collection<? extends E> collection) {
        this.t = a54Var;
        this.u = false;
        this.v = null;
        if (a54Var.y == null) {
            a54Var.y = this;
        }
        addAll(collection);
    }

    public e54(a54<E> a54Var, a<E> aVar, boolean z) {
        this.t = a54Var;
        this.v = aVar;
        this.u = z;
        if (a54Var.y == null && !z && aVar == null) {
            a54Var.y = this;
        }
    }
}