package com.anythink.core.common.g;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.anythink.core.common.s;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k extends a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    public static final int u = 21;
    private static final String w = "k";
    private List<com.anythink.core.common.e.f> A;
    private com.anythink.core.common.e.f B;
    private int C;
    private Context x;
    public boolean v = false;
    private String y = m.a().n();
    private String z = m.a().o();

    public k(Context context, int i2, List<com.anythink.core.common.e.f> list) {
        this.x = context;
        this.C = i2;
        this.A = list;
    }

    private void a(JSONObject jSONObject) {
        if (!this.v || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(c.R, 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.e.f fVar = this.B;
        if (fVar != null) {
            return fVar.b.am;
        }
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.j();
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return a.c(g());
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e2 = super.e();
        JSONObject f2 = super.f();
        try {
            e2.put("app_id", this.y);
            e2.put(c.Q, this.C);
            Iterator<String> keys = f2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e2.put(next, f2.opt(next));
            }
            Map<String, Object> k = m.a().k();
            if (k != null && k.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : k.keySet()) {
                    Object obj = k.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                e2.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return e2;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String a2 = com.anythink.core.common.j.c.a(e().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.anythink.core.common.e.f> list = this.A;
        if (list != null) {
            for (com.anythink.core.common.e.f fVar : list) {
                JSONObject a3 = fVar.a();
                a(a3);
                jSONArray.put(a3);
            }
        } else {
            com.anythink.core.common.e.f fVar2 = this.B;
            if (fVar2 != null) {
                JSONObject a4 = fVar2.a();
                a(a4);
                jSONArray.put(a4);
            }
        }
        String a5 = com.anythink.core.common.j.c.a(jSONArray.toString());
        StringBuilder sb = new StringBuilder();
        wo1.h0(sb, this.z, "api_ver=1.0&common=", a2, "&data=");
        sb.append(a5);
        String c2 = com.anythink.core.common.j.f.c(sb.toString());
        try {
            jSONObject.put(c.W, a2);
            jSONObject.put("data", a5);
            jSONObject.put(c.L, "1.0");
            jSONObject.put("sign", c2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return this.y;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return this.x;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return this.z;
    }

    @Override // com.anythink.core.common.g.a
    public final String l() {
        return "1.0";
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> m() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final int n() {
        return 2;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean p() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        String trim = str.trim();
        com.anythink.core.common.j.e.b(w, "data:".concat(String.valueOf(trim)));
        return trim;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        List<com.anythink.core.common.e.f> list = this.A;
        com.anythink.core.common.i.c.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), b(), (String) null, String.valueOf(list != null ? list.size() : 1), "0");
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c2 = c();
        if (c2 != null) {
            try {
                for (String str : c2.keySet()) {
                    jSONObject.put(str, c2.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        this.v = true;
        String g2 = g();
        this.v = false;
        s.a().a(1, b(), jSONObject2, g2);
    }
}