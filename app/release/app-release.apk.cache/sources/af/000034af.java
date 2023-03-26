package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;

/* loaded from: classes3.dex */
public final class ae extends com.ironsource.mediationsdk.sdk.b {
    private static final ae d = new ae();
    public RewardedVideoListener a = null;
    public LevelPlayRewardedVideoBaseListener b;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ Placement s;
        private /* synthetic */ AdInfo t;

        public a(Placement placement, AdInfo adInfo) {
            this.s = placement;
            this.t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ae.this.b.onAdClicked(this.s, ae.this.f(this.t));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.s + ", adInfo = " + ae.this.f(this.t));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ IronSourceError s;

        public b(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ((RewardedVideoManualListener) ae.this.a).onRewardedVideoAdLoadFailed(this.s);
                ae aeVar = ae.this;
                ae.c(aeVar, "onRewardedVideoAdLoadFailed() error=" + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ IronSourceError s;

        public c(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ((LevelPlayRewardedVideoManualListener) ae.this.b).onAdLoadFailed(this.s);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdOpened();
                ae.c(ae.this, "onRewardedVideoAdOpened()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ AdInfo s;

        public e(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ae.this.b.onAdOpened(ae.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + ae.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdClosed();
                ae.c(ae.this, "onRewardedVideoAdClosed()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ AdInfo s;

        public g(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ae.this.b.onAdClosed(ae.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + ae.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        private /* synthetic */ boolean s;

        public h(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAvailabilityChanged(this.s);
                ae aeVar = ae.this;
                ae.c(aeVar, "onRewardedVideoAvailabilityChanged() available=" + this.s);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        private /* synthetic */ boolean s;
        private /* synthetic */ AdInfo t;

        public i(boolean z, AdInfo adInfo) {
            this.s = z;
            this.t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                if (!this.s) {
                    ((LevelPlayRewardedVideoListener) ae.this.b).onAdUnavailable();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((LevelPlayRewardedVideoListener) ae.this.b).onAdAvailable(ae.this.f(this.t));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdAvailable() adInfo = " + ae.this.f(this.t));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdStarted();
                ae.c(ae.this, "onRewardedVideoAdStarted()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdEnded();
                ae.c(ae.this, "onRewardedVideoAdEnded()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ Placement s;

        public l(Placement placement) {
            this.s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdRewarded(this.s);
                ae aeVar = ae.this;
                ae.c(aeVar, "onRewardedVideoAdRewarded(" + this.s + ")");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ Placement s;
        private /* synthetic */ AdInfo t;

        public m(Placement placement, AdInfo adInfo) {
            this.s = placement;
            this.t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ae.this.b.onAdRewarded(this.s, ae.this.f(this.t));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.s + ", adInfo = " + ae.this.f(this.t));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Runnable {
        private /* synthetic */ IronSourceError s;

        public n(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdShowFailed(this.s);
                ae aeVar = ae.this;
                ae.c(aeVar, "onRewardedVideoAdShowFailed() error=" + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private /* synthetic */ IronSourceError s;
        private /* synthetic */ AdInfo t;

        public o(IronSourceError ironSourceError, AdInfo adInfo) {
            this.s = ironSourceError;
            this.t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.b != null) {
                ae.this.b.onAdShowFailed(this.s, ae.this.f(this.t));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + ae.this.f(this.t) + ", error = " + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {
        private /* synthetic */ Placement s;

        public p(Placement placement) {
            this.s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.a != null) {
                ae.this.a.onRewardedVideoAdClicked(this.s);
                ae aeVar = ae.this;
                ae.c(aeVar, "onRewardedVideoAdClicked(" + this.s + ")");
            }
        }
    }

    private ae() {
    }

    public static ae a() {
        return d;
    }

    public static /* synthetic */ void c(ae aeVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new d());
        }
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new e(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError) {
        RewardedVideoListener rewardedVideoListener = this.a;
        if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
            com.ironsource.environment.e.c.a.b(new b(ironSourceError));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        com.ironsource.environment.e.c.a.b(new c(ironSourceError));
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new n(ironSourceError));
        }
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new o(ironSourceError, adInfo));
        }
    }

    public final void a(Placement placement, AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new l(placement));
        }
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new m(placement, adInfo));
        }
    }

    public final void a(boolean z, AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new h(z));
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        com.ironsource.environment.e.c.a.b(new i(z, adInfo));
    }

    public final void b() {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new j());
        }
    }

    public final void b(AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new f());
        }
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new g(adInfo));
        }
    }

    public final void b(Placement placement, AdInfo adInfo) {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new p(placement));
        }
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new a(placement, adInfo));
        }
    }

    public final void c() {
        if (this.a != null) {
            com.ironsource.environment.e.c.a.b(new k());
        }
    }
}