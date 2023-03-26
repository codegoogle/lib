package com.ironsource.sdk.c;

import com.p7700g.p99005.rs2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d {
    public static final String a = "d";
    private static d c;
    public Map<String, e> b = Collections.synchronizedMap(new HashMap());

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (c == null) {
                c = new d();
            }
            dVar = c;
        }
        return dVar;
    }

    public static String a(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    public static boolean b(JSONObject jSONObject) {
        try {
            return jSONObject.getBoolean("shouldCreateContainer");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static com.ironsource.sdk.a d(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("adSize"));
            String obj = jSONObject2.get("height").toString();
            String obj2 = jSONObject2.get("width").toString();
            return new com.ironsource.sdk.a(Integer.parseInt(obj2), Integer.parseInt(obj), jSONObject2.get(rs2.f.d).toString());
        } catch (Exception unused) {
            return new com.ironsource.sdk.a();
        }
    }

    public final e a(String str) {
        if (str.isEmpty() || !this.b.containsKey(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public com.ironsource.sdk.a c(JSONObject jSONObject) {
        com.ironsource.sdk.a aVar = new com.ironsource.sdk.a();
        try {
            return d(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }
}