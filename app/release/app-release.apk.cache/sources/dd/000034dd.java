package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.pt0;
import com.p7700g.p99005.te3;
import com.p7700g.p99005.zg2;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1274f {
    private static C1274f a = new C1274f();
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    /* loaded from: classes3.dex */
    public static class a {
        public String a;
        public List<com.ironsource.mediationsdk.server.b> b;
        public com.ironsource.mediationsdk.server.b c;
        public JSONObject d;
        public JSONObject e;
        public int f;
        public String g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$p */
    /* loaded from: classes3.dex */
    public static class p implements Runnable {
        private String s;
        private String t;
        private String u;

        public p(String str, String str2, String str3) {
            this.s = str;
            this.t = str2;
            this.u = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.u).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z = true;
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("exception - e");
            }
            if (z) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.s + AppCenter.PAIR_DELIMITER + this.t + AppCenter.PAIR_DELIMITER + this.u);
            } catch (JSONException e) {
                e.printStackTrace();
                IronLog.INTERNAL.error("Send auction failure exception " + e.getMessage());
            }
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.ironsource.mediationsdk.f$q */
    /* loaded from: classes3.dex */
    public static final class q {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] s = {1, 2};
    }

    public static a a(JSONObject jSONObject) {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a();
        aVar.a = optString;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new com.ironsource.mediationsdk.server.b(jSONObject2);
            r0 = jSONObject2.has("armData") ? jSONObject2.optJSONObject("armData") : null;
            if (jSONObject2.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                aVar.d = jSONObject2.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
        }
        aVar.b = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
        for (int i = 0; i < jSONArray.length(); i++) {
            com.ironsource.mediationsdk.server.b bVar = new com.ironsource.mediationsdk.server.b(jSONArray.getJSONObject(i), r0);
            if (!bVar.g()) {
                aVar.f = 1002;
                aVar.g = "waterfall " + i;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                throw new JSONException("invalid response");
            }
            aVar.b.add(bVar);
        }
        return aVar;
    }

    public static C1274f a() {
        return a;
    }

    public static com.ironsource.mediationsdk.server.b a(String str, List<com.ironsource.mediationsdk.server.b> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).a().equals(str)) {
                return list.get(i);
            }
        }
        return null;
    }

    public static String a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
        }
        return hashMap;
    }

    public static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e.getMessage());
            return str;
        }
    }

    public static String d(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !com.ironsource.mediationsdk.c.b.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("parameters = " + jSONObject2);
                if (jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID)) {
                    str2 = jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID);
                    ironLog.verbose("demand source = " + str2);
                    return str2;
                }
                return "";
            }
            return "";
        } catch (JSONException e) {
            e.printStackTrace();
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception " + e.getMessage());
            return str2;
        }
    }

    public static JSONObject e(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject g(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    public static void h(String str, String str2, String str3) {
        com.ironsource.environment.e.c.a.c(new p(str, str2, str3));
    }

    private void i(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.has(next)) {
                int i = 0;
                str = next;
                while (jSONObject.has(str)) {
                    i++;
                    str = next + "_" + i;
                }
            } else {
                str = next;
            }
            try {
                jSONObject.put(str, jSONObject2.opt(next));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int j() {
        int i = q.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return i;
            }
        } else if (i2 >= 23) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0)) {
                return i;
            }
        }
        return q.a;
    }

    private JSONObject k(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = com.ironsource.environment.l.b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !com.ironsource.environment.l.a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    private JSONObject l(JSONObject jSONObject, List<String> list) {
        return list.isEmpty() ? jSONObject : g(jSONObject, list);
    }

    private JSONObject m(JSONObject jSONObject, List<String> list) {
        if (list.isEmpty()) {
            list = com.ironsource.environment.l.a;
        }
        return g(jSONObject, list);
    }

    public final String a(String str, int i, com.ironsource.mediationsdk.server.b bVar, String str2, String str3, String str4) {
        String str5;
        String c = bVar.c();
        if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != zg2.s) {
                str5 = String.valueOf(Math.round((parseDouble / parseDouble2) * 1000.0d) / 1000.0d);
                return a(str, bVar.a(), i, d(bVar.b()), c, str5, str3, str4);
            }
        }
        str5 = "";
        return a(str, bVar.a(), i, d(bVar.b()), c, str5, str3, str4);
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        JSONObject m = m(te3.a().f(), list);
        i(m, k(jSONObject, list));
        i(m, l(jSONObject2, list));
        return m;
    }

    public final void a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString("tcs")) || !this.b.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
    }

    public final JSONObject b(Context context, Map<String, Object> map, List<String> list, C1277j c1277j, int i, String str, com.ironsource.mediationsdk.utils.c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        Object obj;
        String str2;
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            obj = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instanceType", 2);
            jSONObject3.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (c1277j != null) {
                obj = c1277j.a(next);
            }
            jSONObject3.put("performance", obj);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instanceType", 1);
                jSONObject4.put("performance", c1277j != null ? c1277j.a(str3) : "");
                jSONObject2.put(str3, jSONObject4);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C1272d.a().i;
        concurrentHashMap.putAll(com.ironsource.d.a.a().d());
        JSONObject jSONObject5 = new JSONObject();
        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
            jSONObject5.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
        }
        a(new com.ironsource.environment.a.b().a(), false);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("applicationUserId", L.a().k);
        Boolean bool = L.a().R;
        if (bool != null) {
            jSONObject6.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject6.put("mobileCarrier", com.ironsource.environment.h.i(context));
        jSONObject6.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject6.put("deviceOS", pt0.a);
        jSONObject6.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject6.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject6.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject6.put("deviceModel", Build.MODEL);
        jSONObject6.put("deviceMake", Build.MANUFACTURER);
        jSONObject6.put("bundleId", context.getPackageName());
        jSONObject6.put("appVersion", com.ironsource.environment.c.c(context, context.getPackageName()));
        jSONObject6.put("clientTimestamp", new Date().getTime());
        jSONObject6.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject6.put("browserUserAgent", com.ironsource.environment.h.r());
        jSONObject6.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject6.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject6.put("secure", j() - 1);
        if (iSBannerSize != null) {
            jSONObject6.put("bannerSize", iSBannerSize.getDescription());
            jSONObject6.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject6.put("bannerHeight", iSBannerSize.getHeight());
        }
        String[] C = com.ironsource.environment.h.C(context);
        if (C == null || C.length != 2) {
            str2 = "";
            z = false;
        } else {
            str2 = !TextUtils.isEmpty(C[0]) ? C[0] : "";
            z = Boolean.valueOf(C[1]).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.ironsource.environment.h.x(context);
            if (!TextUtils.isEmpty(str2)) {
                obj = IronSourceConstants.TYPE_UUID;
            }
        } else {
            obj = IronSourceConstants.TYPE_GAID;
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject6.put("advId", str2);
            jSONObject6.put("advIdType", obj);
            jSONObject6.put("isLimitAdTrackingEnabled", z ? "true" : "false");
        }
        String B = com.ironsource.environment.h.B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject6.put("asid", B);
        }
        String y = com.ironsource.environment.h.y(context);
        if (!TextUtils.isEmpty(y)) {
            jSONObject6.put("auid", y);
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationKey", L.a().j);
        jSONObject7.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject7.put("clientParams", jSONObject6);
        jSONObject7.put(IronSourceConstants.KEY_SESSION_DEPTH, i);
        jSONObject7.put("sessionId", str);
        jSONObject7.put("instances", jSONObject2);
        jSONObject7.put("auctionData", cVar.c);
        jSONObject7.put("metaData", jSONObject5);
        if (jSONObject != null) {
            jSONObject7.put("sg", jSONObject);
        }
        return jSONObject7;
    }

    public final JSONObject f(String str, boolean z, Map<String, Object> map, List<String> list, C1277j c1277j, int i, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instp", 2);
            jSONObject4.put("badt", new JSONObject((Map) map.get(next)));
            if (c1277j != null) {
                str2 = c1277j.a(next);
            }
            jSONObject4.put("prfm", str2);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instp", 1);
                jSONObject5.put("prfm", c1277j != null ? c1277j.a(str3) : "");
                jSONObject3.put(str3, jSONObject5);
            }
        }
        jSONObject2.put("inst", jSONObject3);
        JSONObject a2 = new com.ironsource.environment.a.b().a();
        a(a2, false);
        a2.put("sd", i);
        a2.put("scr", j() - 1);
        if (jSONObject != null) {
            a2.put("sg", jSONObject);
        }
        jSONObject2.put("ctdt", a2);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("bns", iSBannerSize.getDescription());
            jSONObject6.put("bnw", iSBannerSize.getWidth());
            jSONObject6.put("bnh", iSBannerSize.getHeight());
            jSONObject2.put("bndt", jSONObject6);
        }
        jSONObject2.put("adu", str);
        jSONObject2.put("dner", !z ? 1 : 0);
        return jSONObject2;
    }
}