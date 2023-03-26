package com.p7700g.p99005;

import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationReceivedEvent.java */
/* loaded from: classes3.dex */
public class fl3 {
    private static final long a = 25000;
    private final xk3 b;
    private final dm3 c;
    private final Runnable d;
    private final vk3 e;
    private boolean f = false;

    /* compiled from: OSNotificationReceivedEvent.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.a(jm3.u0.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            fl3 fl3Var = fl3.this;
            fl3Var.b(fl3Var.c());
        }
    }

    /* compiled from: OSNotificationReceivedEvent.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ vk3 s;

        public b(vk3 vk3Var) {
            this.s = vk3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            fl3.this.e(this.s);
        }
    }

    public fl3(xk3 xk3Var, vk3 vk3Var) {
        this.e = vk3Var;
        this.b = xk3Var;
        dm3 b2 = dm3.b();
        this.c = b2;
        a aVar = new a();
        this.d = aVar;
        b2.c(a, aVar);
    }

    public static boolean d() {
        return OSUtils.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(@z1 vk3 vk3Var) {
        this.b.h(this.e.c(), vk3Var != null ? vk3Var.c() : null);
    }

    public synchronized void b(@z1 vk3 vk3Var) {
        this.c.a(this.d);
        if (this.f) {
            jm3.P1(jm3.u0.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f = true;
        if (d()) {
            new Thread(new b(vk3Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            e(vk3Var);
        }
    }

    public vk3 c() {
        return this.e;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(qm3.b.a, this.e.k0());
            jSONObject.put("isComplete", this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSNotificationReceivedEvent{isComplete=");
        G.append(this.f);
        G.append(", notification=");
        G.append(this.e);
        G.append('}');
        return G.toString();
    }
}