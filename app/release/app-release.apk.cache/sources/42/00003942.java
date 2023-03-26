package com.p7700g.p99005;

import com.onesignal.OSUtils;
import com.p7700g.p99005.ej3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.xm3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalStateSynchronizer.java */
/* loaded from: classes3.dex */
public class an3 {
    private static final Object a = new Object();
    private static HashMap<d, un3> b = new HashMap<>();

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class a implements jm3.y0 {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ jm3.v0 b;

        /* compiled from: OneSignalStateSynchronizer.java */
        /* renamed from: com.p7700g.p99005.an3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0146a implements Runnable {
            public RunnableC0146a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                jm3.v0 v0Var = aVar.b;
                if (v0Var != null) {
                    v0Var.a(aVar.a);
                }
            }
        }

        public a(JSONObject jSONObject, jm3.v0 v0Var) {
            this.a = jSONObject;
            this.b = v0Var;
        }

        @Override // com.p7700g.p99005.jm3.y0
        public void a(String str, boolean z) {
            jm3.u0 u0Var = jm3.u0.VERBOSE;
            jm3.P1(u0Var, "Completed request to update external user id for channel: " + str + " and success: " + z);
            try {
                this.a.put(str, new JSONObject().put("success", z));
            } catch (JSONException e) {
                jm3.u0 u0Var2 = jm3.u0.ERROR;
                jm3.P1(u0Var2, "Error while adding the success status of external id for channel: " + str);
                e.printStackTrace();
            }
            for (un3 un3Var : an3.b.values()) {
                if (un3Var.P()) {
                    jm3.u0 u0Var3 = jm3.u0.VERBOSE;
                    StringBuilder G = wo1.G("External user id handlers are still being processed for channel: ");
                    G.append(un3Var.z());
                    G.append(" , wait until finished before proceeding");
                    jm3.P1(u0Var3, G.toString());
                    return;
                }
            }
            OSUtils.V(new RunnableC0146a());
        }
    }

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(c cVar);

        void onSuccess(String str);
    }

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public static class c {
        public int a;
        public String b;

        public c(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    /* compiled from: OneSignalStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public enum d {
        PUSH,
        EMAIL,
        SMS;

        public boolean f() {
            return equals(EMAIL);
        }

        public boolean g() {
            return equals(PUSH);
        }

        public boolean h() {
            return equals(SMS);
        }
    }

    public static void A(String str, String str2) {
        e().x0(str, str2);
        g().y0(str, str2);
    }

    public static void B(boolean z) {
        e().k0(z);
    }

    public static void C(boolean z) {
        e().n0(z);
        c().n0(z);
        g().n0(z);
    }

    public static void D(JSONObject jSONObject, b bVar) {
        e().o0(jSONObject, bVar);
        c().o0(jSONObject, bVar);
        g().o0(jSONObject, bVar);
    }

    public static void E(ej3.d dVar) {
        e().q0(dVar);
        c().q0(dVar);
        g().q0(dVar);
    }

    public static void F(JSONObject jSONObject) {
        e().r0(jSONObject);
    }

    public static void b() {
        e().o();
        c().o();
        g().o();
    }

    public static on3 c() {
        HashMap<d, un3> hashMap = b;
        d dVar = d.EMAIL;
        if (!hashMap.containsKey(dVar) || b.get(dVar) == null) {
            synchronized (a) {
                if (b.get(dVar) == null) {
                    b.put(dVar, new on3());
                }
            }
        }
        return (on3) b.get(dVar);
    }

    public static String d() {
        return e().t0();
    }

    public static qn3 e() {
        HashMap<d, un3> hashMap = b;
        d dVar = d.PUSH;
        if (!hashMap.containsKey(dVar) || b.get(dVar) == null) {
            synchronized (a) {
                if (b.get(dVar) == null) {
                    b.put(dVar, new qn3());
                }
            }
        }
        return (qn3) b.get(dVar);
    }

    public static String f() {
        return e().G();
    }

    public static sn3 g() {
        HashMap<d, un3> hashMap = b;
        d dVar = d.SMS;
        if (!hashMap.containsKey(dVar) || b.get(dVar) == null) {
            synchronized (a) {
                if (b.get(dVar) == null) {
                    b.put(dVar, new sn3());
                }
            }
        }
        return (sn3) b.get(dVar);
    }

    public static boolean h() {
        return e().H();
    }

    public static boolean i() {
        return e().I() || c().I() || g().I();
    }

    public static un3.e j(boolean z) {
        return e().J(z);
    }

    public static List<un3> k() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e());
        if (jm3.m1()) {
            arrayList.add(c());
        }
        if (jm3.n1()) {
            arrayList.add(g());
        }
        return arrayList;
    }

    public static boolean l() {
        return e().M();
    }

    public static void m() {
        e().Q();
        c().Q();
        g().Q();
    }

    public static void n() {
        e().u0();
        c().T();
    }

    public static void o() {
        g().T();
        e().v0();
    }

    public static boolean p() {
        boolean X = e().X();
        boolean X2 = c().X();
        boolean X3 = g().X();
        if (X2) {
            X2 = c().G() != null;
        }
        if (X3) {
            X3 = g().G() != null;
        }
        return X || X2 || X3;
    }

    public static void q(boolean z) {
        e().Y(z);
        c().Y(z);
        g().Y(z);
    }

    public static void r() {
        c().x0();
        g().x0();
    }

    public static void s() {
        e().Z();
        c().Z();
        g().Z();
        e().b0(null);
        c().b0(null);
        g().b0(null);
        jm3.Z2(-3660L);
    }

    public static void t(JSONObject jSONObject, xm3.g gVar) {
        for (un3 un3Var : k()) {
            un3Var.d0(jSONObject, gVar);
        }
    }

    public static void u(JSONObject jSONObject, @z1 jm3.m0 m0Var) {
        try {
            JSONObject put = new JSONObject().put("tags", jSONObject);
            e().e0(put, m0Var);
            c().e0(put, m0Var);
            g().e0(put, m0Var);
        } catch (JSONException e) {
            if (m0Var != null) {
                StringBuilder G = wo1.G("Encountered an error attempting to serialize your tags into JSON: ");
                G.append(e.getMessage());
                G.append("\n");
                G.append(e.getStackTrace());
                m0Var.b(new jm3.m1(-1, G.toString()));
            }
            e.printStackTrace();
        }
    }

    public static void v(String str, String str2) {
        e().w0(str, str2);
        c().y0(str, str2);
    }

    public static void w(String str, String str2, jm3.v0 v0Var) throws JSONException {
        a aVar = new a(new JSONObject(), v0Var);
        for (un3 un3Var : k()) {
            un3Var.h0(str, str2, aVar);
        }
    }

    public static void x() {
        e().i0();
        c().i0();
        g().i0();
    }

    public static void y() {
        c().i0();
    }

    public static void z(boolean z) {
        e().j0(z);
    }
}