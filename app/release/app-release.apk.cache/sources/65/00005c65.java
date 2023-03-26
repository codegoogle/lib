package com.p7700g.p99005;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes2.dex */
public class sp1 implements Closeable {
    private static final byte s = 13;
    private static final byte t = 10;
    private final InputStream u;
    private final Charset v;
    private byte[] w;
    private int x;
    private int y;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes2.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, sp1.this.v.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public sp1(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.u;
        byte[] bArr = this.w;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.x = 0;
            this.y = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.u) {
            if (this.w != null) {
                this.w = null;
                this.u.close();
            }
        }
    }

    public boolean d() {
        return this.y == -1;
    }

    public String e() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.u) {
            if (this.w != null) {
                if (this.x >= this.y) {
                    b();
                }
                for (int i3 = this.x; i3 != this.y; i3++) {
                    byte[] bArr2 = this.w;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.x) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.w;
                                int i4 = this.x;
                                String str = new String(bArr3, i4, i2 - i4, this.v.name());
                                this.x = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.w;
                        int i42 = this.x;
                        String str2 = new String(bArr32, i42, i2 - i42, this.v.name());
                        this.x = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.y - this.x) + 80);
                loop1: while (true) {
                    byte[] bArr4 = this.w;
                    int i5 = this.x;
                    aVar.write(bArr4, i5, this.y - i5);
                    this.y = -1;
                    b();
                    i = this.x;
                    while (i != this.y) {
                        bArr = this.w;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.x;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.x = i + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    public sp1(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i >= 0) {
            if (charset.equals(tp1.a)) {
                this.u = inputStream;
                this.v = charset;
                this.w = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }
}