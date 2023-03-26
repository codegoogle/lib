package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public interface RewardedVideoAdListener extends AdListener {
    @Override // com.facebook.ads.AdListener
    void onLoggingImpression(Ad ad);

    void onRewardedVideoClosed();

    void onRewardedVideoCompleted();
}