package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Yi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1133Yi implements DD, CT {
    public static String[] A05;
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ C1134Yj A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    }

    public C1133Yi(C1134Yj c1134Yj) {
        this.A04 = c1134Yj;
    }

    public final void A01(long j) {
        this.A00 = j;
    }

    public final void A02(IQ iq) {
        iq.A0a(1);
        int A0H = iq.A0H() / 18;
        this.A02 = new long[A0H];
        this.A03 = new long[A0H];
        for (int i = 0; i < A0H; i++) {
            this.A02[i] = iq.A0M();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i] = iq.A0M();
            iq.A0a(2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final CT A4R() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        ID id;
        id = this.A04.A01;
        return id.A01();
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long j) {
        int A0B = C0726Ig.A0B(this.A02, this.A04.A05(j), true, true);
        long seekTimeUs = this.A04.A04(this.A02[A0B]);
        CU cu = new CU(seekTimeUs, this.A00 + this.A03[A0B]);
        if (seekTimeUs < j) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                long A04 = this.A04.A04(jArr[A0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new CS(cu, new CU(A04, secondSeekTimeUs + this.A03[A0B + 1]));
            }
        }
        return new CS(cu);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final long ABy(CL cl) throws IOException, InterruptedException {
        long j = this.A01;
        if (j >= 0) {
            long j2 = -(j + 2);
            this.A01 = -1L;
            return j2;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final long ADN(long j) {
        long A052 = this.A04.A05(j);
        this.A01 = this.A02[C0726Ig.A0B(this.A02, A052, true, true)];
        return A052;
    }
}