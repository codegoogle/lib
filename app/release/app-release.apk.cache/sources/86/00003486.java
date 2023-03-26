package com.ironsource.mediationsdk.adunit.adapter.utility;

import java.util.Map;

/* loaded from: classes3.dex */
public class AdData {
    private final String a;
    private final Map<String, Object> b;

    public AdData(String str, Map<String, Object> map) {
        this.a = str;
        this.b = map;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.b.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.b;
    }

    public Integer getInt(String str) {
        return (Integer) this.b.get(str);
    }

    public String getServerData() {
        return this.a;
    }

    public String getString(String str) {
        return (String) this.b.get(str);
    }
}