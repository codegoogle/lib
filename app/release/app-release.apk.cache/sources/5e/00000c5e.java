package com.anythink.splashad.api;

import android.view.View;

/* loaded from: classes2.dex */
public class ATSplashSkipInfo {
    public static final String TAG = "ATSplashSkipInfo";
    public ATSplashSkipAdListener mATSplashSkipAdListener;
    public long mCallbackInterval;
    public long mCountDownDuration;
    public View mSkipView;

    public ATSplashSkipInfo(View view, long j, long j2, ATSplashSkipAdListener aTSplashSkipAdListener) {
        this.mSkipView = view;
        this.mCountDownDuration = j;
        this.mCallbackInterval = j2;
        this.mATSplashSkipAdListener = aTSplashSkipAdListener;
        if (j < 2000) {
            this.mCountDownDuration = 2000L;
        }
        long j3 = this.mCallbackInterval;
        if (j3 <= 0) {
            this.mCallbackInterval = 1000L;
        } else if (j3 < 20) {
            this.mCallbackInterval = 20L;
        }
    }

    public boolean canUseCustomSkipView() {
        return this.mSkipView != null;
    }

    public void destroy() {
        View view = this.mSkipView;
        if (view != null) {
            view.setOnClickListener(null);
            this.mSkipView = null;
        }
        this.mATSplashSkipAdListener = null;
    }

    public ATSplashSkipAdListener getATSplashSkipAdListener() {
        return this.mATSplashSkipAdListener;
    }

    public long getCallbackInterval() {
        return this.mCallbackInterval;
    }

    public long getCountDownDuration() {
        return this.mCountDownDuration;
    }

    public View getSkipView() {
        return this.mSkipView;
    }

    public ATSplashSkipInfo(View view, ATSplashSkipAdListener aTSplashSkipAdListener) {
        this(view, 5000L, 1000L, aTSplashSkipAdListener);
    }
}