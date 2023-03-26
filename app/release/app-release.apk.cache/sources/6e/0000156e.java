package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1131Yg implements CT {
    public final /* synthetic */ C1132Yh A00;

    public C1131Yg(C1132Yh c1132Yh) {
        this.A00 = c1132Yh;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        DG dg;
        long j;
        dg = this.A00.A0B;
        j = this.A00.A07;
        return dg.A04(j);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long j) {
        DG dg;
        long j2;
        long A00;
        long j3;
        if (j == 0) {
            j3 = this.A00.A09;
            return new CS(new CU(0L, j3));
        }
        dg = this.A00.A0B;
        long A05 = dg.A05(j);
        C1132Yh c1132Yh = this.A00;
        j2 = c1132Yh.A09;
        A00 = c1132Yh.A00(j2, A05, 30000L);
        return new CS(new CU(j, A00));
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return true;
    }
}