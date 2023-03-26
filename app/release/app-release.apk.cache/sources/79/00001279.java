package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class MO extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0792Lb A00;

    public MO(C0792Lb c0792Lb) {
        this.A00 = c0792Lb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        boolean z;
        C9J c9j;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c9j = this.A00.A0A;
            c9j.A03(new K5(this.A00.getCurrentPositionInMillis()) { // from class: com.facebook.ads.redexgen.X.7s
            });
            handler = this.A00.A06;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}