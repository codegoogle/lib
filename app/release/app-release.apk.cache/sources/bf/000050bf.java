package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChannelFlow.kt */
@vo4(d1 = {"\u00000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a[\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"withContextUndispatched", "T", bx.C4, "newContext", "Lkotlin/coroutines/CoroutineContext;", "value", "countOrElement", "", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asChannelFlow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "withUndispatchedContextCollector", "Lkotlinx/coroutines/flow/FlowCollector;", "emitContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class mk5 {
    public static final /* synthetic */ qi5 a(qi5 qi5Var, xv4 xv4Var) {
        return e(qi5Var, xv4Var);
    }

    @NotNull
    public static final <T> lk5<T> b(@NotNull pi5<? extends T> pi5Var) {
        lk5<T> lk5Var = pi5Var instanceof lk5 ? (lk5) pi5Var : null;
        return lk5Var == null ? new pk5(pi5Var, null, 0, null, 14, null) : lk5Var;
    }

    @Nullable
    public static final <T, V> Object c(@NotNull xv4 xv4Var, V v, @NotNull Object obj, @NotNull j05<? super V, ? super uv4<? super T>, ? extends Object> j05Var, @NotNull uv4<? super T> uv4Var) {
        Object c = fn5.c(xv4Var, obj);
        try {
            Object w3 = ((j05) k35.q(j05Var, 2)).w3(v, new gl5(uv4Var, xv4Var));
            fn5.a(xv4Var, c);
            if (w3 == gw4.h()) {
                ow4.c(uv4Var);
            }
            return w3;
        } catch (Throwable th) {
            fn5.a(xv4Var, c);
            throw th;
        }
    }

    public static /* synthetic */ Object d(xv4 xv4Var, Object obj, Object obj2, j05 j05Var, uv4 uv4Var, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = fn5.b(xv4Var);
        }
        return c(xv4Var, obj, obj2, j05Var, uv4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> qi5<T> e(qi5<? super T> qi5Var, xv4 xv4Var) {
        return qi5Var instanceof fl5 ? true : qi5Var instanceof al5 ? qi5Var : new il5(qi5Var, xv4Var);
    }
}