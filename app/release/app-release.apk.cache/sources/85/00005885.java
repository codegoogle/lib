package com.p7700g.p99005;

import com.p7700g.p99005.an3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.xm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStatePushSynchronizer.java */
/* loaded from: classes3.dex */
public class qn3 extends un3 {
    private static boolean I;

    /* compiled from: UserStatePushSynchronizer.java */
    /* loaded from: classes3.dex */
    public class a extends xm3.g {
        public a() {
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            boolean unused = qn3.I = true;
            try {
                JSONObject jSONObject = new JSONObject((str == null || str.isEmpty()) ? "{}" : "{}");
                if (jSONObject.has("tags")) {
                    synchronized (qn3.this.w) {
                        qn3 qn3Var = qn3.this;
                        JSONObject y = qn3Var.y(qn3Var.B().m().h("tags"), qn3.this.K().m().h("tags"), null, null);
                        qn3.this.B().v("tags", jSONObject.optJSONObject("tags"));
                        qn3.this.B().s();
                        qn3.this.K().q(jSONObject, y);
                        qn3.this.K().s();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public qn3() {
        super(an3.d.PUSH);
    }

    @Override // com.p7700g.p99005.un3
    @z1
    public String C(boolean z) {
        String k;
        synchronized (this.w) {
            k = K().m().k(un3.o, null);
        }
        return k;
    }

    @Override // com.p7700g.p99005.un3
    public String D() {
        return jm3.c1();
    }

    @Override // com.p7700g.p99005.un3
    public jm3.u0 E() {
        return jm3.u0.ERROR;
    }

    @Override // com.p7700g.p99005.un3
    public boolean H() {
        return K().o();
    }

    @Override // com.p7700g.p99005.un3
    public un3.e J(boolean z) {
        un3.e eVar;
        if (z) {
            xm3.f(wo1.v("players/", jm3.c1(), "?app_id=", jm3.M0()), new a(), xm3.a);
        }
        synchronized (this.w) {
            eVar = new un3.e(I, dj3.d(K().m(), "tags"));
        }
        return eVar;
    }

    @Override // com.p7700g.p99005.un3
    public boolean M() {
        return K().j().e(un3.j, true);
    }

    @Override // com.p7700g.p99005.un3
    public void T() {
    }

    @Override // com.p7700g.p99005.un3
    public mn3 V(String str, boolean z) {
        return new pn3(str, z);
    }

    @Override // com.p7700g.p99005.un3
    public void W(JSONObject jSONObject) {
    }

    @Override // com.p7700g.p99005.un3
    public void b0(String str) {
        jm3.x2(str);
    }

    @Override // com.p7700g.p99005.un3
    public void c0() {
        F(0).c();
    }

    @Override // com.p7700g.p99005.un3
    public void j0(boolean z) {
        try {
            L().u(un3.k, Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p7700g.p99005.un3
    public void k0(boolean z) {
        try {
            L().u(un3.j, Boolean.valueOf(z));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p7700g.p99005.un3
    public void n(JSONObject jSONObject) {
    }

    @Override // com.p7700g.p99005.un3
    public void p0(String str) {
        jm3.B3(str);
    }

    @Override // com.p7700g.p99005.un3
    public void r0(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(un3.f, jSONObject.optString(un3.f, null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt(un3.i, jSONObject.optString(un3.i, null));
            L().h(jSONObject2, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(un3.l)) {
                jSONObject3.put(un3.l, jSONObject.optInt(un3.l));
            }
            if (jSONObject.has(un3.k)) {
                jSONObject3.put(un3.k, jSONObject.optBoolean(un3.k));
            }
            L().g(jSONObject3, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public String t0() {
        return K().j().k("language", null);
    }

    public void u0() {
        try {
            L().u(un3.q, Boolean.TRUE);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void v0() {
        mn3 K = K();
        K.x(un3.u);
        K.z(un3.r);
        K.s();
        mn3 B = B();
        B.x(un3.u);
        String j = B.m().j(un3.r);
        B.z(un3.r);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(un3.r, j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "Device successfully logged out of SMS number: " + jSONObject);
        jm3.l1(jSONObject);
    }

    @Override // com.p7700g.p99005.un3
    public void w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            jm3.W();
        }
        if (jSONObject.has(un3.r)) {
            jm3.a0();
        }
    }

    public void w0(String str, String str2) {
        try {
            mn3 L = L();
            L.u(un3.t, str2);
            L.h(new JSONObject().put("email", str), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void x0(String str, String str2) {
        try {
            mn3 L = L();
            L.u(un3.u, str2);
            L.h(new JSONObject().put(un3.r, str), null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}