package com.ironsource.mediationsdk.adunit.c;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.B;
import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.C1276h;
import com.ironsource.mediationsdk.C1277j;
import com.ironsource.mediationsdk.C1286u;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.InterfaceC1271c;
import com.ironsource.mediationsdk.InterfaceC1275g;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.b.i;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.ai;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.m;
import com.ironsource.mediationsdk.utils.n;
import com.ironsource.mediationsdk.utils.o;
import com.p7700g.p99005.re3;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements j, com.ironsource.mediationsdk.adunit.b.c, com.ironsource.mediationsdk.adunit.c.a.b, com.ironsource.mediationsdk.adunit.e.b, ai, InterfaceC1271c, InterfaceC1275g {
    public com.ironsource.mediationsdk.adunit.e.a<Smash> a;
    public ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> b;
    public ConcurrentHashMap<String, C1277j.a> c;
    public C1276h d;
    public C1277j e;
    public int f;
    public JSONObject h;
    public com.ironsource.mediationsdk.server.b i;
    public Placement j;
    public n l;
    private com.ironsource.mediationsdk.utils.f m;
    private com.ironsource.mediationsdk.utils.f n;
    public com.ironsource.mediationsdk.adunit.c.a o;
    public a p;
    public com.ironsource.mediationsdk.adunit.c.c q;
    public B r;
    public com.ironsource.mediationsdk.adunit.b.d s;
    public re3 t;
    private com.ironsource.mediationsdk.utils.a u;
    public IronSourceSegment v;
    private Boolean y;
    private Set<ImpressionDataListener> z;
    public String g = "";
    public boolean k = false;
    public final Object w = new Object();
    private long x = 0;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            e.this.C();
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            e.this.h = new JSONObject();
            e.this.s.c.a();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (NetworkSettings networkSettings : e.this.o.c) {
                if (!e.this.l.b(new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(e.this.o.a))) && e.this.o(networkSettings)) {
                    if (networkSettings.isBidder(e.this.o.a)) {
                        AdapterBaseInterface a = C1272d.a().a(networkSettings, e.this.o.a);
                        if (a instanceof AdapterBidderInterface) {
                            try {
                                Map<String, Object> biddingData = ((AdapterBidderInterface) a).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                if (biddingData != null) {
                                    hashMap.put(networkSettings.getProviderInstanceName(), biddingData);
                                    sb.append(networkSettings.getInstanceType(e.this.o.a) + networkSettings.getProviderInstanceName() + ",");
                                } else {
                                    e.this.s.e.a(networkSettings.getProviderDefaultInstance(), a.getAdapterVersion(), a.getNetworkSDKVersion(), networkSettings.getSubProviderId(), "Missing bidding data");
                                }
                            } catch (Exception e) {
                                i iVar = e.this.s.e;
                                iVar.m("exception while calling networkAdapter.getBiddingData - " + e);
                            }
                        } else {
                            e.this.s.e.a(a == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface");
                        }
                    } else {
                        arrayList.add(networkSettings.getProviderInstanceName());
                        sb.append(networkSettings.getInstanceType(e.this.o.a) + networkSettings.getProviderInstanceName() + ",");
                    }
                }
            }
            IronLog ironLog = IronLog.INTERNAL;
            e eVar = e.this;
            ironLog.verbose(eVar.d("auction waterfallString = " + ((Object) sb)));
            if (hashMap.size() != 0 || arrayList.size() != 0) {
                e.this.s.c.a(sb.toString());
                e eVar2 = e.this;
                if (eVar2.d == null) {
                    ironLog.error(eVar2.d("mAuctionHandler is null"));
                    return;
                }
                int b = o.a().b(e.this.o.a);
                C1276h c1276h = e.this.d;
                Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                e eVar3 = e.this;
                c1276h.a(applicationContext, hashMap, arrayList, eVar3.e, b, eVar3.v);
                return;
            }
            ironLog.verbose(e.this.d("auction failed - no candidates"));
            e.this.s.c.a(0L, 1005, "No candidates available for auctioning");
            e eVar4 = e.this;
            IronSource.AD_UNIT ad_unit = eVar4.o.a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = 1024;
            } else {
                ironLog.warning("ad unit not supported - " + ad_unit);
                i = 510;
            }
            eVar4.f(i, "no auction candidates", true);
        }
    }

    public e(com.ironsource.mediationsdk.adunit.c.a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        this.z = new HashSet();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.a + ", loading mode = " + aVar.h.a);
        com.ironsource.mediationsdk.utils.f fVar = new com.ironsource.mediationsdk.utils.f();
        this.v = ironSourceSegment;
        this.o = aVar;
        this.s = new com.ironsource.mediationsdk.adunit.b.d(aVar.a, d.b.MEDIATION, this);
        this.t = new re3(this.o.a);
        this.q = new com.ironsource.mediationsdk.adunit.c.c(this.o.h, this);
        g(a.NONE);
        this.z = set;
        com.ironsource.mediationsdk.utils.c cVar = this.o.d;
        this.a = new com.ironsource.mediationsdk.adunit.e.a<>(cVar.p, cVar.h, this);
        this.s.a.a();
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.j = null;
        C1286u a2 = C1286u.a();
        com.ironsource.mediationsdk.adunit.c.a aVar2 = this.o;
        a2.a(aVar2.a, aVar2.f);
        this.h = new JSONObject();
        if (this.o.a()) {
            this.d = new C1276h(this.o.a.toString(), this.o.d, this);
        }
        com.ironsource.mediationsdk.adunit.c.a aVar3 = this.o;
        k(aVar3.c, aVar3.d.g);
        v();
        w();
        this.m = new com.ironsource.mediationsdk.utils.f();
        g(a.READY_TO_LOAD);
        this.s.a.a(com.ironsource.mediationsdk.utils.f.a(fVar));
        this.r = new B(aVar.i, this);
        this.u = new com.ironsource.mediationsdk.utils.a();
        if (this.o.h.b()) {
            ironLog.verbose("first automatic load");
            d();
        }
    }

    private ArrayList<Smash> A() {
        IronLog.INTERNAL.verbose(d("mWaterfall.size() = " + this.a.a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= this.a.a().size() || i2 >= this.o.e) {
                break;
            }
            Smash smash = this.a.a().get(i);
            if (smash.f()) {
                if (smash.d() || smash.e()) {
                    IronLog.INTERNAL.verbose("smash = " + smash.m());
                } else if (!smash.i()) {
                    arrayList.add(smash);
                } else if (i2 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + smash.k() + ". No other instances will be loaded at the same time.";
                    IronLog.INTERNAL.verbose(d(str));
                    IronSourceUtils.sendAutomationLog(str);
                    arrayList.add(smash);
                    i2++;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + smash.k() + " as a non bidder is being loaded";
                    IronLog.INTERNAL.verbose(d(str2));
                    IronSourceUtils.sendAutomationLog(str2);
                }
                i2++;
            } else {
                IronLog.INTERNAL.verbose(d(String.format("smash %s is not ready to load", smash.m())));
            }
            i++;
        }
        if (i2 == 0) {
            f(509, "Mediation No fill", true);
        }
        return arrayList;
    }

    private void B() {
        IronLog.INTERNAL.verbose(d(""));
        synchronized (this.w) {
            a aVar = this.p;
            a aVar2 = a.AUCTION;
            if (aVar == aVar2) {
                return;
            }
            g(aVar2);
            long a2 = this.o.d.j - com.ironsource.mediationsdk.utils.f.a(this.m);
            if (a2 > 0) {
                new Timer().schedule(new b(), a2);
            } else {
                C();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        IronLog.INTERNAL.verbose(d(""));
        AsyncTask.execute(new c());
    }

    private void D() {
        this.u.a(this.o.a, false);
    }

    private static String E() {
        return "fallback_" + System.currentTimeMillis();
    }

    private static String c(com.ironsource.mediationsdk.server.b bVar, int i) {
        return String.format("%s%s", Integer.valueOf(i), bVar.a());
    }

    private String e(List<com.ironsource.mediationsdk.server.b> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("waterfall.size() = " + list.size()));
        StringBuilder sb = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            com.ironsource.mediationsdk.server.b bVar = list.get(i);
            Smash p = p(bVar, str);
            if (p != null) {
                copyOnWriteArrayList.add(p);
                sb.append(c(bVar, p.l()));
            }
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        this.a.a(this.o.h.a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(d("updateWaterfall() - next waterfall is " + sb.toString()));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i, String str, boolean z) {
        g(a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("errorCode = " + i + ", errorReason = " + str));
        if (this.o.h.a()) {
            if (z) {
                this.s.b.a(com.ironsource.mediationsdk.utils.f.a(this.n), i, str);
            }
            C1286u.a().a(this.o.a, new IronSourceError(i, str));
        } else {
            if (z) {
                this.s.e.a(i, str);
            }
            l(false, false);
        }
        this.q.a();
    }

    private void k(List<NetworkSettings> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(networkSettings.getProviderName());
        }
        this.e = new C1277j(arrayList, i);
    }

    private boolean m(a aVar, a aVar2) {
        boolean z;
        synchronized (this.w) {
            if (this.p == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(d("set state from '" + this.p + "' to '" + aVar2 + "'"));
                z = true;
                this.p = aVar2;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(NetworkSettings networkSettings) {
        AdapterBaseInterface a2 = C1272d.a().a(networkSettings, this.o.a);
        return (a2 instanceof AdapterSettingsInterface) && this.a.a(this.o.h.a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a2).getLoadWhileShowSupportedState(networkSettings));
    }

    private Smash p(com.ironsource.mediationsdk.server.b bVar, String str) {
        NetworkSettings a2 = this.o.a(bVar.a());
        if (a2 != null) {
            C1272d.a().a(a2, this.o.a);
            Adapter a3 = a(a2, this.o.a);
            if (a3 != null) {
                Smash b2 = b(a2, a3, o.a().b(this.o.a), str);
                this.b.put(b2.k(), bVar);
                this.c.put(bVar.a(), C1277j.a.ISAuctionPerformanceDidntAttemptToLoad);
                return b2;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a2.getProviderInstanceName();
            IronLog.INTERNAL.error(d(str2));
            this.s.e.b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + bVar.a();
            IronLog.INTERNAL.error(d(str3));
            this.s.e.c(str3);
        }
        return null;
    }

    private void q(Smash smash) {
        IronLog.INTERNAL.verbose(d(""));
        String b2 = this.b.get(smash.k()).b();
        smash.b(b2);
        smash.a(b2);
    }

    private boolean t() {
        boolean z;
        synchronized (this.w) {
            z = this.p == a.LOADING;
        }
        return z;
    }

    private boolean u() {
        boolean z;
        synchronized (this.w) {
            z = this.p == a.AUCTION;
        }
        return z;
    }

    private void v() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.o.c) {
            arrayList.add(new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.a)));
        }
        this.l = new n(arrayList);
    }

    private void w() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(d(""));
        for (NetworkSettings networkSettings : this.o.c) {
            if (networkSettings.isIronSource() || networkSettings.isBidder(this.o.a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.o.b);
                IronSource.AD_UNIT ad_unit = this.o.a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = networkSettings.getInterstitialSettings();
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = networkSettings.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.o.a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(com.ironsource.mediationsdk.c.b.a(jSONObject));
                AdData adData = new AdData(null, hashMap);
                AdapterBaseInterface a2 = C1272d.a().a(networkSettings, this.o.a);
                if (a2 != null) {
                    try {
                        a2.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
                    } catch (Exception e) {
                        i iVar = this.s.e;
                        iVar.a("initNetworks - exception while calling networkAdapter.init - " + e);
                    }
                } else {
                    this.s.e.a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    private void x() {
        IronLog.INTERNAL.verbose(d(""));
        e(y(), E());
    }

    private List<com.ironsource.mediationsdk.server.b> y() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.o.c) {
            m mVar = new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.o.a));
            if (!networkSettings.isBidder(this.o.a) && !this.l.b(mVar) && o(networkSettings)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(mVar.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void z() {
        Iterator<Smash> it = A().iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    public abstract Adapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap R = wo1.R(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z = true;
        R.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.a.b)) {
            R.put("auctionId", this.a.b);
        }
        JSONObject jSONObject = this.h;
        if (jSONObject != null && jSONObject.length() > 0) {
            R.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.h);
        }
        R.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(o.a().b(this.o.a)));
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED) {
            z = false;
        }
        if (z) {
            R.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f));
            if (!TextUtils.isEmpty(this.g)) {
                R.put(IronSourceConstants.AUCTION_FALLBACK, this.g);
            }
        }
        return R;
    }

    @Override // com.ironsource.mediationsdk.adunit.e.b
    public final void a(int i) {
        i iVar = this.s.e;
        iVar.o("waterfalls hold too many with size = " + i);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1275g
    public final void a(int i, String str, int i2, String str2, long j) {
        IronLog ironLog = IronLog.INTERNAL;
        String str3 = "";
        ironLog.verbose(d(""));
        if (!u()) {
            this.s.e.g("unexpected auction fail - error = " + i + ", " + str);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        ironLog.verbose(d(str4));
        StringBuilder sb = new StringBuilder();
        IronSource.AD_UNIT ad_unit = this.o.a;
        if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
            str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
            str3 = "BN";
        }
        sb.append(str3);
        sb.append(": ");
        sb.append(str4);
        IronSourceUtils.sendAutomationLog(sb.toString());
        this.f = i2;
        this.g = str2;
        this.h = new JSONObject();
        x();
        this.s.c.a(j, i, str);
        g(a.LOADING);
        z();
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.v = ironSourceSegment;
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(cVar.m()));
        if (cVar.o() != this.a.b) {
            String str = "onLoadSuccess was invoked with state = " + this.p + " auctionId: " + cVar.o() + " and the current id is " + this.a.b;
            ironLog.verbose(str);
            this.s.e.h(str);
            return;
        }
        this.c.put(cVar.k(), C1277j.a.ISAuctionPerformanceLoadedSuccessfully);
        if (!m(a.LOADING, a.READY_TO_SHOW)) {
            this.s.e.h(String.format("unexpected load success for smash - %s", cVar.m()));
            return;
        }
        long a2 = com.ironsource.mediationsdk.utils.f.a(this.n);
        com.ironsource.mediationsdk.adunit.c.a aVar = this.o;
        this.s.b.a(a2, aVar.a == IronSource.AD_UNIT.REWARDED_VIDEO && aVar.h.a == a.EnumC0116a.MANUAL);
        if (this.o.h.b()) {
            this.r.a(0L);
        }
        if (this.o.a()) {
            com.ironsource.mediationsdk.server.b bVar = this.b.get(cVar.k());
            if (bVar != null) {
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.a;
                aVar2.a(aVar2.b, bVar.a(""));
                C1276h.a(bVar, cVar.l(), this.i);
                ArrayList arrayList = new ArrayList();
                Iterator<Smash> it = this.a.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().k());
                }
                C1276h.a(arrayList, this.b, cVar.l(), this.i, bVar);
            } else {
                String k = cVar.k();
                String s = wo1.s("winner instance missing from waterfall - ", k);
                ironLog.verbose(d(s));
                this.s.e.a(1010, s, k);
            }
        }
        if (!this.o.h.a()) {
            l(true, false);
            return;
        }
        re3 re3Var = this.t;
        final AdInfo a3 = this.a.a(cVar.o());
        IronSource.AD_UNIT ad_unit = re3Var.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(a3);
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.INTERNAL.warning("ad unit not supported - " + re3Var.a);
        } else {
            final ae a4 = ae.a();
            RewardedVideoListener rewardedVideoListener = a4.a;
            if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
                com.ironsource.environment.e.c.a.b(new Runnable() { // from class: com.ironsource.mediationsdk.ae.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a4.a != null) {
                            ((RewardedVideoManualListener) a4.a).onRewardedVideoAdReady();
                            ae.c(a4, "onRewardedVideoAdReady()");
                        }
                    }
                });
            }
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = a4.b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            com.ironsource.environment.e.c.a.b(new Runnable() { // from class: com.ironsource.mediationsdk.ae.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (a4.b != null) {
                        ((LevelPlayRewardedVideoManualListener) a4.b).onAdReady(a4.f(a3));
                        IronLog ironLog2 = IronLog.CALLBACK;
                        ironLog2.info("onAdReady() adInfo = " + a4.f(a3));
                    }
                }
            });
        }
    }

    public final void a(@NotNull ImpressionDataListener impressionDataListener) {
        this.z.add(impressionDataListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[LOOP:0: B:18:0x0087->B:20:0x008d, LOOP_END] */
    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        Iterator<Smash> it;
        ArrayList<Smash> arrayList = new ArrayList<>();
        synchronized (this.w) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(d(cVar.m() + " - error = " + ironSourceError));
            if (cVar.o() == this.a.b && this.p != a.AUCTION) {
                this.c.put(cVar.k(), C1277j.a.ISAuctionPerformanceFailedToLoad);
                if (!t() && !r()) {
                    this.s.e.i("unexpected load failed for state - " + this.p + " smash - " + cVar.m() + ", error - " + ironSourceError);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        q(it.next());
                    }
                    return;
                }
                arrayList = A();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                return;
            }
            String str = "onAdLoadFailed was invoked with state =" + this.p + " auctionId: " + cVar.o() + " and the current id is " + this.a.b;
            ironLog.verbose(str);
            this.s.e.i(str);
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1275g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(d(""));
        if (!u()) {
            i iVar = this.s.e;
            iVar.f("unexpected auction success for auctionId - " + str);
            return;
        }
        this.g = "";
        this.f = i;
        this.i = bVar;
        this.h = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.s.e.b(i2, str2);
        }
        this.u.a(this.o.a, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
        if (this.u.a(this.o.a)) {
            this.s.c.c(str);
            f(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
            return;
        }
        String e = e(list, str);
        this.s.c.a(j);
        this.s.c.b(e);
        g(a.LOADING);
        z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (b() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3.y.booleanValue() != false) goto L8;
     */
    @Override // com.ironsource.environment.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        if (!this.k || this.o.h.a()) {
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("network availability changed to - " + z);
        Boolean bool = this.y;
        if (bool != null) {
            z2 = true;
            if (z) {
                if (!bool.booleanValue()) {
                }
            }
            if (!z) {
            }
        }
        z2 = false;
        if (z2) {
            l(z, false);
        }
    }

    public abstract Smash b(NetworkSettings networkSettings, Adapter adapter, int i, String str);

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(cVar.m()));
        re3 re3Var = this.t;
        Placement placement = this.j;
        AdInfo a2 = this.a.a(cVar.o());
        IronSource.AD_UNIT ad_unit = re3Var.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().e(a2);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b(placement, a2);
        } else {
            ironLog.warning("ad unit not supported - " + re3Var.a);
        }
    }

    public final void b(@NotNull ImpressionDataListener impressionDataListener) {
        this.z.remove(impressionDataListener);
    }

    public final void b(boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("track = " + z));
        this.k = z;
    }

    public abstract boolean b();

    @Override // com.ironsource.mediationsdk.InterfaceC1271c
    public final void c_() {
        if (this.o.h.b()) {
            g(a.READY_TO_LOAD);
            l(false, true);
            d();
        }
    }

    public final String d(String str) {
        String name = this.o.a.name();
        return TextUtils.isEmpty(str) ? name : wo1.u(name, " - ", str);
    }

    public final void d() {
        a aVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(""));
        synchronized (this.w) {
            boolean z = true;
            if (this.o.h.b() && this.l.a()) {
                ironLog.verbose(d("all smashes are capped"));
                f(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, "all smashes are capped", true);
                return;
            }
            a.EnumC0116a enumC0116a = this.o.h.a;
            a.EnumC0116a enumC0116a2 = a.EnumC0116a.AUTOMATIC_LOAD_WHILE_SHOW;
            if (enumC0116a != enumC0116a2 && this.p == a.SHOWING) {
                IronLog.API.error(d("load cannot be invoked while showing an ad"));
                IronSourceError ironSourceError = new IronSourceError(com.ironsource.mediationsdk.adunit.a.a.b(this.o.a), "load cannot be invoked while showing an ad");
                if (this.o.h.a()) {
                    this.t.a(ironSourceError);
                } else {
                    this.t.c(false, null);
                }
            } else if (enumC0116a != enumC0116a2 && (((aVar = this.p) != a.READY_TO_LOAD && aVar != a.READY_TO_SHOW) || C1286u.a().a(this.o.a))) {
                IronLog.API.error(d("load is already in progress"));
            } else {
                this.h = new JSONObject();
                D();
                com.ironsource.mediationsdk.adunit.c.a aVar2 = this.o;
                if (aVar2.a != IronSource.AD_UNIT.REWARDED_VIDEO || aVar2.h.a != a.EnumC0116a.MANUAL) {
                    z = false;
                }
                this.s.b.a(z);
                this.n = new com.ironsource.mediationsdk.utils.f();
                if (this.o.a()) {
                    if (!this.c.isEmpty()) {
                        this.e.a(this.c);
                        this.c.clear();
                    }
                    B();
                } else {
                    g(a.LOADING);
                }
                if (this.o.a()) {
                    return;
                }
                x();
                z();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ai
    public final void e() {
        IronLog.INTERNAL.verbose(d(""));
        d();
    }

    public final void g() {
        this.z.clear();
    }

    public final void g(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("from " + this.p + " to " + aVar));
        synchronized (this.w) {
            this.p = aVar;
        }
    }

    public final void j(com.ironsource.mediationsdk.server.b bVar, String str) {
        if (bVar == null) {
            IronLog.INTERNAL.verbose(d("no auctionResponseItem or listener"));
            return;
        }
        ImpressionData a2 = bVar.a(str);
        if (a2 != null) {
            for (ImpressionDataListener impressionDataListener : this.z) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info(d("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a2));
                impressionDataListener.onImpressionSuccess(a2);
            }
        }
    }

    public final void l(boolean z, boolean z2) {
        synchronized (this.w) {
            Boolean bool = this.y;
            if (bool == null || bool.booleanValue() != z) {
                this.y = Boolean.valueOf(z);
                long j = 0;
                if (this.x != 0) {
                    j = new Date().getTime() - this.x;
                }
                this.x = new Date().getTime();
                this.s.b.a(z, j, z2);
                re3 re3Var = this.t;
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.a;
                re3Var.c(z, aVar.a(aVar.b));
            }
        }
    }

    public final boolean r() {
        boolean z;
        synchronized (this.w) {
            z = this.p == a.READY_TO_SHOW;
        }
        return z;
    }

    public final String s() {
        Placement placement = this.j;
        return placement == null ? "" : placement.getPlacementName();
    }
}