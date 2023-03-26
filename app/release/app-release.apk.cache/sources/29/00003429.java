package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.Q;
import com.ironsource.mediationsdk.T;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.c.a;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.he3;
import com.p7700g.p99005.ke3;
import com.p7700g.p99005.se3;
import com.p7700g.p99005.ue3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    /* loaded from: classes3.dex */
    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(com.anythink.expressad.foundation.g.a.f.e);
        
        private String t;

        AD_UNIT(String str) {
            this.t = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.t;
        }
    }

    public static void addImpressionDataListener(@NotNull ImpressionDataListener impressionDataListener) {
        L a = L.a();
        if (a.a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.d.a.a().a(impressionDataListener);
            D d = a.S;
            if (d != null) {
                d.a(impressionDataListener);
            }
            ke3 ke3Var = a.T;
            if (ke3Var != null) {
                ke3Var.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
            if (gVar != null) {
                gVar.a(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a.W;
            if (hVar != null) {
                hVar.a(impressionDataListener);
            }
            T t = a.U;
            if (t != null) {
                t.a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        L.a().n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            a.l.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a.l.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        T t;
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (!a.g0 || (t = a.U) == null) {
                C1282p c1282p = a.i;
                if (c1282p != null) {
                    c1282p.a(ironSourceBannerLayout);
                    return;
                }
                return;
            }
            IronLog.INTERNAL.verbose("");
            T.b bVar = new T.b(ironSourceBannerLayout);
            if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
                bVar.a();
                return;
            }
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            bVar.a(String.format("can't destroy banner - %s", objArr));
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(String str) {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.utils.k kVar = a.n0;
            if (kVar != null) {
                kVar.a(str);
            }
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        L.a();
        return L.a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String m;
        synchronized (IronSource.class) {
            m = L.a().m();
        }
        return m;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b;
        synchronized (IronSource.class) {
            b = L.a().b(context);
        }
        return b;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return L.a().k(str);
    }

    public static void getOfferwallCredits() {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            com.ironsource.mediationsdk.sdk.j jVar = a.h.b;
            if (jVar != null) {
                jVar.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return L.a().l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, false, null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        L.a().a(activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(@NotNull Context context, String str, AD_UNIT... ad_unitArr) {
        L.a().a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return L.a().W(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return L.a().i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return L.a().g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return L.a().U(str);
    }

    public static boolean isInterstitialReady() {
        return L.a().h();
    }

    public static boolean isOfferwallAvailable() {
        return L.a().l();
    }

    public static boolean isRewardedVideoAvailable() {
        return L.a().c();
    }

    public static boolean isRewardedVideoPlacementCapped(String str) {
        int i;
        L a = L.a();
        int X = a.X(str);
        boolean z = X != 0 && ((i = L.b.b[X - 1]) == 1 || i == 2 || i == 3);
        if (z) {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(a.H, a.Z, a.h0);
            if (str != null) {
                L.C(mediationAdditionalData, new Object[][]{new Object[]{"placement", str}});
            }
            L.u(IronSourceConstants.RV_API_IS_CAPPED_TRUE, mediationAdditionalData);
        }
        return z;
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        L.a().a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        L.a().a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        L.a().a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(@NotNull Activity activity, String str) {
        L.a().d(activity, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        L.a().d(null, str, null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(@NotNull Activity activity, String str, String str2) {
        L.a().c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        L.a().c(null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(@NotNull Activity activity, String str) {
        L.a().b(activity, str, null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        L.a().b(null, str, null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(@NotNull Activity activity, String str, String str2) {
        L.a().a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        L.a().a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadInterstitial()", 1);
        try {
            if (a.I) {
                a.l.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C1286u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", "Interstitial"));
            } else if (!a.L) {
                a.l.log(ironSourceTag, "init() must be called before loadInterstitial()", 3);
                C1286u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", "Interstitial"));
            } else {
                Q.f b = Q.a().b();
                if (b == Q.f.INIT_FAILED) {
                    a.l.log(ironSourceTag, "init() had failed", 3);
                    C1286u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (b == Q.f.INIT_IN_PROGRESS) {
                    if (!Q.a().c()) {
                        a.f0 = true;
                        return;
                    }
                    a.l.log(ironSourceTag, "init() had failed", 3);
                    C1286u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
                } else if (!a.S()) {
                    a.l.log(ironSourceTag, "No interstitial configurations found", 3);
                    C1286u.a().a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
                } else if (!a.d0) {
                    a.g.c();
                } else {
                    if (a.e0) {
                        com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
                        if (gVar != null) {
                            gVar.d();
                            return;
                        }
                    } else {
                        ke3 ke3Var = a.T;
                        if (ke3Var != null) {
                            ke3Var.e();
                            return;
                        }
                    }
                    a.f0 = true;
                }
            }
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C1286u.a().a(AD_UNIT.INTERSTITIAL, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "loadRewardedVideo()", 1);
        try {
            if (a.H) {
                a.l.log(ironSourceTag, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C1286u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a.a0) {
                a.l.log(ironSourceTag, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a.K) {
                a.l.log(ironSourceTag, "init() must be called before loadRewardedVideo()", 3);
                C1286u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                Q.f b = Q.a().b();
                if (b == Q.f.INIT_FAILED) {
                    a.l.log(ironSourceTag, "init() had failed", 3);
                    C1286u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b == Q.f.INIT_IN_PROGRESS) {
                    if (!Q.a().c()) {
                        a.b0 = true;
                        return;
                    }
                    a.l.log(ironSourceTag, "init() had failed", 3);
                    C1286u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (!a.P()) {
                    a.l.log(ironSourceTag, "No rewarded video configurations found", 3);
                    C1286u.a().a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else {
                    com.ironsource.mediationsdk.adunit.c.h hVar = a.W;
                    if (hVar == null) {
                        a.b0 = true;
                    } else {
                        hVar.d();
                    }
                }
            }
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C1286u.a().a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(510, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        L a = L.a();
        try {
            a.l.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        L a = L.a();
        try {
            a.l.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(@NotNull ImpressionDataListener impressionDataListener) {
        L a = L.a();
        if (a.a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.d.a.a().b(impressionDataListener);
            D d = a.S;
            if (d != null) {
                d.b(impressionDataListener);
            }
            ke3 ke3Var = a.T;
            if (ke3Var != null) {
                ke3Var.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
            if (gVar != null) {
                gVar.b(impressionDataListener);
            }
            com.ironsource.mediationsdk.adunit.c.h hVar = a.W;
            if (hVar != null) {
                hVar.b(impressionDataListener);
            }
            T t = a.U;
            if (t != null) {
                t.b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.q.b = null;
        F.a().a((InterstitialListener) null);
        F.a().a((LevelPlayInterstitialListener) null);
    }

    public static void removeOfferwallListener() {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.q.c = null;
    }

    public static void removeRewardedVideoListener() {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.q.a = null;
        ae.a().a = null;
        ae.a().b = null;
    }

    public static void setAdRevenueData(@NotNull String str, @NotNull JSONObject jSONObject) {
        L a = L.a();
        if (a.a((Object) jSONObject, "setAdRevenueData - impressionData is null") && a.a((Object) str, "setAdRevenueData - dataSource is null")) {
            a.o0.a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        L.a();
        L.a(z);
    }

    public static void setConsent(boolean z) {
        L.a().b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return L.a().c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        L.a();
        L.a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        L.a();
        L.y(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(@NotNull ImpressionDataListener impressionDataListener) {
        L a = L.a();
        IronLog.API.info("removing all impression data listeners");
        com.ironsource.d.a.a().c();
        D d = a.S;
        if (d != null) {
            d.b();
        }
        ke3 ke3Var = a.T;
        if (ke3Var != null) {
            ke3Var.b();
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
        if (gVar != null) {
            gVar.g();
        }
        com.ironsource.mediationsdk.adunit.c.h hVar = a.W;
        if (hVar != null) {
            hVar.g();
        }
        T t = a.U;
        if (t != null) {
            t.b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.q.b = interstitialListener;
        F.a().a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        L.a();
        L.a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        L.a();
        L.a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        L.a().a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        L a = L.a();
        if (logListener == null) {
            a.l.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.r.c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        L.a().a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        L a = L.a();
        try {
            IronSourceLoggerManager ironSourceLoggerManager = a.l;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, a.b + ":setMediationSegment(segment:" + str + ")", 1);
            com.ironsource.d.b bVar = new com.ironsource.d.b();
            L.z(str, bVar);
            if (bVar.a()) {
                a.v = str;
            } else {
                IronSourceLoggerManager.getLogger().log(ironSourceTag, bVar.b().toString(), 2);
            }
        } catch (Exception e) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, a.b + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        L.a().d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        L.a().a(str, arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        L.a().a(str, list);
    }

    public static void setNetworkData(@NotNull String str, @NotNull JSONObject jSONObject) {
        L.a();
        L.a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.q.c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        L a = L.a();
        a.l.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.q.a = rewardedVideoListener;
        ae.a().a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        L a = L.a();
        if (map != null) {
            try {
                if (map.size() == 0) {
                    return;
                }
                a.l.log(IronSourceLogger.IronSourceTag.API, a.b + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                a.n = new HashMap(map);
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.l;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.b + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        L a = L.a();
        a.E = ironSourceSegment;
        com.ironsource.mediationsdk.adunit.c.h hVar = a.W;
        if (hVar != null) {
            hVar.a(ironSourceSegment);
        }
        D d = a.S;
        if (d != null) {
            d.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
        if (gVar != null) {
            gVar.a(ironSourceSegment);
        }
        ke3 ke3Var = a.T;
        if (ke3Var != null) {
            ke3Var.a(ironSourceSegment);
        }
        T t = a.U;
        if (t != null) {
            t.a(ironSourceSegment);
        }
        com.ironsource.mediationsdk.a.d.d().v = a.E;
        com.ironsource.mediationsdk.a.h d2 = com.ironsource.mediationsdk.a.h.d();
        IronSourceSegment ironSourceSegment2 = a.E;
        d2.v = ironSourceSegment2;
        com.ironsource.mediationsdk.a.g.w.v = ironSourceSegment2;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        L a = L.a();
        com.ironsource.mediationsdk.sdk.i iVar = a.q;
        if (iVar != null) {
            iVar.d = segmentListener;
            Q.a().y = a.q;
        }
    }

    public static void setUserId(String str) {
        L.a().A(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        L a = L.a();
        a.z = context;
        a.A = Boolean.valueOf(z);
        if (!a.d0) {
            he3 he3Var = a.g;
            if (he3Var != null) {
                he3Var.a(context, z);
            }
        } else if (a.e0) {
            com.ironsource.mediationsdk.adunit.c.g gVar = a.V;
            if (gVar != null) {
                gVar.b(z);
            }
        } else {
            ke3 ke3Var = a.T;
            if (ke3Var != null) {
                ke3Var.a(z);
            }
        }
        if (a.Z) {
            D d = a.S;
            if (d != null) {
                d.a(context, z);
                return;
            }
            return;
        }
        se3 se3Var = a.f;
        if (se3Var != null) {
            se3Var.a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.I) {
                a.l.log(ironSourceTag, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
                return;
            }
            ue3 ue3Var = a.l0;
            if (ue3Var == null) {
                a.l.log(ironSourceTag, "Interstitial video was not initiated", 3);
                E.a().b(str, new IronSourceError(508, "Interstitial video was not initiated"));
            } else if (ue3Var.a.containsKey(str)) {
                C1288x c1288x = ue3Var.a.get(str);
                ue3Var.a(IronSourceConstants.IS_INSTANCE_SHOW, c1288x);
                c1288x.a();
            } else {
                ue3.c(2500, str);
                E.a().b(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
            }
        } catch (Exception e) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            E.a().b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        L.a().f(str);
    }

    public static void showInterstitial() {
        L a = L.a();
        IronSourceLoggerManager ironSourceLoggerManager = a.l;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showInterstitial()", 1);
        try {
            if (a.I) {
                a.l.log(ironSourceTag, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                F.a().a(new IronSourceError(510, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), null);
            } else if (!a.R()) {
                F.a().a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"), null);
            } else {
                InterstitialPlacement Q = a.Q();
                if (Q != null) {
                    a.h(Q.getPlacementName());
                } else {
                    F.a().a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), null);
                }
            }
        } catch (Exception e) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            F.a().a(new IronSourceError(510, e.getMessage()), null);
        }
    }

    public static void showInterstitial(String str) {
        L.a().h(str);
    }

    public static void showOfferwall() {
        L a = L.a();
        try {
            a.l.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.T()) {
                a.q.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            com.ironsource.mediationsdk.model.k a2 = a.u.c.c.a();
            if (a2 != null) {
                a.j(a2.b);
            }
        } catch (Exception e) {
            a.l.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.q.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        L.a().j(str);
    }

    public static void showRewardedVideo() {
        L a = L.a();
        if (!a.O()) {
            ae.a().a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            a.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement J = a.J();
        if (J != null) {
            a.e(J.getPlacementName());
            return;
        }
        a.l.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
        ae.a().a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
    }

    public static void showRewardedVideo(String str) {
        L.a().e(str);
    }
}