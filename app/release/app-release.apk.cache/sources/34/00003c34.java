package com.p7700g.p99005;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzajn;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes3.dex */
public class c53 {
    public static String a = "Volley";
    public static boolean b = Log.isLoggable(zzajn.zza, 2);
    private static final String c = c53.class.getName();

    /* compiled from: VolleyLog.java */
    /* loaded from: classes3.dex */
    public static class a {
        public static final boolean a = c53.b;
        private static final long b = 0;
        private final List<C0153a> c = new ArrayList();
        private boolean d = false;

        /* compiled from: VolleyLog.java */
        /* renamed from: com.p7700g.p99005.c53$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0153a {
            public final String a;
            public final long b;
            public final long c;

            public C0153a(String name, long thread, long time) {
                this.a = name;
                this.b = thread;
                this.c = time;
            }
        }

        private long c() {
            if (this.c.size() == 0) {
                return 0L;
            }
            long j = this.c.get(0).c;
            List<C0153a> list = this.c;
            return list.get(list.size() - 1).c - j;
        }

        public synchronized void a(String name, long threadId) {
            if (!this.d) {
                this.c.add(new C0153a(name, threadId, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String header) {
            this.d = true;
            long c = c();
            if (c <= 0) {
                return;
            }
            long j = this.c.get(0).c;
            c53.b("(%-4d ms) %s", Long.valueOf(c), header);
            for (C0153a c0153a : this.c) {
                long j2 = c0153a.c;
                c53.b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c0153a.b), c0153a.a);
                j = j2;
            }
        }

        public void finalize() throws Throwable {
            if (this.d) {
                return;
            }
            b("Request on the loose");
            c53.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String format, Object... args) {
        String str;
        if (args != null) {
            format = String.format(Locale.US, format, args);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder L = wo1.L(substring.substring(substring.lastIndexOf(36) + 1), CryptoConstants.ALIAS_SEPARATOR);
                L.append(stackTrace[i].getMethodName());
                str = L.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str, format);
    }

    public static void b(String format, Object... args) {
        a(format, args);
    }

    public static void c(String format, Object... args) {
        a(format, args);
    }

    public static void d(Throwable tr, String format, Object... args) {
        a(format, args);
    }

    public static void e(String tag) {
        b("Changing log tag to %s", tag);
        a = tag;
        b = Log.isLoggable(tag, 2);
    }

    public static void f(String format, Object... args) {
        if (b) {
            a(format, args);
        }
    }

    public static void g(String format, Object... args) {
        Log.wtf(a, a(format, args));
    }

    public static void h(Throwable tr, String format, Object... args) {
        Log.wtf(a, a(format, args), tr);
    }
}