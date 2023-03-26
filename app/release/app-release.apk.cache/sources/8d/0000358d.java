package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.p7700g.p99005.wo1;
import java.util.List;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z extends A implements RewardedVideoSmashListener {
    private com.ironsource.mediationsdk.sdk.d n;
    private long o;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            z zVar = z.this;
            zVar.p("load timed out state=" + z.this.i());
            if (z.this.e(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
                z.this.n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, "load timed out"), z.this, wo1.T() - z.this.o);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z(String str, String str2, NetworkSettings networkSettings, com.ironsource.mediationsdk.sdk.d dVar, long j, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, r1, r2), abstractAdapter);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        com.ironsource.mediationsdk.model.a aVar = new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), ad_unit);
        this.c = aVar;
        JSONObject jSONObject = aVar.b;
        this.d = jSONObject;
        this.a = abstractAdapter;
        this.n = dVar;
        this.g = j;
        abstractAdapter.initRewardedVideoForDemandOnly(str, str2, jSONObject, this);
    }

    private void o(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "DemandOnlyRewardedVideoSmash " + this.c.a.getProviderName() + " : " + str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "DemandOnlyRewardedVideoSmash " + this.c.a.getProviderName() + " : " + str, 0);
    }

    public final void a() {
        p("showRewardedVideo state=" + i());
        if (e(A.a.LOADED, A.a.SHOW_IN_PROGRESS)) {
            this.a.showRewardedVideo(this.d, this);
            return;
        }
        this.n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_CALL_LOAD_BEFORE_SHOW, "load must be called before show"), this);
    }

    public final void a(String str, String str2, JSONObject jSONObject, List<String> list) {
        p("loadRewardedVideo state=" + i());
        A.a aVar = A.a.NOT_LOADED;
        A.a aVar2 = A.a.LOADED;
        A.a aVar3 = A.a.LOAD_IN_PROGRESS;
        A.a a2 = a(new A.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            if (a2 == aVar3) {
                this.n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_ALREADY_IN_PROGRESS, "load already in progress"), this, 0L);
                return;
            } else {
                this.n.a(new IronSourceError(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, "cannot load because show is in progress"), this, 0L);
                return;
            }
        }
        this.o = wo1.T();
        p("start timer");
        d(new a());
        if (!k()) {
            this.a.loadRewardedVideoForDemandOnly(this.d, this);
            return;
        }
        this.h = str2;
        this.i = jSONObject;
        this.j = list;
        this.a.loadRewardedVideoForDemandOnlyForBidding(this.d, this, str);
    }

    public final boolean b() {
        return this.a.isRewardedVideoAvailable(this.d);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        o("onRewardedVideoAdClicked");
        this.n.c(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        b(A.a.NOT_LOADED);
        o("onRewardedVideoAdClosed");
        this.n.b(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        o("onRewardedVideoAdOpened");
        this.n.a(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        o("onRewardedVideoAdRewarded");
        this.n.e(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        b(A.a.NOT_LOADED);
        o("onRewardedVideoAdClosed error=" + ironSourceError);
        this.n.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        o("onRewardedVideoAdVisible");
        this.n.d(this);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        o("onRewardedVideoLoadFailed error=" + ironSourceError.getErrorMessage() + " state=" + i());
        j();
        if (e(A.a.LOAD_IN_PROGRESS, A.a.NOT_LOADED)) {
            this.n.a(ironSourceError, this, wo1.T() - this.o);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
        o("onRewardedVideoLoadSuccess state=" + i());
        j();
        if (e(A.a.LOAD_IN_PROGRESS, A.a.LOADED)) {
            this.n.a(this, wo1.T() - this.o);
        }
    }
}