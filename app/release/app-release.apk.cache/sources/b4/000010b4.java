package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Eu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0638Eu extends AbstractC0950Re {
    public C0591Cv A00;

    public C0638Eu(C0591Cv c0591Cv, C03171k c03171k) {
        super(c0591Cv, c03171k);
        this.A00 = c0591Cv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0N() {
        if (super.A00 != null) {
            this.A00.A0A().A3o();
            this.A07.A0D(super.A00);
            return;
        }
        this.A00.A0A().A3p();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0Q(InterfaceC02940n interfaceC02940n, AnonymousClass90 anonymousClass90, C05008y c05008y, Map<String, Object> map) {
        this.A00.A0A().A3i();
        RD rd = (RD) interfaceC02940n;
        RZ rz = new RZ(this, map, rd);
        A0G().postDelayed(rz, anonymousClass90.A05().A05());
        rd.A0D(this.A00, this.A09, this.A08.A06, new C0946Ra(this, rz), map);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0950Re
    public final void A0S(String str) {
        this.A00.A0A().A3n(str != null);
        super.A0S(str);
    }
}