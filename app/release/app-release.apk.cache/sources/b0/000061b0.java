package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

/* compiled from: Facebook_Rewarded.java */
/* loaded from: classes3.dex */
public class vf3 {
    private static final String a = "Facebook_Rewarded";
    public static RewardedVideoAd b;
    private static RewardedVideoAdListener c;
    public static Boolean d = Boolean.FALSE;
    public static wg3 e = null;

    /* compiled from: Facebook_Rewarded.java */
    /* loaded from: classes3.dex */
    public class a implements RewardedVideoAdListener {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            String str = "Facebook_Rewarded showRewarded onError -> " + adError;
            vf3.b = null;
        }

        @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoClosed() {
            vf3.b = null;
            vf3.a(this.a);
            wg3 wg3Var = vf3.e;
            if (wg3Var != null) {
                wg3Var.H1();
            }
        }

        @Override // com.facebook.ads.RewardedVideoAdListener
        public void onRewardedVideoCompleted() {
        }
    }

    /* compiled from: Facebook_Rewarded.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            vf3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        b = new RewardedVideoAd(activity, ih3.B());
        c = new a(activity);
        RewardedVideoAd rewardedVideoAd = b;
        rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(c).build());
    }

    public static void b(wg3 monAdsClickListner) {
        e = monAdsClickListner;
    }

    public static void c(Activity activity) {
        RewardedVideoAd rewardedVideoAd = b;
        if (rewardedVideoAd != null && rewardedVideoAd.isAdLoaded() && !b.isAdInvalidated()) {
            b.show();
        } else if (d.booleanValue()) {
        } else {
            d = Boolean.TRUE;
            d();
            if (b == null) {
                a(activity);
            }
        }
    }

    private static void d() {
        new b(bh3.d1, 1000L).start();
    }
}