package com.p7700g.p99005;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageTag.java */
/* loaded from: classes3.dex */
public class rk3 {
    private static final String a = "adds";
    private static final String b = "removes";
    private JSONObject c;
    private JSONArray d;

    public rk3(@x1 JSONObject jSONObject) throws JSONException {
        this.c = jSONObject.has(a) ? jSONObject.getJSONObject(a) : null;
        this.d = jSONObject.has(b) ? jSONObject.getJSONArray(b) : null;
    }

    public JSONObject a() {
        return this.c;
    }

    public JSONArray b() {
        return this.d;
    }

    public void c(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void d(JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.c;
            if (jSONObject2 != null) {
                jSONObject.put(a, jSONObject2);
            }
            JSONArray jSONArray = this.d;
            if (jSONArray != null) {
                jSONObject.put(b, jSONArray);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSInAppMessageTag{adds=");
        G.append(this.c);
        G.append(", removes=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}