package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.rewardvideo.api.ATRewardVideoAd;
import com.anythink.rewardvideo.api.ATRewardVideoListener;

/* compiled from: Topon_Rewarded.java */
/* loaded from: classes3.dex */
public class mg3 {
    private static final String a = "Topon_Rewarded";
    public static ATRewardVideoAd b;
    public static Boolean c = Boolean.FALSE;
    public static wg3 d = null;

    /* compiled from: Topon_Rewarded.java */
    /* loaded from: classes3.dex */
    public class a implements ATRewardVideoListener {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onReward(ATAdInfo atAdInfo) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdClosed(ATAdInfo entity) {
            mg3.b = null;
            wg3 wg3Var = mg3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            mg3.a(this.a);
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdFailed(AdError errorCode) {
            errorCode.getFullErrorInfo();
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdLoaded() {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayClicked(ATAdInfo entity) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayEnd(ATAdInfo entity) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayFailed(AdError errorCode, ATAdInfo entity) {
        }

        @Override // com.anythink.rewardvideo.api.ATRewardVideoListener
        public void onRewardedVideoAdPlayStart(ATAdInfo entity) {
        }
    }

    /* compiled from: Topon_Rewarded.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            mg3.c = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    public static void a(Activity activity) {
        ATRewardVideoAd aTRewardVideoAd = new ATRewardVideoAd(activity, ih3.N());
        b = aTRewardVideoAd;
        aTRewardVideoAd.setAdListener(new a(activity));
        b.load(activity);
    }

    public static void b(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (b.isAdReady()) {
            b.show(activity);
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