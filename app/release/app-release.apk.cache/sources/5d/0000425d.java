package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.greedygame.core.interstitial.general.GGInterstitialAd;

/* compiled from: Sdk_Interstitial.java */
/* loaded from: classes3.dex */
public class fg3 {
    public static final String a = "Sdk_Interstitial";
    public static GGInterstitialAd b;
    public static GGInterstitialAd c;
    public static wg3 d;
    public static Boolean e = Boolean.FALSE;

    /* compiled from: Sdk_Interstitial.java */
    /* loaded from: classes3.dex */
    public class a implements i13 {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            fg3.b = null;
            String str = "Sdk_Interstitial loadInterstitial onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
            fg3.b = null;
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
            wg3 wg3Var = fg3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            fg3.b.e();
            fg3.b = null;
            fg3.a(this.a);
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }
    }

    /* compiled from: Sdk_Interstitial.java */
    /* loaded from: classes3.dex */
    public class b implements i13 {
        public final /* synthetic */ Activity a;

        public b(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            fg3.c = null;
            String str = "Sdk_Interstitial loadInterstitial1 onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.e03
        public void e() {
            fg3.c = null;
        }

        @Override // com.p7700g.p99005.e03
        public void onAdClosed() {
            wg3 wg3Var = fg3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            fg3.c.e();
            fg3.c = null;
            fg3.b(this.a);
        }

        @Override // com.p7700g.p99005.e03, com.p7700g.p99005.d03
        public void onAdLoaded() {
        }

        @Override // com.p7700g.p99005.e03
        public void onAdOpened() {
        }
    }

    /* compiled from: Sdk_Interstitial.java */
    /* loaded from: classes3.dex */
    public class c extends CountDownTimer {
        public c(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            fg3.e = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        GGInterstitialAd gGInterstitialAd = new GGInterstitialAd(activity, ih3.E());
        b = gGInterstitialAd;
        gGInterstitialAd.p(new a(activity));
        b.n();
    }

    public static void b(Activity activity) {
        GGInterstitialAd gGInterstitialAd = new GGInterstitialAd(activity, ih3.E());
        c = gGInterstitialAd;
        gGInterstitialAd.p(new b(activity));
        c.n();
    }

    public static void c(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void d(Activity activity) {
        if (b.m()) {
            b.t();
            if (c == null) {
                b(activity);
            }
        } else if (c.m()) {
            c.t();
            if (c == null) {
                a(activity);
            }
        } else if (e.booleanValue()) {
        } else {
            e = Boolean.TRUE;
            e();
            if (b.m()) {
                return;
            }
            a(activity);
        }
    }

    private static void e() {
        new c(bh3.d1, 1000L).start();
    }
}