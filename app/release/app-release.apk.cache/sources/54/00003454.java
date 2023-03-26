package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.wo1;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class Y extends ac implements InterstitialSmashListener {
    public a h;
    private X i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private long n;
    private final Object o;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        INIT_SUCCESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED
    }

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Y y = Y.this;
            y.y("timed out state=" + Y.this.h.name() + " isBidder=" + Y.this.h());
            if (Y.this.h == a.INIT_IN_PROGRESS && Y.this.h()) {
                Y.this.s(a.NO_INIT);
                return;
            }
            Y.this.s(a.LOAD_FAILED);
            Y.this.i.a(ErrorBuilder.buildLoadFailedError("timed out"), Y.this, new Date().getTime() - Y.this.n);
        }
    }

    public Y(String str, String str2, NetworkSettings networkSettings, X x, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.o = new Object();
        this.h = a.NO_INIT;
        this.l = str;
        this.m = str2;
        this.i = x;
        this.j = null;
        this.k = i;
        this.a.addInterstitialListener(this);
    }

    private void A() {
        try {
            String str = L.a().v;
            if (!TextUtils.isEmpty(str)) {
                this.a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            y("setCustomParams() " + e.getMessage());
        }
    }

    private void B() {
        synchronized (this.o) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    private void C() {
        synchronized (this.o) {
            y("start timer");
            B();
            Timer timer = new Timer();
            this.j = timer;
            timer.schedule(new b(), this.k * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(a aVar) {
        y("current state=" + this.h + ", new state=" + aVar);
        this.h = aVar;
    }

    private void x(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "ProgIsSmash " + k() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 0);
    }

    private void z(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsSmash " + k() + " : " + str, 3);
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.a.getInterstitialBiddingData(this.d);
            }
            return null;
        } catch (Throwable th) {
            z(wo1.E(th, new StringBuilder("getBiddingData exception: ")));
            th.printStackTrace();
            return null;
        }
    }

    public final void a(String str) {
        try {
            this.n = new Date().getTime();
            y("loadInterstitial");
            this.c = false;
            if (h()) {
                C();
                s(a.LOAD_IN_PROGRESS);
                this.a.loadInterstitialForBidding(this.d, this, str);
            } else if (this.h != a.NO_INIT) {
                C();
                s(a.LOAD_IN_PROGRESS);
                this.a.loadInterstitial(this.d, this);
            } else {
                C();
                s(a.INIT_IN_PROGRESS);
                A();
                this.a.initInterstitial(this.l, this.m, this.d, this);
            }
        } catch (Throwable th) {
            z(wo1.E(th, new StringBuilder("loadInterstitial exception: ")));
            th.printStackTrace();
            onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
        }
    }

    public final void b() {
        y("initForBidding()");
        s(a.INIT_IN_PROGRESS);
        A();
        try {
            this.a.initInterstitialForBidding(this.l, this.m, this.d, this);
        } catch (Throwable th) {
            z(k() + " initForBidding exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialInitFailed(new IronSourceError(IronSourceError.ERROR_IS_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void c() {
        try {
            this.a.showInterstitial(this.d, this);
        } catch (Throwable th) {
            z(k() + "showInterstitial exception : " + th.getLocalizedMessage());
            th.printStackTrace();
            onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void f() {
        this.a.setMediationState(AbstractC1270b.a.CAPPED_PER_SESSION, "interstitial");
    }

    public final boolean g() {
        try {
            return this.a.isInterstitialReady(this.d);
        } catch (Throwable th) {
            z(wo1.E(th, new StringBuilder("isReadyToShow exception: ")));
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        x("onInterstitialAdClicked");
        this.i.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        x("onInterstitialAdClosed");
        this.i.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        x("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        B();
        if (this.h != a.LOAD_IN_PROGRESS) {
            return;
        }
        s(a.LOAD_FAILED);
        this.i.a(ironSourceError, this, wo1.T() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        x("onInterstitialAdOpened");
        this.i.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        x("onInterstitialAdReady state=" + this.h.name());
        B();
        if (this.h != a.LOAD_IN_PROGRESS) {
            return;
        }
        s(a.LOADED);
        this.i.a(this, wo1.T() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        x("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.i.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        x("onInterstitialAdShowSucceeded");
        this.i.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        x("onInterstitialAdVisible");
        this.i.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        x("onInterstitialInitFailed error" + ironSourceError.getErrorMessage() + " state=" + this.h.name());
        if (this.h != a.INIT_IN_PROGRESS) {
            return;
        }
        B();
        s(a.NO_INIT);
        this.i.b(ironSourceError, this);
        if (h()) {
            return;
        }
        this.i.a(ironSourceError, this, wo1.T() - this.n);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        x("onInterstitialInitSuccess state=" + this.h.name());
        if (this.h != a.INIT_IN_PROGRESS) {
            return;
        }
        B();
        if (h()) {
            s(a.INIT_SUCCESS);
        } else {
            s(a.LOAD_IN_PROGRESS);
            C();
            try {
                this.a.loadInterstitial(this.d, this);
            } catch (Throwable th) {
                z(wo1.E(th, new StringBuilder("onInterstitialInitSuccess exception: ")));
                th.printStackTrace();
                onInterstitialAdLoadFailed(new IronSourceError(IronSourceConstants.errorCode_loadException, th.getLocalizedMessage()));
            }
        }
        this.i.f(this);
    }
}