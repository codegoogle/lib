package com.p7700g.p99005;

/* compiled from: Logging.java */
/* loaded from: classes2.dex */
public final class d72 {
    private d72() {
    }

    public static void a(String str, String str2) {
        f(str);
    }

    public static void b(String str, String str2, Object obj) {
        f(str);
        String.format(str2, obj);
    }

    public static void c(String str, String str2, Object obj, Object obj2) {
        f(str);
        String.format(str2, obj, obj2);
    }

    public static void d(String str, String str2, Object... objArr) {
        f(str);
        String.format(str2, objArr);
    }

    public static void e(String str, String str2, Throwable th) {
        f(str);
    }

    private static String f(String str) {
        return wo1.t("TransportRuntime.", str);
    }

    public static void g(String str, String str2) {
        f(str);
    }

    public static void h(String str, String str2, Object obj) {
        f(str);
        String.format(str2, obj);
    }
}