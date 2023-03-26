package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k83 extends o83 {
    @NotNull
    public static final a o = new a(null);
    @NotNull
    private static final String p = "FacebookIntersitialMediator";
    public InterstitialAd q;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return k83.p;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterstitialAdListener {
        public b() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(@Nullable Ad ad) {
            k83.this.u();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(@Nullable Ad ad) {
            k83 k83Var = k83.this;
            k83Var.b(k83Var.j());
        }

        @Override // com.facebook.ads.AdListener
        public void onError(@Nullable Ad ad, @Nullable AdError adError) {
            xz2.d(k83.o.a(), c25.C("Failed to load fb ad ", adError == null ? null : adError.getErrorMessage()));
            k83.this.g(c25.C("Facebook interstitial ad load failed reason- ", adError != null ? adError.getErrorMessage() : null));
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(@Nullable Ad ad) {
            k83.this.y(t23.b.INTERSTITIAL);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(@Nullable Ad ad) {
            k83.this.w(t23.b.INTERSTITIAL);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(@Nullable Ad ad) {
            k83.this.t();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    public final void A(@NotNull InterstitialAd interstitialAd) {
        c25.p(interstitialAd, "<set-?>");
        this.q = interstitialAd;
    }

    @NotNull
    public final InterstitialAd B() {
        InterstitialAd interstitialAd = this.q;
        if (interstitialAd != null) {
            return interstitialAd;
        }
        c25.S("interstitialAd");
        throw null;
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        return new n13<>(B(), new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
    }

    @Override // com.p7700g.p99005.f83
    public void d() {
        super.d();
        B().destroy();
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        AppConfig r;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Context context = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null) {
            context = r.e();
        }
        A(new InterstitialAd(context, j().j()));
        B().loadAd(B().buildLoadAdConfig().withAdListener(new b()).build());
    }

    public void z(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (this.q == null) {
            return;
        }
        B().show();
    }
}