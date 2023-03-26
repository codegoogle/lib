package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: Admob_Rewarded.java */
/* loaded from: classes3.dex */
public class rf3 {
    private static final String a = "Admob_Rewarded";
    public static RewardedAd b;
    public static Boolean c = Boolean.FALSE;
    public static wg3 d = null;

    /* compiled from: Admob_Rewarded.java */
    /* loaded from: classes3.dex */
    public class a extends RewardedAdLoadCallback {
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            rf3.b = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@x1 RewardedAd rewardedAd) {
            rf3.b = rewardedAd;
        }
    }

    /* compiled from: Admob_Rewarded.java */
    /* loaded from: classes3.dex */
    public class b implements OnUserEarnedRewardListener {
        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@x1 RewardItem rewardItem) {
        }
    }

    /* compiled from: Admob_Rewarded.java */
    /* loaded from: classes3.dex */
    public class c extends FullScreenContentCallback {
        public final /* synthetic */ Activity a;

        public c(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            wg3 wg3Var = rf3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            rf3.b = null;
            rf3.a(this.a);
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            String str = "Admob_Rewarded showRewarded onAdFailedToShowFullScreenContent -> " + adError;
            rf3.b = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
        }
    }

    /* compiled from: Admob_Rewarded.java */
    /* loaded from: classes3.dex */
    public class d extends CountDownTimer {
        public d(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            rf3.c = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        RewardedAd.load((Context) activity, ih3.t(), new AdManagerAdRequest.Builder().build(), (RewardedAdLoadCallback) new a());
    }

    public static void b(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (b == null) {
            if (!c.booleanValue()) {
                c = Boolean.TRUE;
                d();
                if (b == null) {
                    a(activity);
                }
            }
        } else {
            b.show(activity, new b());
        }
        b.setFullScreenContentCallback(new c(activity));
    }

    private static void d() {
        new d(bh3.d1, 1000L).start();
    }
}