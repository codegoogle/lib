package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1194aL implements GG {
    public final List<GF> A00;

    public C1194aL(List<GF> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final List<GF> A5p(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final long A6E(int i) {
        I1.A03(i == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6F() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6Y(long j) {
        return j < 0 ? 0 : -1;
    }
}