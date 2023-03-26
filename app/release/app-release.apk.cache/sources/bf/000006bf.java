package com.anythink.core.common.j;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.af;
import com.p7700g.p99005.zg2;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p {
    public static com.anythink.core.common.e.e a(String str, String str2, String str3, com.anythink.core.c.d dVar, String str4, int i, int i2, int i3) {
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.v(str2);
        eVar.w(str);
        eVar.p(str3);
        eVar.m(str4);
        eVar.s(i);
        eVar.t(i2);
        eVar.r = 0;
        eVar.q = 2;
        eVar.s = 0;
        a(eVar, dVar);
        eVar.N();
        eVar.B(com.anythink.core.common.b.m.a().h());
        eVar.C(i3);
        return eVar;
    }

    public static com.anythink.core.common.e.e a(ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.e.e eVar, af afVar) {
        aTBaseAdAdapter.setUnitGroupInfo(afVar);
        aTBaseAdAdapter.setRefresh(eVar.E() == 1);
        try {
            eVar.u = aTBaseAdAdapter.getNetworkSDKVersion();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(eVar.P())) {
            eVar.t(aTBaseAdAdapter.getNetworkName());
        }
        eVar.e(aTBaseAdAdapter.getClass().getName());
        aTBaseAdAdapter.setTrackingInfo(eVar);
        return eVar;
    }

    public static void a(com.anythink.core.common.e.e eVar, af afVar, int i, boolean z) {
        com.anythink.core.common.e.m N;
        com.anythink.core.common.e.q e;
        ab.a a = z ? com.anythink.core.a.a.a(com.anythink.core.common.b.m.a().e()).a(eVar.S(), afVar.t()) : null;
        eVar.c(afVar.l());
        eVar.u(afVar.c());
        eVar.l(afVar.t());
        eVar.l(afVar.C());
        eVar.m(afVar.D());
        eVar.f(afVar.U());
        eVar.o(i);
        eVar.n(afVar.g());
        eVar.q(a != null ? a.e : 0);
        eVar.r(a != null ? a.d : 0);
        if (afVar.M()) {
            if (afVar.aa()) {
                com.anythink.core.common.e.m N2 = afVar.N();
                if (N2 != null) {
                    eVar.c(N2.o);
                }
            } else {
                eVar.c(afVar.x());
            }
        } else {
            eVar.c(zg2.s);
        }
        if (afVar.j()) {
            if (afVar.V() != 2) {
                if (afVar.aa()) {
                    com.anythink.core.common.e.m N3 = afVar.N();
                    if (N3 != null) {
                        eVar.a(eVar.f() * N3.o);
                        eVar.i(N3.p);
                    }
                } else {
                    eVar.a(eVar.f() * afVar.x());
                    eVar.i("exact");
                }
            }
        } else {
            eVar.a(afVar.J());
            String G = afVar.G();
            if (TextUtils.isEmpty(G)) {
                G = "publisher_defined";
            }
            eVar.i(G);
        }
        eVar.n(afVar.i());
        eVar.f(afVar.y());
        eVar.am = afVar.u();
        eVar.an = afVar.v();
        eVar.ao = afVar.w();
        eVar.k(afVar.F());
        eVar.e(afVar.V());
        try {
            JSONObject jSONObject = new JSONObject(afVar.g());
            JSONObject jSONObject2 = new JSONObject();
            if (35 == afVar.c()) {
                String optString = jSONObject.optString("my_oid");
                com.anythink.core.c.d a2 = com.anythink.core.c.e.a(com.anythink.core.common.b.m.a().e()).a(eVar.S());
                if (a2 != null && (e = a2.e(optString)) != null) {
                    jSONObject2.put("o_id", optString);
                    jSONObject2.put("c_id", e.l());
                }
            }
            if ("0".equals(eVar.U()) && (3 == afVar.l() || 7 == afVar.l())) {
                String optString2 = jSONObject.optString("layout_type");
                jSONObject2.put("tpl_type", (TextUtils.isEmpty(optString2) || optString2.equals("0")) ? "2" : "2");
            }
            if (28 == afVar.c() && (N = afVar.N()) != null) {
                jSONObject2.put("origin_price", N.originPrice);
            }
            eVar.q(jSONObject2.toString());
        } catch (Throwable unused) {
        }
        com.anythink.core.common.e.m N4 = afVar.N();
        eVar.c(N4 != null ? N4.g : "");
        eVar.w(afVar.Y());
        eVar.t(afVar.d());
    }

    public static void a(com.anythink.core.common.e.e eVar, com.anythink.core.c.d dVar) {
        if (eVar == null || dVar == null) {
            return;
        }
        if (dVar.S() == Integer.parseInt("1")) {
            eVar.o("1");
        } else {
            eVar.o("0");
        }
        eVar.D(dVar.J());
        eVar.u(dVar.P());
        eVar.v(dVar.Z());
        eVar.x(String.valueOf(dVar.S()));
        eVar.j(dVar.F());
        eVar.k(dVar.E());
        eVar.b(dVar.s());
        eVar.d(dVar.t());
        eVar.a(dVar.D());
        eVar.a(dVar.G());
        eVar.b(dVar.H());
        eVar.a(dVar.f());
        eVar.b(dVar.g());
    }

    public static void a(Context context, com.anythink.core.common.e.e eVar) {
        ab abVar;
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, ab> a = com.anythink.core.a.a.a(context).a(Integer.parseInt(eVar.U()));
        if (a != null) {
            i = 0;
            i2 = 0;
            for (ab abVar2 : a.values()) {
                i += abVar2.c;
                i2 += abVar2.d;
            }
            abVar = a.get(eVar.S());
        } else {
            abVar = null;
            i = 0;
            i2 = 0;
        }
        eVar.g(i + 1);
        eVar.h(i2 + 1);
        eVar.i((abVar != null ? abVar.c : 0) + 1);
        eVar.j((abVar != null ? abVar.d : 0) + 1);
        e.b("anythink", "Check cap waite time:" + (System.currentTimeMillis() - currentTimeMillis));
    }
}