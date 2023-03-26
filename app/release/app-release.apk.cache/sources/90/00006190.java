package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Delay.kt */
@vo4(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "context", "Lkotlin/coroutines/CoroutineContext;", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public interface vc5 {

    /* compiled from: Delay.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
        @Nullable
        public static Object a(@NotNull vc5 vc5Var, long j, @NotNull uv4<? super yq4> uv4Var) {
            if (j <= 0) {
                return yq4.a;
            }
            hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
            hb5Var.T();
            vc5Var.j(j, hb5Var);
            Object x = hb5Var.x();
            if (x == gw4.h()) {
                ow4.c(uv4Var);
            }
            return x == gw4.h() ? x : yq4.a;
        }

        @NotNull
        public static gd5 b(@NotNull vc5 vc5Var, long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var) {
            return sc5.a().q(j, runnable, xv4Var);
        }
    }

    void j(long j, @NotNull gb5<? super yq4> gb5Var);

    @NotNull
    gd5 q(long j, @NotNull Runnable runnable, @NotNull xv4 xv4Var);

    @xn4(level = zn4.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    Object r(long j, @NotNull uv4<? super yq4> uv4Var);
}