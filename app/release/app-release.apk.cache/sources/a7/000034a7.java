package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1274f;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.b;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.n;
import com.p7700g.p99005.wo1;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class c<Listener extends com.ironsource.mediationsdk.adunit.c.a.b> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, c.a, n.a {
    public com.ironsource.mediationsdk.adunit.d.a a;
    public Listener b;
    private BaseAdAdapter<?, AdapterAdListener> c;
    public d d;
    public a e;
    public Placement f;
    private com.ironsource.mediationsdk.model.a g;
    private JSONObject h;
    private String i;
    public AdData j;
    private Long k;
    private f l;
    private com.ironsource.mediationsdk.b.c m;
    public Object n = new Object();

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.a = aVar;
        this.b = listener;
        this.d = new d(aVar.a, d.b.PROVIDER, this);
        this.g = aVar2;
        this.h = aVar2.b;
        this.c = baseAdAdapter;
        this.m = new com.ironsource.mediationsdk.b.c(this.a.d * 1000);
        c(a.NONE);
    }

    private boolean a() {
        return this.e == a.INIT_IN_PROGRESS;
    }

    private void b(AdapterErrorType adapterErrorType, int i, String str, long j) {
        d dVar = this.d;
        if (dVar != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                dVar.b.b(j, i);
            } else if (TextUtils.isEmpty(str)) {
                this.d.b.a(j, i);
            } else {
                this.d.b.a(j, i, str);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.c;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception unused) {
            IronLog.INTERNAL.error(d("could not get adapter version for event data" + m()));
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.g.a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.g.a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(l()));
        boolean z = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.i)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.i);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.a.e));
        JSONObject jSONObject = this.a.f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.a.f);
        }
        if (!TextUtils.isEmpty(this.a.g)) {
            hashMap.put("auctionId", this.a.g);
        }
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_OPENED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED) {
            z = false;
        }
        if (z) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.a.h));
            if (!TextUtils.isEmpty(this.a.i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.a.i);
            }
        }
        if (!TextUtils.isEmpty(this.a.c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.a.c.getCustomNetwork());
        }
        return hashMap;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(String str) {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(d(""));
            boolean z = false;
            this.d.b.a(false);
            this.k = null;
            this.l = new f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.a.b);
            hashMap.putAll(com.ironsource.mediationsdk.c.b.a(this.h));
            this.j = new AdData(str, hashMap);
            synchronized (this.n) {
                if (this.e != a.NONE) {
                    z = true;
                } else {
                    c(a.INIT_IN_PROGRESS);
                }
            }
            if (z) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.e;
                ironLog.error(d(str2));
                this.d.e.m(str2);
                onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), str2);
                return;
            }
            this.m.a(this);
            ?? networkAdapter = this.c.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.j, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + m();
            ironLog.error(d(str3));
            this.d.e.a(str3);
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), str3);
        } catch (Throwable th) {
            String E = wo1.E(th, new StringBuilder("loadAd - exception = "));
            IronLog.INTERNAL.error(d(E));
            d dVar = this.d;
            if (dVar != null) {
                dVar.e.m(E);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.a.a), E);
        }
    }

    @Override // com.ironsource.mediationsdk.b.c.a
    public final void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("state = " + this.e + ", isBidder = " + i()));
        long a2 = f.a(this.l);
        synchronized (this.n) {
            if (!d()) {
                String format = String.format("unexpected timeout for %s, state - %s, error - %s", m(), this.e, 1025);
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.l(format);
                }
                return;
            }
            c(a.FAILED);
            d dVar2 = this.d;
            if (dVar2 != null) {
                dVar2.b.a(a2, 1025);
                this.d.b.a(a2, 1025, "time out");
            }
            Listener listener = this.b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            f.a(this.l);
            listener.a(buildLoadFailedError, this);
        }
    }

    public final void b(String str) {
        C1274f.a();
        this.i = C1274f.d(str);
    }

    public void c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.c;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.c = null;
            } catch (Exception e) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.g.a.getProviderName() + " - " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(d(str));
                this.d.e.m(str);
            }
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.a();
            this.d = null;
        }
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.c();
            this.m = null;
        }
    }

    public final void c(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("to " + aVar));
        this.e = aVar;
    }

    public final String d(String str) {
        String str2 = this.a.a.name() + " - " + m() + " - state = " + this.e;
        return TextUtils.isEmpty(str) ? str2 : wo1.u(str2, " - ", str);
    }

    public final boolean d() {
        a aVar = this.e;
        return aVar == a.INIT_IN_PROGRESS || aVar == a.LOADING;
    }

    public final boolean e() {
        return this.e == a.LOADED;
    }

    public final boolean f() {
        return this.e != a.FAILED;
    }

    public final void g() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.a();
        }
    }

    public final Long h() {
        return this.k;
    }

    public final boolean i() {
        return this.g.c;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.g.e;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.g.a.getProviderName();
    }

    public final int l() {
        return this.g.d;
    }

    public final String m() {
        return String.format("%s %s", k(), Integer.valueOf(hashCode()));
    }

    public final String n() {
        return this.g.a.getProviderTypeForReflection();
    }

    public final String o() {
        return this.a.g;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.d(q());
        }
        this.b.b(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("error = " + i + ", " + str));
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        long a2 = f.a(this.l);
        synchronized (this.n) {
            a aVar = this.e;
            if (aVar == a.LOADING) {
                b(adapterErrorType, i, str, a2);
                c(a.FAILED);
                this.b.a(new IronSourceError(i, str), this);
            } else if (aVar == a.FAILED) {
                b(adapterErrorType, i, str, a2);
            } else if (aVar == a.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.k = Long.valueOf(System.currentTimeMillis());
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.p(String.format("ad expired for %s", this.g.a.getProviderName()));
                }
            } else {
                String format = String.format("unexpected load failed for %s, state - %s, error - %s, %s", m(), this.e, Integer.valueOf(i), str);
                d dVar2 = this.d;
                if (dVar2 != null) {
                    dVar2.e.i(format);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(d(""));
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        a aVar = this.e;
        if (aVar == a.LOADING) {
            long a2 = f.a(this.l);
            d dVar = this.d;
            if (dVar != null) {
                dVar.b.a(a2, false);
            }
            c(a.LOADED);
            this.b.a(this);
        } else if (aVar != a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", m(), this.e);
            d dVar2 = this.d;
            if (dVar2 != null) {
                dVar2.e.h(format);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("error = " + i + ", " + str));
        if (!a()) {
            if (this.e != a.FAILED) {
                String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", m(), this.e, Integer.valueOf(i), str);
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.e(format);
                    return;
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        c(a.FAILED);
        Listener listener = this.b;
        IronSourceError ironSourceError = new IronSourceError(i, str);
        f.a(this.l);
        listener.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(""));
        if (!a()) {
            if (this.e != a.FAILED) {
                String format = String.format("unexpected init success for %s, state - %s", m(), this.e);
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.d(format);
                    return;
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.b.c cVar = this.m;
        if (cVar != null) {
            cVar.d();
        }
        c(a.READY_TO_LOAD);
        ironLog.verbose(d(""));
        c(a.LOADING);
        try {
            this.m.a(this);
            this.c.loadAd(this.j, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } catch (Throwable th) {
            String E = wo1.E(th, new StringBuilder("unexpected error while calling adapter.loadAd() - "));
            IronLog.INTERNAL.error(d(E));
            d dVar2 = this.d;
            if (dVar2 != null) {
                dVar2.e.m(E);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, 510, E);
        }
    }

    public final boolean p() {
        return this.e == a.SHOWING;
    }

    public final String q() {
        Placement placement = this.f;
        return placement == null ? "" : placement.getPlacementName();
    }
}