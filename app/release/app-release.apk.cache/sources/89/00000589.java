package com.anythink.core.b;

import com.anythink.core.common.e.af;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.p7700g.p99005.zq5;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends e {
    public String a;
    public List<af> b;

    public c(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.a = com.anythink.core.common.j.g.a(aVar.a, this.j, this.k, aVar.e, 0).toString();
        if (aVar.j == null) {
            this.b = new ArrayList(4);
        } else {
            this.b = new ArrayList(aVar.j);
        }
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, com.anythink.core.common.g.h hVar) {
        String str;
        int size;
        JSONArray jSONArray = new JSONArray();
        List<af> list2 = this.b;
        if (list2 != null && (size = list2.size()) > 0) {
            for (int i = 0; i < size; i++) {
                af afVar = list2.get(i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ad_source_id", afVar.t());
                    jSONObject.put("price", afVar.x());
                    m N = afVar.N();
                    if (N != null) {
                        jSONObject.put("tp_bid_id", N.g);
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (this.c.m) {
            JSONArray jSONArray3 = new JSONArray();
            if (this.p != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_source_id", this.p.k);
                    jSONObject2.put("tp_bid_id", this.p.g);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                jSONArray3.put(jSONObject2);
            }
            str = jSONArray3.toString();
        } else {
            str = zq5.e;
        }
        com.anythink.core.b.a.a aVar = new com.anythink.core.b.a.a(this.l, this.k, this.j, list, 0);
        aVar.a(this.a, jSONArray2, str);
        aVar.b(this.c.n.am());
        aVar.a(0, hVar);
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.c.l;
    }

    @Override // com.anythink.core.b.e, com.anythink.core.b.d
    public final void a(af afVar, l lVar, long j) {
        super.a(afVar, lVar, j);
        if (afVar.aa()) {
            return;
        }
        com.anythink.core.common.j.g.a(this.b, afVar, false);
    }
}