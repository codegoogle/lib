package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* loaded from: assets/audience_network.dex */
public class BO extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ C1113Xo A01;

    public BO(C1113Xo c1113Xo, AudioTrack audioTrack) {
        this.A01 = c1113Xo;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.release();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}