package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: DoubleVector.java */
/* loaded from: classes.dex */
public final class yv extends sv {
    public yv f(int i, ByteBuffer byteBuffer) {
        b(i, 8, byteBuffer);
        return this;
    }

    public double g(int i) {
        return this.d.getDouble(a(i));
    }
}