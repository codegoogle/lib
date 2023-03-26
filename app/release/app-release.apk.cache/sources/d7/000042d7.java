package com.p7700g.p99005;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes3.dex */
public class fp2<T> implements er2<Set<T>> {
    private volatile Set<T> b = null;
    private volatile Set<er2<T>> a = Collections.newSetFromMap(new ConcurrentHashMap());

    public fp2(Collection<er2<T>> collection) {
        this.a.addAll(collection);
    }

    public static fp2<?> b(Collection<er2<?>> collection) {
        return new fp2<>((Set) collection);
    }

    private synchronized void d() {
        for (er2<T> er2Var : this.a) {
            this.b.add(er2Var.get());
        }
        this.a = null;
    }

    public synchronized void a(er2<T> er2Var) {
        if (this.b == null) {
            this.a.add(er2Var);
        } else {
            this.b.add(er2Var.get());
        }
    }

    @Override // com.p7700g.p99005.er2
    /* renamed from: c */
    public Set<T> get() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}