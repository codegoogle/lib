package com.p7700g.p99005;

/* compiled from: Base64.java */
/* loaded from: classes3.dex */
public final class yw3 {
    private static final int a = 256;
    private static final int b = 64;
    private static final int c = 24;
    private static final int d = 8;
    private static final int e = 16;
    private static final int f = 4;
    private static final int g = -128;
    private static final byte h = 61;
    private static byte[] i = new byte[256];
    private static byte[] j = new byte[64];
    public static final int[] k;

    static {
        int i2;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < 256; i5++) {
            i[i5] = -1;
        }
        for (int i6 = 90; i6 >= 65; i6--) {
            i[i6] = (byte) (i6 - 65);
        }
        int i7 = 122;
        while (true) {
            i2 = 26;
            if (i7 < 97) {
                break;
            }
            i[i7] = (byte) ((i7 - 97) + 26);
            i7--;
        }
        int i8 = 57;
        while (true) {
            i3 = 52;
            if (i8 < 48) {
                break;
            }
            i[i8] = (byte) ((i8 - 48) + 52);
            i8--;
        }
        byte[] bArr = i;
        bArr[43] = 62;
        bArr[47] = ax5.a;
        for (int i9 = 0; i9 <= 25; i9++) {
            j[i9] = (byte) (i9 + 65);
        }
        int i10 = 0;
        while (i2 <= 51) {
            j[i2] = (byte) (i10 + 97);
            i2++;
            i10++;
        }
        while (i3 <= 61) {
            j[i3] = (byte) (i4 + 48);
            i3++;
            i4++;
        }
        byte[] bArr2 = j;
        bArr2[62] = 43;
        bArr2[63] = 47;
        k = new int[]{64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 62, 64, 64, 64, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 64, 64, 64, 64, 64, 64, 64, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 64, 64, 64, 64, 64, 64, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64};
    }

    public static String a(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = 0;
        for (char c2 : charArray) {
            int i4 = k[c2 & 255];
            if (i4 < 64) {
                i2 = (i2 << 6) | i4;
                i3 += 6;
                if (i3 >= 8) {
                    i3 -= 8;
                    sb.append((char) ((i2 >> i3) & 255));
                }
            }
        }
        return sb.toString();
    }

    public static byte[] b(String str) {
        return c(str.getBytes());
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = bArr.length / 4;
        int length2 = bArr.length;
        while (bArr[length2 - 1] == 61) {
            length2--;
            if (length2 == 0) {
                return new byte[0];
            }
        }
        byte[] bArr2 = new byte[length2 - length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 4;
            byte b2 = bArr[i4 + 2];
            byte b3 = bArr[i4 + 3];
            byte[] bArr3 = i;
            byte b4 = bArr3[bArr[i4]];
            byte b5 = bArr3[bArr[i4 + 1]];
            if (b2 != 61 && b3 != 61) {
                byte b6 = bArr3[b2];
                byte b7 = bArr3[b3];
                bArr2[i2] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i2 + 1] = (byte) (((b5 & 15) << 4) | ((b6 >> 2) & 15));
                bArr2[i2 + 2] = (byte) ((b6 << 6) | b7);
            } else if (b2 == 61) {
                bArr2[i2] = (byte) ((b5 >> 4) | (b4 << 2));
            } else if (b3 == 61) {
                byte b8 = bArr3[b2];
                bArr2[i2] = (byte) ((b4 << 2) | (b5 >> 4));
                bArr2[i2 + 1] = (byte) (((b5 & 15) << 4) | ((b8 >> 2) & 15));
            }
            i2 += 3;
        }
        return bArr2;
    }

    public static byte[] d(String str) {
        return e(str.getBytes());
    }

    public static byte[] e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length * 8;
        int i2 = length % 24;
        int i3 = length / 24;
        if (i2 != 0) {
            bArr2 = new byte[(i3 + 1) * 4];
        } else {
            bArr2 = new byte[i3 * 4];
        }
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 * 3;
            byte b2 = bArr[i5];
            byte b3 = bArr[i5 + 1];
            byte b4 = bArr[i5 + 2];
            byte b5 = (byte) (b3 & 15);
            byte b6 = (byte) (b2 & 3);
            int i6 = i4 * 4;
            int i7 = b2 & g15.b;
            int i8 = b2 >> 2;
            if (i7 != 0) {
                i8 ^= yg1.K;
            }
            byte b7 = (byte) i8;
            int i9 = b3 & g15.b;
            int i10 = b3 >> 4;
            if (i9 != 0) {
                i10 ^= 240;
            }
            byte b8 = (byte) i10;
            int i11 = (b4 & g15.b) == 0 ? b4 >> 6 : (b4 >> 6) ^ 252;
            byte[] bArr3 = j;
            bArr2[i6] = bArr3[b7];
            bArr2[i6 + 1] = bArr3[b8 | (b6 << 4)];
            bArr2[i6 + 2] = bArr3[(b5 << 2) | ((byte) i11)];
            bArr2[i6 + 3] = bArr3[b4 & ax5.a];
            i4++;
        }
        int i12 = i4 * 3;
        int i13 = i4 * 4;
        if (i2 == 8) {
            byte b9 = bArr[i12];
            byte b10 = (byte) (b9 & 3);
            int i14 = b9 & g15.b;
            int i15 = b9 >> 2;
            if (i14 != 0) {
                i15 ^= yg1.K;
            }
            byte[] bArr4 = j;
            bArr2[i13] = bArr4[(byte) i15];
            bArr2[i13 + 1] = bArr4[b10 << 4];
            bArr2[i13 + 2] = h;
            bArr2[i13 + 3] = h;
        } else if (i2 == 16) {
            byte b11 = bArr[i12];
            byte b12 = bArr[i12 + 1];
            byte b13 = (byte) (b12 & 15);
            byte b14 = (byte) (b11 & 3);
            int i16 = b11 & g15.b;
            int i17 = b11 >> 2;
            if (i16 != 0) {
                i17 ^= yg1.K;
            }
            byte b15 = (byte) i17;
            int i18 = b12 & g15.b;
            int i19 = b12 >> 4;
            if (i18 != 0) {
                i19 ^= 240;
            }
            byte[] bArr5 = j;
            bArr2[i13] = bArr5[b15];
            bArr2[i13 + 1] = bArr5[((byte) i19) | (b14 << 4)];
            bArr2[i13 + 2] = bArr5[b13 << 2];
            bArr2[i13 + 3] = h;
        }
        return bArr2;
    }

    public static boolean f(byte[] bArr) {
        if (bArr.length == 0) {
            return true;
        }
        for (byte b2 : bArr) {
            if (!g(b2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(byte b2) {
        return b2 == 61 || i[(b2 & 15) + (b2 & 240)] != -1;
    }

    public static boolean h(String str) {
        return f(str.getBytes());
    }
}