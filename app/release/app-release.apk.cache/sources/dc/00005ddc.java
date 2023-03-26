package com.p7700g.p99005;

import android.view.View;
import com.google.android.gms.ads.AdView;
import com.greedygame.core.network.model.responses.Ad;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tc3 extends y03 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc3(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull Ad ad) {
        super(q13Var, n13Var, ad);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "ggAdView");
        c25.p(ad, "ad");
    }

    @Override // com.p7700g.p99005.y03
    @Nullable
    public View q() {
        Object a = h().a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.google.android.gms.ads.AdView");
        return (AdView) a;
    }
}