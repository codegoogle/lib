package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EventLoop.common.kt */
@vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\nH\u0016J\u0006\u0010\u001d\u001a\u00020\u0004J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", "", "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", "", "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlinx/coroutines/internal/ArrayQueue;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", "", "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "limitedParallelism", "parallelism", "", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class kd5 extends ec5 {
    private long t;
    private boolean u;
    @Nullable
    private jl5<ad5<?>> v;

    public static /* synthetic */ void W(kd5 kd5Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        kd5Var.K(z);
    }

    private final long Y(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void Y1(kd5 kd5Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        kd5Var.T1(z);
    }

    public final void J1(@NotNull ad5<?> ad5Var) {
        jl5<ad5<?>> jl5Var = this.v;
        if (jl5Var == null) {
            jl5Var = new jl5<>();
            this.v = jl5Var;
        }
        jl5Var.a(ad5Var);
    }

    public final void K(boolean z) {
        long Y = this.t - Y(z);
        this.t = Y;
        if (Y <= 0 && this.u) {
            shutdown();
        }
    }

    public long K1() {
        jl5<ad5<?>> jl5Var = this.v;
        return (jl5Var == null || jl5Var.d()) ? Long.MAX_VALUE : 0L;
    }

    public final void T1(boolean z) {
        this.t += Y(z);
        if (z) {
            return;
        }
        this.u = true;
    }

    public boolean Z1() {
        return b2();
    }

    public final boolean a2() {
        return this.t >= Y(true);
    }

    public final boolean b2() {
        jl5<ad5<?>> jl5Var = this.v;
        if (jl5Var == null) {
            return true;
        }
        return jl5Var.d();
    }

    public long c2() {
        return !d2() ? Long.MAX_VALUE : 0L;
    }

    public final boolean d2() {
        ad5<?> e;
        jl5<ad5<?>> jl5Var = this.v;
        if (jl5Var == null || (e = jl5Var.e()) == null) {
            return false;
        }
        e.run();
        return true;
    }

    public boolean e2() {
        return false;
    }

    public final boolean h() {
        return this.t > 0;
    }

    public void shutdown() {
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public final ec5 z(int i) {
        cm5.a(i);
        return this;
    }
}