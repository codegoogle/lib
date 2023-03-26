package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.c.e;
import com.anythink.basead.d.b;
import com.anythink.basead.d.f;
import com.anythink.basead.d.i;
import com.anythink.basead.e.d;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdxATAdapter extends CustomNativeAdapter {
    public f a;
    public j b;

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        if (this.a != null) {
            this.a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        j jVar = (j) map.get(g.k.a);
        AdxBidRequestInfo adxBidRequestInfo = new AdxBidRequestInfo(context, jVar != null ? jVar.b : "");
        if (aTBidRequestInfoListener != null) {
            aTBidRequestInfoListener.onSuccess(adxBidRequestInfo);
        }
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    @Override // com.anythink.core.api.ATBaseAdAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        final boolean z;
        boolean z2;
        int i;
        int parseInt;
        String str = "1";
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        this.a = new f(context, b.a.a, jVar);
        try {
            z = TextUtils.equals("1", map.get("layout_type").toString());
        } catch (Throwable unused) {
            z = false;
        }
        boolean z3 = true;
        try {
            z2 = TextUtils.equals("0", map.get("close_button").toString());
        } catch (Throwable unused2) {
            z2 = true;
        }
        try {
            z3 = TextUtils.equals("0", map.get("v_m").toString());
        } catch (Throwable unused3) {
        }
        try {
            if (map.containsKey("video_autoplay")) {
                str = map.get("video_autoplay").toString();
            }
        } catch (Throwable unused4) {
        }
        final String str2 = str;
        int i2 = -1;
        if (map2 != null) {
            try {
                i = Integer.parseInt(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
            } catch (Throwable unused5) {
                i = -1;
            }
            try {
                parseInt = Integer.parseInt(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                i2 = i;
            } catch (Throwable unused6) {
                i2 = i;
            }
            if (i2 <= 0) {
                i2 = Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
            }
            final int i3 = i2;
            final int i4 = parseInt > 0 ? (i3 * 3) / 4 : parseInt;
            final Context applicationContext = context.getApplicationContext();
            final boolean z4 = z3;
            final boolean z5 = z2;
            this.a.a(new d() { // from class: com.anythink.network.adx.AdxATAdapter.1
                @Override // com.anythink.basead.e.d
                public final void onNativeAdLoadError(e eVar) {
                    if (AdxATAdapter.this.mLoadListener != null) {
                        AdxATAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                    }
                }

                @Override // com.anythink.basead.e.d
                public final void onNativeAdLoaded(i... iVarArr) {
                    AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[iVarArr.length];
                    for (int i5 = 0; i5 < iVarArr.length; i5++) {
                        i iVar = iVarArr[i5];
                        iVar.a(i3, i4);
                        iVar.a(z4);
                        iVar.a(str2);
                        adxATNativeAdArr[i5] = new AdxATNativeAd(applicationContext, iVar, z, z5);
                    }
                    if (AdxATAdapter.this.mLoadListener != null) {
                        AdxATAdapter.this.mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                    }
                }
            });
        }
        parseInt = -1;
        if (i2 <= 0) {
        }
        final int i32 = i2;
        if (parseInt > 0) {
        }
        final Context applicationContext2 = context.getApplicationContext();
        final boolean z42 = z3;
        final boolean z52 = z2;
        this.a.a(new d() { // from class: com.anythink.network.adx.AdxATAdapter.1
            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoadError(e eVar) {
                if (AdxATAdapter.this.mLoadListener != null) {
                    AdxATAdapter.this.mLoadListener.onAdLoadError(eVar.a(), eVar.b());
                }
            }

            @Override // com.anythink.basead.e.d
            public final void onNativeAdLoaded(i... iVarArr) {
                AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[iVarArr.length];
                for (int i5 = 0; i5 < iVarArr.length; i5++) {
                    i iVar = iVarArr[i5];
                    iVar.a(i32, i4);
                    iVar.a(z42);
                    iVar.a(str2);
                    adxATNativeAdArr[i5] = new AdxATNativeAd(applicationContext2, iVar, z, z52);
                }
                if (AdxATAdapter.this.mLoadListener != null) {
                    AdxATAdapter.this.mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        j jVar = (j) map.get(g.k.a);
        this.b = jVar;
        this.a = new f(context, b.a.a, jVar);
    }
}