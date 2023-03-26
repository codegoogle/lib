package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.zg2;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CD implements YV {
    public static byte[] A05;
    public static String[] A06;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    static {
        A04();
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            strArr2[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
            i4++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        strArr2[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, 27, 95, 90, 79, 90, 27, 72, 82, 65, 94, 27, 86, 82, 72, 86, 90, 79, 88, 83, 1, 27, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    public static void A04() {
        A06 = new String[]{"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    }

    public CD(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public CD(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    public static CD A01(long j, long j2, CQ cq, IQ iq) {
        int flags;
        int i = cq.A04;
        int i2 = cq.A03;
        int A09 = iq.A09();
        int samplesPerFrame = A09 & 1;
        if (samplesPerFrame != 1 || (flags = iq.A0I()) == 0) {
            return null;
        }
        long dataSize = C0726Ig.A0F(flags, i * 1000000, i2);
        int samplesPerFrame2 = A09 & 6;
        if (samplesPerFrame2 != 6) {
            return new CD(j2, cq.A02, dataSize);
        }
        long A0I = iq.A0I();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            long durationUs = iq.A0F();
            jArr[i3] = durationUs;
        }
        if (j != -1 && j != j2 + A0I) {
            StringBuilder sb = new StringBuilder();
            sb.append(A02(2, 25, 81));
            sb.append(j);
            sb.append(A02(0, 2, 17));
            long durationUs2 = j2 + A0I;
            sb.append(durationUs2);
            Log.w(A02(27, 10, 96), sb.toString());
        }
        return new CD(j2, cq.A02, dataSize, A0I, jArr);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long j) {
        long[] jArr;
        double d;
        if (!A7m()) {
            return new CS(new CU(0L, this.A02 + this.A00));
        }
        long A0E = C0726Ig.A0E(j, 0L, this.A03);
        long timeUs = this.A03;
        double d2 = (A0E * 100.0d) / timeUs;
        if (d2 <= zg2.s) {
            d = zg2.s;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
        } else {
            int i = (int) d2;
            double prevScaledPosition = this.A04[i];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[4] = "";
            strArr[4] = "";
            double nextScaledPosition = i;
            d = prevScaledPosition + (((i == 99 ? 256.0d : jArr[i + 1]) - prevScaledPosition) * (d2 - nextScaledPosition));
        }
        long positionOffset = Math.round((d / 256.0d) * this.A01);
        return new CS(new CU(A0E, this.A02 + C0726Ig.A0E(positionOffset, this.A00, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.X.YV
    public final long A76(long j) {
        long j2;
        long positionOffset = j - this.A02;
        if (A7m()) {
            long j3 = this.A00;
            if (A06[4].length() != 1) {
                String[] strArr = A06;
                strArr[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
                strArr[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
                if (positionOffset > j3) {
                    double d = (positionOffset * 256.0d) / this.A01;
                    int A0B = C0726Ig.A0B(this.A04, (long) d, true, true);
                    long A00 = A00(A0B);
                    long j4 = this.A04[A0B];
                    long A002 = A00(A0B + 1);
                    long nextScaledPosition = Math.round((A002 - A00) * (j4 == (A0B == 99 ? 256L : this.A04[A0B + 1]) ? zg2.s : (d - j4) / (j2 - j4)));
                    return nextScaledPosition + A00;
                }
                return 0L;
            }
            throw new RuntimeException();
        }
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return this.A04 != null;
    }
}