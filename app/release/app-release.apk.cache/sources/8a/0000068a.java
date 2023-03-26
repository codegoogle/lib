package com.anythink.core.common.h;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.e;
import com.anythink.core.common.i;
import com.anythink.core.common.j.f;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends com.anythink.core.common.g.a {
    private Context b;
    private int c;
    private String f;
    private e g;
    private com.anythink.core.c.d h;
    public boolean a = false;
    private String d = m.a().n();
    private String e = m.a().o();

    public c(Context context, int i, String str, e eVar, com.anythink.core.c.d dVar) {
        this.b = context;
        this.c = i;
        this.g = eVar;
        this.h = dVar;
        this.f = str;
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        i.a();
        return i.i();
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
        return com.anythink.core.common.g.a.c(g());
    }

    @Override // com.anythink.core.common.g.a
    public final JSONObject e() {
        JSONObject e = super.e();
        JSONObject f = super.f();
        try {
            e.put("app_id", this.d);
            Iterator<String> keys = f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                e.put(next, f.opt(next));
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
                e.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return e;
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        JSONObject jSONObject = new JSONObject();
        String a = com.anythink.core.common.j.c.a(e().toString());
        StringBuilder sb = new StringBuilder();
        wo1.h0(sb, this.e, "api_ver=1.0&common=", a, "&data=");
        sb.append(this.f);
        sb.append("&ss_a=");
        sb.append(this.c);
        String c = f.c(sb.toString());
        try {
            jSONObject.put(com.anythink.core.common.g.c.W, a);
            jSONObject.put("ss_a", this.c);
            jSONObject.put("data", this.f);
            jSONObject.put(com.anythink.core.common.g.c.L, "1.0");
            jSONObject.put("sign", c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.anythink.core.common.g.a
    public final boolean h() {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final String i() {
        return this.d;
    }

    @Override // com.anythink.core.common.g.a
    public final Context j() {
        return this.b;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return this.e;
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
    public final Object a(String str) {
        return str.trim();
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
        try {
            if (!ErrorCode.httpStatuException.equals(adError.getCode())) {
                if (this.a) {
                    com.anythink.core.common.i.c.a(this.g, this.h, adError.getPlatformCode(), adError.getPlatformMSG());
                    return;
                }
                this.a = true;
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c cVar = c.this;
                        cVar.a(0, cVar.k);
                    }
                }, 5000L);
                return;
            }
            com.anythink.core.common.i.c.a(this.g, this.h, adError.getPlatformCode(), adError.getPlatformMSG());
        } catch (Throwable unused) {
        }
    }
}