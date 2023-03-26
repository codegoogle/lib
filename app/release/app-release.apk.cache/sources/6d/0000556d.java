package com.p7700g.p99005;

import com.p7700g.p99005.g24;
import com.p7700g.p99005.q04;
import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

/* compiled from: AddressSeriesSpliterator.java */
/* loaded from: classes3.dex */
public class p24<T extends q04> extends g24.a<T, T> implements x44<T> {
    public p24(T t, Predicate<g24.e<T, T>> predicate, g24.d<T, T> dVar, Function<T, BigInteger> function, Predicate<T> predicate2, ToLongFunction<T> toLongFunction) {
        super(t, predicate, dVar, function, predicate2, toLongFunction);
    }

    @Override // com.p7700g.p99005.g24.a
    /* renamed from: r */
    public p24<T> h(T t, boolean z, Function<T, BigInteger> function, Predicate<T> predicate, ToLongFunction<T> toLongFunction) {
        return new p24<>(t, this.s, this.k, z, function, predicate, toLongFunction);
    }

    @Override // com.p7700g.p99005.g24.a, com.p7700g.p99005.w24, com.p7700g.p99005.v44, java.util.Spliterator
    /* renamed from: s */
    public p24<T> trySplit() {
        return (p24) super.trySplit();
    }

    public p24(T t, Predicate<g24.e<T, T>> predicate, g24.d<T, T> dVar, boolean z, Function<T, BigInteger> function, Predicate<T> predicate2, ToLongFunction<T> toLongFunction) {
        super(t, predicate, dVar, z, false, function, predicate2, toLongFunction);
    }
}