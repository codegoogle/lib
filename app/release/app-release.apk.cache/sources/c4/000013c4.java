package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0957Rl extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0641Ex A00;
    public final /* synthetic */ Eq A01;
    public final /* synthetic */ Map A02;

    public C0957Rl(Eq eq, Map map, C0641Ex c0641Ex) {
        this.A01 = eq;
        this.A02 = map;
        this.A00 = c0641Ex;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        this.A01.A01 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A01.A0C.A0A().A4Y(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A01.A07.A0F(new C0755Jm(adErrorType, ""));
    }
}