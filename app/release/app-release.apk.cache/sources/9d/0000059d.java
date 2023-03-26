package com.anythink.core.b;

import com.p7700g.p99005.zg2;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j implements Comparable<j> {
    public int a;
    public String b;
    public double c;
    public String d;

    public final double a() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j jVar) {
        return this.a < jVar.a ? -1 : 1;
    }

    private void a(double d) {
        this.c = d;
    }

    public static j a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            j jVar = new j();
            jVar.a = jSONObject.optInt("prority");
            jVar.b = jSONObject.optString("ad_source_id");
            if (jSONObject.has("price")) {
                jVar.c = jSONObject.optDouble("price");
            } else {
                jVar.c = zg2.s;
            }
            jVar.d = jSONObject.optString("tp_bid_id");
            return jVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private int a(j jVar) {
        return this.a < jVar.a ? -1 : 1;
    }
}