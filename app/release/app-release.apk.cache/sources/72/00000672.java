package com.anythink.core.common.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends a {
    public Context a;
    public int b;
    public String c = m.a().n();
    public String d = m.a().o();
    public List<String> e;
    public int f;

    public b(Context context, int i, List<String> list) {
        this.a = context;
        this.e = list;
        this.b = list.size();
        this.f = i;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i, h hVar) {
        if (!TextUtils.isEmpty(b())) {
            super.a(i, hVar);
        } else if (hVar != null) {
            hVar.onLoadFinish(i, Integer.valueOf(this.b));
        }
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.k();
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
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
        JSONObject e = super.e();
        if (e != null) {
            try {
                e.put("app_id", this.c);
                e.put("nw_ver", com.anythink.core.common.j.d.h());
                Map<String, Object> k = m.a().k();
                if (k != null) {
                    try {
                        if (k.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            for (String str : k.keySet()) {
                                Object obj = k.get(str);
                                if (obj != null) {
                                    jSONObject.put(str, obj.toString());
                                }
                            }
                            e.put("custom", jSONObject);
                        }
                    } catch (Throwable unused) {
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.e;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.e) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                e.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return e;
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject f() {
        JSONObject f = super.f();
        if (f != null) {
            try {
                f.put(c.Q, this.f);
            } catch (Exception unused) {
            }
        }
        return f;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return this.c;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return this.a;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return this.d;
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
    public final boolean p() {
        return true;
    }

    private static String b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return Integer.valueOf(this.b);
    }
}