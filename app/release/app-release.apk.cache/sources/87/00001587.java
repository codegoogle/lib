package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class Z5 implements InterfaceC0601Df {
    public static byte[] A0C;
    public static String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0722Ic A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final DQ A0A;
    public final IP A0B = new IP(new byte[10]);
    public int A03 = 0;

    static {
        A03();
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-29, 48, 50, 53, 40, -29, 37, 60, 55, 40, 54, -58, -37, -23, -56, -37, -41, -38, -37, -24, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, 2, 3, -16, 1, 3, -81, -14, -2, -13, -12, -81, -1, 1, -12, -11, -8, 7, -55, -81, -20, 5, -4, 15, 7, -4, -6, Flags.CD, -4, -5, -73, 10, Flags.CD, -8, 9, Flags.CD, -73, 0, 5, -5, 0, -6, -8, Flags.CD, 6, 9, -73, 9, -4, -8, -5, 0, 5, -2, -73, -4, 15, Flags.CD, -4, 5, -5, -4, -5, -73, -1, -4, -8, -5, -4, 9, -47, -22, bx.j7, -12, -20, bx.j7, -33, -16, bx.j7, -32, -100, -17, -16, -35, -18, -16, -100, -27, -22, -32, -27, -33, -35, -16, -21, -18, -74, -100, bx.j7, -12, -20, bx.j7, -33, -16, bx.j7, -32, -100};
    }

    public static void A03() {
        A0D = new String[]{"yUSRg3C4669fvLzuOHW1XSLd3PantLKL", "TfD3AbKeF9VAaUscqyzwwU3jFt7tVTiq", "g0WIbq4DK90SLCQEiKu8stzXkqWEOBgJ", "mQ9LzXZ", "LtvBgOfO2pmZDU6uCsowjLyYxKVOoB", "Sd9ouEoM5pzgzW5N1jQmDkMiOeFHRcqL", "5alPEFiVNlXDBdXEKmvVdaMyQKz58nOe", "TNFmsx2lI6S26ML"};
    }

    public Z5(DQ dq) {
        this.A0A = dq;
    }

    private void A01() {
        this.A0B.A08(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A09(4);
            this.A0B.A09(1);
            this.A0B.A09(1);
            long A05 = (this.A0B.A05(3) << 30) | (this.A0B.A05(15) << 15) | this.A0B.A05(15);
            this.A0B.A09(1);
            if (!this.A09 && this.A07) {
                this.A0B.A09(4);
                this.A0B.A09(1);
                this.A0B.A09(1);
                this.A0B.A09(1);
                this.A05.A08((this.A0B.A05(3) << 30) | (this.A0B.A05(15) << 15) | this.A0B.A05(15));
                this.A09 = true;
            }
            long pts = this.A05.A08(A05);
            this.A04 = pts;
        }
    }

    private void A04(int i) {
        this.A03 = i;
        this.A00 = 0;
    }

    private boolean A05() {
        this.A0B.A08(0);
        int A05 = this.A0B.A05(24);
        if (A05 != 1) {
            Log.w(A00(11, 9, 46), A00(20, 30, 71) + A05);
            this.A02 = -1;
            return false;
        }
        this.A0B.A09(8);
        int A052 = this.A0B.A05(16);
        this.A0B.A09(5);
        this.A06 = this.A0B.A0G();
        this.A0B.A09(2);
        this.A08 = this.A0B.A0G();
        this.A07 = this.A0B.A0G();
        this.A0B.A09(6);
        int packetLength = this.A0B.A05(8);
        this.A01 = packetLength;
        if (A052 == 0) {
            this.A02 = -1;
        } else {
            int packetLength2 = A052 + 6;
            int i = packetLength2 - 9;
            int packetLength3 = this.A01;
            int i2 = i - packetLength3;
            String[] strArr = A0D;
            String str = strArr[1];
            String str2 = strArr[5];
            int charAt = str.charAt(17);
            int packetLength4 = str2.charAt(17);
            if (charAt == packetLength4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "TxtnMsOUgyy3Igc1MGFXcQorbec0OOLJ";
            strArr2[5] = "FqrtTSnP7VIKT9cq1hMIyK6Edo6EUePi";
            this.A02 = i2;
        }
        return true;
    }

    private boolean A06(IQ iq, byte[] bArr, int i) {
        int min = Math.min(iq.A05(), i - this.A00);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            iq.A0a(min);
        } else {
            int i2 = this.A00;
            if (A0D[0].charAt(8) != '6') {
                String[] strArr = A0D;
                strArr[6] = "H8KMS8SQgkToBAcEgsGMIMEmcDOAfjD3";
                strArr[2] = "pG8ynHzO3ynvgwiEM6LVA0Wbsu12g974";
                iq.A0d(bArr, i2, min);
            } else {
                String[] strArr2 = A0D;
                strArr2[1] = "SlJVAlpzWDTlfjZlG24yfuiEgxBIsDod";
                strArr2[5] = "YxSVdBM1mtROHF0F5NUzvc6S3n3WzSYI";
                iq.A0d(bArr, i2, min);
            }
        }
        this.A00 += min;
        if (A0D[4].length() != 4) {
            String[] strArr3 = A0D;
            strArr3[1] = "9iVHE5UHbJVR9dQ85oXJ8gpCzJ6PDaiT";
            strArr3[5] = "Vd59evKFs4P6sMun7tv1zskusbuvsqU9";
            return this.A00 == i;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0601Df
    public final void A49(IQ iq, boolean z) throws AN {
        if (z) {
            int i = this.A03;
            if (i != 0 && i != 1) {
                String A00 = A00(11, 9, 46);
                if (i == 2) {
                    Log.w(A00, A00(50, 50, 79));
                } else if (i == 3) {
                    if (this.A02 != -1) {
                        Log.w(A00, A00(100, 37, 52) + this.A02 + A00(0, 11, 123));
                    }
                    this.A0A.ABV();
                }
            }
            A04(1);
        }
        while (iq.A05() > 0) {
            int i2 = this.A03;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (A06(iq, this.A0B.A00, Math.min(10, this.A01)) && A06(iq, null, this.A01)) {
                            A01();
                            this.A0A.ABW(this.A04, this.A06);
                            A04(3);
                        }
                    } else if (i2 != 3) {
                        continue;
                    } else {
                        int A05 = iq.A05();
                        int i3 = this.A02;
                        int i4 = i3 != -1 ? A05 - i3 : 0;
                        if (i4 > 0) {
                            A05 -= i4;
                            iq.A0Y(iq.A07() + A05);
                        }
                        this.A0A.A48(iq);
                        int i5 = this.A02;
                        if (i5 != -1) {
                            this.A02 = i5 - A05;
                            if (this.A02 == 0) {
                                DQ dq = this.A0A;
                                if (A0D[0].charAt(8) != '6') {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0D;
                                strArr[6] = "x0jdU4oJLyfE062EEYlQTVcdLSkaU5Sb";
                                strArr[2] = "VBdeZUL1F1jcYz7E9oLJeT0FLHfAjfLP";
                                dq.ABV();
                                A04(1);
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (A06(iq, this.A0B.A00, 9)) {
                    A04(A05() ? 2 : 0);
                }
            } else {
                iq.A0a(iq.A05());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0601Df
    public final void A7S(C0722Ic c0722Ic, CM cm, C0600De c0600De) {
        this.A05 = c0722Ic;
        this.A0A.A4U(cm, c0600De);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0601Df
    public final void ACi() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.ACi();
    }
}