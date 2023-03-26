package com.p7700g.p99005;

import com.google.auto.value.AutoValue;

/* compiled from: Event.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class c32<T> {
    public static <T> c32<T> d(int i, T t) {
        return new z22(Integer.valueOf(i), t, d32.DEFAULT);
    }

    public static <T> c32<T> e(T t) {
        return new z22(null, t, d32.DEFAULT);
    }

    public static <T> c32<T> f(int i, T t) {
        return new z22(Integer.valueOf(i), t, d32.VERY_LOW);
    }

    public static <T> c32<T> g(T t) {
        return new z22(null, t, d32.VERY_LOW);
    }

    public static <T> c32<T> h(int i, T t) {
        return new z22(Integer.valueOf(i), t, d32.HIGHEST);
    }

    public static <T> c32<T> i(T t) {
        return new z22(null, t, d32.HIGHEST);
    }

    @z1
    public abstract Integer a();

    public abstract T b();

    public abstract d32 c();
}