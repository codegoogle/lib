package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.Ub  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1022Ub implements InterfaceC04416i {
    public final /* synthetic */ C1045Uy A00;

    public C1022Ub(C1045Uy c1045Uy) {
        this.A00 = c1045Uy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A09(Build.PRODUCT);
    }
}