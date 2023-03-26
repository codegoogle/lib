package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.mediation.zzb;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcne;
import com.p7700g.p99005.r22;
import com.p7700g.p99005.s22;
import com.p7700g.p99005.u22;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zzcne, zzb {
    @x1
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    @x1
    public AdView mAdView;
    @x1
    public InterstitialAd mInterstitialAd;

    public AdRequest buildAdRequest(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.zzb(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.zzc(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String str : keywords) {
                builder.addKeyword(str);
            }
        }
        if (mediationAdRequest.isTesting()) {
            zzaw.zzb();
            builder.zza(zzcfb.zzx(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            builder.zze(mediationAdRequest.taggedForChildDirectedTreatment() == 1);
        }
        builder.zzd(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.build();
    }

    @x1
    public abstract Bundle buildExtrasBundle(@x1 Bundle bundle, @x1 Bundle bundle2);

    @x1
    public String getAdUnitId(@x1 Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @x1
    public View getBannerView() {
        return this.mAdView;
    }

    @VisibleForTesting
    public InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzcne
    @x1
    public Bundle getInterstitialAdapterInfo() {
        zza zzaVar = new zza();
        zzaVar.zzb(1);
        return zzaVar.zza();
    }

    @Override // com.google.android.gms.ads.mediation.zzb
    @z1
    public zzdk getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.zza().zza();
        }
        return null;
    }

    @VisibleForTesting
    public AdLoader.Builder newAdLoader(Context context, String str) {
        return new AdLoader.Builder(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@x1 Context context, @x1 MediationBannerListener mediationBannerListener, @x1 Bundle bundle, @x1 AdSize adSize, @x1 MediationAdRequest mediationAdRequest, @x1 Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new r22(this, mediationBannerListener));
        this.mAdView.loadAd(buildAdRequest(context, mediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@x1 Context context, @x1 MediationInterstitialListener mediationInterstitialListener, @x1 Bundle bundle, @x1 MediationAdRequest mediationAdRequest, @x1 Bundle bundle2) {
        InterstitialAd.load(context, getAdUnitId(bundle), buildAdRequest(context, mediationAdRequest, bundle2, bundle), new s22(this, mediationInterstitialListener));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@x1 Context context, @x1 MediationNativeListener mediationNativeListener, @x1 Bundle bundle, @x1 NativeMediationAdRequest nativeMediationAdRequest, @x1 Bundle bundle2) {
        u22 u22Var = new u22(this, mediationNativeListener);
        AdLoader.Builder withAdListener = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(u22Var);
        withAdListener.withNativeAdOptions(nativeMediationAdRequest.getNativeAdOptions());
        withAdListener.withNativeAdOptions(nativeMediationAdRequest.getNativeAdRequestOptions());
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(u22Var);
        }
        if (nativeMediationAdRequest.zzb()) {
            for (String str : nativeMediationAdRequest.zza().keySet()) {
                withAdListener.forCustomTemplateAd(str, u22Var, true != ((Boolean) nativeMediationAdRequest.zza().get(str)).booleanValue() ? null : u22Var);
            }
        }
        AdLoader build = withAdListener.build();
        this.adLoader = build;
        build.loadAd(buildAdRequest(context, nativeMediationAdRequest, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(null);
        }
    }
}