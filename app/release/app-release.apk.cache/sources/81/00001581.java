package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Yz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1150Yz implements DQ {
    public static byte[] A0D;
    public static String[] A0E;
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public CW A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final DR A0B = new DR(128);

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            strArr[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
            i4++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    public static void A03() {
        A0E = new String[]{"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    }

    static {
        A03();
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(DR dr, String str) {
        byte[] copyOf = Arrays.copyOf(dr.A02, dr.A00);
        int i = copyOf[4] & 255;
        int i2 = copyOf[5] & 255;
        int firstByte = copyOf[6] & 255;
        int aspectRatioCode = (i << 4) | (i2 >> 4);
        int width = i2 & 15;
        int i3 = (width << 8) | firstByte;
        float f = 1.0f;
        int i4 = (copyOf[7] & 240) >> 4;
        if (i4 != 2) {
            String[] strArr = A0E;
            String str2 = strArr[2];
            String str3 = strArr[5];
            int firstByte2 = str2.length();
            if (firstByte2 == str3.length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (i4 != 3) {
                    if (i4 == 4) {
                        float pixelWidthHeightRatio = aspectRatioCode * 100;
                        f = (i3 * 121) / pixelWidthHeightRatio;
                    }
                } else {
                    float pixelWidthHeightRatio2 = aspectRatioCode * 9;
                    f = (i3 * 16) / pixelWidthHeightRatio2;
                }
            }
            throw new RuntimeException();
        }
        float pixelWidthHeightRatio3 = aspectRatioCode * 3;
        f = (i3 * 4) / pixelWidthHeightRatio3;
        Format A03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i3, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j = 0;
        int i5 = (copyOf[7] & 15) - 1;
        if (i5 >= 0) {
            double[] dArr = A0F;
            int frameRateCodeMinusOne = dArr.length;
            if (i5 < frameRateCodeMinusOne) {
                double d = dArr[i5];
                int i6 = dr.A01;
                int sequenceExtensionPosition = i6 + 9;
                int i7 = (copyOf[sequenceExtensionPosition] & 96) >> 5;
                int i8 = i6 + 9;
                if (A0E[1].length() == 23) {
                    String[] strArr3 = A0E;
                    strArr3[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    strArr3[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int frameRateExtensionN = copyOf[i8];
                    int height = frameRateExtensionN & 31;
                    if (i7 != height) {
                        double frameRate = i7;
                        int firstByte3 = height + 1;
                        d *= (frameRate + 1.0d) / firstByte3;
                    }
                    j = (long) (1000000.0d / d);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(A03, Long.valueOf(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        if (r21.A07 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
        r21.A05.ACf(r21.A03, r21.A09 ? 1 : 0, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        r21.A03 = r2;
        r21.A09 = false;
        r21.A01 = r4;
        r21.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014a, code lost:
        if (r21.A0A == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0161, code lost:
        if (r3 != false) goto L40;
     */
    @Override // com.facebook.ads.redexgen.X.DQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A48(IQ iq) {
        long j;
        long j2;
        int A07 = iq.A07();
        int startCodeOffset = iq.A08();
        byte[] bArr = iq.A00;
        this.A04 += iq.A05();
        this.A05.ACe(iq, iq.A05());
        while (true) {
            int A04 = IM.A04(bArr, A07, startCodeOffset, this.A0C);
            if (A04 == startCodeOffset) {
                if (!this.A07) {
                    this.A0B.A02(bArr, A07, startCodeOffset);
                    return;
                }
                return;
            }
            int i = iq.A00[A04 + 3] & 255;
            if (!this.A07) {
                int i2 = A04 - A07;
                if (i2 > 0) {
                    this.A0B.A02(bArr, A07, A04);
                }
                boolean A03 = this.A0B.A03(i, i2 < 0 ? -i2 : 0);
                String[] strArr = A0E;
                String str = strArr[7];
                String str2 = strArr[0];
                int charAt = str.charAt(5);
                int bytesAlreadyPassed = str2.charAt(5);
                if (charAt == bytesAlreadyPassed) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[3] = "Gmz7YLt6vKXB0Kh33k2jAQykhT9FiqdN";
                strArr2[6] = "TkHTtIemUWviB5ws5Je9dF4YdCApPsSP";
                if (A03) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5A((Format) A00.first);
                    Long l = (Long) A00.second;
                    String[] strArr3 = A0E;
                    String str3 = strArr3[2];
                    String str4 = strArr3[5];
                    int length = str3.length();
                    int bytesAlreadyPassed2 = str4.length();
                    if (length != bytesAlreadyPassed2) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0E;
                    strArr4[4] = "8rD5RJTKmVYL1h1EM8GIVzxEaE8efXuD";
                    strArr4[4] = "8rD5RJTKmVYL1h1EM8GIVzxEaE8efXuD";
                    this.A00 = l.longValue();
                    this.A07 = true;
                }
            }
            if (i == 0 || i == 179) {
                int i3 = startCodeOffset - A04;
                if (this.A0A) {
                    boolean z = this.A08;
                    String[] strArr5 = A0E;
                    if (strArr5[2].length() == strArr5[5].length()) {
                        String[] strArr6 = A0E;
                        strArr6[1] = "lt8XNjTjZsvTZYuzmpleJlO";
                        strArr6[1] = "lt8XNjTjZsvTZYuzmpleJlO";
                    }
                }
                if (!this.A0A || this.A08) {
                    long j3 = this.A04 - i3;
                    if (A0E[4].charAt(16) != 'n') {
                        String[] strArr7 = A0E;
                        strArr7[3] = "zvBVKB5uu29Yyy850u5jW6cFc2Y5JQjh";
                        strArr7[6] = "fHTA109Q3n4ulqEkzS0ATd3oS74QB5bj";
                        this.A02 = j3;
                        j = this.A01;
                        j2 = -9223372036854775807L;
                    } else {
                        this.A02 = j3;
                        j = this.A01;
                        j2 = -9223372036854775807L;
                    }
                }
                this.A08 = i == 0;
            } else if (i == 184) {
                this.A09 = true;
            }
            A07 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void A4U(CM cm, C0600De c0600De) {
        c0600De.A06();
        this.A06 = c0600De.A05();
        this.A05 = cm.ADY(c0600De.A04(), 2);
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABV() {
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ABW(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.X.DQ
    public final void ACi() {
        IM.A0C(this.A0C);
        this.A0B.A01();
        this.A04 = 0L;
        this.A0A = false;
    }
}