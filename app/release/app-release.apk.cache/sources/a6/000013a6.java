package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class RH implements InterfaceC03131g {
    public final /* synthetic */ C0641Ex A00;
    public final /* synthetic */ RM A01;

    public RH(C0641Ex c0641Ex, RM rm) {
        this.A00 = c0641Ex;
        this.A01 = rm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03131g
    public final void AAR(AdError adError) {
        AnonymousClass12 anonymousClass12;
        anonymousClass12 = this.A00.A01;
        anonymousClass12.AAs(this.A01, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03131g
    public final void AAS() {
        AtomicBoolean atomicBoolean;
        AnonymousClass12 anonymousClass12;
        atomicBoolean = this.A00.A0B;
        atomicBoolean.set(true);
        anonymousClass12 = this.A00.A01;
        anonymousClass12.AAp(this.A01);
    }
}