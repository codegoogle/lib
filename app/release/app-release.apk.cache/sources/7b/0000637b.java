package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class wf0 {
    private static final String a = tb0.f("WorkTimer");
    private final ThreadFactory b;
    private final ScheduledExecutorService c;
    public final Map<String, c> d;
    public final Map<String, b> e;
    public final Object f;

    /* compiled from: WorkTimer.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        private int a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@x1 Runnable r) {
            Thread newThread = Executors.defaultThreadFactory().newThread(r);
            StringBuilder G = wo1.G("WorkManager-WorkTimer-thread-");
            G.append(this.a);
            newThread.setName(G.toString());
            this.a++;
            return newThread;
        }
    }

    /* compiled from: WorkTimer.java */
    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public interface b {
        void a(@x1 String workSpecId);
    }

    /* compiled from: WorkTimer.java */
    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public static final String s = "WrkTimerRunnable";
        private final wf0 t;
        private final String u;

        public c(@x1 wf0 workTimer, @x1 String workSpecId) {
            this.t = workTimer;
            this.u = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.t.f) {
                if (this.t.d.remove(this.u) != null) {
                    b remove = this.t.e.remove(this.u);
                    if (remove != null) {
                        remove.a(this.u);
                    }
                } else {
                    tb0.c().a(s, String.format("Timer with %s is already marked as complete.", this.u), new Throwable[0]);
                }
            }
        }
    }

    public wf0() {
        a aVar = new a();
        this.b = aVar;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new Object();
        this.c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    @x1
    @r2
    public ScheduledExecutorService a() {
        return this.c;
    }

    @x1
    @r2
    public synchronized Map<String, b> b() {
        return this.e;
    }

    @x1
    @r2
    public synchronized Map<String, c> c() {
        return this.d;
    }

    public void d() {
        if (this.c.isShutdown()) {
            return;
        }
        this.c.shutdownNow();
    }

    public void e(@x1 final String workSpecId, long processingTimeMillis, @x1 b listener) {
        synchronized (this.f) {
            tb0.c().a(a, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            f(workSpecId);
            c cVar = new c(this, workSpecId);
            this.d.put(workSpecId, cVar);
            this.e.put(workSpecId, listener);
            this.c.schedule(cVar, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void f(@x1 final String workSpecId) {
        synchronized (this.f) {
            if (this.d.remove(workSpecId) != null) {
                tb0.c().a(a, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                this.e.remove(workSpecId);
            }
        }
    }
}