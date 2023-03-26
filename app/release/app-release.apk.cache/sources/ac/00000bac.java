package com.anythink.network.admob;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.admob.GoogleAdATNativeAd;
import java.util.Map;

/* loaded from: classes2.dex */
public class GoogleAdATAdapter extends CustomNativeAdapter {
    private String a;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
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
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String obj = map.containsKey("unit_id") ? map.get("unit_id").toString() : "";
        String obj2 = map.containsKey("media_ratio") ? map.get("media_ratio").toString() : "";
        if (TextUtils.isEmpty(obj)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        this.a = obj;
        boolean z = false;
        try {
            if (map.containsKey(CustomNativeAd.IS_AUTO_PLAY_KEY)) {
                z = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            }
        } catch (Exception unused) {
        }
        GoogleAdATNativeAd googleAdATNativeAd = new GoogleAdATNativeAd(context, obj2, obj, new GoogleAdATNativeAd.LoadCallbackListener() { // from class: com.anythink.network.admob.GoogleAdATAdapter.1
            @Override // com.anythink.network.admob.GoogleAdATNativeAd.LoadCallbackListener
            public final void onFail(String str, String str2) {
                if (GoogleAdATAdapter.this.mLoadListener != null) {
                    GoogleAdATAdapter.this.mLoadListener.onAdLoadError(str, str2);
                }
            }

            @Override // com.anythink.network.admob.GoogleAdATNativeAd.LoadCallbackListener
            public final void onSuccess(CustomNativeAd customNativeAd) {
                if (GoogleAdATAdapter.this.mLoadListener != null) {
                    GoogleAdATAdapter.this.mLoadListener.onAdCacheLoaded(customNativeAd);
                }
            }
        }, map2);
        googleAdATNativeAd.setIsAutoPlay(z);
        googleAdATNativeAd.loadAd(context);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }
}