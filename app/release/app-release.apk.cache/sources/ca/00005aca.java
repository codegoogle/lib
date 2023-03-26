package com.p7700g.p99005;

import java.util.Arrays;

/* compiled from: ArrayReadWriteBuf.java */
/* loaded from: classes.dex */
public class rv implements iw {
    private byte[] a;
    private int b;

    public rv() {
        this(10);
    }

    @Override // com.p7700g.p99005.iw, com.p7700g.p99005.hw
    public int a() {
        return this.b;
    }

    @Override // com.p7700g.p99005.iw
    public void b(int i, byte[] bArr, int i2, int i3) {
        m((i3 - i2) + i);
        System.arraycopy(bArr, i2, this.a, i, i3);
    }

    @Override // com.p7700g.p99005.iw
    public void c(int i, double d) {
        m(i + 8);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (doubleToRawLongBits >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    @Override // com.p7700g.p99005.iw
    public void d(int i, int i2) {
        m(i + 4);
        byte[] bArr = this.a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i2 >> 24) & 255);
    }

    @Override // com.p7700g.p99005.hw
    public boolean e(int i) {
        return this.a[i] != 0;
    }

    @Override // com.p7700g.p99005.iw
    public void f(double d) {
        c(this.b, d);
        this.b += 8;
    }

    @Override // com.p7700g.p99005.iw
    public void g(short s) {
        k(this.b, s);
        this.b += 2;
    }

    @Override // com.p7700g.p99005.hw
    public byte get(int i) {
        return this.a[i];
    }

    @Override // com.p7700g.p99005.hw
    public double getDouble(int i) {
        return Double.longBitsToDouble(getLong(i));
    }

    @Override // com.p7700g.p99005.hw
    public float getFloat(int i) {
        return Float.intBitsToFloat(getInt(i));
    }

    @Override // com.p7700g.p99005.hw
    public int getInt(int i) {
        byte[] bArr = this.a;
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // com.p7700g.p99005.hw
    public long getLong(int i) {
        byte[] bArr = this.a;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((255 & bArr[i7]) << 48) | (bArr[i7 + 1] << 56);
    }

    @Override // com.p7700g.p99005.hw
    public short getShort(int i) {
        byte[] bArr = this.a;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // com.p7700g.p99005.iw
    public void h(int i, float f) {
        m(i + 4);
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        byte[] bArr = this.a;
        int i2 = i + 1;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i3] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i3 + 1] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    @Override // com.p7700g.p99005.hw
    public byte[] i() {
        return this.a;
    }

    @Override // com.p7700g.p99005.hw
    public String j(int i, int i2) {
        return qw.g(this.a, i, i2);
    }

    @Override // com.p7700g.p99005.iw
    public void k(int i, short s) {
        m(i + 2);
        byte[] bArr = this.a;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    @Override // com.p7700g.p99005.iw
    public void l(boolean z) {
        q(this.b, z);
        this.b++;
    }

    @Override // com.p7700g.p99005.iw
    public boolean m(int i) {
        byte[] bArr = this.a;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.a = Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }

    @Override // com.p7700g.p99005.iw
    public void n(int i, byte b) {
        m(i + 1);
        this.a[i] = b;
    }

    @Override // com.p7700g.p99005.iw
    public void o(int i, long j) {
        m(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.a;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >> 24) & 255);
        int i7 = (int) (j >> 32);
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i7 >> 8) & 255);
        bArr[i9] = (byte) ((i7 >> 16) & 255);
        bArr[i9 + 1] = (byte) ((i7 >> 24) & 255);
    }

    @Override // com.p7700g.p99005.iw
    public int p() {
        return this.b;
    }

    @Override // com.p7700g.p99005.iw
    public void q(int i, boolean z) {
        n(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // com.p7700g.p99005.iw
    public void r(float f) {
        h(this.b, f);
        this.b += 4;
    }

    @Override // com.p7700g.p99005.iw
    public void s(int i) {
        d(this.b, i);
        this.b += 4;
    }

    @Override // com.p7700g.p99005.iw
    public void t(byte[] bArr, int i, int i2) {
        b(this.b, bArr, i, i2);
        this.b += i2;
    }

    @Override // com.p7700g.p99005.iw
    public void u(byte b) {
        n(this.b, b);
        this.b++;
    }

    @Override // com.p7700g.p99005.iw
    public void v(long j) {
        o(this.b, j);
        this.b += 8;
    }

    public rv(int i) {
        this(new byte[i]);
    }

    public rv(byte[] bArr) {
        this.a = bArr;
        this.b = 0;
    }

    public rv(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }
}