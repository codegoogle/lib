package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSSMSSubscriptionStateChanges.java */
/* loaded from: classes3.dex */
public class ql3 {
    private pl3 a;
    private pl3 b;

    public ql3(pl3 pl3Var, pl3 pl3Var2) {
        this.a = pl3Var;
        this.b = pl3Var2;
    }

    public pl3 a() {
        return this.a;
    }

    public pl3 b() {
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