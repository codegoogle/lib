package com.p7700g.p99005;

import com.p7700g.p99005.e24;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.Spliterator;

/* compiled from: AddressComponentRangeSpliterator.java */
/* loaded from: classes3.dex */
public interface v44<S extends e24, T> extends Spliterator<T> {
    S a();

    BigInteger c();

    @Override // java.util.Spliterator
    Comparator<? super T> getComparator();

    @Override // java.util.Spliterator
    v44<S, T> trySplit();

    @Override // java.util.Spliterator
    /* bridge */ /* synthetic */ Spliterator trySplit();
}