package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String e = "AdmobATInterstitialAdapter";
    public InterstitialAd a;
    private FullScreenContentCallback g;
    private InterstitialAdLoadCallback h;
    public AdRequest b = null;
    private String f = "";
    public Bundle c = new Bundle();
    public boolean d = false;

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends InterstitialAdLoadCallback {
        public AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            AdmobATInterstitialAdapter.this.a = null;
            AdMobATInitManager.getInstance().removeCache(AdmobATInterstitialAdapter.this.getTrackingInfo().w());
            if (AdmobATInterstitialAdapter.this.mLoadListener != null) {
                AdmobATInterstitialAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(@x1 InterstitialAd interstitialAd) {
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.a = interstitialAd;
            admobATInterstitialAdapter.d = true;
            AdMobATInitManager.getInstance().addCache(AdmobATInterstitialAdapter.this.getTrackingInfo().w(), AdmobATInterstitialAdapter.this.a);
            if (AdmobATInterstitialAdapter.this.mLoadListener != null) {
                AdmobATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ Context a;

        public AnonymousClass2(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.a;
                String str = AdmobATInterstitialAdapter.this.f;
                AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
                InterstitialAd.load(context, str, admobATInterstitialAdapter.b, admobATInterstitialAdapter.h);
            } catch (Throwable th) {
                if (AdmobATInterstitialAdapter.this.mLoadListener != null) {
                    AdmobATInterstitialAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        try {
            InterstitialAd interstitialAd = this.a;
            if (interstitialAd != null) {
                interstitialAd.setFullScreenContentCallback(null);
                this.a = null;
            }
            this.h = null;
            this.g = null;
            this.c = null;
            this.b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        return this.a != null && this.d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.f = (String) map.get("unit_id");
        if (!TextUtils.isEmpty((String) map.get("app_id")) && !TextUtils.isEmpty(this.f)) {
            AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATInterstitialAdapter.this.c = AdMobATInitManager.getInstance().getRequestBundle(map);
                    AdmobATInterstitialAdapter.a(AdmobATInterstitialAdapter.this, context);
                }
            });
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "appid or unitId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (!isAdReady() || activity == null) {
            return;
        }
        this.d = false;
        FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (AdmobATInterstitialAdapter.this.mImpressListener != null) {
                    AdmobATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AdMobATInitManager.getInstance().removeCache(AdmobATInterstitialAdapter.this.getTrackingInfo().w());
                if (AdmobATInterstitialAdapter.this.mImpressListener != null) {
                    AdmobATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                AdmobATInterstitialAdapter.this.mDismissType = 99;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                if (AdmobATInterstitialAdapter.this.mImpressListener != null) {
                    AdmobATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }
        };
        this.g = fullScreenContentCallback;
        this.a.setFullScreenContentCallback(fullScreenContentCallback);
        this.a.show(activity);
    }

    private void a(Context context) {
        this.b = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, this.c).build();
        this.h = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static /* synthetic */ void a(AdmobATInterstitialAdapter admobATInterstitialAdapter, Context context) {
        admobATInterstitialAdapter.b = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, admobATInterstitialAdapter.c).build();
        admobATInterstitialAdapter.h = new AnonymousClass1();
        admobATInterstitialAdapter.postOnMainThread(new AnonymousClass2(context));
    }
}