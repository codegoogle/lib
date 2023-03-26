package com.p7700g.p99005;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor.java */
/* loaded from: classes2.dex */
public final class kt1 implements ExecutorService {
    private static volatile int A = 0;
    private static final String s = "source";
    private static final String t = "disk-cache";
    private static final int u = 1;
    private static final String v = "GlideExecutor";
    private static final String w = "source-unlimited";
    private static final String x = "animation";
    private static final long y = TimeUnit.SECONDS.toMillis(10);
    private static final int z = 4;
    private final ExecutorService B;

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final long a = 0;
        private final boolean b;
        private int c;
        private int d;
        @x1
        private final ThreadFactory e = new c();
        @x1
        private e f = e.d;
        private String g;
        private long h;

        public b(boolean z) {
            this.b = z;
        }

        public kt1 a() {
            if (!TextUtils.isEmpty(this.g)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.c, this.d, this.h, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.e, this.g, this.f, this.b));
                if (this.h != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new kt1(threadPoolExecutor);
            }
            StringBuilder G = wo1.G("Name must be non-null and non-empty, but given: ");
            G.append(this.g);
            throw new IllegalArgumentException(G.toString());
        }

        public b b(String str) {
            this.g = str;
            return this;
        }

        public b c(@p1(from = 1) int i) {
            this.c = i;
            this.d = i;
            return this;
        }

        public b d(long j) {
            this.h = j;
            return this;
        }

        public b e(@x1 e eVar) {
            this.f = eVar;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes2.dex */
    public static final class c implements ThreadFactory {
        private static final int a = 9;

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes2.dex */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@x1 Runnable runnable) {
            return new a(runnable);
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes2.dex */
    public static final class d implements ThreadFactory {
        private final ThreadFactory a;
        private final String b;
        public final e c;
        public final boolean d;
        private final AtomicInteger e = new AtomicInteger();

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public final /* synthetic */ Runnable s;

            public a(Runnable runnable) {
                this.s = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.s.run();
                } catch (Throwable th) {
                    d.this.c.a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.a = threadFactory;
            this.b = str;
            this.c = eVar;
            this.d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@x1 Runnable runnable) {
            Thread newThread = this.a.newThread(new a(runnable));
            StringBuilder G = wo1.G("glide-");
            G.append(this.b);
            G.append("-thread-");
            G.append(this.e.getAndIncrement());
            newThread.setName(G.toString());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor.java */
    /* loaded from: classes2.dex */
    public interface e {
        public static final e a = new a();
        public static final e b;
        public static final e c;
        public static final e d;

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes2.dex */
        public class a implements e {
            @Override // com.p7700g.p99005.kt1.e
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes2.dex */
        public class b implements e {
            @Override // com.p7700g.p99005.kt1.e
            public void a(Throwable th) {
                if (th != null) {
                    Log.isLoggable(kt1.v, 6);
                }
            }
        }

        /* compiled from: GlideExecutor.java */
        /* loaded from: classes2.dex */
        public class c implements e {
            @Override // com.p7700g.p99005.kt1.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            b = bVar;
            c = new c();
            d = bVar;
        }

        void a(Throwable th);
    }

    @r2
    public kt1(ExecutorService executorService) {
        this.B = executorService;
    }

    public static int a() {
        if (A == 0) {
            A = Math.min(4, lt1.a());
        }
        return A;
    }

    public static b b() {
        return new b(true).c(a() >= 4 ? 2 : 1).b(x);
    }

    public static kt1 c() {
        return b().a();
    }

    @Deprecated
    public static kt1 d(int i, e eVar) {
        return b().c(i).e(eVar).a();
    }

    public static b e() {
        return new b(true).c(1).b(t);
    }

    public static kt1 f() {
        return e().a();
    }

    @Deprecated
    public static kt1 g(int i, String str, e eVar) {
        return e().c(i).b(str).e(eVar).a();
    }

    @Deprecated
    public static kt1 h(e eVar) {
        return e().e(eVar).a();
    }

    public static b i() {
        return new b(false).c(a()).b("source");
    }

    public static kt1 j() {
        return i().a();
    }

    @Deprecated
    public static kt1 k(int i, String str, e eVar) {
        return i().c(i).b(str).e(eVar).a();
    }

    @Deprecated
    public static kt1 l(e eVar) {
        return i().e(eVar).a();
    }

    public static kt1 m() {
        return new kt1(new ThreadPoolExecutor(0, Integer.MAX_VALUE, y, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), w, e.d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @x1 TimeUnit timeUnit) throws InterruptedException {
        return this.B.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@x1 Runnable runnable) {
        this.B.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> List<Future<T>> invokeAll(@x1 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.B.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> T invokeAny(@x1 Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.B.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.B.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.B.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.B.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public List<Runnable> shutdownNow() {
        return this.B.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public Future<?> submit(@x1 Runnable runnable) {
        return this.B.submit(runnable);
    }

    public String toString() {
        return this.B.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> List<Future<T>> invokeAll(@x1 Collection<? extends Callable<T>> collection, long j, @x1 TimeUnit timeUnit) throws InterruptedException {
        return this.B.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@x1 Collection<? extends Callable<T>> collection, long j, @x1 TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.B.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> Future<T> submit(@x1 Runnable runnable, T t2) {
        return this.B.submit(runnable, t2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@x1 Callable<T> callable) {
        return this.B.submit(callable);
    }
}