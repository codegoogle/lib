package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.p7700g.p99005.g15;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.Zv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1168Zv implements CW {
    public static String[] A0F;
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C0645Fb A04;
    public C0645Fb A05;
    public C0645Fb A06;
    public InterfaceC0646Fc A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final HE A0D;
    public final C0644Fa A0C = new C0644Fa();
    public final FZ A0B = new FZ();
    public final IQ A0E = new IQ(32);

    static {
        A02();
    }

    public static void A02() {
        A0F = new String[]{"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    }

    public C1168Zv(HE he) {
        this.A0D = he;
        this.A0A = he.A6P();
        this.A04 = new C0645Fb(0L, this.A0A);
        C0645Fb c0645Fb = this.A04;
        this.A05 = c0645Fb;
        this.A06 = c0645Fb;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3N(), new C0645Fb(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0I(format.A0G + j);
        }
        return format;
    }

    private void A03(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A04(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A05(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            HE he = this.A0D;
            HD hd = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            he.ACE(hd);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A06(long j, ByteBuffer byteBuffer, int i) {
        A04(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.A05.A03 - j));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j), min);
            i -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A07(long j, byte[] bArr, int i) {
        A04(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
        if (r10 < r11) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A08(C1121Xw c1121Xw, FZ fz) {
        int i;
        long j = fz.A01;
        this.A0E.A0X(1);
        A07(j, this.A0E.A00, 1);
        long j2 = j + 1;
        byte b = this.A0E.A00[0];
        int subsampleCount = (b & g15.b) == 0 ? 0 : 1;
        int i2 = b & g15.c;
        if (c1121Xw.A02.A04 == null) {
            C0555Bc c0555Bc = c1121Xw.A02;
            if (A0F[7].charAt(20) == 'U') {
                String[] strArr = A0F;
                strArr[4] = "avxcN779OwCovbtwuSuiJyYUga";
                strArr[4] = "avxcN779OwCovbtwuSuiJyYUga";
                c0555Bc.A04 = new byte[16];
            }
            throw new RuntimeException();
        }
        A07(j2, c1121Xw.A02.A04, i2);
        if (A0F[6].charAt(8) == 'v') {
            String[] strArr2 = A0F;
            strArr2[2] = "XQ5VTIZgU7cNYJl8wSWINHCEMr3M82dZ";
            strArr2[2] = "XQ5VTIZgU7cNYJl8wSWINHCEMr3M82dZ";
            long j3 = j2 + i2;
            if (subsampleCount != 0) {
                this.A0E.A0X(2);
                A07(j3, this.A0E.A00, 2);
                j3 += 2;
                i = this.A0E.A0J();
            } else {
                i = 1;
            }
            int[] iArr = c1121Xw.A02.A06;
            if (iArr != null) {
                int length = iArr.length;
                String[] strArr3 = A0F;
                if (strArr3[3].charAt(10) != strArr3[1].charAt(10)) {
                    String[] strArr4 = A0F;
                    strArr4[0] = "13b4Gtgpoqyqmo3AS7oAoqr";
                    strArr4[5] = "X95RBpGHqlYmay";
                }
            }
            iArr = new int[i];
            int[] iArr2 = c1121Xw.A02.A07;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (subsampleCount != 0) {
                int i3 = i * 6;
                this.A0E.A0X(i3);
                A07(j3, this.A0E.A00, i3);
                j3 += i3;
                this.A0E.A0Z(0);
                for (int i4 = 0; i4 < i; i4++) {
                    int subsampleDataLength = this.A0E.A0J();
                    iArr[i4] = subsampleDataLength;
                    int subsampleDataLength2 = this.A0E.A0I();
                    iArr2[i4] = subsampleDataLength2;
                }
            } else {
                iArr[0] = 0;
                int i5 = fz.A00;
                long offset = fz.A01;
                iArr2[0] = i5 - ((int) (j3 - offset));
            }
            CV cv = fz.A02;
            C0555Bc c0555Bc2 = c1121Xw.A02;
            byte[] bArr = cv.A03;
            byte[] bArr2 = c1121Xw.A02.A04;
            int i6 = cv.A01;
            int i7 = cv.A02;
            int subsampleDataLength3 = cv.A00;
            c0555Bc2.A03(i, iArr, iArr2, bArr, bArr2, i6, i7, subsampleDataLength3);
            int i8 = (int) (j3 - fz.A01);
            fz.A01 += i8;
            fz.A00 -= i8;
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(C0645Fb c0645Fb) {
        if (!c0645Fb.A02) {
            return;
        }
        HD[] hdArr = new HD[(this.A06.A02 ? 1 : 0) + (((int) (this.A06.A04 - c0645Fb.A04)) / this.A0A)];
        for (int i = 0; i < i; i++) {
            hdArr[i] = c0645Fb.A01;
            c0645Fb = c0645Fb.A01();
        }
        this.A0D.ACF(hdArr);
    }

    private final void A0A(boolean z) {
        this.A0C.A0I(z);
        A09(this.A04);
        this.A04 = new C0645Fb(0L, this.A0A);
        C0645Fb c0645Fb = this.A04;
        this.A05 = c0645Fb;
        this.A06 = c0645Fb;
        this.A01 = 0L;
        this.A0D.ADZ();
    }

    public final int A0B() {
        return this.A0C.A08();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D() {
        return this.A0C.A07();
    }

    public final int A0E(long j, boolean z, boolean z2) {
        return this.A0C.A09(j, z, z2);
    }

    public final int A0F(AH ah, C1121Xw c1121Xw, boolean z, boolean z2, long j) {
        int A0A = this.A0C.A0A(ah, c1121Xw, z, z2, this.A02, this.A0B);
        if (A0A == -5) {
            this.A02 = ah.A00;
            return -5;
        } else if (A0A != -4) {
            if (A0A == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!c1121Xw.A04()) {
                long j2 = c1121Xw.A00;
                if (A0F[7].charAt(20) != 'U') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
                strArr[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
                if (j2 < j) {
                    c1121Xw.A00(Integer.MIN_VALUE);
                }
                if (c1121Xw.A0A()) {
                    A08(c1121Xw, this.A0B);
                }
                c1121Xw.A09(this.A0B.A00);
                A06(this.A0B.A01, c1121Xw.A01, this.A0B.A00);
            }
            return -4;
        }
    }

    public final long A0G() {
        return this.A0C.A0C();
    }

    public final Format A0H() {
        return this.A0C.A0F();
    }

    public final void A0I() {
        A05(this.A0C.A0B());
    }

    public final void A0J() {
        A0A(false);
    }

    public final void A0K() {
        this.A0C.A0G();
        this.A05 = this.A04;
    }

    public final void A0L(long j, boolean z, boolean z2) {
        A05(this.A0C.A0E(j, z, z2));
    }

    public final void A0M(InterfaceC0646Fc interfaceC0646Fc) {
        this.A07 = interfaceC0646Fc;
    }

    public final boolean A0N() {
        return this.A0C.A0J();
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void A5A(Format format) {
        Format A01 = A01(format, this.A00);
        boolean A0L = this.A0C.A0L(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC0646Fc interfaceC0646Fc = this.A07;
        if (interfaceC0646Fc != null && A0L) {
            interfaceC0646Fc.ABD(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final int ACd(CL cl, int i, boolean z) throws IOException, InterruptedException {
        int read = cl.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A03(read);
        if (A0F[4].length() != 13) {
            String[] strArr = A0F;
            strArr[0] = "gj56WjutkODHGuBsULoCjgk";
            strArr[5] = "cXoHIYif5j6YkS";
            return read;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void ACe(IQ iq, int i) {
        while (i > 0) {
            int A00 = A00(i);
            iq.A0d(this.A06.A01.A01, this.A06.A00(this.A01), A00);
            i -= A00;
            A03(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CW
    public final void ACf(long j, int i, int i2, int i3, CV cv) {
        if (this.A08) {
            A5A(this.A03);
        }
        if (this.A09) {
            if ((i & 1) != 0) {
                C0644Fa c0644Fa = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!c0644Fa.A0K(j)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0F;
                strArr3[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                strArr3[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j + this.A00;
        this.A0C.A0H(timeUs, i, (this.A01 - i2) - i3, i2, cv);
    }
}