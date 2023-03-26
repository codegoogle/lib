package com.p7700g.p99005;

import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* loaded from: classes.dex */
public class ep {

    /* compiled from: ObjectsCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @e1
        public static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private ep() {
    }

    public static boolean a(@z1 Object obj, @z1 Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(@z1 Object... objArr) {
        return a.b(objArr);
    }

    public static int c(@z1 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @x1
    public static <T> T d(@z1 T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @x1
    public static <T> T e(@z1 T t, @x1 String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    @z1
    public static String f(@z1 Object obj, @z1 String str) {
        return obj != null ? obj.toString() : str;
    }
}