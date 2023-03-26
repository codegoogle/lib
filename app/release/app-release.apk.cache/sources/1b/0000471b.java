package com.p7700g.p99005;

import android.os.Process;
import com.p7700g.p99005.wr1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes2.dex */
public final class hr1 {
    private final boolean a;
    private final Executor b;
    @r2
    public final Map<gq1, d> c;
    private final ReferenceQueue<wr1<?>> d;
    private wr1.a e;
    private volatile boolean f;
    @z1
    private volatile c g;

    /* compiled from: ActiveResources.java */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.p7700g.p99005.hr1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0194a implements Runnable {
            public final /* synthetic */ Runnable s;

            public RunnableC0194a(Runnable runnable) {
                this.s = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.s.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@x1 Runnable runnable) {
            return new Thread(new RunnableC0194a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hr1.this.b();
        }
    }

    /* compiled from: ActiveResources.java */
    @r2
    /* loaded from: classes2.dex */
    public interface c {
        void a();
    }

    /* compiled from: ActiveResources.java */
    @r2
    /* loaded from: classes2.dex */
    public static final class d extends WeakReference<wr1<?>> {
        public final gq1 a;
        public final boolean b;
        @z1
        public cs1<?> c;

        public d(@x1 gq1 gq1Var, @x1 wr1<?> wr1Var, @x1 ReferenceQueue<? super wr1<?>> referenceQueue, boolean z) {
            super(wr1Var, referenceQueue);
            this.a = (gq1) x02.d(gq1Var);
            this.c = (wr1Var.f() && z) ? (cs1) x02.d(wr1Var.e()) : null;
            this.b = wr1Var.f();
        }

        public void a() {
            this.c = null;
            clear();
        }
    }

    public hr1(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new a()));
    }

    public synchronized void a(gq1 gq1Var, wr1<?> wr1Var) {
        d put = this.c.put(gq1Var, new d(gq1Var, wr1Var, this.d, this.a));
        if (put != null) {
            put.a();
        }
    }

    public void b() {
        while (!this.f) {
            try {
                c((d) this.d.remove());
                c cVar = this.g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void c(@x1 d dVar) {
        cs1<?> cs1Var;
        synchronized (this) {
            this.c.remove(dVar.a);
            if (dVar.b && (cs1Var = dVar.c) != null) {
                this.e.d(dVar.a, new wr1<>(cs1Var, true, false, dVar.a, this.e));
            }
        }
    }

    public synchronized void d(gq1 gq1Var) {
        d remove = this.c.remove(gq1Var);
        if (remove != null) {
            remove.a();
        }
    }

    @z1
    public synchronized wr1<?> e(gq1 gq1Var) {
        d dVar = this.c.get(gq1Var);
        if (dVar == null) {
            return null;
        }
        wr1<?> wr1Var = dVar.get();
        if (wr1Var == null) {
            c(dVar);
        }
        return wr1Var;
    }

    @r2
    public void f(c cVar) {
        this.g = cVar;
    }

    public void g(wr1.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.e = aVar;
            }
        }
    }

    @r2
    public void h() {
        this.f = true;
        Executor executor = this.b;
        if (executor instanceof ExecutorService) {
            q02.c((ExecutorService) executor);
        }
    }

    @r2
    public hr1(boolean z, Executor executor) {
        this.c = new HashMap();
        this.d = new ReferenceQueue<>();
        this.a = z;
        this.b = executor;
        executor.execute(new b());
    }
}