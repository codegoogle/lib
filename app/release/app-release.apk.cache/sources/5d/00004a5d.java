package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.interstitial.api.ATInterstitialListener;

/* compiled from: Topon_Interstitial.java */
/* loaded from: classes3.dex */
public class jg3 {
    public static final String a = "Topon_Interstitial";
    public static ATInterstitial b;
    public static ATInterstitial c;
    public static Boolean d = Boolean.FALSE;
    public static wg3 e = null;

    /* compiled from: Topon_Interstitial.java */
    /* loaded from: classes3.dex */
    public class a implements ATInterstitialListener {
        public final /* synthetic */ String a;

        public a(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClicked(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClose(ATAdInfo atAdInfo) {
            wg3 wg3Var = jg3.e;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            jg3.b = null;
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoadFail(AdError adError) {
            jg3.b = null;
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdShow(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoEnd(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoError(AdError adError) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoStart(ATAdInfo atAdInfo) {
        }
    }

    /* compiled from: Topon_Interstitial.java */
    /* loaded from: classes3.dex */
    public class b implements ATInterstitialListener {
        public final /* synthetic */ String a;

        public b(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClicked(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdClose(ATAdInfo atAdInfo) {
            wg3 wg3Var = jg3.e;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            jg3.c = null;
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoadFail(AdError adError) {
            jg3.c = null;
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdLoaded() {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdShow(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoEnd(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoError(AdError adError) {
        }

        @Override // com.anythink.interstitial.api.ATInterstitialListener
        public void onInterstitialAdVideoStart(ATAdInfo atAdInfo) {
        }
    }

    /* compiled from: Topon_Interstitial.java */
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
            jg3.a(this.a);
            jg3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        String J = ih3.J();
        ATInterstitial aTInterstitial = new ATInterstitial(activity, J);
        b = aTInterstitial;
        aTInterstitial.setAdListener(new a(J));
        b.load();
    }

    public static void b(Activity activity) {
        String J = ih3.J();
        ATInterstitial aTInterstitial = new ATInterstitial(activity, J);
        c = aTInterstitial;
        aTInterstitial.setAdListener(new b(J));
        c.load();
    }

    public static void c(wg3 monAdsClickListner) {
        e = monAdsClickListner;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r0.isAdReady() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r0.isAdReady() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0 = "interstitialAd1";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Activity activity) {
        String str;
        ATInterstitial aTInterstitial = b;
        boolean z = true;
        if (aTInterstitial != null) {
            if (aTInterstitial.isAdReady()) {
                str = "interstitialAd";
            } else {
                ATInterstitial aTInterstitial2 = c;
                if (aTInterstitial2 != null) {
                }
                z = false;
                str = null;
            }
        } else {
            ATInterstitial aTInterstitial3 = c;
            if (aTInterstitial3 != null) {
            }
            z = false;
            str = null;
        }
        if (!z) {
            e(activity);
        } else if (str != null) {
            if (str.equals("interstitialAd")) {
                b.show(activity);
                b(activity);
            } else if (str.equals("interstitialAd1")) {
                c.show(activity);
                a(activity);
            }
        } else {
            e(activity);
        }
    }

    public static void e(Activity activity) {
        if (d.booleanValue()) {
            return;
        }
        d = Boolean.TRUE;
        new c(bh3.d1, 1000L, activity).start();
    }
}