package com.p7700g.p99005;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadPoolDispatcher.kt */
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class mf5 {
    public static /* synthetic */ Thread a(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        return c(i, str, atomicInteger, runnable);
    }

    @xc5
    @NotNull
    public static final qd5 b(final int i, @NotNull final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return sd5.d(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: com.p7700g.p99005.pa5
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return mf5.a(i, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(wo1.n("Expected at least one thread, but ", i, " specified").toString());
    }

    public static final Thread c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }

    @xc5
    @NotNull
    public static final qd5 d(@NotNull String str) {
        return b(1, str);
    }
}