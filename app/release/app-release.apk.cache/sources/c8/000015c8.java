package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.aC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1185aC extends AbstractRunnableC0770Kc {
    public final /* synthetic */ L4 A00;

    public C1185aC(L4 l4) {
        this.A00 = l4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        Handler handler;
        if (this.A00.A06()) {
            this.A00.A01();
            handler = this.A00.A03;
            handler.postDelayed(this, 250L);
        }
    }
}