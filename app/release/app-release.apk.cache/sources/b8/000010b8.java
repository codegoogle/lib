package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ey  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0642Ey extends RY {
    public final /* synthetic */ C0641Ex A00;
    public final /* synthetic */ RM A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0642Ey(C0641Ex c0641Ex, boolean z, RM rm) {
        super(z);
        this.A00 = c0641Ex;
        this.A01 = rm;
    }

    @Override // com.facebook.ads.redexgen.X.RY
    public final void A00() {
        AnonymousClass12 anonymousClass12;
        anonymousClass12 = this.A00.A01;
        anonymousClass12.AAs(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.RY
    public final void A01(boolean z) {
        AtomicBoolean atomicBoolean;
        AnonymousClass12 anonymousClass12;
        atomicBoolean = this.A00.A0B;
        atomicBoolean.set(true);
        anonymousClass12 = this.A00.A01;
        anonymousClass12.AAp(this.A01);
    }
}