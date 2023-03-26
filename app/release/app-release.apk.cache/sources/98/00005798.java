package com.p7700g.p99005;

import android.app.Activity;
import android.app.Application;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.app_open_ads.core.GGAppOpenAdsImpl;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q73 extends x73 {
    private long t;
    @Nullable
    private AppOpenAd u;
    private final long v;

    /* loaded from: classes3.dex */
    public static final class a extends AppOpenAd.AppOpenAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@NotNull AppOpenAd appOpenAd) {
            c25.p(appOpenAd, "ad");
            q73.this.t = new Date().getTime();
            q73.this.u = appOpenAd;
            q73 q73Var = q73.this;
            q73Var.b(q73Var.j());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
            c25.p(loadAdError, "p0");
            q73.this.g(c25.C("Admob app open ad load failed reason -  ", loadAdError));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            q73.this.u = null;
            q73.this.y(t23.b.APP_OPEN);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@Nullable AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            q73.this.x(c25.C("Admob app open ad show failed reason - ", adError));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            q73.this.u();
            q73.this.t();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            q73.this.w(t23.b.APP_OPEN);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(@NotNull f83.a aVar) {
        super(aVar, h73.a.a());
        c25.p(aVar, "builder");
        this.v = 4L;
    }

    private final boolean D(long j) {
        return wo1.T() - this.t < j * 3600000;
    }

    private final boolean E() {
        return this.u != null && D(this.v);
    }

    public void A(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (!E()) {
            xz2.d(cz2.c(this), "Ad is not available.Load ad before showing the ad");
            x("Ad is not available");
            return;
        }
        xz2.c(cz2.c(this), "Showing app open ad");
        b bVar = new b();
        AppOpenAd appOpenAd = this.u;
        if (appOpenAd != null) {
            appOpenAd.setFullScreenContentCallback(bVar);
        }
        AppOpenAd appOpenAd2 = this.u;
        if (appOpenAd2 == null) {
            return;
        }
        appOpenAd2.show(activity);
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<AppOpenAd> a() {
        return new n13<>(this.u, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        AppConfig r;
        a aVar = new a();
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, z()).build();
        int i = GGAppOpenAdsImpl.s.a().d() == c13.PORTRAIT ? 1 : 2;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Application application = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            application = r.g();
        }
        AppOpenAd.load(application, j().j(), build, i, aVar);
    }
}