package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Zq implements InterfaceC0647Fd {
    public final int A00;
    public final /* synthetic */ C0552Az A01;

    public Zq(C0552Az c0552Az, int i) {
        this.A01 = c0552Az;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final boolean A7i() {
        return this.A01.A0T(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final void A8U() throws IOException {
        this.A01.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final int AC0(AH ah, C1121Xw c1121Xw, boolean z) {
        return this.A01.A0Q(this.A00, ah, c1121Xw, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0647Fd
    public final int ADF(long j) {
        return this.A01.A0P(this.A00, j);
    }
}