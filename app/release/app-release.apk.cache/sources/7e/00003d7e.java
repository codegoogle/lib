package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: FloatVector.java */
/* loaded from: classes.dex */
public final class cw extends sv {
    public cw f(int i, ByteBuffer byteBuffer) {
        b(i, 4, byteBuffer);
        return this;
    }

    public float g(int i) {
        return this.d.getFloat(a(i));
    }
}