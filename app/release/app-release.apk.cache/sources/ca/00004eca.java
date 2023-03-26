package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import org.json.JSONObject;

/* compiled from: OSPermissionStateChanges.java */
/* loaded from: classes3.dex */
public class ll3 {
    private kl3 a;
    private kl3 b;

    public ll3(kl3 kl3Var, kl3 kl3Var2) {
        this.a = kl3Var;
        this.b = kl3Var2;
    }

    public kl3 a() {
        return this.a;
    }

    public kl3 b() {
        return this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.a.g());
            jSONObject.put(aa.h.d, this.b.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}