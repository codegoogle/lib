package com.anythink.core.b.a;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.AdError;
import com.anythink.core.c.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.c;
import com.anythink.core.common.o;
import com.p7700g.p99005.sm4;
import com.p7700g.p99005.zq5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a extends com.anythink.core.common.g.a {
    public static final int a = 0;
    public static final int b = 1;
    public static final String c = "ex_pkg";
    public static final String d = "unit_ids";
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String m;
    public int n;
    public int o;
    public int p;
    private int q;
    private final String r = d.a.j;
    private final String s = ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID;
    private final String t = "ch_info";
    private final String u = "wf";
    private final String v = "np";
    private final String w = "hb_size";

    public a(String str, String str2, String str3, List<JSONObject> list, int i) {
        this.q = 0;
        this.e = str3;
        this.h = str;
        this.i = str2;
        this.q = i;
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject : list) {
            jSONArray.put(jSONObject);
        }
        this.f = c.a(jSONArray.toString().getBytes());
        d a2 = e.a(m.a().e()).a(str2);
        if (a2 != null) {
            this.n = a2.J();
            this.o = a2.Z();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    public final void a(String str, String str2, String str3) {
        if (str != null) {
            this.g = c.a(str.getBytes());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(zq5.e, str2)) {
            this.j = c.a(str2.getBytes());
        }
        if (TextUtils.isEmpty(str3) || TextUtils.equals(zq5.e, str3)) {
            return;
        }
        this.m = c.a(str3.getBytes());
    }

    public final void b(int i) {
        this.p = i;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        if (this.q == 0) {
            hashMap.put(sm4.c, "gzip");
        }
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return g().getBytes();
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e = super.e();
        try {
            e.put("app_id", m.a().n());
            e.put("pl_id", this.i);
            e.put("session_id", m.a().e(this.i));
            e.put("t_g_id", this.n);
            e.put("gro_id", this.o);
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
            if (this.q == 0) {
                e.put("misk_spt", o.a().c());
                o.a();
                e.put("misk_pt_det", o.b());
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
        String a2 = c.a(e().toString());
        String a3 = c.a(f().toString());
        hashMap.put("p", a2);
        hashMap.put(com.anythink.core.common.g.c.U, a3);
        hashMap.put(d.a.j, this.f);
        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, this.e);
        int i = this.p;
        if (i > 0) {
            hashMap.put("hb_size", Integer.valueOf(i));
        }
        if (this.q == 0) {
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put("ch_info", this.g);
            }
            if (!TextUtils.isEmpty(this.j)) {
                hashMap.put("wf", this.j);
            }
            if (!TextUtils.isEmpty(this.m)) {
                hashMap.put("np", this.m);
            }
            if (m.a().j() != null) {
                hashMap.put(c, c.a(m.a().j().toString()));
            }
        }
        Set<String> keySet = hashMap.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : keySet) {
                jSONObject.put(str, hashMap.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
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

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.h;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }
}