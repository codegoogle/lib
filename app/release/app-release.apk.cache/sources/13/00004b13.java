package com.p7700g.p99005;

/* compiled from: Event.java */
/* loaded from: classes3.dex */
public class jq2<T> {
    private final Class<T> a;
    private final T b;

    public jq2(Class<T> cls, T t) {
        this.a = (Class) ip2.b(cls);
        this.b = (T) ip2.b(t);
    }

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}