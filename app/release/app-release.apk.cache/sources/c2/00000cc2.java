package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public interface S2SRewardedVideoAdListener extends RewardedVideoAdListener {
    void onRewardServerFailed();

    void onRewardServerSuccess();
}