package com.anythink.core.b.d;

import com.anythink.core.c.d;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j.e;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {
    public static final String a = "a";

    public static void a(final String str, final d dVar, final String str2, final int i, final List<af> list, final long j, final int i2, final int i3) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                e.d(a.a, "UnitGroupInfo Finish HeadBidding Tracking");
                JSONArray jSONArray = new JSONArray();
                com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
                eVar.v(str);
                eVar.w(str2);
                StringBuilder sb = new StringBuilder();
                sb.append(dVar.S());
                eVar.x(sb.toString());
                eVar.u(dVar.P());
                eVar.t(i);
                eVar.e(j);
                eVar.f(System.currentTimeMillis());
                eVar.D(dVar.J());
                eVar.v(dVar.Z());
                eVar.C(i2);
                eVar.q = i3;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    af afVar = (af) list.get(i4);
                    if (afVar.l() != 7 && afVar.j()) {
                        try {
                            int o = afVar.o();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", o);
                            jSONObject.put("unit_id", afVar.t());
                            jSONObject.put("bidresult", afVar.P());
                            jSONObject.put("bidprice", afVar.M() ? String.valueOf(afVar.x()) : "0");
                            jSONObject.put("nw_firm_id", String.valueOf(afVar.c()));
                            jSONObject.put("tp_bid_id", afVar.N() != null ? afVar.N().g : null);
                            jSONObject.put("rl_bid_status", afVar.O());
                            jSONObject.put("errormsg", afVar.z());
                            jSONArray.put(jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
                eVar.s(jSONArray.toString());
                com.anythink.core.common.i.a.a(m.a().e()).a(11, eVar);
            }
        });
    }
}