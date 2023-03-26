package com.p7700g.p99005;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSTrigger.java */
/* loaded from: classes3.dex */
public class em3 {
    @x1
    public String a;
    @x1
    public a b;
    @z1
    public String c;
    @x1
    public b d;
    @z1
    public Object e;

    /* compiled from: OSTrigger.java */
    /* loaded from: classes3.dex */
    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM("custom"),
        UNKNOWN("unknown");
        
        private String x;

        a(String str) {
            this.x = str;
        }

        @x1
        public static a a(String str) {
            a[] values = values();
            for (int i = 0; i < 4; i++) {
                a aVar = values[i];
                if (aVar.x.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return UNKNOWN;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.x;
        }
    }

    /* compiled from: OSTrigger.java */
    /* loaded from: classes3.dex */
    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");
        
        private String C;

        b(String str) {
            this.C = str;
        }

        @x1
        public static b g(String str) {
            b[] values = values();
            for (int i = 0; i < 9; i++) {
                b bVar = values[i];
                if (bVar.C.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return EQUAL_TO;
        }

        public boolean f() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.C;
        }
    }

    public em3(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("id");
        this.b = a.a(jSONObject.getString("kind"));
        this.c = jSONObject.optString("property", null);
        this.d = b.g(jSONObject.getString("operator"));
        this.e = jSONObject.opt("value");
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("kind", this.b);
            jSONObject.put("property", this.c);
            jSONObject.put("operator", this.d.toString());
            jSONObject.put("value", this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder G = wo1.G("OSTrigger{triggerId='");
        wo1.d0(G, this.a, '\'', ", kind=");
        G.append(this.b);
        G.append(", property='");
        wo1.d0(G, this.c, '\'', ", operatorType=");
        G.append(this.d);
        G.append(", value=");
        G.append(this.e);
        G.append('}');
        return G.toString();
    }
}