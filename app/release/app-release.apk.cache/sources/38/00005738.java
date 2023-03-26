package com.p7700g.p99005;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Executors.java */
/* loaded from: classes2.dex */
public final class q02 {
    private static final Executor a = new a();
    private static final Executor b = new b();

    /* compiled from: Executors.java */
    /* loaded from: classes2.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            z02.x(runnable);
        }
    }

    /* compiled from: Executors.java */
    /* loaded from: classes2.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            runnable.run();
        }
    }

    private q02() {
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }

    @r2
    public static void c(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            throw new RuntimeException("Failed to shutdown");
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}