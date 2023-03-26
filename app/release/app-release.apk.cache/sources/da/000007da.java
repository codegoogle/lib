package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.core.api.IExHandler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements com.anythink.expressad.e.b, Serializable {
    public static final String A = "cam_tpl_url";
    public static final String B = "cam_html";
    public static final String C = "cam_tpl_url";
    public static final String D = "cam_html";
    public static final String E = "nscpt";
    public static final String F = "mof_template_url";
    public static final String G = "mof_tplid";
    public static final String H = "req_ext_data";
    public static final String I = "replace_tmp";
    private static final String K = d.class.getSimpleName();
    private static final long L = 1;
    public static final String a = "a";
    public static final String b = "pv_urls";
    public static final String c = "parent_session_id";
    public static final String d = "ad_type";
    public static final String e = "unit_size";
    public static final String f = "html_url";
    public static final String g = "only_impression_url";
    public static final String h = "ads";
    public static final String i = "template";
    public static final String j = "frames";
    public static final String k = "end_screen_url";
    public static final String l = "jm_do";
    public static final String m = "rks";
    public static final String n = "vcn";
    public static final String o = "token_r";
    public static final String p = "encrypt_p";
    public static final String q = "irlfa";
    public static final String r = "csp";
    public static final String s = "do";
    public static final String t = "sh";
    public static final String u = "ia_icon";
    public static final String v = "ia_rst";
    public static final String w = "ia_url";
    public static final String x = "ia_ori";
    public static final String y = "ia_all_ext1";
    public static final String z = "ia_all_ext2";
    public ArrayList<c> J;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private int S;
    private String T;
    private int U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private int Z;
    private String aa;
    private String ab;
    private String ac;
    private int ad;
    private List<com.anythink.expressad.out.l> ae;
    private HashMap<String, String> ag;
    private HashMap<String, String> ah;
    private String ai;
    private String aj;
    private String ak;
    private int al;
    private int am;
    private int ao;
    private String ap;
    private String M = "";
    private StringBuffer af = new StringBuffer();
    private String an = "";

    private String A() {
        return this.aa;
    }

    private String B() {
        return this.ab;
    }

    private String C() {
        return this.ac;
    }

    private ArrayList<c> D() {
        return this.J;
    }

    private int E() {
        return this.ad;
    }

    private static Object a(Object obj) {
        return obj == null ? "" : obj;
    }

    private void a(int i2) {
        this.S = i2;
    }

    private void b(String str) {
        this.M = str;
    }

    private void c(String str) {
        this.N = str;
    }

    private void d(String str) {
        this.O = str;
    }

    private void e(String str) {
        this.P = str;
    }

    private void f(String str) {
        this.Q = str;
    }

    private String g() {
        return this.M;
    }

    private String h() {
        return this.N;
    }

    private String i() {
        return this.O;
    }

    private String j() {
        return this.P;
    }

    private String k() {
        return this.Q;
    }

    private String l() {
        return this.R;
    }

    private int m() {
        return this.S;
    }

    private String n() {
        return this.T;
    }

    private int o() {
        return this.U;
    }

    private String p() {
        return this.V;
    }

    private String q() {
        return this.W;
    }

    private String r() {
        return this.an;
    }

    private int s() {
        int i2 = this.al;
        if (i2 > 1) {
            return i2;
        }
        return 1;
    }

    private int t() {
        int i2 = this.am;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    private String u() {
        return this.ai;
    }

    private String v() {
        return this.aj;
    }

    private String w() {
        return this.ak;
    }

    private int x() {
        return this.ao;
    }

    private List<com.anythink.expressad.out.l> y() {
        return this.ae;
    }

    private String z() {
        return this.Y;
    }

    private void b(int i2) {
        this.U = i2;
    }

    private void c(int i2) {
        this.al = i2;
    }

    private void d(int i2) {
        this.am = i2;
    }

    private void e(int i2) {
        this.ao = i2;
    }

    private void f(int i2) {
        this.Z = i2;
    }

    private void g(String str) {
        this.R = str;
    }

    private void h(String str) {
        this.T = str;
    }

    private void i(String str) {
        this.V = str;
    }

    private void j(String str) {
        this.W = str;
    }

    private void k(String str) {
        this.an = str;
    }

    private void l(String str) {
        this.ai = str;
    }

    private void m(String str) {
        this.aj = str;
    }

    private void n(String str) {
        this.ak = str;
    }

    private void o(String str) {
        this.X = str;
    }

    private void p(String str) {
        this.Y = str;
    }

    private void q(String str) {
        this.aa = str;
    }

    private void r(String str) {
        this.ab = str;
    }

    private void s(String str) {
        this.ac = str;
    }

    public final HashMap<String, String> a() {
        return this.ag;
    }

    private void a(HashMap<String, String> hashMap) {
        this.ag = hashMap;
    }

    private void g(int i2) {
        this.ad = i2;
    }

    public final HashMap<String, String> b() {
        return this.ah;
    }

    public final String c() {
        return this.X;
    }

    public final int d() {
        return this.Z;
    }

    public final String e() {
        StringBuffer stringBuffer = this.af;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.af.toString();
        }
        try {
            String f2 = com.anythink.core.common.j.d.f();
            String c2 = com.anythink.core.common.j.d.c(com.anythink.core.common.b.m.a().e());
            String b2 = com.anythink.core.common.j.d.b(com.anythink.core.common.b.m.a().e());
            com.anythink.core.common.b.m.a();
            String valueOf = String.valueOf(com.anythink.expressad.foundation.h.j.a());
            StringBuffer stringBuffer2 = this.af;
            stringBuffer2.append(this.Z);
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) Build.VERSION.RELEASE));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.expressad.out.b.a));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.j.d.a()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) (com.anythink.expressad.foundation.h.j.e(com.anythink.core.common.b.m.a().e()) + "x" + com.anythink.expressad.foundation.h.j.f(com.anythink.core.common.b.m.a().e()))));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a(Integer.valueOf(com.anythink.expressad.foundation.h.j.b(com.anythink.expressad.foundation.b.a.b().d()))));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.j.d.f(com.anythink.expressad.foundation.b.a.b().d())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) valueOf));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) b2));
            stringBuffer2.append(a((Object) c2));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "at_device1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) "at_device2"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.j.d.d(com.anythink.core.common.b.m.a().e())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) f2));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) com.anythink.core.common.j.d.b()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append("||");
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            stringBuffer2.append(a((Object) (com.anythink.core.common.b.m.a().w() + "," + com.anythink.core.common.b.m.a().x())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bQ);
            this.af = stringBuffer2;
            IExHandler b3 = com.anythink.core.common.b.m.a().b();
            if (b3 != null) {
                return b3.fillCDataParam(this.af.toString());
            }
        } catch (Throwable th) {
            com.anythink.expressad.foundation.h.n.b(K, th.getMessage(), th);
        }
        String stringBuffer3 = this.af.toString();
        stringBuffer3.replaceAll("at_device1", "");
        stringBuffer3.replaceAll("at_device2", "");
        return stringBuffer3;
    }

    public final String f() {
        try {
            if (!TextUtils.isEmpty(this.ap)) {
                return this.ap;
            }
            if (TextUtils.isEmpty(this.ac)) {
                return "";
            }
            Uri parse = Uri.parse(this.ac);
            if (parse != null) {
                this.ap = parse.getQueryParameter("k");
            }
            return this.ap;
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(List<com.anythink.expressad.out.l> list) {
        this.ae = list;
    }

    private void b(HashMap<String, String> hashMap) {
        this.ah = hashMap;
    }

    private void a(ArrayList<c> arrayList) {
        this.J = arrayList;
    }

    private static d b(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    private static d a(JSONObject jSONObject, String str) {
        return b(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d b(JSONObject jSONObject, String str) {
        String str2;
        int optInt;
        String optString;
        String str3;
        int i2;
        ArrayList arrayList;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        String str4;
        String str5;
        String str6;
        int i3;
        String str7;
        JSONObject jSONObject2 = jSONObject;
        String str8 = h;
        String str9 = "template";
        String str10 = "a";
        String str11 = g;
        String str12 = f;
        if (jSONObject2 != null) {
            try {
                d dVar = new d();
                try {
                    String optString2 = jSONObject2.optString(m);
                    if (!TextUtils.isEmpty(optString2)) {
                        JSONObject jSONObject3 = new JSONObject(optString2);
                        Iterator<String> keys = jSONObject3.keys();
                        HashMap<String, String> hashMap = new HashMap<>();
                        while (keys != null && keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject3.optString(next));
                        }
                        dVar.ag = hashMap;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("encrypt_p", "");
                        hashMap2.put(q, "");
                        dVar.ah = hashMap2;
                    }
                    JSONObject optJSONObject = jSONObject2.optJSONObject(H);
                    optInt = jSONObject2.optInt(E, 1);
                    optString = jSONObject2.optString(F, "");
                    int optInt2 = jSONObject2.optInt(G, 0);
                    String jSONObject4 = optJSONObject != null ? optJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("pv_urls");
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        str3 = jSONObject4;
                        i2 = optInt2;
                        arrayList = null;
                    } else {
                        str3 = jSONObject4;
                        arrayList = new ArrayList(optJSONArray3.length());
                        i2 = optInt2;
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            arrayList.add(optJSONArray3.getString(i4));
                        }
                    }
                    com.anythink.expressad.foundation.c.a.a.a().a(jSONObject2.optJSONObject(I));
                    dVar.X = jSONObject2.optString("a");
                    dVar.Y = jSONObject2.optString("parent_session_id");
                    dVar.Z = jSONObject2.optInt("ad_type");
                    dVar.aa = jSONObject2.optString(e);
                    dVar.ab = jSONObject2.optString(f);
                    dVar.ac = jSONObject2.optString(g);
                    dVar.ad = jSONObject2.optInt("template");
                    dVar.ao = jSONObject2.optInt(l);
                    dVar.R = jSONObject2.optString("ia_icon");
                    dVar.S = jSONObject2.optInt("ia_rst");
                    dVar.T = jSONObject2.optString("ia_url");
                    dVar.U = jSONObject2.optInt("ia_ori");
                    dVar.V = jSONObject2.optString(y);
                    dVar.W = jSONObject2.optString(z);
                    dVar.al = jSONObject2.optInt("vcn");
                    dVar.am = jSONObject2.optInt("token_r");
                    dVar.an = jSONObject2.optString("encrypt_p");
                    optJSONArray = jSONObject2.optJSONArray(h);
                    optJSONArray2 = jSONObject2.optJSONArray("frames");
                    str4 = k;
                } catch (Exception unused) {
                    str10 = dVar;
                }
                try {
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        String str13 = "parse campaign error ,campaign is null";
                        String str14 = optString;
                        int i5 = 0;
                        while (i5 < optJSONArray2.length()) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i5);
                            int i6 = i5;
                            JSONArray jSONArray = optJSONObject2.getJSONArray(str8);
                            String str15 = str8;
                            ArrayList arrayList3 = new ArrayList();
                            String str16 = str9;
                            JSONObject jSONObject5 = optJSONObject2;
                            int i7 = 0;
                            while (i7 < jSONArray.length()) {
                                JSONObject optJSONObject3 = jSONArray.optJSONObject(i7);
                                String optString3 = jSONObject2.optString(str11);
                                String optString4 = jSONObject2.optString(str12);
                                String str17 = str4;
                                String str18 = str13;
                                JSONObject jSONObject6 = jSONObject5;
                                JSONArray jSONArray2 = optJSONArray2;
                                String str19 = str3;
                                String str20 = str12;
                                int i8 = i2;
                                String str21 = str11;
                                ArrayList arrayList4 = arrayList2;
                                String str22 = str14;
                                int i9 = i6;
                                JSONArray jSONArray3 = jSONArray;
                                int i10 = optInt;
                                String str23 = str10;
                                d dVar2 = dVar;
                                c a2 = c.a(optJSONObject3, optString3, optString4, jSONObject2.optString(str4), false, dVar, str);
                                if (a2 != null) {
                                    a2.h(dVar2.T);
                                    a2.g(dVar2.U);
                                    a2.f(dVar2.S);
                                    a2.g(dVar2.R);
                                    a2.e(jSONObject2.optInt("ad_type"));
                                    a2.e(jSONObject2.optString(c.aR));
                                    a2.f(jSONObject2.optString(c.aS));
                                    a2.c(dVar2.s());
                                    a2.b(dVar2.t());
                                    a2.b(dVar2.an);
                                    a2.j(i8);
                                    a2.p(str22);
                                    i3 = i10;
                                    a2.i(i3);
                                    a2.a((List<String>) arrayList);
                                    str6 = str19;
                                    a2.q(str6);
                                    arrayList3.add(a2);
                                    str7 = str18;
                                } else {
                                    str6 = str19;
                                    i3 = i10;
                                    str7 = str18;
                                    dVar2.M = str7;
                                }
                                i7++;
                                optJSONArray2 = jSONArray2;
                                arrayList2 = arrayList4;
                                str4 = str17;
                                jSONObject5 = jSONObject6;
                                str13 = str7;
                                jSONArray = jSONArray3;
                                i6 = i9;
                                str14 = str22;
                                str11 = str21;
                                i2 = i8;
                                str12 = str20;
                                str3 = str6;
                                optInt = i3;
                                dVar = dVar2;
                                str10 = str23;
                            }
                            String str24 = str10;
                            d dVar3 = dVar;
                            JSONObject jSONObject7 = jSONObject5;
                            ArrayList arrayList5 = arrayList2;
                            int i11 = optInt;
                            String str25 = str3;
                            String str26 = str12;
                            int i12 = i2;
                            com.anythink.expressad.out.l lVar = new com.anythink.expressad.out.l();
                            lVar.b(jSONObject2.optString("parent_session_id"));
                            lVar.a(jSONObject2.optString(str24));
                            lVar.a(arrayList3);
                            lVar.a(jSONObject7.optInt(str16));
                            arrayList5.add(lVar);
                            arrayList2 = arrayList5;
                            str14 = str14;
                            optJSONArray2 = optJSONArray2;
                            str11 = str11;
                            str8 = str15;
                            i2 = i12;
                            str13 = str13;
                            str12 = str26;
                            i5 = i6 + 1;
                            str9 = str16;
                            str3 = str25;
                            optInt = i11;
                            dVar = dVar3;
                            str10 = str24;
                            str4 = str4;
                        }
                        d dVar4 = dVar;
                        dVar4.ae = arrayList2;
                        return dVar4;
                    }
                    String str27 = k;
                    int i13 = optInt;
                    String str28 = str3;
                    String str29 = f;
                    int i14 = i2;
                    String str30 = g;
                    String str31 = "parse campaign error ,campaign is null";
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        ArrayList<c> arrayList6 = new ArrayList<>();
                        int i15 = 0;
                        while (i15 < optJSONArray.length()) {
                            String str32 = str30;
                            String str33 = str29;
                            String str34 = str31;
                            String str35 = str27;
                            JSONArray jSONArray4 = optJSONArray;
                            String str36 = str28;
                            str30 = str32;
                            int i16 = i13;
                            c a3 = c.a(optJSONArray.optJSONObject(i15), jSONObject2.optString(str32), jSONObject2.optString(str33), jSONObject2.optString(str35), false, dVar, str);
                            if (a3 != null) {
                                a3.j(i14);
                                a3.p(optString);
                                a3.i(i16);
                                a3.a((List<String>) arrayList);
                                str5 = str36;
                                a3.q(str5);
                                a3.c(dVar.s());
                                a3.b(dVar.t());
                                a3.b(dVar.an);
                                arrayList6.add(a3);
                            } else {
                                str5 = str36;
                                dVar.M = str34;
                            }
                            i15++;
                            str31 = str34;
                            i13 = i16;
                            str28 = str5;
                            str27 = str35;
                            optJSONArray = jSONArray4;
                            jSONObject2 = jSONObject;
                            str29 = str33;
                        }
                        dVar.J = arrayList6;
                    }
                    str2 = dVar;
                } catch (Exception unused2) {
                    str2 = str10;
                    com.anythink.expressad.foundation.h.n.d(K, "parse campaign unit exception");
                    return str2;
                }
            } catch (Exception unused3) {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        return str2;
    }

    public static d a(String str) {
        try {
            return b(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static d a(JSONObject jSONObject) {
        return b(jSONObject, "");
    }
}