package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.Collections;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class Z1 implements DQ {
    public static byte[] A0E;
    public static String[] A0F;
    public long A00;
    public long A01;
    public CW A02;
    public DV A03;
    public String A04;
    public boolean A05;
    public final DZ A0B;
    public final boolean[] A0D = new boolean[3];
    public final DW A0A = new DW(32, 128);
    public final DW A08 = new DW(33, 128);
    public final DW A06 = new DW(34, 128);
    public final DW A07 = new DW(39, 128);
    public final DW A09 = new DW(40, 128);
    public final IQ A0C = new IQ();

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, 15, 7, -4, -6, Flags.CD, -4, -5, -73, -8, 10, 7, -4, -6, Flags.CD, -10, 9, -8, Flags.CD, 0, 6, -10, 0, -5, -6, -73, 13, -8, 3, 12, -4, -47, -73, 49, 36, 31, 32, bx.W5, -22, 35, 32, 49, 30};
    }

    public static void A03() {
        A0F = new String[]{"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    }

    public Z1(DZ dz) {
        this.A0B = dz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e1, code lost:
        if (r6 == 255) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e3, code lost:
        r1 = r3.A06(16);
        r0 = r3.A06(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ed, code lost:
        if (r1 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ef, code lost:
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f1, code lost:
        r4 = r1 / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0214, code lost:
        if (r6 == 255) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x021a, code lost:
        if (r6 >= com.facebook.ads.redexgen.X.IM.A04.length) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x021c, code lost:
        r4 = com.facebook.ads.redexgen.X.IM.A04[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0221, code lost:
        android.util.Log.w(A01(0, 10, 32), A01(10, 35, 64) + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0252, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Format A00(String str, DW dw, DW dw2, DW dw3) {
        byte[] bArr = new byte[dw.A00 + dw2.A00 + dw3.A00];
        System.arraycopy(dw.A01, 0, bArr, 0, dw.A00);
        System.arraycopy(dw2.A01, 0, bArr, dw.A00, dw2.A00);
        System.arraycopy(dw3.A01, 0, bArr, dw.A00 + dw2.A00, dw3.A00);
        IR ir = new IR(dw2.A01, 0, dw2.A00);
        ir.A08(44);
        int A06 = ir.A06(3);
        ir.A07();
        ir.A08(88);
        ir.A08(8);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < A06) {
                boolean A0B = ir.A0B();
                int toSkip = A0F[1].charAt(1);
                if (toSkip == 68) {
                    break;
                }
                String[] strArr = A0F;
                strArr[0] = "O";
                strArr[3] = "1nR";
                if (A0B) {
                    i += 89;
                }
                if (ir.A0B()) {
                    i += 8;
                }
                i2++;
            } else {
                ir.A08(i);
                if (A06 > 0) {
                    ir.A08((8 - A06) * 2);
                }
                ir.A05();
                int A05 = ir.A05();
                if (A05 == 3) {
                    ir.A07();
                }
                int A052 = ir.A05();
                int A053 = ir.A05();
                if (ir.A0B()) {
                    int A054 = ir.A05();
                    int A055 = ir.A05();
                    int A056 = ir.A05();
                    int confWinBottomOffset = ir.A05();
                    int confWinRightOffset = (A05 == 1 || A05 == 2) ? 2 : 1;
                    int confWinLeftOffset = A05 == 1 ? 2 : 1;
                    A052 -= (A054 + A055) * confWinRightOffset;
                    int i3 = (A056 + confWinBottomOffset) * confWinLeftOffset;
                    String[] strArr2 = A0F;
                    String str2 = strArr2[0];
                    String str3 = strArr2[3];
                    int confWinLeftOffset2 = str2.length();
                    int subWidthC = str3.length();
                    if (confWinLeftOffset2 == subWidthC) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0F;
                    strArr3[0] = "C";
                    strArr3[3] = "Xyf";
                    A053 -= i3;
                }
                ir.A05();
                ir.A05();
                int A057 = ir.A05();
                for (int i4 = ir.A0B() ? 0 : A06; i4 <= A06; i4++) {
                    ir.A05();
                    ir.A05();
                    ir.A05();
                }
                ir.A05();
                ir.A05();
                ir.A05();
                ir.A05();
                ir.A05();
                String[] strArr4 = A0F;
                if (strArr4[0].length() != strArr4[3].length()) {
                    String[] strArr5 = A0F;
                    strArr5[0] = "L";
                    strArr5[3] = "SFB";
                    ir.A05();
                    if (ir.A0B() && ir.A0B()) {
                        A06(ir);
                    }
                    ir.A08(2);
                    if (ir.A0B()) {
                        ir.A08(8);
                        ir.A05();
                        ir.A05();
                        ir.A07();
                    }
                    A07(ir);
                    if (ir.A0B()) {
                        int ltRefPicPocLsbSpsLength = 0;
                        while (true) {
                            int A058 = ir.A05();
                            if (A0F[1].charAt(1) == 'D') {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0F;
                            strArr6[1] = "Ru3iiMNyUlnrUsoUUCHNe7f8PEwOWEdx";
                            strArr6[1] = "Ru3iiMNyUlnrUsoUUCHNe7f8PEwOWEdx";
                            if (ltRefPicPocLsbSpsLength >= A058) {
                                break;
                            }
                            int i5 = A057 + 4;
                            ir.A08(i5 + 1);
                            ltRefPicPocLsbSpsLength++;
                        }
                    }
                    ir.A08(2);
                    float f = 1.0f;
                    if (ir.A0B()) {
                        boolean A0B2 = ir.A0B();
                        if (A0F[6].charAt(30) == 'l') {
                            throw new RuntimeException();
                        }
                        String[] strArr7 = A0F;
                        strArr7[2] = "kAVLrXtqzQqcb3N";
                        strArr7[2] = "kAVLrXtqzQqcb3N";
                        if (A0B2) {
                            int picWidthInLumaSamples = ir.A06(8);
                            if (A0F[1].charAt(1) != 'D') {
                                String[] strArr8 = A0F;
                                strArr8[7] = "Q0asNNixqeMDgfrXMA3vs7CCA";
                                strArr8[7] = "Q0asNNixqeMDgfrXMA3vs7CCA";
                            }
                        }
                    }
                    return Format.A03(str, A01(45, 10, 100), null, -1, -1, A052, A053, -1.0f, Collections.singletonList(bArr), -1, f, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r3.A04() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
        r5.A02.A5A(A00(r5.A04, r5.A0A, r5.A08, r5.A06));
        r2 = com.facebook.ads.redexgen.X.Z1.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
        if (r2[5].length() == r2[4].length()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
        if (r3.A04() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ec, code lost:
        r2 = com.facebook.ads.redexgen.X.Z1.A0F;
        r2[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
        r2[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
        r5.A05 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A03(j, i);
        } else {
            this.A0A.A05(i2);
            this.A08.A05(i2);
            this.A06.A05(i2);
            if (this.A0A.A04() && this.A08.A04()) {
                DW dw = this.A06;
                String[] strArr = A0F;
                if (strArr[5].length() == strArr[4].length()) {
                    String[] strArr2 = A0F;
                    strArr2[6] = "5brHzm0RAmJK5ZmRzslUlW25gn0hU7nI";
                    strArr2[6] = "5brHzm0RAmJK5ZmRzslUlW25gn0hU7nI";
                }
            }
        }
        if (this.A07.A05(i2)) {
            this.A0C.A0c(this.A07.A01, IM.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0a(5);
            this.A0B.A02(j2, this.A0C);
        }
        DW dw2 = this.A09;
        if (A0F[1].charAt(1) != 'D') {
            String[] strArr3 = A0F;
            strArr3[6] = "rXihwUdCpNaITwqC54bRxWTmSWKYNVR8";
            strArr3[6] = "rXihwUdCpNaITwqC54bRxWTmSWKYNVR8";
            if (dw2.A05(i2)) {
                this.A0C.A0c(this.A09.A01, IM.A02(this.A09.A01, this.A09.A00));
                this.A0C.A0a(5);
                this.A0B.A02(j2, this.A0C);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A05(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A04(j, i, i2, j2);
        } else {
            this.A0A.A02(i2);
            this.A08.A02(i2);
            this.A06.A02(i2);
        }
        this.A07.A02(i2);
        this.A09.A02(i2);
    }

    public static void A06(IR ir) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!ir.A0B()) {
                    ir.A05();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        ir.A04();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        ir.A04();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    public static void A07(IR ir) {
        int A05 = ir.A05();
        boolean z = false;
        int stRpsIdx = 0;
        for (int numNegativePics = 0; numNegativePics < A05; numNegativePics++) {
            if (numNegativePics != 0) {
                z = ir.A0B();
            }
            if (z) {
                ir.A07();
                ir.A05();
                for (int i = 0; i <= stRpsIdx; i++) {
                    if (ir.A0B()) {
                        ir.A07();
                    }
                }
            } else {
                int numPositivePics = ir.A05();
                int A052 = ir.A05();
                stRpsIdx = numPositivePics + A052;
                for (int i2 = 0; i2 < numPositivePics; i2++) {
                    ir.A05();
                    ir.A07();
                }
                for (int i3 = 0; i3 < A052; i3++) {
                    ir.A05();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    strArr[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    ir.A07();
                }
                continue;
            }
        }
    }

    private void A08(byte[] bArr, int i, int i2) {
        if (this.A05) {
            this.A03.A05(bArr, i, i2);
        } else {
            this.A0A.A03(bArr, i, i2);
            this.A08.A03(bArr, i, i2);
            this.A06.A03(bArr, i, i2);
        }
        this.A07.A03(bArr, i, i2);
        this.A09.A03(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A48(IQ iq) {
        while (iq.A05() > 0) {
            int A07 = iq.A07();
            int A08 = iq.A08();
            byte[] bArr = iq.A00;
            this.A01 += iq.A05();
            this.A02.ACe(iq, iq.A05());
            while (A07 < A08) {
                int A04 = IM.A04(bArr, A07, A08, this.A0D);
                if (A04 == A08) {
                    A08(bArr, A07, A08);
                    return;
                }
                int A00 = IM.A00(bArr, A04);
                int nalUnitType = A04 - A07;
                if (nalUnitType > 0) {
                    A08(bArr, A07, A04);
                }
                int lengthToNalUnit = A08 - A04;
                long j = this.A01 - lengthToNalUnit;
                A04(j, lengthToNalUnit, nalUnitType < 0 ? -nalUnitType : 0, this.A00);
                long absolutePosition = this.A00;
                A05(j, lengthToNalUnit, A00, absolutePosition);
                A07 = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A4U(CM cm, C0600De c0600De) {
        c0600De.A06();
        this.A04 = c0600De.A05();
        this.A02 = cm.ADY(c0600De.A04(), 2);
        this.A03 = new DV(this.A02);
        this.A0B.A03(cm, c0600De);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABV() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABW(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ACi() {
        IM.A0C(this.A0D);
        this.A0A.A01();
        this.A08.A01();
        this.A06.A01();
        this.A07.A01();
        this.A09.A01();
        this.A03.A02();
        this.A01 = 0L;
    }
}