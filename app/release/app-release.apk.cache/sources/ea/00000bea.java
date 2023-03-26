package com.anythink.network.onlineapi;

import android.content.Context;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.f;
import com.anythink.basead.d.i;
import com.anythink.basead.e.d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes2.dex */
public class OnlineApiATAdapter extends CustomNativeAdapter {
    public f a;
    public j b;
    public String c;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.a != null) {
            this.a = null;
        }
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    @Override // com.anythink.core.api.ATBaseAdAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        final int parseInt;
        this.c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        this.a = new f(context, b.a.b, jVar);
        final int i2 = -1;
        if (map2 != null) {
            try {
                i = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
            } catch (Throwable unused) {
                i = -1;
            }
            try {
                parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                i2 = i;
            } catch (Throwable unused2) {
                i2 = i;
            }
            if (i2 <= 0) {
                i2 = Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
            }
            if (parseInt <= 0) {
                parseInt = (i2 * 3) / 4;
            }
            final Context applicationContext = context.getApplicationContext();
            this.a.a(new d() { // from class: com.anythink.network.onlineapi.OnlineApiATAdapter.1
                @Override // com.anythink.basead.e.d
                public final void onNativeAdLoadError(e eVar) {
                    if (OnlineApiATAdapter.this.mLoadListener != null) {
                        OnlineApiATAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                    }
                }

                @Override // com.anythink.basead.e.d
                public final void onNativeAdLoaded(i... iVarArr) {
                    OnlineApiATNativeAd[] onlineApiATNativeAdArr = new OnlineApiATNativeAd[iVarArr.length];
                    for (int i3 = 0; i3 < iVarArr.length; i3++) {
                        iVarArr[i3].a(i2, parseInt);
                        onlineApiATNativeAdArr[i3] = new OnlineApiATNativeAd(applicationContext, iVarArr[i3]);
                    }
                    if (OnlineApiATAdapter.this.mLoadListener != null) {
                        OnlineApiATAdapter.this.mLoadListener.onAdCacheLoaded(onlineApiATNativeAdArr);
                    }
                }
            });
        }
        parseInt = -1;
        if (i2 <= 0) {
        }
        if (parseInt <= 0) {
        }
        final Context applicationContext2 = context.getApplicationContext();
        this.a.a(new d() { // from class: com.anythink.network.onlineapi.OnlineApiATAdapter.1
            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoadError(e eVar) {
                if (OnlineApiATAdapter.this.mLoadListener != null) {
                    OnlineApiATAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoaded(i... iVarArr) {
                OnlineApiATNativeAd[] onlineApiATNativeAdArr = new OnlineApiATNativeAd[iVarArr.length];
                for (int i3 = 0; i3 < iVarArr.length; i3++) {
                    iVarArr[i3].a(i2, parseInt);
                    onlineApiATNativeAdArr[i3] = new OnlineApiATNativeAd(applicationContext2, iVarArr[i3]);
                }
                if (OnlineApiATAdapter.this.mLoadListener != null) {
                    OnlineApiATAdapter.this.mLoadListener.onAdCacheLoaded(onlineApiATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        this.c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        this.a = new f(context, b.a.b, jVar);
    }
}