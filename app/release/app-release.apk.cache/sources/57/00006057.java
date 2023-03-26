package com.p7700g.p99005;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public class un {

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        private String a;
        private int b;

        /* compiled from: RequestExecutor.java */
        /* renamed from: com.p7700g.p99005.un$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0256a extends Thread {
            private final int s;

            public C0256a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.s = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.s);
                super.run();
            }
        }

        public a(@x1 String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0256a(runnable, this.a, this.b);
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        private final Handler s;

        public b(@x1 Handler handler) {
            this.s = (Handler) jp.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            if (this.s.post((Runnable) jp.l(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.s + " is shutting down");
        }
    }

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public static class c<T> implements Runnable {
        @x1
        private Callable<T> s;
        @x1
        private vo<T> t;
        @x1
        private Handler u;

        /* compiled from: RequestExecutor.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ vo s;
            public final /* synthetic */ Object t;

            public a(vo voVar, Object obj) {
                this.s = voVar;
                this.t = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.s.accept(this.t);
            }
        }

        public c(@x1 Handler handler, @x1 Callable<T> callable, @x1 vo<T> voVar) {
            this.s = callable;
            this.t = voVar;
            this.u = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.s.call();
            } catch (Exception unused) {
                t = null;
            }
            this.u.post(new a(this.t, t));
        }
    }

    private un() {
    }

    public static ThreadPoolExecutor a(@x1 String str, int i, @p1(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b(@x1 Handler handler) {
        return new b(handler);
    }

    public static <T> void c(@x1 Executor executor, @x1 Callable<T> callable, @x1 vo<T> voVar) {
        executor.execute(new c(on.a(), callable, voVar));
    }

    public static <T> T d(@x1 ExecutorService executorService, @x1 Callable<T> callable, @p1(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}