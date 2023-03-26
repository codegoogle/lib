package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.f54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: AddressTrieOps.java */
/* loaded from: classes3.dex */
public interface d54<E extends n04> extends o54<E> {

    /* compiled from: AddressTrieOps.java */
    /* loaded from: classes3.dex */
    public interface a<E extends n04> extends d54<E> {
        a54.g<E> E2(E e);

        a54.g<E> f3(a54.g<E> gVar);

        boolean z(E e);
    }

    /* compiled from: AddressTrieOps.java */
    /* loaded from: classes3.dex */
    public interface b<K extends n04, V> extends d54<K> {
        V F(K k);
    }

    /* compiled from: AddressTrieOps.java */
    /* loaded from: classes3.dex */
    public interface c<K extends n04, V> extends b<K, V> {
        f54.a<K, V> B2(K k, Function<? super V, ? extends V> function);

        boolean J1(K k, V v);

        f54.a<K, V> J2(K k, Supplier<? extends V> supplier, boolean z);

        f54.a<K, V> U2(f54.a<K, V> aVar);

        V Y(K k, V v);

        f54.a<K, V> a3(K k, V v);
    }

    boolean A4(E e);

    a54.g<E> K(E e);

    boolean K1(E e);

    boolean K2(E e);

    a54.g<E> L2(E e);

    a54.g<E> M2();

    a54.g<E> O2(E e);

    a54.g<E> T1(E e);

    a54.g<E> W(E e);

    a54.g<E> d4();

    a54.g<E> h2();

    @Override // com.p7700g.p99005.o54
    Iterator<? extends a54.g<E>> j(boolean z);

    a54.g<E> j4();

    @Override // com.p7700g.p99005.o54
    Spliterator<? extends a54.g<E>> k(boolean z);

    @Override // com.p7700g.p99005.o54
    Spliterator<? extends a54.g<E>> l(boolean z);

    E l4(E e);

    a54.g<E> n2(E e);

    @Override // com.p7700g.p99005.o54
    Iterator<? extends a54.g<E>> q(boolean z);

    @Override // com.p7700g.p99005.o54
    <C> g54.e<? extends a54.g<E>, E, C> r(boolean z);

    @Override // com.p7700g.p99005.o54
    Iterator<? extends a54.g<E>> s(boolean z);

    a54.g<E> t2(E e);

    a54.g<E> u3(E e);

    a54.g<E> u4(E e);

    @Override // com.p7700g.p99005.o54
    Iterator<? extends a54.g<E>> v(boolean z);

    @Override // com.p7700g.p99005.o54
    <C> g54.e<? extends a54.g<E>, E, C> w(boolean z);

    a54.g<E> y3(E e);
}