package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YP extends CY {
    public static byte[] A05;
    public static String[] A06;
    public int A00;
    public int A01;
    public boolean A02;
    public final IQ A03;
    public final IQ A04;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    public static void A02() {
        A06 = new String[]{"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    }

    public YP(CW cw) {
        super(cw);
        this.A04 = new IQ(IM.A03);
        this.A03 = new IQ(4);
    }

    @Override // com.facebook.ads.redexgen.X.CY
    public final void A0C(IQ iq, long j) throws AN {
        int A0F = iq.A0F();
        long A0A = j + (iq.A0A() * 1000);
        if (A0F == 0 && !this.A02) {
            IQ videoSequence = new IQ(new byte[iq.A05()]);
            iq.A0d(videoSequence.A00, 0, iq.A05());
            C0728Ii A00 = C0728Ii.A00(videoSequence);
            this.A01 = A00.A02;
            super.A00.A5A(Format.A03(null, A00(28, 9, 114), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0F != 1 || !this.A02) {
        } else {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.A01;
            int i2 = 0;
            while (iq.A05() > 0) {
                iq.A0d(this.A03.A00, i, this.A01);
                this.A03.A0Z(0);
                int A0I = this.A03.A0I();
                this.A04.A0Z(0);
                super.A00.ACe(this.A04, 4);
                super.A00.ACe(iq, A0I);
                i2 = i2 + 4 + A0I;
            }
            CW cw = super.A00;
            int i3 = this.A00 != 1 ? 0 : 1;
            if (A06[6].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
            strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
            cw.ACf(A0A, i3, i2, 0, null);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CY
    public final boolean A0D(IQ iq) throws YO {
        int A0F = iq.A0F();
        int i = (A0F >> 4) & 15;
        int i2 = A0F & 15;
        if (i2 == 7) {
            this.A00 = i;
            return i != 5;
        }
        throw new YO(A00(0, 28, 8) + i2);
    }
}