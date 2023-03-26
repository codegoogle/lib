package com.p7700g.p99005;

import com.p7700g.p99005.vv5;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: -Base64.kt */
@fz4(name = "-Base64")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\f\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001c\u0010\n\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001c\u0010\f\u001a\u00020\u00018\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"", "", "a", "(Ljava/lang/String;)[B", "map", "b", "([B[B)Ljava/lang/String;", "[B", "e", "()[B", "BASE64_URL_SAFE", "d", "BASE64", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class gv5 {
    @NotNull
    private static final byte[] a;
    @NotNull
    private static final byte[] b;

    static {
        vv5.a aVar = vv5.u;
        a = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").B();
        b = aVar.l("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").B();
    }

    @Nullable
    public static final byte[] a(@NotNull String str) {
        int i;
        char charAt;
        c25.p(str, "$this$decodeBase64ToArray");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt2 = str.charAt(i6);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i4 = (i4 << 6) | i;
            i3++;
            if (i3 % 4 == 0) {
                int i7 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 16);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (i4 >> 8);
                bArr[i8] = (byte) i4;
                i5 = i8 + 1;
            }
        }
        int i9 = i3 % 4;
        if (i9 != 1) {
            if (i9 == 2) {
                bArr[i5] = (byte) ((i4 << 12) >> 16);
                i5++;
            } else if (i9 == 3) {
                int i10 = i4 << 6;
                int i11 = i5 + 1;
                bArr[i5] = (byte) (i10 >> 16);
                i5 = i11 + 1;
                bArr[i11] = (byte) (i10 >> 8);
            }
            if (i5 == i2) {
                return bArr;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            c25.o(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            return copyOf;
        }
        return null;
    }

    @NotNull
    public static final String b(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        c25.p(bArr, "$this$encodeBase64");
        c25.p(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            int i4 = i3 + 1;
            byte b3 = bArr[i3];
            int i5 = i4 + 1;
            byte b4 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b2 & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b4 & ax5.a];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b5 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b5 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i10] = b6;
            bArr3[i10 + 1] = b6;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b7 = bArr[i];
            byte b8 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b7 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i13] = bArr2[(b8 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return ov5.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = a;
        }
        return b(bArr, bArr2);
    }

    @NotNull
    public static final byte[] d() {
        return a;
    }

    @NotNull
    public static final byte[] e() {
        return b;
    }
}