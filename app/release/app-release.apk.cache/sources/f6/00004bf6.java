package com.p7700g.p99005;

/* compiled from: InstanceFactory.java */
/* loaded from: classes2.dex */
public final class k62<T> implements h62<T>, u52<T> {
    private static final k62<Object> a = new k62<>(null);
    private final T b;

    private k62(T t) {
        this.b = t;
    }

    public static <T> h62<T> a(T t) {
        return new k62(q62.c(t, "instance cannot be null"));
    }

    public static <T> h62<T> b(T t) {
        if (t == null) {
            return c();
        }
        return new k62(t);
    }

    private static <T> k62<T> c() {
        return (k62<T>) a;
    }

    @Override // com.p7700g.p99005.ol4
    public T get() {
        return this.b;
    }
}