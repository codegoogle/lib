package com.anythink.expressad.foundation.d;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a implements com.anythink.expressad.e.b, Serializable {
    private static final String a = "https://img.toponad.com/sdk/app-permissions.html?key=";
    private static String b = "app_name";
    private static String c = "perm_desc";
    private static String d = "ori_perm_desc";
    private static String e = "ori_perm_all";
    private static String f = "pri_url";
    private static String g = "upd_time";
    private static String h = "app_ver";
    private static String i = "dev_name";
    private String j;
    private String k;
    private ArrayList<String> l = new ArrayList<>(3);
    private ArrayList<String> m = new ArrayList<>(3);
    private ArrayList<String> n = new ArrayList<>(3);
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;

    private void b(String str) {
        this.j = str;
    }

    private void c(String str) {
        this.o = str;
    }

    private void d(String str) {
        this.k = str;
    }

    private void e(String str) {
        this.p = str;
    }

    private void f(String str) {
        this.q = str;
    }

    private void g(String str) {
        this.r = str;
    }

    private String h() {
        return this.j;
    }

    private ArrayList<String> i() {
        return this.l;
    }

    private ArrayList<String> j() {
        return this.m;
    }

    private ArrayList<String> k() {
        return this.n;
    }

    public final String a() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApkDisplayInfo{appName='");
        wo1.d0(sb, this.k, '\'', ", permDescJArray=");
        sb.append(this.l);
        sb.append(", permDescOriJArray=");
        sb.append(this.m);
        sb.append(", permDescAll=");
        sb.append(this.n);
        sb.append(", priUrl='");
        wo1.d0(sb, this.p, '\'', ", updateTime='");
        wo1.d0(sb, this.q, '\'', ", appVersion='");
        wo1.d0(sb, this.r, '\'', ", devName='");
        sb.append(this.s);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private void a(ArrayList<String> arrayList) {
        this.l = arrayList;
    }

    private void c(ArrayList<String> arrayList) {
        this.n = arrayList;
    }

    private void h(String str) {
        this.s = str;
    }

    public final String b() {
        return this.k;
    }

    public final String d() {
        return this.q;
    }

    public final String e() {
        return this.r;
    }

    public final String f() {
        return this.s;
    }

    public final JSONObject g() {
        try {
            JSONObject jSONObject = new JSONObject(this.j);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static a a(a aVar) {
        return aVar == null ? new a() : aVar;
    }

    private void b(ArrayList<String> arrayList) {
        this.m = arrayList;
    }

    private static JSONArray d(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        return jSONArray;
    }

    public final String c() {
        return this.p;
    }

    public static a a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return a(new JSONObject(str));
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.optString(i2));
        }
        return arrayList;
    }

    private static a a(JSONObject jSONObject) {
        a aVar = null;
        if (jSONObject.has(b)) {
            aVar = a((a) null);
            aVar.k = jSONObject.optString(b);
        }
        if (jSONObject.has(c)) {
            aVar = a(aVar);
            JSONArray optJSONArray = jSONObject.optJSONArray(c);
            if (optJSONArray != null) {
                aVar.l = a(optJSONArray);
                ArrayList<String> arrayList = aVar.n;
                String str = a;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        if (optJSONArray.get(i2) instanceof String) {
                            str = i2 == 0 ? str + optJSONArray.optString(i2) : str + "," + optJSONArray.optString(i2);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                aVar.o = str;
                aVar.n = arrayList;
            }
        }
        if (jSONObject.has(d)) {
            aVar = a(aVar);
            JSONArray optJSONArray2 = jSONObject.optJSONArray(d);
            if (optJSONArray2 != null) {
                aVar.m = a(optJSONArray2);
                ArrayList<String> arrayList2 = aVar.n;
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    try {
                        Object obj = optJSONArray2.get(i3);
                        if (obj instanceof String) {
                            arrayList2.add((String) obj);
                        }
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                aVar.n = arrayList2;
            }
        }
        if (jSONObject.has(f)) {
            aVar = a(aVar);
            aVar.p = jSONObject.optString(f);
        }
        if (jSONObject.has(g)) {
            aVar = a(aVar);
            aVar.q = jSONObject.optString(g);
        }
        if (jSONObject.has(h)) {
            aVar = a(aVar);
            aVar.r = jSONObject.optString(h);
        }
        if (jSONObject.has(i)) {
            aVar = a(aVar);
            aVar.s = jSONObject.optString(i);
        }
        if (aVar != null) {
            aVar.j = jSONObject.toString();
        }
        return aVar;
    }
}