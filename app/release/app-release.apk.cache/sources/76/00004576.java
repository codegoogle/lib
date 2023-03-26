package com.p7700g.p99005;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: -Utf8.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "beginIndex", "endIndex", "", "b", "([BII)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class gx5 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        int i;
        int i2;
        char charAt;
        c25.p(str, "$this$commonAsUtf8ToByteArray");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char charAt2 = str.charAt(i3);
            if (c25.t(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i4 = i3;
                while (i3 < length2) {
                    char charAt3 = str.charAt(i3);
                    if (c25.t(charAt3, 128) < 0) {
                        int i5 = i4 + 1;
                        bArr[i4] = (byte) charAt3;
                        i3++;
                        while (i3 < length2 && c25.t(str.charAt(i3), 128) < 0) {
                            bArr[i5] = (byte) str.charAt(i3);
                            i3++;
                            i5++;
                        }
                        i4 = i5;
                    } else {
                        if (c25.t(charAt3, 2048) < 0) {
                            int i6 = i4 + 1;
                            bArr[i4] = (byte) ((charAt3 >> 6) | yg1.K);
                            i = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i7 = i4 + 1;
                            bArr[i4] = (byte) ((charAt3 >> '\f') | 224);
                            int i8 = i7 + 1;
                            bArr[i7] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 & '?') | 128);
                        } else if (c25.t(charAt3, 56319) > 0 || length2 <= (i2 = i3 + 1) || 56320 > (charAt = str.charAt(i2)) || 57343 < charAt) {
                            i = i4 + 1;
                            bArr[i4] = ax5.a;
                        } else {
                            int charAt4 = (str.charAt(i2) + (charAt3 << '\n')) - 56613888;
                            int i9 = i4 + 1;
                            bArr[i4] = (byte) ((charAt4 >> 18) | 240);
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i11 = i10 + 1;
                            bArr[i10] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i = i11 + 1;
                            bArr[i11] = (byte) ((charAt4 & 63) | 128);
                            i3 += 2;
                            i4 = i;
                        }
                        i3++;
                        i4 = i;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i4);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i3] = (byte) charAt2;
            i3++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        c25.o(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (((r12[r2] & 192) == 128) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
        if (((r12[r2] & 192) == 128) == false) goto L37;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String b(@NotNull byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        c25.p(bArr, "$this$commonToUtf8String");
        if (i >= 0 && i2 <= bArr.length && i <= i2) {
            char[] cArr = new char[i2 - i];
            int i7 = 0;
            while (i < i2) {
                byte b = bArr[i];
                if (b >= 0) {
                    i3 = i7 + 1;
                    cArr[i7] = (char) b;
                    i++;
                    while (i < i2 && bArr[i] >= 0) {
                        cArr[i3] = (char) bArr[i];
                        i++;
                        i3++;
                    }
                } else {
                    if ((b >> 5) == -2) {
                        int i8 = i + 1;
                        if (i2 <= i8) {
                            i3 = i7 + 1;
                            cArr[i7] = (char) ax5.c;
                        } else {
                            byte b2 = bArr[i];
                            byte b3 = bArr[i8];
                            if (!((b3 & 192) == 128)) {
                                i3 = i7 + 1;
                                cArr[i7] = (char) ax5.c;
                            } else {
                                int i9 = (b3 ^ g15.b) ^ (b2 << 6);
                                if (i9 < 128) {
                                    i3 = i7 + 1;
                                    cArr[i7] = (char) ax5.c;
                                } else {
                                    i3 = i7 + 1;
                                    cArr[i7] = (char) i9;
                                }
                                yq4 yq4Var = yq4.a;
                                i4 = 2;
                            }
                        }
                        yq4 yq4Var2 = yq4.a;
                        i4 = 1;
                    } else if ((b >> 4) == -2) {
                        int i10 = i + 2;
                        if (i2 <= i10) {
                            i3 = i7 + 1;
                            cArr[i7] = (char) ax5.c;
                            yq4 yq4Var3 = yq4.a;
                            int i11 = i + 1;
                            if (i2 > i11) {
                            }
                            i4 = 1;
                        } else {
                            byte b4 = bArr[i];
                            byte b5 = bArr[i + 1];
                            if (!((b5 & 192) == 128)) {
                                i3 = i7 + 1;
                                cArr[i7] = (char) ax5.c;
                                yq4 yq4Var22 = yq4.a;
                                i4 = 1;
                            } else {
                                byte b6 = bArr[i10];
                                if (!((b6 & 192) == 128)) {
                                    i3 = i7 + 1;
                                    cArr[i7] = (char) ax5.c;
                                    yq4 yq4Var4 = yq4.a;
                                    i4 = 2;
                                } else {
                                    int i12 = ((b6 ^ g15.b) ^ (b5 << 6)) ^ (b4 << 12);
                                    if (i12 < 2048) {
                                        i3 = i7 + 1;
                                        cArr[i7] = (char) ax5.c;
                                    } else if (55296 <= i12 && 57343 >= i12) {
                                        i3 = i7 + 1;
                                        cArr[i7] = (char) ax5.c;
                                    } else {
                                        i3 = i7 + 1;
                                        cArr[i7] = (char) i12;
                                    }
                                    yq4 yq4Var5 = yq4.a;
                                    i4 = 3;
                                }
                            }
                        }
                    } else {
                        if ((b >> 3) == -2) {
                            int i13 = i + 3;
                            if (i2 <= i13) {
                                i5 = i7 + 1;
                                cArr[i7] = ax5.b;
                                yq4 yq4Var6 = yq4.a;
                                int i14 = i + 1;
                                if (i2 > i14) {
                                    if ((bArr[i14] & 192) == 128) {
                                        int i15 = i + 2;
                                        if (i2 > i15) {
                                        }
                                        i6 = 2;
                                    }
                                }
                                i6 = 1;
                            } else {
                                byte b7 = bArr[i];
                                byte b8 = bArr[i + 1];
                                if (!((b8 & 192) == 128)) {
                                    i5 = i7 + 1;
                                    cArr[i7] = ax5.b;
                                    yq4 yq4Var7 = yq4.a;
                                    i6 = 1;
                                } else {
                                    byte b9 = bArr[i + 2];
                                    if (!((b9 & 192) == 128)) {
                                        i5 = i7 + 1;
                                        cArr[i7] = ax5.b;
                                        yq4 yq4Var8 = yq4.a;
                                        i6 = 2;
                                    } else {
                                        byte b10 = bArr[i13];
                                        if (!((b10 & 192) == 128)) {
                                            i5 = i7 + 1;
                                            cArr[i7] = ax5.b;
                                            yq4 yq4Var9 = yq4.a;
                                            i6 = 3;
                                        } else {
                                            int i16 = (((b10 ^ g15.b) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b7 << 18);
                                            if (i16 > 1114111) {
                                                i5 = i7 + 1;
                                                cArr[i7] = ax5.b;
                                            } else if (55296 <= i16 && 57343 >= i16) {
                                                i5 = i7 + 1;
                                                cArr[i7] = ax5.b;
                                            } else if (i16 < 65536) {
                                                i5 = i7 + 1;
                                                cArr[i7] = ax5.b;
                                            } else if (i16 != 65533) {
                                                int i17 = i7 + 1;
                                                cArr[i7] = (char) ((i16 >>> 10) + ax5.d);
                                                i5 = i17 + 1;
                                                cArr[i17] = (char) ((i16 & 1023) + ax5.e);
                                            } else {
                                                i5 = i7 + 1;
                                                cArr[i7] = ax5.b;
                                            }
                                            yq4 yq4Var10 = yq4.a;
                                            i6 = 4;
                                        }
                                    }
                                }
                            }
                            i += i6;
                        } else {
                            i5 = i7 + 1;
                            cArr[i7] = ax5.b;
                            i++;
                        }
                        i7 = i5;
                    }
                    i += i4;
                }
                i7 = i3;
            }
            return new String(cArr, 0, i7);
        }
        StringBuilder G = wo1.G("size=");
        G.append(bArr.length);
        G.append(" beginIndex=");
        G.append(i);
        G.append(" endIndex=");
        G.append(i2);
        throw new ArrayIndexOutOfBoundsException(G.toString());
    }

    public static /* synthetic */ String c(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return b(bArr, i, i2);
    }
}