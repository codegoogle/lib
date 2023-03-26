package com.p7700g.p99005;

import android.os.Looper;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ANRError.java */
/* loaded from: classes3.dex */
public class oy2 extends Error {
    private static final long s = 1;

    /* compiled from: ANRError.java */
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        private final String s;
        private final StackTraceElement[] t;

        /* compiled from: ANRError.java */
        /* renamed from: com.p7700g.p99005.oy2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0225a extends Throwable {
            public /* synthetic */ C0225a(a aVar, C0225a c0225a, b bVar) {
                this(c0225a);
            }

            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                setStackTrace(a.this.t);
                return this;
            }

            private C0225a(C0225a other) {
                super(a.this.s, other);
            }
        }

        public /* synthetic */ a(String str, StackTraceElement[] stackTraceElementArr, b bVar) {
            this(str, stackTraceElementArr);
        }

        private a(String name, StackTraceElement[] stackTrace) {
            this.s = name;
            this.t = stackTrace;
        }
    }

    /* compiled from: ANRError.java */
    /* loaded from: classes3.dex */
    public class b implements Comparator<Thread> {
        public final /* synthetic */ Thread s;

        public b(final Thread val$mainThread) {
            this.s = val$mainThread;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Thread lhs, Thread rhs) {
            if (lhs == rhs) {
                return 0;
            }
            Thread thread = this.s;
            if (lhs == thread) {
                return 1;
            }
            if (rhs == thread) {
                return -1;
            }
            return rhs.getName().compareTo(lhs.getName());
        }
    }

    private oy2(a.C0225a st) {
        super("Application Not Responding", st);
    }

    public static oy2 a(String prefix, boolean logThreadsWithoutStackTrace) {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new b(thread));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(prefix) && (logThreadsWithoutStackTrace || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        a.C0225a c0225a = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            c0225a = new a.C0225a(new a(g((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), null), c0225a, null);
        }
        return new oy2(c0225a);
    }

    public static oy2 f() {
        Thread thread = Looper.getMainLooper().getThread();
        return new oy2(new a.C0225a(new a(g(thread), thread.getStackTrace(), null), null, null));
    }

    private static String g(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}