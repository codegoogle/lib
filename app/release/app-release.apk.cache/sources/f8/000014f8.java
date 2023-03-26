package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.Wm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1085Wm extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0845Nd A00;

    public C1085Wm(C0845Nd c0845Nd) {
        this.A00 = c0845Nd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    @RequiresApi(api = 16)
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            C0845Nd c0845Nd = this.A00;
            i = c0845Nd.A07;
            c0845Nd.postDelayed(this, i);
            return;
        }
        this.A00.setPressed(true);
        C0845Nd c0845Nd2 = this.A00;
        runnable = c0845Nd2.A0A;
        c0845Nd2.postOnAnimationDelayed(runnable, 250L);
    }
}