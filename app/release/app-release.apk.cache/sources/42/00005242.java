package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: Admob_AppOpen.java */
/* loaded from: classes3.dex */
public class nf3 {
    private static final String a = "AppOpenManager";
    public static AppOpenAd b;
    public static AppOpenAd c;
    private static AppOpenAd.AppOpenAdLoadCallback d;
    private static AppOpenAd.AppOpenAdLoadCallback e;
    public static Boolean f = Boolean.FALSE;
    public static wg3 g = null;

    /* compiled from: Admob_AppOpen.java */
    /* loaded from: classes3.dex */
    public class a extends AppOpenAd.AppOpenAdLoadCallback {
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            nf3.b = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd ad) {
            nf3.b = ad;
        }
    }

    /* compiled from: Admob_AppOpen.java */
    /* loaded from: classes3.dex */
    public class b extends AppOpenAd.AppOpenAdLoadCallback {
        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            nf3.c = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd ad) {
            nf3.c = ad;
        }
    }

    /* compiled from: Admob_AppOpen.java */
    /* loaded from: classes3.dex */
    public class c extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            wg3 wg3Var = nf3.g;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            nf3.b = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            String str = "Admob_AppOpen showAppOpen onAdFailedToShowFullScreenContent appOpenAd -> " + adError;
            nf3.b = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
        }
    }

    /* compiled from: Admob_AppOpen.java */
    /* loaded from: classes3.dex */
    public class d extends FullScreenContentCallback {
        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            wg3 wg3Var = nf3.g;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            nf3.c = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            String str = "Admob_AppOpen showAppOpen onAdFailedToShowFullScreenContent appOpenAd1 -> " + adError;
            nf3.c = null;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
        }
    }

    /* compiled from: Admob_AppOpen.java */
    /* loaded from: classes3.dex */
    public class e extends CountDownTimer {
        public e(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            nf3.f = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        d = new a();
        AppOpenAd.load((Context) activity, ih3.s(), new AdManagerAdRequest.Builder().build(), 1, d);
    }

    public static void b(Activity activity) {
        e = new b();
        AppOpenAd.load((Context) activity, ih3.s(), new AdManagerAdRequest.Builder().build(), 1, e);
    }

    public static void c(wg3 monAdsClickListner) {
        g = monAdsClickListner;
    }

    public static void d(Activity activity) {
        if (b != null) {
            b.setFullScreenContentCallback(new c());
            b.show(activity);
            b(activity);
        } else if (c != null) {
            c.setFullScreenContentCallback(new d());
            c.show(activity);
            a(activity);
        } else if (f.booleanValue()) {
        } else {
            f = Boolean.TRUE;
            e();
            if (c == null) {
                a(activity);
            }
        }
    }

    private static void e() {
        new e(bh3.d1, 1000L).start();
    }
}