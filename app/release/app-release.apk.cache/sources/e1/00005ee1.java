package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: BooleanVector.java */
/* loaded from: classes.dex */
public final class tv extends sv {
    public tv f(int i, ByteBuffer byteBuffer) {
        b(i, 1, byteBuffer);
        return this;
    }

    public boolean g(int i) {
        return this.d.get(a(i)) != 0;
    }
}