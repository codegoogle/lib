package com.p7700g.p99005;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sd5 {
    @td5
    public static /* synthetic */ void a() {
    }

    @NotNull
    public static final Executor b(@NotNull ec5 ec5Var) {
        qd5 qd5Var = ec5Var instanceof qd5 ? (qd5) ec5Var : null;
        Executor K = qd5Var != null ? qd5Var.K() : null;
        return K == null ? new cd5(ec5Var) : K;
    }

    @fz4(name = "from")
    @NotNull
    public static final ec5 c(@NotNull Executor executor) {
        cd5 cd5Var = executor instanceof cd5 ? (cd5) executor : null;
        ec5 ec5Var = cd5Var != null ? cd5Var.s : null;
        return ec5Var == null ? new rd5(executor) : ec5Var;
    }

    @fz4(name = "from")
    @NotNull
    public static final qd5 d(@NotNull ExecutorService executorService) {
        return new rd5(executorService);
    }
}