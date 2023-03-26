package com.anythink.core.common.j;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {
    public static final String A = "it_src";
    public static final String a = "platform";
    public static final String b = "os_vn";
    public static final String c = "os_vc";
    public static final String d = "package_name";
    public static final String e = "app_vn";
    public static final String f = "app_vc";
    public static final String g = "brand";
    public static final String h = "model";
    public static final String i = "screen";
    public static final String j = "network_type";
    public static final String k = "mnc";
    public static final String l = "mcc";
    public static final String m = "language";
    public static final String n = "timezone";
    public static final String o = "sdk_ver";
    public static final String p = "gp_ver";
    public static final String q = "nw_ver";
    public static final String r = "ua";
    public static final String s = "orient";
    public static final String t = "system";
    public static final String u = "android_id";
    public static final String v = "gaid";
    public static final String w = "channel";
    public static final String x = "sub_channel";
    public static final String y = "upid";
    public static final String z = "ps_id";

    public static JSONObject a() {
        JSONObject b2 = b();
        JSONObject c2 = c();
        try {
            b2.put("app_id", com.anythink.core.common.b.m.a().n());
            Iterator<String> keys = c2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                b2.put(next, c2.opt(next));
            }
        } catch (JSONException unused) {
        }
        return b2;
    }

    private static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Context e2 = com.anythink.core.common.b.m.a().e();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", d.e());
            jSONObject.put("os_vc", d.d());
            jSONObject.put("package_name", d.k(e2));
            jSONObject.put("app_vn", d.i(e2));
            jSONObject.put("app_vc", d.h(e2));
            jSONObject.put("brand", d.b());
            jSONObject.put("model", d.a());
            jSONObject.put("screen", d.j(e2));
            jSONObject.put("network_type", String.valueOf(d.m(e2)));
            jSONObject.put("mnc", d.c(e2));
            jSONObject.put("mcc", d.b(e2));
            jSONObject.put("language", d.f(e2));
            jSONObject.put("timezone", d.c());
            jSONObject.put("sdk_ver", g.a());
            jSONObject.put("gp_ver", d.n(e2));
            jSONObject.put("ua", d.i());
            jSONObject.put("orient", d.g(e2));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.anythink.core.common.b.m.a().l())) {
                jSONObject.put("channel", com.anythink.core.common.b.m.a().l());
            }
            if (!TextUtils.isEmpty(com.anythink.core.common.b.m.a().m())) {
                jSONObject.put("sub_channel", com.anythink.core.common.b.m.a().m());
            }
            jSONObject.put("upid", com.anythink.core.common.b.m.a().v());
            jSONObject.put("ps_id", com.anythink.core.common.b.m.a().p());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONObject c() {
        String x2;
        Context e2 = com.anythink.core.common.b.m.a().e();
        JSONObject jSONObject = new JSONObject();
        com.anythink.core.c.a l0 = wo1.l0(com.anythink.core.c.b.a(e2));
        if (l0 != null) {
            try {
                x2 = l0.x();
            } catch (Exception unused) {
            }
        } else {
            x2 = "";
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(x2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(x2);
                if (!jSONObject2.isNull("a")) {
                    if (jSONObject2.optInt("a") != 1) {
                        z2 = false;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z2 ? d.d(e2) : "");
        jSONObject.put("gaid", d.f());
        IExHandler b2 = com.anythink.core.common.b.m.a().b();
        if (b2 != null) {
            b2.fillRequestData(jSONObject, l0);
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String l2 = d.l(e2);
        jSONObject.put("it_src", TextUtils.isEmpty(l2) ? "" : l2);
        return jSONObject;
    }
}