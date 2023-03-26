package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B4 implements Runnable {
    public final /* synthetic */ BA A00;
    public final /* synthetic */ C0557Be A01;

    public B4(BA ba, C0557Be c0557Be) {
        this.A00 = ba;
        this.A01 = c0557Be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BB bb;
        if (KU.A02(this)) {
            return;
        }
        try {
            bb = this.A00.A01;
            bb.A8w(this.A01);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}