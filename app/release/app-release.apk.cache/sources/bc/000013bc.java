package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Rd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0949Rd extends AbstractRunnableC0770Kc {
    public final /* synthetic */ AbstractC0950Re A00;
    public final /* synthetic */ C0755Jm A01;

    public C0949Rd(AbstractC0950Re abstractC0950Re, C0755Jm c0755Jm) {
        this.A00 = abstractC0950Re;
        this.A01 = c0755Jm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        this.A00.A0C.A0A().A4Y(this.A01.A04().getErrorCode(), this.A01.A05());
        this.A00.A07.A0F(this.A01);
    }
}