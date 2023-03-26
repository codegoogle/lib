package com.p7700g.p99005;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.greedygame.core.models.core.NativeMediatedAsset;
import com.p7700g.p99005.f83;
import com.p7700g.p99005.t23;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n83 extends p83 {
    @Nullable
    private RewardedVideoAd o;

    /* loaded from: classes3.dex */
    public static final class a implements RewardedVideoAdListener {
        public a() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(@Nullable Ad ad) {
            n83.this.u();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(@Nullable Ad ad) {
            n83 n83Var = n83.this;
            n83Var.b(n83Var.j());
        }

        @Override // com.facebook.ads.AdListener
        public void onError(@Nullable Ad ad, @Nullable AdError adError) {
            n83.this.g(c25.C("Facebook rewarded ad load failed reason- ", adError));
        }

        @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
        public void onLoggingImpression(@Nullable Ad ad) {
            n83.this.t();
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            n83.this.y(t23.b.REWARDED);
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
            n83.this.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n83(@NotNull f83.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    public void A(@NotNull Activity activity) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        RewardedVideoAd rewardedVideoAd = this.o;
        if (rewardedVideoAd != null) {
            if (!((rewardedVideoAd == null || rewardedVideoAd.isAdLoaded()) ? false : true)) {
                RewardedVideoAd rewardedVideoAd2 = this.o;
                if (rewardedVideoAd2 != null && rewardedVideoAd2.isAdInvalidated()) {
                    x("Ad is invalidated");
                    return;
                }
                RewardedVideoAd rewardedVideoAd3 = this.o;
                if (rewardedVideoAd3 != null) {
                    rewardedVideoAd3.show();
                }
                w(t23.b.REWARDED);
                return;
            }
        }
        x("Ad is not loaded");
    }

    @Override // com.p7700g.p99005.o13
    @NotNull
    public n13<?> a() {
        return new n13<>(this.o, new NativeMediatedAsset(null, null, null, null, null, null, null, null, null, null, 1023, null), j());
    }

    @Override // com.p7700g.p99005.f83
    public void e() {
        this.o = new RewardedVideoAd(i(), j().j());
        a aVar = new a();
        RewardedVideoAd rewardedVideoAd = this.o;
        if (rewardedVideoAd == null) {
            return;
        }
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(aVar).build());
    }
}