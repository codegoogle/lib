package com.anythink.basead.g;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.x;
import com.anythink.core.common.i;
import com.anythink.core.common.s;
import com.p7700g.p99005.sm4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f extends com.anythink.core.common.g.a {
    public String a;
    public JSONObject b;
    public int c;
    public String d;
    public x e;
    public Map<String, Object> f;

    public f(int i, x xVar, String str, Map<String, Object> map) {
        this.c = i;
        this.e = xVar;
        this.f = map;
        this.d = str;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c = c();
        if (c != null) {
            try {
                for (String str : c.keySet()) {
                    jSONObject.put(str, c.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        JSONObject jSONObject3 = this.b;
        s.a().a(1, b(), jSONObject2, jSONObject3 != null ? jSONObject3.toString() : "");
        com.anythink.core.common.i.c.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.a, "", "1", "");
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b.put("scenario", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        k g;
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        x xVar = this.e;
        if (xVar != null && (g = xVar.g()) != null && com.anythink.basead.a.b.a(this.c, g)) {
            String i = com.anythink.core.common.j.d.i();
            if (!TextUtils.isEmpty(i)) {
                hashMap.put(sm4.v, i);
            }
        }
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        return com.anythink.core.common.g.a.c(this.b.toString());
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
    public final String b() {
        try {
            if (!TextUtils.isEmpty(this.d)) {
                this.b = new JSONObject(this.d);
                for (Map.Entry<String, Object> entry : this.f.entrySet()) {
                    this.b.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        i.a();
        String g = i.g();
        this.a = g;
        return g;
    }
}