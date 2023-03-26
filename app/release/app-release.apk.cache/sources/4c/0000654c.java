package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.kt */
@vo4(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", CallMraidJS.b, "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class xa5<T> extends qa5<T> {
    @NotNull
    private final Thread u;
    @Nullable
    private final kd5 v;

    public xa5(@NotNull xv4 xv4Var, @NotNull Thread thread, @Nullable kd5 kd5Var) {
        super(xv4Var, true, true);
        this.u = thread;
        this.v = kd5Var;
    }

    @Override // com.p7700g.p99005.me5
    public boolean I0() {
        return true;
    }

    @Override // com.p7700g.p99005.me5
    public void a0(@Nullable Object obj) {
        yq4 yq4Var;
        if (c25.g(Thread.currentThread(), this.u)) {
            return;
        }
        Thread thread = this.u;
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

    public final T w1() {
        yq4 yq4Var;
        ra5 b = sa5.b();
        if (b != null) {
            b.d();
        }
        try {
            kd5 kd5Var = this.v;
            if (kd5Var != null) {
                kd5.Y1(kd5Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                kd5 kd5Var2 = this.v;
                long c2 = kd5Var2 == null ? Long.MAX_VALUE : kd5Var2.c2();
                if (m()) {
                    kd5 kd5Var3 = this.v;
                    if (kd5Var3 != null) {
                        kd5.W(kd5Var3, false, 1, null);
                    }
                    T t = (T) ne5.o(C0());
                    ub5 ub5Var = t instanceof ub5 ? (ub5) t : null;
                    if (ub5Var == null) {
                        return t;
                    }
                    throw ub5Var.b;
                }
                ra5 b2 = sa5.b();
                if (b2 == null) {
                    yq4Var = null;
                } else {
                    b2.c(this, c2);
                    yq4Var = yq4.a;
                }
                if (yq4Var == null) {
                    LockSupport.parkNanos(this, c2);
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            d0(interruptedException);
            throw interruptedException;
        } finally {
            ra5 b3 = sa5.b();
            if (b3 != null) {
                b3.h();
            }
        }
    }
}