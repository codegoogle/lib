package com.anythink.expressad.splash.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.anythink.core.common.b.m;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.microsoft.appcenter.AppCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private static final String a = "b";

    private static String a() {
        return "";
    }

    private static String a(String str) {
        List<com.anythink.expressad.foundation.g.e.a> list;
        try {
            Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.i;
            if (map == null || !v.b(str) || !map.containsKey(str) || (list = map.get(str)) == null || list.size() <= 0) {
                return "";
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                com.anythink.expressad.foundation.g.e.a aVar = list.get(i);
                jSONObject.put("cid", aVar.a());
                jSONObject.put("crid", aVar.c());
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String b() {
        return "";
    }

    private static void a(String str, List<c> list) {
        Map<String, List<com.anythink.expressad.foundation.g.e.a>> map = f.i;
        if (map == null || list == null || list.size() <= 0) {
            return;
        }
        if (v.b(str)) {
            if (map.containsKey(str)) {
                map.put(str, a(map.get(str), list));
            } else {
                map.put(str, a(new ArrayList(), list));
            }
        }
        f.i = map;
    }

    private static synchronized List<com.anythink.expressad.foundation.g.e.a> a(List<com.anythink.expressad.foundation.g.e.a> list, List<c> list2) {
        synchronized (b.class) {
            if (list2 != null) {
                if (list2.size() > 0) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    for (c cVar : list2) {
                        if (cVar != null) {
                            com.anythink.expressad.foundation.g.e.a aVar = new com.anythink.expressad.foundation.g.e.a(cVar.aZ(), cVar.q());
                            if (list.size() >= 20) {
                                list.remove(0);
                            }
                            list.add(aVar);
                        }
                    }
                }
            }
        }
        return list;
    }

    private static void a(Context context, List<c> list) {
        String str = a;
        n.b(str, "updateInstallList 开始 更新本机已安装广告列表");
        if (context != null && list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                c cVar = list.get(i);
                if (cVar != null) {
                    s.a(context, cVar.ba());
                }
            }
            return;
        }
        n.b(str, "updateInstallList 列表为空 不做更新本机已安装广告列表");
    }

    public static c a(String str, c cVar) {
        if (TextUtils.isEmpty(str)) {
            return cVar;
        }
        if (TextUtils.isEmpty(str) && cVar == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject a2 = c.a(cVar);
                c b = c.b(a2);
                if (b == null) {
                    b = cVar;
                }
                if (!TextUtils.isEmpty(str)) {
                    String optString = a2.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        b.j(optString);
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject(com.anythink.expressad.foundation.g.a.ce);
                    if (optJSONObject != null) {
                        String.valueOf(s.b(m.a().e(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cc)).intValue()));
                        String.valueOf(s.b(m.a().e(), Integer.valueOf(optJSONObject.getString(com.anythink.expressad.foundation.g.a.cd)).intValue()));
                    }
                    b.n(b.af());
                    String aj = b.aj();
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (keys.hasNext()) {
                            sb.append("&");
                            String next = keys.next();
                            String optString2 = optJSONObject.optString(next);
                            if (com.anythink.expressad.foundation.g.a.cc.equals(next) || com.anythink.expressad.foundation.g.a.cd.equals(next)) {
                                optString2 = String.valueOf(s.b(m.a().e(), Integer.valueOf(optString2).intValue()));
                            }
                            sb.append(next);
                            sb.append(AppCenter.KEY_VALUE_DELIMITER);
                            sb.append(optString2);
                        }
                        b.o(aj + ((Object) sb));
                    }
                }
                return b;
            } catch (Throwable unused) {
                return cVar;
            }
        }
        try {
            JSONObject a3 = c.a(cVar);
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (!jSONObject.has(c.N)) {
                    a3.put(c.N, "");
                }
            } catch (Exception unused2) {
            }
            Iterator<String> keys2 = jSONObject.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                a3.put(next2, jSONObject.getString(next2));
            }
            c b2 = c.b(a3);
            String optString3 = a3.optString("unitId");
            if (!TextUtils.isEmpty(optString3)) {
                b2.j(optString3);
            }
            return b2;
        } catch (JSONException e) {
            e.printStackTrace();
            return cVar;
        }
    }

    public static String a(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (i == 4) {
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cc, -999);
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cd, -999);
            } else {
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cc, s.a(m.a().e(), f));
                jSONObject2.put(com.anythink.expressad.foundation.g.a.cd, s.a(m.a().e(), f2));
            }
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cf, i);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, m.a().e().getResources().getConfiguration().orientation);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, s.c(m.a().e()));
            jSONObject.put(com.anythink.expressad.foundation.g.a.ce, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            n.d(a, "code to string is error");
            return "";
        }
    }
}