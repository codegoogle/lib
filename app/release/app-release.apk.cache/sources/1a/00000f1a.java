package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.7p  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04717p extends AbstractC0754Jk {
    public final /* synthetic */ C0702Hi A00;

    public C04717p(C0702Hi c0702Hi) {
        this.A00 = c0702Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(C0761Jt c0761Jt) {
        if (C0702Hi.A08(this.A00) && C0702Hi.A09(this.A00)) {
            C0702Hi.A0C(this.A00, false);
            if (C0702Hi.A0B(this.A00, PD.A04) || C0702Hi.A0A(this.A00)) {
                C0702Hi.A0D(this.A00, false);
                C0702Hi.A01(this.A00).postDelayed(new C0708Ho(this), C0702Hi.A00(this.A00));
            } else if (!C0702Hi.A0B(this.A00, PD.A03)) {
            } else {
                C0702Hi.A05(this.A00);
                C0702Hi.A06(this.A00, true, true);
            }
        }
    }
}