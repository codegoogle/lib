package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContextElement.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/ThreadContextElement;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface jf5<S> extends xv4.b {

    /* compiled from: ThreadContextElement.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(@NotNull jf5<S> jf5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) xv4.b.a.a(jf5Var, r, j05Var);
        }

        @Nullable
        public static <S, E extends xv4.b> E b(@NotNull jf5<S> jf5Var, @NotNull xv4.c<E> cVar) {
            return (E) xv4.b.a.b(jf5Var, cVar);
        }

        @NotNull
        public static <S> xv4 c(@NotNull jf5<S> jf5Var, @NotNull xv4.c<?> cVar) {
            return xv4.b.a.c(jf5Var, cVar);
        }

        @NotNull
        public static <S> xv4 d(@NotNull jf5<S> jf5Var, @NotNull xv4 xv4Var) {
            return xv4.b.a.d(jf5Var, xv4Var);
        }
    }

    void j3(@NotNull xv4 xv4Var, S s);

    S p3(@NotNull xv4 xv4Var);
}