package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.rs2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotification.java */
/* loaded from: classes3.dex */
public class vk3 {
    private int A;
    private kg.j a;
    @z1
    private List<vk3> b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private JSONObject i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private int q;
    private String r;
    private String s;
    private List<a> t;
    private String u;
    private b v;
    private String w;
    private int x;
    private String y;
    private long z;

    /* compiled from: OSNotification.java */
    /* loaded from: classes3.dex */
    public static class a {
        private String a;
        private String b;
        private String c;

        public a() {
        }

        public String d() {
            return this.c;
        }

        public String e() {
            return this.a;
        }

        public String f() {
            return this.b;
        }

        public JSONObject g() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.a);
                jSONObject.put("text", this.b);
                jSONObject.put("icon", this.c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        public a(JSONObject jSONObject) {
            this.a = jSONObject.optString("id");
            this.b = jSONObject.optString("text");
            this.c = jSONObject.optString("icon");
        }

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: OSNotification.java */
    /* loaded from: classes3.dex */
    public static class b {
        private String a;
        private String b;
        private String c;

        public String d() {
            return this.c;
        }

        public String e() {
            return this.a;
        }

        public String f() {
            return this.b;
        }
    }

    /* compiled from: OSNotification.java */
    /* loaded from: classes3.dex */
    public static class c {
        private int A;
        private kg.j a;
        private List<vk3> b;
        private int c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private JSONObject i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;
        private String p;
        private int q = 1;
        private String r;
        private String s;
        private List<a> t;
        private String u;
        private b v;
        private String w;
        private int x;
        private String y;
        private long z;

        public c A(String str) {
            this.e = str;
            return this;
        }

        public c B(String str) {
            this.g = str;
            return this;
        }

        public vk3 a() {
            vk3 vk3Var = new vk3();
            vk3Var.Y(this.a);
            vk3Var.T(this.b);
            vk3Var.K(this.c);
            vk3Var.Z(this.d);
            vk3Var.h0(this.e);
            vk3Var.g0(this.f);
            vk3Var.i0(this.g);
            vk3Var.O(this.h);
            vk3Var.J(this.i);
            vk3Var.d0(this.j);
            vk3Var.U(this.k);
            vk3Var.N(this.l);
            vk3Var.e0(this.m);
            vk3Var.V(this.n);
            vk3Var.f0(this.o);
            vk3Var.W(this.p);
            vk3Var.X(this.q);
            vk3Var.R(this.r);
            vk3Var.S(this.s);
            vk3Var.I(this.t);
            vk3Var.Q(this.u);
            vk3Var.L(this.v);
            vk3Var.P(this.w);
            vk3Var.a0(this.x);
            vk3Var.b0(this.y);
            vk3Var.c0(this.z);
            vk3Var.j0(this.A);
            return vk3Var;
        }

        public c b(List<a> list) {
            this.t = list;
            return this;
        }

        public c c(JSONObject jSONObject) {
            this.i = jSONObject;
            return this;
        }

        public c d(int i) {
            this.c = i;
            return this;
        }

        public c e(b bVar) {
            this.v = bVar;
            return this;
        }

        public c f(String str) {
            this.l = str;
            return this;
        }

        public c g(String str) {
            this.h = str;
            return this;
        }

        public c h(String str) {
            this.w = str;
            return this;
        }

        public c i(String str) {
            this.u = str;
            return this;
        }

        public c j(String str) {
            this.r = str;
            return this;
        }

        public c k(String str) {
            this.s = str;
            return this;
        }

        public c l(List<vk3> list) {
            this.b = list;
            return this;
        }

        public c m(String str) {
            this.k = str;
            return this;
        }

        public c n(String str) {
            this.n = str;
            return this;
        }

        public c o(String str) {
            this.p = str;
            return this;
        }

        public c p(int i) {
            this.q = i;
            return this;
        }

        public c q(kg.j jVar) {
            this.a = jVar;
            return this;
        }

        public c r(String str) {
            this.d = str;
            return this;
        }

        public c s(int i) {
            this.x = i;
            return this;
        }

        public c t(String str) {
            this.y = str;
            return this;
        }

        public c u(long j) {
            this.z = j;
            return this;
        }

        public c v(String str) {
            this.j = str;
            return this;
        }

        public c w(String str) {
            this.m = str;
            return this;
        }

        public c x(String str) {
            this.o = str;
            return this;
        }

        public c y(int i) {
            this.A = i;
            return this;
        }

        public c z(String str) {
            this.f = str;
            return this;
        }
    }

    public vk3() {
        this.q = 1;
    }

    private void F(JSONObject jSONObject) {
        try {
            JSONObject b2 = ij3.b(jSONObject);
            long b3 = jm3.X0().b();
            if (jSONObject.has("google.ttl")) {
                this.z = jSONObject.optLong("google.sent_time", b3) / 1000;
                this.A = jSONObject.optInt("google.ttl", 259200);
            } else if (jSONObject.has(sm3.a)) {
                this.z = jSONObject.optLong(sm3.b, b3) / 1000;
                this.A = jSONObject.optInt(sm3.a, 259200);
            } else {
                this.z = b3 / 1000;
                this.A = 259200;
            }
            this.d = b2.optString("i");
            this.f = b2.optString("ti");
            this.e = b2.optString("tn");
            this.y = jSONObject.toString();
            this.i = b2.optJSONObject("a");
            this.n = b2.optString("u", null);
            this.h = jSONObject.optString("alert", null);
            this.g = jSONObject.optString("title", null);
            this.j = jSONObject.optString("sicon", null);
            this.l = jSONObject.optString("bicon", null);
            this.k = jSONObject.optString("licon", null);
            this.o = jSONObject.optString("sound", null);
            this.r = jSONObject.optString("grp", null);
            this.s = jSONObject.optString("grp_msg", null);
            this.m = jSONObject.optString("bgac", null);
            this.p = jSONObject.optString("ledc", null);
            String optString = jSONObject.optString("vis", null);
            if (optString != null) {
                this.q = Integer.parseInt(optString);
            }
            this.u = jSONObject.optString("from", null);
            this.x = jSONObject.optInt("pri", 0);
            String optString2 = jSONObject.optString(rs2.d.e, null);
            if (!"do_not_collapse".equals(optString2)) {
                this.w = optString2;
            }
            try {
                H();
            } catch (Throwable th) {
                jm3.b(jm3.u0.ERROR, "Error assigning OSNotificationReceivedEvent.actionButtons values!", th);
            }
            try {
                M(jSONObject);
            } catch (Throwable th2) {
                jm3.b(jm3.u0.ERROR, "Error assigning OSNotificationReceivedEvent.backgroundImageLayout values!", th2);
            }
        } catch (Throwable th3) {
            jm3.b(jm3.u0.ERROR, "Error assigning OSNotificationReceivedEvent payload values!", th3);
        }
    }

    private void H() throws Throwable {
        JSONObject jSONObject = this.i;
        if (jSONObject == null || !jSONObject.has("actionButtons")) {
            return;
        }
        JSONArray jSONArray = this.i.getJSONArray("actionButtons");
        this.t = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            a aVar = new a();
            aVar.a = jSONObject2.optString("id", null);
            aVar.b = jSONObject2.optString("text", null);
            aVar.c = jSONObject2.optString("icon", null);
            this.t.add(aVar);
        }
        this.i.remove(ui3.c);
        this.i.remove("actionButtons");
    }

