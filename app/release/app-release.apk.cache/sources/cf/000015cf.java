package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.aJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1192aJ implements GG {
    public final C0671Gd A00;
    public final Map<String, C0677Gj> A01;
    public final Map<String, C0672Ge> A02;
    public final long[] A03;

    public C1192aJ(C0671Gd c0671Gd, Map<String, C0677Gj> map, Map<String, C0672Ge> map2) {
        Map<String, C0677Gj> emptyMap;
        this.A00 = c0671Gd;
        this.A02 = map2;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.A01 = emptyMap;
        this.A03 = c0671Gd.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final List<GF> A5p(long j) {
        return this.A00.A0E(j, this.A01, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final long A6E(int i) {
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6F() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GG
    public final int A6Y(long j) {
        int A0A = C0726Ig.A0A(this.A03, j, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}