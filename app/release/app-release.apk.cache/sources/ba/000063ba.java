package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.wy3;
import com.p7700g.p99005.xy3;

/* compiled from: OpenVpnApi2.java */
/* loaded from: classes3.dex */
public class wh3 implements xh3 {
    @x1
    private static final kj1 a = kj1.b("OpenVpnApi");
    @x1
    private final Context b;
    @x1
    private final td1 c;
    @x1
    private xy3 d;
    @z1
    private yy3 e;
    @x1
    private final Object f = new Object();
    @z1
    private Thread g = null;

    public wh3(@x1 Context context, @x1 td1 td1Var, @x1 xy3 xy3Var) {
        this.b = context;
        this.c = td1Var;
        this.d = xy3Var;
    }

    @Override // com.p7700g.p99005.xh3
    @z1
    public String a(@x1 String str, @x1 String str2) {
        String[] split = str2.split(",");
        if (split.length > 2) {
            return split[2];
        }
        return null;
    }

    @Override // com.p7700g.p99005.xh3
    public boolean b(@x1 th3 th3Var, @x1 ln1 ln1Var, @x1 mn1 mn1Var, @x1 wy3.a aVar) {
        xy3.a b = this.d.b(this.b, th3Var);
        if (b == null) {
            return false;
        }
        stop();
        zh3 zh3Var = new zh3(this.b, this.c, ln1Var, mn1Var);
        yy3 yy3Var = new yy3(this.b, th3Var.e(), th3Var.d(), zh3Var, aVar);
        if (yy3Var.i(this.b)) {
            new Thread(yy3Var, "OpenVPNManagementThread").start();
            this.e = yy3Var;
            a.i("started Socket Thread", new Object[0]);
            wy3 wy3Var = new wy3(zh3Var, b, aVar);
            synchronized (this.f) {
                Thread thread = new Thread(wy3Var, "OpenVPNProcessThread");
                this.g = thread;
                thread.start();
            }
            this.e.b();
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.xh3
    public void stop() {
        yy3 yy3Var = this.e;
        if (yy3Var != null && yy3Var.d()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.f) {
            Thread thread = this.g;
            if (thread != null) {
                thread.interrupt();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }
}