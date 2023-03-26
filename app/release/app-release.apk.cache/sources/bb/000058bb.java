package com.p7700g.p99005;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes2.dex */
public final class qq1 extends OutputStream {
    @x1
    private final OutputStream s;
    private byte[] t;
    private is1 u;
    private int v;

    public qq1(@x1 OutputStream outputStream, @x1 is1 is1Var) {
        this(outputStream, is1Var, 65536);
    }

    private void a() throws IOException {
        int i = this.v;
        if (i > 0) {
            this.s.write(this.t, 0, i);
            this.v = 0;
        }
    }

    private void b() throws IOException {
        if (this.v == this.t.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.t;
        if (bArr != null) {
            this.u.f(bArr);
            this.t = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.s.close();
            release();
        } catch (Throwable th) {
            this.s.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.s.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.t;
        int i2 = this.v;
        this.v = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @r2
    public qq1(@x1 OutputStream outputStream, is1 is1Var, int i) {
        this.s = outputStream;
        this.u = is1Var;
        this.t = (byte[]) is1Var.h(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@x1 byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@x1 byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.v;
            if (i6 == 0 && i4 >= this.t.length) {
                this.s.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.t.length - i6);
            System.arraycopy(bArr, i5, this.t, this.v, min);
            this.v += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }
}