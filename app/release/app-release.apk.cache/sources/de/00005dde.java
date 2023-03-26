package com.p7700g.p99005;

import com.p7700g.p99005.ee5;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Deferred.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0011\u0010\u0007\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\r\u0010\t\u001a\u00028\u0000H'¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\fH'R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/Deferred;", "T", "Lkotlinx/coroutines/Job;", "onAwait", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "getCompletionExceptionOrNull", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface tc5<T> extends ee5 {

    /* compiled from: Deferred.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T, R> R b(@NotNull tc5<? extends T> tc5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) ee5.a.d(tc5Var, r, j05Var);
        }

        @Nullable
        public static <T, E extends xv4.b> E c(@NotNull tc5<? extends T> tc5Var, @NotNull xv4.c<E> cVar) {
            return (E) ee5.a.e(tc5Var, cVar);
        }

        @NotNull
        public static <T> xv4 d(@NotNull tc5<? extends T> tc5Var, @NotNull xv4.c<?> cVar) {
            return ee5.a.g(tc5Var, cVar);
        }

        @NotNull
        public static <T> xv4 e(@NotNull tc5<? extends T> tc5Var, @NotNull xv4 xv4Var) {
            return ee5.a.h(tc5Var, xv4Var);
        }

        @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> ee5 f(@NotNull tc5<? extends T> tc5Var, @NotNull ee5 ee5Var) {
            return ee5.a.i(tc5Var, ee5Var);
        }
    }

    @td5
    T A();

    @NotNull
    lo5<T> U();

    @td5
    @Nullable
    Throwable Z();

    @Nullable
    Object d1(@NotNull uv4<? super T> uv4Var);
}