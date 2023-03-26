package com.anythink.core.common.g.a;

import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.f;
import com.anythink.core.common.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends b {
    public List<f> a;
    public String b;
    public boolean j;
    private final String k;

    public d(List<f> list) {
        this.k = d.class.getSimpleName();
        this.a = list;
    }

    @Override // com.anythink.core.common.g.a.b
    public final void a(String str, String str2, String str3, int i) {
        if (this.j) {
            return;
        }
        String str4 = str3 + ":" + i;
        List<f> list = this.a;
        com.anythink.core.common.i.c.a("tk", str, str2, str4, (String) null, String.valueOf(list != null ? list.size() : 0), "1");
        s.a().a(3, "", "", a(true));
    }

    @Override // com.anythink.core.common.g.a.b
    public final int b() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a.b
    public final int c() {
        return 3;
    }

    @Override // com.anythink.core.common.g.a.b
    public final byte[] d() {
        if (!TextUtils.isEmpty(this.b)) {
            return b.a(this.b);
        }
        List<f> list = this.a;
        return (list == null || list.size() <= 0) ? new byte[0] : b.a(a(false));
    }

    @Override // com.anythink.core.common.g.a.b
    public final boolean e() {
        return this.j;
    }

    @Override // com.anythink.core.common.g.a.b
    public final int g() {
        return 2;
    }

    public d(String str) {
        this.k = d.class.getSimpleName();
        this.j = true;
        this.b = str;
    }

    private String a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject f = super.f();
        JSONObject a = com.anythink.core.common.g.c.a();
        try {
            f.put("app_id", m.a().n());
            f.put(com.anythink.core.common.g.c.Q, this.h);
            f.put(com.anythink.core.common.g.c.S, this.i);
            Iterator<String> keys = a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                f.put(next, a.opt(next));
            }
            Map<String, Object> k = m.a().k();
            if (k != null && k.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : k.keySet()) {
                    Object obj = k.get(str);
                    if (obj != null) {
                        jSONObject2.put(str, obj.toString());
                    }
                }
                f.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        String a2 = com.anythink.core.common.j.c.a(f.toString());
        JSONArray jSONArray = new JSONArray();
        List<f> list = this.a;
        if (list != null) {
            for (f fVar : list) {
                JSONObject a3 = fVar.a();
                if (z && a3 != null) {
                    try {
                        a3.put(com.anythink.core.common.g.c.R, 1);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                jSONArray.put(a3);
            }
        }
        String a4 = com.anythink.core.common.j.c.a(jSONArray.toString());
        String c = com.anythink.core.common.j.f.c(m.a().o() + "api_ver=1.0&common=" + a2 + "&data=" + a4);
        try {
            jSONObject.put(com.anythink.core.common.g.c.W, a2);
            jSONObject.put("data", a4);
            jSONObject.put(com.anythink.core.common.g.c.L, "1.0");
            jSONObject.put("sign", c);
        } catch (Exception unused2) {
        }
        return jSONObject.toString();
    }
}