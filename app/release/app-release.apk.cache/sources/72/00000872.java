package com.anythink.expressad.foundation.h;

import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.l64;
import com.p7700g.p99005.ni4;
import com.p7700g.p99005.yg1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {
    public static final int a = 256;
    private static Map<Character, Character> b = null;
    private static Map<Character, Character> c = null;
    private static final char[] d;
    private static char[] e = null;
    private static final char f = '=';
    private static final byte[] g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', ni4.Z, 't', 'u', l64.d, 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', j14.P};
        d = cArr;
        HashMap hashMap = new HashMap();
        b = hashMap;
        Character valueOf = Character.valueOf(l64.d);
        hashMap.put('A', valueOf);
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', 'd');
        b.put('I', 'R');
        b.put('J', 'z');
        b.put('K', 'p');
        b.put('L', 'W');
        b.put('M', 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put('R', 'x');
        b.put('S', 'Z');
        b.put('T', 'n');
        b.put('U', 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put('Y', 'D');
        b.put('Z', 'H');
        b.put('a', 'L');
        b.put('b', 'Y');
        b.put('c', 'h');
        b.put('d', 'J');
        b.put('e', '4');
        b.put('f', '6');
        b.put('g', 'l');
        b.put('h', 't');
        b.put('i', '0');
        b.put('j', 'U');
        b.put('k', '3');
        b.put('l', 'Q');
        b.put('m', 'r');
        b.put('n', 'g');
        b.put('o', 'E');
        b.put('p', 'u');
        b.put('q', 'q');
        b.put('r', '8');
        b.put(Character.valueOf(ni4.Z), Character.valueOf(ni4.Z));
        b.put('t', 'w');
        b.put('u', Character.valueOf(j14.P));
        b.put(valueOf, 'X');
        b.put('w', 'M');
        b.put('x', 'e');
        b.put('y', 'B');
        b.put('z', 'A');
        b.put('0', 'T');
        b.put('1', '2');
        b.put('2', 'F');
        b.put('3', 'b');
        b.put('4', '9');
        b.put('5', 'P');
        b.put('6', '1');
        b.put('7', 'O');
        b.put('8', 'I');
        b.put('9', 'K');
        b.put('+', 'm');
        b.put(Character.valueOf(j14.P), 'C');
        e = new char[cArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            char[] cArr2 = d;
            if (i2 >= cArr2.length) {
                break;
            }
            e[i2] = b.get(Character.valueOf(cArr2[i2])).charValue();
            i2++;
        }
        g = new byte[128];
        int i3 = 0;
        while (true) {
            byte[] bArr = g;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = g15.c;
            i3++;
        }
        while (true) {
            char[] cArr3 = e;
            if (i >= cArr3.length) {
                return;
            }
            g[cArr3[i]] = (byte) i;
            i++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i) {
        try {
            char c2 = cArr[3] == '=' ? (char) 2 : (char) 3;
            if (cArr[2] == '=') {
                c2 = 1;
            }
            byte[] bArr2 = g;
            byte b2 = bArr2[cArr[0]];
            byte b3 = bArr2[cArr[1]];
            byte b4 = bArr2[cArr[2]];
            byte b5 = bArr2[cArr[3]];
            if (c2 == 2) {
                bArr[i] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[i + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
                return 2;
            } else if (c2 != 3) {
                bArr[i] = (byte) (((b2 << 2) & 252) | (3 & (b3 >> 4)));
                return 1;
            } else {
                int i2 = i + 1;
                bArr[i] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
                bArr[i2] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
                bArr[i2 + 1] = (byte) ((b5 & ax5.a) | ((b4 << 6) & yg1.K));
                return 3;
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, bytes.length);
    }

    private static byte[] c(String str) {
        int i;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i2 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int i6 = i3 + 256;
                if (i6 <= length) {
                    str.getChars(i3, i6, cArr, i5);
                    i = i5 + 256;
                } else {
                    str.getChars(i3, length, cArr, i5);
                    i = (length - i3) + i5;
                }
                int i7 = i5;
                while (i5 < i) {
                    char c2 = cArr[i5];
                    if (c2 != '=') {
                        byte[] bArr2 = g;
                        if (c2 < bArr2.length) {
                            if (bArr2[c2] == Byte.MAX_VALUE) {
                            }
                        }
                        i5++;
                    }
                    int i8 = i7 + 1;
                    cArr[i7] = c2;
                    if (i8 == 4) {
                        i4 += a(cArr, bArr, i4);
                        i7 = 0;
                    } else {
                        i7 = i8;
                    }
                    i5++;
                }
                i3 = i6;
                i5 = i7;
            }
            if (i4 == i2) {
                return bArr;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(char[] cArr, int i, int i2) {
        try {
            char[] cArr2 = new char[4];
            int i3 = ((i2 >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = i; i6 < i + i2; i6++) {
                char c2 = cArr[i6];
                if (c2 != '=') {
                    byte[] bArr2 = g;
                    if (c2 < bArr2.length) {
                        if (bArr2[c2] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i7 = i5 + 1;
                cArr2[i5] = c2;
                if (i7 == 4) {
                    i4 += a(cArr2, bArr, i4);
                    i5 = 0;
                } else {
                    i5 = i7;
                }
            }
            if (i4 == i3) {
                return bArr;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c2 = c(str);
        if (c2 == null || c2.length <= 0) {
            return null;
        }
        return new String(c2);
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i) {
        if (i <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i / 3) << 2) + 4];
            int i2 = 0;
            int i3 = 0;
            while (i >= 3) {
                int i4 = ((bArr[i2] & 255) << 16) + ((bArr[i2 + 1] & 255) << 8) + (bArr[i2 + 2] & 255);
                int i5 = i3 + 1;
                char[] cArr2 = e;
                cArr[i3] = cArr2[i4 >> 18];
                int i6 = i5 + 1;
                cArr[i5] = cArr2[(i4 >> 12) & 63];
                int i7 = i6 + 1;
                cArr[i6] = cArr2[(i4 >> 6) & 63];
                i3 = i7 + 1;
                cArr[i7] = cArr2[i4 & 63];
                i2 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i8 = bArr[i2] & 255;
                int i9 = i3 + 1;
                char[] cArr3 = e;
                cArr[i3] = cArr3[i8 >> 2];
                int i10 = i9 + 1;
                cArr[i9] = cArr3[(i8 << 4) & 63];
                int i11 = i10 + 1;
                cArr[i10] = f;
                i3 = i11 + 1;
                cArr[i11] = f;
            } else if (i == 2) {
                int i12 = ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
                int i13 = i3 + 1;
                char[] cArr4 = e;
                cArr[i3] = cArr4[i12 >> 10];
                int i14 = i13 + 1;
                cArr[i13] = cArr4[(i12 >> 4) & 63];
                int i15 = i14 + 1;
                cArr[i14] = cArr4[(i12 << 2) & 63];
                i3 = i15 + 1;
                cArr[i15] = f;
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}