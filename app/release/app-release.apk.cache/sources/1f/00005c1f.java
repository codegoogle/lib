package com.p7700g.p99005;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

/* compiled from: OSDeviceState.java */
/* loaded from: classes3.dex */
public class sj3 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;

    public sj3(OSSubscriptionState oSSubscriptionState, kl3 kl3Var, wj3 wj3Var, pl3 pl3Var) {
        this.a = kl3Var.a();
        this.b = oSSubscriptionState.e();
        this.c = oSSubscriptionState.f();
        this.f = oSSubscriptionState.d();
        this.g = oSSubscriptionState.c();
        this.h = wj3Var.d();
        this.i = wj3Var.c();
        this.d = wj3Var.f();
        this.j = pl3Var.e();
        this.k = pl3Var.d();
        this.e = pl3Var.f();
    }

    public boolean a() {
        return this.a;
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.h;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.k;
    }

    public String f() {
        return this.j;
    }

    public String g() {
        return this.f;
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.a);
            jSONObject.put("isPushDisabled", this.b);
            jSONObject.put("isSubscribed", this.c);
            jSONObject.put(DataKeys.USER_ID, this.f);
            jSONObject.put("pushToken", this.g);
            jSONObject.put("isEmailSubscribed", this.d);
            jSONObject.put("emailUserId", this.h);
            jSONObject.put("emailAddress", this.i);
            jSONObject.put("isSMSSubscribed", this.e);
            jSONObject.put("smsUserId", this.j);
            jSONObject.put("smsNumber", this.k);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}