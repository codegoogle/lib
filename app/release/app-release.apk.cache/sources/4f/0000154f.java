package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network.dex */
public class YB implements OW {
    public final /* synthetic */ YA A00;

    public YB(YA ya) {
        this.A00 = ya;
    }

    public /* synthetic */ YB(YA ya, ZV zv) {
        this(ya);
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void A9G() {
        this.A00.A0V(true);
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void A9i() {
        AnonymousClass16 anonymousClass16;
        M6 m6;
        InterfaceC0818Mb interfaceC0818Mb;
        JE je;
        AnonymousClass16 anonymousClass162;
        OY oy;
        OY oy2;
        C1080Wh c1080Wh;
        anonymousClass16 = this.A00.A09;
        if (!TextUtils.isEmpty(anonymousClass16.A0Q())) {
            je = this.A00.A0D;
            anonymousClass162 = this.A00.A09;
            String A0Q = anonymousClass162.A0Q();
            NU nu = new NU();
            oy = this.A00.A06;
            NU A04 = nu.A04(oy.getViewabilityChecker());
            oy2 = this.A00.A06;
            je.A86(A0Q, A04.A03(oy2.getTouchDataRecorder()).A06());
            c1080Wh = this.A00.A0C;
            c1080Wh.A0A().A2a();
        }
        m6 = this.A00.A0H;
        interfaceC0818Mb = this.A00.A0I;
        m6.A3s(interfaceC0818Mb.A6N());
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void AA2() {
        M6 m6;
        InterfaceC0818Mb interfaceC0818Mb;
        m6 = this.A00.A0H;
        interfaceC0818Mb = this.A00.A0I;
        m6.A3s(interfaceC0818Mb.A6C());
    }
}