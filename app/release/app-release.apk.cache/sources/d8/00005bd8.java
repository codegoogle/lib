package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.facebook.ads.AbstractAdListener;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;

/* compiled from: Facebook_Interstitial.java */
/* loaded from: classes3.dex */
public class sf3 {
    public static final String a = "Facebook_Interstitial";
    public static InterstitialAd b;
    public static InterstitialAd c;
    public static Boolean d = Boolean.FALSE;
    public static wg3 e = null;

    /* compiled from: Facebook_Interstitial.java */
    /* loaded from: classes3.dex */
    public class a extends AbstractAdListener {
        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            super.onAdLoaded(ad);
        }

        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
        public void onError(Ad ad, AdError error) {
            sf3.b = null;
            super.onError(ad, error);
        }

        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            super.onInterstitialDismissed(ad);
            wg3 wg3Var = sf3.e;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            sf3.b = null;
        }
    }

    /* compiled from: Facebook_Interstitial.java */
    /* loaded from: classes3.dex */
    public class b extends AbstractAdListener {
        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            super.onAdLoaded(ad);
        }

        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.AdListener
        public void onError(Ad ad, AdError error) {
            sf3.c = null;
            super.onError(ad, error);
        }

        @Override // com.facebook.ads.AbstractAdListener, com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            super.onInterstitialDismissed(ad);
            wg3 wg3Var = sf3.e;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            sf3.c = null;
        }
    }

    /* compiled from: Facebook_Interstitial.java */
    /* loaded from: classes3.dex */
    public class c extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            sf3.a(this.a);
            sf3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        InterstitialAd interstitialAd = new InterstitialAd(activity, ih3.y());
        b = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new a()).build());
    }

    public static void b(Activity activity) {
        InterstitialAd interstitialAd = new InterstitialAd(activity, ih3.y());
        c = interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new b()).build());
    }

    public static void c(wg3 monAdsClickListner) {
        e = monAdsClickListner;
    }

    public static void d(Activity activity) {
        InterstitialAd interstitialAd = b;
        if (interstitialAd != null && interstitialAd.isAdLoaded()) {
            b.show();
            b(activity);
            return;
        }
        InterstitialAd interstitialAd2 = c;
        if (interstitialAd2 != null && interstitialAd2.isAdLoaded()) {
            c.show();
            a(activity);
            return;
        }
        e(activity);
    }

    public static void e(Activity activity) {
        if (d.booleanValue()) {
            return;
        }
        d = Boolean.TRUE;
        new c(bh3.d1, 1000L, activity).start();
    }
}