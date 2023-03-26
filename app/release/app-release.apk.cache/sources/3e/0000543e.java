package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oe3 extends me3 {
    private final String i = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    public oe3(int i) {
        this.g = i;
    }

    @Override // com.p7700g.p99005.me3
    public final String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f = jSONObject;
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
        return b(jSONArray);
    }

    @Override // com.p7700g.p99005.me3
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    @Override // com.p7700g.p99005.me3
    public final String c() {
        return "outcome";
    }
}