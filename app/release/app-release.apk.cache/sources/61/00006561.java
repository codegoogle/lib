package com.p7700g.p99005;

import android.os.SystemClock;
import java.io.IOException;
import java.net.Socket;

/* compiled from: Server2Client.java */
/* loaded from: classes2.dex */
public class xd1 {
    private static final String a = "100.64.250.1";
    private static final int b = 5555;
    private final kj1 c;
    @x1
    private final String d;
    private final int e;
    @z1
    private yd1 f;
    @z1
    private b g;

    /* compiled from: Server2Client.java */
    /* loaded from: classes2.dex */
    public class b extends Thread {
        @z1
        private ud1 s;
        @z1
        private vd1 t;
        @z1
        private Socket u;
        private boolean v;

        private b() {
            this.v = false;
        }

        private void b() {
            String d;
            vd1 vd1Var = this.t;
            if (vd1Var == null || (d = vd1Var.d()) == null) {
                return;
            }
            xd1.this.e(d);
        }

        private void d() {
            if (this.s == null) {
                ud1 e = ud1.e((Socket) r81.f(this.u));
                this.s = e;
                if (e != null) {
                    e.start();
                }
            }
        }

        private void e() {
            if (this.t == null) {
                this.t = vd1.a((Socket) r81.f(this.u));
            }
        }

        private void f() {
            try {
                this.u = new Socket(xd1.this.d, xd1.this.e);
            } catch (Throwable th) {
                xd1.this.c.e("failed", th);
            }
        }

        public void c() {
            ud1 ud1Var = this.s;
            if (ud1Var != null) {
                ud1Var.quit();
                this.s = null;
            }
            vd1 vd1Var = this.t;
            if (vd1Var != null) {
                vd1Var.e();
                this.t = null;
            }
            try {
                Socket socket = this.u;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                xd1.this.c.e("close failed", e);
            }
        }

        public void g() {
            this.v = false;
            interrupt();
            c();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.v = true;
            while (!isInterrupted() && this.v) {
                f();
                if (this.u != null) {
                    d();
                    e();
                    b();
                }
                if (!this.v) {
                    break;
                }
                SystemClock.sleep(5000L);
            }
            c();
        }
    }

    public xd1() {
        this(a, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(@x1 String str) {
        this.c.c(str, new Object[0]);
        yd1 yd1Var = this.f;
        if (yd1Var != null) {
            yd1Var.f(str);
        }
    }

    public void f(@z1 yd1 yd1Var) {
        this.f = yd1Var;
    }

    public void g() {
        kj1 kj1Var = this.c;
        StringBuilder G = wo1.G("a = ");
        G.append(this.d);
        G.append(", b = ");
        G.append(this.e);
        kj1Var.l(G.toString(), new Object[0]);
        if (this.g == null) {
            kj1 kj1Var2 = this.c;
            StringBuilder G2 = wo1.G("init with ");
            G2.append(this.d);
            G2.append(":");
            G2.append(this.e);
            kj1Var2.c(G2.toString(), new Object[0]);
            b bVar = new b();
            this.g = bVar;
            bVar.start();
        }
    }

    public void h() {
        b bVar = this.g;
        if (bVar != null && bVar.v) {
            this.c.l("notifyStopped", new Object[0]);
            this.g.g();
            this.g = null;
            return;
        }
        this.c.l("not running", new Object[0]);
    }

    public xd1(@x1 String str, int i) {
        this.c = kj1.b("Server2Client");
        this.d = str;
        this.e = i;
    }
}