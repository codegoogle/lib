package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.p7700g.p99005.wo1;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1270b {
    public AbstractAdapter b;
    public NetworkSettings c;
    private String d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public Timer k;
    public Timer l;
    public int m;
    public int n;
    public int o;
    public int p;
    private String t = "maxAdsPerSession";
    private String u = "maxAdsPerIteration";
    private String v = "maxAdsPerDay";
    public int j = 0;
    private int i = 0;
    public a a = a.NOT_INITIATED;
    public IronSourceLoggerManager s = IronSourceLoggerManager.getLogger();
    public Long q = null;
    public Long r = null;

    /* renamed from: com.ironsource.mediationsdk.b$a */
    /* loaded from: classes3.dex */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        
        public int l;

        a(int i) {
            this.l = i;
        }
    }

    public AbstractC1270b(NetworkSettings networkSettings) {
        this.d = networkSettings.getProviderTypeForReflection();
        this.e = networkSettings.getProviderInstanceName();
        this.h = networkSettings.isMultipleInstances();
        this.c = networkSettings;
        this.f = networkSettings.getSubProviderId();
        this.g = networkSettings.getAdSourceNameForEvents();
    }

    public final synchronized void a(a aVar) {
        if (this.a == aVar) {
            return;
        }
        this.a = aVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.s;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "Smart Loading - " + this.e + " state changed to " + aVar.toString(), 0);
        AbstractAdapter abstractAdapter = this.b;
        if (abstractAdapter != null && (aVar == a.CAPPED_PER_SESSION || aVar == a.CAPPED_PER_DAY)) {
            abstractAdapter.setMediationState(aVar, q());
        }
    }

    public final void b(String str, String str2) {
        this.s.log(IronSourceLogger.IronSourceTag.INTERNAL, wo1.D(wo1.L(str, " exception: "), this.e, " | ", str2), 3);
    }

    public final boolean c() {
        return this.j >= this.o;
    }

    public final boolean d() {
        return this.i >= this.p;
    }

    public final boolean e() {
        if (!c() && !d()) {
            if (!(this.a == a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        this.j++;
        this.i++;
        if (d()) {
            a(a.CAPPED_PER_SESSION);
        } else if (c()) {
            a(a.EXHAUSTED);
        }
    }

    public final void g() {
        try {
            Timer timer = this.k;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            b("stopInitTimer", e.getLocalizedMessage());
        } finally {
            this.k = null;
        }
    }

    public final void h() {
        try {
            Timer timer = this.l;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            b("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.l = null;
        }
    }

    public abstract void i();

    public final String j() {
        return this.h ? this.d : this.e;
    }

    public abstract void k();

    public final Long l() {
        return this.q;
    }

    public final Long m() {
        return this.r;
    }

    public abstract void p();

    public abstract String q();
}