package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationBannerListener {
    void onAdClicked(@x1 MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(@x1 MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(@x1 MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdFailedToLoad(@x1 MediationBannerAdapter mediationBannerAdapter, @x1 AdError adError);

    void onAdLeftApplication(@x1 MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(@x1 MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(@x1 MediationBannerAdapter mediationBannerAdapter);

    void zzd(@x1 MediationBannerAdapter mediationBannerAdapter, @x1 String str, @x1 String str2);
}