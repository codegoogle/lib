package com.p7700g.p99005;

/* compiled from: Lazy.java */
/* loaded from: classes3.dex */
public class ep2<T> implements er2<T> {
    private static final Object a = new Object();
    private volatile Object b;
    private volatile er2<T> c;

    public ep2(T t) {
        this.b = a;
        this.b = t;
    }

    @r2
    public boolean a() {
        return this.b != a;
    }

    @Override // com.p7700g.p99005.er2
    public T get() {
        T t = (T) this.b;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.c.get();
                    this.b = t;
                    this.c = null;
                }
            }
        }
        return t;
    }

    public ep2(er2<T> er2Var) {
        this.b = a;
        this.c = er2Var;
    }
}