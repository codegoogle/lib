package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* loaded from: classes3.dex */
public final class m {
    private static final m a = new m();
    public ISDemandOnlyBannerListener b = null;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ IronSourceError t;

        public a(String str, IronSourceError ironSourceError) {
            this.s = str;
            this.t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (m.this.b != null) {
                m.this.b.onBannerAdLoadFailed(this.s, this.t);
            }
            m mVar = m.this;
            String str = this.s;
            m.c(mVar, str, "onBannerAdLoadFailed() error = " + this.t.getErrorMessage());
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ String s;

        public b(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.c(m.this, this.s, "onBannerAdLoaded()");
            if (m.this.b != null) {
                m.this.b.onBannerAdLoaded(this.s);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ String s;

        public c(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.c(m.this, this.s, "onBannerAdShown()");
            if (m.this.b != null) {
                m.this.b.onBannerAdShown(this.s);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private /* synthetic */ String s;

        public d(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.c(m.this, this.s, "onBannerAdClicked()");
            if (m.this.b != null) {
                m.this.b.onBannerAdClicked(this.s);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ String s;

        public e(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.c(m.this, this.s, "onBannerAdLeftApplication()");
            if (m.this.b != null) {
                m.this.b.onBannerAdLeftApplication(this.s);
            }
        }
    }

    private m() {
    }

    public static m a() {
        return a;
    }

    public static /* synthetic */ void c(m mVar, String str, String str2) {
        IronLog ironLog = IronLog.CALLBACK;
        ironLog.info("Instance: " + str + " " + str2);
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.b != null) {
            com.ironsource.environment.e.c.a.b(new a(str, ironSourceError));
        }
    }
}