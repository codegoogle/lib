package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

/* compiled from: IronSource_Interstitial.java */
/* loaded from: classes3.dex */
public class wf3 {
    public static final String a = "IronSource_Interstitial";
    public static Boolean b;
    public static Boolean c;
    public static wg3 d;

    /* compiled from: IronSource_Interstitial.java */
    /* loaded from: classes3.dex */
    public class a implements InterstitialListener {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdClicked() {
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdClosed() {
            wg3 wg3Var = wf3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            wf3.b = Boolean.FALSE;
            wf3.a(this.a);
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdLoadFailed(IronSourceError error) {
            wf3.b = Boolean.FALSE;
            error.getErrorMessage();
            error.getErrorCode();
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdOpened() {
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdReady() {
            wf3.b = Boolean.TRUE;
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdShowFailed(IronSourceError error) {
        }

        @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
        public void onInterstitialAdShowSucceeded() {
        }
    }

    /* compiled from: IronSource_Interstitial.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            wf3.c = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        b = bool;
        c = bool;
        d = null;
    }

    public static void a(Activity activity) {
        IronSource.init(activity, yg3.e(bh3.n0), IronSource.AD_UNIT.INTERSTITIAL);
        IronSource.loadInterstitial();
        IronSource.setInterstitialListener(new a(activity));
    }

    public static void b(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (b.booleanValue() && IronSource.isInterstitialReady()) {
            IronSource.showInterstitial();
            return;
        }
        if (!c.booleanValue()) {
            c = Boolean.TRUE;
            d();
            if (!b.booleanValue()) {
                a(activity);
            }
        }
        StringBuilder G = wo1.G("IronSource_Interstitial showInterstitial interstitialAd ");
        G.append(b);
        G.toString();
    }

    private static void d() {
        new b(bh3.d1, 1000L).start();
    }
}