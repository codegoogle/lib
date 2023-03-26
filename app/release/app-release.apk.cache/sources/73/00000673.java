package com.anythink.core.common.g;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import com.anythink.core.common.b.m;
import com.anythink.core.common.b.o;
import com.p7700g.p99005.wo1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static final String A = "it_src";
    public static final String B = "lat";
    public static final String C = "lon";
    public static final String D = "inst_wx";
    public static final String E = "gdpr_cs";
    public static final String F = "abtest_id";
    public static final String G = "first_init_time";
    public static final String H = "days_from_first_init";
    public static final String I = "cs_cl";
    public static final String J = "is_ofm";
    public static final String K = "app_id";
    public static final String L = "api_ver";
    public static final String M = "custom";
    public static final String N = "rdid";
    public static final String O = "rc";
    public static final String P = "data";
    public static final String Q = "tcp_tk_da_type";
    public static final String R = "ofl";
    public static final String S = "tcp_rate";
    public static final String T = "p";
    public static final String U = "p2";
    public static final String V = "sign";
    public static final String W = "common";
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;
    public static final String a = "platform";
    public static final String aa = "area_type";
    public static final String ab = "sp_http";
    public static final String ac = "os_fw";
    public static final String ad = "is_test";
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

    public static JSONObject a(int i2) {
        String str;
        com.anythink.core.common.j.d.q(m.a().e());
        JSONObject jSONObject = new JSONObject();
        Context e2 = m.a().e();
        try {
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.anythink.core.common.j.d.e());
            jSONObject.put("os_vc", com.anythink.core.common.j.d.d());
            jSONObject.put("package_name", com.anythink.core.common.j.d.k(e2));
            jSONObject.put("app_vn", com.anythink.core.common.j.d.i(e2));
            jSONObject.put("app_vc", com.anythink.core.common.j.d.h(e2));
            jSONObject.put("brand", com.anythink.core.common.j.d.b());
            jSONObject.put("model", com.anythink.core.common.j.d.a());
            jSONObject.put("screen", com.anythink.core.common.j.d.j(e2));
            jSONObject.put("network_type", com.anythink.core.common.j.d.m(e2));
            jSONObject.put("mnc", com.anythink.core.common.j.d.c(e2));
            jSONObject.put("mcc", com.anythink.core.common.j.d.b(e2));
            jSONObject.put("language", com.anythink.core.common.j.d.f(e2));
            jSONObject.put("timezone", com.anythink.core.common.j.d.c());
            jSONObject.put("sdk_ver", com.anythink.core.common.j.g.a());
            jSONObject.put("gp_ver", com.anythink.core.common.j.d.n(e2));
            jSONObject.put("ua", com.anythink.core.common.j.d.i());
            jSONObject.put("orient", com.anythink.core.common.j.d.g(e2));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(m.a().l())) {
                jSONObject.put("channel", m.a().l());
            }
            if (!TextUtils.isEmpty(m.a().m())) {
                jSONObject.put("sub_channel", m.a().m());
            }
            jSONObject.put("upid", o.a(e2).b() ? m.a().v() : "");
            jSONObject.put("ps_id", m.a().p());
            com.anythink.core.c.a b2 = com.anythink.core.c.b.a(e2).b(m.a().n());
            if (b2 != null) {
                jSONObject.put(F, TextUtils.isEmpty(b2.s()) ? "" : b2.s());
            }
            jSONObject.put(G, m.a().f());
            jSONObject.put(H, m.a().g());
            StringBuilder sb = new StringBuilder();
            sb.append(m.a().c());
            sb.append(o.a(e2).a());
            jSONObject.put(E, sb.toString());
            if (m.a().h() == 1) {
                jSONObject.put(J, 1);
            }
            jSONObject.put(N, m.a().G() ? com.anythink.core.common.b.i.a().a(b2) : "");
            if (m.a().A()) {
                str = m.a().B() ? "1" : "3";
            } else {
                str = m.a().B() ? "2" : "4";
            }
            jSONObject.put(ab, str);
            IExHandler b3 = m.a().b();
            if (b3 != null) {
                b3.fillRequestDeviceData(jSONObject, i2);
            }
            String j2 = com.anythink.core.common.j.d.j();
            if (!TextUtils.isEmpty(j2)) {
                jSONObject.put(ac, Integer.parseInt(j2));
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject a() {
        String x2;
        Context e2 = m.a().e();
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
        jSONObject.put("android_id", z2 ? com.anythink.core.common.j.d.d(e2) : "");
        jSONObject.put("gaid", com.anythink.core.common.j.d.f());
        IExHandler b2 = m.a().b();
        if (b2 != null) {
            b2.fillRequestData(jSONObject, l0);
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String l2 = com.anythink.core.common.j.d.l(e2);
        Location q2 = m.a().q();
        if (q2 != null) {
            jSONObject.put("lat", q2.getLatitude());
            jSONObject.put(C, q2.getLongitude());
        }
        String r2 = m.a().r();
        if (!TextUtils.isEmpty(r2)) {
            jSONObject.put(D, Integer.parseInt(r2));
        }
        jSONObject.put("it_src", TextUtils.isEmpty(l2) ? "" : l2);
        jSONObject.put(aa, m.a().D());
        return jSONObject;
    }
}