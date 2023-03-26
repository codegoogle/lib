package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.g;
import com.anythink.basead.e.c;
import com.anythink.basead.e.f;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.d;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdxATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    public j a;
    public g b;
    public Map<String, Object> c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        g gVar = this.b;
        if (gVar != null) {
            gVar.b();
            this.b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, ((j) map.get(g.k.a)).b);
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
        com.anythink.basead.d.g gVar = this.b;
        boolean z = gVar != null && gVar.c();
        if (z && this.c == null) {
            this.c = b.a(this.b);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.b.a(new c() { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.2
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATRewardedVideoAdapter adxATRewardedVideoAdapter = AdxATRewardedVideoAdapter.this;
                adxATRewardedVideoAdapter.c = b.a(adxATRewardedVideoAdapter.b);
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (AdxATRewardedVideoAdapter.this.mLoadListener != null) {
                    AdxATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int g = d.g(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.f.c.j, Integer.valueOf(g));
        com.anythink.basead.d.g gVar = this.b;
        gVar.a(new f(gVar.d()) { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.1
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e trackingInfo = AdxATRewardedVideoAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i);
                }
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.e.f, com.anythink.basead.e.a
            public final void onAdShow() {
                super.onAdShow();
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onRewarded() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayEnd() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoAdPlayStart() {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.e.g
            public final void onVideoShowFailed(e eVar) {
                if (AdxATRewardedVideoAdapter.this.mImpressionListener != null) {
                    AdxATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(eVar.a(), eVar.b());
                }
            }
        });
        com.anythink.basead.d.g gVar2 = this.b;
        if (gVar2 != null) {
            gVar2.a(hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        this.a = (j) map.get(g.k.a);
        com.anythink.basead.d.g gVar = new com.anythink.basead.d.g(context, b.a.a, this.a);
        this.b = gVar;
        gVar.a(new c.a().a(parseInt).b(parseInt2).a());
    }
}