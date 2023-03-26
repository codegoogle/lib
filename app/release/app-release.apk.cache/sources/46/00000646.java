package com.anythink.core.common.e;

import com.anythink.expressad.foundation.c.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h extends p {
    public String A;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    @Override // com.anythink.core.common.e.p
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.a);
            jSONObject.put("requestid", this.b);
            jSONObject.put(d.a.c, this.d);
            jSONObject.put(com.anythink.core.common.b.e.c, this.e);
            jSONObject.put("sessionid", this.f);
            jSONObject.put("groupid", this.g);
            jSONObject.put("unitgroupid", this.h);
            jSONObject.put("timestamp", this.i);
            jSONObject.put("asid", this.j);
            jSONObject.put("refresh", this.k);
            jSONObject.put("traffic_group_id", this.l);
            jSONObject.put("msg", this.m);
            jSONObject.put("msg1", this.n);
            jSONObject.put("msg2", this.o);
            jSONObject.put("msg3", this.p);
            jSONObject.put("msg4", this.q);
            jSONObject.put("msg5", this.r);
            jSONObject.put("msg6", this.s);
            jSONObject.put("msg7", this.t);
            jSONObject.put("msg8", this.u);
            jSONObject.put("msg9", this.v);
            jSONObject.put("msg10", this.w);
            jSONObject.put("msg11", this.x);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}