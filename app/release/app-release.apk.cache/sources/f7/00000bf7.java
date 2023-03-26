package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.b;
import com.anythink.basead.d.b;
import com.anythink.basead.d.c;
import com.anythink.basead.d.h;
import com.anythink.basead.e.a;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.e;
import com.anythink.core.common.e.j;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes2.dex */
public class OnlineApiATSplashAdapter extends CustomSplashAdapter {
    public h a;
    public j b;
    public String c;
    public Map<String, Object> d;

    /* renamed from: com.anythink.network.onlineapi.OnlineApiATSplashAdapter$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClick(int i) {
            e trackingInfo = OnlineApiATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.x(i);
            }
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdClosed() {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onAdShow() {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.e.a
        public final void onDeeplinkCallback(boolean z) {
            if (OnlineApiATSplashAdapter.this.mImpressionListener != null) {
                OnlineApiATSplashAdapter.this.mImpressionListener.onDeeplinkCallback(z);
            }
        }
    }

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
    public boolean isAdReady() {
        h hVar = this.a;
        boolean z = hVar != null && hVar.c();
        if (z && this.d == null) {
            this.d = b.a(this.a);
        }
        return z;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        int parseInt;
        Object obj2;
        Object obj3;
        this.c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 5;
        int i2 = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        if (map.containsKey(com.anythink.expressad.d.a.b.dk) && (obj2 = map.get(com.anythink.expressad.d.a.b.dk)) != null) {
            i = Integer.parseInt(obj2.toString()) * 1000;
        }
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i2 = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        h hVar = new h(context, b.a.b, jVar);
        this.a = hVar;
        hVar.a(new c.a().d(parseInt2).e(i).f(i2).a());
        this.a.a(new AnonymousClass2());
        this.a.a(new com.anythink.basead.e.c() { // from class: com.anythink.network.onlineapi.OnlineApiATSplashAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                OnlineApiATSplashAdapter onlineApiATSplashAdapter = OnlineApiATSplashAdapter.this;
                onlineApiATSplashAdapter.d = com.anythink.basead.b.a(onlineApiATSplashAdapter.a);
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (OnlineApiATSplashAdapter.this.mLoadListener != null) {
                    OnlineApiATSplashAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.a != null) {
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
        this.c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int i = 5;
        int i2 = 1;
        int parseInt2 = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        if (map.containsKey(com.anythink.expressad.d.a.b.dk) && (obj2 = map.get(com.anythink.expressad.d.a.b.dk)) != null) {
            i = Integer.parseInt(obj2.toString()) * 1000;
        }
        if (map.containsKey("allows_skip") && (obj = map.get("allows_skip")) != null && (parseInt = Integer.parseInt(obj.toString())) != 0) {
            i2 = parseInt == 1 ? 0 : parseInt;
        }
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        h hVar = new h(context, b.a.b, jVar);
        this.a = hVar;
        hVar.a(new c.a().d(parseInt2).e(i).f(i2).a());
        this.a.a(new AnonymousClass2());
    }
}