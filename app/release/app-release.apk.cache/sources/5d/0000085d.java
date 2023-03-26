package com.anythink.expressad.foundation.h;

import android.content.Context;
import com.p7700g.p99005.pt0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private static final String n = "portrait";
    private static final String o = "landscape";
    public String a;
    public String b;
    public String d;
    public String e;
    public String f;
    public String g;
    public String j;
    public String k;
    public String l;
    public String m;
    public String c = pt0.a;
    public String h = com.anythink.expressad.foundation.b.a.b().f();
    public String i = com.anythink.expressad.foundation.b.a.b().e();

    public b(Context context) {
        this.j = String.valueOf(s.f(context));
        this.k = String.valueOf(s.e(context));
        this.m = String.valueOf(s.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.l = o;
        } else {
            this.l = n;
        }
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("plantform", this.c);
            jSONObject.put("appkey", this.h);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.u, this.i);
            jSONObject.put("screen_width", this.j);
            jSONObject.put("screen_height", this.k);
            jSONObject.put("orientation", this.l);
            jSONObject.put("scale", this.m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}