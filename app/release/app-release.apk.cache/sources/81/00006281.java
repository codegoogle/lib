package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: ByteBufferUtil.java */
/* loaded from: classes.dex */
public class vv {
    public static int a(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}