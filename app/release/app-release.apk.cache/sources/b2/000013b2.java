package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class RT implements InterfaceC03131g {
    public final /* synthetic */ RU A00;

    public RT(RU ru) {
        this.A00 = ru;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03131g
    public final void AAR(AdError adError) {
        C1Y c1y;
        c1y = this.A00.A03;
        c1y.A8l(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03131g
    public final void AAS() {
        C1Y c1y;
        c1y = this.A00.A03;
        c1y.A8m();
    }
}