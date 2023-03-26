package com.anythink.core.common.e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y extends k {
    private int m;
    private int n;

    private void G(int i) {
        this.n = i;
    }

    private void H(int i) {
        this.m = i;
    }

    public static y c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        y yVar = new y();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                yVar.o(jSONObject.optInt("f_t"));
                int optInt = jSONObject.optInt("v_c");
                int i = 1;
                if (optInt == 1) {
                    optInt = 0;
                } else if (optInt == 2) {
                    optInt = 1;
                }
                yVar.p(optInt);
                yVar.q(jSONObject.optInt("s_b_t"));
                int optInt2 = jSONObject.optInt("e_c_a");
                if (optInt2 == 1) {
                    optInt2 = 0;
                } else if (optInt2 == 2) {
                    optInt2 = 1;
                } else if (optInt2 == 3) {
                    optInt2 = 2;
                }
                yVar.r(optInt2);
                int optInt3 = jSONObject.optInt("ak_cfm");
                if (optInt3 == 1) {
                    optInt3 = 0;
                } else if (optInt3 == 2) {
                    optInt3 = 1;
                }
                yVar.k(optInt3);
                yVar.j(jSONObject.optInt("m_t"));
                int optInt4 = jSONObject.optInt("cm");
                if (optInt4 == 1) {
                    i = 0;
                } else if (optInt4 != 2) {
                    i = optInt4;
                }
                yVar.m = i;
                yVar.c(jSONObject.optInt("ipua"));
                yVar.d(jSONObject.optInt("clua"));
                yVar.i(jSONObject.optInt("dp_cm"));
                yVar.n = jSONObject.optInt("l_o_num");
                yVar.h(jSONObject.optInt("ld_t"));
                yVar.u(jSONObject.optInt("ec_r"));
                yVar.v(jSONObject.optInt("ec_s_t"));
                yVar.w(jSONObject.optInt("ec_l_t"));
                yVar.a(jSONObject.optLong("or_t"));
                yVar.e(jSONObject.optInt("rv_fail_reward"));
                yVar.f(jSONObject.optInt("cl_sz"));
                yVar.g(jSONObject.optInt("si_fit"));
                if (jSONObject.has("at_cl_sw")) {
                    yVar.x(jSONObject.optInt("at_cl_sw"));
                }
                if (jSONObject.has("at_ct_ti")) {
                    yVar.y(jSONObject.optInt("at_ct_ti"));
                }
                if (jSONObject.has("int_cl_sw")) {
                    yVar.z(jSONObject.optInt("int_cl_sw"));
                }
                if (jSONObject.has("int_cl_ti")) {
                    yVar.A(jSONObject.optInt("int_cl_ti"));
                }
                if (jSONObject.has("sh_ec")) {
                    yVar.B(jSONObject.optInt("sh_ec"));
                }
                if (jSONObject.has("ap_arpt")) {
                    yVar.C(jSONObject.optInt("ap_arpt"));
                }
                if (jSONObject.has("ap_pasbl")) {
                    yVar.D(jSONObject.optInt("ap_pasbl"));
                }
                if (jSONObject.has("inter_type")) {
                    yVar.b(jSONObject.optString("inter_type"));
                }
                if (jSONObject.has("shk_sw")) {
                    yVar.E(jSONObject.optInt("shk_sw"));
                }
                if (jSONObject.has("shk_strength_and")) {
                    yVar.F(jSONObject.optInt("shk_strength_and"));
                }
                if (jSONObject.has("shk_time")) {
                    yVar.d(jSONObject.optLong("shk_time"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return yVar;
    }

    public final int M() {
        return this.n;
    }

    public final int N() {
        return this.m;
    }
}