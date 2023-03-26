package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.mediationsdk.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280n extends com.ironsource.mediationsdk.sdk.b {
    private static final C1280n d = new C1280n();
    public BannerListener e = null;
    public LevelPlayBannerListener f = null;

    /* renamed from: com.ironsource.mediationsdk.n$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdScreenDismissed();
                IronLog.CALLBACK.info("onBannerAdScreenDismissed()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private /* synthetic */ AdInfo s;

        public d(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdScreenDismissed(C1280n.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + C1280n.this.f(this.s));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$e */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdLeftApplication();
                IronLog.CALLBACK.info("onBannerAdLeftApplication()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$f */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdLoaded();
                IronLog.CALLBACK.info("onBannerAdLoaded()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$g */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ AdInfo s;

        public g(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdLeftApplication(C1280n.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + C1280n.this.f(this.s));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$h */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdClicked();
                IronLog.CALLBACK.info("onBannerAdClicked()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$i */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        private /* synthetic */ AdInfo s;

        public i(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdClicked(C1280n.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C1280n.this.f(this.s));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$j */
    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ AdInfo s;

        public j(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdLoaded(C1280n.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + C1280n.this.f(this.s));
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$k */
    /* loaded from: classes3.dex */
    public class k implements Runnable {
        private /* synthetic */ IronSourceError s;

        public k(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdLoadFailed(this.s);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onBannerAdLoadFailed() error = " + this.s.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$l */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ IronSourceError s;

        public l(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdLoadFailed(this.s);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.s.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$m */
    /* loaded from: classes3.dex */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.e != null) {
                C1280n.this.e.onBannerAdScreenPresented();
                IronLog.CALLBACK.info("onBannerAdScreenPresented()");
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.n$n  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0120n implements Runnable {
        private /* synthetic */ AdInfo s;

        public RunnableC0120n(AdInfo adInfo) {
            this.s = adInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C1280n.this.f != null) {
                C1280n.this.f.onAdScreenPresented(C1280n.this.f(this.s));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + C1280n.this.f(this.s));
            }
        }
    }

    private C1280n() {
    }

    public static C1280n a() {
        return d;
    }

    public final void a(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new m());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new RunnableC0120n(adInfo));
        }
    }

    public final void a(AdInfo adInfo, boolean z) {
        if (this.e != null && !z) {
            com.ironsource.environment.e.c.a.b(new f());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new j(adInfo));
        }
    }

    public final void a(IronSourceError ironSourceError, boolean z) {
        if (this.e != null && !z) {
            com.ironsource.environment.e.c.a.b(new k(ironSourceError));
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new l(ironSourceError));
        }
    }

    public final void b(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new c());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new d(adInfo));
        }
    }

    public final void c(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new e());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new g(adInfo));
        }
    }

    public final void d(AdInfo adInfo) {
        if (this.e != null) {
            com.ironsource.environment.e.c.a.b(new h());
        }
        if (this.f != null) {
            com.ironsource.environment.e.c.a.b(new i(adInfo));
        }
    }
}