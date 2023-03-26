package com.p7700g.p99005;

import com.facebook.ads.AdView;
import com.greedygame.core.network.model.responses.Ad;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g93 extends v83 {
    @NotNull
    private final yb3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g93(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.m = yb3Var;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void x() {
        if (y() == null) {
            a().a();
        }
        n13<?> y = y();
        if (y == null) {
            return;
        }
        n13<?> y2 = y();
        Object a = y2 == null ? null : y2.a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.facebook.ads.AdView");
        AdView adView = (AdView) a;
        Ad p = p();
        if (p == null) {
            return;
        }
        new f93(this, y, p, adView).f();
    }
}