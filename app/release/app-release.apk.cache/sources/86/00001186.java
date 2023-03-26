package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.p7700g.p99005.bx;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IM {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02;
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-4, 15, 26, 3, 28, 23, 34, 3, 34, 23, 26, -41, -16, -25, -6, -14, -25, -27, -10, -25, -26, -94, -29, -11, -14, -25, -27, -10, bx.j7, -12, -29, -10, -21, -15, bx.j7, -21, -26, -27, -94, -8, -29, -18, -9, -25, -68, -94, -9, -22, -27, -26, -16, -80, -30, -9, -28, 7, -6, -11, -10, 0, -64, -7, -10, 7, -12};
    }

    public static void A09() {
        A02 = new String[]{"Oi30oJFxUMFG0gOFP1qEoKnGUzBDTsvx", "3WD4gW2GQkEI5AwBfxSAXddooip3O", "Ouz028YKvSlJVOERB46zGmLFjnusBt99", "zuSd86snyfkH6Kt688AXpDWJmpjjYjYh", "jm5obH6VrXyDYReHZwz8l0mhz55kc4yf", "71eZjkBm8iWWJxdGvDt2NXp", "W8ZvrObejWqz7a9mktO8s2uWHHxOtI0w", "Nv5C13AVolnSAeqab8n4y7TwRlreXIzh"};
    }

    static {
        A09();
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int A02(byte[] bArr, int position) {
        int position2;
        synchronized (A05) {
            int i = 0;
            int scratchEscapeCount = 0;
            while (i < position) {
                i = A03(bArr, i, position);
                if (i < position) {
                    if (A01.length <= scratchEscapeCount) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[scratchEscapeCount] = i;
                    i += 3;
                    scratchEscapeCount++;
                }
            }
            position2 = position - scratchEscapeCount;
            String[] strArr = A02;
            if (strArr[0].charAt(3) != strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "ghc1n9RTDSO0Z4i69kgOEipuot9Zj";
            strArr2[1] = "ghc1n9RTDSO0Z4i69kgOEipuot9Zj";
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < scratchEscapeCount; i4++) {
                int unescapedPosition = A01[i4] - i2;
                System.arraycopy(bArr, i2, bArr, i3, unescapedPosition);
                int i5 = i3 + unescapedPosition;
                int copyLength = i5 + 1;
                bArr[i5] = 0;
                i3 = copyLength + 1;
                bArr[copyLength] = 0;
                i2 += unescapedPosition + 3;
            }
            int remainingLength = position2 - i3;
            System.arraycopy(bArr, i2, bArr, i3, remainingLength);
        }
        return position2;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016c, code lost:
        if (r11[1] == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0172, code lost:
        if (r8[r10 - 1] != 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0175, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        r6 = r11[0];
        r5 = com.facebook.ads.redexgen.X.IM.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r5[7].charAt(7) == r5[4].charAt(7)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        r5 = com.facebook.ads.redexgen.X.IM.A02;
        r5[6] = "55fmxhOEMutKpKC77r4Md8gvEpVf5AJr";
        r5[3] = "C8cbl0pwE6ZZ2ZiTcRq9FxMeDjV9Xwky";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
        A0C(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        return r9 - 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r3 <= 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r11[1] == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r8[r9] != 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        A0C(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        return r9 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r3 <= 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r11[2] == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r8[r9] != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        if (r8[r9 + 1] != 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
        A0C(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        return r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r5 = r10 - 1;
        r6 = com.facebook.ads.redexgen.X.IM.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
        if (r6[6].charAt(21) == r6[3].charAt(21)) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        r6 = com.facebook.ads.redexgen.X.IM.A02;
        r6[6] = "uktgRDQdtpFh8EbCos18fWUkW81B3r6L";
        r6[3] = "mrDteKziaJnLJGchN7K4iHB0p5nXZEGM";
        r4 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
        if (r4 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        if ((r8[r4] & 254) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
        if (r8[r4 - 2] != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
        if (r8[r4 - 1] != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
        if (r8[r4] != 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
        if (r11 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        A0C(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
        r3 = r4 - 2;
        r2 = com.facebook.ads.redexgen.X.IM.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
        if (r2[6].charAt(21) == r2[3].charAt(21)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
        r2 = com.facebook.ads.redexgen.X.IM.A02;
        r2[7] = "R0jBdFAV67GondLg32AWi8zsE1yw1KkW";
        r2[4] = "2wkvt5tVRPNRTL1bJFfqOEJwxkS69Blm";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
        r4 = r4 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0110, code lost:
        r4 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0116, code lost:
        if (r11 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
        if (r3 <= 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011e, code lost:
        if (r8[r10 - 3] != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
        if (r8[r10 - 2] != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012a, code lost:
        if (r8[r10 - 1] != 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:
        r11[0] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
        if (r3 <= 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
        if (r8[r10 - 2] != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013b, code lost:
        if (r8[r10 - 1] != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013d, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013e, code lost:
        r11[1] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0144, code lost:
        if (r8[r10 - 1] != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0146, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0147, code lost:
        r11[2] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
        if (r11[2] == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
        if (r8[r10 - 1] != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
        if (r3 != 2) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
        if (r11[2] == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0161, code lost:
        if (r8[r10 - 2] != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0167, code lost:
        if (r8[r10 - 1] != 1) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A04(byte[] bArr, int i, int i2, boolean[] zArr) {
        int limit = i2 - i;
        boolean z = false;
        I1.A04(limit >= 0);
        String[] strArr = A02;
        if (strArr[7].charAt(7) == strArr[4].charAt(7)) {
            String[] strArr2 = A02;
            strArr2[6] = "PHOBqDmtHEL0W2nVKzmeMWYxoTm9mCET";
            strArr2[3] = "qKyyQO8AkkE9NBOuyY91tt3qWy60cHsV";
            if (limit == 0) {
                return i2;
            }
            if (A02[5].length() != 29) {
                String[] strArr3 = A02;
                strArr3[5] = "S61tfzcgNm58bvpOt";
                strArr3[5] = "S61tfzcgNm58bvpOt";
            }
        }
        throw new RuntimeException();
    }

    public static IK A05(byte[] bArr, int i, int i2) {
        IR ir = new IR(bArr, i, i2);
        ir.A08(8);
        int picParameterSetId = ir.A05();
        int A052 = ir.A05();
        ir.A07();
        boolean bottomFieldPicOrderInFramePresentFlag = ir.A0B();
        return new IK(picParameterSetId, A052, bottomFieldPicOrderInFramePresentFlag);
    }

    public static IL A06(byte[] bArr, int i, int i2) {
        int frameCropBottomOffset;
        int cropUnitX;
        IR ir = new IR(bArr, i, i2);
        ir.A08(8);
        int A06 = ir.A06(8);
        ir.A08(16);
        int sarWidth = ir.A05();
        int frameHeight = 1;
        boolean z = false;
        if (A06 == 100 || A06 == 110 || A06 == 122 || A06 == 244 || A06 == 44 || A06 == 83 || A06 == 86 || A06 == 118 || A06 == 128 || A06 == 138) {
            frameHeight = ir.A05();
            if (frameHeight == 3) {
                z = ir.A0B();
            }
            ir.A05();
            ir.A05();
            ir.A07();
            if (ir.A0B()) {
                int i3 = frameHeight != 3 ? 8 : 12;
                int i4 = 0;
                while (i4 < i3) {
                    if (ir.A0B()) {
                        int seqParameterSetId = i4 < 6 ? 16 : 64;
                        A0A(ir, seqParameterSetId);
                    }
                    i4++;
                }
            }
        }
        int seqParameterSetId2 = ir.A05();
        int i5 = seqParameterSetId2 + 4;
        int A052 = ir.A05();
        int i6 = 0;
        boolean z2 = false;
        if (A052 == 0) {
            int picOrderCntType = ir.A05();
            i6 = picOrderCntType + 4;
        } else if (A052 == 1) {
            z2 = ir.A0B();
            ir.A04();
            ir.A04();
            int cropUnitX2 = ir.A05();
            long j = cropUnitX2;
            for (int i7 = 0; i7 < j; i7++) {
                ir.A05();
            }
        } else {
            int frameWidth = A02[1].length();
            if (frameWidth != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "gg30aCps8xaKqlQpqNwqV8MpUTOLFqGh";
            strArr[2] = "6dq0Mx0u8Kgv53YJdcFQMlotDlRuazjf";
        }
        ir.A05();
        ir.A07();
        int A053 = ir.A05() + 1;
        int picWidthInMbs = ir.A05();
        int i8 = picWidthInMbs + 1;
        boolean A0B = ir.A0B();
        int picHeightInMapUnits = 2 - (A0B ? 1 : 0);
        int frameHeightInMbs = picHeightInMapUnits * i8;
        if (!A0B) {
            ir.A07();
        }
        ir.A07();
        int i9 = A053 * 16;
        int i10 = frameHeightInMbs * 16;
        if (ir.A0B()) {
            int A054 = ir.A05();
            int A055 = ir.A05();
            int A056 = ir.A05();
            int A057 = ir.A05();
            if (frameHeight == 0) {
                frameCropBottomOffset = 1;
                cropUnitX = 2 - (A0B ? 1 : 0);
            } else {
                frameCropBottomOffset = frameHeight == 3 ? 1 : 2;
                int i11 = frameHeight == 1 ? 2 : 1;
                int cropUnitX3 = 2 - (A0B ? 1 : 0);
                cropUnitX = cropUnitX3 * i11;
            }
            i9 -= (A054 + A055) * frameCropBottomOffset;
            i10 -= (A056 + A057) * cropUnitX;
        }
        float f = 1.0f;
        boolean A0B2 = ir.A0B();
        String[] strArr2 = A02;
        String str = strArr2[0];
        String str2 = strArr2[2];
        int frameWidth2 = str.charAt(3);
        int frameHeight2 = str2.charAt(3);
        if (frameWidth2 == frameHeight2) {
            String[] strArr3 = A02;
            strArr3[6] = "jcRzMhbBY3Dw1JTLjGKCGc6YaVOjENSo";
            strArr3[3] = "o4pmI9swvtrYdLR0BRHjmVJPNciV1YNp";
            if (A0B2) {
                boolean A0B3 = ir.A0B();
                String[] strArr4 = A02;
                String str3 = strArr4[0];
                String str4 = strArr4[2];
                int frameWidth3 = str3.charAt(3);
                if (frameWidth3 == str4.charAt(3)) {
                    String[] strArr5 = A02;
                    strArr5[0] = "nxo01JuHYgIdSih3CNMvKr0vsuD4ByKM";
                    strArr5[2] = "Ktm0TZ4NHFdoOw88agihQWJn0ILc0Ki9";
                    if (A0B3) {
                        int aspectRatioIdc = ir.A06(8);
                        if (aspectRatioIdc == 255) {
                            int A062 = ir.A06(16);
                            int picOrderCntLsbLength = ir.A06(16);
                            if (A062 != 0 && picOrderCntLsbLength != 0) {
                                f = A062 / picOrderCntLsbLength;
                            }
                        } else {
                            float[] fArr = A04;
                            int sarHeight = fArr.length;
                            if (aspectRatioIdc < sarHeight) {
                                f = fArr[aspectRatioIdc];
                            } else {
                                Log.w(A07(0, 11, 97), A07(11, 35, 53) + aspectRatioIdc);
                            }
                        }
                    }
                }
            }
            return new IL(sarWidth, i9, i10, f, z, A0B, i5, A052, i6, z2);
        }
        throw new RuntimeException();
    }

    public static void A0A(IR ir, int nextScale) {
        int i = 8;
        int deltaScale = 8;
        for (int i2 = 0; i2 < nextScale; i2++) {
            if (deltaScale != 0) {
                int deltaScale2 = ir.A04();
                deltaScale = ((deltaScale2 + i) + 256) % 256;
            }
            if (deltaScale != 0) {
                i = deltaScale;
            }
        }
    }

    public static void A0B(ByteBuffer byteBuffer) {
        int consecutiveZeros = byteBuffer.position();
        int offset = 0;
        for (int value = 0; value + 1 < consecutiveZeros; value++) {
            int i = byteBuffer.get(value) & 255;
            if (offset == 3) {
                if (i == 1 && (byteBuffer.get(value + 1) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(value - 3);
                    duplicate.limit(consecutiveZeros);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i == 0) {
                offset++;
            }
            if (i != 0) {
                offset = 0;
            }
        }
        byteBuffer.clear();
        if (A02[1].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "LhexrLoV7v0KAfJEyFTOZZKZaNSS1gs0";
        strArr[4] = "gpIVcqUVkpQz0S61taD9WNDesiV6owqm";
    }

    public static void A0C(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0D(String str, byte b) {
        if (A07(46, 9, 52).equals(str) && (b & 31) == 6) {
            return true;
        }
        return A07(55, 10, 68).equals(str) && ((b & 126) >> 1) == 39;
    }
}