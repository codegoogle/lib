package com.onesignal;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.p7700g.p99005.an3;
import com.p7700g.p99005.gl3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.kl3;
import com.p7700g.p99005.vm3;
import com.p7700g.p99005.z1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OSSubscriptionState implements Cloneable {
    private static final String s = "changed";
    private gl3<Object, OSSubscriptionState> t = new gl3<>(s, false);
    private String u;
    private String v;
    private boolean w;
    private boolean x;

    public OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = vm3.a;
            this.x = vm3.b(str, vm3.p, true);
            this.u = vm3.g(str, vm3.q, null);
            this.v = vm3.g(str, vm3.r, null);
            this.w = vm3.b(str, vm3.s, false);
            return;
        }
        this.x = !an3.l();
        this.u = jm3.c1();
        this.v = an3.f();
        this.w = z2;
    }

    private void h(boolean z) {
        boolean f = f();
        this.w = z;
        if (f != f()) {
            this.t.c(this);
        }
    }

    public boolean a(OSSubscriptionState oSSubscriptionState) {
        if (this.x == oSSubscriptionState.x) {
            String str = this.u;
            if (str == null) {
                str = "";
            }
            String str2 = oSSubscriptionState.u;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                String str3 = this.v;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = oSSubscriptionState.v;
                if (str3.equals(str4 != null ? str4 : "") && this.w == oSSubscriptionState.w) {
                    return false;
                }
            }
        }
        return true;
    }

    public gl3<Object, OSSubscriptionState> b() {
        return this.t;
    }

    public String c() {
        return this.v;
    }

    public void changed(kl3 kl3Var) {
        h(kl3Var.a());
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String d() {
        return this.u;
    }

    public boolean e() {
        return this.x;
    }

    public boolean f() {
        return (this.u == null || this.v == null || this.x || !this.w) ? false : true;
    }

    public void g() {
        String str = vm3.a;
        vm3.k(str, vm3.p, this.x);
        vm3.o(str, vm3.q, this.u);
        vm3.o(str, vm3.r, this.v);
        vm3.k(str, vm3.s, this.w);
    }

    public void i(boolean z) {
        boolean z2 = this.x != z;
        this.x = z;
        if (z2) {
            this.t.c(this);
        }
    }

    public void n(String str) {
        if (str == null) {
            return;
        }
        boolean z = !str.equals(this.v);
        this.v = str;
        if (z) {
            this.t.c(this);
        }
    }

    public void o(@z1 String str) {
        boolean z = true;
        if (str != null ? str.equals(this.u) : this.u == null) {
            z = false;
        }
        this.u = str;
        if (z) {
            this.t.c(this);
        }
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.u;
            if (str != null) {
                jSONObject.put(DataKeys.USER_ID, str);
            } else {
                jSONObject.put(DataKeys.USER_ID, JSONObject.NULL);
            }
            String str2 = this.v;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", e());
            jSONObject.put("isSubscribed", f());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return p().toString();
    }
}