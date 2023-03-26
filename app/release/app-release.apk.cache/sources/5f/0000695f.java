package com.p7700g.p99005;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessage.java */
/* loaded from: classes3.dex */
public class zj3 {
    public static final String a = "messageId";
    @x1
    public String b;

    public zj3(@x1 String str) {
        this.b = str;
    }

    @x1
    public String a() {
        return this.b;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(a, this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}