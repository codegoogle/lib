package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;

/* compiled from: IronSource_Rewarded.java */
/* loaded from: classes3.dex */
public class zf3 {
    private static final String a = "IronSource_Rewarded";
    public static Boolean b;
    public static Boolean c;
    public static wg3 d;

    /* compiled from: IronSource_Rewarded.java */
    /* loaded from: classes3.dex */
    public class a implements RewardedVideoListener {
        public final /* synthetic */ Activity a;

        public a(final Activity val$activity) {
            this.a = val$activity;
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdClicked(Placement placement) {
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdClosed() {
            wg3 wg3Var = zf3.d;
            if (wg3Var != null) {
                wg3Var.H1();
            }
            zf3.a(this.a);
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdEnded() {
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdOpened() {
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdRewarded(Placement placement) {
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdShowFailed(IronSourceError error) {
            zf3.b = Boolean.FALSE;
            error.getErrorMessage();
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAdStarted() {
        }

        @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
        public void onRewardedVideoAvailabilityChanged(boolean available) {
            zf3.b = Boolean.valueOf(available);
        }
    }

    /* compiled from: IronSource_Rewarded.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            zf3.c = Boolean.FALSE;
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
        IronSource.init(activity, yg3.e(bh3.n0), IronSource.AD_UNIT.REWARDED_VIDEO);
        IronSource.loadRewardedVideo();
        IronSource.setRewardedVideoListener(new a(activity));
    }

    public static void b(wg3 monAdsClickListner) {
        d = monAdsClickListner;
    }

    public static void c(Activity activity) {
        if (b.booleanValue() && IronSource.isRewardedVideoAvailable()) {
            IronSource.showRewardedVideo();
        } else if (c.booleanValue()) {
        } else {
            c = Boolean.TRUE;
            d();
            if (b.booleanValue()) {
                return;
            }
            a(activity);
        }
    }

    private static void d() {
        new b(bh3.d1, 1000L).start();
    }
}