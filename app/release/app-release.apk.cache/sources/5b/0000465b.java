package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", "", "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", com.anythink.expressad.foundation.d.c.bV, "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class he5 extends me5 implements sb5 {
    private final boolean t;

    public he5(@Nullable ee5 ee5Var) {
        super(true);
        F0(ee5Var);
        this.t = r1();
    }

    private final boolean r1() {
        mb5 B0 = B0();
        nb5 nb5Var = B0 instanceof nb5 ? (nb5) B0 : null;
        me5 E0 = nb5Var == null ? null : nb5Var.E0();
        if (E0 == null) {
            return false;
        }
        while (!E0.y0()) {
            mb5 B02 = E0.B0();
            nb5 nb5Var2 = B02 instanceof nb5 ? (nb5) B02 : null;
            if (nb5Var2 == null) {
                E0 = null;
                continue;
            } else {
                E0 = nb5Var2.E0();
                continue;
            }
            if (E0 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.sb5
    public boolean complete() {
        return N0(yq4.a);
    }

    @Override // com.p7700g.p99005.sb5
    public boolean d(@NotNull Throwable th) {
        return N0(new ub5(th, false, 2, null));
    }

    @Override // com.p7700g.p99005.me5
    public boolean y0() {
        return this.t;
    }

    @Override // com.p7700g.p99005.me5
    public boolean z0() {
        return true;
    }
}