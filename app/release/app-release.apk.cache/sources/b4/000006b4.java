package com.anythink.core.common.j;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.af;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {

    /* loaded from: classes2.dex */
    public static class a {
        public static final String a = "com.android.vending";
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 128 && Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str);
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 128 && Pattern.matches("^([.A-Za-z0-9_-]){1,128}$", str);
    }

    public static boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.length() == 14 && Pattern.matches("^[A-Za-z0-9]+$", str);
    }

    public static String d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 3;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return g.C0044g.a;
            case 1:
                return g.C0044g.b;
            case 2:
                return "Banner";
            case 3:
                return "Interstitial";
            case 4:
                return g.C0044g.e;
            default:
                return "";
        }
    }

    public static String a(String str, String str2, long j) {
        return str + "_" + str2 + "_" + j;
    }

    public static String b(String str, String str2, long j) {
        return a(str, str2, j) + "_refresh";
    }

    public static JSONObject a(Context context, String str, String str2, int i, int i2) {
        ab abVar;
        int i3;
        int i4;
        Map<String, ab> a2 = com.anythink.core.a.a.a(context).a(i);
        if (a2 != null) {
            i3 = 0;
            i4 = 0;
            for (ab abVar2 : a2.values()) {
                i3 += abVar2.c;
                i4 += abVar2.d;
            }
            abVar = a2.get(str2);
        } else {
            abVar = null;
            i3 = 0;
            i4 = 0;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put(com.anythink.expressad.foundation.d.d.h, i3);
            jSONObject.put("ahs", i4);
            jSONObject.put("pds", abVar != null ? abVar.c : 0);
            jSONObject.put("phs", abVar != null ? abVar.d : 0);
            jSONObject.put("ap", i2);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String b(Context context) {
        String v = com.anythink.core.common.b.m.a().v();
        if (TextUtils.isEmpty(v)) {
            v = d.d(context) + d.f();
        }
        StringBuilder G = wo1.G(v);
        G.append(UUID.randomUUID().toString());
        return f.a(G.toString());
    }

    public static boolean b() {
        try {
            Map<String, Object> k = com.anythink.core.common.b.m.a().k();
            if (k == null || !k.containsKey("age")) {
                return false;
            }
            return Integer.parseInt(k.get("age").toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Context context) {
        String v = com.anythink.core.common.b.m.a().v();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d.d(context));
        stringBuffer.append("&");
        stringBuffer.append(d.f());
        stringBuffer.append("&");
        stringBuffer.append(v);
        stringBuffer.append("&");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&");
        stringBuffer.append(new Random().nextInt(10000));
        return f.a(stringBuffer.toString());
    }

    public static void a(List<af> list, af afVar, boolean z) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (z) {
            if (afVar.a() == -1 || size == 0) {
                list.add(afVar);
                return;
            }
        } else if (size == 0) {
            list.add(afVar);
            return;
        }
        int i = size - 1;
        for (int i2 = 0; i2 < size; i2++) {
            af afVar2 = list.get(i2);
            boolean z2 = true;
            if (z && afVar2.a() == -1) {
                list.add(i2, afVar);
            } else if (a(afVar) >= a(afVar2)) {
                list.add(i2, afVar);
            } else if (i2 == i) {
                list.add(afVar);
            } else {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
    }

    private static boolean a(List<af> list, af afVar, af afVar2, int i, int i2, boolean z) {
        if (z && afVar.a() == -1) {
            list.add(i, afVar2);
            return true;
        } else if (a(afVar2) >= a(afVar)) {
            list.add(i, afVar2);
            return true;
        } else if (i == i2) {
            list.add(afVar2);
            return true;
        } else {
            return false;
        }
    }

    public static void a(com.anythink.core.common.e.e eVar, String str, String str2, String str3) {
        if (!ATSDK.isNetworkLogDebug() || eVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (eVar.x() != 0) {
                jSONObject.put("defaultAdSourceType", eVar.x());
            }
            jSONObject.put(com.anythink.expressad.videocommon.e.b.v, eVar.S());
            jSONObject.put("adType", eVar.V());
            jSONObject.put("mixedFormatAdType", eVar.K());
            jSONObject.put("action", str);
            jSONObject.put("refresh", eVar.E());
            jSONObject.put("result", str2);
            jSONObject.put("segmentId", eVar.H());
            jSONObject.put("adSourceId", eVar.w());
            jSONObject.put("position", eVar.y());
            jSONObject.put("networkType", eVar.G());
            jSONObject.put("networkName", eVar.P());
            jSONObject.put("networkVersion", eVar.u);
            jSONObject.put("networkUnit", eVar.F());
            jSONObject.put("isHB", eVar.u());
            jSONObject.put("msg", str3);
            jSONObject.put("hourly_frequency", eVar.A());
            jSONObject.put("daily_frequency", eVar.B());
            jSONObject.put("network_list", eVar.C());
            jSONObject.put("request_network_num", eVar.D());
            jSONObject.put("handle_class", eVar.h());
        } catch (Throwable unused) {
        }
        m.a("network", jSONObject.toString());
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static double a(af afVar) {
        if (afVar != null) {
            if (afVar.aa()) {
                return com.anythink.core.b.f.a().b(afVar);
            }
            return afVar.x();
        }
        return zg2.s;
    }

    public static double a(af afVar, double d) {
        com.anythink.core.b.j c;
        return (!afVar.aa() || (c = com.anythink.core.b.f.a().c(afVar)) == null) ? d : c.a();
    }

    private static void a(String str, List<af> list) {
        if (list != null) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    af afVar = list.get(i);
                    afVar.t();
                    afVar.d();
                    a(afVar);
                    TextUtils.isEmpty(afVar.z());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String a() {
        return TextUtils.isEmpty(com.anythink.core.common.b.g.a) ? "UA_0.0.0" : com.anythink.core.common.b.g.a;
    }

    public static String a(com.anythink.core.common.e.i iVar) {
        return f.a(iVar.k() + iVar.v());
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.e.e eVar) {
        if (eVar == null || eVar.G() >= 100000) {
            return;
        }
        map.put(g.k.h, eVar);
    }
}