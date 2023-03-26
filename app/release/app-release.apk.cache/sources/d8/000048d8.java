package com.p7700g.p99005;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class in {
    private static final String a = "TraceCompat";
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    /* compiled from: TraceCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(String str) {
            Trace.beginSection(str);
        }

        @e1
        public static void b() {
            Trace.endSection();
        }
    }

    /* compiled from: TraceCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @e1
        public static void b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @e1
        public static boolean c() {
            return Trace.isEnabled();
        }

        @e1
        public static void d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    private in() {
    }

    public static void a(@x1 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i);
            return;
        }
        try {
            d.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void b(@x1 String str) {
        a.a(str);
    }

    public static void c(@x1 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i);
            return;
        }
        try {
            e.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }

    public static void d() {
        a.b();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(@x1 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i);
            return;
        }
        try {
            f.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception unused) {
        }
    }
}