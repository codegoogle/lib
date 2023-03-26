package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DN {
    public static byte[] A00;
    public static String[] A01;

    static {
        A07();
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:202)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:124)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:564)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static DM A04(IQ iq) throws AN {
        A0B(1, iq, false);
        long A0L = iq.A0L();
        int A0F = iq.A0F();
        long A0L2 = iq.A0L();
        int A0B = iq.A0B();
        int A0B2 = iq.A0B();
        int A0B3 = iq.A0B();
        int A0F2 = iq.A0F();
        return new DM(A0L, A0F, A0L2, A0B, A0B2, A0B3, (int) Math.pow(2.0d, A0F2 & 15), (int) Math.pow(2.0d, (A0F2 & 240) >> 4), (iq.A0F() & 1) > 0, Arrays.copyOf(iq.A00, iq.A08()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, 23, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, 15, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, 15, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, bx.W5, 38, 45, 40, 43, 37, 44, 115, 105, 20, 0, 19, 31, 27, 28, 21, 82, 16, 27, 6, 82, 19, 20, 6, 23, 0, 82, 31, 29, 22, 23, 1, 82, 28, 29, 6, 82, 1, 23, 6, 82, 19, 1, 82, 23, 10, 2, 23, 17, 6, 23, 22, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, 14, 90, 87, 94, 75, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 28, 14, 64, 65, 90, 14, 74, 75, 77, 65, 74, 79, 76, 66, 75, 20, 14, 38, bx.W5, 59, 59, 34, 37, 44, 107, ax5.a, 50, 59, 46, 107, 36, ax5.a, 35, 46, 57, 107, ax5.a, 35, bx.W5, 37, 107, 123, 107, 37, 36, ax5.a, 107, 56, 62, 59, 59, 36, 57, ax5.a, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, ax5.a, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, bx.W5, ax5.a, 54, 43, 52, bx.W5, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, 20, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, g15.c, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, 18, 22, 19, 18, 5, 77, 87};
    }

    public static void A07() {
        A01 = new String[]{"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};
    }

    public static int A00(int val) {
        int i = 0;
        while (val > 0) {
            i++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            strArr2[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DJ A02(DH dh) throws AN {
        long j;
        if (dh.A02(24) == 5653314) {
            int A02 = dh.A02(16);
            int A022 = dh.A02(24);
            long[] jArr = new long[A022];
            boolean A04 = dh.A04();
            if (!A04) {
                boolean A042 = dh.A04();
                for (int i = 0; i < jArr.length; i++) {
                    if (A042) {
                        boolean isSparse = dh.A04();
                        if (isSparse) {
                            jArr[i] = dh.A02(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = dh.A02(5) + 1;
                    }
                }
            } else {
                int A023 = dh.A02(5) + 1;
                int i2 = 0;
                while (i2 < i) {
                    int i3 = A022 - i2;
                    int A024 = dh.A02(A00(i3));
                    for (int i4 = 0; i4 < A024; i4++) {
                        int i5 = jArr.length;
                        if (i2 < i5) {
                            jArr[i2] = A023;
                            i2++;
                        }
                    }
                    A023++;
                }
            }
            int A025 = dh.A02(4);
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "k7eMGEO3QgprNsh6neXNKI6AQGFtvYrM";
            strArr2[7] = "k7eMGEO3QgprNsh6neXNKI6AQGFtvYrM";
            if (A025 <= 2) {
                if (A025 == 1 || A025 == 2) {
                    dh.A03(32);
                    dh.A03(32);
                    int A026 = dh.A02(4) + 1;
                    dh.A03(1);
                    if (A025 == 1) {
                        if (A02 != 0) {
                            j = A01(A022, A02);
                        } else {
                            j = 0;
                        }
                    } else {
                        j = A022 * A02;
                    }
                    long lookupValuesCount = A026;
                    int lookupType = (int) (lookupValuesCount * j);
                    dh.A03(lookupType);
                }
                return new DJ(A02, A022, jArr, A025, A04);
            }
            throw new AN(A05(228, 42, 25) + A025);
        }
        throw new AN(A05(38, 55, 54) + dh.A01());
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DK A03(IQ iq) throws AN {
        A0B(3, iq, false);
        int len = (int) iq.A0L();
        String A0T = iq.A0T(len);
        int len2 = A0T.length();
        int i = 7 + 4 + len2;
        long A0L = iq.A0L();
        int len3 = (int) A0L;
        String[] strArr = new String[len3];
        int i2 = i + 4;
        int i3 = 0;
        while (i < 0) {
            int i4 = (int) iq.A0L();
            strArr[i3] = iq.A0T(i4);
            int i5 = strArr[i3].length();
            i2 = i2 + 4 + i5;
            i3++;
        }
        int i6 = iq.A0F();
        int i7 = i6 & 1;
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        strArr2[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        if (i7 != 0) {
            return new DK(A0T, strArr, i2 + 1);
        }
        throw new AN(A05(198, 30, 6));
    }

    public static void A08(int mappingsCount, DH dh) throws AN {
        int i;
        int A02 = dh.A02(6) + 1;
        for (int i2 = 0; i2 < A02; i2++) {
            int A022 = dh.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + A022);
            } else {
                if (dh.A04()) {
                    i = dh.A02(4) + 1;
                } else {
                    i = 1;
                }
                boolean A04 = dh.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (A04) {
                    int A023 = dh.A02(8) + 1;
                    for (int i3 = 0; i3 < A023; i3++) {
                        int i4 = mappingsCount - 1;
                        dh.A03(A00(i4));
                        int i5 = mappingsCount - 1;
                        dh.A03(A00(i5));
                    }
                }
                int i6 = dh.A02(2);
                if (i6 == 0) {
                    if (i > 1) {
                        for (int i7 = 0; i7 < mappingsCount; i7++) {
                            dh.A03(4);
                        }
                    }
                    for (int i8 = 0; i8 < i; i8++) {
                        dh.A03(8);
                        dh.A03(8);
                        dh.A03(8);
                    }
                } else {
                    throw new AN(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A09(DH dh) throws AN {
        int A02 = dh.A02(6) + 1;
        for (int floorType = 0; floorType < A02; floorType++) {
            int A022 = dh.A02(16);
            if (A022 == 0) {
                dh.A03(8);
                dh.A03(16);
                dh.A03(16);
                dh.A03(6);
                dh.A03(8);
                int A023 = dh.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < A023; rangeBits++) {
                    dh.A03(8);
                }
            } else if (A022 == 1) {
                int j = dh.A02(5);
                int i = -1;
                int[] iArr = new int[j];
                for (int i2 = 0; i2 < j; i2++) {
                    iArr[i2] = dh.A02(4);
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                int[] iArr2 = new int[i + 1];
                int i3 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    strArr2[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i3 < length) {
                        iArr2[i3] = dh.A02(3) + 1;
                        int classSubclasses = dh.A02(2);
                        if (classSubclasses > 0) {
                            dh.A03(8);
                        }
                        for (int i4 = 0; i4 < (1 << classSubclasses); i4++) {
                            dh.A03(8);
                        }
                        i3++;
                    } else {
                        dh.A03(2);
                        int A024 = dh.A02(4);
                        int i5 = 0;
                        int i6 = 0;
                        for (int k = 0; k < j; k++) {
                            int rangeBits2 = iArr[k];
                            i5 += iArr2[rangeBits2];
                            while (i6 < i5) {
                                dh.A03(A024);
                                i6++;
                            }
                        }
                    }
                }
            } else {
                throw new AN(A05(114, 41, 126) + A022);
            }
        }
    }

    public static void A0A(DH dh) throws AN {
        int A02 = dh.A02(6) + 1;
        for (int classifications = 0; classifications < A02; classifications++) {
            if (dh.A02(16) <= 2) {
                dh.A03(24);
                dh.A03(24);
                dh.A03(24);
                int A022 = dh.A02(6) + 1;
                dh.A03(8);
                int[] iArr = new int[A022];
                for (int i = 0; i < A022; i++) {
                    int i2 = 0;
                    int A023 = dh.A02(3);
                    if (dh.A04()) {
                        i2 = dh.A02(5);
                    }
                    int highBits = i2 * 8;
                    iArr[i] = highBits + A023;
                }
                for (int i3 = 0; i3 < A022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int k = 1 << i4;
                        if ((iArr[i3] & k) != 0) {
                            dh.A03(8);
                        }
                    }
                }
            } else {
                throw new AN(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0B(int i, IQ iq, boolean z) throws AN {
        if (iq.A05() < 7) {
            if (z) {
                return false;
            }
            throw new AN(A05(464, 18, 64) + iq.A05());
        } else if (iq.A0F() != i) {
            if (z) {
                return false;
            }
            throw new AN(A05(93, 21, 10) + Integer.toHexString(i));
        } else if (iq.A0F() != 118 || iq.A0F() != 111 || iq.A0F() != 114 || iq.A0F() != 98 || iq.A0F() != 105 || iq.A0F() != 115) {
            if (z) {
                return false;
            }
            throw new AN(A05(10, 28, 24));
        } else if (A01[6].length() != 22) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
            strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
            return true;
        }
    }

    public static DL[] A0C(DH dh) {
        int A02 = dh.A02(6) + 1;
        DL[] dlArr = new DL[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            dlArr[windowType] = new DL(dh.A04(), dh.A02(16), dh.A02(16), dh.A02(8));
        }
        return dlArr;
    }

    public static DL[] A0D(IQ iq, int i) throws AN {
        A0B(5, iq, false);
        int i2 = iq.A0F() + 1;
        DH dh = new DH(iq.A00);
        dh.A03(iq.A07() * 8);
        for (int i3 = 0; i3 < i2; i3++) {
            A02(dh);
        }
        int A02 = dh.A02(6) + 1;
        for (int timeCount = 0; timeCount < A02; timeCount++) {
            int i4 = dh.A02(16);
            if (i4 != 0) {
                throw new AN(A05(311, 52, 110));
            }
        }
        A09(dh);
        A0A(dh);
        A08(i, dh);
        DL[] A0C = A0C(dh);
        if (dh.A04()) {
            return A0C;
        }
        throw new AN(A05(155, 43, 69));
    }
}