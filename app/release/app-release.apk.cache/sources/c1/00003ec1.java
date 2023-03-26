package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONUtils.java */
/* loaded from: classes3.dex */
public class dj3 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    if (j(jSONArray.get(i)).equals(j(jSONArray2.get(i2)))) {
                        break;
                    }
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    @x1
    private static Object b(@x1 Object obj) throws JSONException {
        if (obj instanceof JSONObject) {
            return i((JSONObject) obj);
        }
        return obj instanceof JSONArray ? g((JSONArray) obj) : obj;
    }

    public static JSONObject c(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> keys = jSONObject2.keys();
        JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String jSONObject5 = c(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!jSONObject5.equals("{}")) {
                            jSONObject4.put(next, new JSONObject(jSONObject5));
                        }
                    } else if (obj instanceof JSONArray) {
                        e(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject4);
                    } else if (set != null && set.contains(next)) {
                        jSONObject4.put(next, obj);
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (!obj.equals(obj2)) {
                            if ((obj2 instanceof Number) && (obj instanceof Number)) {
                                if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                    jSONObject4.put(next, obj);
                                }
                            } else {
                                jSONObject4.put(next, obj);
                            }
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(next, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    e(next, (JSONArray) obj, null, jSONObject4);
                } else {
                    jSONObject4.put(next, obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject4;
    }

    public static JSONObject d(aj3 aj3Var, String str) {
        if (aj3Var.b(str)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject h = aj3Var.h(str);
            Iterator<String> keys = h.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    Object obj = h.get(next);
                    if (!"".equals(obj)) {
                        jSONObject.put(next, obj);
                    }
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
        return null;
    }

    private static void e(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        if (!str.endsWith("_a") && !str.endsWith("_d")) {
            String k = k(jSONArray);
            JSONArray jSONArray3 = new JSONArray();
            JSONArray jSONArray4 = new JSONArray();
            String k2 = jSONArray2 == null ? null : k(jSONArray2);
            for (int i = 0; i < jSONArray.length(); i++) {
                String str2 = (String) jSONArray.get(i);
                if (jSONArray2 == null || !k2.contains(str2)) {
                    jSONArray3.put(str2);
                }
            }
            if (jSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    String string = jSONArray2.getString(i2);
                    if (!k.contains(string)) {
                        jSONArray4.put(string);
                    }
                }
            }
            if (!jSONArray3.toString().equals(zq5.e)) {
                jSONObject.put(str + "_a", jSONArray3);
            }
            if (jSONArray4.toString().equals(zq5.e)) {
                return;
            }
            jSONObject.put(str + "_d", jSONArray4);
            return;
        }
        jSONObject.put(str, jSONArray);
    }

    @z1
    public static List<Object> f(@z1 JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        return g(jSONArray);
    }

    @x1
    private static List<Object> g(@x1 JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(b(jSONArray.get(i)));
        }
        return arrayList;
    }

    @z1
    public static Map<String, Object> h(@z1 JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return i(jSONObject);
    }

    @x1
    private static Map<String, Object> i(@x1 JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, b(jSONObject.get(next)));
        }
        return hashMap;
    }

    public static Object j(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.equals(Integer.class)) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        return cls.equals(Float.class) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    public static String k(JSONArray jSONArray) {
        String str = "[";
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                str = str + "\"" + jSONArray.getString(i) + "\"";
            } catch (JSONException unused) {
            }
        }
        return wo1.t(str, "]");
    }

    public static String l(JSONObject jSONObject) {
        String group;
        String jSONObject2 = jSONObject.toString();
        if (jSONObject.has(un3.o)) {
            Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(jSONObject2);
            return (!matcher.find() || (group = matcher.group(0)) == null) ? jSONObject2 : matcher.replaceAll(Matcher.quoteReplacement(group.replace("\\/", "/")));
        }
        return jSONObject2;
    }
}