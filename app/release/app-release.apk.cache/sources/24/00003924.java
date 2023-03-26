package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageAction.java */
/* loaded from: classes3.dex */
public class ak3 {
    private static final String a = "id";
    private static final String b = "name";
    private static final String c = "url";
    private static final String d = "pageId";
    private static final String e = "url_target";
    private static final String f = "close";
    private static final String g = "click_name";
    private static final String h = "click_url";
    private static final String i = "first_click";
    private static final String j = "closes_message";
    private static final String k = "outcomes";
    private static final String l = "tags";
    private static final String m = "prompts";
    @x1
    private String n;
    @z1
    private String o;
    @z1
    private a p;
    @z1
    private String q;
    @z1
    private String r;
    @x1
    private List<jk3> s = new ArrayList();
    @x1
    private List<nk3> t = new ArrayList();
    private rk3 u;
    private boolean v;
    private boolean w;

    /* compiled from: OSInAppMessageAction.java */
    /* loaded from: classes3.dex */
    public enum a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        
        private String w;

        a(String str) {
            this.w = str;
        }

        public static a a(String str) {
            a[] values = values();
            for (int i = 0; i < 3; i++) {
                a aVar = values[i];
                if (aVar.w.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public JSONObject f() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url_type", this.w);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.w;
        }
    }

    public ak3(@x1 JSONObject jSONObject) throws JSONException {
        this.n = jSONObject.optString("id", null);
        this.o = jSONObject.optString("name", null);
        this.q = jSONObject.optString("url", null);
        this.r = jSONObject.optString("pageId", null);
        a a2 = a.a(jSONObject.optString(e, null));
        this.p = a2;
        if (a2 == null) {
            this.p = a.IN_APP_WEBVIEW;
        }
        this.w = jSONObject.optBoolean("close", true);
        if (jSONObject.has(k)) {
            k(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.u = new rk3(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has(m)) {
            l(jSONObject);
        }
    }

    private void k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(k);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.s.add(new jk3((JSONObject) jSONArray.get(i2)));
        }
    }

    private void l(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray(m);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            string.hashCode();
            if (string.equals(ok3.b)) {
                this.t.add(new ok3());
            } else if (string.equals(ik3.b)) {
                this.t.add(new ik3());
            }
        }
    }

    public boolean a() {
        return this.w;
    }

    @x1
    public String b() {
        return this.n;
    }

    @z1
    public String c() {
        return this.o;
    }

    @z1
    public String d() {
        return this.q;
    }

    @x1
    public List<jk3> e() {
        return this.s;
    }

    public String f() {
        return this.r;
    }

    @x1
    public List<nk3> g() {
        return this.t;
    }

    public rk3 h() {
        return this.u;
    }

    @z1
    public a i() {
        return this.p;
    }

    public boolean j() {
        return this.v;
    }

    public void m(boolean z) {
        this.v = z;
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(g, this.o);
            jSONObject.put("click_url", this.q);
            jSONObject.put(i, this.v);
            jSONObject.put(j, this.w);
            JSONArray jSONArray = new JSONArray();
            for (jk3 jk3Var : this.s) {
                jSONArray.put(jk3Var.g());
            }
            jSONObject.put(k, jSONArray);
            rk3 rk3Var = this.u;
            if (rk3Var != null) {
                jSONObject.put("tags", rk3Var.e());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}