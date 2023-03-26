package com.p7700g.p99005;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream.java */
/* loaded from: classes2.dex */
public class zv1 extends FilterInputStream {
    private volatile byte[] s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final is1 x;

    /* compiled from: RecyclableBufferedInputStream.java */
    /* loaded from: classes2.dex */
    public static class a extends IOException {
        private static final long s = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public zv1(@x1 InputStream inputStream, @x1 is1 is1Var) {
        this(inputStream, is1Var, 65536);
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.v;
        if (i != -1) {
            int i2 = this.w - i;
            int i3 = this.u;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.t == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.x.h(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.s = bArr2;
                    this.x.f(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.w - this.v;
                this.w = i4;
                this.v = 0;
                this.t = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.w;
                if (read > 0) {
                    i5 += read;
                }
                this.t = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.v = -1;
            this.w = 0;
            this.t = read2;
        }
        return read2;
    }

    private static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.s != null && inputStream != null) {
        } else {
            throw d();
        }
        return (this.t - this.w) + inputStream.available();
    }

    public synchronized void b() {
        this.u = this.s.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.s != null) {
            this.x.f(this.s);
            this.s = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.u = Math.max(this.u, i);
        this.v = this.w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.s;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.w < this.t || a(inputStream, bArr) != -1) {
                if (bArr != this.s && (bArr = this.s) == null) {
                    throw d();
                }
                int i = this.t;
                int i2 = this.w;
                if (i - i2 > 0) {
                    this.w = i2 + 1;
                    return bArr[i2] & 255;
                }
                return -1;
            }
            return -1;
        }
        throw d();
    }

    public synchronized void release() {
        if (this.s != null) {
            this.x.f(this.s);
            this.s = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.s != null) {
            int i = this.v;
            if (-1 != i) {
                this.w = i;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.w + " markLimit: " + this.u);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.s;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.t;
                int i2 = this.w;
                if (i - i2 >= j) {
                    this.w = (int) (i2 + j);
                    return j;
                }
                long j2 = i - i2;
                this.w = i;
                if (this.v != -1 && j <= this.u) {
                    if (a(inputStream, bArr) == -1) {
                        return j2;
                    }
                    int i3 = this.t;
                    int i4 = this.w;
                    if (i3 - i4 >= j - j2) {
                        this.w = (int) ((i4 + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + i3) - i4;
                    this.w = i3;
                    return j3;
                }
                long skip = inputStream.skip(j - j2);
                if (skip > 0) {
                    this.v = -1;
                }
                return j2 + skip;
            }
            throw d();
        }
        throw d();
    }

    @r2
    public zv1(@x1 InputStream inputStream, @x1 is1 is1Var, int i) {
        super(inputStream);
        this.v = -1;
        this.x = is1Var;
        this.s = (byte[]) is1Var.h(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@x1 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.s;
        if (bArr2 == null) {
            throw d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.w;
            int i6 = this.t;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.w += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.v == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                } else {
                    if (bArr2 != this.s && (bArr2 = this.s) == null) {
                        throw d();
                    }
                    int i8 = this.t;
                    int i9 = this.w;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.w += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw d();
        }
    }
}