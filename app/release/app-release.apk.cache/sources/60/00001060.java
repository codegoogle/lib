package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DU {
    public static String[] A0I;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final CW A0E;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<IL> A0D = new SparseArray<>();
    public final SparseArray<IK> A0C = new SparseArray<>();
    public DT A06 = new DT();
    public DT A07 = new DT();
    public byte[] A0B = new byte[128];
    public final IR A0F = new IR(this.A0B, 0, 0);

    static {
        A00();
    }

    public static void A00() {
        A0I = new String[]{"4oBn500ONSa7zUcj69ZejwliI7fNkQe9", "sao3", "S05M", "dUQbnZGK3vs92wXndxl51oc8w6Wzg5UK", "r2dYBwwJ6wCRp20YpqJDniAkemsUTuNE", "fcxFuh", "wirhT", "AIyirGzN48rHG0XGibSi5d9zNx7vdYO1"};
    }

    public DU(CW cw, boolean z, boolean z2) {
        this.A0E = cw;
        this.A0G = z;
        this.A0H = z2;
        A02();
    }

    private void A01(int i) {
        boolean z = this.A0A;
        this.A0E.ACf(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A02() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03(long j, int i) {
        int i2;
        boolean A01;
        boolean z = false;
        if (this.A01 != 9) {
            if (this.A0H) {
                A01 = this.A07.A01(this.A06);
            }
            boolean z2 = this.A0A;
            i2 = this.A01;
            if (i2 != 5 || (this.A0G && i2 == 1 && this.A07.A06())) {
                z = true;
            }
            this.A0A = z2 | z;
        }
        if (this.A09) {
            A01(i + ((int) (j - this.A02)));
        }
        this.A04 = this.A02;
        this.A05 = this.A03;
        this.A0A = false;
        this.A09 = true;
        boolean z22 = this.A0A;
        i2 = this.A01;
        if (i2 != 5) {
        }
        z = true;
        this.A0A = z22 | z;
    }

    public final void A04(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            int i2 = this.A01;
            if (i2 != 5 && i2 != 1 && i2 != 2) {
                return;
            }
        }
        DT dt = this.A06;
        this.A06 = this.A07;
        this.A07 = dt;
        this.A07.A03();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A05(IK ik) {
        this.A0C.append(ik.A00, ik);
    }

    public final void A06(IL il) {
        this.A0D.append(il.A05, il);
    }

    public final void A07(byte[] bArr, int readLength, int i) {
        if (!this.A08) {
            return;
        }
        int i2 = i - readLength;
        byte[] bArr2 = this.A0B;
        int length = bArr2.length;
        int i3 = this.A00;
        if (length < i3 + i2) {
            this.A0B = Arrays.copyOf(bArr2, (i3 + i2) * 2);
        }
        System.arraycopy(bArr, readLength, this.A0B, this.A00, i2);
        this.A00 += i2;
        this.A0F.A09(this.A0B, 0, this.A00);
        if (!this.A0F.A0C(8)) {
            return;
        }
        this.A0F.A07();
        int deltaPicOrderCnt1 = this.A0F.A06(2);
        this.A0F.A08(5);
        if (!this.A0F.A0A()) {
            return;
        }
        this.A0F.A05();
        if (!this.A0F.A0A()) {
            return;
        }
        int A05 = this.A0F.A05();
        if (!this.A0H) {
            this.A08 = false;
            this.A07.A04(A05);
        } else if (!this.A0F.A0A()) {
        } else {
            int A052 = this.A0F.A05();
            String[] strArr = A0I;
            if (strArr[0].charAt(5) != strArr[3].charAt(5)) {
                String[] strArr2 = A0I;
                strArr2[6] = "2v7XO";
                strArr2[6] = "2v7XO";
                int picParameterSetId = this.A0C.indexOfKey(A052);
                if (picParameterSetId < 0) {
                    this.A08 = false;
                    return;
                }
                IK ppsData = this.A0C.get(A052);
                IL il = this.A0D.get(ppsData.A01);
                if (il.A09) {
                    if (!this.A0F.A0C(2)) {
                        return;
                    }
                    this.A0F.A08(2);
                }
                if (!this.A0F.A0C(il.A01)) {
                    return;
                }
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                int A06 = this.A0F.A06(il.A01);
                boolean bottomFieldFlagPresent = il.A08;
                if (!bottomFieldFlagPresent) {
                    boolean bottomFieldFlagPresent2 = this.A0F.A0C(1);
                    if (!bottomFieldFlagPresent2) {
                        return;
                    }
                    z = this.A0F.A0B();
                    if (z) {
                        boolean bottomFieldFlagPresent3 = this.A0F.A0C(1);
                        if (!bottomFieldFlagPresent3) {
                            return;
                        }
                        z3 = this.A0F.A0B();
                        z2 = true;
                    } else {
                        String[] strArr3 = A0I;
                        if (strArr3[2].length() == strArr3[1].length()) {
                            String[] strArr4 = A0I;
                            strArr4[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                            strArr4[4] = "qwcYbvbtciQlsge07t8jnpQbFFEGYRzL";
                        }
                    }
                }
                boolean z4 = this.A01 == 5;
                int i4 = 0;
                if (z4) {
                    if (!this.A0F.A0A()) {
                        return;
                    }
                    IR ir = this.A0F;
                    if (A0I[5].length() == 32) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A0I;
                    strArr5[0] = "CUn0EGRMZuaxcZmcWt6bm8g2eSLscmSu";
                    strArr5[3] = "AO4oaRrhS9J5INJLsqTeqW6rWo7URvM3";
                    i4 = ir.A05();
                }
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int picOrderCntLsb = il.A04;
                if (picOrderCntLsb == 0) {
                    IR ir2 = this.A0F;
                    int deltaPicOrderCnt12 = il.A03;
                    if (!ir2.A0C(deltaPicOrderCnt12)) {
                        return;
                    }
                    IR ir3 = this.A0F;
                    int i9 = il.A03;
                    int picOrderCntLsb2 = A0I[7].charAt(28);
                    if (picOrderCntLsb2 != 108) {
                        String[] strArr6 = A0I;
                        strArr6[4] = "13MW05H83xonKdXxuFb2nSy24rNhSBqM";
                        strArr6[4] = "13MW05H83xonKdXxuFb2nSy24rNhSBqM";
                        i5 = ir3.A06(i9);
                        if (ppsData.A02 && !z) {
                            if (!this.A0F.A0A()) {
                                return;
                            }
                            i6 = this.A0F.A04();
                        }
                    }
                } else {
                    int picOrderCntLsb3 = il.A04;
                    if (A0I[7].charAt(28) == 'l') {
                        throw new RuntimeException();
                    }
                    String[] strArr7 = A0I;
                    strArr7[7] = "MOrewcskpOrth27AIRJiHCsaXTOPbZzW";
                    strArr7[7] = "MOrewcskpOrth27AIRJiHCsaXTOPbZzW";
                    if (picOrderCntLsb3 == 1 && !il.A07) {
                        if (!this.A0F.A0A()) {
                            return;
                        }
                        i7 = this.A0F.A04();
                        if (ppsData.A02 && !z) {
                            if (!this.A0F.A0A()) {
                                return;
                            }
                            i8 = this.A0F.A04();
                        }
                    }
                }
                this.A07.A05(il, deltaPicOrderCnt1, A05, A06, A052, z, z2, z3, z4, i4, i5, i6, i7, i8);
                this.A08 = false;
                return;
            }
            throw new RuntimeException();
        }
    }

    public final boolean A08() {
        return this.A0H;
    }
}