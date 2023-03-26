package com.anythink.core.common.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.p7700g.p99005.sm4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends a {
    public static final String a = "custom";
    private static final String e = "d";
    public long b;
    public long c;
    public Map<String, Object> d = m.a().k();
    private String f;
    private String g;
    private Context h;

    public d(Context context, String str, String str2) {
        this.f = str;
        this.g = str2;
        this.h = context;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i, h hVar) {
        this.b = System.currentTimeMillis();
        this.c = SystemClock.elapsedRealtime();
        super.a(i, hVar);
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.b();
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put(sm4.c, "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        try {
            return g().getBytes("utf-8");
        } catch (Exception unused) {
            return g().getBytes();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e2 = super.e();
        try {
            e2.put("app_id", this.f);
            e2.put("nw_ver", com.anythink.core.common.j.d.h());
            String w = m.a().w();
            if (!TextUtils.isEmpty(w)) {
                e2.put("sy_id", w);
            }
            String x = m.a().x();
            if (!TextUtils.isEmpty(x)) {
                e2.put("bk_id", x);
            } else {
                m.a().h(m.a().v());
                e2.put("bk_id", m.a().v());
            }
            Map<String, Object> k = m.a().k();
            if (k != null) {
                JSONObject jSONObject = new JSONObject();
                for (String str : k.keySet()) {
                    Object obj = k.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                e2.put("custom", jSONObject);
            }
            if (m.a().b() != null) {
                e2.put("deny", com.anythink.core.common.j.d.o(m.a().e()));
            }
            e2.put(c.O, m.a().G() ? 1 : 2);
            if (m.a().t()) {
                e2.put("is_test", 1);
            }
        } catch (JSONException unused) {
        }
        return e2;
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject f() {
        JSONObject f = super.f();
        try {
            if (m.a().b() != null) {
                f.put("btts", com.anythink.core.common.j.d.g());
            }
        } catch (JSONException unused) {
        }
        return f;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return this.f;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return this.h;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return this.g;
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
        return 3;
    }

    @Override // com.anythink.core.common.g.a
    public final boolean o() {
        return true;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        com.anythink.core.common.i.c.a("app", adError.getPlatformCode(), adError.getPlatformMSG(), (String) null, "", "", "");
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        String trim = str.trim();
        try {
            JSONObject jSONObject = new JSONObject(trim);
            if (this.d != null) {
                jSONObject.put("custom", new JSONObject(this.d));
            }
            trim = jSONObject.toString();
        } catch (Exception unused) {
        }
        com.anythink.core.common.i.c.a("app", (String) null, this.b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.c);
        return trim;
    }
}