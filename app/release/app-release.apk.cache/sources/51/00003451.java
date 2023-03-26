package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class V extends ac implements c.a, BannerSmashListener {
    private com.ironsource.mediationsdk.c.b h;
    private com.ironsource.mediationsdk.b.c i;
    private a j;
    private U k;
    private IronSourceBannerLayout l;
    public String m;
    private JSONObject n;
    private int o;
    private String p;
    private com.ironsource.mediationsdk.model.g q;
    private final Object r;
    private com.ironsource.mediationsdk.utils.f s;
    private boolean t;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    public V(com.ironsource.mediationsdk.c.b bVar, U u, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2, boolean z) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.r = new Object();
        this.j = a.NONE;
        this.h = bVar;
        this.i = new com.ironsource.mediationsdk.b.c(bVar.f());
        this.k = u;
        this.f = i;
        this.m = str;
        this.o = i2;
        this.p = str2;
        this.n = jSONObject;
        this.t = z;
        this.a.addBannerListener(this);
        if (h()) {
            f();
        }
    }

    public V(com.ironsource.mediationsdk.c.b bVar, U u, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i, boolean z) {
        this(bVar, u, networkSettings, abstractAdapter, i, "", null, 0, "", z);
    }

    private void a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (!u(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.j);
            return;
        }
        this.s = new com.ironsource.mediationsdk.utils.f();
        a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD : IronSourceConstants.BN_INSTANCE_LOAD, null);
        if (this.a != null) {
            try {
                if (h()) {
                    this.a.loadBannerForBidding(this.l, this.d, this, str);
                } else {
                    this.a.loadBanner(this.l, this.d, this);
                }
            } catch (Exception e) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("Exception while trying to load banner from " + this.a.getProviderName() + ", exception =  " + e.getLocalizedMessage());
                e.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(605, e.getLocalizedMessage()));
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", e.getLocalizedMessage()}});
            }
        }
    }

    private void f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "isBidder = " + h());
        r(a.INIT_IN_PROGRESS);
        w();
        try {
            if (this.a != null) {
                if (h()) {
                    this.a.initBannerForBidding(this.h.a(), this.h.b(), this.d, this);
                } else {
                    this.a.initBanners(this.h.a(), this.h.b(), this.d, this);
                }
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(612, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
        }
    }

    private void r(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "state = " + aVar.name());
        synchronized (this.r) {
            this.j = aVar;
        }
    }

    private void s(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        } else {
            a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        }
        U u = this.k;
        if (u != null) {
            u.a(ironSourceError, this);
        }
    }

    private static boolean t(int i) {
        return i == 3005 || i == 3002 || i == 3012 || i == 3015 || i == 3008 || i == 3305 || i == 3300 || i == 3306 || i == 3307 || i == 3302 || i == 3303 || i == 3304 || i == 3009;
    }

    private boolean u(a aVar, a aVar2) {
        boolean z;
        synchronized (this.r) {
            if (this.j == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(y() + "set state from '" + this.j + "' to '" + aVar2 + "'");
                z = true;
                this.j = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void v(int i) {
        a(i, null);
    }

    private void w() {
        if (this.a == null) {
            return;
        }
        try {
            String str = L.a().v;
            if (!TextUtils.isEmpty(str)) {
                this.a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to set custom params from " + this.a.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_internal)}, new Object[]{"reason", e.getLocalizedMessage()}});
        }
    }

    private boolean x() {
        boolean z;
        synchronized (this.r) {
            z = this.j == a.LOADED;
        }
        return z;
    }

    private String y() {
        return String.format("%s - ", p());
    }

    private boolean z() {
        IronSourceBannerLayout ironSourceBannerLayout = this.l;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        r(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.a;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.b.a.getBannerSettings());
        } catch (Exception e) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to destroy banner from " + this.a.getProviderName() + ", exception =  " + e.getLocalizedMessage());
            e.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_destroy)}, new Object[]{"reason", e.getLocalizedMessage()}});
        }
        v(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    public final void a(int i, Object[][] objArr) {
        Map<String, Object> n = n();
        if (z()) {
            n.put("reason", "banner is destroyed");
        } else {
            C1284r.a(n, this.l.getSize());
        }
        if (!TextUtils.isEmpty(this.m)) {
            n.put("auctionId", this.m);
        }
        JSONObject jSONObject = this.n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.n);
        }
        com.ironsource.mediationsdk.model.g gVar = this.q;
        if (gVar != null) {
            n.put("placement", gVar.getPlacementName());
        }
        if (t(i)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(n, this.o, this.p);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronLog.INTERNAL.error(k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e));
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(n)));
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.g gVar, String str) {
        U u;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        this.q = gVar;
        if (!C1284r.c(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            u = this.k;
            ironSourceError = new IronSourceError(610, str2);
        } else if (this.a != null) {
            this.l = ironSourceBannerLayout;
            this.i.a(this);
            try {
                if (h()) {
                    a(str);
                    return;
                } else {
                    f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(605, th.getLocalizedMessage()));
                return;
            }
        } else {
            ironLog.verbose("mAdapter is null");
            u = this.k;
            ironSourceError = new IronSourceError(611, "mAdapter is null");
        }
        u.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.b.c.a
    public final void b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (u(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(607, "Timed out");
        } else if (!u(a.LOADING, aVar2)) {
            ironLog.error("unexpected state - " + this.j);
            return;
        } else {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(608, "Timed out");
        }
        s(ironSourceError);
    }

    public final Map<String, Object> c() {
        AbstractAdapter abstractAdapter;
        try {
            if (!h() || (abstractAdapter = this.a) == null) {
                return null;
            }
            return abstractAdapter.getBannerBiddingData(this.d);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.a.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.ac
    public final void d() {
        this.i.c();
        super.d();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_CLICK, null);
        U u = this.k;
        if (u != null) {
            u.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, null);
        U u = this.k;
        if (u != null) {
            u.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.i.d();
        if (u(a.LOADING, a.LOAD_FAILED)) {
            s(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(p());
        this.i.d();
        if (!u(a.LOADING, a.LOADED)) {
            a(this.t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, null);
            return;
        }
        a(this.t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.s))}});
        U u = this.k;
        if (u != null) {
            u.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, null);
        U u = this.k;
        if (u != null) {
            u.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, null);
        U u = this.k;
        if (u != null) {
            u.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (x()) {
            a(IronSourceConstants.BN_INSTANCE_SHOW, null);
            U u = this.k;
            if (u != null) {
                u.e(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.j);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "Wrong State - " + this.j}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(y() + "error = " + ironSourceError);
        this.i.d();
        if (!u(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.j);
            return;
        }
        U u = this.k;
        if (u != null) {
            u.a(new IronSourceError(612, "Banner init failed"), this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(p());
        if (!u(a.INIT_IN_PROGRESS, a.READY_TO_LOAD) || h()) {
            return;
        }
        if (C1284r.c(this.l)) {
            a(null);
        } else {
            this.k.a(new IronSourceError(605, this.l == null ? "banner is null" : "banner is destroyed"), this);
        }
    }
}