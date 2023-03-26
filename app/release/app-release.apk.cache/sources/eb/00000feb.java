package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* loaded from: assets/audience_network.dex */
public class BN extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1113Xo A01;

    public BN(C1113Xo c1113Xo, AudioTrack audioTrack) {
        this.A01 = c1113Xo;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.flush();
            this.A00.release();
            conditionVariable = this.A01.A0f;
            conditionVariable.open();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}