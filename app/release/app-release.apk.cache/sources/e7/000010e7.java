package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0653Fj implements QQ {
    public final C0662Fu A00;
    public final QV A01;

    public AbstractC0653Fj(C0662Fu c0662Fu, QV qv) {
        this.A00 = c0662Fu;
        this.A01 = qv;
    }

    @Override // com.facebook.ads.redexgen.X.QQ
    public void A3P(Map<QB, QV> map, Map<InterfaceC0661Ft, QI> map2) {
        map.put(this.A00, this.A01);
    }
}