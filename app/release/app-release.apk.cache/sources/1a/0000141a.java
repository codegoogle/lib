package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* loaded from: assets/audience_network.dex */
public class TC extends AbstractRunnableC0770Kc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C5L A01;
    public final /* synthetic */ C1267bZ A02;

    public TC(C5L c5l, C1267bZ c1267bZ, Drawable drawable) {
        this.A01 = c5l;
        this.A02 = c1267bZ;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        this.A02.A1E(this.A00);
    }
}