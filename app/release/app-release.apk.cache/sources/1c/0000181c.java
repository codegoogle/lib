package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public interface MediationNativeListener {
    void onAdClicked(@x1 MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(@x1 MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(@x1 MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(@x1 MediationNativeAdapter mediationNativeAdapter, @x1 AdError adError);

    void onAdImpression(@x1 MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(@x1 MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(@x1 MediationNativeAdapter mediationNativeAdapter, @x1 UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@x1 MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(@x1 MediationNativeAdapter mediationNativeAdapter);

    void zzc(@x1 MediationNativeAdapter mediationNativeAdapter, @x1 NativeCustomTemplateAd nativeCustomTemplateAd);

    void zze(@x1 MediationNativeAdapter mediationNativeAdapter, @x1 NativeCustomTemplateAd nativeCustomTemplateAd, @x1 String str);
}