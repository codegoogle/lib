package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ListBuilder.kt */
@vo4(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001VB\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0014\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00101\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u000102H\u0096\u0002J\u0016\u00103\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\nH\u0016J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\u0011H\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0096\u0002J\u0015\u0010<\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010@\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0002\u00104J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0002\u00104J\u0018\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\nH\u0002J\u0016\u0010F\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010G\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010H\u001a\u00020\u0011H\u0002J\u001e\u0010I\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0015\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016¢\u0006\u0002\u0010OJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0\r\"\u0004\b\u0001\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0\rH\u0016¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u000202H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006W"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "array", "", "offset", "length", "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "getSize", "()I", com.anythink.expressad.d.a.b.ay, "element", "(Ljava/lang/Object;)Z", "", la1.l, "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", la1.b, "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", la1.a, "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class iu4<E> extends qr4<E> implements List<E>, RandomAccess, Serializable, r35 {
    @NotNull
    private E[] s;
    private int t;
    private int u;
    private boolean v;
    @Nullable
    private final iu4<E> w;
    @Nullable
    private final iu4<E> x;

    /* compiled from: ListBuilder.kt */
    @vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", la1.l, "", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", com.anythink.expressad.d.a.b.ay, "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", la1.b, la1.a, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<E> implements ListIterator<E>, s35 {
        @NotNull
        private final iu4<E> s;
        private int t;
        private int u;

        public a(@NotNull iu4<E> iu4Var, int i) {
            c25.p(iu4Var, "list");
            this.s = iu4Var;
            this.t = i;
            this.u = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            iu4<E> iu4Var = this.s;
            int i = this.t;
            this.t = i + 1;
            iu4Var.add(i, e);
            this.u = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.t < ((iu4) this.s).u;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.t > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.t < ((iu4) this.s).u) {
                int i = this.t;
                this.t = i + 1;
                this.u = i;
                return (E) ((iu4) this.s).s[((iu4) this.s).t + this.u];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.t;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i = this.t;
            if (i > 0) {
                int i2 = i - 1;
                this.t = i2;
                this.u = i2;
                return (E) ((iu4) this.s).s[((iu4) this.s).t + this.u];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.t - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.u;
            if (i != -1) {
                this.s.remove(i);
                this.t = this.u;
                this.u = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            int i = this.u;
            if (i != -1) {
                this.s.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private iu4(E[] eArr, int i, int i2, boolean z, iu4<E> iu4Var, iu4<E> iu4Var2) {
        this.s = eArr;
        this.t = i;
        this.u = i2;
        this.v = z;
        this.w = iu4Var;
        this.x = iu4Var2;
    }

    private final void A(int i) {
        if (this.w != null) {
            throw new IllegalStateException();
        }
        if (i >= 0) {
            E[] eArr = this.s;
            if (i > eArr.length) {
                this.s = (E[]) ju4.e(this.s, vr4.s.a(eArr.length, i));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void B(int i) {
        A(this.u + i);
    }

    private final void D(int i, int i2) {
        B(i2);
        E[] eArr = this.s;
        zr4.c1(eArr, eArr, i + i2, i, this.t + this.u);
        this.u += i2;
    }

    private final boolean E() {
        iu4<E> iu4Var;
        return this.v || ((iu4Var = this.x) != null && iu4Var.v);
    }

    private final E G(int i) {
        iu4<E> iu4Var = this.w;
        if (iu4Var != null) {
            this.u--;
            return iu4Var.G(i);
        }
        E[] eArr = this.s;
        E e = eArr[i];
        zr4.c1(eArr, eArr, i, i + 1, this.t + this.u);
        ju4.f(this.s, (this.t + this.u) - 1);
        this.u--;
        return e;
    }

    private final void H(int i, int i2) {
        iu4<E> iu4Var = this.w;
        if (iu4Var != null) {
            iu4Var.H(i, i2);
        } else {
            E[] eArr = this.s;
            zr4.c1(eArr, eArr, i, i + i2, this.u);
            E[] eArr2 = this.s;
            int i3 = this.u;
            ju4.g(eArr2, i3 - i2, i3);
        }
        this.u -= i2;
    }

    private final int I(int i, int i2, Collection<? extends E> collection, boolean z) {
        iu4<E> iu4Var = this.w;
        if (iu4Var != null) {
            int I = iu4Var.I(i, i2, collection, z);
            this.u -= I;
            return I;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.s[i5]) == z) {
                E[] eArr = this.s;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.s;
        zr4.c1(eArr2, eArr2, i + i4, i2 + i, this.u);
        E[] eArr3 = this.s;
        int i7 = this.u;
        ju4.g(eArr3, i7 - i6, i7);
        this.u -= i6;
        return i6;
    }

    private final Object J() {
        if (E()) {
            return new ou4(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void p(int i, Collection<? extends E> collection, int i2) {
        iu4<E> iu4Var = this.w;
        if (iu4Var != null) {
            iu4Var.p(i, collection, i2);
            this.s = this.w.s;
            this.u += i2;
            return;
        }
        D(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.s[i + i3] = it.next();
        }
    }

    private final void t(int i, E e) {
        iu4<E> iu4Var = this.w;
        if (iu4Var != null) {
            iu4Var.t(i, e);
            this.s = this.w.s;
            this.u++;
            return;
        }
        D(i, 1);
        this.s[i] = e;
    }

    private final void x() {
        if (E()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean y(List<?> list) {
        boolean h;
        h = ju4.h(this.s, this.t, this.u, list);
        return h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        x();
        t(this.t + this.u, e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        c25.p(collection, "elements");
        x();
        int size = collection.size();
        p(this.t + this.u, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        x();
        H(this.t, this.u);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        return obj == this || ((obj instanceof List) && y((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        nr4.s.b(i, this.u);
        return this.s[this.t + i];
    }

    @Override // com.p7700g.p99005.qr4
    public int h() {
        return this.u;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = ju4.i(this.s, this.t, this.u);
        return i;
    }

    @Override // com.p7700g.p99005.qr4
    public E i(int i) {
        x();
        nr4.s.b(i, this.u);
        return G(this.t + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.u; i++) {
            if (c25.g(this.s[this.t + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.u == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.u - 1; i >= 0; i--) {
            if (c25.g(this.s[this.t + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        x();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> collection) {
        c25.p(collection, "elements");
        x();
        return I(this.t, this.u, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> collection) {
        c25.p(collection, "elements");
        x();
        return I(this.t, this.u, collection, true) > 0;
    }

    @Override // com.p7700g.p99005.qr4, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        x();
        nr4.s.b(i, this.u);
        E[] eArr = this.s;
        int i2 = this.t;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i, int i2) {
        nr4.s.d(i, i2, this.u);
        E[] eArr = this.s;
        int i3 = this.t + i;
        int i4 = i2 - i;
        boolean z = this.v;
        iu4<E> iu4Var = this.x;
        return new iu4(eArr, i3, i4, z, this, iu4Var == null ? this : iu4Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        c25.p(tArr, "destination");
        int length = tArr.length;
        int i = this.u;
        if (length < i) {
            E[] eArr = this.s;
            int i2 = this.t;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            c25.o(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.s;
        c25.n(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i3 = this.t;
        zr4.c1(eArr2, tArr, 0, i3, this.u + i3);
        int length2 = tArr.length;
        int i4 = this.u;
        if (length2 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        String j;
        j = ju4.j(this.s, this.t, this.u);
        return j;
    }

    @NotNull
    public final List<E> u() {
        if (this.w == null) {
            x();
            this.v = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i) {
        nr4.s.c(i, this.u);
        return new a(this, i);
    }

    @Override // com.p7700g.p99005.qr4, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        x();
        nr4.s.c(i, this.u);
        t(this.t + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        c25.p(collection, "elements");
        x();
        nr4.s.c(i, this.u);
        int size = collection.size();
        p(this.t + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        E[] eArr = this.s;
        int i = this.t;
        Object[] M1 = zr4.M1(eArr, i, this.u + i);
        c25.n(M1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return M1;
    }

    public iu4() {
        this(10);
    }

    public iu4(int i) {
        this(ju4.d(i), 0, 0, false, null, null);
    }
}