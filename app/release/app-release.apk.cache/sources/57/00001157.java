package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0695Hb implements Runnable {
    public final InterfaceC0694Ha A00;

    public RunnableC0695Hb(InterfaceC0694Ha interfaceC0694Ha) {
        this.A00 = interfaceC0694Ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.AA4();
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}