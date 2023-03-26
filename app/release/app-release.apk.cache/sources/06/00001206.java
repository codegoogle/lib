package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class KV extends C9K<C04737s> {
    public final /* synthetic */ C7w A00;

    public KV(C7w c7w) {
        this.A00 = c7w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(C04737s c04737s) {
        C0792Lb c0792Lb;
        C0792Lb c0792Lb2;
        int A00 = c04737s.A00();
        if (this.A00.A00 > 0) {
            c0792Lb = this.A00.A0B;
            if (A00 == c0792Lb.getDuration()) {
                c0792Lb2 = this.A00.A0B;
                if (c0792Lb2.getDuration() > this.A00.A00) {
                    return;
                }
            }
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.X.C9K
    public final Class<C04737s> A01() {
        return C04737s.class;
    }
}