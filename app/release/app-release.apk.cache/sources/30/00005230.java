package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ne3 extends me3 {
    private final String i = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    private final String j = "super.dwh.mediation_events";
    private final String k = "table";
    private final String l = "data";

    public ne3(int i) {
        this.g = i;
    }

    @Override // com.p7700g.p99005.me3
    public final String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<com.ironsource.mediationsdk.a.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject c = me3.c(it.next());
                    if (c != null) {
                        jSONArray.put(c);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", b(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // com.p7700g.p99005.me3
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    @Override // com.p7700g.p99005.me3
    public final String c() {
        return "ironbeast";
    }
}