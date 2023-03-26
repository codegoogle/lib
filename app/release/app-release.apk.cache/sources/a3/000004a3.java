package com.anythink.basead.g;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.q;
import com.anythink.core.common.s;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends com.anythink.core.common.g.a {
    public String a;
    public JSONObject b;

    public b(int i, q qVar, String str) {
        String str2 = "";
        try {
            switch (i) {
                case 1:
                    str2 = qVar.L();
                    break;
                case 2:
                    str2 = qVar.M();
                    break;
                case 3:
                    str2 = qVar.N();
                    break;
                case 4:
                    str2 = qVar.O();
                    break;
                case 5:
                    str2 = qVar.P();
                    break;
                case 6:
                    str2 = qVar.Q();
                    break;
                case 7:
                    str2 = qVar.R();
                    break;
                case 8:
                    str2 = qVar.S();
                    break;
                case 9:
                    str2 = qVar.T();
                    break;
            }
            Uri parse = Uri.parse(qVar.L(str2));
            this.a = parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
            this.b = new JSONObject();
            for (String str3 : parse.getQueryParameterNames()) {
                this.b.put(str3, URLEncoder.encode(parse.getQueryParameter(str3)));
            }
            this.b.put("req_id", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Encoding", "gzip");
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            try {
                jSONObject.put("t", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
            }
            return com.anythink.core.common.g.a.c(this.b.toString());
        }
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
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
        return this.a;
    }
}