package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

/* compiled from: Admob_Interstitial.java */
/* loaded from: classes3.dex */
public class of3 {
    public static final String a = "Admob_Interstitial";
    public static AdManagerInterstitialAd b;
    public static AdManagerInterstitialAd c;
    public static wg3 d;
    public static Boolean e = Boolean.FALSE;

    /* compiled from: Admob_Interstitial.java */
    /* loaded from: classes3.dex */
    public class a extends AdManagerInterstitialAdLoadCallback {
        public final /* synthetic */ String a;

        public a(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@x1 AdManagerInterstitialAd minterstitialAd) {
            of3.b = minterstitialAd;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            of3.b = null;
        }
    }

    /* compiled from: Admob_Interstitial.java */
    /* loaded from: classes3.dex */
    public class b extends AdManagerInterstitialAdLoadCallback {
        public final /* synthetic */ String a;

        public b(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* renamed from: a */
        public void onAdLoaded(@x1 AdManagerInterstitialAd minterstitialAd) {
            of3.c = minterstitialAd;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            of3.c = null;
        }
    }

    /* compiled from: Admob_Interstitial.java */
    /* loaded from: classes3.dex */
    public class c extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            wg3 wg3Var = of3.d;
            if (wg3Var != null) {
                wg3Var.H1();
                of3.d = null;
            }
            of3.b = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            String str = "Admob_Interstitial showInterstitial onAdFailedToShowFullScreenContent -> " + adError;
            of3.b = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
        }
    }

    /* compiled from: Admob_Interstitial.java */
    /* loaded from: classes3.dex */
    public class d extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            wg3 wg3Var = of3.d;
            if (wg3Var != null) {
                wg3Var.H1();
                of3.d = null;
            }
            of3.c = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            String str = "Admob_Interstitial showInterstitial onAdFailedToShowFullScreenContent -> " + adError;
            of3.c = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
        }
    }

    /* compiled from: Admob_Interstitial.java */
    /* loaded from: classes3.dex */
    public class e extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            of3.a(this.a);
            of3.e = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        AdManagerAdRequest build = new AdManagerAdRequest.Builder().build();
        String p = ih3.p();
        AdManagerInterstitialAd.load(activity, p, build, new a(p));
    }

    public static void b(Activity activity) {
        AdManagerAdRequest build = new AdManagerAdRequest.Builder().build();
        String p = ih3.p();
        AdManagerInterstitialAd.load(activity, p, build, new b(p));
    }

    public static void c(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void d(Activity activity) {
        AdManagerInterstitialAd adManagerInterstitialAd = b;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new c());
            b.show(activity);
            b(activity);
            return;
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = c;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.setFullScreenContentCallback(new d());
            c.show(activity);
            a(activity);
            return;
        }
        e(activity);
    }

    public static void e(Activity activity) {
        if (e.booleanValue()) {
            return;
        }
        e = Boolean.TRUE;
        new e(bh3.d1, 1000L, activity).start();
    }
}