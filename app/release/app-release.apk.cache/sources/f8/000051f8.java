package com.p7700g.p99005;

/* compiled from: Function.java */
@FunctionalInterface
/* loaded from: classes2.dex */
public interface n91<T, R> {
    <V> n91<V, R> a(n91<? super V, ? extends T> n91Var);

    R apply(T t);

    <V> n91<T, V> b(n91<? super R, ? extends V> n91Var);
}