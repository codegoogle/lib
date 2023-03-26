package com.p7700g.p99005;

import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fa3 extends da3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa3(@NotNull q13 q13Var, @NotNull n13<?> n13Var) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationActivity");
        c25.p(n13Var, "adView");
    }

    @Override // com.p7700g.p99005.da3, com.p7700g.p99005.l13
    public void f() {
        if (yz2.a.e(i())) {
            i().setContentView(b03.k.V);
        } else {
            i().setContentView(b03.k.R);
        }
        super.f();
    }
}