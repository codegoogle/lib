package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.d;
import com.anythink.basead.d.e;
import com.anythink.basead.e.c;
import com.anythink.basead.e.f;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.x;
import com.anythink.core.common.j.d;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdxATInterstitialAdapter extends CustomInterstitialAdapter {
    public j a;
    public e b;
    public Map<String, Object> c;
    private int d = 0;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        e eVar = this.b;
        if (eVar != null) {
            eVar.b();
            this.b = null;
        }
    }

    public void fixDirectlyInterstitial() {
        j jVar;
        e eVar = this.b;
        if (eVar == null || (jVar = this.a) == null || jVar.f != 67) {
            return;
        }
        eVar.d().c(this.d == 0 ? 2 : 1);
        if (((x) this.b.d()).R() == 5 && this.d == 0) {
            ((x) this.b.d()).i(3);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        j jVar = (j) map.get(g.k.a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, jVar != null ? jVar.b : "");
        adxBidRequestInfo.fillVideoData();
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "Adx";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        j jVar = this.a;
        return jVar != null ? jVar.b : "";
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
        if (z && this.c == null) {
            this.c = b.a(this.b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.b.a(new c() { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATInterstitialAdapter adxATInterstitialAdapter = AdxATInterstitialAdapter.this;
                adxATInterstitialAdapter.c = b.a(adxATInterstitialAdapter.b);
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (AdxATInterstitialAdapter.this.mLoadListener != null) {
                    AdxATInterstitialAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
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
        e eVar = this.b;
        eVar.a(new f(eVar.d()) { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e trackingInfo = AdxATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i);
                }
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.e.f, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoStart();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoShowFailed(com.anythink.basead.c.e eVar2) {
                if (AdxATInterstitialAdapter.this.mImpressListener != null) {
                    AdxATInterstitialAdapter.this.mImpressListener.onInterstitialAdVideoError(eVar2.a(), eVar2.b());
                }
            }
        });
        fixDirectlyInterstitial();
        e eVar2 = this.b;
        if (eVar2 != null) {
            eVar2.a(hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int parseInt = (!map.containsKey("v_m") || (obj4 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj4.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj3 = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj3.toString());
        this.a = (j) map.get(g.k.a);
        e eVar = new e(context, b.a.a, this.a);
        this.b = eVar;
        if (this.a.f == 67) {
            String obj5 = (!map.containsKey("inter_type") || (obj2 = map.get("inter_type")) == null) ? "1" : obj2.toString();
            if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null) {
                this.d = Integer.parseInt(obj.toString());
            }
            this.b.a(new d.a().b(obj5).h(parseInt).i(parseInt2).a());
            return;
        }
        eVar.a(new c.a().a(parseInt).b(parseInt2).a());
    }
}