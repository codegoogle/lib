package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

/* compiled from: MessageProcessor.java */
/* loaded from: classes2.dex */
public class vd1 {
    private static final int a = 67108864;
    private static final kj1 b = kj1.b("MessageProcessor");
    @x1
    private final InputStream c;

    private vd1(@x1 InputStream inputStream) {
        this.c = inputStream;
    }

    @z1
    public static vd1 a(@x1 Socket socket) {
        if (socket.isConnected()) {
            try {
                return new vd1(socket.getInputStream());
            } catch (Throwable th) {
                b.e("failed", th);
                return null;
            }
        }
        b.e("not connected", new Object[0]);
        return null;
    }

    @z1
    private byte[] b(@x1 InputStream inputStream, int i) {
        b.c("Read message bytes", new Object[0]);
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && i3 >= 0) {
            try {
                i3 = inputStream.read(bArr, i2, i - i2);
                i2 += i3;
            } catch (IOException e) {
                b.e("failed to read", e);
                return null;
            }
        }
        return bArr;
    }

    private int c(@x1 InputStream inputStream) {
        kj1 kj1Var = b;
        kj1Var.c("Read message size", new Object[0]);
        try {
            byte[] bArr = new byte[4];
            kj1Var.c("Try to read size buf", new Object[0]);
            if (inputStream.read(bArr, 0, 4) < 0) {
                kj1Var.e("failed to read len from stream", new Object[0]);
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            kj1Var.c("Getting size int", new Object[0]);
            return wrap.getInt();
        } catch (IOException e) {
            b.e("failed", e);
            return 0;
        }
    }

    @z1
    public String d() {
        kj1 kj1Var = b;
        kj1Var.c("Read message", new Object[0]);
        int c = c(this.c);
        if (c > 0 && c <= a) {
            kj1Var.c(wo1.l("size = ", c), new Object[0]);
            byte[] b2 = b(this.c, c);
            if (b2 != null) {
                return new String(b2);
            }
            kj1Var.e("got null as data", new Object[0]);
            return null;
        }
        kj1Var.e(wo1.l("invalid size = ", c), new Object[0]);
        return null;
    }

    public void e() {
        try {
            this.c.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}