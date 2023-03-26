package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class RZ extends AbstractRunnableC0770Kc {
    public final /* synthetic */ RD A00;
    public final /* synthetic */ C0638Eu A01;
    public final /* synthetic */ Map A02;

    public RZ(C0638Eu c0638Eu, Map map, RD rd) {
        this.A01 = c0638Eu;
        this.A02 = map;
        this.A00 = rd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        this.A01.A0O();
    }
}