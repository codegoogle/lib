package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;

/* loaded from: assets/audience_network.dex */
public class WL implements InterfaceC04416i {
    public final /* synthetic */ WN A00;

    public WL(WN wn) {
        this.A00 = wn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A07(AnonymousClass76.A02(TrafficStats.getTotalRxBytes()));
    }
}