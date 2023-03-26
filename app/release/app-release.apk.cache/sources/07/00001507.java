package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class X1 extends AbstractRunnableC0770Kc {
    public final WeakReference<C0901Ph> A00;

    public X1(C0901Ph c0901Ph) {
        this.A00 = new WeakReference<>(c0901Ph);
    }

    public X1(WeakReference<C0901Ph> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C0901Ph c0901Ph = this.A00.get();
        if (c0901Ph != null) {
            c0901Ph.A0W();
        }
    }
}