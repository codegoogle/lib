package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class MM extends AbstractRunnableC0770Kc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0792Lb A02;

    public MM(C0792Lb c0792Lb, int i, int i2) {
        this.A02 = c0792Lb;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C9J c9j;
        c9j = this.A02.A0A;
        c9j.A03(new IW(this.A00, this.A01));
    }
}