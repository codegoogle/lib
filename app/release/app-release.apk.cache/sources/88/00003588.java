package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.C1274f;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.m;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.v  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1287v extends A implements InterfaceC1275g, BannerSmashListener {
    public C1276h b;
    public long n;
    private long o;
    private String p;
    private String q;
    private C1279l r;
    public ISDemandOnlyBannerLayout s;

    /* renamed from: com.ironsource.mediationsdk.v$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ C1278k s;

        public b(C1278k c1278k) {
            this.s = c1278k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1287v.this.m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_REQUEST, null);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("auction waterfallString = " + this.s.a());
            C1287v.this.m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.s.a()}});
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            C1276h c1276h = C1287v.this.b;
            C1278k c1278k = this.s;
            C1287v c1287v = C1287v.this;
            try {
                com.ironsource.environment.e.c.a.c(c1276h.f.a(applicationContext, c1278k, c1287v));
            } catch (Exception e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("execute auction exception " + e.getMessage());
                if (c1287v != null) {
                    c1287v.a(1000, e.getMessage(), 0, "other", 0L);
                }
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.v$c */
    /* loaded from: classes3.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("load timed out state=" + C1287v.this.i());
            C1287v.this.n(new IronSourceError(608, "load timed out"));
        }
    }

    public C1287v(String str, String str2, NetworkSettings networkSettings, long j, AbstractAdapter abstractAdapter) {
        super(new a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.g = j;
        this.p = str;
        this.q = str2;
        this.r = new C1279l();
        this.a.initBannerForBidding(str, str2, this.d, this);
    }

    private void o(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 606) {
            m(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j)}});
        }
    }

    private void r(List<String> list, String str) {
        A.c(list, e(), f(), this.k, str);
    }

    private boolean t() {
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.s;
        return iSDemandOnlyBannerLayout == null || iSDemandOnlyBannerLayout.isDestroyed();
    }

    private void u() {
        IronLog.INTERNAL.verbose("");
        com.ironsource.environment.e.c.a.c(new b(v()));
    }

    private C1278k v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e());
        C1278k c1278k = new C1278k(com.anythink.expressad.foundation.g.a.f.e);
        c1278k.a(arrayList);
        c1278k.b("" + f() + e());
        c1278k.a(g());
        c1278k.b(IronSourceUtils.getSerr() == 1);
        c1278k.c(true);
        c1278k.a(true);
        c1278k.a(this.s.getSize());
        return c1278k;
    }

    private String w() {
        return this.c.a.isMultipleInstances() ? this.c.a.getProviderTypeForReflection() : this.c.a.getProviderName();
    }

    public void a() {
        this.h = null;
        this.i = null;
        this.r = new C1279l();
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1275g
    public final void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("Auction failed. error " + i + " - " + str);
        this.h = null;
        this.i = null;
        m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, i()}});
        if (f(A.a.LOAD_IN_PROGRESS)) {
            n(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_AUCTION_FAILED, "No available ad to load"));
        }
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        A.a[] aVarArr = {A.a.NOT_LOADED, A.a.LOADED, A.a.SHOW_IN_PROGRESS};
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        if (a(aVarArr, aVar) == aVar) {
            ironLog.verbose("load banner id: " + g() + " already in progress");
            return;
        }
        a();
        if (!h()) {
            ironLog.verbose("can't load banner when isOneFlow = false");
            n(new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing configuration settings"));
            return;
        }
        m(IronSourceConstants.BN_INSTANCE_LOAD, null);
        this.s = iSDemandOnlyBannerLayout;
        this.n = wo1.T();
        s();
        if (this.b.f.a()) {
            u();
            return;
        }
        ironLog.verbose("can't load the banner the auction isn't enabled");
        n(new IronSourceError(IronSourceError.ERROR_CODE_MISSING_CONFIGURATION, "Missing server configuration"));
    }

    public final void a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("state=" + i());
        A.a[] aVarArr = {A.a.NOT_LOADED, A.a.LOADED, A.a.SHOW_IN_PROGRESS};
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        if (a(aVarArr, aVar) == aVar) {
            ironLog.verbose("load instance id: " + g() + " already in progress");
            return;
        }
        a();
        if (t()) {
            n(new IronSourceError(610, "bannerLayout is null or destroyed"));
        } else if (!k()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadBannerForBidder in IAB flow must be called by bidder instances");
            m(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, null);
            n(buildLoadFailedError);
        } else if (this.a == null) {
            ironLog.error("adapter object is null");
            n(new IronSourceError(611, "Missing internal configuration"));
        } else {
            try {
                C1274f.a();
                JSONObject e = C1274f.e(str);
                C1274f.a();
                C1274f.a a = C1274f.a(e);
                C1274f.a();
                com.ironsource.mediationsdk.server.b a2 = C1274f.a(e(), a.b);
                if (a2 == null) {
                    IronSourceError buildLoadFailedError2 = ErrorBuilder.buildLoadFailedError("loadBannerForBidder invalid enriched adm");
                    m(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, null);
                    n(buildLoadFailedError2);
                    return;
                }
                String b2 = a2.b();
                if (b2 == null) {
                    ironLog.error("serverData is null");
                    n(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load"));
                    return;
                }
                a(b2);
                b(a.a);
                a(a.d);
                m(IronSourceConstants.BN_INSTANCE_LOAD, null);
                m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, null);
                this.n = new Date().getTime();
                s();
                this.r.c(a2.d());
                this.a.initBannerForBidding(this.p, this.q, this.d, this);
                this.a.loadBannerForDemandOnlyForBidding(iSDemandOnlyBannerLayout, this.d, this, b2);
            } catch (Exception e2) {
                n(ErrorBuilder.buildLoadFailedError("loadBannerForBidder: Exception= " + e2.getMessage()));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1275g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        String str3;
        IronSourceError ironSourceError;
        IronSourceError ironSourceError2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        this.h = str;
        this.i = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            m(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}});
        }
        m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        if (list.isEmpty()) {
            str3 = "";
        } else {
            str3 = "1" + list.get(0).a();
        }
        objArr2[1] = str3;
        objArr[0] = objArr2;
        m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_AUCTION_RESPONSE_WATERFALL, objArr);
        A.a aVar = A.a.LOAD_IN_PROGRESS;
        if (f(aVar)) {
            if (list.isEmpty()) {
                ironSourceError = new IronSourceError(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, "There is no available ad to load");
                ironLog.error("loadBanner - empty waterfall");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                n(ironSourceError);
                return;
            }
            com.ironsource.mediationsdk.server.b bVar2 = list.get(0);
            this.r.c(bVar2.d());
            this.r.a(bVar2.f());
            this.r.b(bVar2.e());
            String b2 = bVar2.b();
            a(b2);
            ironLog.verbose("");
            if (f(aVar)) {
                if (b2 == null) {
                    ironLog.verbose("serverData is null");
                    ironSourceError2 = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, "No available ad to load");
                } else if (this.a != null) {
                    m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_WITH_ADM, null);
                    this.o = System.currentTimeMillis();
                    this.a.initBannerForBidding(this.p, this.q, this.d, this);
                    this.a.loadBannerForDemandOnlyForBidding(this.s, this.d, this, b2);
                    return;
                } else {
                    ironLog.verbose("adapter object is null");
                    ironSourceError2 = new IronSourceError(611, "Missing internal configuration");
                }
                n(ironSourceError2);
            }
        }
    }

    public final void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("");
        if (t()) {
            ironLog.error("Banner is null or already destroyed and can't be used anymore");
            return;
        }
        a(new A.a[]{A.a.LOADED, A.a.LOAD_IN_PROGRESS, A.a.SHOW_IN_PROGRESS}, A.a.NOT_LOADED);
        j();
        ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.s;
        if (iSDemandOnlyBannerLayout != null) {
            iSDemandOnlyBannerLayout.w = true;
            iSDemandOnlyBannerLayout.v = null;
            iSDemandOnlyBannerLayout.t = null;
            iSDemandOnlyBannerLayout.u = null;
            iSDemandOnlyBannerLayout.s = null;
            iSDemandOnlyBannerLayout.removeBannerListener();
        }
        this.s = null;
        AbstractAdapter abstractAdapter = this.a;
        if (abstractAdapter == null) {
            ironLog.error("can't destroy adapter. mAdapter == null");
        } else {
            abstractAdapter.destroyBanner(this.d);
        }
        m(IronSourceConstants.BN_INSTANCE_DESTROY, null);
        ironLog.verbose("banner layout was destroyed. bannerId: " + g());
    }

    @Override // com.ironsource.mediationsdk.A
    public final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        try {
            if (t()) {
                hashMap.put("reason", "banner is destroyed");
            } else {
                C1284r.a(hashMap, this.s.getSize());
            }
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.c.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.c.a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (h()) {
                hashMap.put("isOneFlow", 1);
            }
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
            hashMap.put("instanceType", Integer.valueOf(this.c.d));
            if (!TextUtils.isEmpty(this.h)) {
                hashMap.put("auctionId", this.h);
            }
            JSONObject jSONObject = this.i;
            if (jSONObject != null && jSONObject.length() > 0) {
                hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.i);
            }
            if (!TextUtils.isEmpty(this.k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.k);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Instance: " + e() + " " + e.getMessage());
        }
        return hashMap;
    }

    public void m(int i, Object[][] objArr) {
        Map<String, Object> d = d();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    if (objArr2[1] != null) {
                        d.put(objArr2[0].toString(), objArr2[1]);
                    }
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(d)));
    }

    public void n(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("error = " + ironSourceError.getErrorMessage() + " smash - " + w());
        if (e(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            j();
            o(ironSourceError, System.currentTimeMillis() - this.n);
            r(this.r.b(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            this.s.sendBannerAdLoadFailed(g(), ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + w());
        m(IronSourceConstants.BN_INSTANCE_CLICK, null);
        if (t()) {
            return;
        }
        m a = m.a();
        String g = g();
        if (a.b != null) {
            com.ironsource.environment.e.c.a.b(new m.d(g));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + w());
        m(IronSourceConstants.BN_INSTANCE_LEAVE_APP, null);
        if (t()) {
            return;
        }
        m a = m.a();
        String g = g();
        if (a.b != null) {
            com.ironsource.environment.e.c.a.b(new m.e(g));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + w());
        m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.o)}});
        n(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash = " + w());
        int b2 = com.ironsource.mediationsdk.utils.o.a().b(3);
        m(IronSourceConstants.TROUBLESHOOTING_BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b2)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.o)}});
        if (e(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            j();
            if (!t()) {
                com.ironsource.environment.e.c.a.b(new ISDemandOnlyBannerLayout.b(view, layoutParams));
            }
            m(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(b2)}, new Object[]{"duration", Long.valueOf(System.currentTimeMillis() - this.n)}});
            com.ironsource.mediationsdk.utils.o.a().a(3);
            r(this.r.a(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = this.s;
            String g = g();
            m a = m.a();
            if (a.b != null) {
                com.ironsource.environment.e.c.a.b(new m.b(g));
            }
            iSDemandOnlyBannerLayout.x = true;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        if (e(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("smash - " + w());
            m(IronSourceConstants.BN_INSTANCE_SHOW, null);
            r(this.r.c(), IronSourceUtils.getCurrentMethodName());
            if (t()) {
                return;
            }
            m a = m.a();
            String g = g();
            if (a.b != null) {
                com.ironsource.environment.e.c.a.b(new m.c(g));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + w() + " " + ironSourceError.toString());
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("smash - " + w());
    }

    public void s() {
        IronLog.INTERNAL.verbose("");
        d(new c());
    }
}