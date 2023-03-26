package com.p7700g.p99005;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HydraProxyRules.java */
/* loaded from: classes.dex */
public class o31 {
    @x1
    public static final String a = "type";
    @x1
    public static final String b = "file";

    @x1
    public static JSONArray a(@x1 Context context, @x1 File file, @x1 String str, @x1 List<a81> list) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        Map<String, List<a81>> c = c(list);
        for (String str2 : c.keySet()) {
            List<a81> list2 = c.get(str2);
            if (list2 != null) {
                LinkedList linkedList = new LinkedList();
                HashMap hashMap = new HashMap();
                for (a81 a81Var : list2) {
                    File d = a81Var.d(context, file);
                    if (d != null) {
                        linkedList.add(d);
                    }
                    hashMap.putAll(a81Var.g());
                }
                File b2 = i31.b("dns", linkedList);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str2);
                jSONObject.put(b, b2);
                for (String str3 : hashMap.keySet()) {
                    jSONObject.put(str3, hashMap.get(str3));
                }
                jSONArray.put(jSONObject);
            }
        }
        for (a81 a81Var2 : list) {
            if (!a81Var2.i()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", a81Var2.e());
                Map<String, Object> g = a81Var2.g();
                for (String str4 : g.keySet()) {
                    jSONObject2.put(str4, g.get(str4));
                }
                jSONArray.put(jSONObject2);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("default", 1);
        jSONObject3.put("type", str);
        jSONArray.put(jSONObject3);
        return jSONArray;
    }

    @x1
    public static JSONArray b(@x1 Context context, @x1 String str, @x1 List<a81> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Map<String, List<a81>> c = c(list);
        for (String str2 : c.keySet()) {
            List<a81> list2 = c.get(str2);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                for (a81 a81Var : list2) {
                    List<String> c2 = a81Var.c(context);
                    if (c2 != null) {
                        arrayList.addAll(c2);
                    }
                    hashMap.putAll(a81Var.g());
                }
                d(jSONArray, str2, arrayList, hashMap);
            }
        }
        for (a81 a81Var2 : list) {
            if (!a81Var2.i()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", a81Var2.e());
                Map<String, Object> g = a81Var2.g();
                for (String str3 : g.keySet()) {
                    jSONObject.put(str3, g.get(str3));
                }
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("default", 1);
        jSONObject2.put("type", str);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    @x1
    private static Map<String, List<a81>> c(@x1 List<a81> list) {
        HashMap hashMap = new HashMap();
        for (a81 a81Var : list) {
            List list2 = (List) hashMap.get(a81Var.e());
            if (list2 == null) {
                list2 = new LinkedList();
                if (a81Var.i()) {
                    hashMap.put(a81Var.e(), list2);
                }
            }
            list2.add(a81Var);
        }
        return hashMap;
    }

    private static void d(@x1 JSONArray jSONArray, @x1 String str, @x1 List<String> list, @x1 Map<String, Object> map) throws JSONException {
        for (String str2 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("FQDN", str2);
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
            }
            jSONArray.put(jSONObject);
        }
    }
}