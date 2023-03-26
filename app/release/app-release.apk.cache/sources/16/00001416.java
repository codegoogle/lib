package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class T8 extends KP {
    public final /* synthetic */ T9 A00;

    public T8(T9 t9) {
        this.A00 = t9;
    }

    @Override // com.facebook.ads.redexgen.X.KP
    public final void A04() {
        C5H c5h;
        C5H c5h2;
        c5h = this.A00.A01.A00;
        if (c5h.A02() == null) {
            return;
        }
        c5h2 = this.A00.A01.A00;
        c5h2.A02().onAdsLoaded();
    }
}