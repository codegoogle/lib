package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class QW implements NT {
    public final /* synthetic */ C04878l A00;

    public QW(C04878l c04878l) {
        this.A00 = c04878l;
    }

    @Override // com.facebook.ads.redexgen.X.NT
    public final void A9g(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A03;
        atomicBoolean.set(z);
        this.A00.A05();
    }
}