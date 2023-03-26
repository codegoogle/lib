package com.p7700g.p99005;

import com.p7700g.p99005.xv4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationInterceptor.kt */
@vo4(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ(\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\bH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlin/coroutines/CoroutineContext$Element;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "releaseInterceptedContinuation", "", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public interface vv4 extends xv4.b {
    @NotNull
    public static final b k0 = b.s;

    /* compiled from: ContinuationInterceptor.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <R> R a(@NotNull vv4 vv4Var, R r, @NotNull j05<? super R, ? super xv4.b, ? extends R> j05Var) {
            c25.p(j05Var, "operation");
            return (R) xv4.b.a.a(vv4Var, r, j05Var);
        }

        @Nullable
        public static <E extends xv4.b> E b(@NotNull vv4 vv4Var, @NotNull xv4.c<E> cVar) {
            c25.p(cVar, "key");
            if (cVar instanceof sv4) {
                sv4 sv4Var = (sv4) cVar;
                if (sv4Var.a(vv4Var.getKey())) {
                    E e = (E) sv4Var.b(vv4Var);
                    if (e instanceof xv4.b) {
                        return e;
                    }
                    return null;
                }
                return null;
            } else if (vv4.k0 == cVar) {
                c25.n(vv4Var, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return vv4Var;
            } else {
                return null;
            }
        }

        @NotNull
        public static xv4 c(@NotNull vv4 vv4Var, @NotNull xv4.c<?> cVar) {
            c25.p(cVar, "key");
            if (!(cVar instanceof sv4)) {
                return vv4.k0 == cVar ? zv4.s : vv4Var;
            }
            sv4 sv4Var = (sv4) cVar;
            return (!sv4Var.a(vv4Var.getKey()) || sv4Var.b(vv4Var) == null) ? vv4Var : zv4.s;
        }

        @NotNull
        public static xv4 d(@NotNull vv4 vv4Var, @NotNull xv4 xv4Var) {
            c25.p(xv4Var, "context");
            return xv4.b.a.d(vv4Var, xv4Var);
        }

        public static void e(@NotNull vv4 vv4Var, @NotNull uv4<?> uv4Var) {
            c25.p(uv4Var, "continuation");
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @vo4(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/ContinuationInterceptor$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements xv4.c<vv4> {
        public static final /* synthetic */ b s = new b();

        private b() {
        }
    }

    @NotNull
    <T> uv4<T> E(@NotNull uv4<? super T> uv4Var);

    void f(@NotNull uv4<?> uv4Var);

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @Nullable
    <E extends xv4.b> E get(@NotNull xv4.c<E> cVar);

    @Override // com.p7700g.p99005.xv4.b, com.p7700g.p99005.xv4
    @NotNull
    xv4 minusKey(@NotNull xv4.c<?> cVar);
}