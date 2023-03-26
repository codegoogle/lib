package com.anythink.expressad.advanced.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.d;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.s;
import com.microsoft.appcenter.ingestion.models.AbstractLog;
import com.p7700g.p99005.pt0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public String d;
    public String e;
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
    public String c = pt0.a;
    public String a = j.b();
    public String b = j.c();
    public String f = d.f();

    public b(Context context) {
        String str;
        this.e = d.d(context);
        int a = j.a();
        this.h = String.valueOf(a);
        this.i = j.a(context, a);
        this.j = d.i();
        this.k = com.anythink.expressad.foundation.b.a.b().f();
        this.l = com.anythink.expressad.foundation.b.a.b().e();
        this.m = String.valueOf(s.f(context));
        this.n = String.valueOf(s.e(context));
        this.p = String.valueOf(s.c(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.o = "landscape";
        } else {
            this.o = "portrait";
        }
        IExHandler b = m.a().b();
        if (b != null) {
            str = b.fillCDataParam("at_device1|||at_device2|||at_device3");
            str.replace("at_device1", "").replace("at_device2", "").replace("at_device3", "");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            this.d = "";
            this.g = "";
            return;
        }
        String[] split = str.split("\\|\\|\\|");
        try {
            this.d = split[0];
        } catch (Throwable unused) {
        }
        try {
            this.g = split[2];
        } catch (Throwable unused2) {
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractLog.DEVICE, this.a);
            jSONObject.put("system_version", this.b);
            jSONObject.put("network_type", this.h);
            jSONObject.put("network_type_str", this.i);
            jSONObject.put("device_ua", this.j);
            jSONObject.put("plantform", this.c);
            jSONObject.put("device_imei", this.d);
            jSONObject.put("android_id", this.e);
            jSONObject.put("google_ad_id", this.f);
            jSONObject.put("oaid", this.g);
            jSONObject.put("appkey", this.k);
            jSONObject.put(com.anythink.expressad.videocommon.e.b.u, this.l);
            jSONObject.put("screen_width", this.m);
            jSONObject.put("screen_height", this.n);
            jSONObject.put("orientation", this.o);
            jSONObject.put("scale", this.p);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}