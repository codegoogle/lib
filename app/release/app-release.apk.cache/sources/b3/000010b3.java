package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Et  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0637Et extends AbstractC0950Re {
    public C0637Et(C1080Wh c1080Wh, C03171k c03171k) {
        super(c1080Wh, c03171k);
    }

    private InterfaceC03040x A00(Runnable runnable) {
        return new C0952Rg(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0N() {
        ((RE) this.A02).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0Q(InterfaceC02940n interfaceC02940n, AnonymousClass90 anonymousClass90, C05008y c05008y, Map<String, Object> map) {
        RE re = (RE) interfaceC02940n;
        C0951Rf c0951Rf = new C0951Rf(this, map, re);
        A0G().postDelayed(c0951Rf, anonymousClass90.A05().A05());
        re.A0A(this.A0C, A00(c0951Rf), map, this.A08.A09, this.A08.A03, this.A08.A04, this.A08.A01);
    }
}