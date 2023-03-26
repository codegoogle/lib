package com.p7700g.p99005;

import com.p7700g.p99005.qp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", "T", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ye5<T> extends le5 {
    @NotNull
    private final hb5<T> w;

    /* JADX WARN: Multi-variable type inference failed */
    public ye5(@NotNull hb5<? super T> hb5Var) {
        this.w = hb5Var;
    }

    @Override // com.p7700g.p99005.wb5
    public void D0(@Nullable Throwable th) {
        Object C0 = E0().C0();
        if (C0 instanceof ub5) {
            hb5<T> hb5Var = this.w;
            qp4.a aVar = qp4.s;
            hb5Var.u(qp4.b(rp4.a(((ub5) C0).b)));
            return;
        }
        hb5<T> hb5Var2 = this.w;
        qp4.a aVar2 = qp4.s;
        hb5Var2.u(qp4.b(ne5.o(C0)));
    }

    @Override // com.p7700g.p99005.f05
    public /* bridge */ /* synthetic */ yq4 M(Throwable th) {
        D0(th);
        return yq4.a;
    }
}