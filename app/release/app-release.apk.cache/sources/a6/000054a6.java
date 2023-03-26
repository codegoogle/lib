package com.p7700g.p99005;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* compiled from: SocketHelper.java */
/* loaded from: classes2.dex */
public class oo1 {

    /* compiled from: SocketHelper.java */
    /* loaded from: classes2.dex */
    public static class a extends Socket {
        public a(FileDescriptor fileDescriptor) throws SocketException {
            super(new b(fileDescriptor));
        }
    }

    /* compiled from: SocketHelper.java */
    /* loaded from: classes2.dex */
    public static class b extends SocketImpl {
        public b(FileDescriptor fileDescriptor) {
            ((SocketImpl) this).fd = fileDescriptor;
        }

        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) throws IOException {
        }

        @Override // java.net.SocketImpl
        public int available() throws IOException {
            return 0;
        }

        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void close() throws IOException {
        }

        @Override // java.net.SocketImpl
        public void connect(String str, int i) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void create(boolean z) throws IOException {
        }

        @Override // java.net.SocketImpl
        @z1
        public InputStream getInputStream() throws IOException {
            return null;
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i) throws SocketException {
            if (i == 4) {
                return Boolean.TRUE;
            }
            return new Object();
        }

        @Override // java.net.SocketImpl
        @z1
        public OutputStream getOutputStream() throws IOException {
            return null;
        }

        @Override // java.net.SocketImpl
        public void listen(int i) throws IOException {
        }

        @Override // java.net.SocketImpl
        public void sendUrgentData(int i) throws IOException {
        }

        @Override // java.net.SocketOptions
        public void setOption(int i, Object obj) throws SocketException {
        }
    }

    /* compiled from: SocketHelper.java */
    /* loaded from: classes2.dex */
    public static class c {
        public static final FileDescriptor a = new FileDescriptor();
        @z1
        private static Field b;

        static {
            try {
                Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        public c(int i) {
            try {
                ((Field) r81.f(b)).set(a, Integer.valueOf(i));
            } catch (IllegalAccessException unused) {
            }
        }
    }
}