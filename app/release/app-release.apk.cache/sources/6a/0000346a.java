package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* loaded from: classes3.dex */
public final class ad {
    private static final ad a = new ad();
    public ISDemandOnlyRewardedVideoListener b = null;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b.onRewardedVideoAdLoadSuccess(this.s);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdLoadSuccess() instanceId=" + this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ IronSourceError t;

        public b(String str, IronSourceError ironSourceError) {
            this.s = str;
            this.t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b.onRewardedVideoAdLoadFailed(this.s, this.t);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdLoadFailed() instanceId=" + this.s + "error=" + this.t.getErrorMessage());
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
            ad.this.b.onRewardedVideoAdOpened(this.s);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdOpened() instanceId=" + this.s);
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
            ad.this.b.onRewardedVideoAdClosed(this.s);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdClosed() instanceId=" + this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ IronSourceError t;

        public e(String str, IronSourceError ironSourceError) {
            this.s = str;
            this.t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b.onRewardedVideoAdShowFailed(this.s, this.t);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdShowFailed() instanceId=" + this.s + "error=" + this.t.getErrorMessage());
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        private /* synthetic */ String s;

        public f(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b.onRewardedVideoAdClicked(this.s);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdClicked() instanceId=" + this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ String s;

        public g(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.b.onRewardedVideoAdRewarded(this.s);
            ad adVar = ad.this;
            ad.c(adVar, "onRewardedVideoAdRewarded() instanceId=" + this.s);
        }
    }

    private ad() {
    }

    public static ad a() {
        return a;
    }

    public static /* synthetic */ void c(ad adVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new b(str, ironSourceError));
        }
    }

    public final void b(String str, IronSourceError ironSourceError) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new e(str, ironSourceError));
        }
    }
}