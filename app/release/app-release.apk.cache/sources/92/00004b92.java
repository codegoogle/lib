package com.p7700g.p99005;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Console.kt */
@vo4(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlin/io/LineReader;", "", "()V", "BUFFER_SIZE", "", "byteBuf", "Ljava/nio/ByteBuffer;", "bytes", "", "charBuf", "Ljava/nio/CharBuffer;", "chars", "", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "compactBytes", "decode", "endOfInput", "decodeEndOfInput", "nBytes", "nChars", "readLine", "", "inputStream", "Ljava/io/InputStream;", "charset", "Ljava/nio/charset/Charset;", "resetAll", "", "trimStringBuilder", "updateCharset", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class jy4 {
    @NotNull
    public static final jy4 a = new jy4();
    private static final int b = 32;
    private static CharsetDecoder c;
    private static boolean d;
    @NotNull
    private static final byte[] e;
    @NotNull
    private static final char[] f;
    @NotNull
    private static final ByteBuffer g;
    @NotNull
    private static final CharBuffer h;
    @NotNull
    private static final StringBuilder i;

    static {
        byte[] bArr = new byte[32];
        e = bArr;
        char[] cArr = new char[32];
        f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        c25.o(wrap, "wrap(bytes)");
        g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        c25.o(wrap2, "wrap(chars)");
        h = wrap2;
        i = new StringBuilder();
    }

    private jy4() {
    }

    private final int a() {
        ByteBuffer byteBuffer = g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    private final int b(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = c;
            if (charsetDecoder == null) {
                c25.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = g;
            CharBuffer charBuffer = h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            c25.o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = i;
            char[] cArr = f;
            int i2 = position - 1;
            sb.append(cArr, 0, i2);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i2]);
        }
    }

    private final int c(int i2, int i3) {
        ByteBuffer byteBuffer = g;
        byteBuffer.limit(i2);
        h.position(i3);
        int b2 = b(true);
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            c25.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b2;
    }

    private final void e() {
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            c25.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        g.position(0);
        i.setLength(0);
    }

    private final void f() {
        StringBuilder sb = i;
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        c25.o(newDecoder, "charset.newDecoder()");
        c = newDecoder;
        ByteBuffer byteBuffer = g;
        byteBuffer.clear();
        CharBuffer charBuffer = h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder == null) {
            c25.S("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == '\n') {
            z = true;
        }
        d = z;
        e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (com.p7700g.p99005.c25.g(r0.charset(), r12) == false) goto L67;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String d(@NotNull InputStream inputStream, @NotNull Charset charset) {
        boolean z;
        int c2;
        c25.p(inputStream, "inputStream");
        c25.p(charset, "charset");
        CharsetDecoder charsetDecoder = c;
        if (charsetDecoder != null) {
            if (charsetDecoder == null) {
                c25.S("decoder");
                charsetDecoder = null;
            }
        }
        g(charset);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int read = inputStream.read();
            z = true;
            if (read == -1) {
                if ((i.length() == 0) && i2 == 0 && i3 == 0) {
                    return null;
                }
                c2 = c(i2, i3);
            } else {
                int i4 = i2 + 1;
                e[i2] = (byte) read;
                if (read != 10 && i4 != 32 && d) {
                    i2 = i4;
                }
                ByteBuffer byteBuffer = g;
                byteBuffer.limit(i4);
                h.position(i3);
                i3 = b(false);
                if (i3 > 0 && f[i3 - 1] == '\n') {
                    byteBuffer.position(0);
                    c2 = i3;
                    break;
                }
                i2 = a();
            }
        }
        if (c2 > 0) {
            char[] cArr = f;
            if (cArr[c2 - 1] == '\n' && c2 - 1 > 0 && cArr[c2 - 1] == '\r') {
                c2--;
            }
        }
        StringBuilder sb = i;
        if (sb.length() != 0) {
            z = false;
        }
        if (z) {
            return new String(f, 0, c2);
        }
        sb.append(f, 0, c2);
        String sb2 = sb.toString();
        c25.o(sb2, "sb.toString()");
        if (sb.length() > 32) {
            f();
        }
        sb.setLength(0);
        return sb2;
    }
}