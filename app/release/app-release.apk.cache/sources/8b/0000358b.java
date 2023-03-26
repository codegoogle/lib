package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.p7700g.p99005.wo1;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.x  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1288x extends A implements InterstitialSmashListener {
    private com.ironsource.mediationsdk.sdk.c n;
    private long o;

    /* renamed from: com.ironsource.mediationsdk.x$a */
    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C1288x c1288x = C1288x.this;
            c1288x.p("load timed out state=" + C1288x.this.i());
            if (C1288x.this.e(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                C1288x.this.n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_TIMED_OUT, "load timed out"), C1288x.this, wo1.T() - C1288x.this.o);
            }
        }
    }

    public C1288x(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.c cVar, long j, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), abstractAdapter);
        this.n = cVar;
        this.g = j;
        this.a.initInterstitial(str, str2, this.d, this);
    }

    private void o(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyInterstitialSmash " + this.c.a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyInterstitialSmash " + this.c.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        p("showInterstitial state=" + i());
        if (e(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.a.showInterstitial(this.d, this);
            return;
        }
        this.n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        p("loadInterstitial state=" + i());
        A.a aVar = A.a.NOT_LOADED;
        A.a aVar2 = A.a.LOADED;
        A.a aVar3 = A.a.LOAD_IN_PROGRESS;
        A.a a2 = a(new A.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            if (a2 == aVar3) {
                this.n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.n.a(new IronSourceError(IronSourceError.ERROR_DO_IS_LOAD_ALREADY_IN_PROGRESS, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.o = wo1.T();
        p("start timer");
        d(new a());
        if (!k()) {
            this.a.loadInterstitial(this.d, this);
            return;
        }
        this.h = str2;
        this.i = jSONObject;
        this.j = list;
        this.a.loadInterstitialForBidding(this.d, this, str);
    }

    public final boolean b() {
        return this.a.isInterstitialReady(this.d);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        o("onInterstitialAdClicked");
        this.n.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        b(A.a.NOT_LOADED);
        o("onInterstitialAdClosed");
        this.n.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        o("onInterstitialAdLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (e(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.n.a(ironSourceError, this, wo1.T() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        o("onInterstitialAdOpened");
        this.n.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        o("onInterstitialAdReady state=" + i());
        j();
        if (e(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.n.a(this, wo1.T() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        b(A.a.NOT_LOADED);
        o("onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.n.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        o("onInterstitialAdVisible");
        this.n.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
    }
}