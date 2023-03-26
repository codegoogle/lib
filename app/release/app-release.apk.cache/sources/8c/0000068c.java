package com.anythink.core.common.h;

import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.c.d;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.e;
import com.anythink.core.common.g.h;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements com.anythink.core.common.f.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j, long j2, e eVar, ATBaseAdAdapter aTBaseAdAdapter) {
        String str;
        Map<String, Object> networkInfoMap;
        try {
            networkInfoMap = aTBaseAdAdapter.getNetworkInfoMap();
        } catch (Throwable unused) {
        }
        try {
            if (networkInfoMap != null) {
                str = new JSONObject(networkInfoMap).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pl_id", eVar.S());
                jSONObject.put("req_id", eVar.T());
                jSONObject.put("show_id", eVar.k());
                jSONObject.put("unit_id", eVar.w());
                jSONObject.put("nw_firm_id", eVar.G());
                jSONObject.put("scenario_id", eVar.C);
                jSONObject.put("rv_start_ts", j);
                jSONObject.put("r_callback_ts", j2);
                jSONObject.put("rv_play_dur", j2 - j);
                jSONObject.put("tp_bid_id", eVar.d());
                jSONObject.put("extra_info", str);
                jSONObject.put("user_id", aTBaseAdAdapter.getUserId());
                jSONObject.put("extra_data", aTBaseAdAdapter.getUserCustomData());
                jSONObject.put("curr_ts", System.currentTimeMillis());
                jSONObject.put(d.a.i, j.a(eVar, aTBaseAdAdapter).toString());
                return jSONObject.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pl_id", eVar.S());
            jSONObject2.put("req_id", eVar.T());
            jSONObject2.put("show_id", eVar.k());
            jSONObject2.put("unit_id", eVar.w());
            jSONObject2.put("nw_firm_id", eVar.G());
            jSONObject2.put("scenario_id", eVar.C);
            jSONObject2.put("rv_start_ts", j);
            jSONObject2.put("r_callback_ts", j2);
            jSONObject2.put("rv_play_dur", j2 - j);
            jSONObject2.put("tp_bid_id", eVar.d());
            jSONObject2.put("extra_info", str);
            jSONObject2.put("user_id", aTBaseAdAdapter.getUserId());
            jSONObject2.put("extra_data", aTBaseAdAdapter.getUserCustomData());
            jSONObject2.put("curr_ts", System.currentTimeMillis());
            jSONObject2.put(d.a.i, j.a(eVar, aTBaseAdAdapter).toString());
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
        str = "";
    }

    @Override // com.anythink.core.common.f.c
    public final void a(final long j, final long j2, final ATBaseAdAdapter aTBaseAdAdapter, final e eVar) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (aTBaseAdAdapter.getUnitGroupInfo().S() != 1) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = j2;
                    long j4 = (j3 == 0 || elapsedRealtime < j3) ? elapsedRealtime : j3;
                    com.anythink.core.c.d a = com.anythink.core.c.e.a(m.a().e()).a(eVar.S());
                    JSONObject jSONObject = new JSONObject(a.a(a.p()));
                    int optInt = jSONObject.optInt("a");
                    b a2 = a.a(jSONObject.optString("b"), d.b(j, j4, eVar, aTBaseAdAdapter));
                    if (TextUtils.isEmpty(a2.a())) {
                        com.anythink.core.common.i.c.a(eVar, a, "", a2.b());
                    } else {
                        new c(m.a().e(), optInt, a2.a(), eVar, a).a(0, (h) null);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}