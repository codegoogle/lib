package com.p7700g.p99005;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes2.dex */
public final class n02 extends FilterInputStream {
    private static final String s = "ContentLengthStream";
    private static final int t = -1;
    private final long u;
    private int v;

    private n02(@x1 InputStream inputStream, long j) {
        super(inputStream);
        this.u = j;
    }

    private int a(int i) throws IOException {
        if (i >= 0) {
            this.v += i;
        } else if (this.u - this.v > 0) {
            StringBuilder G = wo1.G("Failed to read all expected data, expected: ");
            G.append(this.u);
            G.append(", but read: ");
            G.append(this.v);
            throw new IOException(G.toString());
        }
        return i;
    }

    @x1
    public static InputStream b(@x1 InputStream inputStream, long j) {
        return new n02(inputStream, j);
    }

    @x1
    public static InputStream d(@x1 InputStream inputStream, @z1 String str) {
        return b(inputStream, e(str));
    }

    private static int e(@z1 String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                Log.isLoggable(s, 3);
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.u - this.v, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return a(super.read(bArr, i, i2));
    }
}