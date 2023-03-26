package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConfigPatchUtils.java */
/* loaded from: classes2.dex */
public class ia1 {
    public static void a(la1 la1Var, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            la1Var.w("modules/tranceport/auth_string");
        } else {
            la1Var.p("modules/tranceport/auth_string", str);
        }
        la1Var.p("modules/tranceport/hash", str2);
    }

    public static void b(la1 la1Var, String str) {
        la1Var.p("modules/tranceport/backend/pools/0/ip", str);
    }

    public static void c(la1 la1Var, int i) {
        la1Var.o("modules/tranceport/ssl/server_auth", i);
    }

    public static void d(la1 la1Var, List<String> list, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                JSONArray jSONArray2 = new JSONArray();
                jSONArray2.put(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ips", jSONArray2);
                if (z) {
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put("default");
                    jSONObject.put("sni_tag", jSONArray3);
                }
                JSONArray jSONArray4 = new JSONArray();
                jSONArray4.put(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("servers", jSONArray4);
                jSONArray.put(jSONObject2);
            }
            la1Var.r("sd/routes/default/sections", jSONArray);
        } catch (Throwable unused) {
        }
    }
}