package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Partner;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s73 extends x73 {
    @NotNull
    private final h73 t;
    public InterstitialAd u;

    /* loaded from: classes3.dex */
    public static final class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@NotNull InterstitialAd interstitialAd) {
            c25.p(interstitialAd, "ad");
            s73.this.B(interstitialAd);
            s73.this.D();
            s73 s73Var = s73.this;
            s73Var.b(s73Var.j());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
            c25.p(loadAdError, "error");
            s73.this.g(c25.C("Admob interstitial ad load failed reason- ", loadAdError));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            s73.this.y(t23.b.INTERSTITIAL);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@Nullable AdError adError) {
            s73.this.x(c25.C("Admob interstitial ad show failed reason- ", adError));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            s73.this.t();
            s73.this.u();
            s73.this.w(t23.b.INTERSTITIAL);
        }
    }

    public /* synthetic */ s73(f83.a aVar, h73 h73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? h73.a.a() : h73Var);
    }

    public void A(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (this.u == null) {
            return;
        }
        C().show(activity);
    }

    public final void B(@NotNull InterstitialAd interstitialAd) {
        c25.p(interstitialAd, "<set-?>");
        this.u = interstitialAd;
    }

    @NotNull
    public final InterstitialAd C() {
        InterstitialAd interstitialAd = this.u;
        if (interstitialAd != null) {
            return interstitialAd;
        }
        c25.S("interstitialAd");
        throw null;
    }

    public final void D() {
        if (this.u == null) {
            return;
        }
        C().setFullScreenContentCallback(new b());
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        return new n13<>(C(), new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        AppConfig r;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        Context e = (iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null) ? null : r.e();
        if (e == null) {
            return;
        }
        Partner w = n().w();
        String j = w != null ? w.j() : null;
        if (j == null) {
            return;
        }
        InterstitialAd.load(e, j, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, z()).build(), new a());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar, h73Var);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
        this.t = h73Var;
    }
}