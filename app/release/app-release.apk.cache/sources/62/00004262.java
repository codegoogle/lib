package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Actor.kt */
@vo4(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"actor", "Lkotlinx/coroutines/channels/SendChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", com.anythink.expressad.foundation.d.c.bR, "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class fg5 {
    @ve5
    @NotNull
    public static final <E> nh5<E> a(@NotNull lc5 lc5Var, @NotNull xv4 xv4Var, int i, @NotNull nc5 nc5Var, @Nullable f05<? super Throwable, yq4> f05Var, @NotNull j05<? super gg5<E>, ? super uv4<? super yq4>, ? extends Object> j05Var) {
        eg5 eg5Var;
        xv4 e = dc5.e(lc5Var, xv4Var);
        og5 d = rg5.d(i, null, null, 6, null);
        if (nc5Var.i()) {
            eg5Var = new ch5(e, d, j05Var);
        } else {
            eg5Var = new eg5(e, d, true);
        }
        if (f05Var != null) {
            ((me5) eg5Var).d3(f05Var);
        }
        ((qa5) eg5Var).v1(nc5Var, eg5Var, j05Var);
        return eg5Var;
    }

    public static /* synthetic */ nh5 b(lc5 lc5Var, xv4 xv4Var, int i, nc5 nc5Var, f05 f05Var, j05 j05Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xv4Var = zv4.s;
        }
        xv4 xv4Var2 = xv4Var;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            nc5Var = nc5.DEFAULT;
        }
        nc5 nc5Var2 = nc5Var;
        if ((i2 & 8) != 0) {
            f05Var = null;
        }
        return a(lc5Var, xv4Var2, i3, nc5Var2, f05Var, j05Var);
    }
}