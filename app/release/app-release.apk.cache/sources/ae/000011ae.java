package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class J2 implements Runnable {
    public final /* synthetic */ C0557Be A00;
    public final /* synthetic */ J3 A01;

    public J2(J3 j3, C0557Be c0557Be) {
        this.A01 = j3;
        this.A00 = c0557Be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J4 j4;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            j4 = this.A01.A01;
            j4.ABG(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}