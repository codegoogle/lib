package com.p7700g.p99005;

import com.p7700g.p99005.ow;
import java.nio.ByteBuffer;

/* compiled from: Utf8Safe.java */
/* loaded from: classes.dex */
public final class qw extends ow {

    /* compiled from: Utf8Safe.java */
    /* loaded from: classes.dex */
    public static class a extends IllegalArgumentException {
        public a(int i, int i2) {
            super(wo1.o("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    private static int f(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += k(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder G = wo1.G("UTF-8 length does not fit in int: ");
        G.append(i2 + 4294967296L);
        throw new IllegalArgumentException(G.toString());
    }

    public static String g(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!ow.a.g(b)) {
                    break;
                }
                i++;
                ow.a.b(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (ow.a.g(b2)) {
                    int i7 = i5 + 1;
                    ow.a.b(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!ow.a.g(b3)) {
                            break;
                        }
                        i6++;
                        ow.a.b(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (ow.a.i(b2)) {
                    if (i6 < i3) {
                        ow.a.d(b2, bArr[i6], cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (ow.a.h(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        ow.a.c(b2, bArr[i6], bArr[i8], cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    ow.a.a(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static String h(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!ow.a.g(b)) {
                    break;
                }
                i++;
                ow.a.b(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (ow.a.g(b2)) {
                    int i7 = i5 + 1;
                    ow.a.b(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = byteBuffer.get(i6);
                        if (!ow.a.g(b3)) {
                            break;
                        }
                        i6++;
                        ow.a.b(b3, cArr, i7);
                        i7++;
                    }
                    i = i6;
                    i5 = i7;
                } else if (ow.a.i(b2)) {
                    if (i6 < i3) {
                        ow.a.d(b2, byteBuffer.get(i6), cArr, i5);
                        i = i6 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (ow.a.h(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        ow.a.c(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        i = i8 + 1;
                        i5++;
                    } else {
                        throw new IllegalArgumentException("Invalid UTF-8");
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i9 + 1;
                    ow.a.a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i = i10 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 >= 128 || i8 >= i6) {
                if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || i8 > i6 - 3) {
                    if (i8 <= i6 - 4) {
                        int i10 = i7 + 1;
                        if (i10 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i11 = i8 + 1;
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                int i12 = i11 + 1;
                                bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i13 = i12 + 1;
                                bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 = i13 + 1;
                                bArr[i13] = (byte) ((codePoint & 63) | 128);
                                i7 = i10;
                            } else {
                                i7 = i10;
                            }
                        }
                        throw new a(i7 - 1, length);
                    } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                        throw new a(i7, length);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                    }
                } else {
                    int i14 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> '\f') | 480);
                    int i15 = i14 + 1;
                    bArr[i14] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i3 = i15 + 1;
                    bArr[i15] = (byte) ((charAt2 & '?') | 128);
                }
                i7++;
            } else {
                i3 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            }
            i8 = i3;
            i7++;
        }
        return i8;
    }

    private static void j(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                StringBuilder G = wo1.G("Failed writing ");
                G.append(charSequence.charAt(i));
                G.append(" at index ");
                G.append(Math.max(i, (position - byteBuffer.position()) + 1) + position2);
                throw new ArrayIndexOutOfBoundsException(G.toString());
            }
        }
        if (i == length) {
            byteBuffer.position(position + i);
            return;
        }
        position += i;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (charAt2 < 128) {
                byteBuffer.put(position, (byte) charAt2);
            } else if (charAt2 < 2048) {
                int i2 = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt2 >>> 6) | yg1.K));
                    byteBuffer.put(i2, (byte) ((charAt2 & '?') | 128));
                    position = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i2;
                    int position22 = byteBuffer.position();
                    StringBuilder G2 = wo1.G("Failed writing ");
                    G2.append(charSequence.charAt(i));
                    G2.append(" at index ");
                    G2.append(Math.max(i, (position - byteBuffer.position()) + 1) + position22);
                    throw new ArrayIndexOutOfBoundsException(G2.toString());
                }
            } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                int i3 = i + 1;
                if (i3 != length) {
                    try {
                        char charAt3 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                int i5 = i4 + 1;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                int i6 = i5 + 1;
                                byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i6, (byte) ((codePoint & 63) | 128));
                                position = i6;
                                i = i3;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i4;
                                i = i3;
                                int position222 = byteBuffer.position();
                                StringBuilder G22 = wo1.G("Failed writing ");
                                G22.append(charSequence.charAt(i));
                                G22.append(" at index ");
                                G22.append(Math.max(i, (position - byteBuffer.position()) + 1) + position222);
                                throw new ArrayIndexOutOfBoundsException(G22.toString());
                            }
                        } else {
                            i = i3;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                    }
                }
                throw new a(i, length);
            } else {
                int i7 = position + 1;
                byteBuffer.put(position, (byte) ((charAt2 >>> '\f') | 224));
                position = i7 + 1;
                byteBuffer.put(i7, (byte) (((charAt2 >>> 6) & 63) | 128));
                byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
            }
            i++;
            position++;
        }
        byteBuffer.position(position);
    }

    private static int k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new a(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.ow
    public String a(ByteBuffer byteBuffer, int i, int i2) throws IllegalArgumentException {
        if (byteBuffer.hasArray()) {
            return g(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return h(byteBuffer, i, i2);
    }

    @Override // com.p7700g.p99005.ow
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            return;
        }
        j(charSequence, byteBuffer);
    }

    @Override // com.p7700g.p99005.ow
    public int c(CharSequence charSequence) {
        return f(charSequence);
    }
}