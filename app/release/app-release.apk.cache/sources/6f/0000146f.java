package com.facebook.ads.redexgen.X;

import android.os.Build;

/* loaded from: assets/audience_network.dex */
public class UZ implements InterfaceC04416i {
    public final /* synthetic */ C1045Uy A00;

    public UZ(C1045Uy c1045Uy) {
        this.A00 = c1045Uy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A09(Build.MANUFACTURER);
    }
}