package com.p7700g.p99005;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsonPatchHelper.java */
/* loaded from: classes2.dex */
public class la1 {
    @x1
    public static final String a = "set";
    @x1
    public static final String b = "remove";
    @x1
    public static final String c = "object-merge";
    @x1
    public static final String d = "array-add";
    @x1
    public static final String e = "array-put";
    @x1
    public static final String f = "array-remove";
    @x1
    public static final String g = "strings-array-merge";
    @x1
    public static final String h = "action";
    @x1
    public static final String i = "value";
    @x1
    public static final String j = "key";
    @x1
    public static final String k = "path";
    @x1
    public static final String l = "index";
    @x1
    public static final String m = "where-field";
    @x1
    public static final String n = "where-value";
    @x1
    public static final String o = "where-key";
    @x1
    private static final kj1 p = kj1.b("JsonPatchHelper");
    @x1
    private final String q;
    @x1
    private JSONObject r;
    @z1
    private JSONException s;

    public la1(@x1 String str) {
        this.q = str;
        this.s = null;
        try {
            this.r = new JSONObject(str);
        } catch (JSONException e2) {
            this.s = e2;
            this.r = new JSONObject();
        }
    }

    private void a(@x1 JSONObject jSONObject, @x1 String str, @x1 Object obj) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            optJSONArray.put(obj);
        }
    }

    private void b(@x1 JSONObject jSONObject, @x1 JSONObject jSONObject2, @x1 String str, @x1 Object obj) throws JSONException {
        int i2 = jSONObject.getInt(l);
        JSONArray optJSONArray = jSONObject2.optJSONArray(str);
        if (i2 != -1) {
            if (optJSONArray != null) {
                optJSONArray.put(i2, obj);
                return;
            }
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(obj);
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            jSONArray.put(optJSONArray.get(i3));
        }
        jSONObject2.put(str, jSONArray);
    }

    private void c(@x1 JSONObject jSONObject, @x1 JSONObject jSONObject2, @x1 String str) throws JSONException {
        int i2 = jSONObject.getInt(l);
        JSONArray optJSONArray = jSONObject2.optJSONArray(str);
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
            if (i3 != i2) {
                jSONArray.put(optJSONArray.get(i3));
            }
        }
        jSONObject2.put(str, jSONArray);
    }

    @z1
    private Object d(@x1 String str) {
        if (this.s == null) {
            List asList = Arrays.asList(str.split("/"));
            Object obj = this.r;
            for (int i2 = 0; i2 < asList.size(); i2++) {
                try {
                    if (obj instanceof JSONObject) {
                        obj = ((JSONObject) obj).opt((String) asList.get(i2));
                    } else if (obj instanceof JSONArray) {
                        obj = ((JSONArray) obj).get(Integer.valueOf((String) asList.get(i2)).intValue());
                    }
                } catch (Exception e2) {
                    p.f(e2);
                    return null;
                }
            }
            return obj;
        }
        return null;
    }

    @z1
    private JSONObject g(@x1 JSONObject jSONObject) throws Exception {
        String optString = jSONObject.optString(k);
        String optString2 = jSONObject.optString(m);
        Object l2 = l(optString);
        if (!TextUtils.isEmpty(optString2)) {
            Object obj = jSONObject.get(n);
            if (l2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) l2;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    if (obj.equals(optJSONObject.get(optString2))) {
                        return optJSONObject;
                    }
                }
            }
        }
        if (l2 instanceof JSONObject) {
            return (JSONObject) l2;
        }
        return null;
    }

    @z1
    private Object l(@x1 String str) {
        if (TextUtils.isEmpty(str)) {
            return this.r;
        }
        List asList = Arrays.asList(str.split("\\\\"));
        Object obj = this.r;
        for (int i2 = 0; i2 < asList.size(); i2++) {
            try {
                if (obj instanceof JSONObject) {
                    obj = ((JSONObject) obj).opt((String) asList.get(i2));
                } else if (obj instanceof JSONArray) {
                    obj = ((JSONArray) obj).get(Integer.valueOf((String) asList.get(i2)).intValue());
                }
            } catch (Exception e2) {
                p.f(e2);
                return null;
            }
        }
        return obj;
    }

    private void m(@x1 JSONObject jSONObject, @x1 String str, @x1 JSONArray jSONArray) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            arrayList.add(optJSONArray.getString(i2));
        }
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            if (arrayList.indexOf(jSONArray.getString(i3)) == -1) {
                arrayList.add(jSONArray.getString(i3));
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray2.put((String) it.next());
        }
        jSONObject.put(str, jSONArray2);
    }

    private void n(@x1 JSONObject jSONObject, @x1 JSONObject jSONObject2) throws JSONException {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.get(next));
        }
    }

    private <T> void v(@x1 String str, @z1 T t) {
        if (this.s == null) {
            List asList = Arrays.asList(str.split("/"));
            Object obj = this.r;
            for (int i2 = 0; i2 < asList.size() - 1; i2++) {
                try {
                    if (obj instanceof JSONObject) {
                        obj = ((JSONObject) obj).opt((String) asList.get(i2));
                    } else if (obj instanceof JSONArray) {
                        obj = ((JSONArray) obj).get(Integer.valueOf((String) asList.get(i2)).intValue());
                    }
                } catch (Exception e2) {
                    p.f(e2);
                    return;
                }
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put((String) asList.get(asList.size() - 1), t);
            } else if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(Integer.valueOf((String) asList.get(asList.size() - 1)).intValue(), t);
            }
        }
    }

    @z1
    public JSONArray e(@x1 String str) {
        Object d2 = d(str);
        if (d2 instanceof JSONArray) {
            return (JSONArray) d2;
        }
        return null;
    }

    @z1
    public JSONObject f(@x1 String str) {
        Object d2 = d(str);
        if (d2 instanceof JSONObject) {
            return (JSONObject) d2;
        }
        return null;
    }

    @z1
    public JSONException h() {
        return this.s;
    }

    public int i(@x1 String str, int i2) {
        Object d2 = d(str);
        return d2 instanceof Integer ? ((Integer) d2).intValue() : i2;
    }

    @x1
    public String j() {
        if (this.s != null) {
            return this.q;
        }
        return this.r.toString();
    }

    @x1
    public JSONObject k() {
        return this.r;
    }

    @x1
    public la1 o(@x1 String str, long j2) {
        v(str, Long.valueOf(j2));
        return this;
    }

    @x1
    public la1 p(@x1 String str, @z1 String str2) {
        v(str, str2);
        return this;
    }

    @x1
    public la1 q(@x1 String str, @z1 Collection<String> collection) {
        v(str, collection);
        return this;
    }

    @x1
    public la1 r(@x1 String str, @x1 JSONArray jSONArray) {
        v(str, jSONArray);
        return this;
    }

    @x1
    public la1 s(@x1 String str, @z1 JSONObject jSONObject) {
        v(str, jSONObject);
        return this;
    }

    @x1
    public la1 t(@x1 String str, boolean z) {
        v(str, Boolean.valueOf(z));
        return this;
    }

    public void u(@x1 JSONArray jSONArray) throws Exception {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            JSONObject g2 = g(optJSONObject);
            if (g2 != null) {
                String optString = optJSONObject.optString("key");
                Object opt = optJSONObject.opt("value");
                String string = optJSONObject.getString("action");
                string.hashCode();
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1426093267:
                        if (string.equals(d)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1426078309:
                        if (string.equals(e)) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -934610812:
                        if (string.equals(b)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -878033671:
                        if (string.equals(g)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 113762:
                        if (string.equals(a)) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1559972472:
                        if (string.equals(f)) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 1918677034:
                        if (string.equals(c)) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        if (opt == null) {
                            break;
                        } else {
                            a(g2, optString, opt);
                            continue;
                        }
                    case 1:
                        if (opt != null) {
                            b(optJSONObject, g2, optString, opt);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        g2.remove(optString);
                        continue;
                    case 3:
                        if (opt != null) {
                            m(g2, optString, (JSONArray) opt);
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        g2.put(optString, opt);
                        continue;
                    case 5:
                        c(optJSONObject, g2, optString);
                        continue;
                    case 6:
                        if (opt != null) {
                            n(g2, (JSONObject) opt);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
    }

    @x1
    public la1 w(@x1 String str) {
        if (this.s == null) {
            List asList = Arrays.asList(str.split("/"));
            Object obj = this.r;
            for (int i2 = 0; i2 < asList.size() - 1; i2++) {
                try {
                    if (obj instanceof JSONObject) {
                        obj = ((JSONObject) obj).opt((String) asList.get(i2));
                    } else if (obj instanceof JSONArray) {
                        obj = ((JSONArray) obj).get(Integer.valueOf((String) asList.get(i2)).intValue());
                    }
                } catch (Exception e2) {
                    p.f(e2);
                }
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).remove((String) asList.get(asList.size() - 1));
            } else if (obj instanceof JSONArray) {
                ((JSONArray) obj).remove(Integer.valueOf((String) asList.get(asList.size() - 1)).intValue());
            }
        }
        return this;
    }
}