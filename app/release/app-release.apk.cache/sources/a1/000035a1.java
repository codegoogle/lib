package com.ironsource.sdk;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public boolean a = false;
    public boolean b = false;
    public a c = null;
    public Map<String, String> d;
    public boolean e;
    private String f;
    private final com.ironsource.sdk.j.a g;

    public c(String str, com.ironsource.sdk.j.a aVar) {
        this.f = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.g = (com.ironsource.sdk.j.a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    public final b a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f);
            jSONObject.put("rewarded", this.a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new b((this.b || this.e) ? d.a() : d.a(jSONObject), this.f, this.a, this.b, this.e, this.d, this.g, this.c);
    }
}