package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* loaded from: classes3.dex */
public final class E {
    private static final E a = new E();
    public ISDemandOnlyInterstitialListener b = null;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;

        public a(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            E.this.b.onInterstitialAdReady(this.s);
            E e = E.this;
            E.c(e, "onInterstitialAdReady() instanceId=" + this.s);
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
            E.this.b.onInterstitialAdLoadFailed(this.s, this.t);
            E e = E.this;
            E.c(e, "onInterstitialAdLoadFailed() instanceId=" + this.s + " error=" + this.t.getErrorMessage());
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
            E.this.b.onInterstitialAdOpened(this.s);
            E e = E.this;
            E.c(e, "onInterstitialAdOpened() instanceId=" + this.s);
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
            E.this.b.onInterstitialAdClosed(this.s);
            E e = E.this;
            E.c(e, "onInterstitialAdClosed() instanceId=" + this.s);
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
            E.this.b.onInterstitialAdShowFailed(this.s, this.t);
            E e = E.this;
            E.c(e, "onInterstitialAdShowFailed() instanceId=" + this.s + " error=" + this.t.getErrorMessage());
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
            E.this.b.onInterstitialAdClicked(this.s);
            E e = E.this;
            E.c(e, "onInterstitialAdClicked() instanceId=" + this.s);
        }
    }

    private E() {
    }

    public static E a() {
        return a;
    }

    public static /* synthetic */ void c(E e2, String str) {
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