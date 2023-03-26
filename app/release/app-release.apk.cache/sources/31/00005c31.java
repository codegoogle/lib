package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Scopes.kt */
@vo4(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class sl5 implements lc5 {
    @NotNull
    private final xv4 s;

    public sl5(@NotNull xv4 xv4Var) {
        this.s = xv4Var;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("CoroutineScope(coroutineContext=");
        G.append(y());
        G.append(')');
        return G.toString();
    }

    @Override // com.p7700g.p99005.lc5
    @NotNull
    public xv4 y() {
        return this.s;
    }
}