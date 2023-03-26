package com.facebook.ads.redexgen.X;

import android.support.v4.media.session.PlaybackStateCompat;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class D4 {
    public static byte[] A00;
    public static String[] A01;
    public static final int[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 31, 74, 25, 123, 47, 122, bx.W5, 111, 59, 57, 106, 17, 69, 69, 20, 58, 110, 121, 26, 78, 91, 31, 10, 94, 74, 15, 125, 4, 113, 16, 69, 60, 94, 40, 54, 79, 45, 43, 101, 123, 102, 126, 80, 71, 82, 0, 116, 38, 100, 50, 70, 75, 88, 31, 88, 70, 83, 1, 102, 124, 96, 61, 20, 14, 18, 78, ax5.a, 37, 57, 98, 112, 106, 118, 44, 94, 68, 88, 1, 83, 73, 85, 87, 60, 51, 51, 62, 111, 114, 54, 51, 18, 15, 75, 77, 112, 117, 33, 33};
        if (A01[3].charAt(26) != 'I') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
        strArr[3] = "d1bTlggiE4vYEwLxNU00WUvkcSIuSb2g";
    }

    public static void A02() {
        A01 = new String[]{"3vAPqkZTJ1VSon", "QUTM7SdDWyFumvZa4ixbAFeRkcyJbQtu", "xie3JnTyZ8PkMdNBWExCsKsV5Mn", "WzqQT7JP0s6wyXASN6VfDx7AAKIr1zQR", "8xy", "R913nsbqijjrVtiNLSpVoV0rL8armwI", "xGv", "6Jbm"};
    }

    static {
        A02();
        A01();
        A02 = new int[]{C0726Ig.A08(A00(79, 4, 5)), C0726Ig.A08(A00(59, 4, 48)), C0726Ig.A08(A00(63, 4, 66)), C0726Ig.A08(A00(67, 4, 105)), C0726Ig.A08(A00(71, 4, 38)), C0726Ig.A08(A00(75, 4, 8)), C0726Ig.A08(A00(43, 4, 14)), C0726Ig.A08(A00(55, 4, 15)), C0726Ig.A08(A00(51, 4, 17)), C0726Ig.A08(A00(87, 4, 61)), C0726Ig.A08(A00(91, 4, 64)), C0726Ig.A08(A00(0, 4, 71)), C0726Ig.A08(A00(4, 4, 119)), C0726Ig.A08(A00(19, 4, 22)), C0726Ig.A08(A00(23, 4, 6)), C0726Ig.A08(A00(8, 4, 99)), C0726Ig.A08(A00(12, 4, 29)), C0726Ig.A08(A00(31, 4, 55)), C0726Ig.A08(A00(27, 4, 15)), C0726Ig.A08(A00(47, 4, 45)), C0726Ig.A08(A00(83, 4, 104)), C0726Ig.A08(A00(35, 4, 68)), C0726Ig.A08(A00(95, 4, 62)), C0726Ig.A08(A00(39, 4, 23))};
    }

    public static boolean A03(int i) {
        if ((i >>> 8) == C0726Ig.A08(A00(16, 3, 54))) {
            return true;
        }
        int[] iArr = A02;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "EPRlEFMBD24k0biyd";
        strArr2[5] = "EPRlEFMBD24k0biyd";
        for (int compatibleBrand : iArr) {
            if (compatibleBrand == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(CL cl) throws IOException, InterruptedException {
        return A06(cl, true);
    }

    public static boolean A05(CL cl) throws IOException, InterruptedException {
        return A06(cl, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        r13 = r13 - r17.A6m();
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
        if (com.facebook.ads.redexgen.X.D4.A01[7].length() == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        r4 = r13 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r0 != 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        r4 = com.facebook.ads.redexgen.X.D4.A01;
        r4[6] = "BrR";
        r4[4] = "QIT";
        r4 = r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A06(CL cl, boolean z) throws IOException, InterruptedException {
        long A6T = cl.A6T();
        long j = PlaybackStateCompat.E;
        long j2 = -1;
        if (A6T != -1) {
            int i = (A6T > PlaybackStateCompat.E ? 1 : (A6T == PlaybackStateCompat.E ? 0 : -1));
            if (A01[1].charAt(15) != 'a') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "vvdTCZ7FTRFSeJf0jfXeHz2wpGr";
            strArr[2] = "vvdTCZ7FTRFSeJf0jfXeHz2wpGr";
            if (i <= 0) {
                j = A6T;
            }
        }
        int i2 = (int) j;
        IQ iq = new IQ(64);
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i3 < i2) {
            int i4 = 8;
            iq.A0X(8);
            cl.ABZ(iq.A00, 0, 8);
            long A0N = iq.A0N();
            int atomDataSize = iq.A09();
            int headerSize = (A0N > 1L ? 1 : (A0N == 1L ? 0 : -1));
            if (headerSize == 0) {
                i4 = 16;
                cl.ABZ(iq.A00, 8, 8);
                iq.A0Y(16);
                A0N = iq.A0O();
            } else {
                int headerSize2 = (A0N > 0L ? 1 : (A0N == 0L ? 0 : -1));
                if (headerSize2 == 0) {
                    long A6T2 = cl.A6T();
                    if (A01[5].length() != 5) {
                        String[] strArr2 = A01;
                        strArr2[6] = "Cb1";
                        strArr2[4] = "ZVm";
                        int headerSize3 = (A6T2 > j2 ? 1 : (A6T2 == j2 ? 0 : -1));
                    } else {
                        int headerSize4 = (A6T2 > j2 ? 1 : (A6T2 == j2 ? 0 : -1));
                    }
                }
            }
            if (A0N < i4) {
                return false;
            }
            i3 += i4;
            int headerSize5 = AbstractC0581Cl.A0j;
            if (atomDataSize == headerSize5) {
                j2 = -1;
            } else {
                int headerSize6 = AbstractC0581Cl.A0i;
                if (atomDataSize != headerSize6) {
                    int headerSize7 = AbstractC0581Cl.A0m;
                    if (atomDataSize != headerSize7) {
                        if ((i3 + A0N) - i4 >= i2) {
                            break;
                        }
                        int brandsCount = (int) (A0N - i4);
                        i3 += brandsCount;
                        int headerSize8 = AbstractC0581Cl.A0U;
                        if (atomDataSize == headerSize8) {
                            if (brandsCount >= 8) {
                                iq.A0X(brandsCount);
                                cl.ABZ(iq.A00, 0, brandsCount);
                                int brandsCount2 = brandsCount / 4;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= brandsCount2) {
                                        break;
                                    }
                                    if (i5 == 1) {
                                        iq.A0a(4);
                                    } else {
                                        int headerSize9 = iq.A09();
                                        if (A03(headerSize9)) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                                if (!z2) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else if (brandsCount != 0) {
                            cl.A3M(brandsCount);
                        }
                        j2 = -1;
                    }
                }
                z3 = true;
                break;
            }
        }
        return z2 && z == z3;
    }
}