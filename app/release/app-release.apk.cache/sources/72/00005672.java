package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRedisplayStats.java */
/* loaded from: classes3.dex */
public class pk3 {
    private static final String a = "limit";
    private static final String b = "delay";
    private long c;
    private int d;
    private int e;
    private long f;
    private boolean g;

    public pk3() {
        this.c = -1L;
        this.d = 0;
        this.e = 1;
        this.f = 0L;
        this.g = false;
    }

    public long a() {
        return this.f;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public long d() {
        return this.c;
    }

    public void e() {
        this.d++;
    }

    public boolean f() {
        if (this.c < 0) {
            return true;
        }
        long b2 = jm3.X0().b() / 1000;
        long j = b2 - this.c;
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("OSInAppMessage lastDisplayTime: ");
        G.append(this.c);
        G.append(" currentTimeInSeconds: ");
        G.append(b2);
        G.append(" diffInSeconds: ");
        G.append(j);
        G.append(" displayDelay: ");
        G.append(this.f);
        jm3.a(u0Var, G.toString());
        return j >= this.f;
    }

    public boolean g() {
        return this.g;
    }

    public void h(long j) {
        this.f = j;
    }

    public void i(int i) {
        this.e = i;
    }

    public void j(int i) {
        this.d = i;
    }

    public void k(pk3 pk3Var) {
        l(pk3Var.d());
        j(pk3Var.c());
    }

    public void l(long j) {
        this.c = j;
    }

    public boolean m() {
        boolean z = this.d < this.e;
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "OSInAppMessage shouldDisplayAgain: " + z);
        return z;
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(a, this.e);
            jSONObject.put(b, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSInAppMessageDisplayStats{lastDisplayTime=");
        G.append(this.c);
        G.append(", displayQuantity=");
        G.append(this.d);
        G.append(", displayLimit=");
        G.append(this.e);
        G.append(", displayDelay=");
        G.append(this.f);
        G.append('}');
        return G.toString();
    }

    public pk3(int i, long j) {
        this.c = -1L;
        this.d = 0;
        this.e = 1;
        this.f = 0L;
        this.g = false;
        this.d = i;
        this.c = j;
    }

    public pk3(JSONObject jSONObject) throws JSONException {
        this.c = -1L;
        this.d = 0;
        this.e = 1;
        this.f = 0L;
        this.g = false;
        this.g = true;
        Object obj = jSONObject.get(a);
        Object obj2 = jSONObject.get(b);
        if (obj instanceof Integer) {
            this.e = ((Integer) obj).intValue();
        }
        if (obj2 instanceof Long) {
            this.f = ((Long) obj2).longValue();
        } else if (obj2 instanceof Integer) {
            this.f = ((Integer) obj2).intValue();
        }
    }
}