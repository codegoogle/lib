package com.p7700g.p99005;

import org.json.JSONObject;

/* compiled from: OSNotificationAction.java */
/* loaded from: classes3.dex */
public class wk3 {
    private final a a;
    private final String b;

    /* compiled from: OSNotificationAction.java */
    /* loaded from: classes3.dex */
    public enum a {
        Opened,
        ActionTaken
    }

    public wk3(a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public a b() {
        return this.a;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.a.ordinal());
            jSONObject.put(ui3.c, this.b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}