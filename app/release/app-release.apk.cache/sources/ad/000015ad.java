package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Zl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1161Zl implements InterfaceC04074z {
    public final /* synthetic */ C1158Zi A00;

    public C1161Zl(C1158Zi c1158Zi) {
        this.A00 = c1158Zi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04074z
    public final boolean A7U() {
        XS xs;
        XS xs2;
        xs = this.A00.A0B;
        if (xs.canGoBack()) {
            xs2 = this.A00.A0B;
            xs2.goBack();
            return true;
        }
        return false;
    }
}