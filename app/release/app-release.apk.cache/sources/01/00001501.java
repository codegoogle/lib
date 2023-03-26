package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Wv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1094Wv extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C1081Wi A00;

    public C1094Wv(C1081Wi c1081Wi) {
        this.A00 = c1081Wi;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        for (C04808d event : C04798c.A02()) {
            C04798c.A0B(this.A00, event.A02(), event.A00(), event.A01(), false);
        }
        C04798c.A02().clear();
    }
}