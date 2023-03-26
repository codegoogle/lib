package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Job.kt */
@vo4(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/Job;", "parentCancelled", "", "parentJob", "Lkotlinx/coroutines/ParentJob;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xn4(level = zn4.ERROR, message = "This is internal API and may be removed in the future releases")
@zd5
/* loaded from: classes3.dex */
public interface ob5 extends ee5 {

    /* compiled from: Job.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R b(@NotNull ob5 ob5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) ee5.a.d(ob5Var, r, j05Var);
        }

        @Nullable
        public static <E extends xv4.b> E c(@NotNull ob5 ob5Var, @NotNull xv4.c<E> cVar) {
            return (E) ee5.a.e(ob5Var, cVar);
        }

        @NotNull
        public static xv4 d(@NotNull ob5 ob5Var, @NotNull xv4.c<?> cVar) {
            return ee5.a.g(ob5Var, cVar);
        }

        @NotNull
        public static xv4 e(@NotNull ob5 ob5Var, @NotNull xv4 xv4Var) {
            return ee5.a.h(ob5Var, xv4Var);
        }

        @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static ee5 f(@NotNull ob5 ob5Var, @NotNull ee5 ee5Var) {
            return ee5.a.i(ob5Var, ee5Var);
        }
    }

    @zd5
    void D1(@NotNull we5 we5Var);
}