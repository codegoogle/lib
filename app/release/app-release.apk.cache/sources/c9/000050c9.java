package com.p7700g.p99005;

import android.annotation.SuppressLint;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DelegatedScheduledExecutorService.java */
@SuppressLint({"LambdaLast"})
/* loaded from: classes2.dex */
public class mm1 implements ScheduledExecutorService {
    @x1
    private final kj1 s;
    @x1
    private final ScheduledExecutorService t;

    public mm1(@x1 ScheduledExecutorService scheduledExecutorService, @x1 kj1 kj1Var) {
        this.t = scheduledExecutorService;
        this.s = kj1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void b(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.s.f(th);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @x1 TimeUnit timeUnit) throws InterruptedException {
        return this.t.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@x1 final Runnable runnable) {
        this.t.execute(new Runnable() { // from class: com.p7700g.p99005.uj1
            @Override // java.lang.Runnable
            public final void run() {
                mm1.this.b(runnable);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> List<Future<T>> invokeAll(@x1 Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.t.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> T invokeAny(@x1 Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.t.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.t.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.t.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @x1
    public ScheduledFuture<?> schedule(@x1 Runnable runnable, long j, @x1 TimeUnit timeUnit) {
        return this.t.schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @x1
    public ScheduledFuture<?> scheduleAtFixedRate(@x1 Runnable runnable, long j, long j2, @x1 TimeUnit timeUnit) {
        return this.t.scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @x1
    public ScheduledFuture<?> scheduleWithFixedDelay(@x1 Runnable runnable, long j, long j2, @x1 TimeUnit timeUnit) {
        return this.t.scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.t.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public List<Runnable> shutdownNow() {
        return this.t.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> Future<T> submit(@x1 Callable<T> callable) {
        return this.t.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> List<Future<T>> invokeAll(@x1 Collection<? extends Callable<T>> collection, long j, @x1 TimeUnit timeUnit) throws InterruptedException {
        return this.t.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> T invokeAny(@x1 Collection<? extends Callable<T>> collection, long j, @x1 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.t.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    @x1
    public <V> ScheduledFuture<V> schedule(@x1 Callable<V> callable, long j, @x1 TimeUnit timeUnit) {
        return this.t.schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public <T> Future<T> submit(@x1 Runnable runnable, @z1 T t) {
        return this.t.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    @x1
    public Future<?> submit(@x1 Runnable runnable) {
        return this.t.submit(runnable);
    }
}