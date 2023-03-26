package com.p7700g.p99005;

import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s93 extends q93 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull StaticNativeAd staticNativeAd) {
        super(q13Var, n13Var, staticNativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(staticNativeAd, "ad");
    }

    @Override // com.p7700g.p99005.q93, com.p7700g.p99005.u93, com.p7700g.p99005.l13
    public void f() {
        if (yz2.a.e(p())) {
            p().setContentView(b03.k.U);
        } else {
            p().setContentView(b03.k.Q);
        }
        super.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s93(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull VideoNativeAd videoNativeAd) {
        super(q13Var, n13Var, videoNativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(videoNativeAd, "ad");
    }
}