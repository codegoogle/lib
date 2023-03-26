package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.nio.charset.Charset;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class IQ {
    public static byte[] A03;
    public static String[] A04;
    public byte[] A00;
    public int A01;
    public int A02;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-33, 4, 12, -9, 2, -1, -6, -74, -21, -22, -36, -61, -50, -74, 9, -5, 7, Flags.CD, -5, 4, -7, -5, -74, -7, 5, 4, 10, -1, 4, Flags.CD, -9, 10, -1, 5, 4, -74, -8, 15, 10, -5, -48, -74, -67, -30, -22, -43, -32, -35, -40, -108, -55, -56, -70, -95, -84, -108, -25, bx.l7, -27, -23, bx.l7, -30, -41, bx.l7, -108, -38, -35, -26, -25, -24, -108, -42, -19, -24, bx.l7, -82, -108, -113, -86, -85, 91, -99, -92, -81, 91, -87, -86, -81, 91, -75, -96, -83, -86, 117, 91, -49, -50, -64, -89, -78};
    }

    public static void A02() {
        A04 = new String[]{"HJCnnsvFRKCxDDAbEWuhDIcdg3xeT1pm", "aXWy8CvsRXCMVcJtmBA1wVRdgUuSFZpH", "GQPvM", "pDI65rPXKWggiakX8tUTXOsWDv9apWvH", "LM6A01RjpialbK5Oi", "vEfQavrNrAXrkYYeEOthMrPonFtv4Upj", "EEXi7u9hiAizt85cGACEO5SSNblzx1I5", "5Jpn3XfqvoPj"};
    }

    public IQ() {
    }

    public IQ(int i) {
        this.A00 = new byte[i];
        this.A01 = i;
    }

    public IQ(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public IQ(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
    }

    public final char A03() {
        byte[] bArr = this.A00;
        int i = this.A02;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public final double A04() {
        return Double.longBitsToDouble(A0M());
    }

    public final int A05() {
        return this.A01 - this.A02;
    }

    public final int A06() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int A07() {
        return this.A02;
    }

    public final int A08() {
        return this.A01;
    }

    public final int A09() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 16);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 8);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return (bArr[i7] & 255) | i6;
    }

    public final int A0A() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0B() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = i4 | ((bArr[i5] & 255) << 16);
        int i7 = this.A02;
        this.A02 = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i6;
    }

    public final int A0C() {
        int A0B = A0B();
        if (A0B >= 0) {
            return A0B;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0B);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = bArr[i] & 255;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i2;
    }

    public final int A0E() {
        int b2 = A0F();
        int b3 = A0F();
        int b4 = A0F();
        int b22 = (b2 << 21) | (b3 << 14);
        int b32 = b4 << 7;
        return b22 | b32 | A0F();
    }

    public final int A0F() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        return bArr[i] & 255;
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = (bArr[i3] & 255) | i2;
        this.A02 += 2;
        return i4;
    }

    public final int A0H() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = i2 | ((bArr[i3] & 255) << 8);
        int i5 = this.A02;
        this.A02 = i5 + 1;
        return (bArr[i5] & 255) | i4;
    }

    public final int A0I() {
        int A09 = A09();
        if (A09 >= 0) {
            return A09;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A09);
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    public final long A0K() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((255 & bArr[i8]) << 56);
    }

    public final long A0L() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((255 & bArr[i4]) << 24);
    }

    public final long A0M() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        int i5 = this.A02;
        this.A02 = i5 + 1;
        int i6 = this.A02;
        this.A02 = i6 + 1;
        int i7 = this.A02;
        this.A02 = i7 + 1;
        int i8 = this.A02;
        this.A02 = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (255 & bArr[i8]);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = this.A02;
        this.A02 = i2 + 1;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        int i4 = this.A02;
        this.A02 = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (255 & bArr[i4]);
    }

    public final long A0O() {
        long A0M = A0M();
        if (A0M >= 0) {
            return A0M;
        }
        throw new IllegalStateException(A00(77, 18, 35) + A0M);
    }

    public final long A0P() {
        int i = 0;
        long j = this.A00[this.A02];
        int i2 = 7;
        while (true) {
            if (i2 < 0) {
                break;
            }
            int j2 = 1 << i2;
            int i3 = ((j2 & j) > 0L ? 1 : ((j2 & j) == 0L ? 0 : -1));
            if (A04[3].charAt(7) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "lhGNf9ZIwuKG";
            strArr[7] = "lhGNf9ZIwuKG";
            if (i3 != 0) {
                i2--;
            } else if (i2 < 6) {
                int j3 = 1 << i2;
                j &= j3 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            int i4 = 1;
            while (i4 < i) {
                byte[] bArr = this.A00;
                int i5 = this.A02;
                byte b = bArr[i5 + i4];
                if ((b & 192) == 128) {
                    long j4 = j << 6;
                    String[] strArr2 = A04;
                    String str = strArr2[5];
                    String str2 = strArr2[6];
                    int charAt = str.charAt(9);
                    int i6 = str2.charAt(9);
                    if (charAt != i6) {
                        String[] strArr3 = A04;
                        strArr3[7] = "BvJ8XuqLfWkj";
                        strArr3[7] = "BvJ8XuqLfWkj";
                        int i7 = b & ax5.a;
                        j = j4 | i7;
                        i4 += 0;
                    } else {
                        String[] strArr4 = A04;
                        strArr4[7] = "bl64THqm1YbP";
                        strArr4[7] = "bl64THqm1YbP";
                        int i8 = b & ax5.a;
                        j = j4 | i8;
                        i4++;
                    }
                } else {
                    throw new NumberFormatException(A00(0, 42, 126) + j);
                }
            }
            int i9 = this.A02;
            this.A02 = i9 + i;
            return j;
        }
        throw new NumberFormatException(A00(42, 35, 92) + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r6.A02 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (r6.A02 == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String A0Q() {
        if (A05() == 0) {
            if (A04[3].charAt(7) != 'H') {
                String[] strArr = A04;
                strArr[5] = "Lp13SRVWSAlchtHB237WPpHnlSgF4gaJ";
                strArr[6] = "rKST0dS6uAv5sauBNsTeIX1rNmAgPgcE";
                return null;
            }
            throw new RuntimeException();
        }
        int i = this.A02;
        while (i < this.A01 && !C0726Ig.A0e(this.A00[i])) {
            i++;
        }
        int i2 = this.A02;
        if (i - i2 >= 3) {
            byte[] bArr = this.A00;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.A02 = i2 + 3;
            }
        }
        byte[] bArr2 = this.A00;
        int i3 = this.A02;
        String A0R = C0726Ig.A0R(bArr2, i3, i - i3);
        this.A02 = i;
        int i4 = this.A02;
        int i5 = this.A01;
        if (i4 == i5) {
            return A0R;
        }
        if (this.A00[i4] == 13) {
            this.A02 = i4 + 1;
            String line = A04[2];
            if (line.length() != 5) {
                String[] strArr2 = A04;
                strArr2[1] = "7WLwSFEg60VT5h1w5xCSRnUKgnyD8yNS";
                strArr2[0] = "aRAvn4znRhpfiIQyr1UPz3MngzOxDO2U";
            } else {
                String[] strArr3 = A04;
                strArr3[3] = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB";
                strArr3[3] = "q7voCOqIwzwrpNWuoMFHLwpJUMmmskbB";
            }
        }
        byte[] bArr3 = this.A00;
        int i6 = this.A02;
        if (bArr3[i6] == 10) {
            this.A02 = i6 + 1;
        }
        return A0R;
    }

    public final String A0R() {
        if (A05() == 0) {
            return null;
        }
        int i = this.A02;
        while (i < this.A01 && this.A00[i] != 0) {
            i++;
        }
        byte[] bArr = this.A00;
        int i2 = this.A02;
        String A0R = C0726Ig.A0R(bArr, i2, i - i2);
        this.A02 = i;
        int i3 = this.A02;
        if (i3 < this.A01) {
            this.A02 = i3 + 1;
        }
        return A0R;
    }

    public final String A0S(int lastIndex) {
        if (lastIndex == 0) {
            return A00(0, 0, 47);
        }
        int i = lastIndex;
        int i2 = (this.A02 + lastIndex) - 1;
        if (i2 < this.A01 && this.A00[i2] == 0) {
            i--;
        }
        String A0R = C0726Ig.A0R(this.A00, this.A02, i);
        this.A02 += lastIndex;
        return A0R;
    }

    public final String A0T(int i) {
        return A0U(i, Charset.forName(A00(95, 5, 98)));
    }

    public final String A0U(int i, Charset charset) {
        String str = new String(this.A00, this.A02, i, charset);
        this.A02 += i;
        return str;
    }

    public final short A0V() {
        byte[] bArr = this.A00;
        int i = this.A02;
        this.A02 = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.A02;
        this.A02 = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    public final void A0W() {
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0X(int i) {
        A0c(A06() < i ? new byte[i] : this.A00, i);
    }

    public final void A0Y(int i) {
        I1.A03(i >= 0 && i <= this.A00.length);
        this.A01 = i;
    }

    public final void A0Z(int i) {
        I1.A03(i >= 0 && i <= this.A01);
        this.A02 = i;
    }

    public final void A0a(int i) {
        A0Z(this.A02 + i);
    }

    public final void A0b(IP ip, int i) {
        A0d(ip.A00, 0, i);
        ip.A08(0);
    }

    public final void A0c(byte[] bArr, int i) {
        this.A00 = bArr;
        this.A01 = i;
        this.A02 = 0;
    }

    public final void A0d(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A00, this.A02, bArr, i, i2);
        this.A02 += i2;
    }
}