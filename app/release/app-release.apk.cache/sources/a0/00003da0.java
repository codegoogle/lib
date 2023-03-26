package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ByteString.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\b\u001a$\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0014\u0010\u0018\u001a\u00020\u0015*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0017\u001a4\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a4\u0010 \u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b \u0010!\u001a\u001c\u0010#\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010%\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\"\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010(\u001a\u00020\u001d*\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010$\u001a\u001c\u0010)\u001a\u00020\u001d*\u00020\u00002\u0006\u0010'\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b)\u0010&\u001a$\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b+\u0010,\u001a$\u0010-\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b-\u0010.\u001a$\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u0010,\u001a\u001e\u00101\u001a\u00020\u001d*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u000100H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u0010\u0014\u001a\u001c\u00104\u001a\u00020\n*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b4\u00105\u001a\u0018\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b7\u00108\u001a$\u00109\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u0014\u0010;\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b;\u0010<\u001a\u0016\u0010=\u001a\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b=\u0010<\u001a\u0014\u0010>\u001a\u00020\u0000*\u00020\u0001H\u0080\b¢\u0006\u0004\b>\u0010<\u001a+\u0010B\u001a\u00020A*\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0000¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020\n2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010G\u001a\u0014\u0010H\u001a\u00020\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\bH\u0010\u0003\u001a\u001f\u0010E\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00152\u0006\u0010I\u001a\u00020\nH\u0002¢\u0006\u0004\bE\u0010J\"\u001c\u0010P\u001a\u00020K8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/p7700g/p99005/vv5;", "", "F", "(Lcom/p7700g/p99005/vv5;)Ljava/lang/String;", "d", "e", "p", bx.B4, "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", AFHydra.EV_BYTECOUNT, "", "beginIndex", "endIndex", "z", "(Lcom/p7700g/p99005/vv5;II)Lcom/p7700g/p99005/vv5;", "pos", "", com.anythink.expressad.d.a.b.dH, "(Lcom/p7700g/p99005/vv5;I)B", "n", "(Lcom/p7700g/p99005/vv5;)I", "", "C", "(Lcom/p7700g/p99005/vv5;)[B", "r", "offset", "other", "otherOffset", "byteCount", "", com.ironsource.sdk.controller.v.a, "(Lcom/p7700g/p99005/vv5;ILcom/p7700g/p99005/vv5;II)Z", "w", "(Lcom/p7700g/p99005/vv5;I[BII)Z", "prefix", "x", "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/vv5;)Z", "y", "(Lcom/p7700g/p99005/vv5;[B)Z", "suffix", "j", "k", "fromIndex", "q", "(Lcom/p7700g/p99005/vv5;[BI)I", "s", "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/vv5;I)I", "t", "", "l", "(Lcom/p7700g/p99005/vv5;Ljava/lang/Object;)Z", ij3.b, "f", "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/vv5;)I", "data", "u", "([B)Lcom/p7700g/p99005/vv5;", "D", "([BII)Lcom/p7700g/p99005/vv5;", "i", "(Ljava/lang/String;)Lcom/p7700g/p99005/vv5;", com.anythink.basead.d.g.i, "h", "Lcom/p7700g/p99005/sv5;", "buffer", "Lcom/p7700g/p99005/yq4;", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/sv5;II)V", "", "c", "H", "(C)I", "E", "codePointCount", "([BI)I", "", "a", "[C", AFHydra.STATUS_IDLE, "()[C", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class cx5 {
    @NotNull
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NotNull
    public static final vv5 A(@NotNull vv5 vv5Var) {
        byte b;
        c25.p(vv5Var, "$this$commonToAsciiLowercase");
        for (int i = 0; i < vv5Var.B().length; i++) {
            byte b2 = vv5Var.B()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] B = vv5Var.B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new vv5(copyOf);
            }
        }
        return vv5Var;
    }

    @NotNull
    public static final vv5 B(@NotNull vv5 vv5Var) {
        byte b;
        c25.p(vv5Var, "$this$commonToAsciiUppercase");
        for (int i = 0; i < vv5Var.B().length; i++) {
            byte b2 = vv5Var.B()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] B = vv5Var.B();
                byte[] copyOf = Arrays.copyOf(B, B.length);
                c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new vv5(copyOf);
            }
        }
        return vv5Var;
    }

    @NotNull
    public static final byte[] C(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonToByteArray");
        byte[] B = vv5Var.B();
        byte[] copyOf = Arrays.copyOf(B, B.length);
        c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public static final vv5 D(@NotNull byte[] bArr, int i, int i2) {
        c25.p(bArr, "$this$commonToByteString");
        pv5.e(bArr.length, i, i2);
        return new vv5(zr4.G1(bArr, i, i2 + i));
    }

    @NotNull
    public static final String E(@NotNull vv5 vv5Var) {
        vv5 vv5Var2 = vv5Var;
        c25.p(vv5Var2, "$this$commonToString");
        if (vv5Var.B().length == 0) {
            return "[size=0]";
        }
        int c = c(vv5Var.B(), 64);
        if (c == -1) {
            if (vv5Var.B().length <= 64) {
                StringBuilder G = wo1.G("[hex=");
                G.append(vv5Var.H());
                G.append(f14.v);
                return G.toString();
            }
            StringBuilder G2 = wo1.G("[size=");
            G2.append(vv5Var.B().length);
            G2.append(" hex=");
            if (64 <= vv5Var.B().length) {
                if (64 != vv5Var.B().length) {
                    vv5Var2 = new vv5(zr4.G1(vv5Var.B(), 0, 64));
                }
                G2.append(vv5Var2.H());
                G2.append("…]");
                return G2.toString();
            }
            throw new IllegalArgumentException(wo1.y(wo1.G("endIndex > length("), vv5Var.B().length, ')').toString());
        }
        String p4 = vv5Var.p4();
        Objects.requireNonNull(p4, "null cannot be cast to non-null type java.lang.String");
        String substring = p4.substring(0, c);
        c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String k2 = b95.k2(b95.k2(b95.k2(substring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        if (c < p4.length()) {
            StringBuilder G3 = wo1.G("[size=");
            G3.append(vv5Var.B().length);
            G3.append(" text=");
            G3.append(k2);
            G3.append("…]");
            return G3.toString();
        }
        return "[text=" + k2 + f14.v;
    }

    @NotNull
    public static final String F(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonUtf8");
        String G = vv5Var.G();
        if (G == null) {
            String c = ov5.c(vv5Var.T());
            vv5Var.p3(c);
            return c;
        }
        return G;
    }

    public static final void G(@NotNull vv5 vv5Var, @NotNull sv5 sv5Var, int i, int i2) {
        c25.p(vv5Var, "$this$commonWrite");
        c25.p(sv5Var, "buffer");
        sv5Var.V0(vv5Var.B(), i, i2);
    }

    public static final int H(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final char[] I() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x0068, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(byte[] bArr, int i) {
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b = bArr[i3];
            if (b >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if (b != 10 && b != 13) {
                    if ((b >= 0 && 31 >= b) || (Byte.MAX_VALUE <= b && 159 >= b)) {
                        return -1;
                    }
                }
                if (b == 65533) {
                    return -1;
                }
                i4 += b < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && bArr[i3] >= 0) {
                        int i7 = i3 + 1;
                        byte b2 = bArr[i3];
                        i6 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if (b2 != 10 && b2 != 13) {
                            if ((b2 >= 0 && 31 >= b2) || (Byte.MAX_VALUE <= b2 && 159 >= b2)) {
                                break loop0;
                            }
                        }
                        if (b2 == 65533) {
                            break loop0;
                        }
                        i4 += b2 < 65536 ? 1 : 2;
                        i3 = i7;
                    }
                }
            } else {
                if ((b >> 5) == -2) {
                    int i8 = i3 + 1;
                    if (length <= i8) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b3 = bArr[i3];
                    byte b4 = bArr[i8];
                    if (!((b4 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i9 = (b4 ^ g15.b) ^ (b3 << 6);
                    if (i9 < 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    i2 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if (i9 != 10 && i9 != 13) {
                        if ((i9 >= 0 && 31 >= i9) || (127 <= i9 && 159 >= i9)) {
                            return -1;
                        }
                    }
                    if (i9 == 65533) {
                        return -1;
                    }
                    i4 += i9 < 65536 ? 1 : 2;
                    yq4 yq4Var = yq4.a;
                    i3 += 2;
                } else if ((b >> 4) == -2) {
                    int i10 = i3 + 2;
                    if (length <= i10) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b5 = bArr[i3];
                    byte b6 = bArr[i3 + 1];
                    if (!((b6 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i10];
                    if (!((b7 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i11 = ((b7 ^ g15.b) ^ (b6 << 6)) ^ (b5 << 12);
                    if (i11 < 2048) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (55296 <= i11 && 57343 >= i11) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else {
                        i2 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if (i11 != 10 && i11 != 13) {
                            if ((i11 >= 0 && 31 >= i11) || (127 <= i11 && 159 >= i11)) {
                                return -1;
                            }
                        }
                        if (i11 == 65533) {
                            return -1;
                        }
                        i4 += i11 < 65536 ? 1 : 2;
                        yq4 yq4Var2 = yq4.a;
                        i3 += 3;
                    }
                } else if ((b >> 3) != -2) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                } else {
                    int i12 = i3 + 3;
                    if (length <= i12) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i3];
                    byte b9 = bArr[i3 + 1];
                    if (!((b9 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b10 = bArr[i3 + 2];
                    if (!((b10 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b11 = bArr[i12];
                    if (!((b11 & 192) == 128)) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i13 = (((b11 ^ g15.b) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b8 << 18);
                    if (i13 > 1114111) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (55296 <= i13 && 57343 >= i13) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else if (i13 < 65536) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    } else {
                        i2 = i5 + 1;
                        if (i5 == i) {
                            return i4;
                        }
                        if (i13 != 10 && i13 != 13) {
                            if ((i13 >= 0 && 31 >= i13) || (127 <= i13 && 159 >= i13)) {
                                return -1;
                            }
                        }
                        if (i13 == 65533) {
                            return -1;
                        }
                        i4 += i13 < 65536 ? 1 : 2;
                        yq4 yq4Var3 = yq4.a;
                        i3 += 4;
                    }
                }
                i5 = i2;
            }
        }
        return i4;
    }

    @NotNull
    public static final String d(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonBase64");
        return gv5.c(vv5Var.B(), null, 1, null);
    }

    @NotNull
    public static final String e(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonBase64Url");
        return gv5.b(vv5Var.B(), gv5.e());
    }

    public static final int f(@NotNull vv5 vv5Var, @NotNull vv5 vv5Var2) {
        c25.p(vv5Var, "$this$commonCompareTo");
        c25.p(vv5Var2, "other");
        int C3 = vv5Var.C3();
        int C32 = vv5Var2.C3();
        int min = Math.min(C3, C32);
        for (int i = 0; i < min; i++) {
            int A = vv5Var.A(i) & 255;
            int A2 = vv5Var2.A(i) & 255;
            if (A != A2) {
                return A < A2 ? -1 : 1;
            }
        }
        if (C3 == C32) {
            return 0;
        }
        return C3 < C32 ? -1 : 1;
    }

    @Nullable
    public static final vv5 g(@NotNull String str) {
        c25.p(str, "$this$commonDecodeBase64");
        byte[] a2 = gv5.a(str);
        if (a2 != null) {
            return new vv5(a2);
        }
        return null;
    }

    @NotNull
    public static final vv5 h(@NotNull String str) {
        c25.p(str, "$this$commonDecodeHex");
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (H(str.charAt(i2 + 1)) + (H(str.charAt(i2)) << 4));
            }
            return new vv5(bArr);
        }
        throw new IllegalArgumentException(wo1.t("Unexpected hex string: ", str).toString());
    }

    @NotNull
    public static final vv5 i(@NotNull String str) {
        c25.p(str, "$this$commonEncodeUtf8");
        vv5 vv5Var = new vv5(ov5.a(str));
        vv5Var.p3(str);
        return vv5Var;
    }

    public static final boolean j(@NotNull vv5 vv5Var, @NotNull vv5 vv5Var2) {
        c25.p(vv5Var, "$this$commonEndsWith");
        c25.p(vv5Var2, "suffix");
        return vv5Var.d3(vv5Var.C3() - vv5Var2.C3(), vv5Var2, 0, vv5Var2.C3());
    }

    public static final boolean k(@NotNull vv5 vv5Var, @NotNull byte[] bArr) {
        c25.p(vv5Var, "$this$commonEndsWith");
        c25.p(bArr, "suffix");
        return vv5Var.i3(vv5Var.C3() - bArr.length, bArr, 0, bArr.length);
    }

    public static final boolean l(@NotNull vv5 vv5Var, @Nullable Object obj) {
        c25.p(vv5Var, "$this$commonEquals");
        if (obj == vv5Var) {
            return true;
        }
        if (obj instanceof vv5) {
            vv5 vv5Var2 = (vv5) obj;
            if (vv5Var2.C3() == vv5Var.B().length && vv5Var2.i3(0, vv5Var.B(), 0, vv5Var.B().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte m(@NotNull vv5 vv5Var, int i) {
        c25.p(vv5Var, "$this$commonGetByte");
        return vv5Var.B()[i];
    }

    public static final int n(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonGetSize");
        return vv5Var.B().length;
    }

    public static final int o(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonHashCode");
        int D = vv5Var.D();
        if (D != 0) {
            return D;
        }
        int hashCode = Arrays.hashCode(vv5Var.B());
        vv5Var.n3(hashCode);
        return hashCode;
    }

    @NotNull
    public static final String p(@NotNull vv5 vv5Var) {
        byte[] B;
        c25.p(vv5Var, "$this$commonHex");
        char[] cArr = new char[vv5Var.B().length * 2];
        int i = 0;
        for (byte b : vv5Var.B()) {
            int i2 = i + 1;
            cArr[i] = I()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = I()[b & 15];
        }
        return new String(cArr);
    }

    public static final int q(@NotNull vv5 vv5Var, @NotNull byte[] bArr, int i) {
        c25.p(vv5Var, "$this$commonIndexOf");
        c25.p(bArr, "other");
        int length = vv5Var.B().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!pv5.d(vv5Var.B(), max, bArr, 0, bArr.length)) {
                if (max == length) {
                    return -1;
                }
                max++;
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public static final byte[] r(@NotNull vv5 vv5Var) {
        c25.p(vv5Var, "$this$commonInternalArray");
        return vv5Var.B();
    }

    public static final int s(@NotNull vv5 vv5Var, @NotNull vv5 vv5Var2, int i) {
        c25.p(vv5Var, "$this$commonLastIndexOf");
        c25.p(vv5Var2, "other");
        return vv5Var.w0(vv5Var2.T(), i);
    }

    public static final int t(@NotNull vv5 vv5Var, @NotNull byte[] bArr, int i) {
        c25.p(vv5Var, "$this$commonLastIndexOf");
        c25.p(bArr, "other");
        for (int min = Math.min(i, vv5Var.B().length - bArr.length); min >= 0; min--) {
            if (pv5.d(vv5Var.B(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public static final vv5 u(@NotNull byte[] bArr) {
        c25.p(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new vv5(copyOf);
    }

    public static final boolean v(@NotNull vv5 vv5Var, int i, @NotNull vv5 vv5Var2, int i2, int i3) {
        c25.p(vv5Var, "$this$commonRangeEquals");
        c25.p(vv5Var2, "other");
        return vv5Var2.i3(i2, vv5Var.B(), i, i3);
    }

    public static final boolean w(@NotNull vv5 vv5Var, int i, @NotNull byte[] bArr, int i2, int i3) {
        c25.p(vv5Var, "$this$commonRangeEquals");
        c25.p(bArr, "other");
        return i >= 0 && i <= vv5Var.B().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && pv5.d(vv5Var.B(), i, bArr, i2, i3);
    }

    public static final boolean x(@NotNull vv5 vv5Var, @NotNull vv5 vv5Var2) {
        c25.p(vv5Var, "$this$commonStartsWith");
        c25.p(vv5Var2, "prefix");
        return vv5Var.d3(0, vv5Var2, 0, vv5Var2.C3());
    }

    public static final boolean y(@NotNull vv5 vv5Var, @NotNull byte[] bArr) {
        c25.p(vv5Var, "$this$commonStartsWith");
        c25.p(bArr, "prefix");
        return vv5Var.i3(0, bArr, 0, bArr.length);
    }

    @NotNull
    public static final vv5 z(@NotNull vv5 vv5Var, int i, int i2) {
        c25.p(vv5Var, "$this$commonSubstring");
        if (i >= 0) {
            if (i2 <= vv5Var.B().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == vv5Var.B().length) ? vv5Var : new vv5(zr4.G1(vv5Var.B(), i, i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(wo1.y(wo1.G("endIndex > length("), vv5Var.B().length, ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }
}