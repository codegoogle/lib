package com.p7700g.p99005;

import com.p7700g.p99005.ld5;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultExecutor.kt */
@vo4(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0014\u0010 \u001a\u00020\u001e2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\r\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0002\b#J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\n\u0010'\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0004R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE_MS", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutDown", "", "()Z", "isShutdownRequested", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "enqueue", "task", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "run", "shutdown", "shutdownError", "shutdownForTests", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class rc5 extends ld5 implements Runnable {
    private static final long A = 1000;
    private static final long B;
    private static final int C = 0;
    private static final int D = 1;
    private static final int E = 2;
    private static final int F = 3;
    private static final int G = 4;
    @Nullable
    private static volatile Thread _thread = null;
    private static volatile int debugStatus = 0;
    @NotNull
    public static final rc5 y;
    @NotNull
    public static final String z = "kotlinx.coroutines.DefaultExecutor";

    static {
        Long l;
        rc5 rc5Var = new rc5();
        y = rc5Var;
        kd5.Y1(rc5Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        B = timeUnit.toNanos(l.longValue());
    }

    private rc5() {
    }

    private final synchronized boolean B2() {
        if (z2()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void C2() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    private final synchronized void u2() {
        if (z2()) {
            debugStatus = 3;
            o2();
            notifyAll();
        }
    }

    private final synchronized Thread v2() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, z);
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void x2() {
    }

    private final boolean y2() {
        return debugStatus == 4;
    }

    private final boolean z2() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final boolean A2() {
        return _thread != null;
    }

    public final synchronized void D2(long j) {
        yq4 yq4Var;
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (!z2()) {
            debugStatus = 2;
        }
        while (debugStatus != 3 && _thread != null) {
            Thread thread = _thread;
            if (thread != null) {
                ra5 b = sa5.b();
                if (b == null) {
                    yq4Var = null;
                } else {
                    b.g(thread);
                    yq4Var = yq4.a;
                }
                if (yq4Var == null) {
                    LockSupport.unpark(thread);
                }
            }
            if (currentTimeMillis - System.currentTimeMillis() <= 0) {
                break;
            }
            wait(j);
        }
        debugStatus = 0;
    }

    @Override // com.p7700g.p99005.md5
    @NotNull
    public Thread f2() {
        Thread thread = _thread;
        return thread == null ? v2() : thread;
    }

    @Override // com.p7700g.p99005.md5
    public void g2(long j, @NotNull ld5.c cVar) {
        C2();
    }

    @Override // com.p7700g.p99005.ld5
    public void l2(@NotNull Runnable runnable) {
        if (y2()) {
            C2();
        }
        super.l2(runnable);
    }

    @Override // com.p7700g.p99005.ld5, com.p7700g.p99005.vc5
    @NotNull
    public gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
        return r2(j, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        yq4 yq4Var;
        boolean Z1;
        lf5.a.d(this);
        ra5 b = sa5.b();
        if (b != null) {
            b.d();
        }
        try {
            if (!B2()) {
                if (Z1) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long c2 = c2();
                if (c2 == Long.MAX_VALUE) {
                    ra5 b2 = sa5.b();
                    Long valueOf = b2 == null ? null : Long.valueOf(b2.b());
                    long nanoTime = valueOf == null ? System.nanoTime() : valueOf.longValue();
                    if (j == Long.MAX_VALUE) {
                        j = B + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        u2();
                        ra5 b3 = sa5.b();
                        if (b3 != null) {
                            b3.h();
                        }
                        if (Z1()) {
                            return;
                        }
                        f2();
                        return;
                    }
                    c2 = i55.v(c2, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (c2 > 0) {
                    if (z2()) {
                        _thread = null;
                        u2();
                        ra5 b4 = sa5.b();
                        if (b4 != null) {
                            b4.h();
                        }
                        if (Z1()) {
                            return;
                        }
                        f2();
                        return;
                    }
                    ra5 b5 = sa5.b();
                    if (b5 == null) {
                        yq4Var = null;
                    } else {
                        b5.c(this, c2);
                        yq4Var = yq4.a;
                    }
                    if (yq4Var == null) {
                        LockSupport.parkNanos(this, c2);
                    }
                }
            }
        } finally {
            _thread = null;
            u2();
            ra5 b6 = sa5.b();
            if (b6 != null) {
                b6.h();
            }
            if (!Z1()) {
                f2();
            }
        }
    }

    @Override // com.p7700g.p99005.ld5, com.p7700g.p99005.kd5
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void w2() {
        debugStatus = 0;
        v2();
        while (debugStatus == 0) {
            wait();
        }
    }
}