package com.p7700g.p99005;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.SocketFactory;

/* compiled from: ProtectedSocketFactory.java */
/* loaded from: classes2.dex */
public class sd1 extends SocketFactory {
    @x1
    private static final kj1 a = kj1.b("ProtectedSocketFactory");
    @x1
    private final td1 b;
    @x1
    private final List<ParcelFileDescriptor> c = new CopyOnWriteArrayList();

    public sd1(@x1 td1 td1Var) {
        this.b = td1Var;
    }

    private void b(@x1 Socket socket) {
        ParcelFileDescriptor fromSocket = ParcelFileDescriptor.fromSocket(socket);
        this.b.k(fromSocket);
        this.c.add(fromSocket);
    }

    public void a() {
        a.c("Clearing allocated file descriptors", new Object[0]);
        for (ParcelFileDescriptor parcelFileDescriptor : this.c) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e) {
                a.f(e);
            }
        }
        this.c.clear();
    }

    @Override // javax.net.SocketFactory
    @z1
    public Socket createSocket() {
        Socket socket = null;
        try {
            socket = SocketChannel.open().socket();
            b(socket);
            return socket;
        } catch (Throwable unused) {
            return socket;
        }
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 String str, int i) throws IOException {
        Socket socket = new Socket(str, i);
        b(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 InetAddress inetAddress, int i) throws IOException {
        Socket socket = new Socket(inetAddress, i);
        b(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 String str, int i, @x1 InetAddress inetAddress, int i2) throws IOException {
        Socket socket = new Socket(str, i, inetAddress, i2);
        b(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 InetAddress inetAddress, int i, @x1 InetAddress inetAddress2, int i2) throws IOException {
        Socket socket = new Socket(inetAddress, i, inetAddress2, i2);
        b(socket);
        return socket;
    }
}