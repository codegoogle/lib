package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    private static final String g = "AdmobATRewardedVideoAdapter";
    public RewardedAd a;
    public RewardedInterstitialAd c;
    private RewardedAdLoadCallback j;
    private FullScreenContentCallback k;
    private OnUserEarnedRewardListener l;
    private RewardedInterstitialAdLoadCallback m;
    public AdRequest b = null;
    private String h = "";
    private int i = 1;
    public Bundle d = new Bundle();
    public boolean e = false;
    public boolean f = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        try {
            RewardedAd rewardedAd = this.a;
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(null);
                this.a = null;
            }
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.b = null;
            this.d = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.h;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        int i;
        return this.f && (((i = this.i) == 1 && this.a != null) || (i == 2 && this.c != null));
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        this.h = (String) map.get("unit_id");
        if (!TextUtils.isEmpty((String) map.get("app_id")) && !TextUtils.isEmpty(this.h)) {
            if (map.containsKey("unit_type")) {
                this.i = Integer.parseInt(map.get("unit_type").toString());
            }
            AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATRewardedVideoAdapter.this.d = AdMobATInitManager.getInstance().getRequestBundle(map);
                    AdmobATRewardedVideoAdapter.this.b = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, AdmobATRewardedVideoAdapter.this.d).build();
                    AdmobATRewardedVideoAdapter.this.startLoadAd(context);
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

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (!isAdReady() || activity == null) {
            return;
        }
        this.f = false;
        this.k = new FullScreenContentCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (AdmobATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdmobATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AdMobATInitManager.getInstance().removeCache(AdmobATRewardedVideoAdapter.this.getTrackingInfo().w());
                if (AdmobATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdmobATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                if (AdmobATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdmobATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(adError.getCode()), adError.getMessage());
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                admobATRewardedVideoAdapter.e = false;
                if (admobATRewardedVideoAdapter.mImpressionListener != null) {
                    AdmobATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }
        };
        this.l = new OnUserEarnedRewardListener() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.5
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(@x1 RewardItem rewardItem) {
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                if (!admobATRewardedVideoAdapter.e) {
                    admobATRewardedVideoAdapter.e = true;
                    if (admobATRewardedVideoAdapter.mImpressionListener != null) {
                        AdmobATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }
                if (AdmobATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdmobATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }
        };
        if (this.i != 2) {
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.h);
            }
            this.a.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build());
            this.a.setFullScreenContentCallback(this.k);
            this.a.show(activity, this.l);
            return;
        }
        this.c.setFullScreenContentCallback(this.k);
        this.c.show(activity, this.l);
    }

    public void startLoadAd(Context context) {
        if (this.i != 2) {
            startLoadRewardedVideoAd(context);
        } else {
            startLoadInterstitlalRewardAd(context);
        }
    }

    public void startLoadInterstitlalRewardAd(final Context context) {
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AdmobATRewardedVideoAdapter.this.m = new RewardedInterstitialAdLoadCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1
                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdFailedToLoad(LoadAdError loadAdError) {
                            if (AdmobATRewardedVideoAdapter.this.mLoadListener != null) {
                                AdmobATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                            }
                        }

                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
                            AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                            admobATRewardedVideoAdapter.c = rewardedInterstitialAd;
                            admobATRewardedVideoAdapter.f = true;
                            if (admobATRewardedVideoAdapter.mLoadListener != null) {
                                AdmobATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = AdmobATRewardedVideoAdapter.this.h;
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    RewardedInterstitialAd.load(context2, str, admobATRewardedVideoAdapter.b, admobATRewardedVideoAdapter.m);
                } catch (Throwable th) {
                    if (AdmobATRewardedVideoAdapter.this.mLoadListener != null) {
                        AdmobATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }

    public void startLoadRewardedVideoAd(final Context context) {
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AdmobATRewardedVideoAdapter.this.j = new RewardedAdLoadCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1
                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
                            AdmobATRewardedVideoAdapter.this.a = null;
                            AdMobATInitManager.getInstance().removeCache(AdmobATRewardedVideoAdapter.this.getTrackingInfo().w());
                            if (AdmobATRewardedVideoAdapter.this.mLoadListener != null) {
                                AdmobATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                            }
                        }

                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdLoaded(@x1 RewardedAd rewardedAd) {
                            AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                            admobATRewardedVideoAdapter.a = rewardedAd;
                            admobATRewardedVideoAdapter.f = true;
                            AdMobATInitManager.getInstance().addCache(AdmobATRewardedVideoAdapter.this.getTrackingInfo().w(), AdmobATRewardedVideoAdapter.this.a);
                            if (AdmobATRewardedVideoAdapter.this.mLoadListener != null) {
                                AdmobATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = AdmobATRewardedVideoAdapter.this.h;
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    RewardedAd.load(context2, str, admobATRewardedVideoAdapter.b, admobATRewardedVideoAdapter.j);
                } catch (Throwable th) {
                    if (AdmobATRewardedVideoAdapter.this.mLoadListener != null) {
                        AdmobATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }

    private void b(Activity activity) {
        if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
            this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.h);
        }
        this.a.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build());
        this.a.setFullScreenContentCallback(this.k);
        this.a.show(activity, this.l);
    }

    private void a(Activity activity) {
        this.c.setFullScreenContentCallback(this.k);
        this.c.show(activity, this.l);
    }
}