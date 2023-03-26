package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.e.a;
import com.anythink.basead.e.c;
import com.anythink.basead.f.e;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.g;
import com.anythink.core.common.r;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes2.dex */
public class MyOfferATAdapter extends CustomNativeAdapter {
    public e a;
    public j b;
    private String c = "";
    private boolean d = false;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        e eVar = this.a;
        if (eVar != null) {
            eVar.a((a) null);
            this.a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        e eVar = this.a;
        if (eVar == null || !eVar.a()) {
            return null;
        }
        return new MyOfferATNativeAd(context, this.a);
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
        return g.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.b = (j) map.get(g.k.a);
        }
        if (map.containsKey(r.b)) {
            this.d = ((Boolean) map.get(r.b)).booleanValue();
        }
        this.a = new e(context, this.b, this.c, this.d);
        return true;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.c = map.get("my_oid").toString();
        }
        if (map.containsKey(g.k.a)) {
            this.b = (j) map.get(g.k.a);
        }
        this.a = new e(context, this.b, this.c, this.d);
        final Context applicationContext = context.getApplicationContext();
        this.a.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATAdapter.1
            @Override // com.anythink.basead.e.c
            public final void onAdCacheLoaded() {
                if (MyOfferATAdapter.this.mLoadListener != null) {
                    MyOfferATAdapter.this.mLoadListener.onAdCacheLoaded(new MyOfferATNativeAd(applicationContext, MyOfferATAdapter.this.a));
                }
            }

            @Override // com.anythink.basead.e.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.e.c
            public final void onAdLoadFailed(com.anythink.basead.c.e eVar) {
                if (MyOfferATAdapter.this.mLoadListener != null) {
                    MyOfferATAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }
        });
    }

    private void a(Context context) {
        this.a = new e(context, this.b, this.c, this.d);
    }
}