package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.C1274f;
import com.ironsource.mediationsdk.C1288x;
import com.ironsource.mediationsdk.E;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ue3 implements com.ironsource.mediationsdk.sdk.c {
    public ConcurrentHashMap<String, C1288x> a = new ConcurrentHashMap<>();
    private com.ironsource.mediationsdk.utils.c b;

    public ue3(List<NetworkSettings> list, com.ironsource.mediationsdk.model.i iVar, String str, String str2) {
        this.b = iVar.i;
        for (NetworkSettings networkSettings : list) {
            if (networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || networkSettings.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C1272d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), true, false);
                if (a != null) {
                    this.a.put(networkSettings.getSubProviderId(), new C1288x(str, str2, networkSettings, this, iVar.e * 1000, a));
                }
            } else {
                e("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    public static void b(int i, C1288x c1288x, Object[][] objArr) {
        Map<String, Object> d = c1288x.d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    d.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(d)));
    }

    public static void c(int i, String str) {
        HashMap R = wo1.R(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        R.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (str == null) {
            str = "";
        }
        R.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(2500, new JSONObject(R)));
    }

    private static void d(C1288x c1288x, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyIsManager " + c1288x.e() + " : " + str, 0);
    }

    private static void e(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "DemandOnlyIsManager " + str, 0);
    }

    public void a(int i, C1288x c1288x) {
        b(i, c1288x, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C1288x c1288x) {
        d(c1288x, "onInterstitialAdShowFailed error=" + ironSourceError.toString());
        b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, c1288x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        E.a().b(c1288x.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(IronSourceError ironSourceError, C1288x c1288x, long j) {
        d(c1288x, "onInterstitialAdLoadFailed error=" + ironSourceError.toString());
        if (ironSourceError.getErrorCode() == 1158) {
            b(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, c1288x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1288x, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
        E.a().a(c1288x.g(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1288x c1288x) {
        d(c1288x, "onInterstitialAdOpened");
        b(IronSourceConstants.IS_INSTANCE_OPENED, c1288x, null);
        E a = E.a();
        String g = c1288x.g();
        if (a.b != null) {
            new Handler(Looper.getMainLooper()).post(new E.c(g));
        }
        if (c1288x.k()) {
            for (String str : c1288x.j) {
                C1274f.a();
                String a2 = C1274f.a(str, c1288x.e(), c1288x.f(), c1288x.k, "", "", "", "");
                C1274f.a();
                C1274f.h("onInterstitialAdOpened", c1288x.e(), a2);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void a(C1288x c1288x, long j) {
        d(c1288x, "onInterstitialAdReady");
        b(2003, c1288x, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        E a = E.a();
        String g = c1288x.g();
        if (a.b != null) {
            new Handler(Looper.getMainLooper()).post(new E.a(g));
        }
    }

    public final void a(String str, String str2, boolean z) {
        IronSourceError buildLoadFailedError;
        try {
            if (!this.a.containsKey(str)) {
                c(2500, str);
                E.a().a(str, ErrorBuilder.buildNonExistentInstanceError("Interstitial"));
                return;
            }
            C1288x c1288x = this.a.get(str);
            if (!z) {
                if (!c1288x.k()) {
                    b(2002, c1288x, null);
                    c1288x.a("", "", null, null);
                    return;
                }
                IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in non IAB flow must be called by non bidder instances");
                e(buildLoadFailedError2.getErrorMessage());
                b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1288x, null);
                E.a().a(str, buildLoadFailedError2);
                return;
            }
            if (c1288x.k()) {
                C1274f.a();
                JSONObject e = C1274f.e(str2);
                C1274f.a();
                C1274f.a a = C1274f.a(e);
                C1274f.a();
                com.ironsource.mediationsdk.server.b a2 = C1274f.a(c1288x.e(), a.b);
                if (a2 != null) {
                    c1288x.a(a2.b());
                    c1288x.b(a.a);
                    c1288x.a(a.d);
                    b(2002, c1288x, null);
                    c1288x.a(a2.b(), a.a, a.d, a2.d());
                    return;
                }
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm invalid enriched adm");
                e(buildLoadFailedError.getErrorMessage());
                b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1288x, null);
            } else {
                buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm in IAB flow must be called by bidder instances");
                e(buildLoadFailedError.getErrorMessage());
                b(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, c1288x, null);
            }
            E.a().a(str, buildLoadFailedError);
        } catch (Exception unused) {
            IronSourceError buildLoadFailedError3 = ErrorBuilder.buildLoadFailedError("loadInterstitialWithAdm exception");
            e(buildLoadFailedError3.getErrorMessage());
            E.a().a(str, buildLoadFailedError3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void b(C1288x c1288x) {
        d(c1288x, "onInterstitialAdClosed");
        b(IronSourceConstants.IS_INSTANCE_CLOSED, c1288x, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}});
        com.ironsource.mediationsdk.utils.o.a().a(2);
        E a = E.a();
        String g = c1288x.g();
        if (a.b != null) {
            new Handler(Looper.getMainLooper()).post(new E.d(g));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void c(C1288x c1288x) {
        d(c1288x, "onInterstitialAdClicked");
        b(2006, c1288x, null);
        E a = E.a();
        String g = c1288x.g();
        if (a.b != null) {
            new Handler(Looper.getMainLooper()).post(new E.f(g));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.c
    public final void d(C1288x c1288x) {
        b(IronSourceConstants.IS_INSTANCE_VISIBLE, c1288x, null);
        d(c1288x, "onInterstitialAdVisible");
    }
}