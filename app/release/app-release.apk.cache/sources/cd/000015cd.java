package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1190aH implements GG {
    public final long[] A00;
    public final GF[] A01;

    public C1190aH(GF[] gfArr, long[] jArr) {
        this.A01 = gfArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final List<GF> A5p(long j) {
        int A0B = C0726Ig.A0B(this.A00, j, true, false);
        if (A0B != -1) {
            GF[] gfArr = this.A01;
            if (gfArr[A0B] != null) {
                return Collections.singletonList(gfArr[A0B]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final long A6E(int i) {
        boolean z = true;
        I1.A03(i >= 0);
        if (i >= this.A00.length) {
            z = false;
        }
        I1.A03(z);
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6F() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6Y(long j) {
        int A0A = C0726Ig.A0A(this.A00, j, false, false);
        if (A0A < this.A00.length) {
            return A0A;
        }
        return -1;
    }
}