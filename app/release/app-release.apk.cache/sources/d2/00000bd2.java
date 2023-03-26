package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdxBidRequestInfo extends ATBidRequestInfo {
    public JSONObject a;

    public AdxBidRequestInfo(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        this.a = jSONObject;
        try {
            jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.SUPPORT_TEMPLATE_VERSION, 1);
            d b = e.a(context).b(str);
            if (b != null) {
                int ap = b.ap();
                if (ap > 0) {
                    List<com.anythink.core.common.a.d> a = b.a().a(ap);
                    if (a.size() > 0) {
                        this.a.put(d.a.P, a(a));
                    }
                }
                int ao = b.ao();
                if (ao > 0) {
                    List<com.anythink.core.common.a.d> b2 = b.a().b(ao);
                    if (b2.size() > 0) {
                        this.a.put(d.a.O, a(b2));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static JSONObject a(List<com.anythink.core.common.a.d> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap hashMap = new HashMap();
            for (com.anythink.core.common.a.d dVar : list) {
                List list2 = (List) hashMap.get(dVar.a());
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(dVar.a(), list2);
                }
                list2.add(dVar.b());
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), new JSONArray((Collection) entry.getValue()));
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public void fillBannerData(Map<String, Object> map) {
        try {
            String obj = map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString();
            if (TextUtils.isEmpty(obj)) {
                return;
            }
            String[] split = obj.split("x");
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            this.a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, parseInt);
            this.a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, parseInt2);
        } catch (Throwable unused) {
        }
    }

    public void fillSplashData() {
        try {
            this.a.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GET_OFFER, 2);
        } catch (Throwable unused) {
        }
    }

    public void fillVideoData() {
    }

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.a;
    }
}