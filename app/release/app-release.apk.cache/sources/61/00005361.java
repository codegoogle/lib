package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: ExceptionCatchingInputStream.java */
@Deprecated
/* loaded from: classes2.dex */
public class o02 extends InputStream {
    private static final Queue<o02> s = z02.f(0);
    private InputStream t;
    private IOException u;

    public static void a() {
        while (true) {
            Queue<o02> queue = s;
            if (queue.isEmpty()) {
                return;
            }
            queue.remove();
        }
    }

    @x1
    public static o02 d(@x1 InputStream inputStream) {
        o02 poll;
        Queue<o02> queue = s;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new o02();
        }
        poll.e(inputStream);
        return poll;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.t.available();
    }

    @z1
    public IOException b() {
        return this.u;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.t.close();
    }

    public void e(@x1 InputStream inputStream) {
        this.t = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.t.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.t.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.t.read(bArr);
        } catch (IOException e) {
            this.u = e;
            return -1;
        }
    }

    public void release() {
        this.u = null;
        this.t = null;
        Queue<o02> queue = s;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.t.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.t.skip(j);
        } catch (IOException e) {
            this.u = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.t.read(bArr, i, i2);
        } catch (IOException e) {
            this.u = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.t.read();
        } catch (IOException e) {
            this.u = e;
            return -1;
        }
    }
}