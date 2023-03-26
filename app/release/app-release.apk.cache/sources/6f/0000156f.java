package com.facebook.ads.redexgen.X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Yh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1132Yh implements DD {
    public static byte[] A0C;
    public static String[] A0D;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final DC A0A = new DC();
    public final DG A0B;

    static {
        A0B();
        A0A();
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{38, 7, 72, 7, 15, 15, 72, 24, 9, 15, 13, 72, Flags.CD, 9, 6, 72, 10, 13, 72, 14, 7, 29, 6, 12, 70};
    }

    public static void A0B() {
        A0D = new String[]{"IwWJ1rAHfmexjsebXRXcDPjaU73iSJJD", "Pfa9O7smeRLr", "YVPVKTJSUnoy1mID8h1JiHhyOv", "4YIcZCc9D0v6GYbVW55qq4", "MQGq3Ss0TGTuZcZl9hZWKHAs", "ClxO0wOPMkXGPeTsbkyLqOefUDvePx9Y", "eY8aqVMBTreysgzhCT0m33TuEQRECFok", "4vNP3Dy1WFFR"};
    }

    public C1132Yh(long j, long j2, DG dg, int i, long j3) {
        I1.A03(j >= 0 && j2 > j);
        this.A0B = dg;
        this.A09 = j;
        this.A08 = j2;
        if (i == j2 - j) {
            this.A07 = j3;
            this.A00 = 3;
            return;
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j, long j2, long j3) {
        long j4 = this.A08;
        long j5 = this.A09;
        long j6 = j + ((((j4 - j5) * j2) / this.A07) - j3);
        if (j6 < j5) {
            j6 = this.A09;
        }
        long j7 = this.A08;
        if (j6 >= j7) {
            return j7 - 1;
        }
        return j6;
    }

    private final long A01(long j, CL cl) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A6m = cl.A6m();
        if (A0E(cl, this.A01)) {
            this.A0A.A04(cl, false);
            cl.ACa();
            long j2 = j - this.A0A.A05;
            int i = this.A0A.A01 + this.A0A.A00;
            if (j2 >= 0) {
                String[] strArr = A0D;
                if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[2] = "1HFKFqyQYawdfec4zhOWKwAEhw";
                strArr2[3] = "atngC4wrhlAL4xDnem6FNv";
                if (j2 <= 72000) {
                    cl.ADG(i);
                    return -(this.A0A.A05 + 2);
                }
            }
            if (j2 < 0) {
                this.A01 = A6m;
                this.A02 = this.A0A.A05;
            } else {
                long initialPosition = cl.A6m();
                this.A04 = initialPosition + i;
                this.A05 = this.A0A.A05;
                long initialPosition2 = this.A01;
                if ((initialPosition2 - this.A04) + i < 100000) {
                    cl.ADG(i);
                    long initialPosition3 = this.A05;
                    return -(initialPosition3 + 2);
                }
            }
            long initialPosition4 = this.A01;
            long j3 = this.A04;
            if (initialPosition4 - j3 < 100000) {
                this.A01 = j3;
                return j3;
            }
            long A6m2 = cl.A6m() - (i * (j2 > 0 ? 1L : 2L));
            long j4 = this.A01;
            long j5 = this.A04;
            long j6 = (j4 - j5) * j2;
            String[] strArr3 = A0D;
            String str = strArr3[5];
            String str2 = strArr3[0];
            int pageSize = str.charAt(24);
            if (pageSize != str2.charAt(24)) {
                long initialPosition5 = this.A02;
                return Math.min(Math.max(A6m2 + (j6 / (initialPosition5 - this.A05)), j5), this.A01 - 1);
            }
            String[] strArr4 = A0D;
            strArr4[1] = "HnyCEdH4by64";
            strArr4[7] = "f67XG71IQfud";
            return Math.min(Math.max(A6m2 + (j6 / (this.A02 - this.A05)), j5), this.A01 - 1);
        }
        long j7 = this.A04;
        if (j7 != A6m) {
            return j7;
        }
        throw new IOException(A09(0, 25, 6));
    }

    private final long A02(CL cl) throws IOException, InterruptedException {
        A0D(cl);
        this.A0A.A03();
        while ((this.A0A.A04 & 4) != 4 && cl.A6m() < this.A08) {
            this.A0A.A04(cl, false);
            cl.ADG(this.A0A.A01 + this.A0A.A00);
        }
        return this.A0A.A05;
    }

    private final long A03(CL cl, long j, long j2) throws IOException, InterruptedException {
        this.A0A.A04(cl, false);
        while (this.A0A.A05 < j) {
            cl.ADG(this.A0A.A01 + this.A0A.A00);
            j2 = this.A0A.A05;
            this.A0A.A04(cl, false);
        }
        cl.ACa();
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.DD
    /* renamed from: A07 */
    public final C1131Yg A4R() {
        if (this.A07 != 0) {
            return new C1131Yg(this);
        }
        return null;
    }

    private final void A0C() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0D(CL cl) throws IOException, InterruptedException {
        if (A0E(cl, this.A08)) {
            return;
        }
        throw new EOFException();
    }

    private final boolean A0E(CL cl, long j) throws IOException, InterruptedException {
        long min = Math.min(3 + j, this.A08);
        byte[] bArr = new byte[2048];
        int length = bArr.length;
        while (true) {
            if (cl.A6m() + length > min && (length = (int) (min - cl.A6m())) < 4) {
                return false;
            }
            cl.ABa(bArr, 0, length, false);
            for (int i = 0; i < length - 3; i++) {
                if (bArr[i] == 79 && bArr[i + 1] == 103 && bArr[i + 2] == 103 && bArr[i + 3] == 83) {
                    cl.ADG(i);
                    return true;
                }
            }
            cl.ADG(length - 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final long ABy(CL cl) throws IOException, InterruptedException {
        long A03;
        int i = this.A00;
        if (i == 0) {
            this.A03 = cl.A6m();
            this.A00 = 1;
            long j = this.A08 - 65307;
            if (j > this.A03) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j2 = this.A06;
            if (j2 == 0) {
                A03 = 0;
            } else {
                long A01 = A01(j2, cl);
                if (A01 >= 0) {
                    return A01;
                }
                A03 = A03(cl, this.A06, -(A01 + 2));
            }
            this.A00 = 3;
            return -(2 + A03);
        }
        this.A07 = A02(cl);
        this.A00 = 3;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.DD
    public final long ADN(long j) {
        int i = this.A00;
        I1.A03(i == 3 || i == 2);
        long j2 = 0;
        if (j != 0) {
            j2 = this.A0B.A05(j);
        }
        this.A06 = j2;
        this.A00 = 2;
        A0C();
        long j3 = this.A06;
        String[] strArr = A0D;
        if (strArr[5].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[6] = "l4iEtEKEuRK6wb9mepvhy";
        strArr2[6] = "l4iEtEKEuRK6wb9mepvhy";
        return j3;
    }
}