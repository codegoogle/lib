package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1136Yl implements CK {
    public static byte[] A03;
    public static final CN A04;
    public CM A00;
    public DG A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new C1135Yk();
    }

    public static IQ A00(IQ iq) {
        iq.A0Z(0);
        return iq;
    }

    private boolean A03(CL cl) throws IOException, InterruptedException {
        DC dc = new DC();
        if (dc.A04(cl, true) && (dc.A04 & 2) == 2) {
            int length = Math.min(dc.A00, 8);
            IQ iq = new IQ(length);
            cl.ABZ(iq.A00, 0, length);
            IQ scratch = A00(iq);
            if (C1134Yj.A05(scratch)) {
                this.A01 = new C1134Yj();
            } else {
                IQ scratch2 = A00(iq);
                if (C1139Yo.A07(scratch2)) {
                    this.A01 = new C1139Yo();
                } else {
                    IQ scratch3 = A00(iq);
                    if (!C1137Ym.A05(scratch3)) {
                        return false;
                    }
                    this.A01 = new C1137Ym();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A00 = cm;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(cl)) {
                cl.ACa();
            } else {
                throw new AN(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            CW ADY = this.A00.ADY(0, 1);
            this.A00.A4w();
            this.A01.A07(this.A00, ADY);
            this.A02 = true;
        }
        return this.A01.A03(cl, cr);
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        DG dg = this.A01;
        if (dg != null) {
            dg.A06(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        try {
            return A03(cl);
        } catch (AN unused) {
            return false;
        }
    }
}