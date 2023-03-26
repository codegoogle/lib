package com.p7700g.p99005;

import com.p7700g.p99005.jf5;
import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadContextElement.kt */
@td5
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/CopyableThreadContextElement;", "S", "Lkotlinx/coroutines/ThreadContextElement;", "copyForChild", "mergeForChild", "Lkotlin/coroutines/CoroutineContext;", "overwritingElement", "Lkotlin/coroutines/CoroutineContext$Element;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@xc5
/* loaded from: classes3.dex */
public interface bc5<S> extends jf5<S> {

    /* compiled from: ThreadContextElement.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(@NotNull bc5<S> bc5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) jf5.a.a(bc5Var, r, j05Var);
        }

        @Nullable
        public static <S, E extends xv4.b> E b(@NotNull bc5<S> bc5Var, @NotNull xv4.c<E> cVar) {
            return (E) jf5.a.b(bc5Var, cVar);
        }

        @NotNull
        public static <S> xv4 c(@NotNull bc5<S> bc5Var, @NotNull xv4.c<?> cVar) {
            return jf5.a.c(bc5Var, cVar);
        }

        @NotNull
        public static <S> xv4 d(@NotNull bc5<S> bc5Var, @NotNull xv4 xv4Var) {
            return jf5.a.d(bc5Var, xv4Var);
        }
    }

    @NotNull
    xv4 P(@NotNull xv4.b bVar);

    @NotNull
    bc5<S> i3();
}