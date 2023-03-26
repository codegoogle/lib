package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSEmailSubscriptionStateChanges.java */
/* loaded from: classes3.dex */
public class xj3 {
    private wj3 a;
    private wj3 b;

    public xj3(wj3 wj3Var, wj3 wj3Var2) {
        this.a = wj3Var;
        this.b = wj3Var2;
    }

    public wj3 a() {
        return this.a;
    }

    public wj3 b() {
        return this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.a.n());
            jSONObject.put(aa.h.d, this.b.n());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}