package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class YH implements CT {
    public final long A00;
    public final CS A01;

    public YH(long j) {
        this(j, 0L);
    }

    public YH(long j, long j2) {
        this.A00 = j;
        this.A01 = new CS(j2 == 0 ? CU.A04 : new CU(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return false;
    }
}