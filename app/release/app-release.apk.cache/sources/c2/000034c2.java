package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ag extends AbstractC1270b implements RewardedVideoSmashListener {
    public long A;
    public String B;
    private int C;
    private final String D;
    public int w;
    public JSONObject x;
    public com.ironsource.mediationsdk.sdk.l y;
    public AtomicBoolean z;

    /* loaded from: classes3.dex */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            synchronized (ag.this) {
                cancel();
                if (ag.this.y != null) {
                    String str = "Timeout for " + ag.this.e;
                    ag.this.s.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                    ag.this.a(AbstractC1270b.a.NOT_AVAILABLE);
                    long time = new Date().getTime() - ag.this.A;
                    if (ag.this.z.compareAndSet(true, false)) {
                        ag.this.s(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                        ag.this.s(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(time)}});
                    } else {
                        ag.this.s(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(time)}});
                    }
                    ag.this.y.a(false, ag.this);
                }
            }
        }
    }

    public ag(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        this.D = IronSourceConstants.REQUEST_URL;
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.x = rewardedVideoSettings;
        this.o = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.p = this.x.optInt("maxAdsPerSession", 99);
        this.m = this.x.optInt("maxAdsPerDay", 99);
        this.B = this.x.optString(IronSourceConstants.REQUEST_URL);
        this.z = new AtomicBoolean(false);
        this.C = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                this.s.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i, providerAdditionalData));
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void i() {
        this.j = 0;
        a(o() ? AbstractC1270b.a.AVAILABLE : AbstractC1270b.a.NOT_AVAILABLE);
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void k() {
        try {
            g();
            Timer timer = new Timer();
            this.k = timer;
            timer.schedule(new a(), this.C * 1000);
        } catch (Exception e) {
            b("startInitTimer", e.getLocalizedMessage());
        }
    }

    public final void n() {
        this.r = null;
        if (this.b != null) {
            AbstractC1270b.a aVar = this.a;
            if (aVar != AbstractC1270b.a.CAPPED_PER_DAY && aVar != AbstractC1270b.a.CAPPED_PER_SESSION) {
                this.z.set(true);
                this.A = new Date().getTime();
            }
            this.s.log(IronSourceLogger.IronSourceTag.INTERNAL, wo1.C(new StringBuilder(), this.e, ":fetchRewardedVideoForAutomaticLoad()"), 1);
            this.b.fetchRewardedVideoForAutomaticLoad(this.x, this);
        }
    }

    public final boolean o() {
        if (this.b != null) {
            this.s.log(IronSourceLogger.IronSourceTag.INTERNAL, wo1.C(new StringBuilder(), this.e, ":isRewardedVideoAvailable()"), 1);
            return this.b.isRewardedVideoAvailable(this.x);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.b(this);
        }
        n();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        com.ironsource.mediationsdk.sdk.l lVar = this.y;
        if (lVar != null) {
            lVar.g(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean z) {
        g();
        if (this.z.compareAndSet(true, false)) {
            s(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.A)}});
        } else {
            s(z ? IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE : IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, null);
        }
        if (!e()) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.info(this.e + ": is capped or exhausted");
        } else if ((!z || this.a == AbstractC1270b.a.AVAILABLE) && (z || this.a == AbstractC1270b.a.NOT_AVAILABLE)) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.info(this.e + ": state remains " + z + " in smash, mediation remains unchanged");
        } else {
            a(z ? AbstractC1270b.a.AVAILABLE : AbstractC1270b.a.NOT_AVAILABLE);
            if (z) {
                this.q = Long.valueOf(System.currentTimeMillis());
            }
            com.ironsource.mediationsdk.sdk.l lVar = this.y;
            if (lVar != null) {
                lVar.a(z, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long T = wo1.T() - this.A;
        if (ironSourceError.getErrorCode() == 1058) {
            s(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(T)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.r = Long.valueOf(System.currentTimeMillis());
        }
        s(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(T)}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void p() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final String q() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }
}