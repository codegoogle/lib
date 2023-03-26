package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\r\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "()V", com.anythink.expressad.foundation.d.c.cd, "", "shutdown", "shutdown$kotlinx_coroutines_core", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class tn5 extends yn5 {
    @NotNull
    public static final tn5 z = new tn5();

    private tn5() {
        super(eo5.c, eo5.d, eo5.e, eo5.a);
    }

    public final void Y1() {
        super.close();
    }

    @Override // com.p7700g.p99005.yn5, com.p7700g.p99005.qd5, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}