package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.aO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1197aO implements H7 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final HH A06;
    public final I4 A07;

    public C1197aO(HH hh) {
        this(hh, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, I4.A00);
    }

    public C1197aO(HH hh, int i, int i2, int i3, float f, float f2, long j, I4 i4) {
        this.A06 = hh;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = j;
        this.A07 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.H7
    /* renamed from: A00 */
    public final AT A4T(TrackGroup trackGroup, int... iArr) {
        return new AT(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}