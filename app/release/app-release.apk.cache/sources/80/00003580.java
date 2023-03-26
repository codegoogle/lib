package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.ironsource.mediationsdk.G;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.model.q;
import com.ironsource.sdk.controller.u;
import com.microsoft.appcenter.utils.PrefStorageConstants;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.un3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l {
    private final String A;
    private final String A0;
    private final String B;
    private final String B0;
    private final String C;
    private final String C0;
    private final String D;
    private final String D0;
    private final String E;
    private final String E0;
    private final String F;
    private final String F0;
    private final String G;
    private final String G0;
    private final String H;
    private final String H0;
    private final String I;
    private final String I0;
    private final String J;
    private final String J0;
    private final String K;
    private final String K0;
    private final String L;
    private final String L0;
    private final String M;
    private final String M0;
    private final String N;
    private final String N0;
    private final String O;
    private final String O0;
    private final String P;
    private final String P0;
    private final String Q;
    private final String Q0;
    private final String R;
    private final String R0;
    private final String S;
    private final String S0;
    private final String T;
    private final String T0;
    private final String U;
    private final String U0;
    private final String V;
    private final String V0;
    private final String W;
    private final String W0;
    private final String X;
    private final String X0;
    private final String Y;
    private final String Y0;
    private final String Z;
    private final String Z0;
    public com.ironsource.mediationsdk.model.n a;
    private final String a0;
    private final String a1;
    public com.ironsource.mediationsdk.model.o b;
    private final String b0;
    private final String b1;
    public com.ironsource.mediationsdk.model.h c;
    private final String c0;
    private final String c1;
    public JSONObject d;
    private final String d0;
    private final String d1;
    public int e;
    private final String e0;
    private final String e1;
    private final String f;
    private final String f0;
    private final String f1;
    private final int g;
    private final String g0;
    private final String g1;
    private final int h;
    private final String h0;
    private final String h1;
    private final int i;
    private final String i0;
    private final String i1;
    private final int j;
    private final String j0;
    private final String j1;
    private final int k;
    private final String k0;
    private final String k1;
    private final int l;
    private final String l0;
    private final String l1;
    private final int m;
    private final String m0;
    private final String m1;
    private final int n;
    private final String n0;
    private final String n1;
    private final int o;
    private final String o0;
    private final String o1;
    private final int p;
    private final String p0;
    private final String p1;
    private final int q;
    private final String q0;
    private final String q1;
    private final long r;
    private final String r0;
    private final String r1;
    private final int s;
    private final String s0;
    private final String s1;
    private final boolean t;
    private final String t0;
    private final String t1;
    private final int u;
    private final String u0;
    private final String u1;
    private final int v;
    private final String v0;
    private final String v1;
    private final int w;
    private final String w0;
    private String w1;
    private final int x;
    private final String x0;
    private String x1;
    private final String y;
    private final String y0;
    private Context y1;
    private final String z;
    private final String z0;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] s = {1, 2, 3};
    }

    public l(Context context, String str, String str2, String str3) {
        this.f = "error";
        this.g = 3;
        this.h = 2;
        this.i = 60;
        this.j = 10000;
        this.k = un3.f.v;
        this.l = 300;
        this.m = 3;
        this.n = 3;
        this.o = 3;
        this.p = 2;
        this.q = 15;
        this.r = gc0.c;
        this.s = 0;
        this.t = false;
        this.u = 30000;
        this.v = -1;
        this.w = un3.f.v;
        this.x = 1;
        this.y = "providerOrder";
        this.z = "providerSettings";
        this.A = "configurations";
        this.B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
        this.C = "adUnits";
        this.D = "providerLoadName";
        this.E = "application";
        this.F = "rewardedVideo";
        this.G = "interstitial";
        this.H = "offerwall";
        this.I = com.anythink.expressad.foundation.g.a.f.e;
        this.J = "integration";
        this.K = "loggers";
        this.L = "segment";
        this.M = "events";
        this.N = "crashReporter";
        this.O = IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY;
        this.P = "external";
        this.Q = "mediationTypes";
        this.R = "providerDefaultInstance";
        this.S = "settings";
        this.T = "maxNumOfAdaptersToLoadOnStart";
        this.U = "advancedLoading";
        this.V = "adapterTimeOutInSeconds";
        this.W = "atim";
        this.X = "bannerInterval";
        this.Y = "isOneFlow";
        this.Z = "loadRVInterval";
        this.a0 = "expiredDurationInMinutes";
        this.b0 = "server";
        this.c0 = "publisher";
        this.d0 = "console";
        this.e0 = "sendUltraEvents";
        this.f0 = "sendEventsToggle";
        this.g0 = "eventsCompression";
        this.h0 = "serverEventsURL";
        this.i0 = "serverEventsType";
        this.j0 = "backupThreshold";
        this.k0 = "maxNumberOfEvents";
        this.l0 = "maxEventsPerBatch";
        this.m0 = "optOut";
        this.n0 = "optIn";
        this.o0 = "triggerEvents";
        this.p0 = "nonConnectivityEvents";
        this.q0 = "pixel";
        this.r0 = "pixelEventsUrl";
        this.s0 = "pixelEventsEnabled";
        this.t0 = "placements";
        this.u0 = com.anythink.expressad.videocommon.e.b.v;
        this.v0 = "placementName";
        this.w0 = "delivery";
        this.x0 = "isDefault";
        this.y0 = "capping";
        this.z0 = "pacing";
        this.A0 = PrefStorageConstants.KEY_ENABLED;
        this.B0 = "maxImpressions";
        this.C0 = "numOfSeconds";
        this.D0 = "unit";
        this.E0 = "virtualItemName";
        this.F0 = "virtualItemCount";
        this.G0 = "backFill";
        this.H0 = "premium";
        this.I0 = "uuidEnabled";
        this.J0 = "abt";
        this.K0 = "delayLoadFailure";
        this.L0 = "keysToInclude";
        this.M0 = "reporterURL";
        this.N0 = "reporterKeyword";
        this.O0 = "includeANR";
        this.P0 = "timeout";
        this.Q0 = "setIgnoreDebugger";
        this.R0 = "adSourceName";
        this.S0 = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.T0 = "mpis";
        this.U0 = "auction";
        this.V0 = "auctionData";
        this.W0 = "auctioneerURL";
        this.X0 = "extAuctioneerURL";
        this.Y0 = IronSourceConstants.EVENTS_PROGRAMMATIC;
        this.Z0 = "objectPerWaterfall";
        this.a1 = "minTimeBeforeFirstAuction";
        this.b1 = "timeToWaitBeforeAuction";
        this.c1 = "timeToWaitBeforeLoad";
        this.d1 = "auctionRetryInterval";
        this.e1 = "isAuctionOnShowStart";
        this.f1 = "isLoadWhileShow";
        this.g1 = IronSourceConstants.AUCTION_TRIALS;
        this.h1 = "auctionTimeout";
        this.i1 = "auctionSavedHistory";
        this.j1 = "disableLoadWhileShowSupportFor";
        this.k1 = "timeToDeleteOldWaterfallAfterAuction";
        this.l1 = "compressAuctionRequest";
        this.m1 = "compressAuctionResponse";
        this.n1 = "encryptionVersion";
        this.o1 = "shouldSendBannerBURLFromImpression";
        this.p1 = "optInKeys";
        this.q1 = "tokenGenericParams";
        this.r1 = "oneToken";
        this.s1 = "compressToken";
        this.t1 = "isExternalArmEventsEnabled";
        this.u1 = "externalArmEventsUrl";
        this.v1 = "compressExternalToken";
        this.e = a.a;
        this.y1 = context;
        try {
            this.d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            h();
            i();
            g();
            this.w1 = TextUtils.isEmpty(str) ? "" : str;
            this.x1 = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            e();
        }
    }

    public l(l lVar) {
        this.f = "error";
        this.g = 3;
        this.h = 2;
        this.i = 60;
        this.j = 10000;
        this.k = un3.f.v;
        this.l = 300;
        this.m = 3;
        this.n = 3;
        this.o = 3;
        this.p = 2;
        this.q = 15;
        this.r = gc0.c;
        this.s = 0;
        this.t = false;
        this.u = 30000;
        this.v = -1;
        this.w = un3.f.v;
        this.x = 1;
        this.y = "providerOrder";
        this.z = "providerSettings";
        this.A = "configurations";
        this.B = IronSourceConstants.EVENTS_GENERIC_PARAMS;
        this.C = "adUnits";
        this.D = "providerLoadName";
        this.E = "application";
        this.F = "rewardedVideo";
        this.G = "interstitial";
        this.H = "offerwall";
        this.I = com.anythink.expressad.foundation.g.a.f.e;
        this.J = "integration";
        this.K = "loggers";
        this.L = "segment";
        this.M = "events";
        this.N = "crashReporter";
        this.O = IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY;
        this.P = "external";
        this.Q = "mediationTypes";
        this.R = "providerDefaultInstance";
        this.S = "settings";
        this.T = "maxNumOfAdaptersToLoadOnStart";
        this.U = "advancedLoading";
        this.V = "adapterTimeOutInSeconds";
        this.W = "atim";
        this.X = "bannerInterval";
        this.Y = "isOneFlow";
        this.Z = "loadRVInterval";
        this.a0 = "expiredDurationInMinutes";
        this.b0 = "server";
        this.c0 = "publisher";
        this.d0 = "console";
        this.e0 = "sendUltraEvents";
        this.f0 = "sendEventsToggle";
        this.g0 = "eventsCompression";
        this.h0 = "serverEventsURL";
        this.i0 = "serverEventsType";
        this.j0 = "backupThreshold";
        this.k0 = "maxNumberOfEvents";
        this.l0 = "maxEventsPerBatch";
        this.m0 = "optOut";
        this.n0 = "optIn";
        this.o0 = "triggerEvents";
        this.p0 = "nonConnectivityEvents";
        this.q0 = "pixel";
        this.r0 = "pixelEventsUrl";
        this.s0 = "pixelEventsEnabled";
        this.t0 = "placements";
        this.u0 = com.anythink.expressad.videocommon.e.b.v;
        this.v0 = "placementName";
        this.w0 = "delivery";
        this.x0 = "isDefault";
        this.y0 = "capping";
        this.z0 = "pacing";
        this.A0 = PrefStorageConstants.KEY_ENABLED;
        this.B0 = "maxImpressions";
        this.C0 = "numOfSeconds";
        this.D0 = "unit";
        this.E0 = "virtualItemName";
        this.F0 = "virtualItemCount";
        this.G0 = "backFill";
        this.H0 = "premium";
        this.I0 = "uuidEnabled";
        this.J0 = "abt";
        this.K0 = "delayLoadFailure";
        this.L0 = "keysToInclude";
        this.M0 = "reporterURL";
        this.N0 = "reporterKeyword";
        this.O0 = "includeANR";
        this.P0 = "timeout";
        this.Q0 = "setIgnoreDebugger";
        this.R0 = "adSourceName";
        this.S0 = IronSourceConstants.EVENTS_SUB_PROVIDER_ID;
        this.T0 = "mpis";
        this.U0 = "auction";
        this.V0 = "auctionData";
        this.W0 = "auctioneerURL";
        this.X0 = "extAuctioneerURL";
        this.Y0 = IronSourceConstants.EVENTS_PROGRAMMATIC;
        this.Z0 = "objectPerWaterfall";
        this.a1 = "minTimeBeforeFirstAuction";
        this.b1 = "timeToWaitBeforeAuction";
        this.c1 = "timeToWaitBeforeLoad";
        this.d1 = "auctionRetryInterval";
        this.e1 = "isAuctionOnShowStart";
        this.f1 = "isLoadWhileShow";
        this.g1 = IronSourceConstants.AUCTION_TRIALS;
        this.h1 = "auctionTimeout";
        this.i1 = "auctionSavedHistory";
        this.j1 = "disableLoadWhileShowSupportFor";
        this.k1 = "timeToDeleteOldWaterfallAfterAuction";
        this.l1 = "compressAuctionRequest";
        this.m1 = "compressAuctionResponse";
        this.n1 = "encryptionVersion";
        this.o1 = "shouldSendBannerBURLFromImpression";
        this.p1 = "optInKeys";
        this.q1 = "tokenGenericParams";
        this.r1 = "oneToken";
        this.s1 = "compressToken";
        this.t1 = "isExternalArmEventsEnabled";
        this.u1 = "externalArmEventsUrl";
        this.v1 = "compressExternalToken";
        this.e = a.a;
        try {
            this.y1 = lVar.y1;
            this.d = new JSONObject(lVar.d.toString());
            this.w1 = lVar.w1;
            this.x1 = lVar.x1;
            this.a = lVar.a;
            this.b = lVar.b;
            this.c = lVar.c;
            this.e = lVar.e;
        } catch (Exception unused) {
            e();
        }
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.ironsource.mediationsdk.model.l b(JSONObject jSONObject) {
        com.ironsource.mediationsdk.model.m mVar = null;
        if (jSONObject == null) {
            return null;
        }
        l.a aVar = new l.a();
        boolean z = true;
        aVar.a = jSONObject.optBoolean("delivery", true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                com.ironsource.mediationsdk.model.m mVar2 = com.ironsource.mediationsdk.model.m.PER_DAY;
                if (!mVar2.toString().equals(optString)) {
                    mVar2 = com.ironsource.mediationsdk.model.m.PER_HOUR;
                }
                mVar = mVar2;
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.a(optJSONObject.optBoolean(PrefStorageConstants.KEY_ENABLED, false) && optInt > 0, mVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            aVar.a((!optJSONObject2.optBoolean(PrefStorageConstants.KEY_ENABLED, false) || optInt2 <= 0) ? false : false, optInt2);
        }
        return aVar.a();
    }

    private static int[] c(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int[] iArr = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr[i] = optJSONArray.optInt(i);
            }
            return iArr;
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private void e() {
        this.d = new JSONObject();
        this.w1 = "";
        this.x1 = "";
        this.a = new com.ironsource.mediationsdk.model.n();
        this.b = com.ironsource.mediationsdk.model.o.a();
        this.c = new com.ironsource.mediationsdk.model.h();
    }

    private boolean f() {
        JSONObject d;
        JSONArray optJSONArray;
        JSONObject d2 = d(this.d, "providerOrder");
        JSONArray names = d2.names();
        if (names == null) {
            return true;
        }
        JSONObject d3 = d(d(this.d, "configurations"), "adUnits");
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i);
            JSONArray optJSONArray2 = d2.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (d = d(d3, optString)) != null && ((optJSONArray = d.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private void g() {
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.model.i iVar;
        com.ironsource.mediationsdk.model.h hVar2;
        com.ironsource.mediationsdk.model.p pVar;
        try {
            JSONObject d = d(this.d, "providerOrder");
            JSONArray optJSONArray = d.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = d.optJSONArray("interstitial");
            JSONArray optJSONArray3 = d.optJSONArray(com.anythink.expressad.foundation.g.a.f.e);
            this.a = new com.ironsource.mediationsdk.model.n();
            if (optJSONArray != null && (hVar2 = this.c) != null && (pVar = hVar2.a) != null) {
                String str = pVar.f;
                String str2 = pVar.g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.a.b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.a.c = str2;
                        }
                        com.ironsource.mediationsdk.model.n nVar = this.a;
                        if (!TextUtils.isEmpty(optString)) {
                            nVar.a.add(optString);
                        }
                        NetworkSettings a2 = com.ironsource.mediationsdk.model.o.a().a(optString);
                        if (a2 != null) {
                            a2.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (optJSONArray2 != null && (hVar = this.c) != null && (iVar = hVar.b) != null) {
                String str3 = iVar.g;
                String str4 = iVar.h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.a.f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.a.g = str4;
                        }
                        com.ironsource.mediationsdk.model.n nVar2 = this.a;
                        if (!TextUtils.isEmpty(optString2)) {
                            nVar2.d.add(optString2);
                        }
                        NetworkSettings a3 = com.ironsource.mediationsdk.model.o.a().a(optString2);
                        if (a3 != null) {
                            a3.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    com.ironsource.mediationsdk.model.n nVar3 = this.a;
                    if (!TextUtils.isEmpty(optString3)) {
                        nVar3.e.add(optString3);
                    }
                    NetworkSettings a4 = com.ironsource.mediationsdk.model.o.a().a(optString3);
                    if (a4 != null) {
                        a4.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void h() {
        String str;
        JSONObject jSONObject;
        NetworkSettings networkSettings;
        com.ironsource.mediationsdk.model.o oVar;
        String str2 = "Mediation";
        try {
            this.b = com.ironsource.mediationsdk.model.o.a();
            JSONObject d = d(this.d, "providerSettings");
            Iterator<String> keys = d.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = d.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerLoadName", next);
                    String optString4 = optJSONObject.optString("providerDefaultInstance", optString3);
                    JSONObject d2 = d(optJSONObject, "adUnits");
                    JSONObject d3 = d(optJSONObject, "application");
                    JSONObject d4 = d(d2, "rewardedVideo");
                    JSONObject d5 = d(d2, "interstitial");
                    JSONObject d6 = d(d2, com.anythink.expressad.foundation.g.a.f.e);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(d4, d3);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(d5, d3);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(d6, d3);
                    if (this.b.b(next)) {
                        NetworkSettings a2 = this.b.a(next);
                        JSONObject rewardedVideoSettings = a2.getRewardedVideoSettings();
                        JSONObject interstitialSettings = a2.getInterstitialSettings();
                        JSONObject bannerSettings = a2.getBannerSettings();
                        a2.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        a2.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        a2.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        a2.setIsMultipleInstances(optBoolean);
                        a2.setSubProviderId(optString);
                        a2.setAdSourceNameForEvents(optString2);
                    } else {
                        Locale locale = Locale.ENGLISH;
                        String lowerCase = optString3.toLowerCase(locale);
                        jSONObject = d;
                        if (this.b.b(str2) && (IronSourceConstants.SUPERSONIC_CONFIG_NAME.toLowerCase(locale).equals(lowerCase) || IronSourceConstants.IRONSOURCE_CONFIG_NAME.toLowerCase(locale).equals(lowerCase))) {
                            NetworkSettings a3 = this.b.a(str2);
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d3, IronSourceUtils.mergeJsons(new JSONObject(a3.getRewardedVideoSettings().toString()), mergeJsons), IronSourceUtils.mergeJsons(new JSONObject(a3.getInterstitialSettings().toString()), mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(a3.getBannerSettings().toString()), mergeJsons3));
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            oVar = this.b;
                        } else {
                            str = str2;
                            networkSettings = new NetworkSettings(next, optString3, optString4, d3, mergeJsons, mergeJsons2, mergeJsons3);
                            networkSettings.setIsMultipleInstances(optBoolean);
                            networkSettings.setSubProviderId(optString);
                            networkSettings.setAdSourceNameForEvents(optString2);
                            oVar = this.b;
                        }
                        oVar.a(networkSettings);
                    }
                } else {
                    str = str2;
                    jSONObject = d;
                }
                str2 = str;
                d = jSONObject;
            }
            this.b.b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0553 A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0640 A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x066f A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0696 A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06bd A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06e3 A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x075e A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07ba A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08f4 A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0905 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031d A[Catch: Exception -> 0x0592, TryCatch #2 {Exception -> 0x0592, blocks: (B:79:0x030e, B:83:0x031d, B:85:0x0326, B:86:0x0329, B:89:0x0330, B:90:0x0335, B:92:0x0343, B:93:0x0345, B:95:0x0351, B:101:0x0370, B:105:0x0397, B:107:0x03e0, B:108:0x03ed, B:110:0x03f3, B:113:0x0407, B:115:0x040f, B:116:0x0418, B:118:0x041e, B:121:0x042e, B:123:0x0436, B:124:0x043f, B:126:0x0445, B:129:0x0455, B:131:0x045d, B:132:0x0464, B:134:0x046a, B:137:0x0478, B:139:0x0483, B:141:0x0500, B:144:0x050a, B:146:0x0510, B:148:0x0516, B:150:0x0536, B:152:0x053c, B:154:0x0543, B:158:0x0553, B:160:0x055c, B:161:0x055f, B:164:0x0566, B:165:0x056f, B:167:0x057f, B:168:0x0581, B:170:0x058d, B:176:0x05a3, B:178:0x05be, B:187:0x05d8, B:189:0x05ef, B:195:0x0605, B:197:0x0640, B:198:0x064d, B:200:0x0653, B:203:0x0667, B:205:0x066f, B:206:0x0678, B:208:0x067e, B:211:0x068e, B:213:0x0696, B:214:0x069f, B:216:0x06a5, B:219:0x06b5, B:221:0x06bd, B:222:0x06c4, B:224:0x06ca, B:227:0x06d8, B:229:0x06e3, B:231:0x06ed, B:234:0x0765, B:237:0x0771, B:239:0x0777, B:241:0x077d, B:243:0x079d, B:245:0x07a3, B:247:0x07aa, B:251:0x07ba, B:253:0x07c3, B:254:0x07c6, B:257:0x07cd, B:261:0x07ed, B:263:0x0825, B:264:0x082c, B:266:0x0832, B:269:0x0840, B:271:0x0848, B:272:0x084f, B:274:0x0855, B:277:0x0863, B:279:0x086b, B:280:0x0872, B:282:0x0878, B:285:0x0886, B:287:0x088e, B:288:0x0895, B:290:0x089b, B:293:0x08a9, B:296:0x08c2, B:298:0x08c8, B:300:0x08ce, B:302:0x08e4, B:304:0x08ea, B:307:0x08f4, B:309:0x08fd, B:310:0x0900, B:313:0x0905, B:316:0x0911, B:318:0x0918, B:321:0x0923, B:323:0x0929, B:325:0x0933, B:326:0x0938, B:327:0x093b, B:329:0x0943, B:330:0x0945, B:331:0x0957, B:333:0x095e, B:335:0x0974, B:337:0x0979, B:338:0x098f, B:340:0x09b0, B:343:0x09f6, B:345:0x09fc, B:347:0x0a08, B:349:0x0a28, B:351:0x0a2f, B:353:0x0a58, B:355:0x0a5f, B:357:0x0a6e, B:358:0x0a72, B:359:0x0a7d, B:361:0x0a86, B:363:0x0a98, B:365:0x0ac3, B:367:0x0ac9, B:369:0x0ae0, B:232:0x0758, B:233:0x075e, B:191:0x05f7, B:193:0x05fe, B:179:0x05c3, B:181:0x05c9, B:140:0x04f7), top: B:379:0x030e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        int i;
        boolean z;
        String str3;
        String str4;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        String str5;
        String str6;
        String str7;
        String str8;
        c cVar;
        l lVar;
        com.ironsource.mediationsdk.model.p pVar;
        Placement placement;
        String str9;
        String str10;
        String str11;
        String str12;
        JSONObject jSONObject3;
        com.ironsource.mediationsdk.model.i iVar;
        String str13;
        String str14;
        JSONObject jSONObject4;
        String str15;
        String str16;
        JSONObject jSONObject5;
        com.ironsource.mediationsdk.model.f fVar;
        String str17;
        String str18;
        com.ironsource.mediationsdk.model.j jVar;
        boolean z2;
        q qVar;
        JSONObject d;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        com.ironsource.mediationsdk.model.k kVar;
        boolean z3;
        boolean z4;
        boolean optBoolean;
        JSONArray optJSONArray;
        int[] iArr9;
        JSONArray optJSONArray2;
        int[] iArr10;
        JSONArray optJSONArray3;
        int[] iArr11;
        JSONArray optJSONArray4;
        int[] iArr12;
        JSONObject jSONObject6;
        c cVar2;
        JSONObject jSONObject7;
        JSONArray jSONArray;
        String str19;
        com.ironsource.mediationsdk.model.g gVar;
        int i2;
        boolean z5;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        JSONObject jSONObject8;
        c cVar3;
        JSONArray jSONArray2;
        JSONObject jSONObject9;
        String str20;
        InterstitialPlacement interstitialPlacement;
        try {
            JSONObject d2 = d(this.d, "configurations");
            JSONObject d3 = d(d2, "adUnits");
            JSONObject d4 = d(d2, "application");
            JSONObject d5 = d(d3, "rewardedVideo");
            JSONObject d6 = d(d3, "interstitial");
            JSONObject d7 = d(d3, "offerwall");
            JSONObject d8 = d(d3, com.anythink.expressad.foundation.g.a.f.e);
            JSONObject d9 = d(d4, "events");
            JSONObject d10 = d(d4, "loggers");
            JSONObject d11 = d(d4, IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY);
            JSONObject d12 = d(d4, "segment");
            JSONObject d13 = d(d4, "auction");
            JSONObject d14 = d(d4, "crashReporter");
            JSONObject d15 = d(d4, "settings");
            JSONObject d16 = d(d4, "external");
            JSONObject d17 = d(d9, "pixel");
            if (d4 != null) {
                jSONObject = d12;
                jSONObject2 = d14;
                IronSourceUtils.l(this.y1, "uuidEnabled", d4.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = d12;
                jSONObject2 = d14;
            }
            if (d9 != null) {
                String optString = d9.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    com.ironsource.mediationsdk.a.d.d().p = optString;
                    com.ironsource.mediationsdk.a.h.d().p = optString;
                }
            }
            JSONObject jSONObject10 = d13;
            String str21 = "triggerEvents";
            String str22 = "";
            String str23 = "optIn";
            if (d5 != null) {
                try {
                    JSONArray optJSONArray5 = d5.optJSONArray("placements");
                    str = "placements";
                    JSONObject d18 = d(d5, "events");
                    str2 = "events";
                    JSONArray jSONArray3 = optJSONArray5;
                    int a2 = a(d5, d4, "maxNumOfAdaptersToLoadOnStart", 2);
                    int a3 = a(d5, d4, "advancedLoading", 0);
                    if (a3 > 0) {
                        i = a3;
                        z = true;
                    } else {
                        i = a2;
                        z = false;
                    }
                    int a4 = a(d5, d4, "adapterTimeOutInSeconds", 60);
                    int a5 = a(d5, d4, "loadRVInterval", 300);
                    int a6 = a(d5, d4, "expiredDurationInMinutes", -1);
                    int a7 = a(d5, d4, "delayLoadFailure", 3);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(d18, d9);
                    boolean optBoolean2 = mergeJsons.optBoolean("sendUltraEvents", false);
                    boolean optBoolean3 = mergeJsons.optBoolean("sendEventsToggle", false);
                    boolean optBoolean4 = mergeJsons.optBoolean("eventsCompression", false);
                    String optString2 = mergeJsons.optString("serverEventsURL", "");
                    String optString3 = mergeJsons.optString("serverEventsType", "");
                    int optInt = mergeJsons.optInt("backupThreshold", -1);
                    int optInt2 = mergeJsons.optInt("maxNumberOfEvents", -1);
                    int optInt3 = mergeJsons.optInt("maxEventsPerBatch", un3.f.v);
                    JSONArray optJSONArray6 = mergeJsons.optJSONArray("optOut");
                    if (optJSONArray6 != null) {
                        int[] iArr17 = new int[optJSONArray6.length()];
                        str3 = "optOut";
                        str4 = "maxEventsPerBatch";
                        for (int i3 = 0; i3 < optJSONArray6.length(); i3++) {
                            iArr17[i3] = optJSONArray6.optInt(i3);
                        }
                        iArr = iArr17;
                    } else {
                        str3 = "optOut";
                        str4 = "maxEventsPerBatch";
                        iArr = null;
                    }
                    JSONArray optJSONArray7 = mergeJsons.optJSONArray(str23);
                    if (optJSONArray7 != null) {
                        int[] iArr18 = new int[optJSONArray7.length()];
                        str23 = str23;
                        for (int i4 = 0; i4 < optJSONArray7.length(); i4++) {
                            iArr18[i4] = optJSONArray7.optInt(i4);
                        }
                        iArr2 = iArr18;
                    } else {
                        str23 = str23;
                        iArr2 = null;
                    }
                    JSONArray optJSONArray8 = mergeJsons.optJSONArray(str21);
                    if (optJSONArray8 != null) {
                        int[] iArr19 = new int[optJSONArray8.length()];
                        str21 = str21;
                        for (int i5 = 0; i5 < optJSONArray8.length(); i5++) {
                            iArr19[i5] = optJSONArray8.optInt(i5);
                        }
                        iArr3 = iArr19;
                    } else {
                        str21 = str21;
                        iArr3 = null;
                    }
                    JSONArray optJSONArray9 = mergeJsons.optJSONArray("nonConnectivityEvents");
                    if (optJSONArray9 != null) {
                        int[] iArr20 = new int[optJSONArray9.length()];
                        for (int i6 = 0; i6 < optJSONArray9.length(); i6++) {
                            iArr20[i6] = optJSONArray9.optInt(i6);
                        }
                        iArr4 = iArr20;
                    } else {
                        iArr4 = null;
                    }
                    com.ironsource.mediationsdk.model.c cVar4 = new com.ironsource.mediationsdk.model.c(optBoolean2, optBoolean3, optBoolean4, optString2, optString3, optInt, optInt2, optInt3, iArr, iArr2, iArr3, iArr4);
                    if (jSONObject10 != null) {
                        JSONObject d19 = d(jSONObject10, "rewardedVideo");
                        String optString4 = jSONObject10.optString("auctionData", "");
                        String optString5 = jSONObject10.optString("auctioneerURL", "");
                        String optString6 = jSONObject10.optString("extAuctioneerURL", "");
                        int optInt4 = jSONObject10.optInt(IronSourceConstants.AUCTION_TRIALS, 2);
                        long optLong = jSONObject10.optLong("auctionTimeout", gc0.c);
                        int optInt5 = jSONObject10.optInt("auctionSavedHistory", 15);
                        boolean optBoolean5 = jSONObject10.optBoolean("compressAuctionRequest", false);
                        boolean optBoolean6 = jSONObject10.optBoolean("compressAuctionResponse", false);
                        int optInt6 = jSONObject10.optInt("encryptionVersion", 1);
                        jSONObject10 = jSONObject10;
                        str8 = "maxNumberOfEvents";
                        str7 = "backupThreshold";
                        str5 = "serverEventsType";
                        str6 = "serverEventsURL";
                        c cVar5 = new c(optString4, optString5, optString6, optInt4, optInt5, optLong, d19.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), d19.optInt("minTimeBeforeFirstAuction", 2000), d19.optInt("auctionRetryInterval", 30000), d19.optInt("timeToWaitBeforeAuction", un3.f.v), d19.optInt("timeToWaitBeforeLoad", 50), d19.optBoolean("isAuctionOnShowStart", false), d19.optBoolean("isLoadWhileShow", false), d19.optInt("timeToDeleteOldWaterfallAfterAuction", 30000), optBoolean5, optBoolean6, d19.optBoolean("objectPerWaterfall", false), optInt6, false);
                        JSONArray optJSONArray10 = d19.optJSONArray("disableLoadWhileShowSupportFor");
                        if (optJSONArray10 != null) {
                            for (int i7 = 0; i7 < optJSONArray10.length(); i7++) {
                                String optString7 = optJSONArray10.optString(i7);
                                if (!TextUtils.isEmpty(optString7)) {
                                    cVar5.p.add(optString7);
                                }
                            }
                        }
                        cVar = cVar5;
                    } else {
                        str5 = "serverEventsType";
                        str6 = "serverEventsURL";
                        str7 = "backupThreshold";
                        str8 = "maxNumberOfEvents";
                        cVar = new c();
                    }
                    com.ironsource.mediationsdk.model.p pVar2 = new com.ironsource.mediationsdk.model.p(i, z, a4, a5, a6, cVar4, cVar, a7);
                    if (jSONArray3 != null) {
                        int i8 = 0;
                        while (i8 < jSONArray3.length()) {
                            JSONArray jSONArray4 = jSONArray3;
                            JSONObject optJSONObject = jSONArray4.optJSONObject(i8);
                            if (optJSONObject != null) {
                                int optInt7 = optJSONObject.optInt(com.anythink.expressad.videocommon.e.b.v, -1);
                                String optString8 = optJSONObject.optString("placementName", "");
                                boolean optBoolean7 = optJSONObject.optBoolean("isDefault", false);
                                String optString9 = optJSONObject.optString("virtualItemName", "");
                                int optInt8 = optJSONObject.optInt("virtualItemCount", -1);
                                com.ironsource.mediationsdk.model.l b = b(optJSONObject);
                                if (optInt7 >= 0 && !TextUtils.isEmpty(optString8) && !TextUtils.isEmpty(optString9) && optInt8 > 0) {
                                    placement = new Placement(optInt7, optString8, optBoolean7, optString9, optInt8, b);
                                    if (b != null) {
                                        try {
                                            k.a(this.y1, placement);
                                        } catch (Exception e) {
                                            e = e;
                                            e.printStackTrace();
                                            return;
                                        }
                                    }
                                    if (placement == null) {
                                        pVar2.a.add(placement);
                                        if (pVar2.k != null && placement.getPlacementId() != 0) {
                                        }
                                        pVar2.k = placement;
                                    }
                                    i8++;
                                    jSONArray3 = jSONArray4;
                                }
                            }
                            placement = null;
                            if (placement == null) {
                            }
                            i8++;
                            jSONArray3 = jSONArray4;
                        }
                    }
                    lVar = this;
                    String optString10 = d5.optString("backFill");
                    if (!TextUtils.isEmpty(optString10)) {
                        pVar2.f = optString10;
                    }
                    String optString11 = d5.optString("premium");
                    if (!TextUtils.isEmpty(optString11)) {
                        pVar2.g = optString11;
                    }
                    pVar = pVar2;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return;
                }
            } else {
                str3 = "optOut";
                str2 = "events";
                str6 = "serverEventsURL";
                str7 = "backupThreshold";
                str = "placements";
                str4 = "maxEventsPerBatch";
                str8 = "maxNumberOfEvents";
                str5 = "serverEventsType";
                lVar = this;
                pVar = null;
            }
            if (d6 != null) {
                str10 = str;
                JSONArray optJSONArray11 = d6.optJSONArray(str10);
                str11 = str2;
                JSONObject d20 = d(d6, str11);
                int a8 = a(d6, d4, "maxNumOfAdaptersToLoadOnStart", 2);
                int a9 = a(d6, d4, "advancedLoading", 0);
                if (a9 > 0) {
                    i2 = a9;
                    z5 = true;
                } else {
                    i2 = a8;
                    z5 = false;
                }
                int a10 = a(d6, d4, "adapterTimeOutInSeconds", 60);
                int a11 = a(d6, d4, "delayLoadFailure", 3);
                JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(d20, d9);
                boolean optBoolean8 = mergeJsons2.optBoolean("sendEventsToggle", false);
                boolean optBoolean9 = mergeJsons2.optBoolean("eventsCompression", false);
                String str24 = str6;
                String optString12 = mergeJsons2.optString(str24, "");
                String optString13 = mergeJsons2.optString(str5, "");
                String str25 = str7;
                int optInt9 = mergeJsons2.optInt(str25, -1);
                str7 = str25;
                String str26 = str8;
                int optInt10 = mergeJsons2.optInt(str26, -1);
                str8 = str26;
                String str27 = str4;
                int optInt11 = mergeJsons2.optInt(str27, un3.f.v);
                str4 = str27;
                String str28 = str3;
                JSONArray optJSONArray12 = mergeJsons2.optJSONArray(str28);
                if (optJSONArray12 != null) {
                    str3 = str28;
                    int[] iArr21 = new int[optJSONArray12.length()];
                    str6 = str24;
                    str9 = str5;
                    for (int i9 = 0; i9 < optJSONArray12.length(); i9++) {
                        iArr21[i9] = optJSONArray12.optInt(i9);
                    }
                    iArr13 = iArr21;
                } else {
                    str6 = str24;
                    str9 = str5;
                    str3 = str28;
                    iArr13 = null;
                }
                String str29 = str23;
                JSONArray optJSONArray13 = mergeJsons2.optJSONArray(str29);
                if (optJSONArray13 != null) {
                    int[] iArr22 = new int[optJSONArray13.length()];
                    str23 = str29;
                    for (int i10 = 0; i10 < optJSONArray13.length(); i10++) {
                        iArr22[i10] = optJSONArray13.optInt(i10);
                    }
                    iArr14 = iArr22;
                } else {
                    str23 = str29;
                    iArr14 = null;
                }
                String str30 = str21;
                JSONArray optJSONArray14 = mergeJsons2.optJSONArray(str30);
                if (optJSONArray14 != null) {
                    int[] iArr23 = new int[optJSONArray14.length()];
                    str21 = str30;
                    for (int i11 = 0; i11 < optJSONArray14.length(); i11++) {
                        iArr23[i11] = optJSONArray14.optInt(i11);
                    }
                    iArr15 = iArr23;
                } else {
                    str21 = str30;
                    iArr15 = null;
                }
                JSONArray optJSONArray15 = mergeJsons2.optJSONArray("nonConnectivityEvents");
                if (optJSONArray15 != null) {
                    int[] iArr24 = new int[optJSONArray15.length()];
                    for (int i12 = 0; i12 < optJSONArray15.length(); i12++) {
                        iArr24[i12] = optJSONArray15.optInt(i12);
                    }
                    iArr16 = iArr24;
                } else {
                    iArr16 = null;
                }
                com.ironsource.mediationsdk.model.c cVar6 = new com.ironsource.mediationsdk.model.c(false, optBoolean8, optBoolean9, optString12, optString13, optInt9, optInt10, optInt11, iArr13, iArr14, iArr15, iArr16);
                if (jSONObject10 != null) {
                    jSONObject8 = jSONObject10;
                    JSONObject d21 = d(jSONObject8, "interstitial");
                    cVar3 = new c(jSONObject8.optString("auctionData", ""), jSONObject8.optString("auctioneerURL", ""), jSONObject8.optString("extAuctioneerURL", ""), jSONObject8.optInt(IronSourceConstants.AUCTION_TRIALS, 2), jSONObject8.optInt("auctionSavedHistory", 15), jSONObject8.optLong("auctionTimeout", gc0.c), d21.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), d21.optInt("minTimeBeforeFirstAuction", 2000), 0L, 0L, 0L, true, true, 0, jSONObject8.optBoolean("compressAuctionRequest", false), jSONObject8.optBoolean("compressAuctionResponse", false), d21.optBoolean("objectPerWaterfall", false), jSONObject8.optInt("encryptionVersion", 1), false);
                } else {
                    jSONObject8 = jSONObject10;
                    cVar3 = new c();
                }
                com.ironsource.mediationsdk.model.i iVar2 = new com.ironsource.mediationsdk.model.i(i2, z5, a10, cVar6, cVar3, a11);
                if (optJSONArray11 != null) {
                    int i13 = 0;
                    while (i13 < optJSONArray11.length()) {
                        JSONObject optJSONObject2 = optJSONArray11.optJSONObject(i13);
                        if (optJSONObject2 != null) {
                            jSONArray2 = optJSONArray11;
                            int optInt12 = optJSONObject2.optInt(com.anythink.expressad.videocommon.e.b.v, -1);
                            String optString14 = optJSONObject2.optString("placementName", str22);
                            jSONObject9 = jSONObject8;
                            str20 = str22;
                            boolean optBoolean10 = optJSONObject2.optBoolean("isDefault", false);
                            com.ironsource.mediationsdk.model.l b2 = b(optJSONObject2);
                            if (optInt12 >= 0 && !TextUtils.isEmpty(optString14)) {
                                interstitialPlacement = new InterstitialPlacement(optInt12, optString14, optBoolean10, b2);
                                if (b2 != null) {
                                    k.a(lVar.y1, interstitialPlacement);
                                }
                                if (interstitialPlacement == null) {
                                    iVar2.a.add(interstitialPlacement);
                                    if (iVar2.j != null && interstitialPlacement.getPlacementId() != 0) {
                                    }
                                    iVar2.j = interstitialPlacement;
                                }
                                i13++;
                                optJSONArray11 = jSONArray2;
                                jSONObject8 = jSONObject9;
                                str22 = str20;
                            }
                        } else {
                            jSONArray2 = optJSONArray11;
                            jSONObject9 = jSONObject8;
                            str20 = str22;
                        }
                        interstitialPlacement = null;
                        if (interstitialPlacement == null) {
                        }
                        i13++;
                        optJSONArray11 = jSONArray2;
                        jSONObject8 = jSONObject9;
                        str22 = str20;
                    }
                }
                jSONObject3 = jSONObject8;
                str12 = str22;
                String optString15 = d6.optString("backFill");
                if (!TextUtils.isEmpty(optString15)) {
                    iVar2.g = optString15;
                }
                String optString16 = d6.optString("premium");
                if (!TextUtils.isEmpty(optString16)) {
                    iVar2.h = optString16;
                }
                iVar = iVar2;
            } else {
                str9 = str5;
                str10 = str;
                str11 = str2;
                str12 = "";
                jSONObject3 = jSONObject10;
                iVar = null;
            }
            if (d8 != null) {
                JSONArray optJSONArray16 = d8.optJSONArray(str10);
                JSONObject d22 = d(d8, str11);
                int a12 = a(d8, d4, "maxNumOfAdaptersToLoadOnStart", 1);
                long optLong2 = d8.has("atim") ? d8.optLong("atim", 0L) : d4.has("atim") ? d4.optLong("atim", 0L) : 0L;
                long j = optLong2 == 0 ? gc0.c : optLong2;
                int a13 = a(d8, d4, "delayLoadFailure", 3);
                int a14 = a(d8, d4, "bannerInterval", 60);
                if (d8.has("isOneFlow")) {
                    z3 = false;
                    optBoolean = d8.optBoolean("isOneFlow", false);
                } else {
                    z3 = false;
                    if (d4.has("isOneFlow")) {
                        optBoolean = d4.optBoolean("isOneFlow", false);
                    } else {
                        z4 = false;
                        JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(d22, d9);
                        boolean optBoolean11 = mergeJsons3.optBoolean("sendEventsToggle", z3);
                        boolean optBoolean12 = mergeJsons3.optBoolean("eventsCompression", z3);
                        str15 = str12;
                        str16 = str6;
                        String optString17 = mergeJsons3.optString(str16, str15);
                        str14 = str9;
                        String optString18 = mergeJsons3.optString(str14, str15);
                        String str31 = str7;
                        int optInt13 = mergeJsons3.optInt(str31, -1);
                        String str32 = str8;
                        int optInt14 = mergeJsons3.optInt(str32, -1);
                        jSONObject5 = d4;
                        String str33 = str4;
                        int optInt15 = mergeJsons3.optInt(str33, un3.f.v);
                        str13 = str10;
                        String str34 = str3;
                        optJSONArray = mergeJsons3.optJSONArray(str34);
                        if (optJSONArray == null) {
                            str3 = str34;
                            int[] iArr25 = new int[optJSONArray.length()];
                            str4 = str33;
                            str8 = str32;
                            for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                                iArr25[i14] = optJSONArray.optInt(i14);
                            }
                            iArr9 = iArr25;
                        } else {
                            str3 = str34;
                            str4 = str33;
                            str8 = str32;
                            iArr9 = null;
                        }
                        String str35 = str23;
                        optJSONArray2 = mergeJsons3.optJSONArray(str35);
                        if (optJSONArray2 == null) {
                            int[] iArr26 = new int[optJSONArray2.length()];
                            str23 = str35;
                            for (int i15 = 0; i15 < optJSONArray2.length(); i15++) {
                                iArr26[i15] = optJSONArray2.optInt(i15);
                            }
                            iArr10 = iArr26;
                        } else {
                            str23 = str35;
                            iArr10 = null;
                        }
                        String str36 = str21;
                        optJSONArray3 = mergeJsons3.optJSONArray(str36);
                        if (optJSONArray3 == null) {
                            int[] iArr27 = new int[optJSONArray3.length()];
                            str21 = str36;
                            for (int i16 = 0; i16 < optJSONArray3.length(); i16++) {
                                iArr27[i16] = optJSONArray3.optInt(i16);
                            }
                            iArr11 = iArr27;
                        } else {
                            str21 = str36;
                            iArr11 = null;
                        }
                        optJSONArray4 = mergeJsons3.optJSONArray("nonConnectivityEvents");
                        if (optJSONArray4 == null) {
                            int[] iArr28 = new int[optJSONArray4.length()];
                            for (int i17 = 0; i17 < optJSONArray4.length(); i17++) {
                                iArr28[i17] = optJSONArray4.optInt(i17);
                            }
                            iArr12 = iArr28;
                        } else {
                            iArr12 = null;
                        }
                        com.ironsource.mediationsdk.model.c cVar7 = new com.ironsource.mediationsdk.model.c(false, optBoolean11, optBoolean12, optString17, optString18, optInt13, optInt14, optInt15, iArr9, iArr10, iArr11, iArr12);
                        if (jSONObject3 == null) {
                            jSONObject6 = jSONObject3;
                            JSONObject d23 = d(jSONObject6, com.anythink.expressad.foundation.g.a.f.e);
                            cVar2 = d23 != null ? new c(jSONObject6.optString("auctionData", str15), jSONObject6.optString("auctioneerURL", str15), jSONObject6.optString("extAuctioneerURL", str15), jSONObject6.optInt(IronSourceConstants.AUCTION_TRIALS, 2), jSONObject6.optInt("auctionSavedHistory", 15), jSONObject6.optLong("auctionTimeout", gc0.c), d23.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), d23.optInt("minTimeBeforeFirstAuction", 2000), 0L, 0L, 0L, true, true, 0, jSONObject6.optBoolean("compressAuctionRequest", false), jSONObject6.optBoolean("compressAuctionResponse", false), false, jSONObject6.optInt("encryptionVersion", 1), d23.optBoolean("shouldSendBannerBURLFromImpression", true)) : new c();
                        } else {
                            jSONObject6 = jSONObject3;
                            cVar2 = new c();
                        }
                        com.ironsource.mediationsdk.model.f fVar2 = new com.ironsource.mediationsdk.model.f(a12, j, cVar7, a14, cVar2, a13, z4);
                        if (optJSONArray16 != null) {
                            int i18 = 0;
                            while (i18 < optJSONArray16.length()) {
                                JSONObject optJSONObject3 = optJSONArray16.optJSONObject(i18);
                                if (optJSONObject3 != null) {
                                    jSONArray = optJSONArray16;
                                    int optInt16 = optJSONObject3.optInt(com.anythink.expressad.videocommon.e.b.v, -1);
                                    String optString19 = optJSONObject3.optString("placementName", str15);
                                    jSONObject7 = jSONObject6;
                                    str19 = str31;
                                    boolean optBoolean13 = optJSONObject3.optBoolean("isDefault", false);
                                    com.ironsource.mediationsdk.model.l b3 = b(optJSONObject3);
                                    if (optInt16 >= 0 && !TextUtils.isEmpty(optString19)) {
                                        gVar = new com.ironsource.mediationsdk.model.g(optInt16, optString19, optBoolean13, b3);
                                        if (b3 != null) {
                                            k.a(lVar.y1, gVar);
                                        }
                                        if (gVar == null) {
                                            fVar2.c.add(gVar);
                                            if (fVar2.d != null && gVar.getPlacementId() != 0) {
                                            }
                                            fVar2.d = gVar;
                                        }
                                        i18++;
                                        optJSONArray16 = jSONArray;
                                        jSONObject6 = jSONObject7;
                                        str31 = str19;
                                    }
                                } else {
                                    jSONObject7 = jSONObject6;
                                    jSONArray = optJSONArray16;
                                    str19 = str31;
                                }
                                gVar = null;
                                if (gVar == null) {
                                }
                                i18++;
                                optJSONArray16 = jSONArray;
                                jSONObject6 = jSONObject7;
                                str31 = str19;
                            }
                        }
                        jSONObject4 = jSONObject6;
                        str7 = str31;
                        fVar = fVar2;
                    }
                }
                z4 = optBoolean;
                JSONObject mergeJsons32 = IronSourceUtils.mergeJsons(d22, d9);
                boolean optBoolean112 = mergeJsons32.optBoolean("sendEventsToggle", z3);
                boolean optBoolean122 = mergeJsons32.optBoolean("eventsCompression", z3);
                str15 = str12;
                str16 = str6;
                String optString172 = mergeJsons32.optString(str16, str15);
                str14 = str9;
                String optString182 = mergeJsons32.optString(str14, str15);
                String str312 = str7;
                int optInt132 = mergeJsons32.optInt(str312, -1);
                String str322 = str8;
                int optInt142 = mergeJsons32.optInt(str322, -1);
                jSONObject5 = d4;
                String str332 = str4;
                int optInt152 = mergeJsons32.optInt(str332, un3.f.v);
                str13 = str10;
                String str342 = str3;
                optJSONArray = mergeJsons32.optJSONArray(str342);
                if (optJSONArray == null) {
                }
                String str352 = str23;
                optJSONArray2 = mergeJsons32.optJSONArray(str352);
                if (optJSONArray2 == null) {
                }
                String str362 = str21;
                optJSONArray3 = mergeJsons32.optJSONArray(str362);
                if (optJSONArray3 == null) {
                }
                optJSONArray4 = mergeJsons32.optJSONArray("nonConnectivityEvents");
                if (optJSONArray4 == null) {
                }
                com.ironsource.mediationsdk.model.c cVar72 = new com.ironsource.mediationsdk.model.c(false, optBoolean112, optBoolean122, optString172, optString182, optInt132, optInt142, optInt152, iArr9, iArr10, iArr11, iArr12);
                if (jSONObject3 == null) {
                }
                com.ironsource.mediationsdk.model.f fVar22 = new com.ironsource.mediationsdk.model.f(a12, j, cVar72, a14, cVar2, a13, z4);
                if (optJSONArray16 != null) {
                }
                jSONObject4 = jSONObject6;
                str7 = str312;
                fVar = fVar22;
            } else {
                str13 = str10;
                str14 = str9;
                jSONObject4 = jSONObject3;
                str15 = str12;
                str16 = str6;
                jSONObject5 = d4;
                fVar = null;
            }
            if (d7 != null) {
                JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(d(d7, str11), d9);
                boolean optBoolean14 = mergeJsons4.optBoolean("sendEventsToggle", false);
                boolean optBoolean15 = mergeJsons4.optBoolean("eventsCompression", false);
                String optString20 = mergeJsons4.optString(str16, str15);
                String optString21 = mergeJsons4.optString(str14, str15);
                int optInt17 = mergeJsons4.optInt(str7, -1);
                int optInt18 = mergeJsons4.optInt(str8, -1);
                int optInt19 = mergeJsons4.optInt(str4, un3.f.v);
                str18 = str3;
                JSONArray optJSONArray17 = mergeJsons4.optJSONArray(str18);
                if (optJSONArray17 != null) {
                    int[] iArr29 = new int[optJSONArray17.length()];
                    for (int i19 = 0; i19 < optJSONArray17.length(); i19++) {
                        iArr29[i19] = optJSONArray17.optInt(i19);
                    }
                    iArr5 = iArr29;
                } else {
                    iArr5 = null;
                }
                str17 = str23;
                JSONArray optJSONArray18 = mergeJsons4.optJSONArray(str17);
                if (optJSONArray18 != null) {
                    int[] iArr30 = new int[optJSONArray18.length()];
                    for (int i20 = 0; i20 < optJSONArray18.length(); i20++) {
                        iArr30[i20] = optJSONArray18.optInt(i20);
                    }
                    iArr6 = iArr30;
                } else {
                    iArr6 = null;
                }
                JSONArray optJSONArray19 = mergeJsons4.optJSONArray(str21);
                if (optJSONArray19 != null) {
                    int[] iArr31 = new int[optJSONArray19.length()];
                    for (int i21 = 0; i21 < optJSONArray19.length(); i21++) {
                        iArr31[i21] = optJSONArray19.optInt(i21);
                    }
                    iArr7 = iArr31;
                } else {
                    iArr7 = null;
                }
                JSONArray optJSONArray20 = mergeJsons4.optJSONArray("nonConnectivityEvents");
                if (optJSONArray20 != null) {
                    int[] iArr32 = new int[optJSONArray20.length()];
                    for (int i22 = 0; i22 < optJSONArray20.length(); i22++) {
                        iArr32[i22] = optJSONArray20.optInt(i22);
                    }
                    iArr8 = iArr32;
                } else {
                    iArr8 = null;
                }
                com.ironsource.mediationsdk.model.j jVar2 = new com.ironsource.mediationsdk.model.j(new com.ironsource.mediationsdk.model.c(false, optBoolean14, optBoolean15, optString20, optString21, optInt17, optInt18, optInt19, iArr5, iArr6, iArr7, iArr8));
                jVar2.d = d7;
                JSONArray optJSONArray21 = d7.optJSONArray(str13);
                if (optJSONArray21 != null) {
                    for (int i23 = 0; i23 < optJSONArray21.length(); i23++) {
                        JSONObject optJSONObject4 = optJSONArray21.optJSONObject(i23);
                        if (optJSONObject4 != null) {
                            int optInt20 = optJSONObject4.optInt(com.anythink.expressad.videocommon.e.b.v, -1);
                            String optString22 = optJSONObject4.optString("placementName", str15);
                            boolean optBoolean16 = optJSONObject4.optBoolean("isDefault", false);
                            if (optInt20 >= 0 && !TextUtils.isEmpty(optString22)) {
                                kVar = new com.ironsource.mediationsdk.model.k(optInt20, optString22, optBoolean16);
                                if (kVar == null) {
                                    jVar2.a.add(kVar);
                                    if (jVar2.b != null && kVar.a != 0) {
                                    }
                                    jVar2.b = kVar;
                                }
                            }
                        }
                        kVar = null;
                        if (kVar == null) {
                        }
                    }
                }
                jVar = jVar2;
            } else {
                str17 = str23;
                str18 = str3;
                jVar = null;
            }
            p pVar3 = new p();
            if (d11 != null) {
                JSONArray optJSONArray22 = d11.optJSONArray("optInKeys");
                if (optJSONArray22 != null) {
                    for (int i24 = 0; i24 < optJSONArray22.length(); i24++) {
                        String optString23 = optJSONArray22.optString(i24);
                        if (!TextUtils.isEmpty(optString23)) {
                            pVar3.a.add(optString23);
                        }
                    }
                }
                JSONObject optJSONObject5 = d11.optJSONObject("tokenGenericParams");
                if (optJSONObject5 != null) {
                    pVar3.c = optJSONObject5;
                }
                pVar3.d = d11.optBoolean("oneToken", false);
                pVar3.e = d11.optBoolean("compressToken", true);
            }
            j jVar3 = new j();
            if (d17 != null) {
                String optString24 = d17.optString("pixelEventsUrl", "https://outcome-ssp.supersonicads.com/mediation?adUnit=3");
                z2 = d17.optBoolean("pixelEventsEnabled", true);
                jVar3.a(optString24);
            } else {
                z2 = true;
            }
            jVar3.a(z2);
            if (z2) {
                jVar3.a(c(d9, str18));
                jVar3.b(c(d9, str17));
                jVar3.b(d9.optBoolean("eventsCompression", false));
            }
            com.ironsource.mediationsdk.model.e eVar = new com.ironsource.mediationsdk.model.e(d10.optInt("server", 3), d10.optInt("publisher", 3), d10.optInt("console", 3));
            com.ironsource.sdk.g.d dVar = new com.ironsource.sdk.g.d();
            if (jSONObject2 != null) {
                JSONObject jSONObject11 = jSONObject2;
                dVar.a(jSONObject11.optBoolean(PrefStorageConstants.KEY_ENABLED, false));
                dVar.b(jSONObject11.optString("reporterURL", str15));
                dVar.c(jSONObject11.optString("reporterKeyword", str15));
                dVar.b(jSONObject11.optBoolean("includeANR", false));
                dVar.a(jSONObject11.optInt("timeout", un3.f.v));
                dVar.c(jSONObject11.optBoolean("setIgnoreDebugger", false));
                JSONArray optJSONArray23 = jSONObject11.optJSONArray("keysToInclude");
                if (optJSONArray23 != null) {
                    for (int i25 = 0; i25 < optJSONArray23.length(); i25++) {
                        dVar.a(optJSONArray23.optString(i25));
                    }
                }
            }
            if (jSONObject != null) {
                JSONObject jSONObject12 = jSONObject;
                qVar = new q(jSONObject12.optString("name", str15), jSONObject12.optString("id", "-1"), jSONObject12.optJSONObject("custom"));
            } else {
                qVar = null;
            }
            b bVar = d15 != null ? new b(d15.optBoolean("isExternalArmEventsEnabled", true), d15.optString("externalArmEventsUrl", "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"), d15.optBoolean("sid", true), d15.optBoolean("radvid", false)) : new b();
            com.ironsource.mediationsdk.model.d dVar2 = new com.ironsource.mediationsdk.model.d();
            if (d16 != null) {
                JSONObject optJSONObject6 = d16.optJSONObject("mediationTypes");
                Map hashMap = new HashMap();
                if (optJSONObject6 != null) {
                    hashMap = IronSourceUtils.parseJsonToStringMap(optJSONObject6);
                }
                d16.optBoolean("compressExternalToken", false);
                dVar2 = new com.ironsource.mediationsdk.model.d(hashMap);
            }
            lVar.c = new com.ironsource.mediationsdk.model.h(pVar, iVar, jVar, fVar, new u(eVar, qVar, pVar3, jSONObject5.optBoolean("integration", false), dVar, bVar, dVar2, jVar3, jSONObject4 != null ? new com.ironsource.mediationsdk.model.b(jSONObject4.optString("auctionData")) : new com.ironsource.mediationsdk.model.b()));
            JSONObject d24 = d(d9, IronSourceConstants.EVENTS_GENERIC_PARAMS);
            if (d24 != null && (d = d(d24, str11)) != null) {
                d24.remove(str11);
                Map<String, String> parseJsonToStringMap = IronSourceUtils.parseJsonToStringMap(d);
                com.ironsource.mediationsdk.a.h.d().b(parseJsonToStringMap);
                com.ironsource.mediationsdk.a.d.d().b(parseJsonToStringMap);
            }
            if (d24 != null) {
                Map<String, String> parseJsonToStringMap2 = IronSourceUtils.parseJsonToStringMap(d24);
                com.ironsource.mediationsdk.a.h.d().a(parseJsonToStringMap2);
                com.ironsource.mediationsdk.a.d.d().a(parseJsonToStringMap2);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final G a() {
        return new G(this.w1, this.x1);
    }

    public final boolean b() {
        JSONObject jSONObject = this.d;
        return (((((jSONObject != null) && !jSONObject.has("error")) && this.a != null) && this.b != null) && this.c != null) && f();
    }

    public final String c() {
        try {
            return this.a.b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    public final String d() {
        try {
            return this.a.c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.w1);
            jSONObject.put(DataKeys.USER_ID, this.x1);
            jSONObject.put("response", this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}