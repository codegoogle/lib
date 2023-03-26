package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class j70 {
    public static final String a = "Trace";
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    private j70() {
    }

    @SuppressLint({"NewApi"})
    public static void a(@x1 String str, int i) {
        try {
            if (d == null) {
                l70.a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i);
    }

    private static void b(@x1 String str, int i) {
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            g("asyncTraceBegin", e2);
        }
    }

    public static void c(@x1 String str) {
        k70.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@x1 String str, int i) {
        try {
            if (e == null) {
                l70.b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i);
    }

    private static void e(@x1 String str, int i) {
        try {
            if (e == null) {
                e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            e.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            g("asyncTraceEnd", e2);
        }
    }

    public static void f() {
        k70.b();
    }

    private static void g(@x1 String str, @x1 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (c == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception e2) {
            g("isTagEnabled", e2);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@x1 String str, int i) {
        try {
            if (f == null) {
                l70.c(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i);
    }

    private static void k(@x1 String str, int i) {
        try {
            if (f == null) {
                f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f.invoke(null, Long.valueOf(b), str, Integer.valueOf(i));
        } catch (Exception e2) {
            g("traceCounter", e2);
        }
    }
}