package com.anythink.core.common.e;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z implements Serializable {
    public String[] A;
    public String[] B;
    public String[] C;
    public String[] D;
    public String[] E;
    public Map<Integer, String[]> F;
    public String[] G;
    public String[] H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;
    public String a;
    public String aa;
    public String ab;
    public String ac;
    public String ad;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public String am;
    public String an;
    public String[] b;
    public String[] c;
    public String[] d;
    public String[] e;
    public String[] f;
    public String[] g;
    public String[] h;
    public String[] i;
    public String[] j;
    public String[] k;
    public String[] l;
    public String[] m;
    public String[] n;
    public String[] o;
    public String[] p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String[] t;
    public String[] u;
    public String[] v;
    public String[] w;
    public String[] x;
    public String[] y;
    public String[] z;

    public static final z a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            z zVar = new z();
            zVar.a = jSONObject.optString("ks");
            zVar.b = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("nurl"));
            zVar.c = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("imp"));
            zVar.d = com.anythink.core.common.j.h.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.c.bY));
            zVar.e = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vstart"));
            zVar.f = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("v25"));
            zVar.g = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("v50"));
            zVar.h = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("v75"));
            zVar.i = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("v100"));
            zVar.j = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vpaused"));
            zVar.k = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vclick"));
            zVar.l = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vmute"));
            zVar.m = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vunmute"));
            zVar.n = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("ec_show"));
            zVar.o = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("ec_close"));
            zVar.p = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("apk_dl_star"));
            zVar.q = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("apk_dl_end"));
            zVar.r = com.anythink.core.common.j.h.a(jSONObject.optJSONArray(com.anythink.expressad.foundation.d.h.cK));
            zVar.s = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vresumed"));
            zVar.t = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vskip"));
            zVar.u = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vfail"));
            zVar.v = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("apk_start_install"));
            zVar.w = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("dp_start"));
            zVar.x = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("dp_succ"));
            zVar.y = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("app_install"));
            zVar.z = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("app_uninstall"));
            zVar.A = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("app_unknow"));
            zVar.C = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("dp_inst_fail"));
            zVar.B = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("dp_uninst_fail"));
            zVar.D = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vd_succ"));
            zVar.E = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("vrewarded"));
            JSONArray optJSONArray = jSONObject.optJSONArray("v_p_tracking");
            if (optJSONArray != null) {
                zVar.F = new HashMap();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    int optInt = optJSONObject.optInt("play_sec");
                    zVar.F.put(Integer.valueOf(optInt), com.anythink.core.common.j.h.a(optJSONObject.optJSONArray("list")));
                }
            }
            zVar.G = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("load_success"));
            zVar.H = com.anythink.core.common.j.h.a(jSONObject.optJSONArray("load_fail"));
            zVar.I = jSONObject.optString("tp_nurl");
            zVar.J = jSONObject.optString("tp_imp");
            zVar.K = jSONObject.optString("tp_click");
            zVar.L = jSONObject.optString("tp_vstart");
            zVar.M = jSONObject.optString("tp_v25");
            zVar.N = jSONObject.optString("tp_v50");
            zVar.O = jSONObject.optString("tp_v75");
            zVar.P = jSONObject.optString("tp_v100");
            zVar.Q = jSONObject.optString("tp_vpaused");
            zVar.R = jSONObject.optString("tp_vclick");
            zVar.S = jSONObject.optString("tp_vmute");
            zVar.T = jSONObject.optString("tp_vunmute");
            zVar.U = jSONObject.optString("tp_ec_show");
            zVar.V = jSONObject.optString("tp_ec_close");
            zVar.W = jSONObject.optString("tp_apk_dl_star");
            zVar.X = jSONObject.optString("tp_apk_dl_end");
            zVar.Y = jSONObject.optString("tp_apk_install");
            zVar.Z = jSONObject.optString("tp_vresumed");
            zVar.aa = jSONObject.optString("tp_vskip");
            zVar.ab = jSONObject.optString("tp_vfail");
            zVar.ac = jSONObject.optString("tp_apk_start_install");
            zVar.ad = jSONObject.optString("tp_dp_start");
            zVar.ae = jSONObject.optString("tp_dp_succ");
            zVar.af = jSONObject.optString("tp_app_install");
            zVar.ag = jSONObject.optString("tp_app_uninstall");
            zVar.ah = jSONObject.optString("tp_app_unknow");
            zVar.aj = jSONObject.optString("tp_dp_inst_fail");
            zVar.ai = jSONObject.optString("tp_dp_uninst_fail");
            zVar.ak = jSONObject.optString("tp_vd_succ");
            zVar.al = jSONObject.optString("tp_vrewarded");
            zVar.am = jSONObject.optString("tp_load_success");
            zVar.an = jSONObject.optString("tp_load_fail");
            return zVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String A() {
        return this.J;
    }

    public final String B() {
        return this.K;
    }

    public final String C() {
        return this.L;
    }

    public final String D() {
        return this.M;
    }

    public final String E() {
        return this.N;
    }

    public final String F() {
        return this.O;
    }

    public final String G() {
        return this.P;
    }

    public final String H() {
        return this.Q;
    }

    public final String I() {
        return this.R;
    }

    public final String J() {
        return this.S;
    }

    public final String K() {
        return this.T;
    }

    public final String L() {
        return this.U;
    }

    public final String M() {
        return this.V;
    }

    public final String N() {
        return this.W;
    }

    public final String O() {
        return this.X;
    }

    public final String P() {
        return this.Y;
    }

    public final String[] Q() {
        return this.s;
    }

    public final String[] R() {
        return this.t;
    }

    public final String[] S() {
        return this.u;
    }

    public final String[] T() {
        return this.v;
    }

    public final String[] U() {
        return this.w;
    }

    public final String[] V() {
        return this.x;
    }

    public final String[] W() {
        return this.y;
    }

    public final String[] X() {
        return this.z;
    }

    public final String[] Y() {
        return this.A;
    }

    public final String Z() {
        return this.Z;
    }

    public final String aa() {
        return this.aa;
    }

    public final String ab() {
        return this.ab;
    }

    public final String ac() {
        return this.ac;
    }

    public final String ad() {
        return this.ad;
    }

    public final String ae() {
        return this.ae;
    }

    public final String af() {
        return this.af;
    }

    public final String ag() {
        return this.ag;
    }

    public final String ah() {
        return this.ah;
    }

    public final String ai() {
        return this.ai;
    }

    public final String aj() {
        return this.aj;
    }

    public final String ak() {
        return this.ak;
    }

    public final String al() {
        return this.al;
    }

    public final String am() {
        return this.am;
    }

    public final String an() {
        return this.an;
    }

    public final void b(String[] strArr) {
        this.p = strArr;
    }

    public final void c(String[] strArr) {
        this.q = strArr;
    }

    public final void d(String[] strArr) {
        this.r = strArr;
    }

    public final String[] e() {
        return this.c;
    }

    public final String[] f() {
        return this.d;
    }

    public final String[] g() {
        return this.e;
    }

    public final String[] h() {
        return this.f;
    }

    public final String[] i() {
        return this.g;
    }

    public final String[] j() {
        return this.h;
    }

    public final String[] k() {
        return this.i;
    }

    public final String[] l() {
        return this.j;
    }

    public final String[] m() {
        return this.k;
    }

    public final String[] n() {
        return this.l;
    }

    public final String[] o() {
        return this.m;
    }

    public final String[] p() {
        return this.n;
    }

    public final String[] q() {
        return this.o;
    }

    public final String[] r() {
        return this.p;
    }

    public final String[] s() {
        return this.q;
    }

    public final String[] t() {
        return this.r;
    }

    public final String[] u() {
        return this.B;
    }

    public final String[] v() {
        return this.C;
    }

    public final String[] w() {
        return this.D;
    }

    public final String[] x() {
        return this.E;
    }

    public final Map<Integer, String[]> y() {
        return this.F;
    }

    public final String z() {
        return this.I;
    }

    public final String[] b() {
        return this.H;
    }

    public final String c() {
        return this.a;
    }

    public final String[] d() {
        return this.b;
    }

    public final void a(String[] strArr) {
        this.d = strArr;
    }

    public final String[] a() {
        return this.G;
    }
}