package com.p7700g.p99005;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Future.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/CancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "future", "Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Future;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class cb5 extends eb5 {
    @NotNull
    private final Future<?> s;

    public cb5(@NotNull Future<?> future) {
        this.s = future;
    }

    @Override // com.p7700g.p99005.f05
    public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
        a(th);
        return yq4.a;
    }

    @Override // com.p7700g.p99005.fb5
    public void a(@Nullable Throwable th) {
        if (th != null) {
            this.s.cancel(false);
        }
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("CancelFutureOnCancel[");
        G.append(this.s);
        G.append(f14.v);
        return G.toString();
    }
}