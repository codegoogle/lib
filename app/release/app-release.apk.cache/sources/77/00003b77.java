package com.p7700g.p99005;

/* compiled from: VASTLog.java */
/* loaded from: classes3.dex */
public class bq5 {
    private static String a = "com.p7700g.p99005.bq5";
    private static a b = a.verbose;

    /* compiled from: VASTLog.java */
    /* loaded from: classes3.dex */
    public enum a {
        verbose(1),
        debug(2),
        info(3),
        warning(4),
        error(5),
        none(6);
        
        private int z;

        a(int value) {
            this.z = value;
        }

        public int f() {
            return this.z;
        }
    }

    public static void a(String tag, String msg) {
        b.f();
        a.debug.f();
    }

    public static void b(String tag, String msg) {
        b.f();
        a.error.f();
    }

    public static void c(String tag, String msg, Throwable tr) {
        b.f();
        a.error.f();
    }

    public static a d() {
        return b;
    }

    public static void e(String tag, String msg) {
        b.f();
        a.info.f();
    }

    public static void f(a logLevel) {
        StringBuilder G = wo1.G("Changing logging level from :");
        G.append(b);
        G.append(". To:");
        G.append(logLevel);
        G.toString();
        b = logLevel;
    }

    public static void g(String tag, String msg) {
        b.f();
        a.verbose.f();
    }

    public static void h(String tag, String msg) {
        b.f();
        a.warning.f();
    }
}