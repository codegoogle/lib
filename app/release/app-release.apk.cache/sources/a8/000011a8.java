package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Iw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0740Iw implements Runnable {
    public final /* synthetic */ C0557Be A00;
    public final /* synthetic */ J3 A01;

    public RunnableC0740Iw(J3 j3, C0557Be c0557Be) {
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
            j4 = this.A01.A01;
            j4.ABH(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}