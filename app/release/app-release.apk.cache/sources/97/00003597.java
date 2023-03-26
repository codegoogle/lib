package com.ironsource.sdk.a;

import android.content.Context;
import com.ironsource.sdk.g.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {
    private com.ironsource.mediationsdk.adunit.a.a a = new com.ironsource.mediationsdk.adunit.a.a();

    public static d.e a(com.ironsource.sdk.g.c cVar, d.e eVar) {
        Map<String, String> map;
        return (cVar == null || (map = cVar.d) == null || map.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.d.get("rewarded")) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(com.ironsource.sdk.g.c cVar) {
        if (cVar == null || cVar.d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.d.get("inAppBidding"));
    }

    public void a(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("itp", Integer.valueOf(i));
    }

    public void a(Context context) {
        com.ironsource.mediationsdk.adunit.a.a.a(context);
    }

    public void a(com.ironsource.c.b bVar) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("omv", com.ironsource.c.b.b());
            hashMap.put("ompv", com.ironsource.c.b.c());
            hashMap.put("sdkv", com.ironsource.c.b.a());
            com.ironsource.mediationsdk.adunit.a.a.a(hashMap);
        } catch (Exception unused) {
        }
    }

    public void a(Boolean bool) {
        com.ironsource.mediationsdk.adunit.a.a.a("fs", bool);
    }

    public void a(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("apky", str);
    }

    public void a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("md", (Object) jSONObject);
    }

    public void a(boolean z) {
        com.ironsource.mediationsdk.adunit.a.a.a("cnst", Boolean.valueOf(z));
    }

    public void b(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("medv", str);
    }

    public void b(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("tkgp", (Object) jSONObject);
    }

    public void b(boolean z) {
        com.ironsource.mediationsdk.adunit.a.a.a("gpi", Boolean.valueOf(z));
    }

    public void c(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("sid", str);
    }

    public void d(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("plugin", str);
    }

    public void e(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("usid", str);
    }

    public void f(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("audt", str);
    }
}