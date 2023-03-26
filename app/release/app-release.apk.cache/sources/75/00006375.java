package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.xv4;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H'¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/Job;", "getChildJobCancellationCause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xn4(level = zn4.ERROR, message = "This is internal API and may be removed in the future releases")
@zd5
/* loaded from: classes3.dex */
public interface we5 extends ee5 {

    /* compiled from: Job.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R b(@NotNull we5 we5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) ee5.a.d(we5Var, r, j05Var);
        }

        @Nullable
        public static <E extends xv4.b> E c(@NotNull we5 we5Var, @NotNull xv4.c<E> cVar) {
            return (E) ee5.a.e(we5Var, cVar);
        }

        @NotNull
        public static xv4 d(@NotNull we5 we5Var, @NotNull xv4.c<?> cVar) {
            return ee5.a.g(we5Var, cVar);
        }

        @NotNull
        public static xv4 e(@NotNull we5 we5Var, @NotNull xv4 xv4Var) {
            return ee5.a.h(we5Var, xv4Var);
        }

        @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static ee5 f(@NotNull we5 we5Var, @NotNull ee5 ee5Var) {
            return ee5.a.i(we5Var, ee5Var);
        }
    }

    @zd5
    @NotNull
    CancellationException n3();
}