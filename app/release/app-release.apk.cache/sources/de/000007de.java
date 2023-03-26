package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.a.c;
import com.anythink.expressad.foundation.h.s;
import com.microsoft.appcenter.AppCenter;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h extends com.anythink.expressad.out.j implements com.anythink.expressad.e.b, Serializable {
    public static final String cA = "ttc_ct2";
    public static final String cB = "gh_id";
    public static final String cC = "gh_path";
    public static final String cD = "bind_id";
    public static final String cE = "mark";
    public static final String cF = "isPost";
    public static final int cG = 604800;
    public static final int cH = 1800;
    public static final String cI = "apk_download_start";
    public static final String cJ = "apk_download_end";
    public static final String cK = "apk_install";
    public static final String cL = "loopback";
    public static final String cM = "domain";
    public static final String cN = "key";
    public static final String cO = "value";
    public static final String cm = h.class.getSimpleName();
    public static final String cn = "apk_alt";
    public static final String co = "disableApkAlt";
    public static final String cp = "apk_info";
    public static final String cq = "ntbarpt";
    public static final String cr = "ntbarpasbl";
    public static final String cs = "atat_type";
    public static final String ct = "akdlui";
    public static final String cu = "ttc";
    public static final String cv = "ttc_ct";
    public static final String cw = "ttc_pe";
    public static final String cx = "ttc_po";
    public static final String cy = "adv_id";
    public static final String cz = "ttc_type";
    private static final long l = 1;
    private a d;
    private String i;
    private String j;
    private String k;
    private int n;
    private String o;
    private int p;
    private Map<String, String> q;
    private String r;
    private String s;
    private int t;
    private int u;
    private c.b v;
    private int a = 0;
    private int b = 0;
    private String c = "";
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private String h = "";
    private boolean m = false;

    private void a(a aVar) {
        this.d = aVar;
    }

    private void b(int i) {
        this.a = i;
    }

    private void c(int i) {
        this.e = i;
    }

    private void d(int i) {
        this.f = i;
    }

    private void e(int i) {
        this.g = i;
    }

    private void f(String str) {
        this.o = str;
    }

    private void g(int i) {
        this.u = i;
    }

    private void h(int i) {
        this.t = i;
    }

    private void i(int i) {
        this.n = i;
    }

    public final a aG() {
        return this.d;
    }

    public final int aH() {
        return this.b;
    }

    public final int aI() {
        return this.a;
    }

    public final int aJ() {
        return this.e;
    }

    public final int aK() {
        return this.f;
    }

    public final int aL() {
        return this.g;
    }

    public final String aM() {
        return this.h;
    }

    public final String aN() {
        return this.i;
    }

    public final String aO() {
        return this.j;
    }

    public final String aP() {
        return this.k;
    }

    public final String aQ() {
        return this.o;
    }

    public final int aR() {
        return this.p;
    }

    public final int aS() {
        return this.u;
    }

    public final int aT() {
        return this.t;
    }

    public final String aU() {
        return this.s;
    }

    public final int aV() {
        return this.n;
    }

    public final boolean aW() {
        return this.m;
    }

    public c.b al() {
        return this.v;
    }

    public final String r(String str) {
        Map<String, String> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.q) == null || map.size() <= 0) {
                return str;
            }
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String str2 = map.get("domain");
            if (TextUtils.isEmpty(host) || !host.contains(str2)) {
                return str;
            }
            String str3 = map.get("key");
            String str4 = map.get("value");
            if (!str.contains(str3) && TextUtils.isEmpty(parse.getQueryParameter(str3)) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                return str + "&" + str3 + AppCenter.KEY_VALUE_DELIMITER + str4;
            } else if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                return str;
            } else {
                return str.replace(str3 + AppCenter.KEY_VALUE_DELIMITER + (!TextUtils.isEmpty(parse.getQueryParameter(str3)) ? parse.getQueryParameter(str3) : ""), str3 + AppCenter.KEY_VALUE_DELIMITER + str4);
            }
        } catch (Throwable unused) {
            com.anythink.expressad.foundation.h.n.d("", "matchLoopback error");
            return str;
        }
    }

    private void a(int i) {
        this.b = i;
    }

    private void b(String str) {
        this.i = str;
    }

    private void c(String str) {
        this.j = str;
    }

    private void d(String str) {
        this.k = str;
    }

    private void e(String str) {
        this.r = str;
    }

    private void f(int i) {
        this.p = i;
    }

    private void g(String str) {
        this.s = str;
    }

    private static Map<String, String> h(String str) {
        HashMap hashMap = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap2.put("domain", jSONObject.getString("domain"));
                hashMap2.put("key", jSONObject.getString("key"));
                hashMap2.put("value", jSONObject.getString("value"));
                return hashMap2;
            } catch (Throwable unused) {
                hashMap = hashMap2;
                com.anythink.expressad.foundation.h.n.d("", "loopbackStrToMap error");
                return hashMap;
            }
        } catch (Throwable unused2) {
        }
    }

    private void a(String str) {
        this.h = str;
    }

    private String b() {
        return this.r;
    }

    private static JSONObject c(JSONObject jSONObject, c cVar) {
        if (cVar == null) {
            return jSONObject;
        }
        jSONObject.put(cu, ((h) cVar).m);
        jSONObject.put(cv, ((h) cVar).n);
        jSONObject.put(cy, ((h) cVar).s);
        jSONObject.put("ttc_type", ((h) cVar).t);
        jSONObject.put(cA, ((h) cVar).u);
        jSONObject.put(cB, ((h) cVar).i);
        jSONObject.put(cC, com.anythink.expressad.foundation.h.i.a(((h) cVar).j));
        jSONObject.put(cD, ((h) cVar).k);
        jSONObject.put(cn, ((h) cVar).a);
        jSONObject.put(co, ((h) cVar).b);
        a aVar = ((h) cVar).d;
        if (aVar != null) {
            jSONObject.put(cp, aVar.g());
        }
        jSONObject.put(cE, ((h) cVar).o);
        jSONObject.put(cF, ((h) cVar).p);
        jSONObject.put(c.bb, cVar.v());
        jSONObject.put(cr, ((h) cVar).f);
        jSONObject.put(cq, ((h) cVar).e);
        jSONObject.put(cs, ((h) cVar).g);
        jSONObject.put(ct, ((h) cVar).h);
        return jSONObject;
    }

    private Map<String, String> a() {
        return this.q;
    }

    public static c b(JSONObject jSONObject, c cVar) {
        if (jSONObject != null) {
            try {
                ((h) cVar).m = jSONObject.optBoolean(cu);
                ((h) cVar).n = jSONObject.optInt(cv, 604800);
                ((h) cVar).s = jSONObject.optString(cy);
                ((h) cVar).t = jSONObject.optInt("ttc_type", 3);
                ((h) cVar).u = jSONObject.optInt(cA, 1800);
                ((h) cVar).o = jSONObject.optString(cE);
                ((h) cVar).p = jSONObject.optInt(cF);
                try {
                    if (jSONObject.has(cL)) {
                        String optString = jSONObject.optString(cL);
                        if (!TextUtils.isEmpty(optString)) {
                            ((h) cVar).r = optString;
                            ((h) cVar).q = h(optString);
                        }
                    }
                } catch (Exception unused) {
                    com.anythink.expressad.foundation.h.n.d("", "loopback parser error");
                }
                String optString2 = jSONObject.optString(cB);
                if (!TextUtils.isEmpty(optString2)) {
                    ((h) cVar).i = optString2;
                    String optString3 = jSONObject.optString(cC);
                    if (!TextUtils.isEmpty(optString3)) {
                        ((h) cVar).j = com.anythink.expressad.foundation.h.i.b(optString3);
                    }
                    ((h) cVar).k = jSONObject.optString(cD);
                }
                cVar.d(jSONObject.optString("cam_html"));
                cVar.a(jSONObject.optString("cam_html"));
                ((h) cVar).a = jSONObject.optInt(cn, 0);
                ((h) cVar).b = jSONObject.optInt(co, 0);
                ((h) cVar).d = a.a(jSONObject.optString(cp));
                ((h) cVar).f = jSONObject.optInt(cr, 0);
                ((h) cVar).e = jSONObject.optInt(cq, 0);
                ((h) cVar).g = jSONObject.optInt(cs, 0);
                ((h) cVar).h = jSONObject.optString(ct, "");
                return cVar;
            } catch (Exception e) {
                e.printStackTrace();
                String str = cm;
                com.anythink.expressad.foundation.h.n.d(str, "parse campaign json exception: " + e.getLocalizedMessage());
                return cVar;
            }
        }
        return null;
    }

    private void a(Map<String, String> map) {
        this.q = map;
    }

    private void a(boolean z) {
        this.m = z;
    }

    public void a(c.b bVar) {
        this.v = bVar;
    }

    public static c a(JSONObject jSONObject, c cVar) {
        if (jSONObject != null) {
            try {
                ((h) cVar).m = jSONObject.optBoolean(cu);
                ((h) cVar).n = jSONObject.optInt(cv, 604800);
                ((h) cVar).s = jSONObject.optString(cy);
                ((h) cVar).t = jSONObject.optInt("ttc_type", 3);
                ((h) cVar).u = jSONObject.optInt(cA, 1800);
                cVar.a(System.currentTimeMillis());
                cVar.k(jSONObject.optString(d.f));
                cVar.l(jSONObject.optString(d.k));
                ((h) cVar).o = jSONObject.optString(cE);
                ((h) cVar).p = jSONObject.optInt(cF);
                try {
                    if (jSONObject.has(cL)) {
                        String optString = jSONObject.optString(cL);
                        if (!TextUtils.isEmpty(optString)) {
                            ((h) cVar).r = optString;
                            ((h) cVar).q = h(optString);
                        }
                    }
                } catch (Exception unused) {
                    com.anythink.expressad.foundation.h.n.d("", "loopback parser error");
                }
                String optString2 = jSONObject.optString(cB);
                if (!TextUtils.isEmpty(optString2)) {
                    ((h) cVar).i = optString2;
                    String optString3 = jSONObject.optString(cC);
                    if (!TextUtils.isEmpty(optString3)) {
                        ((h) cVar).j = com.anythink.expressad.foundation.h.i.b(optString3);
                    }
                    ((h) cVar).k = jSONObject.optString(cD);
                }
                ((h) cVar).a = jSONObject.optInt(cn, 0);
                ((h) cVar).b = jSONObject.optInt(co, 0);
                ((h) cVar).d = a.a(jSONObject.optString(cp));
                ((h) cVar).f = jSONObject.optInt(cr, 0);
                ((h) cVar).e = jSONObject.optInt(cq, 0);
                ((h) cVar).g = jSONObject.optInt(cs, 0);
                ((h) cVar).h = jSONObject.optString(ct, "");
                return cVar;
            } catch (Exception e) {
                e.printStackTrace();
                String str = cm;
                com.anythink.expressad.foundation.h.n.d(str, "parse campaign json exception: " + e.getLocalizedMessage());
                return cVar;
            }
        }
        return null;
    }

    public final boolean b(c cVar) {
        boolean z = true;
        z = (this.a == 1 && cVar.P() == 3 && ((h) cVar).b != 1) ? false : false;
        if (z) {
            try {
                return s.a(com.anythink.core.common.b.m.a().e(), ba()) ? false : z;
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.n.a(cm, th.getMessage());
                return z;
            }
        }
        return z;
    }

    public static String a(d dVar, c cVar, String str) {
        if (dVar != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap<String, String> a = dVar.a();
                if (a != null) {
                    a.entrySet().iterator();
                    for (Map.Entry<String, String> entry : a.entrySet()) {
                        str = str.replaceAll("\\{" + entry.getKey() + "\\}", entry.getValue());
                    }
                }
                HashMap<String, String> x = cVar.x();
                if (x != null) {
                    x.entrySet().iterator();
                    for (Map.Entry<String, String> entry2 : x.entrySet()) {
                        str = str.replaceAll("\\{" + entry2.getKey() + "\\}", entry2.getValue());
                    }
                }
                HashMap<String, String> b = dVar.b();
                if (b != null) {
                    for (Map.Entry<String, String> entry3 : b.entrySet()) {
                        str = str.replaceAll("\\{" + entry3.getKey() + "\\}", entry3.getValue());
                    }
                }
                str = str.replaceAll("\\{c\\}", URLEncoder.encode(dVar.e(), "utf-8"));
                Matcher matcher = Pattern.compile("=\\{.*?\\}").matcher(str);
                while (matcher.find()) {
                    str = str.replace(matcher.group(0), AppCenter.KEY_VALUE_DELIMITER);
                }
            } catch (Throwable th) {
                com.anythink.expressad.foundation.h.n.b(cm, th.getMessage(), th);
            }
        }
        return str;
    }
}