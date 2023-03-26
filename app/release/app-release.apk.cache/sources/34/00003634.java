package com.ironsource.sdk.d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.p7700g.p99005.rs2;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements com.ironsource.sdk.d.c, com.ironsource.sdk.e, com.ironsource.sdk.f, com.ironsource.sdk.j.a.a, com.ironsource.sdk.j.a.b, com.ironsource.sdk.j.a.c, com.ironsource.sdk.j.a.d {
    private static b b;
    public com.ironsource.sdk.controller.g a;
    public com.ironsource.sdk.j.e d;
    public String e;
    public String f;
    private long g;
    public com.ironsource.sdk.controller.j h;
    private com.ironsource.sdk.service.d i;
    private com.ironsource.sdk.service.c j;
    private com.ironsource.sdk.controller.c l;
    private final String c = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
    private boolean k = false;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ Map s;
        private /* synthetic */ com.ironsource.sdk.j.e t;

        public a(Map map, com.ironsource.sdk.j.e eVar) {
            this.s = map;
            this.t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(bVar.e, bVar.f, this.s, this.t);
        }
    }

    /* renamed from: com.ironsource.sdk.d.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0128b implements Runnable {
        private /* synthetic */ Map s;

        public RunnableC0128b(Map map) {
            this.s = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, bVar.d);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.j.e u;

        public c(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.s = str;
            this.t = str2;
            this.u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.a.a(this.s, this.t, this.u);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.e s;

        public d(com.ironsource.sdk.j.e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(bVar.e, bVar.f, this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.g.c u;

        public e(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.s = str;
            this.t = str2;
            this.u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, this.t, this.u, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        private /* synthetic */ String s;

        public f(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.g.c u;

        public g(String str, String str2, com.ironsource.sdk.g.c cVar) {
            this.s = str;
            this.t = str2;
            this.u = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, this.t, this.u, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        private /* synthetic */ JSONObject s;

        public h(JSONObject jSONObject) {
            this.s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, (com.ironsource.sdk.j.a.c) bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.a.d();
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ JSONObject s;

        public j(JSONObject jSONObject) {
            this.s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.a.a(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        private /* synthetic */ com.ironsource.sdk.b s;
        private /* synthetic */ Map t;

        public k(com.ironsource.sdk.b bVar, Map map) {
            this.s = bVar;
            this.t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.g.c a = b.this.h.a(d.e.Interstitial, this.s.b);
            if (a != null) {
                b bVar = b.this;
                bVar.a.a(a, this.t, (com.ironsource.sdk.j.a.c) bVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ com.ironsource.sdk.b s;
        private /* synthetic */ Map t;

        public l(com.ironsource.sdk.b bVar, Map map) {
            this.s = bVar;
            this.t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = this.s.a() ? d.e.Banner : d.e.Interstitial;
            com.ironsource.sdk.controller.j jVar = b.this.h;
            com.ironsource.sdk.b bVar = this.s;
            String str = bVar.b;
            String str2 = bVar.c;
            HashMap hashMap = new HashMap();
            hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_ID, bVar.b);
            hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_INSTANCE_NAME, bVar.c);
            hashMap.put("rewarded", Boolean.toString(bVar.a));
            hashMap.put("inAppBidding", Boolean.toString(bVar.d));
            hashMap.put("isOneFlow", Boolean.toString(bVar.i));
            hashMap.put("apiVersion", "2");
            com.ironsource.sdk.a aVar = bVar.e;
            hashMap.put("width", aVar != null ? Integer.toString(aVar.a) : "0");
            com.ironsource.sdk.a aVar2 = bVar.e;
            hashMap.put("height", aVar2 != null ? Integer.toString(aVar2.b) : "0");
            com.ironsource.sdk.a aVar3 = bVar.e;
            hashMap.put(rs2.f.d, aVar3 != null ? aVar3.c : "");
            hashMap.put("isBanner", Boolean.toString(bVar.a()));
            Map<String, String> map = bVar.f;
            if (map != null) {
                hashMap.putAll(map);
            }
            com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str2, hashMap, bVar.g);
            jVar.a(eVar, str, cVar);
            com.ironsource.sdk.a.a aVar4 = new com.ironsource.sdk.a.a();
            com.ironsource.sdk.a.a a = aVar4.a("isbiddinginstance", Boolean.valueOf(this.s.d)).a("isoneflow", Boolean.valueOf(this.s.i)).a("demandsourcename", this.s.c).a("producttype", com.ironsource.sdk.d.a(this.s));
            com.ironsource.sdk.service.a aVar5 = com.ironsource.sdk.service.a.a;
            a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.s.b)));
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.g, aVar4.a);
            if (eVar == d.e.Banner) {
                b bVar2 = b.this;
                bVar2.a.a(bVar2.e, bVar2.f, cVar, (com.ironsource.sdk.j.a.b) bVar2);
                this.s.h = true;
                b bVar3 = b.this;
                bVar3.a.a(cVar, this.t, (com.ironsource.sdk.j.a.b) bVar3);
                return;
            }
            b bVar4 = b.this;
            bVar4.a.a(bVar4.e, bVar4.f, cVar, (com.ironsource.sdk.j.a.c) bVar4);
            this.s.h = true;
            b bVar5 = b.this;
            bVar5.a.a(cVar, this.t, (com.ironsource.sdk.j.a.c) bVar5);
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ com.ironsource.sdk.g.c s;
        private /* synthetic */ Map t;

        public m(com.ironsource.sdk.g.c cVar, Map map) {
            this.s = cVar;
            this.t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.b(this.s, this.t, bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Runnable {
        private /* synthetic */ JSONObject s;

        public n(JSONObject jSONObject) {
            this.s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.a.a(this.s, (com.ironsource.sdk.j.a.d) bVar);
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ Map u;
        private /* synthetic */ com.ironsource.sdk.j.e v;

        public o(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.s = str;
            this.t = str2;
            this.u = map;
            this.v = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.a.a(this.s, this.t, this.u, this.v);
        }
    }

    private b(Context context) {
        e(context);
    }

    private b(String str, String str2, Context context) {
        this.e = str;
        this.f = str2;
        e(context);
    }

    public static synchronized b a(Context context) {
        b a2;
        synchronized (b.class) {
            a2 = a(context, 0);
        }
        return a2;
    }

    public static synchronized b a(Context context, int i2) {
        b bVar;
        synchronized (b.class) {
            Logger.i("IronSourceAdsPublisherAgent", "getInstance()");
            if (b == null) {
                b = new b(context);
            }
            bVar = b;
        }
        return bVar;
    }

    public static synchronized com.ironsource.sdk.e a(String str, String str2, Context context) {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.a);
                b = new b(str, str2, context);
            } else {
                com.ironsource.sdk.service.d.a().b(str);
                com.ironsource.sdk.service.d.a().a(str2);
            }
            bVar = b;
        }
        return bVar;
    }

    private static com.ironsource.sdk.j.f b(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.f) cVar.g;
    }

    private void c(Context context, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("enableLifeCycleListeners", false);
        this.k = optBoolean;
        if (optBoolean) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new com.ironsource.sdk.d.a(this));
            } catch (Throwable th) {
                com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
                aVar.a("generalmessage", th.getMessage());
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.q, aVar.a);
            }
        }
    }

    private static com.ironsource.sdk.j.c d(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.c) cVar.g;
    }

    private void e(Context context) {
        try {
            JSONObject networkConfiguration = SDKUtils.getNetworkConfiguration();
            com.ironsource.sdk.utils.b.a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new com.ironsource.sdk.h.e(SDKUtils.getNetworkConfiguration().optJSONObject("storage")));
            com.ironsource.sdk.utils.b.a().a(SDKUtils.getSDKVersion());
            this.i = h(context);
            this.h = new com.ironsource.sdk.controller.j();
            com.ironsource.sdk.controller.c cVar = new com.ironsource.sdk.controller.c();
            this.l = cVar;
            if (context instanceof Activity) {
                cVar.a((Activity) context);
            }
            this.a = new com.ironsource.sdk.controller.g(context, this.l, this.i, this.h, com.ironsource.environment.e.a.a);
            Logger.enableLogging(FeaturesManager.getInstance().getDebugMode());
            Logger.i("IronSourceAdsPublisherAgent", "C'tor");
            c(context, networkConfiguration);
            this.j = new com.ironsource.sdk.service.c();
            com.ironsource.mediationsdk.adunit.a.a.a("sdkv", "5.118");
            this.j.a();
            this.j.a(context);
            this.j.b();
            this.j.c();
            this.j.b(context);
            this.j.d();
            this.g = 0L;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void f(com.ironsource.sdk.b bVar, Map<String, String> map) {
        if (bVar.h) {
            i(bVar, map);
        } else {
            k(bVar, map);
        }
    }

    private static com.ironsource.sdk.j.b g(com.ironsource.sdk.g.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (com.ironsource.sdk.j.b) cVar.g;
    }

    private com.ironsource.sdk.service.d h(Context context) {
        com.ironsource.sdk.service.d a2 = com.ironsource.sdk.service.d.a();
        a2.b();
        a2.a(context, this.e, this.f);
        return a2;
    }

    private void i(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnInitializedInstance " + bVar.b);
        this.a.a(new k(bVar, map));
    }

    private com.ironsource.sdk.g.c j(d.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.h.a(eVar, str);
    }

    private void k(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.d("IronSourceAdsPublisherAgent", "loadOnNewInstance " + bVar.b);
        this.a.a(new l(bVar, map));
    }

    @Override // com.ironsource.sdk.e
    public final void a() {
        this.a.a(new i());
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity) {
        try {
            Logger.i("IronSourceAdsPublisherAgent", "release()");
            com.ironsource.sdk.utils.a.a();
            this.l.b();
            this.a.b(activity);
            this.a.destroy();
            this.a = null;
        } catch (Exception unused) {
        }
        b = null;
    }

    @Override // com.ironsource.sdk.e
    public final void a(Activity activity, com.ironsource.sdk.b bVar, Map<String, String> map) {
        this.l.a(activity);
        long currentTimeMillis = System.currentTimeMillis();
        map.put("loadStartTime", String.valueOf(currentTimeMillis));
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
        com.ironsource.sdk.service.a.a(bVar.b, currentTimeMillis);
        com.ironsource.sdk.a.a aVar2 = new com.ironsource.sdk.a.a();
        aVar2.a("isbiddinginstance", Boolean.valueOf(bVar.d)).a("isoneflow", Boolean.valueOf(bVar.i)).a("demandsourcename", bVar.c).a("producttype", com.ironsource.sdk.d.a(bVar)).a("custom_c", Long.valueOf(currentTimeMillis));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.e, aVar2.a);
        Logger.d("IronSourceAdsPublisherAgent", "loadAd " + bVar.b);
        if (!(bVar.d || bVar.i)) {
            f(bVar, map);
            return;
        }
        try {
            map.put("adm", SDKUtils.decodeString(map.get("adm")));
        } catch (Exception e2) {
            com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).a("generalmessage", bVar.h ? com.ironsource.sdk.f.b.a : com.ironsource.sdk.f.b.b).a("isbiddinginstance", Boolean.valueOf(bVar.d)).a("isoneflow", Boolean.valueOf(bVar.i)).a("demandsourcename", bVar.c).a("producttype", com.ironsource.sdk.d.a(bVar));
            com.ironsource.sdk.service.a aVar3 = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.a.a a3 = a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(bVar.b)));
            com.ironsource.sdk.service.a.b(bVar.b);
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.j, a3.a);
            e2.printStackTrace();
            Logger.d("IronSourceAdsPublisherAgent", "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        f(bVar, map);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(Activity activity, Map<String, String> map) {
        if (activity != null) {
            this.l.a(activity);
        }
        this.a.a(new RunnableC0128b(map));
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.b bVar, Map<String, String> map) {
        Logger.i("IronSourceAdsPublisherAgent", "showAd " + bVar.b);
        com.ironsource.sdk.g.c a2 = this.h.a(d.e.Interstitial, bVar.b);
        if (a2 == null) {
            return;
        }
        this.a.a(new m(a2, map));
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str) {
        com.ironsource.sdk.j.c d2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        if (j2 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b2 = b(j2);
                if (b2 != null) {
                    b2.onRVAdClosed();
                }
            } else if (eVar != d.e.Interstitial || (d2 = d(j2)) == null) {
            } else {
                d2.onInterstitialClose();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, com.ironsource.sdk.g.a aVar) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        if (j2 != null) {
            j2.a(2);
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b2 = b(j2);
                if (b2 != null) {
                    b2.onRVInitSuccess(aVar);
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d2 = d(j2);
                if (d2 != null) {
                    d2.onInterstitialInitSuccess();
                }
            } else if (eVar != d.e.Banner || (g2 = g(j2)) == null) {
            } else {
                g2.onBannerInitSuccess();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, String str2) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("demandsourcename", str).a("producttype", eVar).a("callfailreason", str2);
        com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
        com.ironsource.sdk.a.a a3 = a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j2.b)));
        com.ironsource.sdk.service.a.b(j2.b);
        a3.a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j2)));
        j2.a(3);
        if (eVar == d.e.RewardedVideo) {
            com.ironsource.sdk.j.f b2 = b(j2);
            if (b2 != null) {
                b2.onRVInitFail(str2);
            }
        } else if (eVar == d.e.Interstitial) {
            com.ironsource.sdk.j.c d2 = d(j2);
            if (d2 != null) {
                d2.onInterstitialInitFailed(str2);
            }
        } else if (eVar == d.e.Banner && (g2 = g(j2)) != null) {
            g2.onBannerInitFailed(str2);
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.h, a3.a);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void a(d.e eVar, String str, String str2, JSONObject jSONObject) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        if (j2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.i("IronSourceAdsPublisherAgent", "Received Event Notification: " + str2 + " for demand source: " + j2.a);
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d2 = d(j2);
                if (d2 != null) {
                    jSONObject.put("demandSourceName", str);
                    d2.onInterstitialEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b2 = b(j2);
                if (b2 != null) {
                    jSONObject.put("demandSourceName", str);
                    b2.onRVEventNotificationReceived(str2, jSONObject);
                }
            } else if (eVar != d.e.Banner || (g2 = g(j2)) == null) {
            } else {
                jSONObject.put("demandSourceName", str);
                if (str2.equalsIgnoreCase("impressions")) {
                    g2.onBannerShowSuccess();
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.e
    public final void a(com.ironsource.sdk.j.e eVar) {
        this.a.a(new d(eVar));
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, int i2) {
        com.ironsource.sdk.j.f b2;
        com.ironsource.sdk.g.c j2 = j(d.e.RewardedVideo, str);
        if (j2 == null || (b2 = b(j2)) == null) {
            return;
        }
        b2.onRVAdCredited(i2);
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void a(String str, com.ironsource.sdk.c.a aVar) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(d.e.Banner, str);
        if (j2 == null || (g2 = g(j2)) == null) {
            return;
        }
        g2.onBannerLoadSuccess(aVar);
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void a(String str, String str2) {
        com.ironsource.sdk.j.f b2;
        com.ironsource.sdk.g.c j2 = j(d.e.RewardedVideo, str);
        if (j2 == null || (b2 = b(j2)) == null) {
            return;
        }
        b2.onRVShowFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, int i2) {
        d.e productType;
        com.ironsource.sdk.g.c a2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (a2 = this.h.a(productType, str2)) == null) {
            return;
        }
        a2.c = i2;
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.e = str;
        this.f = str2;
        this.a.a(new c(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.c cVar) {
        this.e = str;
        this.f = str2;
        this.a.a(new e(str, str2, this.h.a(d.e.Interstitial, str3, map, cVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, String str3, Map<String, String> map, com.ironsource.sdk.j.f fVar) {
        this.e = str;
        this.f = str2;
        this.a.a(new g(str, str2, this.h.a(d.e.RewardedVideo, str3, map, fVar)));
    }

    @Override // com.ironsource.sdk.f
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.e = str;
        this.f = str2;
        this.d = eVar;
        this.a.a(new o(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.e
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.d = eVar;
        this.a.a(new a(map, eVar));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("gdprConsentStatus")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("consent", Boolean.parseBoolean(jSONObject.getString("gdprConsentStatus")));
                this.i.a(jSONObject2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.a.a(new j(jSONObject));
    }

    @Override // com.ironsource.sdk.e
    public final boolean a(com.ironsource.sdk.b bVar) {
        Logger.d("IronSourceAdsPublisherAgent", "isAdAvailable " + bVar.b);
        com.ironsource.sdk.g.c a2 = this.h.a(d.e.Interstitial, bVar.b);
        if (a2 == null) {
            return false;
        }
        return a2.f;
    }

    @Override // com.ironsource.sdk.f
    public final boolean a(String str) {
        return this.a.c(str);
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void b(Activity activity) {
        if (this.k) {
            return;
        }
        d(activity);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void b(d.e eVar, String str) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        if (j2 != null) {
            if (eVar == d.e.RewardedVideo) {
                com.ironsource.sdk.j.f b2 = b(j2);
                if (b2 != null) {
                    b2.onRVAdClicked();
                }
            } else if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d2 = d(j2);
                if (d2 != null) {
                    d2.onInterstitialClick();
                }
            } else if (eVar != d.e.Banner || (g2 = g(j2)) == null) {
            } else {
                g2.onBannerClick();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.d
    public final void b(String str) {
        com.ironsource.sdk.j.f b2;
        com.ironsource.sdk.g.c j2 = j(d.e.RewardedVideo, str);
        if (j2 == null || (b2 = b(j2)) == null) {
            return;
        }
        b2.onRVNoMoreOffers();
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, int i2) {
        com.ironsource.sdk.g.c j2 = j(d.e.Interstitial, str);
        com.ironsource.sdk.j.c d2 = d(j2);
        if (j2 == null || d2 == null) {
            return;
        }
        d2.onInterstitialAdRewarded(str, i2);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void b(String str, String str2) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        aVar.a("callfailreason", str2).a("demandsourcename", str);
        if (j2 != null) {
            com.ironsource.sdk.a.a a2 = aVar.a("producttype", com.ironsource.sdk.a.e.a(j2, eVar)).a("generalmessage", j2.e == 2 ? com.ironsource.sdk.f.b.a : com.ironsource.sdk.f.b.b).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j2)));
            com.ironsource.sdk.service.a aVar2 = com.ironsource.sdk.service.a.a;
            a2.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j2.b)));
            com.ironsource.sdk.service.a.b(j2.b);
            com.ironsource.sdk.j.c d2 = d(j2);
            if (d2 != null) {
                d2.onInterstitialLoadFailed(str2);
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f, aVar.a);
    }

    @Override // com.ironsource.sdk.f
    public final void b(JSONObject jSONObject) {
        this.a.a(new n(jSONObject));
    }

    @Override // com.ironsource.sdk.e, com.ironsource.sdk.f
    public final void c(Activity activity) {
        if (this.k) {
            return;
        }
        e(activity);
    }

    @Override // com.ironsource.sdk.j.a.a
    public final void c(d.e eVar, String str) {
        com.ironsource.sdk.j.f b2;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        if (j2 != null) {
            if (eVar == d.e.Interstitial) {
                com.ironsource.sdk.j.c d2 = d(j2);
                if (d2 != null) {
                    d2.onInterstitialOpen();
                }
            } else if (eVar != d.e.RewardedVideo || (b2 = b(j2)) == null) {
            } else {
                b2.onRVAdOpened();
            }
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str) {
        d.e eVar = d.e.Interstitial;
        com.ironsource.sdk.g.c j2 = j(eVar, str);
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("demandsourcename", str);
        if (j2 != null) {
            com.ironsource.sdk.a.a a3 = a2.a("producttype", com.ironsource.sdk.a.e.a(j2, eVar)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(j2)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
            a3.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(j2.b)));
            com.ironsource.sdk.service.a.b(j2.b);
            com.ironsource.sdk.j.c d2 = d(j2);
            if (d2 != null) {
                d2.onInterstitialLoadSuccess();
            }
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.k, a2.a);
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void c(String str, String str2) {
        com.ironsource.sdk.j.c d2;
        com.ironsource.sdk.g.c j2 = j(d.e.Interstitial, str);
        if (j2 == null || (d2 = d(j2)) == null) {
            return;
        }
        d2.onInterstitialShowFailed(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void c(JSONObject jSONObject) {
        String optString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.a.a(new f(optString));
    }

    @Override // com.ironsource.sdk.d.c
    public final void d(Activity activity) {
        try {
            this.a.f();
            this.a.b(activity);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.j.a.c
    public final void d(String str) {
        com.ironsource.sdk.j.c d2;
        com.ironsource.sdk.g.c j2 = j(d.e.Interstitial, str);
        if (j2 == null || (d2 = d(j2)) == null) {
            return;
        }
        d2.onInterstitialShowSuccess();
    }

    @Override // com.ironsource.sdk.j.a.b
    public final void d(String str, String str2) {
        com.ironsource.sdk.j.b g2;
        com.ironsource.sdk.g.c j2 = j(d.e.Banner, str);
        if (j2 == null || (g2 = g(j2)) == null) {
            return;
        }
        g2.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.sdk.f
    public final void d(JSONObject jSONObject) {
        this.a.a(new h(jSONObject));
    }

    @Override // com.ironsource.sdk.d.c
    public final void e(Activity activity) {
        this.l.a(activity);
        this.a.e();
        this.a.a(activity);
    }
}