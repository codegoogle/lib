package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: Mutex.kt */
@vo4(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016R\u0010\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/sync/Empty;", "", "locked", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class uo5 {
    @cz4
    @NotNull
    public final Object a;

    public uo5(@NotNull Object obj) {
        this.a = obj;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Empty[");
        G.append(this.a);
        G.append(f14.v);
        return G.toString();
    }
}