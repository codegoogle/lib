package com.google.android.gms.ads.mediation;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.p7700g.p99005.x1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class Adapter implements MediationExtrasReceiver {
    @x1
    public abstract VersionInfo getSDKVersionInfo();

    @x1
    public abstract VersionInfo getVersionInfo();

    public abstract void initialize(@x1 Context context, @x1 InitializationCompleteCallback initializationCompleteCallback, @x1 List<MediationConfiguration> list);

    public void loadBannerAd(@x1 MediationBannerAdConfiguration mediationBannerAdConfiguration, @x1 MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterscrollerAd(@x1 MediationBannerAdConfiguration mediationBannerAdConfiguration, @x1 MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(@x1 MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @x1 MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadNativeAd(@x1 MediationNativeAdConfiguration mediationNativeAdConfiguration, @x1 MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedAd(@x1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @x1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedInterstitialAd(@x1 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @x1 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.ERROR_DOMAIN));
    }
}