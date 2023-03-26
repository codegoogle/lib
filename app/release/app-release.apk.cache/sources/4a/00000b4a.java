package com.anythink.interstitial.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.interstitial.a.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATInterstitial {
    public static final String TAG = "ATInterstitial";
    public WeakReference<Activity> mActivityWef;
    public a mAdLoadManager;
    public b mAdSourceEventListener;
    public Context mContext;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATEventInterface mDownloadListener;
    public ATInterstitialListener mInterstitialListener;
    public String mPlacementId;
    private ATInterstitialExListener mInterListener = new ATInterstitialExListener() { // from class: com.anythink.interstitial.api.ATInterstitial.1
        @Override // com.anythink.interstitial.api.ATInterstitialExListener
        public final void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
                        return;
                    }
                    ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(aTAdInfo, z);
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialExListener
        public final void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitial aTInterstitial = ATInterstitial.this;
                    ATInterstitialListener aTInterstitialListener = aTInterstitial.mInterstitialListener;
                    if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
                        return;
                    }
                    ATInterstitialExListener aTInterstitialExListener = (ATInterstitialExListener) aTInterstitialListener;
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = aTInterstitial.mContext;
                    }
                    aTInterstitialExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClicked(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdClicked(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdClose(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdClose(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoadFail(AdError adError) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdShow(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdShow(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoEnd(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoEnd(aTAdInfo);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoError(final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoError(adError);
                    }
                }
            });
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public final void onInterstitialAdVideoStart(final ATAdInfo aTAdInfo) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdVideoStart(aTAdInfo);
                    }
                }
            });
        }
    };
    public com.anythink.core.common.b.a adLoadListener = new com.anythink.core.common.b.a() { // from class: com.anythink.interstitial.api.ATInterstitial.2
        @Override // com.anythink.core.common.b.a
        public final void onAdLoadFail(final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.b.a
        public final void onAdLoaded() {
            m.a().a(new Runnable() { // from class: com.anythink.interstitial.api.ATInterstitial.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATInterstitialListener aTInterstitialListener = ATInterstitial.this.mInterstitialListener;
                    if (aTInterstitialListener != null) {
                        aTInterstitialListener.onInterstitialAdLoaded();
                    }
                }
            });
        }
    };

    public ATInterstitial(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityWef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mAdLoadManager = a.a(context, str);
    }

    private void controlShow(Activity activity, String str) {
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.j, g.i.r, g.i.h, "");
        if (m.a().e() == null || TextUtils.isEmpty(m.a().n()) || TextUtils.isEmpty(m.a().o())) {
            return;
        }
        if (activity == null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
        }
        this.mAdLoadManager.a(activity, str, this.mInterListener, this.mDownloadListener);
    }

    public static void entryAdScenario(String str, String str2) {
        m.a().a(str, str2, "3");
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

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.j, g.i.t, adStatus.toString(), "");
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
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.j, g.i.s, String.valueOf(isReady), "");
        return isReady;
    }

    public void load() {
        load(getRequestContext(), 0);
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATInterstitialListener aTInterstitialListener) {
        this.mInterstitialListener = aTInterstitialListener;
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
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.j, g.i.p, g.i.h, "");
        this.mAdLoadManager.a(context, i, this.adLoadListener, this.mAdSourceEventListener);
    }

    public void show(Activity activity) {
        controlShow(activity, "");
    }
}