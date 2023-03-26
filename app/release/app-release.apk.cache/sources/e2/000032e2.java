package com.greedygame.core.interstitial.general;

import android.content.Context;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.u13;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GGAutoRefreshInterstitialAd extends GGInterstitialAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GGAutoRefreshInterstitialAd(@NotNull Context context, @NotNull String str) {
        super(context, str);
        c25.p(context, "mContext");
        c25.p(str, "mUnitId");
        f().e(u13.AUTO);
    }
}