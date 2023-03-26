package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* compiled from: UShortArray.kt */
@dz4
@go4
@vo4(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0014\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0014\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r\u0088\u0001\u0007\u0092\u0001\u00020\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u00063"}, d2 = {"Lkotlin/UShortArray;", "", "Lkotlin/UShort;", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "", "constructor-impl", "(I)[S", "storage", "", "([S)[S", "getSize-impl", "([S)I", "getStorage$annotations", "()V", "contains", "", "element", "contains-xj2QHRw", "([SS)Z", "containsAll", "elements", "containsAll-impl", "([SLjava/util/Collection;)Z", "equals", "other", "", "equals-impl", "([SLjava/lang/Object;)Z", "get", la1.l, "get-Mh2AYeg", "([SI)S", "hashCode", "hashCode-impl", "isEmpty", "isEmpty-impl", "([S)Z", "iterator", "", "iterator-impl", "([S)Ljava/util/Iterator;", la1.a, "", "value", "set-01HTLdE", "([SIS)V", "toString", "", "toString-impl", "([S)Ljava/lang/String;", "Iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public final class uq4 implements Collection<tq4>, n35 {
    @NotNull
    private final short[] s;

    /* compiled from: UShortArray.kt */
    @vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlin/UShortArray$Iterator;", "", "Lkotlin/UShort;", "array", "", "([S)V", la1.l, "", "hasNext", "", "next", "next-Mh2AYeg", "()S", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<tq4>, n35 {
        @NotNull
        private final short[] s;
        private int t;

        public a(@NotNull short[] sArr) {
            c25.p(sArr, "array");
            this.s = sArr;
        }

        public short a() {
            int i = this.t;
            short[] sArr = this.s;
            if (i < sArr.length) {
                this.t = i + 1;
                return tq4.h(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.t));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.t < this.s.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ tq4 next() {
            return tq4.b(a());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @np4
    private /* synthetic */ uq4(short[] sArr) {
        this.s = sArr;
    }

    @NotNull
    public static Iterator<tq4> A(short[] sArr) {
        return new a(sArr);
    }

    public static final void B(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static String C(short[] sArr) {
        StringBuilder G = wo1.G("UShortArray(storage=");
        G.append(Arrays.toString(sArr));
        G.append(')');
        return G.toString();
    }

    public static final /* synthetic */ uq4 b(short[] sArr) {
        return new uq4(sArr);
    }

    @NotNull
    public static short[] c(int i) {
        return d(new short[i]);
    }

    @np4
    @NotNull
    public static short[] d(@NotNull short[] sArr) {
        c25.p(sArr, "storage");
        return sArr;
    }

    public static boolean h(short[] sArr, short s) {
        return as4.U8(sArr, s);
    }

    public static boolean i(short[] sArr, @NotNull Collection<tq4> collection) {
        boolean z;
        c25.p(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if ((obj instanceof tq4) && as4.U8(sArr, ((tq4) obj).c1())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m(short[] sArr, Object obj) {
        return (obj instanceof uq4) && c25.g(sArr, ((uq4) obj).D());
    }

    public static final boolean n(short[] sArr, short[] sArr2) {
        return c25.g(sArr, sArr2);
    }

    public static final short o(short[] sArr, int i) {
        return tq4.h(sArr[i]);
    }

    public static int t(short[] sArr) {
        return sArr.length;
    }

    @np4
    public static /* synthetic */ void u() {
    }

    public static int x(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static boolean y(short[] sArr) {
        return sArr.length == 0;
    }

    public final /* synthetic */ short[] D() {
        return this.s;
    }

    public boolean a(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(tq4 tq4Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends tq4> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof tq4) {
            return e(((tq4) obj).c1());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        c25.p(collection, "elements");
        return i(this.s, collection);
    }

    public boolean e(short s) {
        return h(this.s, s);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m(this.s, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return x(this.s);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return y(this.s);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<tq4> iterator() {
        return A(this.s);
    }

    @Override // java.util.Collection
    /* renamed from: p */
    public int size() {
        return t(this.s);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return n15.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        c25.p(tArr, "array");
        return (T[]) n15.b(this, tArr);
    }

    public String toString() {
        return C(this.s);
    }
}