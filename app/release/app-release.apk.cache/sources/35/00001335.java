package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class PS implements Runnable {
    public final /* synthetic */ PV A00;

    public PS(PV pv) {
        this.A00 = pv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A08();
            handler = this.A00.A05;
            handler.removeCallbacks(this);
            handler2 = this.A00.A05;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}