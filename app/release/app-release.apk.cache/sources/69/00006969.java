package com.p7700g.p99005;

import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.jm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSNotificationFormatHelper.java */
/* loaded from: classes3.dex */
public class zk3 {
    public static final String a = "custom";
    public static final String b = "i";

    @z1
    private static String a(@z1 Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", null);
            if (string != null) {
                return c(string);
            }
            jm3.a(jm3.u0.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    @z1
    public static String b(@z1 JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return c(jSONObject.optString("custom", null));
    }

    @z1
    private static String c(@z1 String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jm3.a(jm3.u0.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
        if (jSONObject.has("i")) {
            return jSONObject.optString("i", null);
        }
        jm3.a(jm3.u0.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
        return null;
    }

    public static boolean d(@z1 Bundle bundle) {
        return a(bundle) != null;
    }

    public static boolean e(@z1 Intent intent) {
        if (intent == null) {
            return false;
        }
        return d(intent.getExtras());
    }
}