package com.p7700g.p99005;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetworkProbeResult.java */
/* loaded from: classes2.dex */
public class nd1 {
    @x1
    public static final String a = "network interface";
    @x1
    public static final String b = "http certificate";
    @x1
    public static final String c = "captive portal";
    @x1
    public static final String d = "ping command";
    @x1
    public static final String e = "ok";
    @x1
    public static final String f = "invalid";
    @x1
    public static final String g = "timeout";
    @x1
    private final String h;
    @x1
    private final String i;
    @x1
    private final String j;
    private final boolean k;
    private final boolean l;

    public nd1(@x1 String str, @x1 String str2, @x1 String str3, boolean z) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = z;
        this.l = true;
    }

    @x1
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.h);
            if (!this.j.isEmpty()) {
                jSONObject.put("url", this.j);
            }
            jSONObject.put("result", this.i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @x1
    public String b() {
        return this.i;
    }

    @x1
    public String c() {
        return this.h;
    }

    @x1
    public String d() {
        return this.j;
    }

    public boolean e() {
        return this.k;
    }

    public boolean f() {
        return this.l;
    }

    public nd1(@x1 String str, @x1 String str2, @x1 String str3, boolean z, boolean z2) {
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = z;
        this.l = z2;
    }
}