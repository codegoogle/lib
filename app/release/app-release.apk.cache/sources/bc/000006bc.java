package com.anythink.core.common.j;

import android.text.TextUtils;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.af;
import com.p7700g.p99005.wo1;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m {
    public static final String a = "anythink_bidding";

    public static void a(String str, com.anythink.core.common.e.e eVar, String str2, af afVar, int i, int i2) {
        a(str, eVar, str2, afVar, i, i2, null);
    }

    private static void b(String str, String str2) {
        a(str, str2, false);
    }

    public static void a(String str, com.anythink.core.common.e.e eVar, String str2, af afVar, int i, int i2, List<String> list) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reason", str2);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.v, str);
                jSONObject.put("adtype", eVar.V());
                jSONObject.put("adsourceId", afVar.t());
                jSONObject.put("networkFirmId", afVar.c());
                jSONObject.put("content", eVar.F());
                jSONObject.put("hourly_frequency", i);
                jSONObject.put("hourly_limit", afVar.f());
                jSONObject.put("daily_frequency", i2);
                jSONObject.put("daily_limit", afVar.e());
                jSONObject.put("pacing_limit", afVar.s());
                jSONObject.put("request_fail_interval", afVar.H());
                jSONObject.put("filter_source_ids", list != null ? list : "");
                a("anythink_network", jSONObject.toString(), true);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2, String str3, af afVar) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", g.i.u);
                jSONObject.put("result", str);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("adsourceId", afVar.t());
                jSONObject.put("networkFirmId", afVar.c());
                jSONObject.put("content", afVar.g());
                jSONObject.put("msg", afVar.z());
                a(a, jSONObject.toString(), TextUtils.equals(g.i.g, str));
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(String str, String str2, String str3, String str4) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", g.i.v);
                jSONObject.put("result", str);
                jSONObject.put(com.anythink.expressad.videocommon.e.b.v, str2);
                jSONObject.put("adtype", str3);
                jSONObject.put("errorMsg", str4);
                a("anythink_network", jSONObject.toString(), TextUtils.equals(g.i.g, str));
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, String str2) {
        if (ATSDK.isNetworkLogDebug()) {
            a("anythink_".concat(String.valueOf(str)), str2, false);
        }
    }

    public static void a(String str, String str2, boolean z) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith("[")) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String str3 = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str4 : str2.split(property)) {
            str3 = wo1.u(wo1.t(str3, "\n"), "║ ", str4);
        }
        String t = wo1.t(str3, "\n╚═══════════════════════════════════════════════════════════════════════════════════════");
        if (z) {
            com.anythink.core.common.b.m.a().t();
            " \n".concat(String.valueOf(t));
            return;
        }
        com.anythink.core.common.b.m.a().t();
        " \n".concat(String.valueOf(t));
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        if (ATSDK.isNetworkLogDebug()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.videocommon.e.b.v, str);
                jSONObject.put("adtype", str2);
                jSONObject.put("api", str3);
                jSONObject.put("result", str4);
                jSONObject.put("reason", str5);
                com.anythink.core.common.b.m.a().t();
                jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
    }
}