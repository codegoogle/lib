package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationInterstitialListener {
    void onAdClicked(@x1 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(@x1 MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(@x1 MediationInterstitialAdapter mediationInterstitialAdapter, int i);

    void onAdFailedToLoad(@x1 MediationInterstitialAdapter mediationInterstitialAdapter, @x1 AdError adError);

    void onAdLeftApplication(@x1 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(@x1 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(@x1 MediationInterstitialAdapter mediationInterstitialAdapter);
}