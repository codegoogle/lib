package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1284r {

    /* renamed from: com.ironsource.mediationsdk.r$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.r$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void a(String str);
    }

    public static JSONObject a(Context context, String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0112a.a.a(context);
        for (String str : strArr) {
            if (a2.has(str)) {
                jSONObject.put(str, a2.opt(str));
            }
        }
        return jSONObject;
    }

    public static JSONObject a(String[] strArr) {
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0112a.a.a(ContextProvider.getInstance().getApplicationContext());
        for (String str : strArr) {
            if (a2.has(str)) {
                jSONObject.put(str, a2.opt(str));
            }
        }
        return jSONObject;
    }

    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i;
        try {
            String description = iSBannerSize.getDescription();
            char c = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                i = 1;
            } else if (c == 1) {
                i = 2;
            } else if (c == 2) {
                i = 3;
            } else if (c != 3) {
                if (c != 4) {
                    return;
                }
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                i = 5;
            }
            map.put("bannerAdSize", i);
        } catch (Exception e) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e));
        }
    }

    public static void b(String str, ConcurrentHashMap<String, V> concurrentHashMap, a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (V v : concurrentHashMap.values()) {
                if (v.h()) {
                    Map<String, Object> c = v.c();
                    if (c != null) {
                        hashMap.put(v.k(), c);
                        sb = new StringBuilder("2");
                        sb.append(v.k());
                        sb.append(",");
                        sb2.append(sb.toString());
                    } else {
                        v.a(IronSourceConstants.TROUBLESHOOTING_BN_BIDDING_DATA_MISSING, new Object[][]{new Object[]{"reason", "Missing bidding data"}});
                    }
                } else if (!v.h()) {
                    arrayList.add(v.k());
                    sb = new StringBuilder("1");
                    sb.append(v.k());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
        }
        aVar.a(hashMap, arrayList, sb2);
    }

    public static boolean c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    public JSONObject a(ArrayList<String> arrayList) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        JSONObject jSONObject = new JSONObject();
        JSONObject a2 = a.C0112a.a.a(applicationContext);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (a2.has(next)) {
                jSONObject.put(next, a2.opt(next));
            }
        }
        return jSONObject;
    }
}