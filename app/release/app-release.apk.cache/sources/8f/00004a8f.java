package com.p7700g.p99005;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageOutcome.java */
/* loaded from: classes3.dex */
public class jk3 {
    private static final String a = "name";
    private static final String b = "weight";
    private static final String c = "unique";
    private String d;
    private float e;
    private boolean f;

    public jk3(@x1 JSONObject jSONObject) throws JSONException {
        this.d = jSONObject.getString("name");
        this.e = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.f = jSONObject.has(c) && jSONObject.getBoolean(c);
    }

    public String a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }

    public boolean c() {
        return this.f;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(boolean z) {
        this.f = z;
    }

    public void f(float f) {
        this.e = f;
    }

    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.d);
            jSONObject.put("weight", this.e);
            jSONObject.put(c, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSInAppMessageOutcome{name='");
        wo1.d0(G, this.d, '\'', ", weight=");
        G.append(this.e);
        G.append(", unique=");
        G.append(this.f);
        G.append('}');
        return G.toString();
    }
}