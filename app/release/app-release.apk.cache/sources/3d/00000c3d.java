package com.anythink.splashad.a;

import com.anythink.core.api.AdError;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public abstract class b implements com.anythink.core.common.b.a {
    public String mRequestId;
    public Timer mTimer;
    public boolean mHasReturn = false;
    public boolean isAdTimeout = false;
    public TimerTask mTimerTask = new TimerTask() { // from class: com.anythink.splashad.a.b.1
        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            if (bVar.mHasReturn) {
                return;
            }
            bVar.isAdTimeout = true;
            bVar.onTimeout(bVar.mRequestId);
        }
    };

    @Override // com.anythink.core.common.b.a
    public void onAdLoadFail(AdError adError) {
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onNoAdError(this.mRequestId, adError);
    }

    @Override // com.anythink.core.common.b.a
    public void onAdLoaded() {
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
        }
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onAdLoaded(this.mRequestId, this.isAdTimeout);
    }

    public abstract void onAdLoaded(String str, boolean z);

    public abstract void onNoAdError(String str, AdError adError);

    public abstract void onTimeout(String str);

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void startCountDown(int i) {
        if (this.mTimer == null) {
            this.mTimer = new Timer();
        }
        this.mTimer.schedule(this.mTimerTask, i);
    }
}