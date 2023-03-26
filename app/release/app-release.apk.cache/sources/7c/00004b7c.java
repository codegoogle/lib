package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: ShortVector.java */
/* loaded from: classes.dex */
public final class jw extends sv {
    public jw f(int i, ByteBuffer byteBuffer) {
        b(i, 2, byteBuffer);
        return this;
    }

    public short g(int i) {
        return this.d.getShort(a(i));
    }

    public int h(int i) {
        return g(i) & tq4.u;
    }
}