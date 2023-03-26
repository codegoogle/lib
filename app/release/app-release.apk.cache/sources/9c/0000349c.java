package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1276h;
import com.ironsource.mediationsdk.C1277j;
import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.c.e;
import com.ironsource.mediationsdk.adunit.d.a.a;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.server.b;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import com.ironsource.mediationsdk.utils.o;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.re3;
import com.p7700g.p99005.wo1;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d<Smash extends com.ironsource.mediationsdk.adunit.d.a.a<?>, Adapter extends BaseAdInteractionAdapter<?, ? extends AdapterAdInteractionListener>> extends e<Smash, Adapter> implements com.ironsource.mediationsdk.adunit.c.a.a {
    public d(a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    private void F(IronSourceError ironSourceError, String str) {
        this.s.d.a(s(), ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), str);
        this.q.b();
        re3 re3Var = this.t;
        com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.a;
        re3Var.b(ironSourceError, aVar.a(aVar.b));
        if (this.o.h.b()) {
            l(false, false);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m()));
        re3 re3Var = this.t;
        AdInfo a = this.a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = re3Var.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().d(a);
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            ironLog.warning("ad unit not supported - " + re3Var.a);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void a(IronSourceError ironSourceError, com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        b bVar;
        if (this.o.a() && (bVar = this.b.get(aVar.k())) != null) {
            com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.a;
            aVar2.a(aVar2.b, bVar.a(s()));
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m() + " - error = " + ironSourceError));
        this.c.put(aVar.k(), C1277j.a.ISAuctionPerformanceFailedToShow);
        g(e.a.READY_TO_LOAD);
        F(ironSourceError, "");
    }

    public final void a(Placement placement) {
        com.ironsource.mediationsdk.adunit.d.a.a aVar;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("state = " + this.p));
        synchronized (this.w) {
            this.j = placement;
            this.s.d.a(s());
            e.a aVar2 = this.p;
            int i = 510;
            aVar = null;
            if (aVar2 == e.a.SHOWING) {
                IronSource.AD_UNIT ad_unit = this.o.a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                }
                ironSourceError = new IronSourceError(i, "can't show ad while an ad is already showing");
            } else if (aVar2 != e.a.READY_TO_SHOW) {
                ironSourceError = new IronSourceError(509, "show called while no ads are available");
            } else if (placement == null) {
                IronSource.AD_UNIT ad_unit2 = this.o.a;
                if (ad_unit2 == IronSource.AD_UNIT.INTERSTITIAL) {
                    i = 1020;
                } else if (ad_unit2 == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i = 1021;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit2);
                }
                ironSourceError = new IronSourceError(i, "empty default placement");
            } else if (k.a(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName(), this.o.a)) {
                ironSourceError = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, "placement " + placement.getPlacementName() + " is capped");
            } else {
                ironSourceError = null;
            }
            if (ironSourceError != null) {
                IronLog.API.error(d(ironSourceError.getErrorMessage()));
                F(ironSourceError, "");
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = this.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.ironsource.mediationsdk.adunit.d.a.a aVar3 = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                    if (aVar3.a()) {
                        g(e.a.SHOWING);
                        aVar3.a(true);
                        aVar = aVar3;
                        break;
                    }
                    if (aVar3.h() != null) {
                        stringBuffer.append(aVar3.k() + ":" + aVar3.h() + ",");
                    }
                    aVar3.a(false);
                    IronLog.INTERNAL.verbose(d(aVar3.m() + " - not ready to show"));
                }
                if (aVar == null) {
                    F(ErrorBuilder.buildNoAdsToShowError(this.o.a.toString()), stringBuffer.toString());
                }
            }
        }
        if (aVar != null) {
            Placement placement2 = this.j;
            if (this.o.h.b()) {
                this.r.a();
            }
            aVar.a(placement2);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void b(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m()));
        this.a.a(aVar);
        this.l.a(aVar);
        if (this.l.b(aVar)) {
            ironLog.verbose(d(aVar.k() + " was session capped"));
            aVar.g();
            IronSourceUtils.sendAutomationLog(aVar.k() + " was session capped");
        }
        k.b(ContextProvider.getInstance().getApplicationContext(), s(), this.o.a);
        if (k.a(ContextProvider.getInstance().getApplicationContext(), s(), this.o.a)) {
            ironLog.verbose(d("placement " + s() + " is capped"));
            this.s.d.h(s());
        }
        o.a().a(this.o.a);
        if (this.o.a()) {
            b bVar = this.b.get(aVar.k());
            if (bVar != null) {
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.a;
                aVar2.a(aVar2.b, bVar.a(s()));
                C1276h.a(bVar, aVar.l(), this.i, s());
                this.c.put(aVar.k(), C1277j.a.ISAuctionPerformanceShowedSuccessfully);
                j(bVar, s());
            } else {
                String k = aVar.k();
                String s = wo1.s("showing instance missing from waterfall - ", k);
                ironLog.verbose(d(s));
                this.s.e.a(1011, s, k);
            }
        }
        re3 re3Var = this.t;
        AdInfo a = this.a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = re3Var.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().b(a);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(a);
        } else {
            ironLog.warning("ad unit not supported - " + re3Var.a);
        }
        if (this.o.h.b()) {
            l(false, false);
        }
        c cVar = this.q;
        com.ironsource.mediationsdk.adunit.c.b.a aVar3 = cVar.a;
        if (aVar3.a == a.EnumC0116a.AUTOMATIC_LOAD_WHILE_SHOW) {
            cVar.b(aVar3.b);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final boolean b() {
        if (r()) {
            if (!this.k || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
                Iterator it = this.a.a().iterator();
                while (it.hasNext()) {
                    if (((com.ironsource.mediationsdk.adunit.d.a.a) it.next()).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final String c() {
        StringBuilder sb = new StringBuilder();
        if (this.p == e.a.READY_TO_SHOW) {
            Iterator it = this.a.a().iterator();
            while (it.hasNext()) {
                com.ironsource.mediationsdk.adunit.d.a.a aVar = (com.ironsource.mediationsdk.adunit.d.a.a) it.next();
                if (aVar.e()) {
                    sb.append(aVar.k() + AppCenter.PAIR_DELIMITER);
                }
            }
        }
        return sb.toString();
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void c(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m()));
        if (this.p == e.a.SHOWING) {
            g(e.a.READY_TO_LOAD);
        }
        c cVar = this.q;
        com.ironsource.mediationsdk.adunit.c.b.a aVar2 = cVar.a;
        if (aVar2.a == a.EnumC0116a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            cVar.b(aVar2.b);
        }
        re3 re3Var = this.t;
        AdInfo a = this.a.a(aVar.o());
        IronSource.AD_UNIT ad_unit = re3Var.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().c(a);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b(a);
        } else {
            ironLog.warning("ad unit not supported - " + re3Var.a);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void d(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m()));
        re3 re3Var = this.t;
        if (re3Var.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().b();
            return;
        }
        ironLog.warning("ad unit not supported - " + re3Var.a);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.a
    public final void e(com.ironsource.mediationsdk.adunit.d.a.a<?> aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d(aVar.m()));
        re3 re3Var = this.t;
        if (re3Var.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().c();
            return;
        }
        ironLog.warning("ad unit not supported - " + re3Var.a);
    }
}