package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Fb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0645Fb {
    @Nullable
    public C0645Fb A00;
    @Nullable
    public HD A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C0645Fb(long j, int i) {
        this.A04 = j;
        this.A03 = i + j;
    }

    public final int A00(long j) {
        return ((int) (j - this.A04)) + this.A01.A00;
    }

    public final C0645Fb A01() {
        this.A01 = null;
        C0645Fb c0645Fb = this.A00;
        this.A00 = null;
        return c0645Fb;
    }

    public final void A02(HD hd, C0645Fb c0645Fb) {
        this.A01 = hd;
        this.A00 = c0645Fb;
        this.A02 = true;
    }
}