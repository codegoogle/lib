package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSSessionManager.java */
/* loaded from: classes3.dex */
public class rl3 {
    private static final String a = "OS_END_CURRENT_SESSION";
    public co3 b;
    private b c;
    private tk3 d;

    /* compiled from: OSSessionManager.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ List s;

        public a(List list) {
            this.s = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            rl3.this.c.a(this.s);
        }
    }

    /* compiled from: OSSessionManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@x1 List<do3> list);
    }

    public rl3(@x1 b bVar, co3 co3Var, tk3 tk3Var) {
        this.c = bVar;
        this.b = co3Var;
        this.d = tk3Var;
    }

    private void d(jm3.l0 l0Var, @z1 String str) {
        boolean z;
        do3 do3Var;
        this.d.b("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + l0Var);
        xn3 b2 = this.b.b(l0Var);
        List<xn3> d = this.b.d(l0Var);
        ArrayList arrayList = new ArrayList();
        if (b2 != null) {
            do3Var = b2.e();
            fo3 fo3Var = fo3.DIRECT;
            if (str == null) {
                str = b2.g();
            }
            z = o(b2, fo3Var, str, null);
        } else {
            z = false;
            do3Var = null;
        }
        if (z) {
            this.d.b("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + d);
            arrayList.add(do3Var);
            for (xn3 xn3Var : d) {
                if (xn3Var.k().g()) {
                    arrayList.add(xn3Var.e());
                    xn3Var.t();
                }
            }
        }
        this.d.b("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (xn3 xn3Var2 : d) {
            if (xn3Var2.k().m()) {
                JSONArray n = xn3Var2.n();
                if (n.length() > 0 && !l0Var.f()) {
                    do3 e = xn3Var2.e();
                    if (o(xn3Var2, fo3.INDIRECT, null, n)) {
                        arrayList.add(e);
                    }
                }
            }
        }
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("Trackers after update attempt: ");
        G.append(this.b.c().toString());
        jm3.a(u0Var, G.toString());
        n(arrayList);
    }

    private void n(List<do3> list) {
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new a(list), a).start();
        }
    }

    private boolean o(@x1 xn3 xn3Var, @x1 fo3 fo3Var, @z1 String str, @z1 JSONArray jSONArray) {
        if (p(xn3Var, fo3Var, str, jSONArray)) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            StringBuilder G = wo1.G("OSChannelTracker changed: ");
            G.append(xn3Var.h());
            G.append("\nfrom:\ninfluenceType: ");
            G.append(xn3Var.k());
            G.append(", directNotificationId: ");
            G.append(xn3Var.g());
            G.append(", indirectNotificationIds: ");
            G.append(xn3Var.j());
            G.append("\nto:\ninfluenceType: ");
            G.append(fo3Var);
            G.append(", directNotificationId: ");
            G.append(str);
            G.append(", indirectNotificationIds: ");
            G.append(jSONArray);
            jm3.a(u0Var, G.toString());
            xn3Var.z(fo3Var);
            xn3Var.x(str);
            xn3Var.y(jSONArray);
            xn3Var.b();
            jm3.a(u0Var, "Trackers changed to: " + this.b.c().toString());
            return true;
        }
        return false;
    }

    private boolean p(@x1 xn3 xn3Var, @x1 fo3 fo3Var, @z1 String str, @z1 JSONArray jSONArray) {
        if (fo3Var.equals(xn3Var.k())) {
            fo3 k = xn3Var.k();
            if (!k.g() || xn3Var.g() == null || xn3Var.g().equals(str)) {
                return k.i() && xn3Var.j() != null && xn3Var.j().length() > 0 && !dj3.a(xn3Var.j(), jSONArray);
            }
            return true;
        }
        return true;
    }

    public void b(@x1 JSONObject jSONObject, List<do3> list) {
        tk3 tk3Var = this.d;
        StringBuilder G = wo1.G("OneSignal SessionManager addSessionData with influences: ");
        G.append(list.toString());
        tk3Var.b(G.toString());
        this.b.a(jSONObject, list);
        tk3 tk3Var2 = this.d;
        tk3Var2.b("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    public void c(jm3.l0 l0Var) {
        d(l0Var, null);
    }

    @x1
    public List<do3> e() {
        return this.b.f();
    }

    @x1
    public List<do3> f() {
        return this.b.h();
    }

    public void g() {
        this.b.i();
    }

    public void h(@x1 String str) {
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        o(this.b.e(), fo3.DIRECT, str, null);
    }

    public void i() {
        this.d.b("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.b.e().t();
    }

    public void j(jm3.l0 l0Var, @z1 String str) {
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        d(l0Var, str);
    }

    public void k(@x1 String str) {
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        xn3 e = this.b.e();
        e.v(str);
        e.t();
    }

    public void l(@z1 String str) {
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        this.b.g().v(str);
    }

    public void m(jm3.l0 l0Var) {
        boolean o;
        List<xn3> d = this.b.d(l0Var);
        ArrayList arrayList = new ArrayList();
        tk3 tk3Var = this.d;
        tk3Var.b("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + l0Var + "\n channelTrackers: " + d.toString());
        for (xn3 xn3Var : d) {
            JSONArray n = xn3Var.n();
            tk3 tk3Var2 = this.d;
            tk3Var2.b("OneSignal SessionManager restartSessionIfNeeded lastIds: " + n);
            do3 e = xn3Var.e();
            if (n.length() > 0) {
                o = o(xn3Var, fo3.INDIRECT, null, n);
            } else {
                o = o(xn3Var, fo3.UNATTRIBUTED, null, null);
            }
            if (o) {
                arrayList.add(e);
            }
        }
        n(arrayList);
    }
}