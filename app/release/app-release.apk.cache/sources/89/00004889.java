package com.p7700g.p99005;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.onesignal.OSNotificationWorkManager;
import com.onesignal.OSReceiveReceiptController;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.yk3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor.java */
/* loaded from: classes3.dex */
public class ij3 {
    public static final String a = "a";
    public static final String b = "o";
    public static final String c = "i";
    public static final String d = "n";
    public static final String e = "p";
    private static final String f = "android_notif_id";
    public static final String g = "os_in_app_message_preview_id";
    public static final String h = "__DEFAULT__";

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public class a implements yk3.f {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        public a(boolean z, JSONObject jSONObject, Context context, int i, String str, long j) {
            this.a = z;
            this.b = jSONObject;
            this.c = context;
            this.d = i;
            this.e = str;
            this.f = j;
        }

        @Override // com.p7700g.p99005.yk3.f
        public void a(boolean z) {
            if (this.a || !z) {
                OSNotificationWorkManager.b(this.c, zk3.b(this.b), this.d, this.e, this.f, this.a, false);
                if (this.a) {
                    OSUtils.Y(100);
                }
            }
        }
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public class b implements d {
        public final /* synthetic */ f a;
        public final /* synthetic */ e b;

        public b(f fVar, e eVar) {
            this.a = fVar;
            this.b = eVar;
        }

        @Override // com.p7700g.p99005.ij3.d
        public void a(boolean z) {
            if (!z) {
                this.a.d(true);
            }
            this.b.a(this.a);
        }
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public class c implements yk3.f {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Bundle c;
        public final /* synthetic */ d d;
        public final /* synthetic */ JSONObject e;
        public final /* synthetic */ long f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ f h;

        public c(boolean z, Context context, Bundle bundle, d dVar, JSONObject jSONObject, long j, boolean z2, f fVar) {
            this.a = z;
            this.b = context;
            this.c = bundle;
            this.d = dVar;
            this.e = jSONObject;
            this.f = j;
            this.g = z2;
            this.h = fVar;
        }

        @Override // com.p7700g.p99005.yk3.f
        public void a(boolean z) {
            if (!this.a && z) {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                StringBuilder G = wo1.G("startNotificationProcessing returning, with context: ");
                G.append(this.b);
                G.append(" and bundle: ");
                G.append(this.c);
                jm3.a(u0Var, G.toString());
                this.d.a(false);
                return;
            }
            OSNotificationWorkManager.b(this.b, zk3.b(this.e), this.c.containsKey(ij3.f) ? this.c.getInt(ij3.f) : 0, this.e.toString(), this.f, this.a, this.g);
            this.h.g(true);
            this.d.a(true);
        }
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public interface d {
        void a(boolean z);
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public interface e {
        void a(@z1 f fVar);
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes3.dex */
    public static class f {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;

        public boolean a() {
            return this.b;
        }

        public boolean b() {
            return this.d;
        }

        public boolean c() {
            return !this.a || this.b || this.c || this.d;
        }

        public void d(boolean z) {
            this.b = z;
        }

        public void e(boolean z) {
            this.c = z;
        }

        public void f(boolean z) {
            this.a = z;
        }

        public void g(boolean z) {
            this.d = z;
        }
    }

    @x1
    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e2) {
                jm3.u0 u0Var = jm3.u0.ERROR;
                jm3.b(u0Var, "bundleAsJSONObject error for key: " + str, e2);
            }
        }
        return jSONObject;
    }

    public static JSONObject b(JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.optString("custom"));
    }

    public static boolean c(Bundle bundle) {
        return d(bundle, "licon") || d(bundle, "bicon") || bundle.getString("bg_img", null) != null;
    }

    private static boolean d(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        return trim.startsWith("http://") || trim.startsWith("https://");
    }

    public static void e(al3 al3Var) {
        if (al3Var.q()) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            StringBuilder G = wo1.G("Marking restored or disabled notifications as dismissed: ");
            G.append(al3Var.toString());
            jm3.a(u0Var, G.toString());
            rm3 k = rm3.k(al3Var.e());
            ContentValues contentValues = new ContentValues();
            contentValues.put(qm3.b.h, (Integer) 1);
            k.a(qm3.b.a, contentValues, "android_notification_id = " + al3Var.b(), null);
            ki3.c(k, al3Var.e());
        }
    }

    private static void f(Bundle bundle) {
        JSONObject jSONObject;
        String str;
        if (bundle.containsKey(b)) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString(b));
                bundle.remove(b);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    String string = jSONObject3.getString("n");
                    jSONObject3.remove("n");
                    if (jSONObject3.has("i")) {
                        str = jSONObject3.getString("i");
                        jSONObject3.remove("i");
                    } else {
                        str = string;
                    }
                    jSONObject3.put("id", str);
                    jSONObject3.put("text", string);
                    if (jSONObject3.has("p")) {
                        jSONObject3.put("icon", jSONObject3.getString("p"));
                        jSONObject3.remove("p");
                    }
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put(ui3.c, h);
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @x1
    public static JSONArray g(JSONObject jSONObject) {
        return new JSONArray().put(jSONObject);
    }

