package com.p7700g.p99005;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: Iterables.kt */
@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0006H\u0096\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/IndexingIterable;", "T", "", "Lkotlin/collections/IndexedValue;", "iteratorFactory", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "iterator", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class dt4<T> implements Iterable<ct4<? extends T>>, n35 {
    @NotNull
    private final uz4<Iterator<T>> s;

    /* JADX WARN: Multi-variable type inference failed */
    public dt4(@NotNull uz4<? extends Iterator<? extends T>> uz4Var) {
        c25.p(uz4Var, "iteratorFactory");
        this.s = uz4Var;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<ct4<T>> iterator() {
        return new et4(this.s.x());
    }
}