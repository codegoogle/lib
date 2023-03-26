package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1193aK implements GG {
    public static final C1193aK A01 = new C1193aK();
    public final List<GF> A00;

    public C1193aK() {
        this.A00 = Collections.emptyList();
    }

    public C1193aK(GF gf) {
        this.A00 = Collections.singletonList(gf);
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