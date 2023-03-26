package com.anythink.core.common.e;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class s extends k {
    public int m;

    private void G(int i) {
        this.m = i;
    }

    public static s c(String str) {
        s sVar = new s();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                sVar.o(jSONObject.optInt("f_t"));
                sVar.p(jSONObject.optInt("v_c"));
                sVar.q(jSONObject.optInt("s_b_t"));
                sVar.r(jSONObject.optInt("e_c_a"));
                sVar.s(jSONObject.optInt("v_m"));
                sVar.t(jSONObject.optInt("s_c_t"));
                sVar.j(jSONObject.optInt("m_t"));
                sVar.c(jSONObject.optLong("o_c_t"));
                sVar.k(jSONObject.optInt("ak_cfm"));
                sVar.b(jSONObject.optLong("ctdown_time"));
                sVar.l(jSONObject.optInt("sk_able"));
                sVar.m(jSONObject.optInt("orient"));
                sVar.a(jSONObject.optString(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE));
                sVar.n(jSONObject.optInt("cl_btn"));
                sVar.u(jSONObject.optInt("ec_r"));
                sVar.v(jSONObject.optInt("ec_s_t"));
                sVar.w(jSONObject.optInt("ec_l_t"));
                sVar.b(jSONObject.optString("inter_type"));
                sVar.m = jSONObject.optInt("spl_type");
                sVar.a(jSONObject.optLong("or_t"));
                sVar.e(jSONObject.optInt("rv_fail_reward"));
                sVar.f(jSONObject.optInt("cl_sz"));
                sVar.g(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    sVar.x(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    sVar.y(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    sVar.z(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    sVar.A(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    sVar.B(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ipua")) {
                    sVar.c(jSONObject.optInt("ipua"));
                }
                if (jSONObject.has("clua")) {
                    sVar.d(jSONObject.optInt("clua"));
                }
                if (jSONObject.has("ap_arpt")) {
                    sVar.C(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    sVar.D(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("shk_sw")) {
                    sVar.E(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    sVar.F(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    sVar.d(jSONObject.optLong("shk_time"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return sVar;
    }

    public final int M() {
        return this.m;
    }
}