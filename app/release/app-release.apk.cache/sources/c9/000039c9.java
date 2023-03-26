package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import org.jetbrains.annotations.NotNull;

/* compiled from: Utf8.kt */
@fz4(name = "Utf8")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\"\u0016\u0010\u001e\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d\"\u0016\u0010 \u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u001f\"\u0016\u0010!\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001d\"\u0016\u0010#\u001a\u00020\u00178\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\"\"\u0016\u0010$\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0016\u0010%\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d\"\u0016\u0010&\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d\"\u0016\u0010'\u001a\u00020\u00018\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"", "", "beginIndex", "endIndex", "", "k", "(Ljava/lang/String;II)J", "codePoint", "", "a", "(I)Z", "", "byte", "b", "(B)Z", "Lkotlin/Function1;", "Lcom/p7700g/p99005/yq4;", "yield", com.anythink.basead.d.g.i, "(Ljava/lang/String;IILcom/p7700g/p99005/f05;)V", "", "h", "([BIILcom/p7700g/p99005/f05;)V", "", "f", "c", "([BIILcom/p7700g/p99005/f05;)I", "d", "e", AFHydra.STATUS_IDLE, "MASK_2BYTES", AFHydra.EV_BYTECOUNT, "REPLACEMENT_BYTE", "REPLACEMENT_CODE_POINT", "C", "REPLACEMENT_CHARACTER", "LOG_SURROGATE_HEADER", "MASK_4BYTES", "MASK_3BYTES", "HIGH_SURROGATE_HEADER", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ax5 {
    public static final byte a = 63;
    public static final char b = 65533;
    public static final int c = 65533;
    public static final int d = 55232;
    public static final int e = 56320;
    public static final int f = 3968;
    public static final int g = -123008;
    public static final int h = 3678080;

    public static final boolean a(int i) {
        return (i >= 0 && 31 >= i) || (127 <= i && 159 >= i);
    }

    public static final boolean b(byte b2) {
        return (b2 & 192) == 128;
    }

    public static final int c(@NotNull byte[] bArr, int i, int i2, @NotNull f05<? super Integer, yq4> f05Var) {
        c25.p(bArr, "$this$process2Utf8Bytes");
        c25.p(f05Var, "yield");
        int i3 = i + 1;
        Integer valueOf = Integer.valueOf((int) c);
        if (i2 <= i3) {
            f05Var.M(valueOf);
            return 1;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i3];
        if (!((b3 & 192) == 128)) {
            f05Var.M(valueOf);
            return 1;
        }
        int i4 = (b3 ^ g15.b) ^ (b2 << 6);
        if (i4 < 128) {
            f05Var.M(valueOf);
            return 2;
        }
        f05Var.M(Integer.valueOf(i4));
        return 2;
    }

    public static final int d(@NotNull byte[] bArr, int i, int i2, @NotNull f05<? super Integer, yq4> f05Var) {
        c25.p(bArr, "$this$process3Utf8Bytes");
        c25.p(f05Var, "yield");
        int i3 = i + 2;
        Integer valueOf = Integer.valueOf((int) c);
        if (i2 <= i3) {
            f05Var.M(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (!((b3 & 192) == 128)) {
            f05Var.M(valueOf);
            return 1;
        }
        byte b4 = bArr[i3];
        if (!((b4 & 192) == 128)) {
            f05Var.M(valueOf);
            return 2;
        }
        int i5 = ((b4 ^ g15.b) ^ (b3 << 6)) ^ (b2 << 12);
        if (i5 < 2048) {
            f05Var.M(valueOf);
            return 3;
        } else if (55296 <= i5 && 57343 >= i5) {
            f05Var.M(valueOf);
            return 3;
        } else {
            f05Var.M(Integer.valueOf(i5));
            return 3;
        }
    }

    public static final int e(@NotNull byte[] bArr, int i, int i2, @NotNull f05<? super Integer, yq4> f05Var) {
        c25.p(bArr, "$this$process4Utf8Bytes");
        c25.p(f05Var, "yield");
        int i3 = i + 3;
        Integer valueOf = Integer.valueOf((int) c);
        if (i2 <= i3) {
            f05Var.M(valueOf);
            int i4 = i + 1;
            if (i2 > i4) {
                if ((bArr[i4] & 192) == 128) {
                    int i5 = i + 2;
                    if (i2 > i5) {
                        if ((bArr[i5] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (!((b3 & 192) == 128)) {
            f05Var.M(valueOf);
            return 1;
        }
        byte b4 = bArr[i + 2];
        if (!((b4 & 192) == 128)) {
            f05Var.M(valueOf);
            return 2;
        }
        byte b5 = bArr[i3];
        if (!((b5 & 192) == 128)) {
            f05Var.M(valueOf);
            return 3;
        }
        int i6 = (((b5 ^ g15.b) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
        if (i6 > 1114111) {
            f05Var.M(valueOf);
            return 4;
        } else if (55296 <= i6 && 57343 >= i6) {
            f05Var.M(valueOf);
            return 4;
        } else if (i6 < 65536) {
            f05Var.M(valueOf);
            return 4;
        } else {
            f05Var.M(Integer.valueOf(i6));
            return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(@NotNull byte[] bArr, int i, int i2, @NotNull f05<? super Character, yq4> f05Var) {
        int i3;
        c25.p(bArr, "$this$processUtf16Chars");
        c25.p(f05Var, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                f05Var.M(Character.valueOf((char) b2));
                i4++;
                while (i4 < i2 && bArr[i4] >= 0) {
                    f05Var.M(Character.valueOf((char) bArr[i4]));
                    i4++;
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i4];
                        byte b4 = bArr[i5];
                        if ((b4 & 192) == 128) {
                            int i6 = (b4 ^ g15.b) ^ (b3 << 6);
                            f05Var.M(Character.valueOf(i6 < 128 ? (char) c : (char) i6));
                            yq4 yq4Var = yq4.a;
                            i3 = 2;
                        }
                    }
                    f05Var.M(Character.valueOf((char) c));
                    yq4 yq4Var2 = yq4.a;
                    i3 = 1;
                } else if ((b2 >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        f05Var.M(Character.valueOf((char) c));
                        yq4 yq4Var3 = yq4.a;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                        }
                        i3 = 1;
                    } else {
                        byte b5 = bArr[i4];
                        byte b6 = bArr[i4 + 1];
                        if (!((b6 & 192) == 128)) {
                            f05Var.M(Character.valueOf((char) c));
                            yq4 yq4Var4 = yq4.a;
                            i3 = 1;
                        } else {
                            byte b7 = bArr[i7];
                            if ((b7 & 192) == 128) {
                                int i9 = ((b7 ^ g15.b) ^ (b6 << 6)) ^ (b5 << 12);
                                f05Var.M(Character.valueOf((i9 >= 2048 && (55296 > i9 || 57343 < i9)) ? (char) i9 : (char) c));
                                yq4 yq4Var5 = yq4.a;
                                i3 = 3;
                            } else {
                                f05Var.M(Character.valueOf((char) c));
                                yq4 yq4Var6 = yq4.a;
                                i3 = 2;
                            }
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        f05Var.M(Character.valueOf(b));
                        yq4 yq4Var7 = yq4.a;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b8 = bArr[i4];
                        byte b9 = bArr[i4 + 1];
                        if (!((b9 & 192) == 128)) {
                            f05Var.M(Character.valueOf(b));
                            yq4 yq4Var8 = yq4.a;
                            i3 = 1;
                        } else {
                            byte b10 = bArr[i4 + 2];
                            if (!((b10 & 192) == 128)) {
                                f05Var.M(Character.valueOf(b));
                                yq4 yq4Var9 = yq4.a;
                                i3 = 2;
                            } else {
                                byte b11 = bArr[i10];
                                if (!((b11 & 192) == 128)) {
                                    f05Var.M(Character.valueOf(b));
                                    yq4 yq4Var10 = yq4.a;
                                    i3 = 3;
                                } else {
                                    int i13 = (((b11 ^ g15.b) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
                                    if (i13 > 1114111 || ((55296 <= i13 && 57343 >= i13) || i13 < 65536 || i13 == 65533)) {
                                        f05Var.M(Character.valueOf(b));
                                    } else {
                                        f05Var.M(Character.valueOf((char) ((i13 >>> 10) + d)));
                                        f05Var.M(Character.valueOf((char) ((i13 & 1023) + e)));
                                    }
                                    yq4 yq4Var11 = yq4.a;
                                    i3 = 4;
                                }
                            }
                        }
                    }
                } else {
                    f05Var.M(Character.valueOf(b));
                    i4++;
                }
                i4 += i3;
            }
        }
    }

    public static final void g(@NotNull String str, int i, int i2, @NotNull f05<? super Byte, yq4> f05Var) {
        int i3;
        char charAt;
        c25.p(str, "$this$processUtf8Bytes");
        c25.p(f05Var, "yield");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (c25.t(charAt2, 128) < 0) {
                f05Var.M(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && c25.t(str.charAt(i), 128) < 0) {
                    f05Var.M(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (c25.t(charAt2, 2048) < 0) {
                    f05Var.M(Byte.valueOf((byte) ((charAt2 >> 6) | yg1.K)));
                    f05Var.M(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 <= charAt2 && 57343 >= charAt2) {
                    if (c25.t(charAt2, 56319) <= 0 && i2 > (i3 = i + 1) && 56320 <= (charAt = str.charAt(i3)) && 57343 >= charAt) {
                        int charAt3 = (str.charAt(i3) + (charAt2 << '\n')) - 56613888;
                        f05Var.M(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                        f05Var.M(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                        f05Var.M(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                        f05Var.M(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                        i += 2;
                    } else {
                        f05Var.M(Byte.valueOf((byte) a));
                    }
                } else {
                    f05Var.M(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    f05Var.M(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    f05Var.M(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                }
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
        if (((r16[r4] & 192) == 128) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(@NotNull byte[] bArr, int i, int i2, @NotNull f05<? super Integer, yq4> f05Var) {
        int i3;
        c25.p(bArr, "$this$processUtf8CodePoints");
        c25.p(f05Var, "yield");
        int i4 = i;
        while (i4 < i2) {
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                f05Var.M(Integer.valueOf(b2));
                i4++;
                while (i4 < i2 && bArr[i4] >= 0) {
                    f05Var.M(Integer.valueOf(bArr[i4]));
                    i4++;
                }
            } else {
                if ((b2 >> 5) == -2) {
                    int i5 = i4 + 1;
                    if (i2 > i5) {
                        byte b3 = bArr[i4];
                        byte b4 = bArr[i5];
                        if ((b4 & 192) == 128) {
                            int i6 = (b4 ^ g15.b) ^ (b3 << 6);
                            f05Var.M(i6 < 128 ? Integer.valueOf((int) c) : Integer.valueOf(i6));
                            yq4 yq4Var = yq4.a;
                            i3 = 2;
                        }
                    }
                    f05Var.M(Integer.valueOf((int) c));
                    yq4 yq4Var2 = yq4.a;
                    i3 = 1;
                } else if ((b2 >> 4) == -2) {
                    int i7 = i4 + 2;
                    if (i2 <= i7) {
                        f05Var.M(Integer.valueOf((int) c));
                        yq4 yq4Var3 = yq4.a;
                        int i8 = i4 + 1;
                        if (i2 > i8) {
                        }
                        i3 = 1;
                    } else {
                        byte b5 = bArr[i4];
                        byte b6 = bArr[i4 + 1];
                        if (!((b6 & 192) == 128)) {
                            f05Var.M(Integer.valueOf((int) c));
                            yq4 yq4Var4 = yq4.a;
                            i3 = 1;
                        } else {
                            byte b7 = bArr[i7];
                            if ((b7 & 192) == 128) {
                                int i9 = ((b7 ^ g15.b) ^ (b6 << 6)) ^ (b5 << 12);
                                f05Var.M((i9 >= 2048 && (55296 > i9 || 57343 < i9)) ? Integer.valueOf(i9) : Integer.valueOf((int) c));
                                yq4 yq4Var5 = yq4.a;
                                i3 = 3;
                            } else {
                                f05Var.M(Integer.valueOf((int) c));
                                yq4 yq4Var6 = yq4.a;
                                i3 = 2;
                            }
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i10 = i4 + 3;
                    if (i2 <= i10) {
                        f05Var.M(Integer.valueOf((int) c));
                        yq4 yq4Var7 = yq4.a;
                        int i11 = i4 + 1;
                        if (i2 > i11) {
                            if ((bArr[i11] & 192) == 128) {
                                int i12 = i4 + 2;
                                if (i2 > i12) {
                                }
                                i3 = 2;
                            }
                        }
                        i3 = 1;
                    } else {
                        byte b8 = bArr[i4];
                        byte b9 = bArr[i4 + 1];
                        if (!((b9 & 192) == 128)) {
                            f05Var.M(Integer.valueOf((int) c));
                            yq4 yq4Var8 = yq4.a;
                            i3 = 1;
                        } else {
                            byte b10 = bArr[i4 + 2];
                            if (!((b10 & 192) == 128)) {
                                f05Var.M(Integer.valueOf((int) c));
                                yq4 yq4Var9 = yq4.a;
                                i3 = 2;
                            } else {
                                byte b11 = bArr[i10];
                                if ((b11 & 192) == 128) {
                                    int i13 = (((b11 ^ g15.b) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
                                    f05Var.M((i13 <= 1114111 && (55296 > i13 || 57343 < i13) && i13 >= 65536) ? Integer.valueOf(i13) : Integer.valueOf((int) c));
                                    yq4 yq4Var10 = yq4.a;
                                    i3 = 4;
                                } else {
                                    f05Var.M(Integer.valueOf((int) c));
                                    yq4 yq4Var11 = yq4.a;
                                    i3 = 3;
                                }
                            }
                        }
                    }
                } else {
                    f05Var.M(Integer.valueOf((int) c));
                    i4++;
                }
                i4 += i3;
            }
        }
    }

    @gz4
    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public static final long i(@NotNull String str) {
        return l(str, 0, 0, 3, null);
    }

    @gz4
    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public static final long j(@NotNull String str, int i) {
        return l(str, i, 0, 2, null);
    }

    @gz4
    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public static final long k(@NotNull String str, int i, int i2) {
        int i3;
        c25.p(str, "$this$utf8Size");
        if (i >= 0) {
            if (i2 >= i) {
                if (!(i2 <= str.length())) {
                    StringBuilder H = wo1.H("endIndex > string.length: ", i2, " > ");
                    H.append(str.length());
                    throw new IllegalArgumentException(H.toString().toString());
                }
                long j = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i3 = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i3 = 3;
                        } else {
                            int i4 = i + 1;
                            char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j++;
                                i = i4;
                            } else {
                                j += 4;
                                i += 2;
                            }
                        }
                        j += i3;
                    }
                    i++;
                }
                return j;
            }
            throw new IllegalArgumentException(wo1.o("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(wo1.l("beginIndex < 0: ", i).toString());
    }

    public static /* synthetic */ long l(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return k(str, i, i2);
    }
}