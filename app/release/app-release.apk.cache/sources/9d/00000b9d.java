package com.anythink.network.admob;

import com.anythink.core.api.ATMediationRequestInfo;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class AdmobATRequestInfo extends ATMediationRequestInfo {
    public static String ORIENTATION_LANDSCAPE = "2";
    public static String ORIENTATION_PORTRAIT = "1";
    public HashMap<String, Object> a;

    public AdmobATRequestInfo(String str, String str2, String str3) {
        this.networkFirmId = 2;
        HashMap<String, Object> hashMap = new HashMap<>();
        this.a = hashMap;
        hashMap.put("app_id", str);
        this.a.put("unit_id", str2);
        this.a.put("orientation", str3);
    }

    @Override // com.anythink.core.api.ATMediationRequestInfo
    public Map<String, Object> getRequestParamMap() {
        return this.a;
    }

    @Override // com.anythink.core.api.ATMediationRequestInfo
    public void setFormat(String str) {
        str.hashCode();
        if (str.equals("4")) {
            this.className = AdmobATSplashAdapter.class.getName();
        }
    }
}