package com.p7700g.p99005;

import com.p7700g.p99005.g54;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Spliterator;

/* compiled from: TreeOps.java */
/* loaded from: classes3.dex */
public interface o54<E> extends Iterable<E>, Serializable, Cloneable {
    Spliterator<E> c3();

    Iterator<E> descendingIterator();

    @Override // java.lang.Iterable
    Iterator<E> iterator();

    Iterator<? extends g54<E>> j(boolean z);

    Spliterator<? extends g54<E>> k(boolean z);

    Spliterator<? extends g54<E>> l(boolean z);

    Iterator<? extends g54<E>> q(boolean z);

    <C> g54.e<? extends g54<E>, E, C> r(boolean z);

    Iterator<? extends g54<E>> s(boolean z);

    @Override // java.lang.Iterable
    Spliterator<E> spliterator();

    Iterator<? extends g54<E>> v(boolean z);

    <C> g54.e<? extends g54<E>, E, C> w(boolean z);
}