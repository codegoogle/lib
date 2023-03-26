package com.anythink.expressad.foundation.g.a;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f {
    public static final String a = "native";
    public static final String b = "reward";
    public static final String c = "interactive";
    public static final String d = "interstitial";
    public static final String e = "banner";
    public static final String f = "splash";
    public static final String g = "h5_native";
    public static Map<String, Long> h = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> i = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> j = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> k = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> l = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> m = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> n = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> o = new HashMap();
    public static Map<String, List<com.anythink.expressad.foundation.g.e.a>> p = new HashMap();
    private static final String q = "f";

    public static void a(String str, com.anythink.expressad.foundation.d.c cVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b2 = b(str2);
        if (cVar == null || b2 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(cVar.aZ())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.aa());
            if (b2.containsKey(str)) {
                List<com.anythink.expressad.foundation.g.e.a> list = b2.get(str);
                if (list != null && list.size() == 20) {
                    list.remove(0);
                }
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            b2.put(str, arrayList);
        } catch (Throwable th) {
            n.b(q, th.getMessage(), th);
        }
    }

    private static void b(String str, com.anythink.expressad.foundation.d.c cVar, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b2 = b(str2);
        if (cVar == null || b2 == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(cVar.aZ())) {
                return;
            }
            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.aa());
            if (b2.containsKey(str)) {
                List<com.anythink.expressad.foundation.g.e.a> list = b2.get(str);
                if (list != null) {
                    list.add(aVar);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar);
            b2.put(str, arrayList);
        } catch (Throwable th) {
            n.b(q, th.getMessage(), th);
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> b(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals(e)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals(a)) {
                    c2 = 1;
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    c2 = 2;
                    break;
                }
                break;
            case -895866265:
                if (str.equals(f)) {
                    c2 = 3;
                    break;
                }
                break;
            case 538816457:
                if (str.equals(g)) {
                    c2 = 4;
                    break;
                }
                break;
            case 604727084:
                if (str.equals("interstitial")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1844104930:
                if (str.equals(c)) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return n;
            case 1:
                return j;
            case 2:
                return k;
            case 3:
                return o;
            case 4:
                return p;
            case 5:
                return m;
            case 6:
                return l;
            default:
                return null;
        }
    }

    private static String a(String str, String str2) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> b2;
        List<com.anythink.expressad.foundation.g.e.a> list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            b2 = null;
            if (j.containsKey(str)) {
                b2 = j;
            } else if (k.containsKey(str)) {
                b2 = k;
            } else if (l.containsKey(str)) {
                b2 = l;
            } else if (m.containsKey(str)) {
                b2 = m;
            } else if (n.containsKey(str)) {
                b2 = n;
            } else if (o.containsKey(str)) {
                b2 = o;
            } else if (p.containsKey(str)) {
                b2 = p;
            }
        } else {
            b2 = b(str2);
        }
        if (b2 != null) {
            try {
                if (v.b(str) && b2.containsKey(str) && (list = b2.get(str)) != null && list.size() > 0) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("cid", list.get(i2).a());
                        jSONObject.put("rid", list.get(i2).b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    private static void a(Map... mapArr) {
        try {
            for (Map map : mapArr) {
                if (map != null) {
                    map.clear();
                }
            }
        } catch (Throwable th) {
            n.b(q, th.getMessage(), th);
        }
    }

    private static Map<String, List<com.anythink.expressad.foundation.g.e.a>> a(String str) {
        if (j.containsKey(str)) {
            return j;
        }
        if (k.containsKey(str)) {
            return k;
        }
        if (l.containsKey(str)) {
            return l;
        }
        if (m.containsKey(str)) {
            return m;
        }
        if (n.containsKey(str)) {
            return n;
        }
        if (o.containsKey(str)) {
            return o;
        }
        if (p.containsKey(str)) {
            return p;
        }
        return null;
    }
}