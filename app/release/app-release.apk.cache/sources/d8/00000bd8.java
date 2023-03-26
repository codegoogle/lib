package com.anythink.network.directly;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfo;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DirectlyBidRequestInfo extends ATBidRequestInfo {
    public JSONObject a = new JSONObject();

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

    @Override // com.anythink.core.api.ATBidRequestInfo
    public JSONObject toRequestJSONObject() {
        return this.a;
    }
}