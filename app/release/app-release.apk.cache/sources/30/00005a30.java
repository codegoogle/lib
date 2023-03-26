package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: SharedFlow.kt */
@vo4(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a6\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a#\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u0019*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u001b\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "getNO_VALUE$annotations", "()V", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", la1.l, "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", "item", "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class rj5 {
    @cz4
    @NotNull
    public static final an5 a = new an5("NO_VALUE");

    @NotNull
    public static final <T> kj5<T> a(int i, int i2, @NotNull ng5 ng5Var) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && ng5Var != ng5.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new qj5(i, i3, ng5Var);
                }
                throw new IllegalArgumentException(c25.C("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", ng5Var).toString());
            }
            throw new IllegalArgumentException(c25.C("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        throw new IllegalArgumentException(c25.C("replay cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    public static /* synthetic */ kj5 b(int i, int i2, ng5 ng5Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            ng5Var = ng5.SUSPEND;
        }
        return a(i, i2, ng5Var);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j) {
        return f(objArr, j);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j, Object obj) {
        h(objArr, j, obj);
    }

    @NotNull
    public static final <T> pi5<T> e(@NotNull pj5<? extends T> pj5Var, @NotNull xv4 xv4Var, int i, @NotNull ng5 ng5Var) {
        return ((i == 0 || i == -3) && ng5Var == ng5.SUSPEND) ? pj5Var : new pk5(pj5Var, xv4Var, i, ng5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}