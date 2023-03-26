package com.p7700g.p99005;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@vo4(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0017J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultIoScheduler;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "()V", "default", "Lkotlinx/coroutines/CoroutineDispatcher;", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", com.anythink.expressad.foundation.d.c.cd, "", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "execute", "command", "limitedParallelism", "parallelism", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sn5 extends qd5 implements Executor {
    @NotNull
    public static final sn5 u = new sn5();
    @NotNull
    private static final ec5 v;

    static {
        int d;
        fo5 fo5Var = fo5.t;
        d = en5.d(ed5.a, i55.n(64, cn5.a()), 0, 0, 12, null);
        v = fo5Var.z(d);
    }

    private sn5() {
    }

    @Override // com.p7700g.p99005.qd5
    @NotNull
    public Executor K() {
        return this;
    }

    @Override // com.p7700g.p99005.qd5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        s(zv4.s, runnable);
    }

    @Override // com.p7700g.p99005.ec5
    public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        v.s(xv4Var, runnable);
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // com.p7700g.p99005.ec5
    @zd5
    public void v(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        v.v(xv4Var, runnable);
    }

    @Override // com.p7700g.p99005.ec5
    @td5
    @NotNull
    public ec5 z(int i) {
        return fo5.t.z(i);
    }
}