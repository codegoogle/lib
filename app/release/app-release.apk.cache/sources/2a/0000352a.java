package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p7700g.p99005.wo1;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1283q implements BannerSmashListener {
    public AbstractAdapter a;
    public NetworkSettings b;
    private Timer c;
    private long d;
    private a e = a.NO_INIT;
    public int f;
    public com.ironsource.mediationsdk.sdk.a g;
    public boolean h;
    public IronSourceBannerLayout i;

    /* renamed from: com.ironsource.mediationsdk.q$a */
    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* renamed from: com.ironsource.mediationsdk.q$h */
    /* loaded from: classes3.dex */
    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            com.ironsource.mediationsdk.sdk.a aVar;
            IronSourceError ironSourceError;
            cancel();
            if (C1283q.this.e == a.INIT_IN_PROGRESS) {
                C1283q.this.b(a.NO_INIT);
                C1283q.this.e("init timed out");
                aVar = C1283q.this.g;
                ironSourceError = new IronSourceError(607, "Timed out");
            } else if (C1283q.this.e != a.LOAD_IN_PROGRESS) {
                if (C1283q.this.e == a.LOADED) {
                    C1283q.this.b(a.LOAD_FAILED);
                    C1283q.this.e("reload timed out");
                    C1283q.this.g.b(new IronSourceError(609, "Timed out"), C1283q.this, false);
                    return;
                }
                return;
            } else {
                C1283q.this.b(a.LOAD_FAILED);
                C1283q.this.e("load timed out");
                aVar = C1283q.this.g;
                ironSourceError = new IronSourceError(608, "Timed out");
            }
            aVar.a(ironSourceError, C1283q.this, false);
        }
    }

    public C1283q(com.ironsource.mediationsdk.sdk.a aVar, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, long j, int i) {
        this.f = i;
        this.g = aVar;
        this.a = abstractAdapter;
        this.b = networkSettings;
        this.d = j;
        abstractAdapter.addBannerListener(this);
    }

    private void f(String str, String str2) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder L = wo1.L(str, " Banner exception: ");
        L.append(a());
        L.append(" | ");
        L.append(str2);
        logger.log(ironSourceTag, L.toString(), 3);
    }

    private void i() {
        if (this.a == null) {
            return;
        }
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
            e(":setCustomParams():" + e.toString());
        }
    }

    private void j() {
        try {
            Timer timer = this.c;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            f("stopLoadTimer", e.getLocalizedMessage());
        } finally {
            this.c = null;
        }
    }

    public final String a() {
        return this.b.isMultipleInstances() ? this.b.getProviderTypeForReflection() : this.b.getProviderName();
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, String str, String str2) {
        e("loadBanner");
        this.h = false;
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            e("loadBanner - bannerLayout is null or destroyed");
            this.g.a(new IronSourceError(610, ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"), this, false);
        } else if (this.a == null) {
            e("loadBanner - mAdapter is null");
            this.g.a(new IronSourceError(611, "adapter==null"), this, false);
        } else {
            this.i = ironSourceBannerLayout;
            h();
            if (this.e != a.NO_INIT) {
                b(a.LOAD_IN_PROGRESS);
                this.a.loadBanner(ironSourceBannerLayout, this.b.getBannerSettings(), this);
                return;
            }
            b(a.INIT_IN_PROGRESS);
            i();
            this.a.initBanners(str, str2, this.b.getBannerSettings(), this);
        }
    }

    public void b(a aVar) {
        this.e = aVar;
        e("state=" + aVar.name());
    }

    public void e(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
        logger.log(ironSourceTag, "BannerSmash " + a() + " " + str, 1);
    }

    public void h() {
        try {
            j();
            Timer timer = new Timer();
            this.c = timer;
            timer.schedule(new h(), this.d);
        } catch (Exception e) {
            f("startLoadTimer", e.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        com.ironsource.mediationsdk.sdk.a aVar = this.g;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        com.ironsource.mediationsdk.sdk.a aVar = this.g;
        if (aVar != null) {
            aVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        e("onBannerAdLoadFailed()");
        j();
        boolean z = ironSourceError.getErrorCode() == 606;
        a aVar = this.e;
        if (aVar == a.LOAD_IN_PROGRESS) {
            b(a.LOAD_FAILED);
            this.g.a(ironSourceError, this, z);
        } else if (aVar == a.LOADED) {
            this.g.b(ironSourceError, this, z);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        e("onBannerAdLoaded()");
        j();
        a aVar = this.e;
        if (aVar == a.LOAD_IN_PROGRESS) {
            b(a.LOADED);
            this.g.a(this, view, layoutParams);
        } else if (aVar == a.LOADED) {
            this.g.a(this, view, layoutParams, this.a.shouldBindBannerViewOnReload());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        com.ironsource.mediationsdk.sdk.a aVar = this.g;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        com.ironsource.mediationsdk.sdk.a aVar = this.g;
        if (aVar != null) {
            aVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        com.ironsource.mediationsdk.sdk.a aVar = this.g;
        if (aVar != null) {
            aVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        j();
        if (this.e == a.INIT_IN_PROGRESS) {
            this.g.a(new IronSourceError(612, "Banner init failed"), this, false);
            b(a.NO_INIT);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        j();
        if (this.e == a.INIT_IN_PROGRESS) {
            IronSourceBannerLayout ironSourceBannerLayout = this.i;
            if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
                this.g.a(new IronSourceError(605, this.i == null ? "banner is null" : "banner is destroyed"), this, false);
                return;
            }
            h();
            b(a.LOAD_IN_PROGRESS);
            this.a.loadBanner(this.i, this.b.getBannerSettings(), this);
        }
    }
}