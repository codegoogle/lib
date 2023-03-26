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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w73 extends y73 {
    @Nullable
    private RewardedAd t;

    /* loaded from: classes3.dex */
    public static final class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@NotNull RewardedAd rewardedAd) {
            c25.p(rewardedAd, "ad");
            xz2.c(cz2.c(this), c25.C("Ad Loaded for ", w73.this.n().B()));
            w73.this.t = rewardedAd;
            w73 w73Var = w73.this;
            w73Var.b(w73Var.j());
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NotNull LoadAdError loadAdError) {
            c25.p(loadAdError, "loadAdError");
            xz2.d(cz2.c(this), c25.C("Failed to load Admob Rewarded Ad ", loadAdError));
            w73.this.g(c25.C("Admob app rewarded ad load failed reason -  ", loadAdError));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            w73.this.y(t23.b.REWARDED);
            w73.this.t = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@Nullable AdError adError) {
            w73.this.x(c25.C("Admob app rewarded ad show failed reason - ", adError));
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            w73.this.u();
            w73.this.t();
            w73.this.w(t23.b.REWARDED);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements OnUserEarnedRewardListener {
        public c() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NotNull RewardItem rewardItem) {
            c25.p(rewardItem, "p0");
            xz2.c(cz2.c(this), c25.C("User Reward Earned ", rewardItem));
            w73.this.z();
        }
    }

    public /* synthetic */ w73(f83.a aVar, h73 h73Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? h73.a.a() : h73Var);
    }

    public void B(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        RewardedAd rewardedAd = this.t;
        if (rewardedAd == null) {
            xz2.d(cz2.c(this), "Could not show rewarded ad since ad is not loaded");
            return;
        }
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new b());
        }
        RewardedAd rewardedAd2 = this.t;
        if (rewardedAd2 == null) {
            return;
        }
        rewardedAd2.show(activity, new c());
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        return new n13<>(this.t, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
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
        RewardedAd.load(i, j, build, aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w73(@NotNull f83.a aVar, @NotNull h73 h73Var) {
        super(aVar, h73Var);
        c25.p(aVar, "builder");
        c25.p(h73Var, "sdkHelper");
    }
}