    private void M(JSONObject jSONObject) throws Throwable {
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            JSONObject jSONObject2 = new JSONObject(optString);
            b bVar = new b();
            this.v = bVar;
            bVar.a = jSONObject2.optString("img");
            this.v.b = jSONObject2.optString("tc");
            this.v.c = jSONObject2.optString("bc");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(long j) {
        this.z = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i) {
        this.A = i;
    }

    public String A() {
        return this.f;
    }

    public String B() {
        return this.e;
    }

    public String C() {
        return this.g;
    }

    public int D() {
        return this.A;
    }

    public boolean E() {
        return this.c != 0;
    }

    public uk3 G() {
        return new uk3(this);
    }

    public void I(List<a> list) {
        this.t = list;
    }

    public void J(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public void K(int i) {
        this.c = i;
    }

    public void L(b bVar) {
        this.v = bVar;
    }

    public void N(String str) {
        this.l = str;
    }

    public void O(String str) {
        this.h = str;
    }

    public void P(String str) {
        this.w = str;
    }

    public void Q(String str) {
        this.u = str;
    }

    public void R(String str) {
        this.r = str;
    }

    public void S(String str) {
        this.s = str;
    }

    public void T(@z1 List<vk3> list) {
        this.b = list;
    }

    public void U(String str) {
        this.k = str;
    }

    public void V(String str) {
        this.n = str;
    }

    public void W(String str) {
        this.p = str;
    }

    public void X(int i) {
        this.q = i;
    }

    public void Y(kg.j jVar) {
        this.a = jVar;
    }

    public void Z(String str) {
        this.d = str;
    }

    public void a0(int i) {
        this.x = i;
    }

    public void b0(String str) {
        this.y = str;
    }

    public vk3 c() {
        return new c().q(this.a).l(this.b).d(this.c).r(this.d).A(this.e).z(this.f).B(this.g).g(this.h).c(this.i).v(this.j).m(this.k).f(this.l).w(this.m).n(this.n).x(this.o).o(this.p).p(this.q).j(this.r).k(this.s).b(this.t).i(this.u).e(this.v).h(this.w).s(this.x).t(this.y).u(this.z).y(this.A).a();
    }

    public List<a> d() {
        return this.t;
    }

    public void d0(String str) {
        this.j = str;
    }

    public JSONObject e() {
        return this.i;
    }

    public void e0(String str) {
        this.m = str;
    }

    public int f() {
        return this.c;
    }

    public void f0(String str) {
        this.o = str;
    }

    public b g() {
        return this.v;
    }

    public void g0(String str) {
        this.f = str;
    }

    public String h() {
        return this.l;
    }

    public void h0(String str) {
        this.e = str;
    }

    public String i() {
        return this.h;
    }

    public void i0(String str) {
        this.g = str;
    }

    public String j() {
        return this.w;
    }

    public String k() {
        return this.u;
    }

    public JSONObject k0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ui3.b, this.c);
            JSONArray jSONArray = new JSONArray();
            List<vk3> list = this.b;
            if (list != null) {
                for (vk3 vk3Var : list) {
                    jSONArray.put(vk3Var.k0());
                }
            }
            jSONObject.put("groupedNotifications", jSONArray);
            jSONObject.put("notificationId", this.d);
            jSONObject.put("templateName", this.e);
            jSONObject.put("templateId", this.f);
            jSONObject.put("title", this.g);
            jSONObject.put("body", this.h);
            jSONObject.put("smallIcon", this.j);
            jSONObject.put("largeIcon", this.k);
            jSONObject.put("bigPicture", this.l);
            jSONObject.put("smallIconAccentColor", this.m);
            jSONObject.put("launchURL", this.n);
            jSONObject.put("sound", this.o);
            jSONObject.put("ledColor", this.p);
            jSONObject.put("lockScreenVisibility", this.q);
            jSONObject.put("groupKey", this.r);
            jSONObject.put("groupMessage", this.s);
            jSONObject.put("fromProjectNumber", this.u);
            jSONObject.put("collapseId", this.w);
            jSONObject.put("priority", this.x);
            JSONObject jSONObject2 = this.i;
            if (jSONObject2 != null) {
                jSONObject.put("additionalData", jSONObject2);
            }
            if (this.t != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (a aVar : this.t) {
                    jSONArray2.put(aVar.g());
                }
                jSONObject.put("actionButtons", jSONArray2);
            }
            jSONObject.put("rawPayload", this.y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String l() {
        return this.r;
    }

    public String m() {
        return this.s;
    }

    @z1
    public List<vk3> n() {
        return this.b;
    }

    public String o() {
        return this.k;
    }

    public String p() {
        return this.n;
    }

    public String q() {
        return this.p;
    }

    public int r() {
        return this.q;
    }

    public kg.j s() {
        return this.a;
    }

    public String t() {
        return this.d;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSNotification{notificationExtender=");
        G.append(this.a);
        G.append(", groupedNotifications=");
        G.append(this.b);
        G.append(", androidNotificationId=");
        G.append(this.c);
        G.append(", notificationId='");
        wo1.d0(G, this.d, '\'', ", templateName='");
        wo1.d0(G, this.e, '\'', ", templateId='");
        wo1.d0(G, this.f, '\'', ", title='");
        wo1.d0(G, this.g, '\'', ", body='");
        wo1.d0(G, this.h, '\'', ", additionalData=");
        G.append(this.i);
        G.append(", smallIcon='");
        wo1.d0(G, this.j, '\'', ", largeIcon='");
        wo1.d0(G, this.k, '\'', ", bigPicture='");
        wo1.d0(G, this.l, '\'', ", smallIconAccentColor='");
        wo1.d0(G, this.m, '\'', ", launchURL='");
        wo1.d0(G, this.n, '\'', ", sound='");
        wo1.d0(G, this.o, '\'', ", ledColor='");
        wo1.d0(G, this.p, '\'', ", lockScreenVisibility=");
        G.append(this.q);
        G.append(", groupKey='");
        wo1.d0(G, this.r, '\'', ", groupMessage='");
        wo1.d0(G, this.s, '\'', ", actionButtons=");
        G.append(this.t);
        G.append(", fromProjectNumber='");
        wo1.d0(G, this.u, '\'', ", backgroundImageLayout=");
        G.append(this.v);
        G.append(", collapseId='");
        wo1.d0(G, this.w, '\'', ", priority=");
        G.append(this.x);
        G.append(", rawPayload='");
        G.append(this.y);
        G.append('\'');
        G.append('}');
        return G.toString();
    }

    public int u() {
        return this.x;
    }

    public String v() {
        return this.y;
    }

    public long w() {
        return this.z;
    }

    public String x() {
        return this.j;
    }

    public String y() {
        return this.m;
    }

    public String z() {
        return this.o;
    }

    public vk3(@x1 JSONObject jSONObject) {
        this(null, jSONObject, 0);
    }

    public vk3(@z1 List<vk3> list, @x1 JSONObject jSONObject, int i) {
        this.q = 1;
        F(jSONObject);
        this.b = list;
        this.c = i;
    }

    public vk3(vk3 vk3Var) {
        this.q = 1;
        this.a = vk3Var.a;
        this.b = vk3Var.b;
        this.c = vk3Var.c;
        this.d = vk3Var.d;
        this.e = vk3Var.e;
        this.f = vk3Var.f;
        this.g = vk3Var.g;
        this.h = vk3Var.h;
        this.i = vk3Var.i;
        this.j = vk3Var.j;
        this.k = vk3Var.k;
        this.l = vk3Var.l;
        this.m = vk3Var.m;
        this.n = vk3Var.n;
        this.o = vk3Var.o;
        this.p = vk3Var.p;
        this.q = vk3Var.q;
        this.r = vk3Var.r;
        this.s = vk3Var.s;
        this.t = vk3Var.t;
        this.u = vk3Var.u;
        this.v = vk3Var.v;
        this.w = vk3Var.w;
        this.x = vk3Var.x;
        this.y = vk3Var.y;
        this.z = vk3Var.z;
        this.A = vk3Var.A;
    }
}