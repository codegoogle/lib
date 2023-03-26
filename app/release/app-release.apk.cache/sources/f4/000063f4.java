package com.p7700g.p99005;

import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xm3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalRemoteParams.java */
/* loaded from: classes3.dex */
public class wm3 {
    private static int a = 0;
    private static final String b = "outcomes";
    private static final String c = "v2_enabled";
    private static final String d = "enabled";
    private static final String e = "direct";
    private static final String f = "indirect";
    private static final String g = "notification_attribution";
    private static final String h = "in_app_message_attribution";
    private static final String i = "unattributed";
    private static final String j = "unsubscribe_on_notifications_disabled";
    private static final String k = "disable_gms_missing_prompt";
    private static final String l = "location_shared";
    private static final String m = "requires_user_privacy_consent";
    private static final String n = "fcm";
    private static final String o = "project_id";
    private static final String p = "app_id";
    private static final String q = "api_key";
    private static final int r = 10000;
    private static final int s = 30000;
    private static final int t = 90000;
    public static final int u = 1440;
    public static final int v = 10;

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public class a extends xm3.g {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ c c;

        /* compiled from: OneSignalRemoteParams.java */
        /* renamed from: com.p7700g.p99005.wm3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0265a implements Runnable {
            public RunnableC0265a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = (wm3.a * 10000) + 30000;
                if (i > 90000) {
                    i = 90000;
                }
                jm3.u0 u0Var = jm3.u0.INFO;
                StringBuilder G = wo1.G("Failed to get Android parameters, trying again in ");
                G.append(i / 1000);
                G.append(" seconds.");
                jm3.a(u0Var, G.toString());
                try {
                    Thread.sleep(i);
                    wm3.b();
                    a aVar = a.this;
                    wm3.e(aVar.a, aVar.b, aVar.c);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public a(String str, String str2, c cVar) {
            this.a = str;
            this.b = str2;
            this.c = cVar;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            if (i == 403) {
                jm3.a(jm3.u0.FATAL, "403 error getting OneSignal params, omitting further retries!");
            } else {
                new Thread(new RunnableC0265a(), "OS_PARAMS_REQUEST").start();
            }
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            wm3.f(str, this.c);
        }
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public class b extends f {
        public final /* synthetic */ JSONObject q;

        public b(JSONObject jSONObject) {
            this.q = jSONObject;
            this.b = jSONObject.optBoolean("enterp", false);
            this.d = jSONObject.optBoolean("require_email_auth", false);
            this.e = jSONObject.optBoolean("require_user_id_auth", false);
            this.f = jSONObject.optJSONArray("chnl_lst");
            this.g = jSONObject.optBoolean("fba", false);
            this.h = jSONObject.optBoolean("restore_ttl_filter", true);
            this.a = jSONObject.optString("android_sender_id", null);
            this.i = jSONObject.optBoolean("clear_group_on_summary_click", true);
            this.j = jSONObject.optBoolean("receive_receipts_enable", false);
            this.k = !jSONObject.has(wm3.k) ? null : Boolean.valueOf(jSONObject.optBoolean(wm3.k, false));
            this.l = !jSONObject.has(wm3.j) ? null : Boolean.valueOf(jSONObject.optBoolean(wm3.j, true));
            this.m = !jSONObject.has(wm3.l) ? null : Boolean.valueOf(jSONObject.optBoolean(wm3.l, true));
            this.n = !jSONObject.has(wm3.m) ? null : Boolean.valueOf(jSONObject.optBoolean(wm3.m, false));
            this.o = new e();
            if (jSONObject.has(wm3.b)) {
                wm3.g(jSONObject.optJSONObject(wm3.b), this.o);
            }
            this.p = new d();
            if (jSONObject.has("fcm")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("fcm");
                this.p.c = optJSONObject.optString(wm3.q, null);
                this.p.b = optJSONObject.optString("app_id", null);
                this.p.a = optJSONObject.optString(wm3.o, null);
            }
        }
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(f fVar);
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public static class d {
        @z1
        public String a;
        @z1
        public String b;
        @z1
        public String c;
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public static class e {
        public int a = wm3.u;
        public int b = 10;
        public int c = wm3.u;
        public int d = 10;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;

        public int a() {
            return this.d;
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }

        public boolean e() {
            return this.e;
        }

        public boolean f() {
            return this.f;
        }

        public boolean g() {
            return this.g;
        }

        public String toString() {
            StringBuilder G = wo1.G("InfluenceParams{indirectNotificationAttributionWindow=");
            G.append(this.a);
            G.append(", notificationLimit=");
            G.append(this.b);
            G.append(", indirectIAMAttributionWindow=");
            G.append(this.c);
            G.append(", iamLimit=");
            G.append(this.d);
            G.append(", directEnabled=");
            G.append(this.e);
            G.append(", indirectEnabled=");
            G.append(this.f);
            G.append(", unattributedEnabled=");
            G.append(this.g);
            G.append('}');
            return G.toString();
        }
    }

    /* compiled from: OneSignalRemoteParams.java */
    /* loaded from: classes3.dex */
    public static class f {
        public String a;
        public boolean b;
        public boolean c;
        public boolean d;
        public boolean e;
        public JSONArray f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public Boolean k;
        public Boolean l;
        public Boolean m;
        public Boolean n;
        public e o;
        public d p;
    }

    public static /* synthetic */ int b() {
        int i2 = a;
        a = i2 + 1;
        return i2;
    }

    public static void e(String str, String str2, @x1 c cVar) {
        a aVar = new a(str, str2, cVar);
        String u2 = wo1.u("apps/", str, "/android_params.js");
        if (str2 != null) {
            u2 = wo1.u(u2, "?player_id=", str2);
        }
        jm3.a(jm3.u0.DEBUG, "Starting request to get Android parameters.");
        xm3.e(u2, aVar, xm3.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(String str, @x1 c cVar) {
        try {
            cVar.a(new b(new JSONObject(str)));
        } catch (NullPointerException | JSONException e2) {
            jm3.u0 u0Var = jm3.u0.FATAL;
            jm3.b(u0Var, "Error parsing android_params!: ", e2);
            jm3.a(u0Var, "Response that errored from android_params!: " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(JSONObject jSONObject, e eVar) {
        if (jSONObject.has(c)) {
            eVar.h = jSONObject.optBoolean(c);
        }
        if (jSONObject.has("direct")) {
            eVar.e = jSONObject.optJSONObject("direct").optBoolean("enabled");
        }
        if (jSONObject.has("indirect")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("indirect");
            eVar.f = optJSONObject.optBoolean("enabled");
            if (optJSONObject.has(g)) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject(g);
                eVar.a = optJSONObject2.optInt("minutes_since_displayed", u);
                eVar.b = optJSONObject2.optInt("limit", 10);
            }
            if (optJSONObject.has(h)) {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject(h);
                eVar.c = optJSONObject3.optInt("minutes_since_displayed", u);
                eVar.d = optJSONObject3.optInt("limit", 10);
            }
        }
        if (jSONObject.has(i)) {
            eVar.g = jSONObject.optJSONObject(i).optBoolean("enabled");
        }
    }
}