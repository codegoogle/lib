package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.h;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdxATSplashAdapter extends CustomSplashAdapter {
    public h a;
    public j b;
    public Map<String, Object> c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        h hVar = this.a;
        if (hVar != null) {
            hVar.b();
            this.a = null;
        }
        this.b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        j jVar = (j) map.get(g.k.a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, jVar != null ? jVar.b : "");
        adxBidRequestInfo.fillSplashData();
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
        j jVar = this.b;
        return jVar != null ? jVar.b : "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean isAdReady() {
        h hVar = this.a;
        boolean z = hVar != null && hVar.c();
        if (z && this.c == null) {
            this.c = b.a(this.a);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        h hVar = this.a;
        return hVar != null && hVar.e();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        int i = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey(com.anythink.expressad.d.a.b.dk) || (obj2 = map.get(com.anythink.expressad.d.a.b.dk)) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        h hVar = new h(context, b.a.a, jVar);
        this.a = hVar;
        hVar.a(new c.a().d(parseInt2).e(parseInt3).f(i).a());
        this.a.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.adx.AdxATSplashAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                AdxATSplashAdapter adxATSplashAdapter = AdxATSplashAdapter.this;
                adxATSplashAdapter.c = com.anythink.basead.b.a(adxATSplashAdapter.a);
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (AdxATSplashAdapter.this.mLoadListener != null) {
                    AdxATSplashAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        h hVar = this.a;
        if (hVar != null) {
            hVar.a(new com.anythink.basead.e.e(hVar.d()) { // from class: com.anythink.network.adx.AdxATSplashAdapter.2
                @Override // com.anythink.basead.e.a
                public final void onAdClick(int i) {
                    com.anythink.core.common.e.e trackingInfo = AdxATSplashAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.x(i);
                    }
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onAdClosed() {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // com.anythink.basead.e.e, com.anythink.basead.e.a
                public final void onAdShow() {
                    super.onAdShow();
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // com.anythink.basead.e.a
                public final void onDeeplinkCallback(boolean z) {
                    if (AdxATSplashAdapter.this.mImpressionListener != null) {
                        AdxATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z);
                    }
                }
            });
            if (isCustomSkipView()) {
                this.a.a();
            }
            this.a.a(viewGroup);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        int i = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt3 = (!map.containsKey(com.anythink.expressad.d.a.b.dk) || (obj2 = map.get(com.anythink.expressad.d.a.b.dk)) == null) ? 5 : Integer.parseInt(obj2.toString()) * 1000;
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        h hVar = new h(context, b.a.a, jVar);
        this.a = hVar;
        hVar.a(new c.a().d(parseInt2).e(parseInt3).f(i).a());
    }
}