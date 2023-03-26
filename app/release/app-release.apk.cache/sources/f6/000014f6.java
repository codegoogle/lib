package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1083Wk extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0845Nd A00;

    public C1083Wk(C0845Nd c0845Nd) {
        this.A00 = c0845Nd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        float f;
        int i;
        this.A00.clearAnimation();
        f = this.A00.A06;
        C0795Le.A0H(1000, f, this.A00);
        C0845Nd c0845Nd = this.A00;
        i = c0845Nd.A07;
        c0845Nd.postDelayed(this, i);
    }
}