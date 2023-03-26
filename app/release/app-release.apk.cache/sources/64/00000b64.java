package com.anythink.nativead.api;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.a;
import com.anythink.core.common.b.b;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ATNative {
    private final String TAG = ATNative.class.getSimpleName();
    public a adLoadListener = new a() { // from class: com.anythink.nativead.api.ATNative.1
        @Override // com.anythink.core.common.b.a
        public final void onAdLoadFail(final AdError adError) {
            m.a().a(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoadFail(adError);
                    }
                }
            });
        }

        @Override // com.anythink.core.common.b.a
        public final void onAdLoaded() {
            m.a().a(new Runnable() { // from class: com.anythink.nativead.api.ATNative.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeNetworkListener aTNativeNetworkListener = ATNative.this.mListener;
                    if (aTNativeNetworkListener != null) {
                        aTNativeNetworkListener.onNativeAdLoaded();
                    }
                }
            });
        }
    };
    public WeakReference<Activity> mActivityRef;
    public com.anythink.nativead.a.a mAdLoadManager;
    public b mAdSourceEventListener;
    public Context mContext;
    public ATAdSourceStatusListener mDeveloperStatusListener;
    public ATNativeNetworkListener mListener;
    public String mPlacementId;

    public ATNative(Context context, String str, ATNativeNetworkListener aTNativeNetworkListener) {
        this.mContext = context.getApplicationContext();
        if (context instanceof Activity) {
            this.mActivityRef = new WeakReference<>((Activity) context);
        }
        this.mPlacementId = str;
        this.mListener = aTNativeNetworkListener;
        this.mAdLoadManager = com.anythink.nativead.a.a.a(context, str);
    }

    public static void entryAdScenario(String str, String str2) {
        m.a().a(str, str2, "0");
    }

    private Context getContext() {
        Activity activity;
        WeakReference<Activity> weakReference = this.mActivityRef;
        return (weakReference == null || (activity = weakReference.get()) == null) ? this.mContext : activity;
    }

    public ATAdStatusInfo checkAdStatus() {
        if (m.a().e() != null && !TextUtils.isEmpty(m.a().n()) && !TextUtils.isEmpty(m.a().o())) {
            ATAdStatusInfo a = this.mAdLoadManager.a(getContext());
            com.anythink.core.common.j.m.a(this.mPlacementId, g.i.l, g.i.t, a.toString(), "");
            return a;
        }
        return new ATAdStatusInfo(false, false, null);
    }

    public List<ATAdInfo> checkValidAdCaches() {
        com.anythink.nativead.a.a aVar = this.mAdLoadManager;
        if (aVar != null) {
            return aVar.b(getContext());
        }
        return null;
    }

    public NativeAd getNativeAd() {
        com.anythink.core.common.e.b e = this.mAdLoadManager.e("");
        if (e != null) {
            return new NativeAd(getContext(), this.mPlacementId, e);
        }
        return null;
    }

    public void makeAdRequest() {
        com.anythink.core.common.j.m.a(this.mPlacementId, g.i.l, g.i.p, g.i.h, "");
        this.mAdLoadManager.a(getContext(), this.adLoadListener, this.mAdSourceEventListener);
    }

    public void setAdListener(ATNativeNetworkListener aTNativeNetworkListener) {
        this.mListener = aTNativeNetworkListener;
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

    public NativeAd getNativeAd(String str) {
        if (!com.anythink.core.common.j.g.c(str)) {
            str = "";
        }
        com.anythink.core.common.e.b e = this.mAdLoadManager.e(str);
        if (e != null) {
            return new NativeAd(getContext(), this.mPlacementId, e);
        }
        return null;
    }
}