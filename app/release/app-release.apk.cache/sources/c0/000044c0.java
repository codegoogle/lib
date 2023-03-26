package com.p7700g.p99005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageInternal.java */
/* loaded from: classes3.dex */
public class gk3 extends zj3 {
    private static final String c = "id";
    private static final String d = "messageId";
    private static final String e = "variants";
    private static final String f = "triggers";
    private static final String g = "redisplay";
    private static final String h = "displayDuration";
    private static final String i = "end_time";
    private static final String j = "has_liquid";
    @x1
    public HashMap<String, HashMap<String, String>> k;
    @x1
    public ArrayList<ArrayList<em3>> l;
    @x1
    private Set<String> m;
    private pk3 n;
    private double o;
    private boolean p;
    private boolean q;
    private boolean r;
    private Date s;
    public boolean t;
    private boolean u;

    public gk3(boolean z) {
        super("");
        this.n = new pk3();
        this.p = false;
        this.q = false;
        this.t = z;
    }

    private Date m(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals(pg1.d)) {
                return null;
            }
            try {
                return zm3.a().parse(string);
            } catch (ParseException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
        }
    }

    private HashMap<String, HashMap<String, String>> o(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap<String, String> hashMap2 = new HashMap<>();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    @Override // com.p7700g.p99005.zj3
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("messageId", this.b);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.k.keySet()) {
                HashMap<String, String> hashMap = this.k.get(str);
                JSONObject jSONObject3 = new JSONObject();
                for (String str2 : hashMap.keySet()) {
                    jSONObject3.put(str2, hashMap.get(str2));
                }
                jSONObject2.put(str, jSONObject3);
            }
            jSONObject.put(e, jSONObject2);
            jSONObject.put(h, this.o);
            jSONObject.put(g, this.n.n());
            JSONArray jSONArray = new JSONArray();
            Iterator<ArrayList<em3>> it = this.l.iterator();
            while (it.hasNext()) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<em3> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next().a());
                }
                jSONArray.put(jSONArray2);
            }
            jSONObject.put(f, jSONArray);
            if (this.s != null) {
                jSONObject.put("end_time", zm3.a().format(this.s));
            }
            jSONObject.put(j, this.u);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void c(String str) {
        this.m.add(str);
    }

    public void d() {
        this.m.clear();
    }

    @x1
    public Set<String> e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((gk3) obj).b);
    }

    public double f() {
        return this.o;
    }

    public boolean g() {
        return this.u;
    }

    public pk3 h() {
        return this.n;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean i(String str) {
        return !this.m.contains(str);
    }

    public boolean j() {
        return this.p;
    }

    public boolean k() {
        if (this.s == null) {
            return false;
        }
        return this.s.before(new Date());
    }

    public boolean l() {
        return this.q;
    }

    public ArrayList<ArrayList<em3>> n(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<em3>> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
            ArrayList<em3> arrayList2 = new ArrayList<>();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                arrayList2.add(new em3(jSONArray2.getJSONObject(i3)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public void p(String str) {
        this.m.remove(str);
    }

    public void q(double d2) {
        this.o = d2;
    }

    public void r(boolean z) {
        this.p = z;
    }

    public void s(boolean z) {
        this.u = z;
    }

    public void t(int i2, long j2) {
        this.n = new pk3(i2, j2);
    }

    public String toString() {
        StringBuilder G = wo1.G("OSInAppMessage{messageId='");
        wo1.d0(G, this.b, '\'', ", variants=");
        G.append(this.k);
        G.append(", triggers=");
        G.append(this.l);
        G.append(", clickedClickIds=");
        G.append(this.m);
        G.append(", redisplayStats=");
        G.append(this.n);
        G.append(", displayDuration=");
        G.append(this.o);
        G.append(", displayedInSession=");
        G.append(this.p);
        G.append(", triggerChanged=");
        G.append(this.q);
        G.append(", actionTaken=");
        G.append(this.r);
        G.append(", isPreview=");
        G.append(this.t);
        G.append(", endTime=");
        G.append(this.s);
        G.append(", hasLiquid=");
        G.append(this.u);
        G.append('}');
        return G.toString();
    }

    public void u(boolean z) {
        this.q = z;
    }

    public boolean v() {
        if (this.r) {
            return false;
        }
        this.r = true;
        return true;
    }

    public gk3(@x1 String str, @x1 Set<String> set, boolean z, pk3 pk3Var) {
        super(str);
        this.n = new pk3();
        this.p = false;
        this.q = false;
        this.m = set;
        this.p = z;
        this.n = pk3Var;
    }

    public gk3(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.n = new pk3();
        this.p = false;
        this.q = false;
        this.k = o(jSONObject.getJSONObject(e));
        this.l = n(jSONObject.getJSONArray(f));
        this.m = new HashSet();
        this.s = m(jSONObject);
        if (jSONObject.has(j)) {
            this.u = jSONObject.getBoolean(j);
        }
        if (jSONObject.has(g)) {
            this.n = new pk3(jSONObject.getJSONObject(g));
        }
    }
}