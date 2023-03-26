package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.e.c;
import com.anythink.basead.e.g;
import com.anythink.basead.f.f;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.d;
import com.anythink.core.common.r;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MyOfferATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    public j a;
    public Map<String, Object> b;
    private f d;
    private String c = "";
    private boolean e = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a((g) null);
            this.d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return com.anythink.core.common.j.g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.a = (j) map.get(g.k.a);
        }
        if (map.containsKey(r.b)) {
            this.e = ((Boolean) map.get(r.b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        f fVar = this.d;
        boolean z = fVar != null && fVar.a();
        if (z && this.b == null) {
            this.b = b.a(this.d);
        }
        return z;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.a = (j) map.get(g.k.a);
        }
        a(context);
        this.d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                MyOfferATRewardedVideoAdapter myOfferATRewardedVideoAdapter = MyOfferATRewardedVideoAdapter.this;
                myOfferATRewardedVideoAdapter.b = b.a(myOfferATRewardedVideoAdapter.d);
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (MyOfferATRewardedVideoAdapter.this.mLoadListener != null) {
                    MyOfferATRewardedVideoAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int g = d.g(activity);
        if (isAdReady()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.anythink.basead.f.c.h, this.a.d);
            hashMap.put("extra_scenario", this.mScenario);
            hashMap.put(com.anythink.basead.f.c.j, Integer.valueOf(g));
            this.d.a(new com.anythink.basead.e.g() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.2
                @Override // com.anythink.basead.e.a
                public final void onAdClick(int i) {
                    com.anythink.core.common.e.e trackingInfo = MyOfferATRewardedVideoAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.x(i);
                    }
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdClosed() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdShow() {
                }

                @Override // com.anythink.basead.e.a
                public final void onDeeplinkCallback(boolean z) {
                }

                @Override // com.anythink.basead.e.g
                public final void onRewarded() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onReward();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayEnd() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoAdPlayStart() {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.e.g
                public final void onVideoShowFailed(e eVar) {
                    if (MyOfferATRewardedVideoAdapter.this.mImpressionListener != null) {
                        MyOfferATRewardedVideoAdapter.this.mImpressionListener.onRewardedVideoAdPlayFailed(eVar.a(), eVar.b());
                    }
                }
            });
            this.d.a(hashMap);
        }
    }

    private void a(Context context) {
        this.d = new f(context, this.a, this.c, this.e);
    }
}