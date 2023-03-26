package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Lc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0793Lc extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C0792Lb A00;

    public C0793Lc(C0792Lb c0792Lb) {
        this.A00 = c0792Lb;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        IO io;
        C9J<C9K, C9I> eventBus = this.A00.getEventBus();
        io = C0792Lb.A0H;
        eventBus.A03(io);
    }
}