package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* loaded from: classes3.dex */
public final class F extends com.ironsource.mediationsdk.sdk.b {
    private static final F d = new F();
    private InterstitialListener e = null;
    private LevelPlayInterstitialListener f;

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdOpened();
                F.d(F.this, "onInterstitialAdOpened()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ AdInfo s;

        public c(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdOpened(F.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + F.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdClosed();
                F.d(F.this, "onInterstitialAdClosed()");
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
            if (F.this.f != null) {
                F.this.f.onAdClosed(F.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + F.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdShowSucceeded();
                F.d(F.this, "onInterstitialAdShowSucceeded()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdReady();
                F.d(F.this, "onInterstitialAdReady()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        private /* synthetic */ AdInfo s;

        public h(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdShowSucceeded(F.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + F.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        private /* synthetic */ IronSourceError s;

        public i(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdShowFailed(this.s);
                F f = F.this;
                F.d(f, "onInterstitialAdShowFailed() error=" + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ IronSourceError s;
        private /* synthetic */ AdInfo t;

        public j(IronSourceError ironSourceError, AdInfo adInfo) {
            this.s = ironSourceError;
            this.t = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdShowFailed(this.s, F.this.f(this.t));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + F.this.f(this.t) + ", error = " + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.e != null) {
                F.this.e.onInterstitialAdClicked();
                F.d(F.this, "onInterstitialAdClicked()");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ AdInfo s;

        public l(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdClicked(F.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + F.this.f(this.s));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ AdInfo s;

        public m(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdReady(F.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + F.this.f(this.s));
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
            if (F.this.e != null) {
                F.this.e.onInterstitialAdLoadFailed(this.s);
                F f = F.this;
                F.d(f, "onInterstitialAdLoadFailed() error=" + this.s.getErrorMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private /* synthetic */ IronSourceError s;

        public o(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (F.this.f != null) {
                F.this.f.onAdLoadFailed(this.s);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.s.getErrorMessage());
            }
        }
    }

    private F() {
    }

    public static synchronized F a() {
        F f2;
        synchronized (F.class) {
            f2 = d;
        }
        return f2;
    }

    public static /* synthetic */ void d(F f2, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new g());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new m(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new n(ironSourceError));
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new o(ironSourceError));
        }
    }

    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new i(ironSourceError));
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new j(ironSourceError, adInfo));
        }
    }

    public final synchronized void a(InterstitialListener interstitialListener) {
        this.e = interstitialListener;
    }

    public final synchronized void a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f = levelPlayInterstitialListener;
    }

    public final void b(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new b());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new c(adInfo));
        }
    }

    public final void c(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new d());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new e(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new f());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new h(adInfo));
        }
    }

    public final void e(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new k());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new l(adInfo));
        }
    }
}