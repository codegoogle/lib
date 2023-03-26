package com.p7700g.p99005;

import com.microsoft.appcenter.ingestion.models.properties.LongTypedProperty;
import com.p7700g.p99005.ej3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserState.java */
/* loaded from: classes3.dex */
public abstract class mn3 {
    private static final Object a = new Object();
    public static final String b = "tags";
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 11;
    public static final int f = 13;
    public static final int g = 14;
    public static final int h = 1;
    public static final int i = 0;
    public static final int j = -2;
    public static final int k = -3;
    public static final int l = -4;
    public static final int m = -5;
    public static final int n = -6;
    public static final int o = -7;
    public static final int p = -8;
    public static final int q = -9;
    public static final int r = -11;
    public static final int s = -12;
    public static final int t = -25;
    public static final int u = -26;
    public static final int v = -27;
    public static final int w = -28;
    public static final int x = -29;
    private static final String[] y;
    private static final Set<String> z;
    private String A;
    private JSONObject B;
    private JSONObject C;

    static {
        String[] strArr = {"lat", LongTypedProperty.TYPE, "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        y = strArr;
        z = new HashSet(Arrays.asList(strArr));
    }

    public mn3(String str, boolean z2) {
        this.A = str;
        if (z2) {
            p();
            return;
        }
        this.B = new JSONObject();
        this.C = new JSONObject();
    }

    private static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject c2;
        synchronized (a) {
            c2 = dj3.c(jSONObject, jSONObject2, jSONObject3, set);
        }
        return c2;
    }

