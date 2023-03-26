package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuation.kt */
@vo4(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class jb5 {
    @zd5
    public static final void a(@NotNull gb5<?> gb5Var, @NotNull gd5 gd5Var) {
        gb5Var.D(new hd5(gd5Var));
    }

    @NotNull
    public static final <T> hb5<T> b(@NotNull uv4<? super T> uv4Var) {
        if (!(uv4Var instanceof ul5)) {
            return new hb5<>(uv4Var, 1);
        }
        hb5<T> k = ((ul5) uv4Var).k();
        if (k == null || !k.K()) {
            k = null;
        }
        return k == null ? new hb5<>(uv4Var, 2) : k;
    }

    public static final void c(@NotNull gb5<?> gb5Var, @NotNull hm5 hm5Var) {
        gb5Var.D(new xe5(hm5Var));
    }

    @Nullable
    public static final <T> Object d(@NotNull f05<? super gb5<? super T>, yq4> f05Var, @NotNull uv4<? super T> uv4Var) {
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        f05Var.M(hb5Var);
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    private static final <T> Object e(f05<? super gb5<? super T>, yq4> f05Var, uv4<? super T> uv4Var) {
        z15.e(0);
        hb5 hb5Var = new hb5(fw4.d(uv4Var), 1);
        hb5Var.T();
        f05Var.M(hb5Var);
        Object x = hb5Var.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        z15.e(1);
        return x;
    }

    @Nullable
    public static final <T> Object f(@NotNull f05<? super gb5<? super T>, yq4> f05Var, @NotNull uv4<? super T> uv4Var) {
        hb5 b = b(fw4.d(uv4Var));
        f05Var.M(b);
        Object x = b.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        return x;
    }

    private static final <T> Object g(f05<? super gb5<? super T>, yq4> f05Var, uv4<? super T> uv4Var) {
        z15.e(0);
        hb5 b = b(fw4.d(uv4Var));
        f05Var.M(b);
        Object x = b.x();
        if (x == gw4.h()) {
            ow4.c(uv4Var);
        }
        z15.e(1);
        return x;
    }
}