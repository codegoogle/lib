package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.p7700g.p99005.x1;
import java.util.Map;

/* loaded from: classes2.dex */
public class GoogleAdATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    private static final String e = "GoogleAdATRewardedVideoAdapter";
    public RewardedAd a;
    private RewardedAdLoadCallback g;
    private FullScreenContentCallback h;
    private OnUserEarnedRewardListener i;
    public AdManagerAdRequest b = null;
    private String f = "";
    public boolean c = false;
    public boolean d = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        try {
            RewardedAd rewardedAd = this.a;
            if (rewardedAd != null) {
                rewardedAd.setFullScreenContentCallback(null);
                this.a = null;
            }
            this.g = null;
            this.h = null;
            this.i = null;
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
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str = (String) map.get("unit_id");
        this.f = str;
        if (TextUtils.isEmpty(str)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        startLoadAd(context);
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
        this.d = false;
        if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
            this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f);
        }
        this.a.setServerSideVerificationOptions(new ServerSideVerificationOptions.Builder().setUserId(this.mUserId).setCustomData(this.mUserData).build());
        FullScreenContentCallback fullScreenContentCallback = new FullScreenContentCallback() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.2
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdClicked() {
                if (GoogleAdATRewardedVideoAdapter.this.mImpressionListener != null) {
                    GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdDismissedFullScreenContent() {
                AdMobATInitManager.getInstance().removeCache(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().w());
                if (GoogleAdATRewardedVideoAdapter.this.mImpressionListener != null) {
                    GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdFailedToShowFullScreenContent(AdError adError) {
                if (GoogleAdATRewardedVideoAdapter.this.mImpressionListener != null) {
                    GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(adError.getCode()), adError.getMessage());
                }
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public final void onAdShowedFullScreenContent() {
                GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                googleAdATRewardedVideoAdapter.c = false;
                if (googleAdATRewardedVideoAdapter.mImpressionListener != null) {
                    GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }
        };
        this.h = fullScreenContentCallback;
        this.a.setFullScreenContentCallback(fullScreenContentCallback);
        OnUserEarnedRewardListener onUserEarnedRewardListener = new OnUserEarnedRewardListener() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.3
            @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
            public final void onUserEarnedReward(@x1 RewardItem rewardItem) {
                GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                if (!googleAdATRewardedVideoAdapter.c) {
                    googleAdATRewardedVideoAdapter.c = true;
                    if (googleAdATRewardedVideoAdapter.mImpressionListener != null) {
                        GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }
                if (GoogleAdATRewardedVideoAdapter.this.mImpressionListener != null) {
                    GoogleAdATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }
        };
        this.i = onUserEarnedRewardListener;
        this.a.show(activity, onUserEarnedRewardListener);
    }

    public void startLoadAd(final Context context) {
        this.b = new AdManagerAdRequest.Builder().build();
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    GoogleAdATRewardedVideoAdapter.this.g = new RewardedAdLoadCallback() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1.1
                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.a = null;
                            if (googleAdATRewardedVideoAdapter.mLoadListener != null) {
                                GoogleAdATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
                            }
                        }

                        @Override // com.google.android.gms.ads.AdLoadCallback
                        public final void onAdLoaded(@x1 RewardedAd rewardedAd) {
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.a = rewardedAd;
                            googleAdATRewardedVideoAdapter.d = true;
                            if (googleAdATRewardedVideoAdapter.mLoadListener != null) {
                                GoogleAdATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = GoogleAdATRewardedVideoAdapter.this.f;
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    RewardedAd.load(context2, str, googleAdATRewardedVideoAdapter.b, googleAdATRewardedVideoAdapter.g);
                } catch (Throwable th) {
                    if (GoogleAdATRewardedVideoAdapter.this.mLoadListener != null) {
                        GoogleAdATRewardedVideoAdapter.this.mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }
}