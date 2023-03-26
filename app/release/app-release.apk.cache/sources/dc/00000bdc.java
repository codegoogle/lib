package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.basead.c.e;
import com.anythink.basead.e.a;
import com.anythink.basead.e.c;
import com.anythink.basead.f.b;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.g;
import com.anythink.core.common.r;
import java.util.Map;

/* loaded from: classes2.dex */
public class MyOfferATBannerAdapter extends CustomBannerAdapter {
    public String a;
    public j b;
    public Map<String, Object> c;
    private b d;
    private View e;
    private boolean f = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        this.e = null;
        b bVar = this.d;
        if (bVar != null) {
            bVar.a((a) null);
            this.d.c();
            this.d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar;
        if (this.e == null && (bVar = this.d) != null && bVar.a()) {
            this.e = this.d.b();
            if (this.c == null) {
                this.c = com.anythink.basead.b.a(this.d);
            }
        }
        return this.e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.c;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.a = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.b = (j) map.get(g.k.a);
        }
        if (map.containsKey(r.b)) {
            this.f = ((Boolean) map.get(r.b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.a = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.b = (j) map.get(g.k.a);
        }
        a(context);
        this.d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                MyOfferATBannerAdapter myOfferATBannerAdapter = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter.e = myOfferATBannerAdapter.d.b();
                MyOfferATBannerAdapter myOfferATBannerAdapter2 = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter2.c = com.anythink.basead.b.a(myOfferATBannerAdapter2.d);
                if (MyOfferATBannerAdapter.this.mLoadListener != null) {
                    if (MyOfferATBannerAdapter.this.e != null) {
                        MyOfferATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        MyOfferATBannerAdapter.this.mLoadListener.onAdLoadError("", "MyOffer bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(e eVar) {
                if (MyOfferATBannerAdapter.this.mLoadListener != null) {
                    MyOfferATBannerAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    private void a(Context context) {
        b bVar = new b(context, this.b, this.a, this.f);
        this.d = bVar;
        bVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.2
            @Override // com.anythink.basead.e.a
            public final void onAdClick(int i) {
                com.anythink.core.common.e.e trackingInfo = MyOfferATBannerAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.x(i);
                }
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdClosed() {
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdClose();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onAdShow() {
                if (MyOfferATBannerAdapter.this.mImpressionEventListener != null) {
                    MyOfferATBannerAdapter.this.mImpressionEventListener.onBannerAdShow();
                }
            }

            @Override // com.anythink.basead.e.a
            public final void onDeeplinkCallback(boolean z) {
            }
        });
    }
}