package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class CH implements YV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public CH(long j, long j2, CQ cq) {
        this.A04 = j2;
        this.A01 = cq.A02;
        this.A00 = cq.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j - j2;
        this.A03 = A76(j);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long positionOffset) {
        long j = this.A02;
        if (j == -1) {
            return new CS(new CU(0L, this.A04));
        }
        int i = this.A01;
        long A0E = C0726Ig.A0E((((this.A00 * positionOffset) / 8000000) / i) * i, 0L, j - i);
        long j2 = this.A04 + A0E;
        long A76 = A76(j2);
        CU seekPoint = new CU(A76, j2);
        if (A76 < positionOffset) {
            long j3 = this.A02;
            int i2 = this.A01;
            if (A0E != j3 - i2) {
                long secondSeekTimeUs = i2 + j2;
                return new CS(seekPoint, new CU(A76(secondSeekTimeUs), secondSeekTimeUs));
            }
        }
        return new CS(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.YV
    public final long A76(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return this.A02 != -1;
    }
}