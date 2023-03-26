package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: LongVector.java */
/* loaded from: classes.dex */
public final class ew extends sv {
    public ew f(int i, ByteBuffer byteBuffer) {
        b(i, 8, byteBuffer);
        return this;
    }

    public long g(int i) {
        return this.d.getLong(a(i));
    }
}