package com.p7700g.p99005;

import org.json.JSONObject;

/* compiled from: OSSMSSubscriptionState.java */
/* loaded from: classes3.dex */
public class pl3 implements Cloneable {
    private static final String s = "changed";
    private static final String t = "smsUserId";
    private static final String u = "smsNumber";
    private static final String v = "isSubscribed";
    private gl3<Object, pl3> w = new gl3<>(s, false);
    private String x;
    private String y;

    public pl3(boolean z) {
        if (z) {
            String str = vm3.a;
            this.x = vm3.g(str, vm3.O, null);
            this.y = vm3.g(str, vm3.P, null);
            return;
        }
        this.x = jm3.J0();
        this.y = an3.g().G();
    }

    public void a() {
        boolean z = (this.x == null && this.y == null) ? false : true;
        this.x = null;
        this.y = null;
        if (z) {
            this.w.c(this);
        }
    }

    public boolean b(pl3 pl3Var) {
        String str = this.x;
        if (str == null) {
            str = "";
        }
        String str2 = pl3Var.x;
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(str2)) {
            String str3 = this.y;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = pl3Var.y;
            if (str3.equals(str4 != null ? str4 : "")) {
                return false;
            }
        }
        return true;
    }

    public gl3<Object, pl3> c() {
        return this.w;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String d() {
        return this.y;
    }

    public String e() {
        return this.x;
    }

    public boolean f() {
        return (this.x == null || this.y == null) ? false : true;
    }

    public void g() {
        String str = vm3.a;
        vm3.o(str, vm3.O, this.x);
        vm3.o(str, vm3.P, this.y);
    }

    public void h(@x1 String str) {
        boolean z = !str.equals(this.y);
        this.y = str;
        if (z) {
            this.w.c(this);
        }
    }

    public void i(@x1 String str) {
        boolean z = true;
        if (str != null ? str.equals(this.x) : this.x == null) {
            z = false;
        }
        this.x = str;
        if (z) {
            this.w.c(this);
        }
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.x;
            if (str != null) {
                jSONObject.put(t, str);
            } else {
                jSONObject.put(t, JSONObject.NULL);
            }
            String str2 = this.y;
            if (str2 != null) {
                jSONObject.put(u, str2);
            } else {
                jSONObject.put(u, JSONObject.NULL);
            }
            jSONObject.put(v, f());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return n().toString();
    }
}