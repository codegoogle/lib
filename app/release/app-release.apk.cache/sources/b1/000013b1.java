package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class RS implements AnonymousClass79 {
    public final /* synthetic */ RU A00;

    public RS(RU ru) {
        this.A00 = ru;
    }

    private void A00(boolean z) {
        C1Y c1y;
        C1Y c1y2;
        if (z) {
            c1y2 = this.A00.A03;
            c1y2.A8m();
            return;
        }
        c1y = this.A00.A03;
        c1y.A8l(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A97() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A9E() {
        A00(true);
    }
}