package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes3.dex */
public class ks2 {
    private static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long b = TimeUnit.MINUTES.toMillis(30);
    private final xr2 c;
    @k1("this")
    private long d;
    @k1("this")
    private int e;

    public ks2(xr2 xr2Var) {
        this.c = xr2Var;
    }

    private synchronized long a(int i) {
        if (!c(i)) {
            return a;
        }
        return (long) Math.min(Math.pow(2.0d, this.e) + this.c.e(), b);
    }

    private static boolean c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void e() {
        this.e = 0;
    }

    public synchronized boolean b() {
        boolean z;
        if (this.e != 0) {
            z = this.c.a() > this.d;
        }
        return z;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.e++;
        this.d = this.c.a() + a(i);
    }

    public ks2() {
        this.c = xr2.c();
    }
}