package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Fq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0658Fq implements InterfaceC0907Pn {
    public final /* synthetic */ C0652Fi A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C0658Fq(C0652Fi c0652Fi, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c0652Fi;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0907Pn
    public final void A9C(InterfaceC0905Pl interfaceC0905Pl) {
        C0652Fi.A07(interfaceC0905Pl.A5U(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0907Pn
    public final void A9Y(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}