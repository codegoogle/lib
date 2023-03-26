package com.anythink.core.common.g.a;

import com.anythink.core.common.b.m;
import com.anythink.core.common.g.a.b;
import com.anythink.core.common.j.h;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes2.dex */
public final class c {
    private static c g;
    private String h;
    private int i;
    private Socket j;
    private final int c = 0;
    private final int d = 7;
    private final int e = 1;
    private final String f = c.class.getSimpleName();
    public byte[] a = null;
    public byte[] b = new byte[1];

    /* renamed from: com.anythink.core.common.g.a.c$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends com.anythink.core.common.j.b.b {
        public final /* synthetic */ b a;
        public final /* synthetic */ b.a b;

        public AnonymousClass1(b bVar, b.a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // com.anythink.core.common.j.b.b
        public final void a() {
            try {
                try {
                    c.this.a(this.a);
                    int e = c.this.e();
                    if (e == 1) {
                        b.a aVar = this.b;
                        if (aVar != null) {
                            aVar.a(this.a);
                            return;
                        }
                        return;
                    }
                    throw new Exception("Response Error Code:".concat(String.valueOf(e)));
                } catch (SocketException unused) {
                    c.b(c.this);
                    c.this.a(this.a);
                    int e2 = c.this.e();
                    if (e2 == 1) {
                        b.a aVar2 = this.b;
                        if (aVar2 != null) {
                            aVar2.a(this.a);
                            return;
                        }
                        return;
                    }
                    throw new Exception("Response Error Code:".concat(String.valueOf(e2)));
                }
            } catch (Throwable th) {
                b bVar = this.a;
                bVar.a("", th.getMessage() + "," + h.a(th.getStackTrace()), c.this.h, c.this.i);
                b.a aVar3 = this.b;
                if (aVar3 != null) {
                    aVar3.a(th);
                }
            }
        }
    }

    private c() {
    }

    private void b() {
        synchronized (this) {
            if (this.j == null) {
                Socket socket = new Socket();
                this.j = socket;
                socket.setSoTimeout(60000);
            }
            com.anythink.core.c.a b = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
            if (b != null) {
                this.h = m.a().C() ? b.F() : b.n();
                this.i = m.a().C() ? b.G() : b.o();
                this.j.connect(new InetSocketAddress(this.h, this.i), 30000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int e() {
        byte b;
        if (this.j.getInputStream().read(this.b, 0, 1) != -1) {
            byte[] bArr = this.b;
            b = bArr[0];
            bArr[0] = 0;
        } else {
            throw new SocketException("Socket.InputStream read length = -1!");
        }
        return b;
    }

    private void c() {
        synchronized (this) {
            try {
                Socket socket = this.j;
                if (socket != null) {
                    socket.close();
                    this.j = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    private boolean d() {
        Socket socket = this.j;
        return (socket == null || !socket.isConnected() || this.j.isClosed()) ? false : true;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (g == null) {
                g = new c();
            }
            cVar = g;
        }
        return cVar;
    }

    private void a(b bVar, b.a aVar) {
        com.anythink.core.common.j.b.a.a().a((com.anythink.core.common.j.b.b) new AnonymousClass1(bVar, aVar), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(b bVar) {
        Socket socket = this.j;
        if (!((socket == null || !socket.isConnected() || this.j.isClosed()) ? false : true)) {
            synchronized (this) {
                if (this.j == null) {
                    Socket socket2 = new Socket();
                    this.j = socket2;
                    socket2.setSoTimeout(60000);
                }
                com.anythink.core.c.a b = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
                if (b != null) {
                    this.h = m.a().C() ? b.F() : b.n();
                    this.i = m.a().C() ? b.G() : b.o();
                    this.j.connect(new InetSocketAddress(this.h, this.i), 30000);
                }
            }
        }
        byte[] d = bVar.d();
        if (d != null) {
            int length = d.length;
            if (d.length == 0) {
                return;
            }
            int i = length + 7;
            byte[] bArr = this.a;
            if (bArr == null || bArr.length < i) {
                this.a = new byte[i];
            }
            byte[] bArr2 = this.a;
            bArr2[0] = 0;
            bArr2[1] = 3;
            bArr2[2] = (byte) bVar.b();
            byte[] bArr3 = this.a;
            bArr3[3] = (byte) ((length >>> 24) & 255);
            bArr3[4] = (byte) ((length >>> 16) & 255);
            bArr3[5] = (byte) ((length >>> 8) & 255);
            bArr3[6] = (byte) ((length >>> 0) & 255);
            System.arraycopy(d, 0, bArr3, 7, d.length);
            OutputStream outputStream = this.j.getOutputStream();
            outputStream.write(this.a, 0, i);
            outputStream.flush();
        }
    }

    public static /* synthetic */ void b(c cVar) {
        synchronized (cVar) {
            try {
                Socket socket = cVar.j;
                if (socket != null) {
                    socket.close();
                    cVar.j = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}