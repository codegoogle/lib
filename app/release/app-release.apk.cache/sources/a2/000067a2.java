package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: OSTaskController.java */
/* loaded from: classes3.dex */
public class yl3 {
    public static final String a = "OS_PENDING_EXECUTOR_";
    private final ConcurrentLinkedQueue<Runnable> b = new ConcurrentLinkedQueue<>();
    private final AtomicLong c = new AtomicLong();
    private ExecutorService d;
    public final tk3 e;

    /* compiled from: OSTaskController.java */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@x1 Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder G = wo1.G(yl3.a);
            G.append(thread.getId());
            thread.setName(G.toString());
            return thread;
        }
    }

    /* compiled from: OSTaskController.java */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {
        private yl3 s;
        private Runnable t;
        private long u;

        public b(yl3 yl3Var, Runnable runnable) {
            this.s = yl3Var;
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.t.run();
            this.s.e(this.u);
        }

        public String toString() {
            StringBuilder G = wo1.G("PendingTaskRunnable{innerTask=");
            G.append(this.t);
            G.append(", taskId=");
            G.append(this.u);
            G.append('}');
            return G.toString();
        }
    }

    public yl3(tk3 tk3Var) {
        this.e = tk3Var;
    }

    private void b(b bVar) {
        bVar.u = this.c.incrementAndGet();
        ExecutorService executorService = this.d;
        if (executorService == null) {
            tk3 tk3Var = this.e;
            StringBuilder G = wo1.G("Adding a task to the pending queue with ID: ");
            G.append(bVar.u);
            tk3Var.b(G.toString());
            this.b.add(bVar);
        } else if (executorService.isShutdown()) {
        } else {
            tk3 tk3Var2 = this.e;
            StringBuilder G2 = wo1.G("Executor is still running, add to the executor with ID: ");
            G2.append(bVar.u);
            tk3Var2.b(G2.toString());
            try {
                this.d.submit(bVar);
            } catch (RejectedExecutionException e) {
                tk3 tk3Var3 = this.e;
                StringBuilder G3 = wo1.G("Executor is shutdown, running task manually with ID: ");
                G3.append(bVar.u);
                tk3Var3.f(G3.toString());
                bVar.run();
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j) {
        if (this.c.get() == j) {
            jm3.a(jm3.u0.INFO, "Last Pending Task has ran, shutting down");
            this.d.shutdown();
        }
    }

    public void c(Runnable runnable) {
        b(new b(this, runnable));
    }

    public ConcurrentLinkedQueue<Runnable> d() {
        return this.b;
    }

    public boolean f() {
        if (Thread.currentThread().getName().contains(a)) {
            return false;
        }
        if (jm3.v1() && this.d == null) {
            return false;
        }
        if (jm3.v1() || this.d != null) {
            return !this.d.isShutdown();
        }
        return true;
    }

    public void g() {
        ExecutorService executorService = this.d;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public void h() {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("startPendingTasks with task queue quantity: ");
        G.append(this.b.size());
        jm3.a(u0Var, G.toString());
        if (this.b.isEmpty()) {
            return;
        }
        this.d = Executors.newSingleThreadExecutor(new a());
        while (!this.b.isEmpty()) {
            this.d.submit(this.b.poll());
        }
    }
}