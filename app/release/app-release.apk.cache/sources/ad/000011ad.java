package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* loaded from: assets/audience_network.dex */
public class J1 implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ J3 A01;

    public J1(J3 j3, Surface surface) {
        this.A01 = j3;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J4 j4;
        if (KU.A02(this)) {
            return;
        }
        try {
            j4 = this.A01.A01;
            j4.AAk(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}