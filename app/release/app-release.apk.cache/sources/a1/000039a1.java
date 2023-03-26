package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.p7700g.p99005.av2;
import com.p7700g.p99005.bv2;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class au2 {
    public static boolean A(@x1 Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }

    public static boolean B(@x1 Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return C(intent.getExtras());
    }

    public static boolean C(@x1 Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString(rs2.a.b));
    }

    public static boolean a() {
        Context l;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            pn2.n();
            l = pn2.n().l();
            sharedPreferences = l.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = l.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(l.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static av2 b(av2.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        av2.a q = av2.q();
        q.p(p(extras));
        q.g(bVar);
        q.h(f(extras));
        q.k(m());
        q.n(av2.d.ANDROID);
        q.j(k(extras));
        String h = h(extras);
        if (h != null) {
            q.i(h);
        }
        String o = o(extras);
        if (o != null) {
            q.o(o);
        }
        String c = c(extras);
        if (c != null) {
            q.e(c);
        }
        String i = i(extras);
        if (i != null) {
            q.b(i);
        }
        String e = e(extras);
        if (e != null) {
            q.f(e);
        }
        long n = n(extras);
        if (n > 0) {
            q.m(n);
        }
        return q.a();
    }

    @z1
    public static String c(Bundle bundle) {
        return bundle.getString(rs2.d.e);
    }

    @z1
    public static String d(Bundle bundle) {
        return bundle.getString(rs2.a.c);
    }

    @z1
    public static String e(Bundle bundle) {
        return bundle.getString(rs2.a.d);
    }

    @x1
    public static String f(Bundle bundle) {
        String string = bundle.getString(rs2.d.g);
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) Tasks.await(or2.p(pn2.n()).getId());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return string;
    }

    @z1
    public static String g(Bundle bundle) {
        return bundle.getString(rs2.a.j);
    }

    @z1
    public static String h(Bundle bundle) {
        String string = bundle.getString(rs2.d.h);
        return string == null ? bundle.getString("message_id") : string;
    }

    @z1
    public static String i(Bundle bundle) {
        return bundle.getString(rs2.a.i);
    }

    @z1
    public static String j(Bundle bundle) {
        return bundle.getString(rs2.a.e);
    }

    @x1
    public static av2.c k(Bundle bundle) {
        if (bundle != null && cu2.v(bundle)) {
            return av2.c.DISPLAY_NOTIFICATION;
        }
        return av2.c.DATA_MESSAGE;
    }

    @x1
    public static String l(Bundle bundle) {
        return true != cu2.v(bundle) ? "data" : rs2.f.a.v0;
    }

    @x1
    public static String m() {
        return pn2.n().l().getPackageName();
    }

    @z1
    public static long n(Bundle bundle) {
        if (bundle.containsKey(rs2.d.p)) {
            try {
                return Long.parseLong(bundle.getString(rs2.d.p));
            } catch (NumberFormatException unused) {
            }
        }
        pn2 n = pn2.n();
        String m = n.q().m();
        if (m != null) {
            try {
                return Long.parseLong(m);
            } catch (NumberFormatException unused2) {
            }
        }
        String j = n.q().j();
        try {
            if (!j.startsWith("1:")) {
                return Long.parseLong(j);
            }
            String[] split = j.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    @z1
    public static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    @x1
    public static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String.valueOf(obj).length();
                return 0;
            }
        }
        return 0;
    }

    @z1
    public static String q(Bundle bundle) {
        if (bundle.containsKey(rs2.a.f)) {
            return bundle.getString(rs2.a.f);
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return FirebaseMessagingService.x.equals(intent.getAction());
    }

    public static void s(@x1 Intent intent) {
        x(rs2.f.o, intent.getExtras());
    }

    public static void t(@x1 Intent intent) {
        x(rs2.f.p, intent.getExtras());
    }

    public static void u(@x1 Bundle bundle) {
        z(bundle);
        x(rs2.f.n, bundle);
    }

    public static void v(@x1 Intent intent) {
        if (B(intent)) {
            x(rs2.f.m, intent.getExtras());
        }
        if (A(intent)) {
            w(av2.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m());
        }
    }

    private static void w(av2.b bVar, Intent intent, @z1 h32 h32Var) {
        av2 b;
        if (h32Var == null || (b = b(bVar, intent)) == null) {
            return;
        }
        try {
            g32 b2 = h32Var.b(rs2.b.a, bv2.class, b32.b("proto"), zt2.a);
            bv2.a d = bv2.d();
            d.b(b);
            b2.a(c32.g(d.a()));
        } catch (RuntimeException unused) {
        }
    }

    @r2
    public static void x(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle();
        String d = d(bundle);
        if (d != null) {
            bundle2.putString("_nmid", d);
        }
        String e = e(bundle);
        if (e != null) {
            bundle2.putString(rs2.f.g, e);
        }
        String i = i(bundle);
        if (!TextUtils.isEmpty(i)) {
            bundle2.putString(rs2.f.d, i);
        }
        String g = g(bundle);
        if (!TextUtils.isEmpty(g)) {
            bundle2.putString(rs2.f.j, g);
        }
        String o = o(bundle);
        if (o != null) {
            bundle2.putString(rs2.f.e, o);
        }
        String j = j(bundle);
        if (j != null) {
            try {
                bundle2.putInt(rs2.f.h, Integer.parseInt(j));
            } catch (NumberFormatException unused) {
            }
        }
        String q = q(bundle);
        if (q != null) {
            try {
                bundle2.putInt(rs2.f.i, Integer.parseInt(q));
            } catch (NumberFormatException unused2) {
            }
        }
        String l = l(bundle);
        if (rs2.f.m.equals(str) || rs2.f.p.equals(str)) {
            bundle2.putString(rs2.f.k, l);
        }
        if (Log.isLoggable(rs2.a, 3)) {
            String valueOf = String.valueOf(bundle2);
            str.length();
            valueOf.length();
        }
        yn2 yn2Var = (yn2) pn2.n().j(yn2.class);
        if (yn2Var != null) {
            yn2Var.c(rs2.f.a, str, bundle2);
        }
    }

    public static void y(boolean z) {
        pn2.n().l().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    private static void z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString(rs2.a.g))) {
            yn2 yn2Var = (yn2) pn2.n().j(yn2.class);
            Log.isLoggable(rs2.a, 3);
            if (yn2Var != null) {
                String string = bundle.getString(rs2.a.c);
                yn2Var.f(rs2.f.a, rs2.f.q, string);
                Bundle bundle2 = new Bundle();
                bundle2.putString(rs2.f.b, "Firebase");
                bundle2.putString(rs2.f.c, qm3.b.a);
                bundle2.putString(rs2.f.f, string);
                yn2Var.c(rs2.f.a, rs2.f.l, bundle2);
                return;
            }
            return;
        }
        if (Log.isLoggable(rs2.a, 3)) {
        }
    }
}