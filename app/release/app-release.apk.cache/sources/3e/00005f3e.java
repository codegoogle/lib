package com.p7700g.p99005;

import android.os.Bundle;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.v31;
import com.p7700g.p99005.xu0;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConnectionProbeEvent.java */
/* loaded from: classes.dex */
public class u21 extends gg1 {
    @x1
    private final List<g41> b;
    @x1
    private final ti1 c;
    @z1
    private final y41 d;
    @x1
    private final en1 e;
    @z1
    private v31.b f;

    public u21(@x1 List<g41> list, @x1 ti1 ti1Var, @z1 y41 y41Var, @z1 v31.b bVar, @x1 en1 en1Var) {
        super("connection_probe");
        this.b = list;
        this.c = ti1Var;
        this.d = y41Var;
        this.f = bVar;
        this.e = en1Var;
    }

    @Override // com.p7700g.p99005.gg1
    @x1
    public Bundle b() {
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            int size = this.b.size();
            float f = 0.0f;
            int i = 0;
            int i2 = 0;
            for (g41 g41Var : this.b) {
                if (g41Var.j()) {
                    i2++;
                } else {
                    i++;
                }
                f += g41Var.f();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("attempt", g41Var.a());
                jSONObject2.put("availability", g41Var.f());
                jSONObject2.put("quality", g41Var.h());
                jSONObject2.put("error", g41Var.d());
                jSONObject2.put("success", g41Var.j());
                jSONObject2.put("duration", g41Var.c());
                if (g41Var.e() != null) {
                    jSONObject2.put(xu0.f.v, g41Var.e().replace(CryptoConstants.ALIAS_SEPARATOR, "-"));
                }
                List<nd1> g = g41Var.g();
                if (g != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    for (nd1 nd1Var : g) {
                        jSONObject3.put(nd1Var.c(), nd1Var.a());
                    }
                    jSONObject2.put("probe", jSONObject3);
                }
                jSONArray.put(jSONObject2);
            }
            y41 y41Var = this.d;
            if (y41Var != null) {
                jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, y41Var.b());
                jSONObject.put(kg.z0, this.d.e());
                jSONObject.put("target_country", this.d.d());
                for (String str : this.d.c().keySet()) {
                    jSONObject.put(str, this.d.c().get(str));
                }
            }
            jSONObject.put(xu0.f.k, f / this.b.size());
            jSONObject.put(xu0.f.c, this.c.d());
            jSONObject.put("connection_start_at", this.c.g());
            jSONObject.put("connection_duration", System.currentTimeMillis() - this.c.e());
            jSONObject.put("attempts", jSONArray);
            jSONObject.put("failed_attempts", i);
            jSONObject.put("success_attempts", i2);
            jSONObject.put("total_attempts", size);
            jSONObject.put("from_state", this.e.toString());
            v31.b bVar = this.f;
            if (bVar != null) {
                jSONObject.put("ip_family", bVar.a());
            } else {
                jSONObject.put("ip_family", 0);
            }
        } catch (JSONException e) {
            w21.a.f(e);
        }
        bundle.putString(xu0.f.c, this.c.d());
        bundle.putString(xu0.f.l, jSONObject.toString());
        y41 y41Var2 = this.d;
        if (y41Var2 != null) {
            bundle.putString("partner_carrier", y41Var2.a());
        }
        return bundle;
    }
}