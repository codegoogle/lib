package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: ByteVector.java */
/* loaded from: classes.dex */
public final class wv extends sv {
    public wv f(int i, ByteBuffer byteBuffer) {
        b(i, 1, byteBuffer);
        return this;
    }

    public byte g(int i) {
        return this.d.get(a(i));
    }

    public int h(int i) {
        return g(i) & 255;
    }
}