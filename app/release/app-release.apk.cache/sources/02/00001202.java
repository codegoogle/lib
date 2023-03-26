package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class KR extends C9K<C7v> {
    public final /* synthetic */ C7w A00;

    public KR(C7w c7w) {
        this.A00 = c7w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(C7v c7v) {
        int A00 = c7v.A00();
        int A01 = c7v.A01();
        if (this.A00.A00 > 0 && A00 == A01 && A01 > this.A00.A00) {
            return;
        }
        if (A01 < A00 + 500) {
            if (A01 == 0) {
                C7w c7w = this.A00;
                c7w.A0e(c7w.A00);
                return;
            }
            this.A00.A0e(A01);
            return;
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9K
    public final Class<C7v> A01() {
        return C7v.class;
    }
}