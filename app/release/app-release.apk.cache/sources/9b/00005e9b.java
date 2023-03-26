package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AndroidExecutors.java */
/* loaded from: classes.dex */
public final class tp0 {
    private static final tp0 a = new tp0();
    private static final int b;
    public static final int c;
    public static final int d;
    public static final long e = 1;
    @x1
    private final Executor f = new b();

    /* compiled from: AndroidExecutors.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = availableProcessors;
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }

    private tp0() {
    }

    @SuppressLint({"NewApi"})
    public static void a(@x1 ThreadPoolExecutor threadPoolExecutor, boolean z) {
        threadPoolExecutor.allowCoreThreadTimeOut(z);
    }

    @x1
    public static ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(c, d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @x1
    public static ExecutorService c(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(c, d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @x1
    public static Executor d() {
        return a.f;
    }
}