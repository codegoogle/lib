package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class AT extends AbstractC1198aP {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final HH A0A;
    public final I4 A0B;

    public AT(TrackGroup trackGroup, int[] iArr, HH hh, long j, long j2, long j3, float f, float f2, long j4, I4 i4) {
        super(trackGroup, iArr);
        this.A0A = hh;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = i4;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A00(long j) {
        long A5S = ((float) this.A0A.A5S()) * this.A04;
        int i = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (j > Long.MIN_VALUE ? 1 : (j == Long.MIN_VALUE ? 0 : -1));
            if (i3 == 0 || !A02(i2, j)) {
                int i4 = A6J(i2).A04;
                if (Math.round(i4 * this.A00) <= A5S) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1198aP, com.facebook.ads.redexgen.X.H8
    public final void A4s() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.H8
    public final int A6u() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1198aP, com.facebook.ads.redexgen.X.H8
    public final void AAU(float f) {
        this.A00 = f;
    }
}