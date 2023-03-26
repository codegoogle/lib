package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LimitedDispatcher.kt */
@vo4(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0016J#\u0010\u001a\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u001bH\u0082\bJ\u001c\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u0003H\u0017J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0096\u0001J\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010!\u001a\u00020\u0013H\u0016J\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130$H\u0096\u0001J\b\u0010%\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rj\u0002`\u000eX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lkotlinx/coroutines/Delay;", "dispatcher", "parallelism", "", "(Lkotlinx/coroutines/CoroutineDispatcher;I)V", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "runningWorkers", "workerAllocationLock", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "addAndTryDispatching", "", "block", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "dispatchInternal", "Lkotlin/Function0;", "dispatchYield", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "limitedParallelism", "run", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "tryAllocateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class bm5 extends ec5 implements Runnable, vc5 {
    private volatile int runningWorkers;
    @NotNull
    private final ec5 t;
    private final int u;
    private final /* synthetic */ vc5 v;
    @NotNull
    private final jm5<Runnable> w;
    @NotNull
    private final Object x;

    public bm5(@NotNull ec5 ec5Var, int i) {
        this.t = ec5Var;
        this.u = i;
        vc5 vc5Var = ec5Var instanceof vc5 ? (vc5) ec5Var : null;
        this.v = vc5Var == null ? sc5.a() : vc5Var;
        this.w = new jm5<>(false);
        this.x = new Object();
    }

    private final boolean K(Runnable runnable) {
        this.w.a(runnable);
        return this.runningWorkers >= this.u;
    }

    private final void W(Runnable runnable, uz4<yq4> uz4Var) {
        if (!K(runnable) && Y()) {
            uz4Var.x();
        }
    }

    private final boolean Y() {
        synchronized (this.x) {
            if (this.runningWorkers >= this.u) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    @Override // com.p7700g.p99005.vc5
    public void j(long j, @NotNull gb5<? super yq4> gb5Var) {
        this.v.j(j, gb5Var);
    }

    @Override // com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        return this.v.q(j, runnable, xv4Var);
    }

    @Override // com.p7700g.p99005.vc5
    @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object r(long j, @NotNull uv4<? super yq4> uv4Var) {
        return this.v.r(j, uv4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
        r1 = r4.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r4.w.c() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        r4.runningWorkers++;
        r2 = com.p7700g.p99005.yq4.a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        Object obj;
        while (true) {
            int i = 0;
            while (true) {
                Runnable g = this.w.g();
                if (g == null) {
                    break;
                }
                try {
                    g.run();
                } catch (Throwable th) {
                    hc5.b(zv4.s, th);
                }
                i++;
                if (i >= 16 && this.t.w(this)) {
                    this.t.s(this, this);
                    return;
                }
            }
        }
    }

    @Override // com.p7700g.p99005.ec5
    public void s(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        if (!K(runnable) && Y()) {
            this.t.s(this, this);
        }
    }

    @Override // com.p7700g.p99005.ec5
    @zd5
    public void v(@NotNull xv4 xv4Var, @NotNull Runnable runnable) {
        if (!K(runnable) && Y()) {
            this.t.v(this, this);
        }
    }

    @Override // com.p7700g.p99005.ec5
    @td5
    @NotNull
    public ec5 z(int i) {
        cm5.a(i);
        return i >= this.u ? this : super.z(i);
    }
}