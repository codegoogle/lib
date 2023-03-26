package com.p7700g.p99005;

import com.p7700g.p99005.e24;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: SpliteratorBase.java */
/* loaded from: classes3.dex */
public abstract class w24<S extends e24, T> implements v44<S, T> {
    public long a;
    public boolean b;

    @Override // java.util.Spliterator
    public int characteristics() {
        return 20821;
    }

    public void d(Iterator<T> it, Consumer<? super T> consumer, long j) {
        while (this.a < j) {
            try {
                T next = it.next();
                this.a++;
                consumer.accept(next);
            } catch (NoSuchElementException unused) {
                return;
            }
        }
    }

    public boolean e(Iterator<T> it, Consumer<? super T> consumer) {
        try {
            T next = it.next();
            this.a++;
            consumer.accept(next);
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.p7700g.p99005.v44, java.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return u44.a(this);
    }

    public String toString() {
        StringBuilder G = wo1.G("spliterator for ");
        G.append(a());
        return G.toString();
    }

    @Override // com.p7700g.p99005.v44, java.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        Spliterator trySplit;
        trySplit = trySplit();
        return trySplit;
    }
}