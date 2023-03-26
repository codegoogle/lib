package com.anythink.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.c.e;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.d;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.rewardvideo.a.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATRewardVideoAd {
    public WeakReference<Activity> mActivityWef;
    public a mAdLoadManager;
    public b mAdSourceEventListener;
    public Context mContext;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    public ATRewardVideoListener mListener;
    public String mPlacementId;
    public final String TAG = getClass().getSimpleName();
    private ATRewardVideoExListener mInterListener = new ATRewardVideoExListener() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1
        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onAgainReward(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.11
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(aTAdInfo, z);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoAd aTRewardVideoAd = ATRewardVideoAd.this;
                    ATRewardVideoListener aTRewardVideoListener = aTRewardVideoAd.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ATRewardVideoExListener aTRewardVideoExListener = (ATRewardVideoExListener) aTRewardVideoListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = aTRewardVideoAd.mContext;
                    }
                    aTRewardVideoExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onReward(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onReward(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onRewardedVideoAdAgainPlayClicked(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.10
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onRewardedVideoAdAgainPlayEnd(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onRewardedVideoAdAgainPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.9
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(adError, aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoExListener
        public final void onRewardedVideoAdAgainPlayStart(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
                        return;
                    }
                    ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(aTAdInfo);
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdClosed(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdClosed(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdFailed(AdError adError) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdLoaded() {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdPlayClicked(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayClicked(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdPlayEnd(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.13
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayEnd(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdPlayFailed(final AdError adError, final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayFailed(adError, aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public final void onRewardedVideoAdPlayStart(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.1.12
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdPlayStart(aTAdInfo);
                    }
                }
            });
        }
    };
    public com.anythink.core.common.b.a adLoadListener = new com.anythink.core.common.b.a() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2
        @Override // com.anythink.core.common.b.a
        public final void onAdLoadFail(final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdFailed(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.b.a
        public final void onAdLoaded() {
            m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.api.ATRewardVideoAd.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATRewardVideoListener aTRewardVideoListener = ATRewardVideoAd.this.mListener;
                    if (aTRewardVideoListener != null) {
                        aTRewardVideoListener.onRewardedVideoAdLoaded();
                    }
                }
            });
        }
    };

    public ATRewardVideoAd(Context context, String str) {
        this.mPlacementId = str;
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mAdLoadManager = a.a(context, str);
    }

    private void controlShow(Activity activity, String str) {
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.k, g.i.r, g.i.h, "");
        if (m.a().e() != null && !TextUtils.isEmpty(m.a().n()) && !TextUtils.isEmpty(m.a().o())) {
            if (activity == null) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
            }
            this.mAdLoadManager.a(activity, str, this.mInterListener, this.mDownloadListener);
            return;
        }
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
        ATRewardVideoListener aTRewardVideoListener = this.mListener;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, j.a((d) null));
        }
    }

    public static void entryAdScenario(String str, String str2) {
        m.a().a(str, str2, "1");
    }

    private ATAdStatusInfo getAdStatus() {
        if (m.a().e() == null || TextUtils.isEmpty(m.a().n()) || TextUtils.isEmpty(m.a().o())) {
            return null;
        }
        return this.mAdLoadManager.a(this.mContext);
    }

    private Context getRequestContext() {
        WeakReference<Activity> weakReference = this.mActivityWef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        return activity != null ? activity : this.mContext;
    }

    private boolean isPlaceStrategyNeedAutoLoad() {
        com.anythink.core.c.d a = e.a(m.a().e()).a(this.mPlacementId);
        return a != null && a.Q() == 1;
    }

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.k, g.i.t, adStatus.toString(), "");
        return adStatus;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        a aVar = this.mAdLoadManager;
        if (aVar != null) {
            return aVar.b(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean isReady = adStatus.isReady();
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.k, g.i.s, String.valueOf(isReady), "");
        return isReady;
    }

    public void load() {
        load(getRequestContext(), 0);
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATRewardVideoListener aTRewardVideoListener) {
        this.mListener = aTRewardVideoListener;
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new b();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.a(aTAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        t.a().a(this.mPlacementId, map);
    }

    public void show(Activity activity, String str) {
        if (!com.anythink.core.common.j.g.c(str)) {
            str = "";
        }
        controlShow(activity, str);
    }

    public void load(Context context) {
        if (context == null) {
            context = getRequestContext();
        }
        load(context, 0);
    }

    private void load(Context context, int i) {
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.k, g.i.p, g.i.h, "");
        this.mAdLoadManager.a(context, i, this.adLoadListener, this.mAdSourceEventListener);
    }

    public void show(Activity activity) {
        controlShow(activity, "");
    }
}