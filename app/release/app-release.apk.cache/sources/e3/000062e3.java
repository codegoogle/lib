package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionProbeService.java */
/* loaded from: classes.dex */
public class w21 implements c21 {
    public static final kj1 a = kj1.b("ConnectionTestService");
    private v21 b;
    @x1
    private final x21 c;
    @x1
    private final v31 d;
    @z1
    private e51 e;

    public w21(@x1 v21 v21Var, @x1 h31 h31Var, @x1 x21 x21Var, @x1 v31 v31Var) {
        this.b = v21Var;
        this.c = x21Var;
        this.d = v31Var;
        h31Var.f(this);
    }

    @Override // com.p7700g.p99005.c21
    public void a(@x1 Object obj) {
        if (obj instanceof w51) {
            w51 w51Var = (w51) obj;
            if (w51Var.c() == en1.CONNECTED) {
                a.c("Got connected state", new Object[0]);
                synchronized (this) {
                    dq0<y41> p = this.c.p();
                    try {
                        p.Z(10L, TimeUnit.SECONDS);
                        y41 F = p.F();
                        if (this.e == null && F != null) {
                            e51 a2 = this.b.a(F);
                            this.e = a2;
                            a2.k();
                        }
                    } catch (InterruptedException e) {
                        a.f(e);
                        return;
                    }
                }
                return;
            }
            en1 c = w51Var.c();
            en1 en1Var = en1.IDLE;
            if (c == en1Var || w51Var.c() == en1.PAUSED) {
                a.c("Got idle/paused state. cancel test", new Object[0]);
                if (w51Var.c() == en1Var) {
                    this.d.f();
                }
                synchronized (this) {
                    e51 e51Var = this.e;
                    if (e51Var != null) {
                        e51Var.l(w51Var.c());
                        this.e = null;
                    }
                }
            }
        }
    }
}