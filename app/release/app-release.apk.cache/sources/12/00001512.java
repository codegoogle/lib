package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;

/* loaded from: assets/audience_network.dex */
public class XC implements C8L {
    public final /* synthetic */ C8H A00;
    public final /* synthetic */ XG A01;

    public XC(XG xg, C8H c8h) {
        this.A01 = xg;
        this.A00 = c8h;
    }

    @Override // com.facebook.ads.redexgen.X.C8L
    public final String A6H() {
        return KJ.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.C8L
    public final boolean A7X() {
        return BuildConfigApi.isDebug();
    }
}