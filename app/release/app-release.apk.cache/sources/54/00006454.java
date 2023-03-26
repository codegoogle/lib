package com.p7700g.p99005;

/* compiled from: SimpleResource.java */
/* loaded from: classes2.dex */
public class wu1<T> implements cs1<T> {
    public final T s;

    public wu1(@x1 T t) {
        this.s = (T) x02.d(t);
    }

    @Override // com.p7700g.p99005.cs1
    public void a() {
    }

    @Override // com.p7700g.p99005.cs1
    public final int c() {
        return 1;
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public Class<T> d() {
        return (Class<T>) this.s.getClass();
    }

    @Override // com.p7700g.p99005.cs1
    @x1
    public final T get() {
        return this.s;
    }
}