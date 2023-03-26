package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class B9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BA A01;

    public B9(BA ba, int i) {
        this.A01 = ba;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BB bb;
        if (KU.A02(this)) {
            return;
        }
        try {
            bb = this.A01.A01;
            bb.A8y(this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}