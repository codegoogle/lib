package com.facebook.ads.redexgen.X;

import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public class VK implements InterfaceC04416i {
    public final /* synthetic */ VN A00;

    public VK(VN vn) {
        this.A00 = vn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A09(Locale.getDefault().getCountry());
    }
}