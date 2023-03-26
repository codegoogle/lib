package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0654Fk implements QQ {
    public final QI A00;
    public final AnonymousClass48 A01;

    public AbstractC0654Fk(AnonymousClass48 anonymousClass48, QI qi) {
        this.A01 = anonymousClass48;
        this.A00 = qi;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public void A3P(Map<QB, QV> map, Map<InterfaceC0661Ft, QI> map2) {
        map2.put(this.A01, this.A00);
    }
}