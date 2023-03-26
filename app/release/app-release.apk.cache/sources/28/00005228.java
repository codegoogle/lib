package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.kt */
@vo4(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0002\u001a\u00020\u00032\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\b\u001a\b\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"createEventLoop", "Lkotlinx/coroutines/EventLoop;", "platformAutoreleasePool", "", "block", "Lkotlin/Function0;", "processNextEventInCurrentThread", "", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class nd5 {
    @NotNull
    public static final kd5 a() {
        return new ya5(Thread.currentThread());
    }

    public static final void b(@NotNull uz4<yq4> uz4Var) {
        uz4Var.x();
    }

    @zd5
    public static final long c() {
        kd5 a = lf5.a.a();
        if (a == null) {
            return Long.MAX_VALUE;
        }
        return a.c2();
    }
}