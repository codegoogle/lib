package com.p7700g.p99005;

import com.p7700g.p99005.tc5;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompletableDeferred.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/CompletableDeferred;", "T", "Lkotlinx/coroutines/Deferred;", com.anythink.expressad.foundation.d.c.bV, "", "value", "(Ljava/lang/Object;)Z", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface pb5<T> extends tc5<T> {

    /* compiled from: CompletableDeferred.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <T, R> R b(@NotNull pb5<T> pb5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) tc5.a.b(pb5Var, r, j05Var);
        }

        @Nullable
        public static <T, E extends xv4.b> E c(@NotNull pb5<T> pb5Var, @NotNull xv4.c<E> cVar) {
            return (E) tc5.a.c(pb5Var, cVar);
        }

        @NotNull
        public static <T> xv4 d(@NotNull pb5<T> pb5Var, @NotNull xv4.c<?> cVar) {
            return tc5.a.d(pb5Var, cVar);
        }

        @NotNull
        public static <T> xv4 e(@NotNull pb5<T> pb5Var, @NotNull xv4 xv4Var) {
            return tc5.a.e(pb5Var, xv4Var);
        }

        @xn4(level = zn4.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> ee5 f(@NotNull pb5<T> pb5Var, @NotNull ee5 ee5Var) {
            return tc5.a.f(pb5Var, ee5Var);
        }
    }

    boolean d(@NotNull Throwable th);

    boolean e(T t);
}