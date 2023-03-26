package com.p7700g.p99005;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractTimeSource.kt */
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0006\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000e\u001a\u00020\nH\u0081\b\u001a\t\u0010\u000f\u001a\u00020\nH\u0081\b\u001a\t\u0010\u0010\u001a\u00020\nH\u0081\b\u001a\u0011\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0081\b\u001a\t\u0010\u0014\u001a\u00020\nH\u0081\b\u001a\u0019\u0010\u0015\u001a\u00060\u0016j\u0002`\u00172\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0081\b\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0019"}, d2 = {"timeSource", "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "currentTimeMillis", "", "nanoTime", "parkNanos", "", "blocker", "", "nanos", "registerTimeLoopThread", "trackTask", "unTrackTask", "unpark", "thread", "Ljava/lang/Thread;", "unregisterTimeLoopThread", "wrapTask", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sa5 {
    @Nullable
    private static ra5 a;

    @dx4
    private static final long a() {
        ra5 b = b();
        Long valueOf = b == null ? null : Long.valueOf(b.a());
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }

    @Nullable
    public static final ra5 b() {
        return a;
    }

    @dx4
    private static final long c() {
        ra5 b = b();
        Long valueOf = b == null ? null : Long.valueOf(b.b());
        return valueOf == null ? System.nanoTime() : valueOf.longValue();
    }

    @dx4
    private static final void d(Object obj, long j) {
        yq4 yq4Var;
        ra5 b = b();
        if (b == null) {
            yq4Var = null;
        } else {
            b.c(obj, j);
            yq4Var = yq4.a;
        }
        if (yq4Var == null) {
            LockSupport.parkNanos(obj, j);
        }
    }

    @dx4
    private static final void e() {
        ra5 b = b();
        if (b == null) {
            return;
        }
        b.d();
    }

    public static final void f(@Nullable ra5 ra5Var) {
        a = ra5Var;
    }

    @dx4
    private static final void g() {
        ra5 b = b();
        if (b == null) {
            return;
        }
        b.e();
    }

    @dx4
    private static final void h() {
        ra5 b = b();
        if (b == null) {
            return;
        }
        b.f();
    }

    @dx4
    private static final void i(Thread thread) {
        yq4 yq4Var;
        ra5 b = b();
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

    @dx4
    private static final void j() {
        ra5 b = b();
        if (b == null) {
            return;
        }
        b.h();
    }

    @dx4
    private static final Runnable k(Runnable runnable) {
        Runnable i;
        ra5 b = b();
        return (b == null || (i = b.i(runnable)) == null) ? runnable : i;
    }
}