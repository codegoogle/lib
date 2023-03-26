package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATSplashAdapter extends CustomSplashAdapter {
    public static final String TAG = "AdmobATSplashAdapter";
    public AppOpenAd.AppOpenAdLoadCallback c;
    public FullScreenContentCallback d;
    public AppOpenAd e;
    private int g;
    private String f = "";
    public Bundle a = new Bundle();
    public boolean b = false;

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends AppOpenAd.AppOpenAdLoadCallback {
        public AnonymousClass2() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            AdMobATInitManager.getInstance().removeCache(AdmobATSplashAdapter.this.toString());
            if (AdmobATSplashAdapter.this.mLoadListener != null) {
                AdmobATSplashAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(@x1 AppOpenAd appOpenAd) {
            AdMobATInitManager.getInstance().removeCache(AdmobATSplashAdapter.this.toString());
            AdmobATSplashAdapter admobATSplashAdapter = AdmobATSplashAdapter.this;
            admobATSplashAdapter.e = appOpenAd;
            if (admobATSplashAdapter.mLoadListener != null) {
                AdmobATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATSplashAdapter$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ AdRequest b;

        public AnonymousClass3(Context context, AdRequest adRequest) {
            this.a = context;
            this.b = adRequest;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppOpenAd.load(this.a, AdmobATSplashAdapter.this.f, this.b, AdmobATSplashAdapter.this.g, AdmobATSplashAdapter.this.c);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.c = null;
        this.d = null;
        this.a = null;
        this.b = true;
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
        return this.e != null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.f = (String) map.get("unit_id");
        if (!TextUtils.isEmpty((String) map.get("app_id")) && !TextUtils.isEmpty(this.f)) {
            this.g = -1;
            try {
                Object obj = map.get("orientation");
                if (obj != null) {
                    this.g = Integer.parseInt((String) obj);
                }
            } catch (Throwable unused) {
            }
            int i = this.g;
            if (i != 1 && i != 2) {
                this.g = 1;
            }
            AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATSplashAdapter.this.a = AdMobATInitManager.getInstance().getRequestBundle(map);
                    AdmobATSplashAdapter.a(AdmobATSplashAdapter.this, context);
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

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.anythink.network.admob.AdmobATSplashAdapter.4
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (AdmobATSplashAdapter.this.mImpressionListener != null) {
                    AdmobATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                if (AdmobATSplashAdapter.this.mImpressionListener != null) {
                    AdmobATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                String str = AdmobATSplashAdapter.TAG;
                adError.getCode();
                adError.getMessage();
                AdmobATSplashAdapter.this.mDismissType = 99;
                if (AdmobATSplashAdapter.this.mImpressionListener != null) {
                    AdmobATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                if (AdmobATSplashAdapter.this.mImpressionListener != null) {
                    AdmobATSplashAdapter.this.mImpressionListener.onSplashAdShow();
                }
            }
        };
        this.d = fullScreenContentCallback;
        this.e.setFullScreenContentCallback(fullScreenContentCallback);
        this.e.show(activity);
    }

    private void a(Context context) {
        this.c = new AnonymousClass2();
        AdMobATInitManager.getInstance().addCache(toString(), this);
        postOnMainThread(new AnonymousClass3(context, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, this.a).build()));
    }

    public static /* synthetic */ void a(AdmobATSplashAdapter admobATSplashAdapter, Context context) {
        admobATSplashAdapter.c = new AnonymousClass2();
        AdMobATInitManager.getInstance().addCache(admobATSplashAdapter.toString(), admobATSplashAdapter);
        admobATSplashAdapter.postOnMainThread(new AnonymousClass3(context, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, admobATSplashAdapter.a).build()));
    }
}