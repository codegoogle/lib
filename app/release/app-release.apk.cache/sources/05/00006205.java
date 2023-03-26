package com.p7700g.p99005;

import com.onesignal.OSSubscriptionState;
import com.p7700g.p99005.aa;
import org.json.JSONObject;

/* compiled from: OSSubscriptionStateChanges.java */
/* loaded from: classes3.dex */
public class vl3 {
    private OSSubscriptionState a;
    private OSSubscriptionState b;

    public vl3(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.a = oSSubscriptionState;
        this.b = oSSubscriptionState2;
    }

    public OSSubscriptionState a() {
        return this.a;
    }

    public OSSubscriptionState b() {
        return this.b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.a.p());
            jSONObject.put(aa.h.d, this.b.p());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}