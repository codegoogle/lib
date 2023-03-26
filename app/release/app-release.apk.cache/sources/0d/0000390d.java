package com.p7700g.p99005;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ImmutableJSONObject.java */
/* loaded from: classes3.dex */
public class aj3 {
    private final JSONObject a;

    public aj3() {
        this.a = new JSONObject();
    }

    public long a(String str) throws JSONException {
        return this.a.getLong(str);
    }

    public boolean b(String str) {
        return this.a.has(str);
    }

    public Object c(String str) {
        return this.a.opt(str);
    }

    public boolean d(String str) {
        return this.a.optBoolean(str);
    }

    public boolean e(String str, boolean z) {
        return this.a.optBoolean(str, z);
    }

    public int f(String str) {
        return this.a.optInt(str);
    }

    public int g(String str, int i) {
        return this.a.optInt(str, i);
    }

    public JSONObject h(String str) {
        return this.a.optJSONObject(str);
    }

    public long i(String str) {
        return this.a.optLong(str);
    }

    public String j(String str) {
        return this.a.optString(str);
    }

    public String k(String str, String str2) {
        return this.a.optString(str, str2);
    }

    public String toString() {
        StringBuilder G = wo1.G("ImmutableJSONObject{jsonObject=");
        G.append(this.a);
        G.append('}');
        return G.toString();
    }

    public aj3(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}