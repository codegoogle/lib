package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* compiled from: Utf8Old.java */
/* loaded from: classes.dex */
public class pw extends ow {
    private static final ThreadLocal<a> b = ThreadLocal.withInitial(qv.a);

    /* compiled from: Utf8Old.java */
    /* loaded from: classes.dex */
    public static class a {
        public CharSequence c = null;
        public ByteBuffer d = null;
        public final CharsetEncoder a = StandardCharsets.UTF_8.newEncoder();
        public final CharsetDecoder b = StandardCharsets.UTF_8.newDecoder();
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    @Override // com.p7700g.p99005.ow
    public String a(ByteBuffer byteBuffer, int i, int i2) {
        CharsetDecoder charsetDecoder = b.get().b;
        charsetDecoder.reset();
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        try {
            return charsetDecoder.decode(duplicate).toString();
        } catch (CharacterCodingException e) {
            throw new IllegalArgumentException("Bad encoding", e);
        }
    }

    @Override // com.p7700g.p99005.ow
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = b.get();
        if (aVar.c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.d);
    }

    @Override // com.p7700g.p99005.ow
    public int c(CharSequence charSequence) {
        a aVar = b.get();
        int maxBytesPerChar = (int) (aVar.a.maxBytesPerChar() * charSequence.length());
        ByteBuffer byteBuffer = aVar.d;
        if (byteBuffer == null || byteBuffer.capacity() < maxBytesPerChar) {
            aVar.d = ByteBuffer.allocate(Math.max(128, maxBytesPerChar));
        }
        aVar.d.clear();
        aVar.c = charSequence;
        CoderResult encode = aVar.a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.d, true);
        if (encode.isError()) {
            try {
                encode.throwException();
            } catch (CharacterCodingException e) {
                throw new IllegalArgumentException("bad character encoding", e);
            }
        }
        aVar.d.flip();
        return aVar.d.remaining();
    }
}