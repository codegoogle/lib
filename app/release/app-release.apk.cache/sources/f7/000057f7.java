package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MainCoroutineDispatcher.kt */
@vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "limitedParallelism", "parallelism", "", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class qe5 extends ec5 {
    @NotNull
    public abstract qe5 K();

    @zd5
    @Nullable
    public final String W() {
        qe5 qe5Var;
        qe5 e = dd5.e();
        if (this == e) {
            return "Dispatchers.Main";
        }
        try {
            qe5Var = e.K();
        } catch (UnsupportedOperationException unused) {
            qe5Var = null;
        }
        if (this == qe5Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public String toString() {
        String W = W();
        if (W == null) {
            return qc5.a(this) + '@' + qc5.b(this);
        }
        return W;
    }

    @Override // com.p7700g.p99005.ec5
    @NotNull
    public ec5 z(int i) {
        cm5.a(i);
        return this;
    }
}