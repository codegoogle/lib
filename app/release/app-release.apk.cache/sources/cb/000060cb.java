package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: ByteBufferReadWriteBuf.java */
/* loaded from: classes.dex */
public class uv implements iw {
    private final ByteBuffer a;

    public uv(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // com.p7700g.p99005.iw, com.p7700g.p99005.hw
    public int a() {
        return this.a.limit();
    }

    @Override // com.p7700g.p99005.iw
    public void b(int i, byte[] bArr, int i2, int i3) {
        m((i3 - i2) + i);
        int position = this.a.position();
        this.a.position(i);
        this.a.put(bArr, i2, i3);
        this.a.position(position);
    }

    @Override // com.p7700g.p99005.iw
    public void c(int i, double d) {
        m(i + 8);
        this.a.putDouble(i, d);
    }

    @Override // com.p7700g.p99005.iw
    public void d(int i, int i2) {
        m(i + 4);
        this.a.putInt(i, i2);
    }

    @Override // com.p7700g.p99005.hw
    public boolean e(int i) {
        return get(i) != 0;
    }

    @Override // com.p7700g.p99005.iw
    public void f(double d) {
        this.a.putDouble(d);
    }

    @Override // com.p7700g.p99005.iw
    public void g(short s) {
        this.a.putShort(s);
    }

    @Override // com.p7700g.p99005.hw
    public byte get(int i) {
        return this.a.get(i);
    }

    @Override // com.p7700g.p99005.hw
    public double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // com.p7700g.p99005.hw
    public float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // com.p7700g.p99005.hw
    public int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // com.p7700g.p99005.hw
    public long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // com.p7700g.p99005.hw
    public short getShort(int i) {
        return this.a.getShort(i);
    }

    @Override // com.p7700g.p99005.iw
    public void h(int i, float f) {
        m(i + 4);
        this.a.putFloat(i, f);
    }

    @Override // com.p7700g.p99005.hw
    public byte[] i() {
        return this.a.array();
    }

    @Override // com.p7700g.p99005.hw
    public String j(int i, int i2) {
        return qw.h(this.a, i, i2);
    }

    @Override // com.p7700g.p99005.iw
    public void k(int i, short s) {
        m(i + 2);
        this.a.putShort(i, s);
    }

    @Override // com.p7700g.p99005.iw
    public void l(boolean z) {
        this.a.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.p7700g.p99005.iw
    public boolean m(int i) {
        return i <= this.a.limit();
    }

    @Override // com.p7700g.p99005.iw
    public void n(int i, byte b) {
        m(i + 1);
        this.a.put(i, b);
    }

    @Override // com.p7700g.p99005.iw
    public void o(int i, long j) {
        m(i + 8);
        this.a.putLong(i, j);
    }

    @Override // com.p7700g.p99005.iw
    public int p() {
        return this.a.position();
    }

    @Override // com.p7700g.p99005.iw
    public void q(int i, boolean z) {
        n(i, z ? (byte) 1 : (byte) 0);
    }

    @Override // com.p7700g.p99005.iw
    public void r(float f) {
        this.a.putFloat(f);
    }

    @Override // com.p7700g.p99005.iw
    public void s(int i) {
        this.a.putInt(i);
    }

    @Override // com.p7700g.p99005.iw
    public void t(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }

    @Override // com.p7700g.p99005.iw
    public void u(byte b) {
        this.a.put(b);
    }

    @Override // com.p7700g.p99005.iw
    public void v(long j) {
        this.a.putLong(j);
    }
}