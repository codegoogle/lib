package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: IntVector.java */
/* loaded from: classes.dex */
public final class dw extends sv {
    public dw f(int i, ByteBuffer byteBuffer) {
        b(i, 4, byteBuffer);
        return this;
    }

    public int g(int i) {
        return this.d.getInt(a(i));
    }

    public long h(int i) {
        return g(i) & 4294967295L;
    }
}