package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.p7700g.p99005.wo1;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class J extends AbstractC1270b implements InterstitialSmashListener {
    private int A;
    public JSONObject x;
    public com.ironsource.mediationsdk.sdk.h y;
    public long z;

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            cancel();
            J j = J.this;
            if (j.a != AbstractC1270b.a.INIT_PENDING || j.y == null) {
                return;
            }
            J.this.a(AbstractC1270b.a.INIT_FAILED);
            J.this.y.a(ErrorBuilder.buildInitFailedError("Timeout", "Interstitial"), J.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            cancel();
            J j = J.this;
            if (j.a != AbstractC1270b.a.LOAD_PENDING || j.y == null) {
                return;
            }
            J.this.a(AbstractC1270b.a.NOT_AVAILABLE);
            J.this.y.a(ErrorBuilder.buildLoadFailedError("Timeout"), J.this, new Date().getTime() - J.this.z);
        }
    }

    public J(NetworkSettings networkSettings, int i) {
        super(networkSettings);
        JSONObject interstitialSettings = networkSettings.getInterstitialSettings();
        this.x = interstitialSettings;
        this.o = interstitialSettings.optInt("maxAdsPerIteration", 99);
        this.p = this.x.optInt("maxAdsPerSession", 99);
        this.m = this.x.optInt("maxAdsPerDay", 99);
        this.h = networkSettings.isMultipleInstances();
        this.f = networkSettings.getSubProviderId();
        this.A = i;
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void i() {
        this.j = 0;
        a(AbstractC1270b.a.INITIATED);
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void k() {
        try {
            g();
            Timer timer = new Timer();
            this.k = timer;
            timer.schedule(new b(), this.A * 1000);
        } catch (Exception e) {
            b("startInitTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClicked() {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdClosed() {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        h();
        if (this.a != AbstractC1270b.a.LOAD_PENDING || this.y == null) {
            return;
        }
        this.y.a(ironSourceError, this, wo1.T() - this.z);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdOpened() {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdReady() {
        h();
        if (this.a != AbstractC1270b.a.LOAD_PENDING || this.y == null) {
            return;
        }
        this.y.a(this, wo1.T() - this.z);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.b(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdShowSucceeded() {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialAdVisible() {
        com.ironsource.mediationsdk.sdk.h hVar = this.y;
        if (hVar != null) {
            hVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitFailed(IronSourceError ironSourceError) {
        g();
        if (this.a == AbstractC1270b.a.INIT_PENDING) {
            a(AbstractC1270b.a.INIT_FAILED);
            com.ironsource.mediationsdk.sdk.h hVar = this.y;
            if (hVar != null) {
                hVar.a(ironSourceError, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public final void onInterstitialInitSuccess() {
        g();
        if (this.a == AbstractC1270b.a.INIT_PENDING) {
            a(AbstractC1270b.a.INITIATED);
            com.ironsource.mediationsdk.sdk.h hVar = this.y;
            if (hVar != null) {
                hVar.a(this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final void p() {
        try {
            h();
            Timer timer = new Timer();
            this.l = timer;
            timer.schedule(new c(), this.A * 1000);
        } catch (Exception e) {
            b("startLoadTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC1270b
    public final String q() {
        return "interstitial";
    }
}