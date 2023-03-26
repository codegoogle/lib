package com.p7700g.p99005;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes2.dex */
public final class uq1 extends FilterInputStream {
    private static final int s = 2;
    private static final byte[] t;
    private static final int u;
    private static final int v;
    private final byte w;
    private int x;

    static {
        byte[] bArr = {-1, bx.j7, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        t = bArr;
        int length = bArr.length;
        u = length;
        v = length + 2;
    }

    public uq1(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.w = (byte) i;
            return;
        }
        throw new IllegalArgumentException(wo1.l("Cannot add invalid orientation: ", i));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read;
        int i;
        int i2 = this.x;
        if (i2 < 2 || i2 > (i = v)) {
            read = super.read();
        } else if (i2 == i) {
            read = this.w;
        } else {
            read = t[i2 - 2] & 255;
        }
        if (read != -1) {
            this.x++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.x = (int) (this.x + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@x1 byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.x;
        int i5 = v;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.w;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(t, this.x - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.x += i3;
        }
        return i3;
    }
}