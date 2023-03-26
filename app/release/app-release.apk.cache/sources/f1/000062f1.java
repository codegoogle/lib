package com.p7700g.p99005;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonPatch.java */
/* loaded from: classes.dex */
public class w31 {
    @x1
    public final JSONArray a = new JSONArray();

    public static w31 c() {
        return new w31();
    }

    @x1
    public w31 a(@x1 String str, @x1 String str2, @x1 Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(la1.k, str);
        jSONObject.put("key", str2);
        jSONObject.put("action", la1.d);
        jSONObject.put("value", obj);
        this.a.put(jSONObject);
        return this;
    }

    @x1
    public String b() {
        return this.a.toString();
    }

    @x1
    public w31 d(@x1 String str, @x1 Object obj) throws JSONException {
        JSONArray jSONArray = this.a;
        JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
        jSONObject.put(la1.m, str);
        jSONObject.put(la1.n, obj);
        this.a.put(jSONObject);
        return this;
    }

    @x1
    public w31 e(@x1 String str, @x1 String str2, @x1 JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(la1.k, str);
        jSONObject2.put("key", str2);
        jSONObject2.put("action", la1.c);
        jSONObject2.put("value", jSONObject);
        this.a.put(jSONObject2);
        return this;
    }

    @x1
    public w31 f(@x1 String str, @x1 String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", la1.b);
        jSONObject.put(la1.k, str);
        jSONObject.put("key", str2);
        this.a.put(jSONObject);
        return this;
    }

    @x1
    public w31 g(@x1 String str, @x1 String str2, @x1 Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(la1.k, str);
        jSONObject.put("key", str2);
        jSONObject.put("action", la1.a);
        jSONObject.put("value", obj);
        this.a.put(jSONObject);
        return this;
    }
}