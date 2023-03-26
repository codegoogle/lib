package com.p7700g.p99005;

import com.p7700g.p99005.mm5;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainDispatchers.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "()V", "loadPriority", "", "getLoadPriority", "()I", "createDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "allFactories", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@zd5
/* loaded from: classes3.dex */
public final class qm5 implements mm5 {
    @NotNull
    public static final qm5 a = new qm5();

    private qm5() {
    }

    @Override // com.p7700g.p99005.mm5
    @NotNull
    public qe5 createDispatcher(@NotNull List<? extends mm5> list) {
        return new pm5(null, null, 2, null);
    }

    @Override // com.p7700g.p99005.mm5
    public int getLoadPriority() {
        return -1;
    }

    @Override // com.p7700g.p99005.mm5
    @Nullable
    public String hintOnError() {
        return mm5.a.a(this);
    }
}