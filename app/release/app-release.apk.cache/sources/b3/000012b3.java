package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class NL implements Runnable {
    public final /* synthetic */ NM A00;
    public final /* synthetic */ NN A01;

    public NL(NM nm, NN nn) {
        this.A00 = nm;
        this.A01 = nn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A8t();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}