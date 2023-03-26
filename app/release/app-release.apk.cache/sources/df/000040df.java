package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@vo4(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010*\u00020\u00118À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"BlockingContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "CORE_POOL_SIZE", "", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "NonBlockingContext", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class eo5 {
    @NotNull
    public static final String a = "DefaultDispatcher";
    @cz4
    public static final long b;
    @cz4
    public static final int c;
    @cz4
    public static final int d;
    @cz4
    public static final long e;
    @cz4
    @NotNull
    public static zn5 f = null;
    public static final int g = 0;
    public static final int h = 1;
    @cz4
    @NotNull
    public static final bo5 i;
    @cz4
    @NotNull
    public static final bo5 j;

    static {
        long e2;
        int d2;
        int d3;
        long e3;
        e2 = en5.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        b = e2;
        d2 = en5.d("kotlinx.coroutines.scheduler.core.pool.size", i55.n(cn5.a(), 2), 1, 0, 8, null);
        c = d2;
        d3 = en5.d("kotlinx.coroutines.scheduler.max.pool.size", qn5.G, 0, qn5.G, 4, null);
        d = d3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e3 = en5.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        e = timeUnit.toNanos(e3);
        f = xn5.a;
        i = new co5(0);
        j = new co5(1);
    }

    public static final boolean a(@NotNull ao5 ao5Var) {
        return ao5Var.t.l() == 1;
    }
}