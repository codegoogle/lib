package com.p7700g.p99005;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEvent.java */
/* loaded from: classes3.dex */
public class hl3 {
    private static final String a = "session";
    private static final String b = "notification_ids";
    private static final String c = "id";
    private static final String d = "timestamp";
    private static final String e = "weight";
    private fo3 f;
    private JSONArray g;
    private String h;
    private long i;
    private Float j;

    public hl3(@x1 fo3 fo3Var, @z1 JSONArray jSONArray, @x1 String str, long j, float f) {
        this.f = fo3Var;
        this.g = jSONArray;
        this.h = str;
        this.i = j;
        this.j = Float.valueOf(f);
    }

    public static hl3 a(bp3 bp3Var) {
        JSONArray jSONArray;
        fo3 fo3Var = fo3.UNATTRIBUTED;
        if (bp3Var.b() != null) {
            dp3 b2 = bp3Var.b();
            if (b2.a() != null && b2.a().b() != null && b2.a().b().length() > 0) {
                fo3Var = fo3.DIRECT;
                jSONArray = b2.a().b();
            } else if (b2.b() != null && b2.b().b() != null && b2.b().b().length() > 0) {
                fo3Var = fo3.INDIRECT;
                jSONArray = b2.b().b();
            }
            return new hl3(fo3Var, jSONArray, bp3Var.a(), bp3Var.c(), bp3Var.d());
        }
        jSONArray = null;
        return new hl3(fo3Var, jSONArray, bp3Var.a(), bp3Var.c(), bp3Var.d());
    }

    public String b() {
        return this.h;
    }

    public JSONArray c() {
        return this.g;
    }

    public fo3 d() {
        return this.f;
    }

    public long e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hl3 hl3Var = (hl3) obj;
        return this.f.equals(hl3Var.f) && this.g.equals(hl3Var.g) && this.h.equals(hl3Var.h) && this.i == hl3Var.i && this.j.equals(hl3Var.j);
    }

    public float f() {
        return this.j.floatValue();
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session", this.f);
        jSONObject.put("notification_ids", this.g);
        jSONObject.put("id", this.h);
        jSONObject.put("timestamp", this.i);
        jSONObject.put("weight", this.j);
        return jSONObject;
    }

    public JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.g;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.g);
        }
        jSONObject.put("id", this.h);
        if (this.j.floatValue() > 0.0f) {
            jSONObject.put("weight", this.j);
        }
        long j = this.i;
        if (j > 0) {
            jSONObject.put("timestamp", j);
        }
        return jSONObject;
    }

    public int hashCode() {
        int i = 1;
        Object[] objArr = {this.f, this.g, this.h, Long.valueOf(this.i), this.j};
        for (int i2 = 0; i2 < 5; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    public String toString() {
        StringBuilder G = wo1.G("OutcomeEvent{session=");
        G.append(this.f);
        G.append(", notificationIds=");
        G.append(this.g);
        G.append(", name='");
        wo1.d0(G, this.h, '\'', ", timestamp=");
        G.append(this.i);
        G.append(", weight=");
        G.append(this.j);
        G.append('}');
        return G.toString();
    }
}