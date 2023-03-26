package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: ObjectHelper.java */
/* loaded from: classes2.dex */
public final class r81 {
    private r81() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> T a(@z1 T t) {
        return t;
    }

    public static void b(@z1 Object obj) {
        c(obj, null);
    }

    public static void c(@z1 Object obj, @z1 String str) {
        Objects.requireNonNull(obj, str);
    }

    public static boolean d(@z1 Object obj, @z1 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int e(@z1 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @x1
    public static <T> T f(@z1 T t) {
        return (T) g(t, null);
    }

    @x1
    public static <T> T g(@z1 T t, @z1 String str) {
        c(t, str);
        return t;
    }
}