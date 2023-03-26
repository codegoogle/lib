package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0928Qi extends AbstractC0900Pg {
    public final /* synthetic */ C0924Qe A00;

    public C0928Qi(C0924Qe c0924Qe) {
        this.A00 = c0924Qe;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A04() {
        LX lx;
        LX lx2;
        C0901Ph c0901Ph;
        LX lx3;
        JE je;
        AnonymousClass16 anonymousClass16;
        C1080Wh c1080Wh;
        M6 m6;
        M6 m62;
        InterfaceC0818Mb interfaceC0818Mb;
        lx = this.A00.A0B;
        if (!lx.A08()) {
            lx2 = this.A00.A0B;
            lx2.A06();
            NU nu = new NU();
            c0901Ph = this.A00.A0H;
            NU A04 = nu.A04(c0901Ph);
            lx3 = this.A00.A0B;
            Map<String, String> A06 = A04.A03(lx3).A06();
            je = this.A00.A08;
            anonymousClass16 = this.A00.A05;
            je.A86(anonymousClass16.A0Q(), A06);
            c1080Wh = this.A00.A07;
            c1080Wh.A0A().A2a();
            m6 = this.A00.A0C;
            if (m6 != null) {
                m62 = this.A00.A0C;
                interfaceC0818Mb = this.A00.A0D;
                m62.A3s(interfaceC0818Mb.A6N());
            }
        }
    }
}