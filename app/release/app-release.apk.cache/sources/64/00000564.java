package com.anythink.core.api;

import com.anythink.core.common.b.m;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ATMediationRequestInfo {
    public String adSourceId;
    public String className;
    public int networkFirmId;

    public String getAdSourceId() {
        return this.adSourceId;
    }

    public String getClassName() {
        return this.className;
    }

    public int getNetworkFirmId() {
        return this.networkFirmId;
    }

    public abstract Map<String, Object> getRequestParamMap();

    public void setAdSourceId(String str) {
        this.adSourceId = str;
        m.a();
        m.l(str);
    }

    public abstract void setFormat(String str);
}