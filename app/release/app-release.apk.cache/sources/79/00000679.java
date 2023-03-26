package com.anythink.core.common.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.m;
import com.anythink.core.common.r;
import com.p7700g.p99005.sm4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i extends a {
    public static final String a = "sdk_custom";
    private static final String d = "i";
    public long b;
    public long c;
    private String e = m.a().p();
    private String f;
    private String g;
    private Context h;
    private String i;
    private String j;
    private String m;
    private Map<String, Object> n;
    private JSONObject o;

    public i(Context context, String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.i = str;
        this.j = str2;
        this.h = context;
        this.g = str3;
        this.f = m.a().e(str3);
        this.m = str4;
        this.n = map;
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
        return com.anythink.core.common.i.c();
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
        JSONObject e = super.e();
        try {
            e.put("app_id", this.i);
            e.put("pl_id", this.g);
            e.put("session_id", this.f);
            e.put("nw_ver", com.anythink.core.common.j.d.h());
            e.put("exclude_myofferid", r.a().a(this.h));
            if (m.a().j() != null) {
                e.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, m.a().j());
            }
            String w = m.a().w();
            if (!TextUtils.isEmpty(w)) {
                e.put("sy_id", w);
            }
            String x = m.a().x();
            if (!TextUtils.isEmpty(x)) {
                e.put("bk_id", x);
            } else {
                m.a().h(m.a().v());
                e.put("bk_id", m.a().v());
            }
            if (this.n != null) {
                JSONObject jSONObject = new JSONObject();
                for (String str : this.n.keySet()) {
                    Object obj = this.n.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                this.o = jSONObject;
                e.put("custom", jSONObject);
            }
            if (m.a().b() != null) {
                e.put("deny", com.anythink.core.common.j.d.o(m.a().e()));
            }
            if (m.a().t()) {
                m.a().u().fillRequestParam(e);
            }
        } catch (JSONException unused) {
        }
        return e;
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
        return this.i;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return this.h;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return this.j;
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
        com.anythink.core.common.i.c.a("placement", adError.getPlatformCode(), adError.getPlatformMSG(), (String) null, this.g, "", "");
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        String trim = str.trim();
        try {
            JSONObject jSONObject = new JSONObject(trim);
            if (this.n != null) {
                jSONObject.put(a, new JSONObject(this.n));
            }
            trim = jSONObject.toString();
        } catch (Exception unused) {
        }
        com.anythink.core.common.i.c.a("placement", this.g, this.b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.c);
        return trim;
    }
}