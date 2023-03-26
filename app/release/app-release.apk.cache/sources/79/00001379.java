package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class QY implements InterfaceC04074z {
    public final /* synthetic */ C04878l A00;

    public QY(C04878l c04878l) {
        this.A00 = c04878l;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04074z
    public final boolean A7U() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        return !atomicBoolean.get() || this.A00.A0U();
    }
}