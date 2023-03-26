package com.facebook.ads.redexgen.X;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.bA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1244bA extends AbstractRunnableC0770Kc {
    public final /* synthetic */ C1245bB A00;

    public C1244bA(C1245bB c1245bB) {
        this.A00 = c1245bB;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (!threadPoolExecutor.getQueue().isEmpty()) {
            return;
        }
        threadPoolExecutor2 = this.A00.A0B;
        runnable = this.A00.A0A;
        threadPoolExecutor2.execute(runnable);
    }
}