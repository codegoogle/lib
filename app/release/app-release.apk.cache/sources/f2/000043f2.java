package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraConfigReader.java */
/* loaded from: classes.dex */
public class g61 extends c61 {
    @x1
    private static final String g = "\"%SNIs%\"";
    @x1
    private static final String h = "\"%SSL%\"";
    @x1
    private static final String i = "\"%ROUTES%\"";
    private final int j;

    /* compiled from: HydraConfigReader.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 2;
        @x1
        public static final List<String> b;
        @x1
        public static final String c = "RSA+SHA1:ECDSA+SHA1:ECDSA+SHA256:RSA+SHA256:ECDSA+SHA384:RSA+SHA384";
        public static final int d = 1;
        public static final int e = 1;
        @x1
        public static final String f = "spdy/2,http/1.1,h2";
        @x1
        public static final String g = "P-256:P-384";
        @x1
        public static final String h = "server_auth";
        @x1
        public static final String i = "ciphers";
        @x1
        public static final String j = "curves";
        @x1
        public static final String k = "sigalgs";
        @x1
        public static final String l = "extended_ms_on";
        @x1
        public static final String m = "alpn_on";
        @x1
        public static final String n = "alpns";

        static {
            ArrayList arrayList = new ArrayList();
            b = arrayList;
            arrayList.add("ECDHE-RSA-AES256-GCM-SHA384");
            arrayList.add("ECDHE-ECDSA-AES256-GCM-SHA384");
            arrayList.add("DHE-RSA-AES256-GCM-SHA384");
            arrayList.add("ECDHE-RSA-AES256-SHA");
            arrayList.add("ECDHE-ECDSA-AES128-GCM-SHA256");
            arrayList.add("DHE-RSA-AES256-SHA256");
            arrayList.add("ECDHE-ECDSA-AES256-SHA384");
            arrayList.add("ECDHE-RSA-AES128-GCM-SHA256");
            arrayList.add("ECDHE-ECDSA-AES128-SHA256");
            arrayList.add("ECDHE-RSA-AES128-SHA256");
            arrayList.add("DHE-RSA-AES128-GCM-SHA256");
            arrayList.add("ECDHE-ECDSA-AES128-SHA");
        }

        private a() {
        }
    }

    public g61(@x1 c81 c81Var, @d2 int i2) {
        super(c81Var);
        this.j = i2;
    }

    @x1
    private String c(@x1 e61 e61Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : e61Var.c.keySet()) {
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            List<String> list = e61Var.c.get(str);
            if (list != null) {
                for (String str2 : list) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(str2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ips", jSONArray2);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put("default");
                    jSONObject3.put("sni_tag", jSONArray3);
                    JSONArray jSONArray4 = new JSONArray();
                    jSONArray4.put(jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("servers", jSONArray4);
                    jSONArray.put(jSONObject4);
                }
            }
            jSONObject2.put("sections", jSONArray);
            jSONObject.put(str, jSONObject2);
        }
        return jSONObject.toString();
    }

    @x1
    private String d(@x1 e61 e61Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : e61Var.b.keySet()) {
            JSONArray jSONArray = new JSONArray();
            List<String> list = e61Var.b.get(str);
            if (list != null) {
                for (String str2 : list) {
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
            }
        }
        return jSONObject.toString();
    }

    @x1
    private String e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(a.h, 2);
        jSONObject.put(a.i, TextUtils.join(":", a.b));
        jSONObject.put(a.j, a.g);
        jSONObject.put(a.k, a.c);
        jSONObject.put(a.m, 1);
        jSONObject.put(a.l, 1);
        jSONObject.put(a.n, a.f);
        return jSONObject.toString();
    }

    @Override // com.p7700g.p99005.c61
    @x1
    public String a(@x1 e61 e61Var, @x1 ft0 ft0Var) throws Exception {
        String o = ft0Var.o();
        return b(this.j).replaceAll(c61.c, (String) r81.f(ft0Var.u())).replaceAll(c61.d, (String) r81.f(o)).replaceAll(i, c(e61Var)).replaceAll(g, d(e61Var)).replaceAll(h, e()).replaceAll(c61.e, e61Var.a);
    }
}