package com.p7700g.p99005;

import org.json.JSONObject;

/* compiled from: OSEmailSubscriptionState.java */
/* loaded from: classes3.dex */
public class wj3 implements Cloneable {
    private static final String s = "changed";
    private gl3<Object, wj3> t = new gl3<>(s, false);
    private String u;
    private String v;

    public wj3(boolean z) {
        if (z) {
            String str = vm3.a;
            this.u = vm3.g(str, vm3.L, null);
            this.v = vm3.g(str, vm3.M, null);
            return;
        }
        this.u = jm3.p0();
        this.v = an3.c().G();
    }

    public void a() {
        boolean z = (this.u == null && this.v == null) ? false : true;
        this.u = null;
        this.v = null;
        if (z) {
            this.t.c(this);
        }
    }

    public boolean b(wj3 wj3Var) {
        String str = this.u;
        if (str == null) {
            str = "";
        }
        String str2 = wj3Var.u;
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(str2)) {
            String str3 = this.v;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = wj3Var.v;
            if (str3.equals(str4 != null ? str4 : "")) {
                return false;
            }
        }
        return true;
    }

    public String c() {
        return this.v;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String d() {
        return this.u;
    }

    public gl3<Object, wj3> e() {
        return this.t;
    }

    public boolean f() {
        return (this.u == null || this.v == null) ? false : true;
    }

    public void g() {
        String str = vm3.a;
        vm3.o(str, vm3.L, this.u);
        vm3.o(str, vm3.M, this.v);
    }

    public void h(@x1 String str) {
        boolean z = !str.equals(this.v);
        this.v = str;
        if (z) {
            this.t.c(this);
        }
    }

    public void i(@x1 String str) {
        boolean z = true;
        if (str != null ? str.equals(this.u) : this.u == null) {
            z = false;
        }
        this.u = str;
        if (z) {
            this.t.c(this);
        }
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.u;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            String str2 = this.v;
            if (str2 != null) {
                jSONObject.put("emailAddress", str2);
            } else {
                jSONObject.put("emailAddress", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", f());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return n().toString();
    }
}