package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: Nulls.java */
/* loaded from: classes2.dex */
public class lj1 {
    @x1
    public static <T> T a(@z1 T t, @x1 String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    @x1
    public static <T> T b(@x1 dq0<T> dq0Var) {
        return (T) r81.g(dq0Var.F(), "task must have not null result");
    }
}