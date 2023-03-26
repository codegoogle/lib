package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.u  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1286u {
    private static final C1286u a = new C1286u();
    private Map<String, Long> b = new HashMap();
    private Map<String, Boolean> c = new HashMap();
    private int d;
    private int e;

    /* renamed from: com.ironsource.mediationsdk.u$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ IronSource.AD_UNIT s;
        private /* synthetic */ IronSourceError t;
        private /* synthetic */ String u;

        public a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, String str) {
            this.s = ad_unit;
            this.t = ironSourceError;
            this.u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            C1286u.this.d(this.s, this.t);
            C1286u.this.c.put(this.u, Boolean.FALSE);
        }
    }

    private C1286u() {
    }

    public static synchronized C1286u a() {
        C1286u c1286u;
        synchronized (C1286u.class) {
            c1286u = a;
        }
        return c1286u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.b.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ae.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.d = i;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.e = i;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        int i;
        if (a(ad_unit)) {
            return;
        }
        String ad_unit2 = ad_unit.toString();
        if (!this.b.containsKey(ad_unit2)) {
            d(ad_unit, ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            i = this.d;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            i = this.e;
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
            i = 0;
        }
        long j = i * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.b.get(ad_unit2).longValue();
        if (currentTimeMillis > j) {
            d(ad_unit, ironSourceError);
            return;
        }
        this.c.put(ad_unit2, Boolean.TRUE);
        long j2 = j - currentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j2);
        com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.a;
        com.ironsource.environment.e.c.a(new a(ad_unit, ironSourceError, ad_unit2), j2);
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (this.c.containsKey(ad_unit.toString())) {
            return this.c.get(ad_unit.toString()).booleanValue();
        }
        return false;
    }
}