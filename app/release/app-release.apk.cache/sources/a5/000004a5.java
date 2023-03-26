package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;
import com.anythink.core.common.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d extends com.anythink.core.common.g.a {
    public String a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String[] h;
    public int i;
    public String j = "OnlineOfferLoader";

    public d(j jVar, int i, int i2, String[] strArr) {
        this.a = jVar.d;
        this.b = jVar.b;
        this.c = jVar.c;
        this.i = jVar.e;
        this.f = i;
        this.g = i2;
        this.h = strArr;
        this.d = jVar.h;
        this.e = jVar.i;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return str;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(int i, Object obj) {
        if (obj == null) {
            a(i, "Return Empty Ad.", ErrorCode.getErrorCode(ErrorCode.noADError, "", ""));
            return;
        }
        try {
            if (TextUtils.isEmpty(new JSONObject(obj.toString()).optString("data"))) {
                a(i, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
            } else {
                super.a(i, obj);
            }
        } catch (Throwable unused) {
            a(i, obj.toString(), ErrorCode.getErrorCode(ErrorCode.noADError, "", obj.toString()));
        }
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        i.a();
        return i.h();
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
            e.put("app_id", m.a().n());
            e.put("pl_id", this.b);
            e.put("session_id", m.a().e(this.b));
            e.put("t_g_id", this.d);
            e.put("gro_id", this.e);
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
            if (m.a().b() != null) {
                e.put("deny", com.anythink.core.common.j.d.o(m.a().e()));
            }
        } catch (Exception unused) {
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
    public final String g() {
        HashMap hashMap = new HashMap();
        String a = com.anythink.core.common.j.c.a(e().toString());
        String a2 = com.anythink.core.common.j.c.a(f().toString());
        hashMap.put("p", a);
        hashMap.put(com.anythink.core.common.g.c.U, a2);
        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, this.a);
        hashMap.put("ad_source_id", Integer.valueOf(Integer.parseInt(this.c)));
        hashMap.put(com.anythink.expressad.a.g, Integer.valueOf(this.i));
        String[] strArr = this.h;
        if (strArr != null && strArr.length > 0) {
            JSONArray jSONArray = new JSONArray();
            for (String str : this.h) {
                jSONArray.put(str);
            }
            hashMap.put("exclude_offers", jSONArray);
        }
        if (m.a().j() != null) {
            hashMap.put(com.anythink.core.b.a.a.c, com.anythink.core.common.j.c.a(m.a().j().toString()));
        }
        int i = this.f;
        if (i > 0 && this.g > 0) {
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_WIDTH, Integer.valueOf(i));
            hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.AD_HEIGHT, Integer.valueOf(this.g));
        }
        return new JSONObject(hashMap).toString();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> m() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final int n() {
        return 2;
    }
}