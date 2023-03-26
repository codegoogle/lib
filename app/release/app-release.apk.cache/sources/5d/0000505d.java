package com.p7700g.p99005;

import com.p7700g.p99005.ld5;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.kt */
@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\bH\u0004R\u0012\u0010\u0003\u001a\u00020\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/EventLoop;", "()V", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "reschedule", "", "now", "", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "unpark", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class md5 extends kd5 {
    @NotNull
    public abstract Thread f2();

    public void g2(long j, @NotNull ld5.c cVar) {
        rc5.y.p2(j, cVar);
    }

    public final void h2() {
        yq4 yq4Var;
        Thread f2 = f2();
        if (Thread.currentThread() != f2) {
            ra5 b = sa5.b();
            if (b == null) {
                yq4Var = null;
            } else {
                b.g(f2);
                yq4Var = yq4.a;
            }
            if (yq4Var == null) {
                LockSupport.unpark(f2);
            }
        }
    }
}