package com.anythink.basead.d.b;

import com.anythink.basead.b.a;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.w;
import com.anythink.core.common.e.y;
import com.anythink.core.common.e.z;
import com.anythink.expressad.foundation.c.d;
import com.anythink.expressad.foundation.d.c;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public static final String a = "sdk_updatetime";

    public static final w a(j jVar, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(g.c.d);
            if (optJSONObject == null) {
                return null;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONArray("offers").optJSONObject(0);
            w wVar = new w();
            wVar.a(jVar.f);
            wVar.f(optJSONObject2.optString("oid"));
            wVar.g(optJSONObject2.optString("c_id"));
            wVar.s(optJSONObject2.optString(a.C0020a.A));
            wVar.h(optJSONObject2.optString("title"));
            wVar.i(optJSONObject2.optString("desc"));
            wVar.e(optJSONObject2.optInt(c.X));
            wVar.j(optJSONObject2.optString("icon_u"));
            wVar.l(optJSONObject2.optString("full_u"));
            wVar.c(optJSONObject2.optInt("unit_type"));
            wVar.m(optJSONObject2.optString("tp_logo_u"));
            wVar.n(optJSONObject2.optString(a.C0020a.k));
            wVar.o(optJSONObject2.optString("video_u"));
            wVar.c(optJSONObject2.optInt("video_l"));
            wVar.D(optJSONObject2.optString("video_r"));
            wVar.E(optJSONObject2.optString("ec_u"));
            wVar.p(optJSONObject2.optString("store_u"));
            wVar.d(optJSONObject2.optInt("link_type"));
            wVar.r(optJSONObject2.optString("click_u"));
            wVar.q(optJSONObject2.optString("deeplink"));
            wVar.f(optJSONObject2.optInt("r_target"));
            wVar.a(optJSONObject2.optLong("expire"));
            wVar.t(optJSONObject2.optString("ad_logo_title"));
            wVar.i(optJSONObject2.optInt("crt_type", 1));
            wVar.F(optJSONObject2.optString("img_list"));
            wVar.G(optJSONObject2.optString("banner_xhtml"));
            wVar.b(jSONObject.optLong(a));
            wVar.b(optJSONObject2.optInt("offer_firm_id"));
            wVar.e(optJSONObject2.optString("jump_url"));
            wVar.H(optJSONObject2.optString(d.a.f));
            wVar.u(optJSONObject2.optString("publisher"));
            wVar.v(optJSONObject2.optString("app_version"));
            wVar.w(optJSONObject2.optString("privacy"));
            wVar.x(optJSONObject2.optString("permission"));
            wVar.a((k) y.c(optJSONObject2.optString("ctrl")));
            wVar.a(z.a(optJSONObject2.optString("tk")));
            return wVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}