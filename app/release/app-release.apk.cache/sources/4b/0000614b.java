package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v73 extends y73 {
    private RewardedInterstitialAd t;

    /* loaded from: classes3.dex */
    public static final class a extends RewardedInterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@NotNull RewardedInterstitialAd rewardedInterstitialAd) {
            c25.p(rewardedInterstitialAd, "ad");
            xz2.c(cz2.c(this), "Ad Loaded");
            v73.this.t = rewardedInterstitialAd;
            v73 v73Var = v73.this;
            v73Var.b(v73Var.j());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
            c25.p(loadAdError, "error");
            xz2.c(cz2.c(this), c25.C("Ad Load Error ", loadAdError));
            v73.this.g(c25.C("Admob rewarded interstitial ad load failed reason- ", loadAdError));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            v73.this.y(t23.b.REWARDED_INTERSTITIAL);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@Nullable AdError adError) {
            v73.this.x(c25.C("Admob rewarded interstitial ad show failed reason- ", adError));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            v73.this.u();
            v73.this.t();
            v73.this.w(t23.b.REWARDED_INTERSTITIAL);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements OnUserEarnedRewardListener {
        public c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NotNull RewardItem rewardItem) {
            c25.p(rewardItem, "p0");
            xz2.c(cz2.c(this), c25.C("User earned reward ", rewardItem));
            v73.this.z();
        }
    }

    public /* synthetic */ v73(f83.a aVar, h73 h73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? h73.a.a() : h73Var);
    }

    public void B(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        RewardedInterstitialAd rewardedInterstitialAd = this.t;
        if (rewardedInterstitialAd == null) {
            x("Ad is not loaded");
        } else if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.setFullScreenContentCallback(new b());
            RewardedInterstitialAd rewardedInterstitialAd2 = this.t;
            if (rewardedInterstitialAd2 != null) {
                rewardedInterstitialAd2.show(activity, new c());
            } else {
                c25.S("rewardedInterstitialAd");
                throw null;
            }
        } else {
            c25.S("rewardedInterstitialAd");
            throw null;
        }
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        RewardedInterstitialAd rewardedInterstitialAd = this.t;
        if (rewardedInterstitialAd != null) {
            return new n13<>(rewardedInterstitialAd, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
        }
        c25.S("rewardedInterstitialAd");
        throw null;
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, A()).build();
        a aVar = new a();
        Context i = i();
        String j = j().j();
        if (j == null) {
            j = "";
        }
        RewardedInterstitialAd.load(i, j, build, aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar, h73Var);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
    }
}