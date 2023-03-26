package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public interface MediationRewardedAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@x1 AdError adError);

    @Deprecated
    void onAdFailedToShow(@x1 String str);

    void onUserEarnedReward(@x1 RewardItem rewardItem);

    void onVideoComplete();

    void onVideoStart();
}