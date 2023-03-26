package com.p7700g.p99005;

import com.p7700g.p99005.qn5;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineScheduler.kt */
@vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¨\u0006\u0005"}, d2 = {"isSchedulerWorker", "", "thread", "Ljava/lang/Thread;", "mayNotBlock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class rn5 {
    @fz4(name = "isSchedulerWorker")
    public static final boolean a(@NotNull Thread thread) {
        return thread instanceof qn5.c;
    }

    @fz4(name = "mayNotBlock")
    public static final boolean b(@NotNull Thread thread) {
        return (thread instanceof qn5.c) && ((qn5.c) thread).u == qn5.d.CPU_ACQUIRED;
    }
}