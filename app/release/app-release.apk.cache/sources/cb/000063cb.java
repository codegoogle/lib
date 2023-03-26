package com.p7700g.p99005;

import com.p7700g.p99005.yk5;
import org.jetbrains.annotations.NotNull;

/* compiled from: Context.kt */
@vo4(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", "T", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class wi5 {
    @xn4(level = zn4.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ pi5 a(pi5 pi5Var, int i) {
        pi5 d;
        d = d(pi5Var, i, null, 2, null);
        return d;
    }

    @NotNull
    public static final <T> pi5<T> b(@NotNull pi5<? extends T> pi5Var, int i, @NotNull ng5 ng5Var) {
        int i2;
        ng5 ng5Var2;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && ng5Var != ng5.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    ng5Var2 = ng5.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    ng5Var2 = ng5Var;
                }
                return pi5Var instanceof yk5 ? yk5.a.a((yk5) pi5Var, null, i2, ng5Var2, 1, null) : new pk5(pi5Var, null, i2, ng5Var2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(c25.C("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i)).toString());
    }

    public static /* synthetic */ pi5 c(pi5 pi5Var, int i, int i2, Object obj) {
        pi5 a;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        a = a(pi5Var, i);
        return a;
    }

    public static /* synthetic */ pi5 d(pi5 pi5Var, int i, ng5 ng5Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            ng5Var = ng5.SUSPEND;
        }
        return ri5.o(pi5Var, i, ng5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> pi5<T> e(@NotNull pi5<? extends T> pi5Var) {
        return pi5Var instanceof ji5 ? pi5Var : new ki5(pi5Var);
    }

    private static final void f(xv4 xv4Var) {
        if (!(xv4Var.get(ee5.m0) == null)) {
            throw new IllegalArgumentException(c25.C("Flow context cannot contain job in it. Had ", xv4Var).toString());
        }
    }

    @NotNull
    public static final <T> pi5<T> g(@NotNull pi5<? extends T> pi5Var) {
        pi5<T> d;
        d = d(pi5Var, -1, null, 2, null);
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> pi5<T> h(@NotNull pi5<? extends T> pi5Var, @NotNull xv4 xv4Var) {
        f(xv4Var);
        return c25.g(xv4Var, zv4.s) ? pi5Var : pi5Var instanceof yk5 ? yk5.a.a((yk5) pi5Var, xv4Var, 0, null, 6, null) : new pk5(pi5Var, xv4Var, 0, null, 12, null);
    }
}