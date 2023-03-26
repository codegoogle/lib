package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class mu2 {
    public final SharedPreferences a;
    public final Context b;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static class a {
        private static final long a = TimeUnit.DAYS.toMillis(7);
        public final String b;
        public final String c;
        public final long d;

        private a(String str, String str2, long j) {
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        public static String a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String.valueOf(e).length();
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    String.valueOf(e).length();
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.d + a || !str.equals(this.c);
        }
    }

    public mu2(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    private void a(String str) {
        File file = new File(gh.m(this.b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            c();
        } catch (IOException e) {
            if (Log.isLoggable(rs2.a, 3)) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Error creating file in no backup dir: ".concat(valueOf);
                } else {
                    new String("Error creating file in no backup dir: ");
                }
            }
        }
    }

    private String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public synchronized void c() {
        this.a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b = b(str, str2);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(b);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a2 = a.a(str3, str4, System.currentTimeMillis());
        if (a2 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(b(str, str2), a2);
        edit.commit();
    }
}