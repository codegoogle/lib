package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1257bO implements JT {
    public WeakReference<C1267bZ> A00;

    public C1257bO(C1267bZ c1267bZ) {
        this.A00 = new WeakReference<>(c1267bZ);
    }

    @Override // com.facebook.ads.redexgen.X.JT
    public final void AAP(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1U(z, false);
        }
    }
}