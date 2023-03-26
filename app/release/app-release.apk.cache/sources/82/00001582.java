package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Z0 implements DQ {
    public static byte[] A0E;
    public static String[] A0F;
    public long A00;
    public long A01;
    public CW A02;
    public DU A03;
    public String A04;
    public boolean A05;
    public final DZ A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final DW A08 = new DW(7, 128);
    public final DW A06 = new DW(8, 128);
    public final DW A07 = new DW(6, 128);
    public final IQ A0A = new IQ();

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    public static void A02() {
        A0F = new String[]{"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    }

    public Z0(DZ dz, boolean z, boolean z2) {
        this.A09 = dz;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x017a, code lost:
        if (r4.A04() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x017c, code lost:
        r24.A03.A05(com.facebook.ads.redexgen.X.IM.A05(r24.A06.A01, 3, r24.A06.A00));
        r24.A06.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01a4, code lost:
        if (r4.A04() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A03(long j, int i, int i2, long j2) {
        if (!this.A05 || this.A03.A08()) {
            this.A08.A05(i2);
            DW dw = this.A06;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "yEUIS2SJoSKiyXNZ5S9V3xqSna0x8qYs";
            strArr2[3] = "yEUIS2SJoSKiyXNZ5S9V3xqSna0x8qYs";
            dw.A05(i2);
            if (!this.A05) {
                if (this.A08.A04() && this.A06.A04()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.A08.A01, this.A08.A00));
                    arrayList.add(Arrays.copyOf(this.A06.A01, this.A06.A00));
                    IL A06 = IM.A06(this.A08.A01, 3, this.A08.A00);
                    IK A05 = IM.A05(this.A06.A01, 3, this.A06.A00);
                    this.A02.A5A(Format.A03(this.A04, A00(0, 9, 103), null, -1, -1, A06.A06, A06.A02, -1.0f, arrayList, -1, A06.A00, null));
                    this.A05 = true;
                    this.A03.A06(A06);
                    this.A03.A05(A05);
                    this.A08.A01();
                    this.A06.A01();
                }
            } else if (this.A08.A04()) {
                this.A03.A06(IM.A06(this.A08.A01, 3, this.A08.A00));
                this.A08.A01();
            } else {
                DW dw2 = this.A06;
                String[] strArr3 = A0F;
                if (strArr3[7].length() != strArr3[6].length()) {
                    String[] strArr4 = A0F;
                    strArr4[7] = "4gS5xwJzfuuPxe9g1";
                    strArr4[6] = "PKV4Z";
                } else {
                    String[] strArr5 = A0F;
                    strArr5[7] = "kGyV9pF87NOcG7T4L";
                    strArr5[6] = "bhPwg";
                }
            }
        }
        if (this.A07.A05(i2)) {
            int A02 = IM.A02(this.A07.A01, this.A07.A00);
            IQ iq = this.A0A;
            String[] strArr6 = A0F;
            if (strArr6[4].charAt(8) != strArr6[2].charAt(8)) {
                iq.A0c(this.A07.A01, A02);
                this.A0A.A0Z(4);
                this.A09.A02(j2, this.A0A);
            } else {
                String[] strArr7 = A0F;
                strArr7[4] = "yBxIEmyTXmgFp9YnTDwoZpE0n0h2mQL3";
                strArr7[2] = "tg7t9oBRXzMr4c01fdI6E0npLzJKU9lY";
                iq.A0c(this.A07.A01, A02);
                this.A0A.A0Z(4);
                this.A09.A02(j2, this.A0A);
            }
        }
        this.A03.A03(j, i);
    }

    private void A04(long j, int i, long j2) {
        if (!this.A05 || this.A03.A08()) {
            this.A08.A02(i);
            this.A06.A02(i);
        }
        this.A07.A02(i);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A04(j, i, j2);
    }

    private void A05(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A08()) {
            this.A08.A03(bArr, i, i2);
            this.A06.A03(bArr, i, i2);
        }
        this.A07.A03(bArr, i, i2);
        this.A03.A07(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A48(IQ iq) {
        int A07 = iq.A07();
        int A08 = iq.A08();
        byte[] bArr = iq.A00;
        this.A01 += iq.A05();
        this.A02.ACe(iq, iq.A05());
        while (true) {
            int A04 = IM.A04(bArr, A07, A08, this.A0D);
            if (A04 == A08) {
                A05(bArr, A07, A08);
                return;
            }
            int A01 = IM.A01(bArr, A04);
            int nalUnitOffset = A04 - A07;
            if (nalUnitOffset > 0) {
                A05(bArr, A07, A04);
            }
            int i = A08 - A04;
            long j = this.A01 - i;
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A03(j, i, offset, this.A00);
            A04(j, A01, this.A00);
            A07 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A4U(CM cm, C0600De c0600De) {
        c0600De.A06();
        this.A04 = c0600De.A05();
        this.A02 = cm.ADY(c0600De.A04(), 2);
        this.A03 = new DU(this.A02, this.A0B, this.A0C);
        this.A09.A03(cm, c0600De);
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
        this.A08.A01();
        this.A06.A01();
        this.A07.A01();
        this.A03.A02();
        this.A01 = 0L;
    }
}