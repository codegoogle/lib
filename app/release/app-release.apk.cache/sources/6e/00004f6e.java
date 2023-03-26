package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: Struct.java */
/* loaded from: classes.dex */
public class lw {
    public int a;
    public ByteBuffer b;

    public void a() {
        b(0, null);
    }

    public void b(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
        } else {
            this.a = 0;
        }
    }
}