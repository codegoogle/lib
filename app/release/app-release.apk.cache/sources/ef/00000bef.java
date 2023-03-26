package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.e;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.d;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class OnlineApiATInterstitialAdapter extends CustomInterstitialAdapter {
    public j a;
    public e b;
    public String c;
    public Map<String, Object> d;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        e eVar = this.b;
        if (eVar != null) {
            eVar.b();
            this.b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        e eVar = this.b;
        boolean z = eVar != null && eVar.c();
        if (z && this.d == null) {
            this.d = b.a(this.b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.b.a(new c() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATInterstitialAdapter onlineApiATInterstitialAdapter = OnlineApiATInterstitialAdapter.this;
                onlineApiATInterstitialAdapter.d = b.a(onlineApiATInterstitialAdapter.b);
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (OnlineApiATInterstitialAdapter.this.mLoadListener != null) {
                    OnlineApiATInterstitialAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        int g = d.g(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.f.c.j, Integer.valueOf(g));
        this.b.a(new g() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e trackingInfo = OnlineApiATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i);
                }
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoStart();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoShowFailed(com.anythink.basead.c.e eVar) {
                if (OnlineApiATInterstitialAdapter.this.mImpressListener != null) {
                    OnlineApiATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoError(eVar.a(), eVar.b());
                }
            }
        });
        e eVar = this.b;
        if (eVar != null) {
            eVar.a(hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 0;
        int i2 = -1;
        if (map.containsKey("v_m") && (obj2 = map.get("v_m")) != null) {
            i = Integer.parseInt(obj2.toString());
        }
        if (map.containsKey("s_c_t") && (obj = map.get("s_c_t")) != null) {
            i2 = Integer.parseInt(obj.toString());
        }
        this.a = (j) map.get(g.k.a);
        e eVar = new e(context, b.a.b, this.a);
        this.b = eVar;
        eVar.a(new c.a().a(i).b(i2).a());
    }
}