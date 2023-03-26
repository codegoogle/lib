package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.p7700g.p99005.wo1;

/* loaded from: classes3.dex */
public abstract class a<Listener extends com.ironsource.mediationsdk.adunit.c.a.a> extends c<Listener> implements AdapterAdInteractionListener {
    private BaseAdInteractionAdapter<?, AdapterAdInteractionListener> o;

    /* JADX WARN: Multi-variable type inference failed */
    public a(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, ?> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
        this.o = baseAdInteractionAdapter;
    }

    public final void a(Placement placement) {
        int i;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("placementName = " + placement.getPlacementName()));
        try {
            this.f = placement;
            c(c.a.SHOWING);
            this.d.d.a(q());
            this.o.showAd(this.j, this);
        } catch (Throwable th) {
            String E = wo1.E(th, new StringBuilder("showAd - exception = "));
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error(d(E));
            c(c.a.FAILED);
            d dVar = this.d;
            if (dVar != null) {
                dVar.e.m(E);
            }
            IronSource.AD_UNIT ad_unit = this.a.a;
            if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                i = IronSourceError.ERROR_IS_SHOW_EXCEPTION;
            } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                i = IronSourceError.ERROR_RV_SHOW_EXCEPTION;
            } else {
                ironLog2.warning("ad unit not supported - " + ad_unit);
                i = 510;
            }
            onAdShowFailed(i, E);
        }
    }

    public final void a(boolean z) {
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.a(z);
        }
    }

    public final boolean a() {
        if (this.j != null) {
            try {
                return i() ? this.e == c.a.LOADED && this.o.isAdAvailable(this.j) : this.o.isAdAvailable(this.j);
            } catch (Throwable th) {
                String E = wo1.E(th, new StringBuilder("isReadyToShow - exception = "));
                IronLog.INTERNAL.error(d(E));
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.m(E);
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.c
    public final void c() {
        super.c();
        BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter = this.o;
        if (baseAdInteractionAdapter != null) {
            try {
                baseAdInteractionAdapter.releaseMemory();
            } catch (Exception e) {
                String format = String.format("releaseMemory - exception = ", e);
                IronLog.INTERNAL.verbose(d(format));
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.m(format);
                }
            }
            this.o = null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        String str;
        IronLog.INTERNAL.verbose(d(""));
        synchronized (this.n) {
            if (this.e != c.a.SHOWING) {
                d dVar = this.d;
                if (dVar != null) {
                    dVar.e.k("unexpected closed for " + m());
                }
                return;
            }
            c(c.a.NONE);
            if (this.d != null) {
                String str2 = "";
                if (this.a.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    String c = ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).c();
                    StringBuilder sb = new StringBuilder("otherInstanceAvailable = ");
                    if (c.length() > 0) {
                        str = "true|" + c;
                    } else {
                        str = "false";
                    }
                    sb.append(str);
                    str2 = sb.toString();
                }
                this.d.d.a(q(), str2);
            }
            ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.f(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).e(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.c(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).b((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("error = " + i + ", " + str));
        if (this.e != c.a.SHOWING) {
            d dVar = this.d;
            if (dVar != null) {
                dVar.e.j(String.format("unexpected show failed for %s, error - %d, %s", m(), Integer.valueOf(i), str));
                return;
            }
            return;
        }
        c(c.a.FAILED);
        d dVar2 = this.d;
        if (dVar2 != null) {
            dVar2.d.a(q(), i, str, "");
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).a(new IronSourceError(i, str), (a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.b(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).a((a<?>) this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.e(q());
        }
        ((com.ironsource.mediationsdk.adunit.c.a.a) this.b).d(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        IronLog.INTERNAL.verbose(d(""));
        d dVar = this.d;
        if (dVar != null) {
            dVar.d.g(q());
        }
    }
}