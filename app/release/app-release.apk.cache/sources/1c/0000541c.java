package com.p7700g.p99005;

/* compiled from: StateHolder.java */
/* loaded from: classes2.dex */
public class ob1 {
    @x1
    private volatile bn1 a = new bn1(0, 0);
    private volatile long b = 0;
    @x1
    private volatile en1 c = en1.IDLE;
    @x1
    private ti1 d = ti1.s;

    private void i() {
        this.a = new bn1(0L, 0L);
    }

    @x1
    public ti1 a() {
        return this.d;
    }

    public long b() {
        return this.b;
    }

    @x1
    public synchronized en1 c() {
        return this.c;
    }

    @x1
    public bn1 d() {
        return this.a;
    }

    public synchronized boolean e() {
        return this.c == en1.CONNECTED;
    }

    public synchronized boolean f() {
        boolean z;
        if (this.c != en1.CONNECTING_VPN && this.c != en1.CONNECTING_PERMISSIONS) {
            z = this.c == en1.CONNECTING_CREDENTIALS;
        }
        return z;
    }

    public void g() {
        this.b = System.currentTimeMillis();
    }

    public void h() {
        this.b = 0L;
    }

    public synchronized void j(@x1 en1 en1Var) {
        this.c = en1Var;
    }

    public void k() {
        this.d = ti1.c();
        i();
    }

    public void l(@x1 ti1 ti1Var) {
        this.d = ti1Var;
    }

    public void m(long j, long j2) {
        this.a = new bn1(j, j2);
    }
}