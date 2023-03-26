package com.anythink.network.admob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.admob.AdmobATNativeAd;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATAdapter extends CustomNativeAdapter {
    private String a;

    /* renamed from: com.anythink.network.admob.AdmobATAdapter$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements AdmobATNativeAd.LoadCallbackListener {
        public AnonymousClass2() {
        }

        @Override // com.anythink.network.admob.AdmobATNativeAd.LoadCallbackListener
        public final void onFail(String str, String str2) {
            if (AdmobATAdapter.this.mLoadListener != null) {
                AdmobATAdapter.this.mLoadListener.onAdLoadError(str, str2);
            }
        }

        @Override // com.anythink.network.admob.AdmobATNativeAd.LoadCallbackListener
        public final void onSuccess(CustomNativeAd customNativeAd) {
            if (AdmobATAdapter.this.mLoadListener != null) {
                AdmobATAdapter.this.mLoadListener.onAdCacheLoaded(customNativeAd);
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        final boolean z;
        String obj = map.containsKey("app_id") ? map.get("app_id").toString() : "";
        final String obj2 = map.containsKey("unit_id") ? map.get("unit_id").toString() : "";
        final String obj3 = map.containsKey("media_ratio") ? map.get("media_ratio").toString() : "";
        if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
            this.a = obj2;
            try {
                z = map.containsKey(CustomNativeAd.IS_AUTO_PLAY_KEY) ? Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString()) : false;
            } catch (Exception unused) {
                z = false;
            }
            AdMobATInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATAdapter.a(AdmobATAdapter.this, context, map, map2, obj2, obj3, z);
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

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2, String str, String str2, boolean z) {
        Bundle requestBundle = AdMobATInitManager.getInstance().getRequestBundle(map);
        AdmobATNativeAd admobATNativeAd = new AdmobATNativeAd(context, str2, str, new AnonymousClass2(), map2);
        admobATNativeAd.setIsAutoPlay(z);
        admobATNativeAd.loadAd(context, requestBundle);
    }

    public static /* synthetic */ void a(AdmobATAdapter admobATAdapter, Context context, Map map, Map map2, String str, String str2, boolean z) {
        Bundle requestBundle = AdMobATInitManager.getInstance().getRequestBundle(map);
        AdmobATNativeAd admobATNativeAd = new AdmobATNativeAd(context, str2, str, new AnonymousClass2(), map2);
        admobATNativeAd.setIsAutoPlay(z);
        admobATNativeAd.loadAd(context, requestBundle);
    }
}