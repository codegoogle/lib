package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.greedygame.core.rewarded_ad.general.GGRewardedAd;

/* compiled from: Sdk_Rewarded.java */
/* loaded from: classes3.dex */
public class ig3 {
    private static final String a = "Sdk_Rewarded";
    public static GGRewardedAd b;
    public static Boolean c = Boolean.FALSE;
    public static wg3 d = null;

    /* compiled from: Sdk_Rewarded.java */
    /* loaded from: classes3.dex */
    public class a implements m23 {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(@x1 r13 adErrors) {
            String str = "Sdk_Rewarded loadRewarded onAdLoadFailed -> " + adErrors;
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
            ig3.b.e();
            ig3.b = null;
            ig3.a(this.a);
            wg3 wg3Var = ig3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }

        @Override // com.p7700g.p99005.m23
        public void onReward() {
        }
    }

    /* compiled from: Sdk_Rewarded.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            ig3.c = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        GGRewardedAd gGRewardedAd = new GGRewardedAd(activity, ih3.H());
        b = gGRewardedAd;
        gGRewardedAd.n(new a(activity));
        b.l();
    }

    public static void b(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (b.k()) {
            b.r(activity);
        } else if (c.booleanValue()) {
        } else {
            c = Boolean.TRUE;
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