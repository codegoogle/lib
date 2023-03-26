package com.anythink.core.common.a;

import android.text.TextUtils;
import com.anythink.basead.b.a;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.y;
import com.anythink.core.common.e.z;
import com.anythink.expressad.foundation.c.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {
    public static com.anythink.core.common.e.g a(String str, JSONObject jSONObject, int i) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(g.c.d);
            if (optJSONObject != null) {
                jSONObject = optJSONObject;
            } else if (!jSONObject.has("seatbid")) {
                return null;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONArray("seatbid").optJSONObject(0);
            com.anythink.core.common.e.g gVar = new com.anythink.core.common.e.g();
            gVar.b(str);
            gVar.f(optJSONObject2.optString("oid"));
            gVar.g(optJSONObject2.optString("c_id"));
            gVar.s(optJSONObject2.optString(a.C0020a.A));
            gVar.h(optJSONObject2.optString("title"));
            gVar.i(optJSONObject2.optString("desc"));
            gVar.e(optJSONObject2.optInt(com.anythink.expressad.foundation.d.c.X));
            gVar.j(optJSONObject2.optString("icon_u"));
            gVar.l(optJSONObject2.optString("full_u"));
            gVar.c(optJSONObject2.optInt("unit_type"));
            gVar.m(optJSONObject2.optString("tp_logo_u"));
            gVar.n(optJSONObject2.optString(a.C0020a.k));
            gVar.o(optJSONObject2.optString("video_u"));
            gVar.c(optJSONObject2.optInt("video_l"));
            gVar.D(optJSONObject2.optString("video_r"));
            gVar.E(optJSONObject2.optString("ec_u"));
            gVar.p(optJSONObject2.optString("store_u"));
            gVar.d(optJSONObject2.optInt("link_type"));
            gVar.r(optJSONObject2.optString("click_u"));
            gVar.q(optJSONObject2.optString("deeplink"));
            gVar.i(optJSONObject2.optInt("crt_type", 1));
            gVar.F(optJSONObject2.optString("img_list"));
            gVar.G(optJSONObject2.optString("banner_xhtml"));
            gVar.b(optJSONObject2.optInt("offer_firm_id"));
            gVar.e(optJSONObject2.optString("jump_url"));
            try {
                String optString = optJSONObject2.optString("sdk_resp");
                if (!TextUtils.isEmpty(optString)) {
                    gVar.a(new JSONObject(optString).optString("data"));
                }
            } catch (Throwable unused) {
            }
            gVar.H(optJSONObject2.optString(d.a.f));
            gVar.u(optJSONObject2.optString("publisher"));
            gVar.v(optJSONObject2.optString("app_version"));
            gVar.w(optJSONObject2.optString("privacy"));
            gVar.x(optJSONObject2.optString("permission"));
            gVar.d(optJSONObject2.optString("mtr_ver"));
            gVar.j(optJSONObject2.optInt("o_im_cap_sw", 2));
            gVar.k(optJSONObject2.optInt("o_cl_cap_sw", 2));
            gVar.l(optJSONObject2.optInt("c_im_cap_sw", 2));
            gVar.m(optJSONObject2.optInt("c_cl_cap_sw", 2));
            gVar.a(optJSONObject2.optLong("expire", 0L));
            if (i == 67) {
                gVar.a(2);
            } else {
                gVar.a(1);
            }
            gVar.a((k) y.c(optJSONObject2.optString("ctrl")));
            gVar.a(z.a(optJSONObject2.optString("tk")));
            JSONObject jSONObject2 = new JSONObject(optJSONObject2.optString("nw_info"));
            gVar.y(jSONObject2.optString("app_id"));
            gVar.z(jSONObject2.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.APP_KEY));
            gVar.A(jSONObject2.optString("unit_id"));
            gVar.B(optJSONObject2.optString("dsp_id", ""));
            gVar.C(optJSONObject2.optString("dsp_oid", ""));
            gVar.g(optJSONObject2.optInt(com.anythink.expressad.foundation.d.c.S, -1));
            gVar.h(optJSONObject2.optInt("install_sw", -1));
            return gVar;
        } catch (Throwable unused2) {
            return null;
        }
    }
}