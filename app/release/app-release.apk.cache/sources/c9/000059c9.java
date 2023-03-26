package com.p7700g.p99005;

import com.p7700g.p99005.vc5;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Executors.kt */
@vo4(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010#*\u00020$2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006%"}, d2 = {"Lkotlinx/coroutines/ExecutorCoroutineDispatcherImpl;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "getExecutor", "()Ljava/util/concurrent/Executor;", "cancelJobOnRejection", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "Ljava/util/concurrent/RejectedExecutionException;", com.anythink.expressad.foundation.d.c.cd, "dispatch", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "equals", "", "other", "", "hashCode", "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "", "scheduleBlock", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class rd5 extends qd5 implements vc5 {
    @NotNull
    private final Executor u;

    public rd5(@NotNull Executor executor) {
        this.u = executor;
        ol5.c(K());
    }

    private final void W(xv4 xv4Var, RejectedExecutionException rejectedExecutionException) {
        ie5.f(xv4Var, pd5.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> Y(ScheduledExecutorService scheduledExecutorService, Runnable runnable, xv4 xv4Var, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            W(xv4Var, e);
            return null;
        }
    }

    @Override // com.p7700g.p99005.qd5
    @NotNull
    public Executor K() {
        return this.u;
    }

    @Override // com.p7700g.p99005.qd5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor K = K();
        ExecutorService executorService = K instanceof ExecutorService ? (ExecutorService) K : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof rd5) && ((rd5) obj).K() == K();
    }

    public int hashCode() {
        return System.identityHashCode(K());
    }

    @Override // com.p7700g.p99005.vc5
    public void j(long j, @NotNull gb5<? super yq4> gb5Var) {
        Executor K = K();
        ScheduledExecutorService scheduledExecutorService = K instanceof ScheduledExecutorService ? (ScheduledExecutorService) K : null;
        ScheduledFuture<?> Y = scheduledExecutorService != null ? Y(scheduledExecutorService, new af5(this, gb5Var), gb5Var.getContext(), j) : null;
        if (Y != null) {
            ie5.w(gb5Var, Y);
        } else {
            rc5.y.j(j, gb5Var);
        }
    }

    @Override // com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        Executor K = K();
        ScheduledExecutorService scheduledExecutorService = K instanceof ScheduledExecutorService ? (ScheduledExecutorService) K : null;
        ScheduledFuture<?> Y = scheduledExecutorService != null ? Y(scheduledExecutorService, runnable, xv4Var, j) : null;
        if (Y != null) {
            return new fd5(Y);
        }
        return rc5.y.q(j, runnable, xv4Var);
    }

    @Override // com.p7700g.p99005.vc5
    @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object r(long j, @NotNull uv4<? super yq4> uv4Var) {
        return vc5.a.a(this, j, uv4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r1 == null) goto L5;
     */
    @Override // com.p7700g.p99005.ec5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        Runnable i;
        try {
            Executor K = K();
            ra5 b = sa5.b();
            if (b != null) {
                i = b.i(runnable);
            }
            i = runnable;
            K.execute(i);
        } catch (RejectedExecutionException e) {
            ra5 b2 = sa5.b();
            if (b2 != null) {
                b2.f();
            }
            W(xv4Var, e);
            dd5.c().s(xv4Var, runnable);
        }
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        return K().toString();
    }
}