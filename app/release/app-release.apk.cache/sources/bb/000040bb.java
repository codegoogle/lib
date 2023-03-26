package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationOpenedResult.java */
/* loaded from: classes3.dex */
public class el3 implements jm3.q0 {
    private static final long a = 5000;
    private final dm3 b;
    private final Runnable c;
    private vk3 d;
    private wk3 e;
    private boolean f = false;

    /* compiled from: OSNotificationOpenedResult.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.a(jm3.u0.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            el3.this.c(false);
        }
    }

    public el3(vk3 vk3Var, wk3 wk3Var) {
        this.d = vk3Var;
        this.e = wk3Var;
        dm3 b = dm3.b();
        this.b = b;
        a aVar = new a();
        this.c = aVar;
        b.c(a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "OSNotificationOpenedResult complete called with opened: " + z);
        this.b.a(this.c);
        if (this.f) {
            jm3.P1(u0Var, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f = true;
        if (z) {
            jm3.F(this.d.t());
        }
        jm3.h2(this);
    }

    @Override // com.p7700g.p99005.jm3.q0
    public void a(jm3.l0 l0Var) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + l0Var);
        c(jm3.l0.APP_CLOSE.equals(l0Var));
    }

    public wk3 d() {
        return this.e;
    }

    public vk3 e() {
        return this.d;
    }

    @Deprecated
    public String f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", this.e.c());
            jSONObject.put(qm3.b.a, this.d.k0());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", this.e.c());
            jSONObject.put(qm3.b.a, this.d.k0());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSNotificationOpenedResult{notification=");
        G.append(this.d);
        G.append(", action=");
        G.append(this.e);
        G.append(", isComplete=");
        G.append(this.f);
        G.append('}');
        return G.toString();
    }
}