package com.p7700g.p99005;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Tls12SocketFactory.java */
/* loaded from: classes.dex */
public class b61 extends SSLSocketFactory {
    private static final String[] a = {"TLSv1.2"};
    public final SSLSocketFactory delegate;

    public b61(@x1 SSLSocketFactory sSLSocketFactory) {
        this.delegate = sSLSocketFactory;
    }

    @x1
    private Socket a(@x1 Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(a);
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @x1
    public Socket createSocket(@x1 Socket socket, @x1 String str, int i, boolean z) throws IOException {
        return a(this.delegate.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @x1
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    @x1
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 String str, int i) throws IOException {
        return a(this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 String str, int i, @x1 InetAddress inetAddress, int i2) throws IOException {
        return a(this.delegate.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 InetAddress inetAddress, int i) throws IOException {
        return a(this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    @x1
    public Socket createSocket(@x1 InetAddress inetAddress, int i, @x1 InetAddress inetAddress2, int i2) throws IOException {
        return a(this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }
}