package com.facebook.ads.redexgen.X;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Wg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1079Wg implements PU {
    public final /* synthetic */ C7C A00;

    public C1079Wg(C7C c7c) {
        this.A00 = c7c;
    }

    @Override // com.facebook.ads.redexgen.X.PU
    public final void A9N() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.A00.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.PU
    public final void A9W() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.A00.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}