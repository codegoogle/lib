package com.p7700g.p99005;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Deprecated.kt */
@np4
@vo4(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0011\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001b\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\u001c\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J)\u0010\u001e\u001a\u00020\u00162\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u001c\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0016J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\b\u0010%\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "schedulerName", "", "(IILjava/lang/String;)V", "(II)V", "idleWorkerKeepAliveNs", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "blocking", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", com.anythink.expressad.foundation.d.c.cd, "", "createScheduler", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "limited", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class un5 extends qd5 {
    private final int u;
    private final int v;
    private final long w;
    @NotNull
    private final String x;
    @NotNull
    private qn5 y;

    public /* synthetic */ un5(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    private final qn5 J1() {
        return new qn5(this.u, this.v, this.w, this.x);
    }

    public static /* synthetic */ ec5 Y(un5 un5Var, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return un5Var.W(i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
    }

    @Override // com.p7700g.p99005.qd5
    @NotNull
    public Executor K() {
        return this.y;
    }

    public final void K1(@NotNull Runnable runnable, @NotNull bo5 bo5Var, boolean z) {
        try {
            this.y.m(runnable, bo5Var, z);
        } catch (RejectedExecutionException unused) {
            rc5.y.l2(this.y.f(runnable, bo5Var));
        }
    }

    @NotNull
    public final ec5 T1(int i) {
        if (i > 0) {
            if (i <= this.u) {
                return new wn5(this, i, null, 0);
            }
            StringBuilder G = wo1.G("Expected parallelism level lesser than core pool size (");
            G.append(this.u);
            G.append("), but have ");
            G.append(i);
            throw new IllegalArgumentException(G.toString().toString());
        }
        throw new IllegalArgumentException(c25.C("Expected positive parallelism level, but have ", Integer.valueOf(i)).toString());
    }

    @NotNull
    public final ec5 W(int i) {
        if (i > 0) {
            return new wn5(this, i, null, 1);
        }
        throw new IllegalArgumentException(c25.C("Expected positive parallelism level, but have ", Integer.valueOf(i)).toString());
    }

    @Override // com.p7700g.p99005.qd5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.y.close();
    }

    @Override // com.p7700g.p99005.ec5
    public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        try {
            qn5.q(this.y, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            rc5.y.s(xv4Var, runnable);
        }
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        return super.toString() + "[scheduler = " + this.y + f14.v;
    }

    @Override // com.p7700g.p99005.ec5
    public void v(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        try {
            qn5.q(this.y, runnable, null, true, 2, null);
        } catch (RejectedExecutionException unused) {
            rc5.y.v(xv4Var, runnable);
        }
    }

    public un5(int i, int i2, long j, @NotNull String str) {
        this.u = i;
        this.v = i2;
        this.w = j;
        this.x = str;
        this.y = J1();
    }

    public /* synthetic */ un5(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? eo5.c : i, (i3 & 2) != 0 ? eo5.d : i2, (i3 & 4) != 0 ? eo5.a : str);
    }

    public un5(int i, int i2, @NotNull String str) {
        this(i, i2, eo5.e, str);
    }

    public /* synthetic */ un5(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? eo5.c : i, (i3 & 2) != 0 ? eo5.d : i2);
    }

    @xn4(level = zn4.HIDDEN, message = "Binary compatibility for Ktor 1.0-beta")
    public /* synthetic */ un5(int i, int i2) {
        this(i, i2, eo5.e, null, 8, null);
    }
}