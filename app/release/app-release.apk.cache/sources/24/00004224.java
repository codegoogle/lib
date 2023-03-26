package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineExceptionHandler.kt */
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface fc5 extends xv4.b {
    @NotNull
    public static final b l0 = b.s;

    /* compiled from: CoroutineExceptionHandler.kt */
    @vo4(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R a(@NotNull fc5 fc5Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            return (R) xv4.b.a.a(fc5Var, r, j05Var);
        }

        @Nullable
        public static <E extends xv4.b> E b(@NotNull fc5 fc5Var, @NotNull xv4.c<E> cVar) {
            return (E) xv4.b.a.b(fc5Var, cVar);
        }

        @NotNull
        public static xv4 c(@NotNull fc5 fc5Var, @NotNull xv4.c<?> cVar) {
            return xv4.b.a.c(fc5Var, cVar);
        }

        @NotNull
        public static xv4 d(@NotNull fc5 fc5Var, @NotNull xv4 xv4Var) {
            return xv4.b.a.d(fc5Var, xv4Var);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements xv4.c<fc5> {
        public static final /* synthetic */ b s = new b();

        private b() {
        }
    }

    void handleException(@NotNull xv4 xv4Var, @NotNull Throwable th);
}