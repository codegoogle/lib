package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Qc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0922Qc implements L3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0770Kc A01;
    public final /* synthetic */ QZ A02;

    public C0922Qc(QZ qz, int i, AbstractRunnableC0770Kc abstractRunnableC0770Kc) {
        this.A02 = qz;
        this.A00 = i;
        this.A01 = abstractRunnableC0770Kc;
    }

    @Override // com.facebook.ads.redexgen.X.L3
    public final void A9D() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.L3
    public final void AAc(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}