package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.a.a;
import com.ironsource.sdk.a.b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.microsoft.appcenter.utils.PrefStorageConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceNetwork {
    private static e a;
    private static com.ironsource.sdk.j.d b;
    private static JSONObject c;

    private static synchronized void a() {
        synchronized (IronSourceNetwork.class) {
            if (a == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void applyConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            e eVar = a;
            if (eVar == null) {
                return;
            }
            if (jSONObject == null) {
                return;
            }
            eVar.a(jSONObject);
        }
    }

    public static com.ironsource.sdk.j.d getInitListener() {
        return b;
    }

    public static synchronized void getOfferWallCredits(com.ironsource.sdk.j.e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a(eVar);
        }
    }

    public static synchronized JSONObject getRawToken(Context context) {
        JSONObject b2;
        synchronized (IronSourceNetwork.class) {
            b2 = com.ironsource.sdk.service.d.a().b(context);
        }
        return b2;
    }

    public static synchronized String getToken(Context context) {
        String a2;
        synchronized (IronSourceNetwork.class) {
            a2 = com.ironsource.sdk.service.d.a().a(context);
        }
        return a2;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initOfferWall(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a(map, eVar);
        }
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e("IronSourceNetwork", "applicationKey is NULL");
                return;
            }
            if (a == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("events");
                    if (optJSONObject != null) {
                        a.C0108a c0108a = new a.C0108a(optJSONObject.optString("endpoint"));
                        c0108a.c = "GET";
                        c0108a.b = optJSONObject.optBoolean(PrefStorageConstants.KEY_ENABLED);
                        c0108a.d = new com.ironsource.sdk.a.c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Pair("Content-Type", "application/json"));
                        arrayList.add(new Pair("charset", "utf-8"));
                        c0108a.f.addAll(arrayList);
                        c0108a.e = false;
                        com.ironsource.a.a aVar = new com.ironsource.a.a(c0108a);
                        if (aVar.b) {
                            b.a aVar2 = new b.a();
                            if (map != null && map.containsKey("sessionid")) {
                                aVar2.a = map.get("sessionid");
                            }
                            aVar2.c = context;
                            aVar2.d = str2;
                            aVar2.b = str;
                            com.ironsource.sdk.a.d.a(aVar, new com.ironsource.sdk.a.b(aVar2, (byte) 0));
                        }
                    }
                } catch (Exception e) {
                    Logger.e("IronSourceNetwork", "Failed to init event tracker: " + e.getMessage());
                }
                a = com.ironsource.sdk.d.b.a(str, str2, context);
                applyConsentInfo(c);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(b bVar) {
        synchronized (IronSourceNetwork.class) {
            e eVar = a;
            if (eVar == null) {
                return false;
            }
            return eVar.a(bVar);
        }
    }

    public static synchronized void loadAd(Activity activity, b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a(activity, bVar, map);
        }
    }

    public static void onPause(Activity activity) {
        e eVar = a;
        if (eVar == null) {
            return;
        }
        eVar.b(activity);
    }

    public static void onResume(Activity activity) {
        e eVar = a;
        if (eVar == null) {
            return;
        }
        eVar.c(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            e eVar = a;
            if (eVar == null) {
                return;
            }
            eVar.a(activity);
        }
    }

    public static synchronized void requestToDestroyBanner() {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a();
        }
    }

    public static synchronized void setInitListener(com.ironsource.sdk.j.d dVar) {
        synchronized (IronSourceNetwork.class) {
            b = dVar;
        }
    }

    public static synchronized void showAd(b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a(bVar, map);
        }
    }

    public static synchronized void showOfferWall(Activity activity, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            a.a(activity, map);
        }
    }

    public static synchronized void updateConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            c = jSONObject;
            applyConsentInfo(jSONObject);
        }
    }

    public static synchronized void updateMetadata(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            com.ironsource.sdk.service.d a2 = com.ironsource.sdk.service.d.a();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.a("metadata_" + next, jSONObject.opt(next));
            }
        }
    }
}