    public static void h(Context context, Bundle bundle, e eVar) {
        f fVar = new f();
        if (!zk3.d(bundle)) {
            eVar.a(fVar);
            return;
        }
        fVar.f(true);
        f(bundle);
        if (mk3.c(context, bundle)) {
            fVar.e(true);
            eVar.a(fVar);
            return;
        }
        q(context, bundle, fVar, new b(fVar, eVar));
    }

    private static void i(al3 al3Var) {
        if (al3Var.r() || !al3Var.f().has(rs2.d.e) || "do_not_collapse".equals(al3Var.f().optString(rs2.d.e))) {
            return;
        }
        Cursor d2 = rm3.k(al3Var.e()).d(qm3.b.a, new String[]{qm3.b.c}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{al3Var.f().optString(rs2.d.e)}, null, null, null);
        if (d2.moveToFirst()) {
            al3Var.g().K(d2.getInt(d2.getColumnIndex(qm3.b.c)));
        }
        d2.close();
    }

    public static void j(Context context, mi3 mi3Var) {
        jm3.q1(context);
        try {
            String k = mi3Var.k("json_payload");
            if (k == null) {
                jm3.u0 u0Var = jm3.u0.ERROR;
                jm3.a(u0Var, "json_payload key is nonexistent from mBundle passed to ProcessFromFCMIntentService: " + mi3Var);
                return;
            }
            JSONObject jSONObject = new JSONObject(k);
            jm3.I1(context, jSONObject, new a(mi3Var.a("is_restoring", false), jSONObject, context, mi3Var.l(f) ? mi3Var.j(f).intValue() : 0, k, mi3Var.f("timestamp").longValue()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @s2
    public static int k(xk3 xk3Var, boolean z) {
        return l(xk3Var, false, z);
    }

    @s2
    private static int l(xk3 xk3Var, boolean z, boolean z2) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "Starting processJobForDisplay opened: " + z + " fromBackgroundLogic: " + z2);
        al3 b2 = xk3Var.b();
        i(b2);
        int intValue = b2.b().intValue();
        boolean z3 = false;
        if (p(b2)) {
            b2.t(true);
            if (z2 && jm3.r3(b2)) {
                xk3Var.i(false);
                jm3.Y(xk3Var);
                return intValue;
            }
            z3 = ui3.p(b2);
        }
        if (!b2.r()) {
            n(b2, z, z3);
            OSNotificationWorkManager.c(zk3.b(xk3Var.b().f()));
            jm3.j1(b2);
        }
        return intValue;
    }

    @s2
    public static int m(al3 al3Var, boolean z) {
        return l(new xk3(al3Var, al3Var.r(), true), false, z);
    }

    public static void n(al3 al3Var, boolean z, boolean z2) {
        o(al3Var, z);
        if (!z2) {
            e(al3Var);
            return;
        }
        String c2 = al3Var.c();
        OSReceiveReceiptController.c().a(al3Var.e(), c2);
        jm3.R0().l(c2);
    }

    private static void o(al3 al3Var, boolean z) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("Saving Notification job: ");
        G.append(al3Var.toString());
        jm3.a(u0Var, G.toString());
        Context e2 = al3Var.e();
        JSONObject f2 = al3Var.f();
        try {
            JSONObject b2 = b(al3Var.f());
            rm3 k = rm3.k(al3Var.e());
            int i = 1;
            if (al3Var.q()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(qm3.b.h, (Integer) 1);
                k.a(qm3.b.a, contentValues, "android_notification_id = " + al3Var.b(), null);
                ki3.c(k, e2);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("notification_id", b2.optString("i"));
            if (f2.has("grp")) {
                contentValues2.put(qm3.b.d, f2.optString("grp"));
            }
            if (f2.has(rs2.d.e) && !"do_not_collapse".equals(f2.optString(rs2.d.e))) {
                contentValues2.put(qm3.b.e, f2.optString(rs2.d.e));
            }
            if (!z) {
                i = 0;
            }
            contentValues2.put(qm3.b.g, Integer.valueOf(i));
            if (!z) {
                contentValues2.put(qm3.b.c, al3Var.b());
            }
            if (al3Var.o() != null) {
                contentValues2.put("title", al3Var.o().toString());
            }
            if (al3Var.d() != null) {
                contentValues2.put(qm3.b.j, al3Var.d().toString());
            }
            contentValues2.put("expire_time", Long.valueOf((f2.optLong("google.sent_time", jm3.X0().b()) / 1000) + f2.optInt("google.ttl", 259200)));
            contentValues2.put(qm3.b.m, f2.toString());
            k.e(qm3.b.a, null, contentValues2);
            jm3.a(u0Var, "Notification saved values: " + contentValues2.toString());
            if (z) {
                return;
            }
            ki3.c(k, e2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    private static boolean p(al3 al3Var) {
        return al3Var.p() || OSUtils.J(al3Var.f().optString("alert"));
    }

    private static void q(Context context, Bundle bundle, f fVar, d dVar) {
        JSONObject a2 = a(bundle);
        jm3.I1(context, a2, new c(bundle.getBoolean("is_restoring", false), context, bundle, dVar, a2, jm3.X0().b() / 1000, Integer.parseInt(bundle.getString("pri", "0")) > 9, fVar));
    }
}