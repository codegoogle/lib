package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes2.dex */
public class GoogleAdATInterstitialAdapter extends CustomInterstitialAdapter {
    private static final String d = AdmobATInterstitialAdapter.class.getSimpleName();
    public InterstitialAd a;
    private FullScreenContentCallback f;
    private InterstitialAdLoadCallback g;
    public AdManagerAdRequest b = null;
    private String e = "";
    public boolean c = false;

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends InterstitialAdLoadCallback {
        public AnonymousClass1() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.a = null;
            if (googleAdATInterstitialAdapter.mLoadListener != null) {
                GoogleAdATInterstitialAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(@x1 InterstitialAd interstitialAd) {
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.a = interstitialAd;
            googleAdATInterstitialAdapter.c = true;
            if (googleAdATInterstitialAdapter.mLoadListener != null) {
                GoogleAdATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$2  reason: invalid class name */
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
                String str = GoogleAdATInterstitialAdapter.this.e;
                GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
                InterstitialAd.load(context, str, googleAdATInterstitialAdapter.b, googleAdATInterstitialAdapter.g);
            } catch (Throwable th) {
                if (GoogleAdATInterstitialAdapter.this.mLoadListener != null) {
                    GoogleAdATInterstitialAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
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
            this.g = null;
            this.f = null;
            this.b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        return this.a != null && this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("unit_id");
        this.e = str;
        if (TextUtils.isEmpty(str)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.3
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str2) {
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                GoogleAdATInterstitialAdapter.a(GoogleAdATInterstitialAdapter.this, context);
            }
        });
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
        this.c = false;
        FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.4
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (GoogleAdATInterstitialAdapter.this.mImpressListener != null) {
                    GoogleAdATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AdMobATInitManager.getInstance().removeCache(GoogleAdATInterstitialAdapter.this.getTrackingInfo().w());
                if (GoogleAdATInterstitialAdapter.this.mImpressListener != null) {
                    GoogleAdATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                GoogleAdATInterstitialAdapter.this.mDismissType = 99;
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                if (GoogleAdATInterstitialAdapter.this.mImpressListener != null) {
                    GoogleAdATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }
        };
        this.f = fullScreenContentCallback;
        this.a.setFullScreenContentCallback(fullScreenContentCallback);
        this.a.show(activity);
    }

    private void a(Context context) {
        this.b = new AdManagerAdRequest.Builder().build();
        this.g = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static /* synthetic */ void a(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter, Context context) {
        googleAdATInterstitialAdapter.b = new AdManagerAdRequest.Builder().build();
        googleAdATInterstitialAdapter.g = new AnonymousClass1();
        googleAdATInterstitialAdapter.postOnMainThread(new AnonymousClass2(context));
    }
}