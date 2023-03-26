package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Wl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1084Wl extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0845Nd A00;

    public C1084Wl(C0845Nd c0845Nd) {
        this.A00 = c0845Nd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    @RequiresApi(api = 16)
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        C0845Nd c0845Nd = this.A00;
        runnable = c0845Nd.A08;
        i = this.A00.A07;
        c0845Nd.postOnAnimationDelayed(runnable, i);
    }
}