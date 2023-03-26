package com.anythink.core.common;

import android.text.TextUtils;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.appsflyer.AppsFlyerLib;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p {
    private static p c;
    private final String a = "1";
    private final String b = "2";

    private p() {
    }

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            if (c == null) {
                c = new p();
            }
            pVar = c;
        }
        return pVar;
    }

    public static void a(com.anythink.core.common.e.e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            com.anythink.core.c.d a = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(eVar.S());
            if (a != null) {
                String w = a.w();
                if (TextUtils.isEmpty(w)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(w);
                JSONObject optJSONObject = jSONObject.optJSONObject("1");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
                    if (!TextUtils.isEmpty(optString)) {
                        String o = eVar.o();
                        double v = eVar.v() / 1000.0d;
                        String k = eVar.k();
                        try {
                            AdjustEvent adjustEvent = new AdjustEvent(optString);
                            adjustEvent.setRevenue(v, o);
                            adjustEvent.setOrderId(k);
                            Adjust.trackEvent(adjustEvent);
                        } catch (Throwable unused) {
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("2");
                if (optJSONObject2 != null) {
                    int optInt = optJSONObject2.optInt("rtye");
                    HashMap hashMap = new HashMap();
                    hashMap.put("af_order_id", eVar.k());
                    hashMap.put("af_content_id", eVar.S());
                    hashMap.put("af_content_type", eVar.U());
                    hashMap.put("af_revenue", Double.valueOf(optInt == 2 ? eVar.v() : eVar.v() / 1000.0d));
                    hashMap.put("af_currency", "USD");
                    AppsFlyerLib.getInstance().trackEvent(com.anythink.core.common.b.m.a().e(), "af_ad_view", hashMap);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private static void a(String str, double d, String str2, String str3) {
        try {
            AdjustEvent adjustEvent = new AdjustEvent(str);
            adjustEvent.setRevenue(d, str2);
            adjustEvent.setOrderId(str3);
            Adjust.trackEvent(adjustEvent);
        } catch (Throwable unused) {
        }
    }
}