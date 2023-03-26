package com.anythink.expressad.video.module.b;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.b.m;
import com.anythink.expressad.d.a.b;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.wo1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {
    public static HashMap<String, ArrayList<String>> a = new HashMap<>();
    private static final String b = "VideoViewReport";

    public static void a() {
    }

    public static void a(String str) {
        a.remove(str);
    }

    public static void b(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().j() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().j(), false);
    }

    public static void c(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().k() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().k(), false);
    }

    public static void d(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().q() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().q(), false);
    }

    public static void e(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().m() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().m(), false);
    }

    private static void f(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().d() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().d(), true);
    }

    private static void g(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().e() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().e(), false);
    }

    private static void h(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().f() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().f(), false);
    }

    private static void i(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().g() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().g(), false);
    }

    private static void j(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().h() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().h(), false);
    }

    private static void k(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().l() == null) {
            return;
        }
        String I = cVar.I();
        ArrayList<String> arrayList = a.get(I);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            a.put(I, arrayList);
        }
        if (arrayList.contains(cVar.aZ())) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().l(), false);
        arrayList.add(cVar.aZ());
    }

    public static void a(Context context, c cVar) {
        if (cVar == null || cVar.J() == null || cVar.J().o() == null) {
            return;
        }
        com.anythink.expressad.a.a.a(context, cVar, cVar.I(), cVar.J().o(), false);
    }

    public static void a(Context context, c cVar, int i, int i2) {
        try {
            String[] p = cVar.J().p();
            if (cVar.J() == null || p == null) {
                return;
            }
            String[] strArr = new String[p.length];
            for (int i3 = 0; i3 < p.length; i3++) {
                String str = p[i3];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i);
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = i.a(jSONObject2);
                }
                if (!TextUtils.isEmpty(jSONObject2)) {
                    str = str + "&value=" + URLEncoder.encode(jSONObject2);
                }
                strArr[i3] = cVar.m() == 1 ? str + "&to=1&cbt=" + cVar.aB() + "&tmorl=" + i2 : str + "&to=0&cbt=" + cVar.aB() + "&tmorl=" + i2;
            }
            com.anythink.expressad.a.a.a(context, cVar, cVar.I(), strArr, true);
        } catch (Throwable unused) {
            n.d("", "reportEndcardshowData error");
        }
    }

    public static void a(Context context, c cVar, int i, int i2, int i3) {
        String str;
        if (i2 == 0 || context == null || cVar == null) {
            return;
        }
        try {
            List<Map<Integer, String>> i4 = cVar.J().i();
            int i5 = ((i + 1) * 100) / i2;
            if (i4 != null) {
                int i6 = 0;
                while (i6 < i4.size()) {
                    Map<Integer, String> map = i4.get(i6);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int intValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (cVar.m() == 1) {
                                str = value + "&to=1&cbt=" + cVar.aB() + "&tmorl=" + i3;
                            } else {
                                str = value + "&to=0&cbt=" + cVar.aB() + "&tmorl=" + i3;
                            }
                            if (intValue <= i5 && !TextUtils.isEmpty(str)) {
                                com.anythink.expressad.a.a.a(context, cVar, cVar.I(), new String[]{str}, true);
                                it.remove();
                                i4.remove(i6);
                                i6--;
                            }
                        }
                    }
                    i6++;
                }
            }
        } catch (Throwable unused) {
            n.d("", "reportPlayPercentageData error");
        }
    }

    public static void a(c cVar, Map<Integer, String> map, String str, int i) {
        if (cVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    String value = next.getValue();
                    if (i == next.getKey().intValue() && !TextUtils.isEmpty(value)) {
                        com.anythink.expressad.a.a.a(m.a().e(), cVar, str, value, false);
                        it.remove();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(c cVar, String str) {
        if (cVar != null) {
            try {
                if (cVar.ap() == null || cVar.ap().size() <= 0) {
                    return;
                }
                for (String str2 : cVar.ap()) {
                    if (!TextUtils.isEmpty(str2)) {
                        com.anythink.expressad.a.a.a(m.a().e(), cVar, str, str2, false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(c cVar, com.anythink.expressad.videocommon.c.c cVar2, String str, String str2, String str3) {
        String str4 = "&";
        String str5 = "";
        if (cVar == null || cVar2 == null) {
            return;
        }
        try {
            com.anythink.expressad.video.module.c.a aVar = new com.anythink.expressad.video.module.c.a(m.a().e());
            com.anythink.expressad.foundation.g.f.h.c cVar3 = new com.anythink.expressad.foundation.g.f.h.c();
            cVar3.a("user_id", i.a(str2));
            cVar3.a(b.aM, "1");
            cVar3.a("reward_name", cVar2.a());
            StringBuilder sb = new StringBuilder();
            sb.append(cVar2.b());
            cVar3.a("reward_amount", sb.toString());
            cVar3.a("unit_id", str);
            cVar3.a("click_id", cVar.ab());
            if (!TextUtils.isEmpty(str3)) {
                cVar3.a("extra", str3);
            }
            aVar.a("", cVar3);
            String str6 = cVar.ao() + "/addReward?";
            String trim = cVar3.a().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (!str6.endsWith("?") && !str6.endsWith("&")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str6);
                    if (!str6.contains("?")) {
                        str4 = "?";
                    }
                    sb2.append(str4);
                    str6 = sb2.toString();
                }
                str5 = str6 + trim;
            }
            n.d(b, "rewardUrl:".concat(String.valueOf(str5)));
            com.anythink.expressad.a.a.a(m.a().e(), cVar, cVar.I(), str5, false);
        } catch (Throwable th) {
            n.b(b, th.getMessage(), th);
        }
    }

    private static String a(String str, com.anythink.expressad.foundation.g.f.h.c cVar) {
        String trim = cVar.a().trim();
        if (TextUtils.isEmpty(trim)) {
            return "";
        }
        if (!str.endsWith("?") && !str.endsWith("&")) {
            StringBuilder G = wo1.G(str);
            G.append(str.contains("?") ? "&" : "?");
            str = G.toString();
        }
        return wo1.t(str, trim);
    }
}