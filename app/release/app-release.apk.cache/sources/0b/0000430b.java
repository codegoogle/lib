package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TaskRunner.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0003/0\u0015B\u000f\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0019\u0010'\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b\"\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+¨\u00061"}, d2 = {"Lcom/p7700g/p99005/fs5;", "", "Lcom/p7700g/p99005/cs5;", "task", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/cs5;)V", "k", "", "delayNanos", "d", "(Lcom/p7700g/p99005/cs5;J)V", "Lcom/p7700g/p99005/es5;", "taskQueue", "i", "(Lcom/p7700g/p99005/es5;)V", "e", "()Lcom/p7700g/p99005/cs5;", "j", "()Lcom/p7700g/p99005/es5;", "", "c", "()Ljava/util/List;", com.anythink.basead.d.g.i, "()V", "", "Ljava/util/List;", "busyQueues", "", AFHydra.STATUS_IDLE, "nextQueueName", "", "Z", "coordinatorWaiting", "h", "readyQueues", "Lcom/p7700g/p99005/fs5$a;", "Lcom/p7700g/p99005/fs5$a;", "()Lcom/p7700g/p99005/fs5$a;", m31.b, "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "J", "coordinatorWakeUpAt", "<init>", "(Lcom/p7700g/p99005/fs5$a;)V", "a", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class fs5 {
    @NotNull
    private static final Logger b;
    private int d;
    private boolean e;
    private long f;
    private final List<es5> g;
    private final List<es5> h;
    private final Runnable i;
    @NotNull
    private final a j;
    public static final b c = new b(null);
    @cz4
    @NotNull
    public static final fs5 a = new fs5(new c(sr5.U(sr5.i + " TaskRunner", true)));

    /* compiled from: TaskRunner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/fs5$a", "", "Lcom/p7700g/p99005/fs5;", "taskRunner", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/fs5;)V", "", "nanoTime", "()J", "a", "nanos", "b", "(Lcom/p7700g/p99005/fs5;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NotNull fs5 fs5Var);

        void b(@NotNull fs5 fs5Var, long j);

        void c(@NotNull fs5 fs5Var);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    /* compiled from: TaskRunner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/p7700g/p99005/fs5$b", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lcom/p7700g/p99005/fs5;", "INSTANCE", "Lcom/p7700g/p99005/fs5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        @NotNull
        public final Logger a() {
            return fs5.b;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TaskRunner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u001b"}, d2 = {"com/p7700g/p99005/fs5$c", "Lcom/p7700g/p99005/fs5$a;", "Lcom/p7700g/p99005/fs5;", "taskRunner", "Lcom/p7700g/p99005/yq4;", "c", "(Lcom/p7700g/p99005/fs5;)V", "", "nanoTime", "()J", "a", "nanos", "b", "(Lcom/p7700g/p99005/fs5;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "d", "()V", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c implements a {
        private final ThreadPoolExecutor a;

        public c(@NotNull ThreadFactory threadFactory) {
            c25.p(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // com.p7700g.p99005.fs5.a
        public void a(@NotNull fs5 fs5Var) {
            c25.p(fs5Var, "taskRunner");
            fs5Var.notify();
        }

        @Override // com.p7700g.p99005.fs5.a
        public void b(@NotNull fs5 fs5Var, long j) throws InterruptedException {
            c25.p(fs5Var, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                fs5Var.wait(j2, (int) j3);
            }
        }

        @Override // com.p7700g.p99005.fs5.a
        public void c(@NotNull fs5 fs5Var) {
            c25.p(fs5Var, "taskRunner");
        }

        public final void d() {
            this.a.shutdown();
        }

        @Override // com.p7700g.p99005.fs5.a
        public void execute(@NotNull Runnable runnable) {
            c25.p(runnable, "runnable");
            this.a.execute(runnable);
        }

        @Override // com.p7700g.p99005.fs5.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: TaskRunner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/fs5$d", "Ljava/lang/Runnable;", "Lcom/p7700g/p99005/yq4;", "run", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            cs5 e;
            while (true) {
                synchronized (fs5.this) {
                    e = fs5.this.e();
                }
                if (e == null) {
                    return;
                }
                es5 d = e.d();
                c25.m(d);
                long j = -1;
                boolean isLoggable = fs5.c.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j = d.k().h().nanoTime();
                    ds5.a(e, d, "starting");
                }
                try {
                    fs5.this.k(e);
                    yq4 yq4Var = yq4.a;
                    if (isLoggable) {
                        long nanoTime = d.k().h().nanoTime() - j;
                        StringBuilder G = wo1.G("finished run in ");
                        G.append(ds5.b(nanoTime));
                        ds5.a(e, d, G.toString());
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long nanoTime2 = d.k().h().nanoTime() - j;
                        StringBuilder G2 = wo1.G("failed a run in ");
                        G2.append(ds5.b(nanoTime2));
                        ds5.a(e, d, G2.toString());
                    }
                    throw th;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(fs5.class.getName());
        c25.o(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        b = logger;
    }

    public fs5(@NotNull a aVar) {
        c25.p(aVar, m31.b);
        this.j = aVar;
        this.d = 10000;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new d();
    }

    private final void d(cs5 cs5Var, long j) {
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        es5 d2 = cs5Var.d();
        c25.m(d2);
        if (d2.e() == cs5Var) {
            boolean f = d2.f();
            d2.s(false);
            d2.r(null);
            this.g.remove(d2);
            if (j != -1 && !f && !d2.j()) {
                d2.q(cs5Var, j, true);
            }
            if (!d2.g().isEmpty()) {
                this.h.add(d2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void f(cs5 cs5Var) {
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        cs5Var.g(-1L);
        es5 d2 = cs5Var.d();
        c25.m(d2);
        d2.g().remove(cs5Var);
        this.h.remove(d2);
        d2.r(cs5Var);
        this.g.add(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(cs5 cs5Var) {
        if (sr5.h && Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST NOT hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        Thread currentThread2 = Thread.currentThread();
        c25.o(currentThread2, "currentThread");
        String name = currentThread2.getName();
        currentThread2.setName(cs5Var.b());
        try {
            long f = cs5Var.f();
            synchronized (this) {
                d(cs5Var, f);
                yq4 yq4Var = yq4.a;
            }
            currentThread2.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                d(cs5Var, -1L);
                yq4 yq4Var2 = yq4.a;
                currentThread2.setName(name);
                throw th;
            }
        }
    }

    @NotNull
    public final List<es5> c() {
        List<es5> y4;
        synchronized (this) {
            y4 = rs4.y4(this.g, this.h);
        }
        return y4;
    }

    @Nullable
    public final cs5 e() {
        boolean z;
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        while (!this.h.isEmpty()) {
            long nanoTime = this.j.nanoTime();
            long j = Long.MAX_VALUE;
            Iterator<es5> it = this.h.iterator();
            cs5 cs5Var = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                cs5 cs5Var2 = it.next().g().get(0);
                long max = Math.max(0L, cs5Var2.c() - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else if (cs5Var != null) {
                    z = true;
                    break;
                } else {
                    cs5Var = cs5Var2;
                }
            }
            if (cs5Var != null) {
                f(cs5Var);
                if (z || (!this.e && (!this.h.isEmpty()))) {
                    this.j.execute(this.i);
                }
                return cs5Var;
            } else if (this.e) {
                if (j < this.f - nanoTime) {
                    this.j.a(this);
                }
                return null;
            } else {
                this.e = true;
                this.f = nanoTime + j;
                try {
                    try {
                        this.j.b(this, j);
                    } catch (InterruptedException unused) {
                        g();
                    }
                } finally {
                    this.e = false;
                }
            }
        }
        return null;
    }

    public final void g() {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            this.g.get(size).b();
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            es5 es5Var = this.h.get(size2);
            es5Var.b();
            if (es5Var.g().isEmpty()) {
                this.h.remove(size2);
            }
        }
    }

    @NotNull
    public final a h() {
        return this.j;
    }

    public final void i(@NotNull es5 es5Var) {
        c25.p(es5Var, "taskQueue");
        if (sr5.h && !Thread.holdsLock(this)) {
            StringBuilder G = wo1.G("Thread ");
            Thread currentThread = Thread.currentThread();
            c25.o(currentThread, "Thread.currentThread()");
            G.append(currentThread.getName());
            G.append(" MUST hold lock on ");
            G.append(this);
            throw new AssertionError(G.toString());
        }
        if (es5Var.e() == null) {
            if (!es5Var.g().isEmpty()) {
                sr5.a(this.h, es5Var);
            } else {
                this.h.remove(es5Var);
            }
        }
        if (this.e) {
            this.j.a(this);
        } else {
            this.j.execute(this.i);
        }
    }

    @NotNull
    public final es5 j() {
        int i;
        synchronized (this) {
            i = this.d;
            this.d = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new es5(this, sb.toString());
    }
}