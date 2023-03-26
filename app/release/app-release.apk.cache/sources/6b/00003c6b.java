package com.p7700g.p99005;

import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.Partner;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ca3 extends v83 {
    @NotNull
    private final yb3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca3(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.m = yb3Var;
    }

    private final void A() {
        Ad p;
        Partner w;
        Ad p2;
        NativeMediatedAsset v;
        if (y() != null || (p = p()) == null || (w = p.w()) == null || (p2 = p()) == null || (v = p2.v()) == null) {
            return;
        }
        u(new n13<>(null, v, w));
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void x() {
        Ad p;
        A();
        n13<?> y = y();
        if (y == null || (p = p()) == null) {
            return;
        }
        new ba3(this, y, p).f();
    }
}