    private Set<String> l(mn3 mn3Var) {
        try {
            if (this.B.optLong("loc_time_stamp") != mn3Var.B.getLong("loc_time_stamp")) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("loc_bg", mn3Var.B.opt("loc_bg"));
                hashMap.put("loc_time_stamp", mn3Var.B.opt("loc_time_stamp"));
                w(mn3Var.C, hashMap);
                return z;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void p() {
        int c2;
        boolean z2;
        String str = vm3.a;
        StringBuilder G = wo1.G(vm3.m);
        G.append(this.A);
        String g2 = vm3.g(str, G.toString(), null);
        if (g2 == null) {
            B(new JSONObject());
            try {
                int i2 = 1;
                if (this.A.equals("CURRENT_STATE")) {
                    c2 = vm3.c(str, vm3.u, 1);
                } else {
                    c2 = vm3.c(str, vm3.v, 1);
                }
                if (c2 == -2) {
                    z2 = false;
                } else {
                    i2 = c2;
                    z2 = true;
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(un3.l, Integer.valueOf(i2));
                hashMap.put(un3.j, Boolean.valueOf(z2));
                w(this.B, hashMap);
            } catch (JSONException unused) {
            }
        } else {
            try {
                B(new JSONObject(g2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        String str2 = vm3.a;
        StringBuilder G2 = wo1.G(vm3.n);
        G2.append(this.A);
        String g3 = vm3.g(str2, G2.toString(), null);
        JSONObject jSONObject = new JSONObject();
        try {
            if (g3 == null) {
                jSONObject.put(un3.f, vm3.g(str2, vm3.w, null));
            } else {
                jSONObject = new JSONObject(g3);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        D(jSONObject);
    }

    private void w(JSONObject jSONObject, HashMap<String, Object> hashMap) throws JSONException {
        synchronized (a) {
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void A(List<String> list) {
        synchronized (a) {
            for (String str : list) {
                this.C.remove(str);
            }
        }
    }

    public void B(JSONObject jSONObject) {
        synchronized (a) {
            this.B = jSONObject;
        }
    }

    public void C(ej3.d dVar) {
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("lat", dVar.a);
            hashMap.put(LongTypedProperty.TYPE, dVar.b);
            hashMap.put("loc_acc", dVar.c);
            hashMap.put("loc_type", dVar.d);
            w(this.C, hashMap);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("loc_bg", dVar.e);
            hashMap2.put("loc_time_stamp", dVar.f);
            w(this.B, hashMap2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void D(@x1 JSONObject jSONObject) {
        synchronized (a) {
            this.C = jSONObject;
        }
    }

    public abstract void a();

    public void b() {
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("lat", null);
            hashMap.put(LongTypedProperty.TYPE, null);
            hashMap.put("loc_acc", null);
            hashMap.put("loc_type", null);
            hashMap.put("loc_bg", null);
            hashMap.put("loc_time_stamp", null);
            w(this.C, hashMap);
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("loc_bg", null);
            hashMap2.put("loc_time_stamp", null);
            w(this.B, hashMap2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public mn3 c(String str) {
        mn3 r2 = r(str);
        try {
            r2.B = k();
            r2.C = n();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return r2;
    }

    public JSONObject d(mn3 mn3Var, boolean z2) {
        a();
        mn3Var.a();
        JSONObject e2 = e(this.C, mn3Var.C, null, l(mn3Var));
        if (z2 || !e2.toString().equals("{}")) {
            try {
                if (!e2.has("app_id")) {
                    e2.put("app_id", this.C.optString("app_id"));
                }
                if (this.C.has(un3.t)) {
                    e2.put(un3.t, this.C.optString(un3.t));
                }
                if (this.C.has(un3.u)) {
                    e2.put(un3.u, this.C.optString(un3.u));
                }
                if (this.C.has(un3.s) && !e2.has(un3.s)) {
                    e2.put(un3.s, this.C.optString(un3.s));
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            return e2;
        }
        return null;
    }

    public JSONObject f(mn3 mn3Var, Set<String> set) {
        JSONObject c2;
        synchronized (a) {
            c2 = dj3.c(this.B, mn3Var.B, null, set);
        }
        return c2;
    }

    public JSONObject g(JSONObject jSONObject, Set<String> set) {
        JSONObject c2;
        synchronized (a) {
            JSONObject jSONObject2 = this.B;
            c2 = dj3.c(jSONObject2, jSONObject, jSONObject2, set);
        }
        return c2;
    }

    public JSONObject h(JSONObject jSONObject, Set<String> set) {
        JSONObject c2;
        synchronized (a) {
            JSONObject jSONObject2 = this.C;
            c2 = dj3.c(jSONObject2, jSONObject, jSONObject2, set);
        }
        return c2;
    }

    public JSONObject i(mn3 mn3Var, Set<String> set) {
        JSONObject c2;
        synchronized (a) {
            c2 = dj3.c(this.C, mn3Var.C, null, set);
        }
        return c2;
    }

    public aj3 j() {
        try {
            return new aj3(k());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new aj3();
        }
    }

    public JSONObject k() throws JSONException {
        JSONObject jSONObject;
        synchronized (a) {
            jSONObject = new JSONObject(this.B.toString());
        }
        return jSONObject;
    }

    public aj3 m() {
        try {
            return new aj3(n());
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new aj3();
        }
    }

    public JSONObject n() throws JSONException {
        JSONObject jSONObject;
        synchronized (a) {
            jSONObject = new JSONObject(this.C.toString());
        }
        return jSONObject;
    }

    public abstract boolean o();

    public void q(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject n2 = n();
                if (n2.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(n2.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("tags");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if ("".equals(optJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, optJSONObject.optString(next));
                    }
                }
                synchronized (a) {
                    if (jSONObject3.toString().equals("{}")) {
                        this.C.remove("tags");
                    } else {
                        this.C.put("tags", jSONObject3);
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public abstract mn3 r(String str);

    public void s() {
        synchronized (a) {
            try {
                if (this.C.has(un3.s) && ((this.C.has(un3.o) && this.C.get(un3.o).toString() == "") || !this.C.has(un3.o))) {
                    this.C.remove(un3.s);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            String str = vm3.a;
            vm3.o(str, vm3.n + this.A, this.C.toString());
            vm3.o(str, vm3.m + this.A, this.B.toString());
        }
    }

    public void t(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.B;
            e(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.C;
            e(jSONObject4, jSONObject2, jSONObject4, null);
            q(jSONObject2, null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        s();
    }

    public String toString() {
        StringBuilder G = wo1.G("UserState{persistKey='");
        wo1.d0(G, this.A, '\'', ", dependValues=");
        G.append(this.B);
        G.append(", syncValues=");
        G.append(this.C);
        G.append('}');
        return G.toString();
    }

    public void u(String str, Object obj) throws JSONException {
        synchronized (a) {
            this.B.put(str, obj);
        }
    }

    public void v(String str, Object obj) throws JSONException {
        synchronized (a) {
            this.C.put(str, obj);
        }
    }

    public void x(String str) {
        synchronized (a) {
            this.B.remove(str);
        }
    }

    public void y(List<String> list) {
        synchronized (a) {
            for (String str : list) {
                this.B.remove(str);
            }
        }
    }

    public void z(String str) {
        synchronized (a) {
            this.C.remove(str);
        }
    }
}