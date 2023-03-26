package com.p7700g.p99005;

/* compiled from: LazyVal.java */
/* loaded from: classes3.dex */
public abstract class ex3<T> {
    private volatile T a;

    public T a() {
        T t = this.a;
        if (t == null) {
            synchronized (this) {
                t = this.a;
                if (t == null) {
                    t = b();
                    this.a = t;
                }
            }
        }
        return t;
    }

    public abstract T b();

    public void c(T t) {
        this.a = t;
    }
}