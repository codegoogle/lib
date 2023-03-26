package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class QX extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C04878l A00;

    public QX(C04878l c04878l) {
        this.A00 = c04878l;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        AbstractC0856No abstractC0856No;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC0856No abstractC0856No2;
        abstractC0856No = this.A00.A00;
        if (abstractC0856No != null) {
            abstractC0856No2 = this.A00.A00;
            abstractC0856No2.A0Z();
        }
        M1 m1 = this.A00.A07;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        m1.setToolbarActionMode(closeButtonStyle);
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(true);
    }
}