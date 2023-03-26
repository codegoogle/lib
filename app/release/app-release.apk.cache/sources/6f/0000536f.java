package com.p7700g.p99005;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.p7700g.p99005.i2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask.java */
/* loaded from: classes.dex */
public abstract class o10<Params, Progress, Result> {
    private static final int A = 2;
    private static f B = null;
    private static volatile Executor C = null;
    private static final String s = "AsyncTask";
    private static final int t = 5;
    private static final int u = 128;
    private static final int v = 1;
    private static final ThreadFactory w;
    private static final BlockingQueue<Runnable> x;
    public static final Executor y;
    private static final int z = 1;
    private final h<Params, Result> D;
    private final FutureTask<Result> E;
    private volatile g F = g.PENDING;
    public final AtomicBoolean G = new AtomicBoolean();
    public final AtomicBoolean H = new AtomicBoolean();

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder G = wo1.G("ModernAsyncTask #");
            G.append(this.a.getAndIncrement());
            return new Thread(runnable, G.toString());
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            o10.this.H.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) o10.this.b(this.a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                o10.this.r(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                o10.this.r(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            g.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class e<Data> {
        public final o10 a;
        public final Data[] b;

        public e(o10 o10Var, Data... dataArr) {
            this.a = o10Var;
            this.b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.a.f(eVar.b[0]);
            } else if (i != 2) {
            } else {
                eVar.a.p(eVar.b);
            }
        }
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* compiled from: ModernAsyncTask.java */
    /* loaded from: classes.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {
        public Params[] a;
    }

    static {
        a aVar = new a();
        w = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        x = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        y = threadPoolExecutor;
        C = threadPoolExecutor;
    }

    public o10() {
        b bVar = new b();
        this.D = bVar;
        this.E = new c(bVar);
    }

    public static void d(Runnable runnable) {
        C.execute(runnable);
    }

    private static Handler i() {
        f fVar;
        synchronized (o10.class) {
            if (B == null) {
                B = new f();
            }
            fVar = B;
        }
        return fVar;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public static void t(Executor executor) {
        C = executor;
    }

    public final boolean a(boolean z2) {
        this.G.set(true);
        return this.E.cancel(z2);
    }

    public abstract Result b(Params... paramsArr);

    public final o10<Params, Progress, Result> c(Params... paramsArr) {
        return e(C, paramsArr);
    }

    public final o10<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.F != g.PENDING) {
            int ordinal = this.F.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.F = g.RUNNING;
        o();
        this.D.a = paramsArr;
        executor.execute(this.E);
        return this;
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.F = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.E.get();
    }

    public final Result h(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.E.get(j, timeUnit);
    }

    public final g j() {
        return this.F;
    }

    public final boolean k() {
        return this.G.get();
    }

    public void l() {
    }

    public void m(Result result) {
        l();
    }

    public void n(Result result) {
    }

    public void o() {
    }

    public void p(Progress... progressArr) {
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (this.H.get()) {
            return;
        }
        q(result);
    }

    public final void s(Progress... progressArr) {
        if (k()) {
            return;
        }
        i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
    }
}