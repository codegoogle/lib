package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ec  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0622Ec implements Runnable {
    public final /* synthetic */ RunnableC0625Ef A00;

    public RunnableC0622Ec(RunnableC0625Ef runnableC0625Ef) {
        this.A00 = runnableC0625Ef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G(5, 3);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}