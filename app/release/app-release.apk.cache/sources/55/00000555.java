package com.anythink.core.api;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ATBidRequestInfo {
    public static final String BIDTOKEN_EMPTY_ERROR_TYPE = "Network BidToken or Custom bid info is Empty.";
    public static final String BIDTOKEN_OBTAIN_TIMEOUT_TYPE = "Request Token or Custom bid info Timeout.";
    public static final String INIT_ERROR_TYPE = "Network init error.";
    public static final String NO_ADAPTER_ERROR_TYPE = "There is no Network Adapter.";
    public static final String NO_SUPPORT_BIDDING_TYPE = "This network don't support header bidding in current TopOn's version.";
    public static final String RETURN_PARAMS_ERROR_TYPE = "The parameter is abnormal.";

    public static void fillBaseCommonParams(JSONObject jSONObject, String str, String str2, int i) {
        if (jSONObject != null) {
            try {
                jSONObject.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str);
                jSONObject.put("ad_source_id", str2);
                jSONObject.put("nw_firm_id", i);
                if (m.a().s()) {
                    jSONObject.put("test", 1);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public String getExtInfoForBuyerId(String str) {
        return t.a().g(str);
    }

    public abstract JSONObject toRequestJSONObject();
}