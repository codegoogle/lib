package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.Cx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0593Cx {
    public static String[] A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0587Cr A04;
    public D6 A05;
    public final CW A06;
    public final D8 A07 = new D8();
    public final IQ A09 = new IQ(1);
    public final IQ A08 = new IQ();

    static {
        A02();
    }

    public static void A02() {
        A0A = new String[]{"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    }

    public C0593Cx(CW cw) {
        this.A06 = cw;
    }

    private D7 A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            D8 d8 = this.A07;
            String[] strArr = A0A;
            if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
            strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
            return d8.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        IQ iq = this.A07.A09;
        D7 A00 = A00();
        if (A00.A00 != 0) {
            iq.A0a(A00.A00);
        }
        if (this.A07.A0H[this.A01]) {
            iq.A0a(iq.A0J() * 6);
        }
    }

    public final int A04() {
        IQ iq;
        int length;
        if (this.A07.A0A) {
            D7 A00 = A00();
            if (A00.A00 != 0) {
                iq = this.A07.A09;
                length = A00.A00;
            } else {
                byte[] bArr = A00.A04;
                String[] strArr = A0A;
                if (strArr[3].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
                strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
                this.A08.A0c(bArr, bArr.length);
                iq = this.A08;
                length = bArr.length;
            }
            boolean[] zArr = this.A07.A0H;
            int vectorSize = this.A01;
            boolean z = zArr[vectorSize];
            byte[] bArr2 = this.A09.A00;
            int vectorSize2 = z ? 128 : 0;
            bArr2[0] = (byte) (vectorSize2 | length);
            this.A09.A0Z(0);
            this.A06.ACe(this.A09, 1);
            this.A06.ACe(iq, length);
            if (!z) {
                int vectorSize3 = length + 1;
                return vectorSize3;
            }
            IQ iq2 = this.A07.A09;
            int A0J = iq2.A0J();
            iq2.A0a(-2);
            int subsampleCount = A0J * 6;
            int i = subsampleCount + 2;
            this.A06.ACe(iq2, i);
            int subsampleDataLength = length + 1;
            return subsampleDataLength + i;
        }
        return 0;
    }

    public final void A05() {
        this.A07.A02();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j) {
        long A01 = C05269y.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A01(i) < A01; i++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        D7 A00 = this.A05.A00(this.A07.A07.A02);
        this.A06.A5A(this.A05.A07.A0J(drmInitData.A03(A00 != null ? A00.A02 : null)));
    }

    public final void A08(D6 d6, C0587Cr c0587Cr) {
        this.A05 = (D6) I1.A01(d6);
        this.A04 = (C0587Cr) I1.A01(c0587Cr);
        this.A06.A5A(d6.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        int i = this.A00;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i == iArr[i2]) {
            this.A02 = i2 + 1;
            String[] strArr = A0A;
            if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[6] = "24SILmm";
            strArr2[6] = "24SILmm";
            this.A00 = 0;
            return false;
        }
        return true;
    }
}