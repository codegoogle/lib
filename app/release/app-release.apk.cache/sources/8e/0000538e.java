package com.p7700g.p99005;

import com.p7700g.p99005.f24;
import com.p7700g.p99005.x04;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: AddressSegmentSpliterator.java */
/* loaded from: classes3.dex */
public class o24<T extends x04> extends w24<T, T> implements x44<T> {
    private Iterator<T> c;
    private T d;
    private T e;
    private int f;
    private int g;
    private Supplier<Iterator<T>> h;
    public boolean i;
    private final boolean j;
    private final f24.a<T> k;
    private final f24.b<T> l;

    public o24(int i, int i2, Supplier<Iterator<T>> supplier, f24.a<T> aVar, f24.b<T> bVar) {
        this(null, i, i2, supplier, aVar, bVar);
    }

    private int h() {
        return this.f + ((int) this.a);
    }

    private Iterator<T> i() {
        if (this.c == null) {
            Supplier<Iterator<T>> supplier = this.h;
            if (supplier != null) {
                this.c = supplier.get();
            } else {
                this.c = this.k.a(this.i, this.j, this.f, this.g);
            }
        }
        return this.c;
    }

    @Override // com.p7700g.p99005.v44
    public BigInteger c() {
        return BigInteger.valueOf(estimateSize());
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        return (this.g - h()) + 1;
    }

    @Override // com.p7700g.p99005.v44, com.p7700g.p99005.g24.e
    /* renamed from: f */
    public T a() {
        T t = this.d;
        if (t == null) {
            T a = this.l.a(this.f, this.g);
            this.d = a;
            return a;
        }
        return t;
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(Consumer<? super T> consumer) {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            this.e = null;
            d(i(), consumer, (this.g - this.f) + 1);
        } finally {
            this.b = false;
        }
    }

    public T g() {
        if (estimateSize() == 0) {
            return null;
        }
        T t = this.e;
        if (t == null) {
            T a = this.l.a(h(), this.g);
            this.e = a;
            return a;
        }
        return t;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<? super T> consumer) {
        if (this.b || h() >= this.g) {
            return false;
        }
        this.e = null;
        return e(i(), consumer);
    }

    public o24(T t, int i, int i2, Supplier<Iterator<T>> supplier, f24.a<T> aVar, f24.b<T> bVar) {
        this(i, i2, supplier, aVar, true, true, bVar);
        this.d = t;
    }

    @Override // com.p7700g.p99005.w24, com.p7700g.p99005.v44, java.util.Spliterator
    public x44<T> trySplit() {
        int h;
        int h2;
        if (!this.b && (h2 = this.g - (h = h())) > 1) {
            this.d = null;
            this.e = null;
            this.h = null;
            int i = h + (h2 >>> 1);
            this.f = i + 1;
            this.a = 0L;
            o24 o24Var = new o24(h, i, null, this.k, this.i, false, this.l);
            o24Var.c = this.c;
            this.i = false;
            this.c = null;
            return o24Var;
        }
        return null;
    }

    private o24(int i, int i2, Supplier<Iterator<T>> supplier, f24.a<T> aVar, boolean z, boolean z2, f24.b<T> bVar) {
        this.h = supplier;
        this.k = aVar;
        this.i = z;
        this.j = z2;
        this.l = bVar;
        this.f = i;
        this.g = i2;
    }
}