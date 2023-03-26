package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0951Rf extends AbstractRunnableC0770Kc {
    public final /* synthetic */ RE A00;
    public final /* synthetic */ C0637Et A01;
    public final /* synthetic */ Map A02;

    public C0951Rf(C0637Et c0637Et, Map map, RE re) {
        this.A01 = c0637Et;
        this.A02 = map;
        this.A00 = re;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        if (J8.A0j(this.A01.A0C)) {
            this.A01.A01 = null;
            C0755Jm c0755Jm = new C0755Jm(AdErrorType.INTERSTITIAL_AD_TIMEOUT, "");
            this.A01.A0C.A0A().A4Y(c0755Jm.A04().getErrorCode(), c0755Jm.A05());
            this.A01.A07.A0F(c0755Jm);
            return;
        }
        this.A01.A0O();
    }
}