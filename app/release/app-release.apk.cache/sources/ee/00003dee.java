package com.p7700g.p99005;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

/* compiled from: AddressComponentRange.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class d24 {
    public static /* synthetic */ Stream a(Stream stream) {
        return stream;
    }

    public static /* synthetic */ Stream b(Stream stream) {
        return stream;
    }

    public static <T extends q04> Stream<T> c(Function<T, Stream<? extends T>> function, Collection<? extends T> collection) {
        return collection.stream().map(function).flatMap(b24.a);
    }

    @SafeVarargs
    public static <T extends q04> Stream<T> d(Function<T, Stream<? extends T>> function, T... tArr) {
        return Arrays.stream(tArr).map(function).flatMap(a24.a);
    }
}