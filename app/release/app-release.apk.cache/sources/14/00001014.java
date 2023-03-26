package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CG implements YV {
    public static byte[] A03;
    public static String[] A04;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A03();
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        strArr[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, g15.c, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, bx.l7, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    public static void A03() {
        A04 = new String[]{"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    }

    public CG(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static CG A00(long durationUs, long j, CQ cq, IQ iq) {
        int A0F;
        long position = j;
        iq.A0a(10);
        int A09 = iq.A09();
        if (A09 <= 0) {
            return null;
        }
        int i = cq.A03;
        long A0F2 = C0726Ig.A0F(A09, 1000000 * (i >= 32000 ? 1152 : 576), i);
        int A0J = iq.A0J();
        int A0J2 = iq.A0J();
        int A0J3 = iq.A0J();
        iq.A0a(2);
        int scale = cq.A02;
        long j2 = position + scale;
        long[] jArr = new long[A0J];
        long[] jArr2 = new long[A0J];
        for (int i2 = 0; i2 < A0J; i2++) {
            jArr[i2] = (i2 * A0F2) / A0J;
            jArr2[i2] = Math.max(position, j2);
            if (A0J3 == 1) {
                A0F = iq.A0F();
            } else if (A0J3 == 2) {
                A0F = iq.A0J();
            } else if (A0J3 == 3) {
                A0F = iq.A0H();
            } else if (A0J3 != 4) {
                return null;
            } else {
                A0F = iq.A0I();
            }
            position += A0F * A0J2;
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        int entryCount = (durationUs > (-1L) ? 1 : (durationUs == (-1L) ? 0 : -1));
        if (entryCount != 0) {
            int entryCount2 = (durationUs > position ? 1 : (durationUs == position ? 0 : -1));
            if (entryCount2 != 0) {
                Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
            }
        }
        return new CG(jArr, jArr2, A0F2);
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final long A65() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final CS A6s(long j) {
        int A0B = C0726Ig.A0B(this.A02, j, true, true);
        CU cu = new CU(this.A02[A0B], this.A01[A0B]);
        if (cu.A01 < j) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new CS(cu, new CU(jArr[A0B + 1], this.A01[A0B + 1]));
            }
        }
        return new CS(cu);
    }

    @Override // com.facebook.ads.redexgen.X.YV
    public final long A76(long j) {
        return this.A02[C0726Ig.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.CT
    public final boolean A7m() {
        return true;
    }
}