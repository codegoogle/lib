package com.p7700g.p99005;

import java.nio.ByteBuffer;

/* compiled from: BaseVector.java */
/* loaded from: classes.dex */
public class sv {
    private int a;
    private int b;
    private int c;
    public ByteBuffer d;

    public int a(int i) {
        return (i * this.c) + this.a;
    }

    public void b(int i, int i2, ByteBuffer byteBuffer) {
        this.d = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            this.b = byteBuffer.getInt(i - 4);
            this.c = i2;
            return;
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e() {
        b(0, 0, null);
    }
}