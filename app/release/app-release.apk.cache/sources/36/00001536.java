package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1111Xm implements BP {
    public final C1117Xs A00 = new C1117Xs();
    public final C1119Xu A01 = new C1119Xu();
    public final B3[] A02;

    public C1111Xm(B3... b3Arr) {
        this.A02 = (B3[]) Arrays.copyOf(b3Arr, b3Arr.length + 2);
        B3[] b3Arr2 = this.A02;
        b3Arr2[b3Arr.length] = this.A00;
        b3Arr2[b3Arr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final AP A3R(AP ap) {
        this.A00.A0C(ap.A02);
        return new AP(this.A01.A02(ap.A01), this.A01.A01(ap.A00), ap.A02);
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final B3[] A5Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final long A6X(long j) {
        return this.A01.A03(j);
    }

    @Override // com.facebook.ads.redexgen.X.BP
    public final long A6z() {
        return this.A00.A0B();
    }
}