package com.p7700g.p99005;

import com.facebook.ads.NativeAd;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t83 extends q83 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var, nativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "ad");
    }

    @Override // com.p7700g.p99005.q83, com.p7700g.p99005.l13
    public void f() {
        if (yz2.a.e(i())) {
            i().setContentView(b03.k.T);
        } else {
            i().setContentView(b03.k.P);
        }
        super.f();
    }
}